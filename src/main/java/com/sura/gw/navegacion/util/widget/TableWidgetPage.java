package com.sura.gw.navegacion.util.widget;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.RenderedPageObjectView;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TableWidgetPage extends PageObject {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static String TOOLBAR = ".//*[contains(@id,'gtoolbar') and contains(@id,'targetEl') and  contains(@class,'x-box-target')]/*";
    private static String ENCABEZADO_TABLA = ".//div[ (descendant::*[contains(@id, 'gridcolumn')]) and contains(@id,'headercontainer') and contains(@id,'targetEl') and contains(@class,'x-box-target') and contains(@role,'presentation')]/div";
    private static String TABLA = ".//*[contains(@id,'gridview') and contains(@id,'table') and contains(@class,'x-gridview') and contains(@class,'table') and contains(@class,'x-grid-table')]";
    private static String LISTA_COMBO_DESPLEGABLE = ".//ul[contains(@class,'x-list-plain')]";

    private List<WebElement> encabezadoListWE;
    private List<WebElement> toolbarListWE;
    private WebElement contenedorWE = null;
    private WebElement combo;
    private List<WebElementFacade> filasDeTabla;

    public TableWidgetPage(WebDriver driver) {
        super(driver);
    }


    public void buscarTabla(String xpathDivContenedorDeTabla) {

        try {
            contenedorWE = getDriver().findElement(By.xpath(xpathDivContenedorDeTabla));
            if (contenedorWE != null) {
                contenedorWE.findElement(By.xpath(TABLA));
            }
        } catch (Exception e) {
            LOGGER.error("NO SE ENCONTRÓ EL DIV CONTENEDOR DE LA TABLA TRACE" + e);
            Serenity.throwExceptionsImmediately();
        }


    }

    public List<WebElementFacade> obtenerFilas() {
        RenderedPageObjectView renderedView = new RenderedPageObjectView(getDriver(), this, getWaitForTimeout(), true);
        filasDeTabla = renderedView.findAll(TABLA.concat("/tbody/tr"));
        return filasDeTabla;
    }

    public Boolean existenFilasEnTabla() {
        if (! obtenerFilas().isEmpty())
            return false;
        return true;
    }

    public List<WebElement> obtenerEncabezado() {
        encabezadoListWE = getDriver().findElements(By.xpath(ENCABEZADO_TABLA));
        return encabezadoListWE;
    }

    public TableWidgetPage enToolbar() {
        toolbarListWE = getDriver().findElements(By.xpath(TOOLBAR));
        return this;
    }

    public void seleccionarDeComboConLabel(String nombreLabelDeComboBox) {
        Boolean capturarElementoSiguiente = false;
        for (WebElement opcionToolbar : toolbarListWE) {
            if (opcionToolbar.getText().contains(nombreLabelDeComboBox) && capturarElementoSiguiente == false) {
                capturarElementoSiguiente = true;
                continue;
            }
            if (capturarElementoSiguiente == true) {
                combo = opcionToolbar.findElement(By.xpath("tbody/tr/td/table/tbody/tr/td/input"));
                combo.click();
                findBy(".//ul[contains(@class,'x-list-plain')]").waitUntilVisible();
                shouldBeVisible(findBy(".//ul[contains(@class,'x-list-plain')]"));
            }

        }


    }

    public void seleccionarDeComboConValor(String valorInputDeComboBox) {
        Boolean iterara = true;

        while (iterara == true){
            try {
                Iterator opcionToolbar = toolbarListWE.iterator();

                combo = ((WebElementFacade) opcionToolbar).findElement(By.xpath("//input[contains(@value,'" + valorInputDeComboBox + "')]"));
                combo.click();
                findBy(LISTA_COMBO_DESPLEGABLE).waitUntilVisible();
                shouldBeVisible(findBy(LISTA_COMBO_DESPLEGABLE));
                iterara = false;
            } catch (Exception e) {
                LOGGER.error("NO SE ENCONTRÓ NINGÚN COMBO CON VALOR " + valorInputDeComboBox + "TRACE " + e);
                continue;
            }
        }
/*
        for (WebElement opcionToolbar = toolbarListWE; iterara != true; ) {

            try {
                combo = opcionToolbar.findElement(By.xpath("//input[contains(@value,'" + valorInputDeComboBox + "')]"));
                combo.click();
                findBy(LISTA_COMBO_DESPLEGABLE).waitUntilVisible();
                shouldBeVisible(findBy(LISTA_COMBO_DESPLEGABLE));
                break;
            } catch (Exception e) {
                LOGGER.error("NO SE ENCONTRÓ NINGÚN COMBO CON VALOR " + valorInputDeComboBox + "TRACE " + e);
                continue;
            }
        }*/
    }

    protected TableWidgetPage seleccionarDeTablaEnlace(String nombreDeEnlace) {
        contenedorWE.findElement(By.linkText(nombreDeEnlace)).click();
        return this;
    }

    public void opcionDeCombo(String nombreDeOpcionDeCombo, String xpathDelCombo) {

        List<WebElement> opcionesDeCombo = getDriver().findElements(By.xpath(xpathDelCombo));
        for (WebElement opcion : opcionesDeCombo) {
            if (opcion.getText().contains(nombreDeOpcionDeCombo)) {
                opcion.click();
                fluent().await().atMost(waitForTimeoutInMilliseconds(), TimeUnit.MILLISECONDS);
            }
        }

    }

    public void opcionDeCombo(String nombreDeOpcionDeCombo) {
        opcionDeCombo(nombreDeOpcionDeCombo, LISTA_COMBO_DESPLEGABLE.concat("/li"));
    }

    public Integer obtenerIndiceDeColumna(String nombreColumnaDeTabla) {
        int indiceDeColumna = 0;
        for (WebElement columna : obtenerEncabezado()) {
            ++indiceDeColumna;
            if (columna.getText().contains(nombreColumnaDeTabla)) {
                break;
            }
        }
        return indiceDeColumna;
    }

    public List<WebElement> obtenerColumnaDeTabla(String nombreColumnaDeTabla) {
        Integer indiceDeColumna = obtenerIndiceDeColumna(nombreColumnaDeTabla);
        List<WebElement> filasPorColumna = new ArrayList<>();

        if (existenFilasEnTabla() && indiceDeColumna > 0 && indiceDeColumna < obtenerEncabezado().size()) {
            for (WebElement fila : obtenerFilas()) {
                WebElement celda = fila.findElement(By.xpath("td[" + indiceDeColumna + "]"));
                filasPorColumna.add(celda);
            }

        }

        return filasPorColumna;
    }

}
