package com.sura.guidewire.policycenter.utils.navegacion.util.widget;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.RenderedPageObjectView;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;


public class TableWidgetPage extends PageObject {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static final String TOOLBAR = ".//*[contains(@id,'gtoolbar') and contains(@id,'targetEl') and  contains(@class,'x-box-target')]/*";
    private static final String ENCABEZADO_TABLA = ".//div[ (descendant::*[contains(@id, 'gridcolumn')]) and contains(@id,'headercontainer') and contains(@id,'targetEl') and contains(@class,'x-box-target') and contains(@role,'presentation')]/div";
    private static final String TABLA = ".//*[contains(@id,'gridview') and contains(@id,'table') and contains(@class,'x-gridview') and contains(@class,'table') and contains(@class,'x-grid-table')]";
    private static final String LISTA_COMBO_DESPLEGABLE = ".//ul[contains(@class,'x-list-plain')]";
    private static final int TIEMPO_4000 = 4000;
    private static final int TIEMPO_3000 = 3000;

    private List<WebElement> toolbarListWE;
    private WebElement contenedorWE = null;
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
        return !obtenerFilas().isEmpty();
    }

    public List<WebElement> obtenerEncabezado() {
        return getDriver().findElements(By.xpath(ENCABEZADO_TABLA));
    }

    public TableWidgetPage enToolbar() {
        toolbarListWE = getDriver().findElements(By.xpath(TOOLBAR));
        return this;
    }

    public void seleccionarDeComboConLabel(String nombreLabelDeComboBox) {
        WebElement combo;
        Boolean capturarElementoSiguiente = false;
        for (WebElement opcionToolbar : toolbarListWE) {
            if (opcionToolbar.getText().contains(nombreLabelDeComboBox) && capturarElementoSiguiente) {
                capturarElementoSiguiente = true;
                continue;
            }
            if (capturarElementoSiguiente) {
                combo = opcionToolbar.findElement(By.xpath("tbody/tr/td/table/tbody/tr/td/input"));
                combo.click();
                findBy(".//ul[contains(@class,'x-list-plain')]").waitUntilVisible();
                shouldBeVisible((WebElementFacade) $(".//ul[contains(@class,'x-list-plain')]"));
            }

        }


    }

    public void seleccionarDeComboConValor(String valorInputDeComboBox) {
        Boolean iterara = true;

        while (iterara) {
            try {
                Iterator opcionToolbar = toolbarListWE.iterator();

                if ("Mostrar todos los roles".equals(valorInputDeComboBox)) {
                    findBy(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:roleFilters-inputEl']").click();
                    findBy(LISTA_COMBO_DESPLEGABLE).waitUntilVisible();
                    shouldBeVisible((WebElementFacade) $(LISTA_COMBO_DESPLEGABLE));
                    iterara = false;
                } else {
                    findBy(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:personCompanyFilters-inputEl']").click();
                }
                iterara = false;
            } catch (Exception e) {
                LOGGER.error("NO SE ENCONTRÓ NINGÚN COMBO CON VALOR " + valorInputDeComboBox + "TRACE " + e);
                continue;
            }
        }
    }

    public void opcionDeCombo(String nombreDeOpcionDeCombo, String xpathDelCombo) {
        List<WebElement> opcionesDeCombo = getDriver().findElements(By.xpath(xpathDelCombo));
        PageUtil.esperarHasta(TIEMPO_3000);
        for (WebElement opcion : opcionesDeCombo) {
            try {
                if (opcion.getText().equals(nombreDeOpcionDeCombo)) {
                    opcion.click();
                    fluent().await().atMost(waitForTimeoutInMilliseconds(), TimeUnit.MILLISECONDS);
                }
            } catch (StaleElementReferenceException e) {
                LOGGER.info("StaleElementReferenceException " + e);
                PageUtil.esperarHasta(TIEMPO_4000);
                try {
                    if (opcion.getText().equals(nombreDeOpcionDeCombo)) {
                        opcion.click();
                        fluent().await().atMost(waitForTimeoutInMilliseconds(), TimeUnit.MILLISECONDS);
                    }
                } catch (StaleElementReferenceException f) {
                    LOGGER.info("StaleElementReferenceException " + f);
                    PageUtil.esperarHasta(TIEMPO_4000);
                    if (opcion.getText().equals(nombreDeOpcionDeCombo)) {
                        opcion.click();
                        fluent().await().atMost(waitForTimeoutInMilliseconds(), TimeUnit.MILLISECONDS);
                    }
                }
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
                WebElement celda;
                try {
                    celda = fila.findElement(By.xpath("td[" + indiceDeColumna + "]"));
                } catch (StaleElementReferenceException e) {
                    LOGGER.info("StaleElementReferenceException " + e);
                    PageUtil.esperarHasta(TIEMPO_3000);
                    celda = fila.findElement(By.xpath("td[" + indiceDeColumna + "]"));
                }
                filasPorColumna.add(celda);
            }
        }
        return filasPorColumna;
    }

}
