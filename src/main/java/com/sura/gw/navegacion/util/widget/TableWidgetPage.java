package com.sura.gw.navegacion.util.widget;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class TableWidgetPage extends PageObject {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static String TOOLBAR = ".//*[contains(@id,'gtoolbar') and contains(@id,'targetEl') and  contains(@class,'x-box-target')]/*";
    private static String ENCABEZADO_TABLA = ".//div[ (descendant::*[contains(@id, 'gridcolumn')]) and contains(@id,'headercontainer') and contains(@id,'targetEl') and contains(@class,'x-box-target') and contains(@role,'presentation')]/div";
    private static String TABLA = ".//*[(parent::*[contains(@tabindex, '-1')]) and contains(@id,'gridview') and contains(@id,'table') and contains(@class,'x-gridview') and contains(@class,'table') and contains(@class,'x-grid-table')]";
    private static String LISTA_COMBO_DESPLEGABLE = ".//ul[contains(@class,'x-list-plain')]";

    private List<WebElement> encabezadoListWE;
    private List<WebElement> toolbarListWE;
    private WebElement contenedorWE = null;
    private WebElement combo;
    private WebElement tablaWE;
    private List<WebElement> filasDeTabla;

    public TableWidgetPage(WebDriver driver) {
        super(driver);
    }


    public void buscarTabla(String xpathDivContenedorDeTabla) {

        contenedorWE = getDriver().findElement(By.xpath(xpathDivContenedorDeTabla));
        if (contenedorWE != null) {
            tablaWE = contenedorWE.findElement(By.xpath(TABLA));
        }

    }

    public List<WebElement> obtenerFilas() {
        filasDeTabla = tablaWE.findElements(By.xpath("tbody/tr"));
        return filasDeTabla;
    }

    public Boolean existenFilasEnTabla() {
        return obtenerFilas().size() > 0;
    }

    public List<WebElement> obtenerEncabezado() {
        encabezadoListWE = contenedorWE.findElements(By.xpath(ENCABEZADO_TABLA));
        return encabezadoListWE;
    }

    public TableWidgetPage enToolbar() {
        toolbarListWE = getDriver().findElements(By.xpath(TOOLBAR));
        return this;
    }

    protected TableWidgetPage seleccionarDeComboConLabel(String nombreLabelDeComboBox) {
        String label = null;
        Boolean capturarElementoSiguiente = false;
        for (WebElement opcionToolbar : toolbarListWE) {
            if (opcionToolbar.getText().contains(nombreLabelDeComboBox) && capturarElementoSiguiente == false) {
                capturarElementoSiguiente = true;
                continue;
            }
            if (capturarElementoSiguiente == true) {
                label = opcionToolbar.findElement(By.xpath("/tbody/tr/td/label")).getText();
                if (label.equals(nombreLabelDeComboBox)) {
                    combo = opcionToolbar.findElement(By.xpath("/tbody/tr/td/table/tbody/tr/td/input"));
                    combo.click();
                    findBy(".//ul[contains(@class,'x-list-plain')]").waitUntilVisible();
                    shouldBeVisible(findBy(".//ul[contains(@class,'x-list-plain')]"));
                }
            }

            if (label == null) {
                LOGGER.error("COMBO DE NOMBRE:" + label + " NO EXISTENTE EN EL TOOLBAR");
            }
        }

        return this;
    }

    public void seleccionarDeComboConValor(String valorInputDeComboBox) {
        for (WebElement opcionToolbar : toolbarListWE) {
            try {
                WebElement combo = opcionToolbar.findElement(By.xpath("//input[contains(@value,'" + valorInputDeComboBox + "')]"));
                combo.click();
                findBy(LISTA_COMBO_DESPLEGABLE).waitUntilVisible();
                shouldBeVisible(findBy(LISTA_COMBO_DESPLEGABLE));
                break;
            } catch (Exception e) {
                continue;
            }
        }
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
            }
        }

    }

    public void opcionDeCombo(String nombreDeOpcionDeCombo) {
        opcionDeCombo(nombreDeOpcionDeCombo, LISTA_COMBO_DESPLEGABLE.concat("/li"));
    }

    public Integer obtenerIndiceDeColumna(String nombreColumnaDeTabla){
        int indiceDeColumna = 0;
        for (WebElement columna : obtenerEncabezado()){
            ++indiceDeColumna;
            if (columna.getText().contains(nombreColumnaDeTabla)){
                break;
            }
        }
        return indiceDeColumna;
    }

    public List<WebElement> obtenerColumnaDeTabla(String nombreColumnaDeTabla){
        Integer indiceDeColumna = obtenerIndiceDeColumna(nombreColumnaDeTabla);

        if (indiceDeColumna> 0 && indiceDeColumna < obtenerEncabezado().size()) {
            for (WebElement fila : obtenerFilas()) {
                WebElement celda = fila.findElement(By.xpath("td[" + indiceDeColumna  + "]"));
            }
        }
    }

}
