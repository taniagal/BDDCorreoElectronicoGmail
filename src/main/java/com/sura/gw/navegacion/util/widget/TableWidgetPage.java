package com.sura.gw.navegacion.util.widget;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;

import java.util.List;


public class TableWidgetPage extends PageObject {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static String TOOLBAR = ".//*[contains(@id,'gtoolbar') and contains(@id,'targetEl') and  contains(@class,'x-box-target')]/*";
    private static String ENCABEZADO_TABLA = ".//div[ (descendant::*[contains(@id, 'gridcolumn')]) and contains(@id,'headercontainer') and contains(@id,'targetEl') and contains(@class,'x-box-target') and contains(@role,'presentation')]";
    private static String TABLA = ".//*[contains(@id,'gridview') and contains(@id,'table') and contains(@class,'x-gridview-1468-table x-grid-table')]";

    private List<WebElement> encabezadoListWE;
    private List<WebElement> toolbarListWE;
    private WebElement tablaWE;
    private WebElement combo;

    public TableWidgetPage deTabla(String xpathEncabezadoTabla) {
        tablaWE = getDriver().findElement(By.xpath(xpathEncabezadoTabla));
        return this;
    }

    public TableWidgetPage enEncabezado() {
        encabezadoListWE = tablaWE.findElements(By.xpath(ENCABEZADO_TABLA));
        return this;
    }

    public TableWidgetPage enToolbar() {
        toolbarListWE = tablaWE.findElements(By.xpath(TOOLBAR));
        return this;
    }

    public TableWidgetPage seleccionarDeComboConLabel(String nombreLabelDeComboBox) {
        String label = null;
        Boolean capturarElementoSiguiente = false;
        for (WebElement opcionToolbar : toolbarListWE) {
            if (opcionToolbar.getText().contains(nombreLabelDeComboBox) && capturarElementoSiguiente == false) {
                capturarElementoSiguiente = true;
                continue;
            }
            if (capturarElementoSiguiente == true){
                label = opcionToolbar.findElement(By.xpath("/tbody/tr/td/label")).getText();
                if (label.equals(nombreLabelDeComboBox)){
                    combo = opcionToolbar.findElement(By.xpath("/tbody/tr/td/table/tbody/tr/td/input"));
                    combo.click();
                    findBy(".//ul[contains(@class,'x-list-plain')]").waitUntilVisible();
                    shouldBeVisible(findBy(".//ul[contains(@class,'x-list-plain')]"));
                }
            }

            if (label == null){
                LOGGER.error("COMBO DE NOMBRE:" + label + " NO EXISTENTE EN EL TOOLBAR");
            }
        }

        return this;
    }

    public TableWidgetPage seleccionarDeComboConValor(String valorInputDeComboBox) {
        for (WebElement opcionToolbar : toolbarListWE) {
            if ($(opcionToolbar).containsText(valorInputDeComboBox)){
                try{
                    combo = opcionToolbar.findElement(By.xpath("/tbody/tr/td/table/tbody/tr/td/input"));
                    combo.click();
                    findBy(".//ul[contains(@class,'x-list-plain')]").waitUntilVisible();
                    shouldBeVisible(findBy(".//ul[contains(@class,'x-list-plain')]"));
                } catch (Exception e){
                    continue;
                }
            }
        }

        return this;
    }

    public TableWidgetPage seleccionarDeTablaEnlace(String nombreDeEnlace) {
        tablaWE.findElement(By.linkText(nombreDeEnlace)).click();
        return this;
    }

    private void opcionDeCombo(String nombreDeOpcionDeCombo, String xpathDelCombo) {

        List<WebElement> opcionesDeCombo = getDriver().findElements(By.xpath(xpathDelCombo));
        for (WebElement opcion : opcionesDeCombo){
            if(opcion.getText().contains(nombreDeOpcionDeCombo)){
                opcion.click();
            }
        }

    }

    public TableWidgetPage opcionDeCombo(String nombreDeOpcionDeCombo) {
        opcionDeCombo(nombreDeOpcionDeCombo, ".//ul[contains(@class,'x-list-plain')]/li");
        return this;
    }

}
