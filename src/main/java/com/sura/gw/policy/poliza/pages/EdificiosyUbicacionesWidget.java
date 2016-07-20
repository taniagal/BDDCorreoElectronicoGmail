package com.sura.gw.policy.poliza.pages;

import com.sura.gw.navegacion.util.widget.TableWidgetPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EdificiosyUbicacionesWidget extends PageObject {

    private static String XPATH_DIV_CONTENEDOR_TABLA = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV']";
    TableWidgetPage tabla;

    private void obtenerTabla() {
        this.tabla = new TableWidgetPage(SerenityWebdriverManager.inThisTestThread().getCurrentDriver());
        this.tabla.buscarTabla(XPATH_DIV_CONTENEDOR_TABLA);
    }

    public void agregarArticuloAPrimerUbicacion() {

        if (tabla == null) {
            obtenerTabla();
        }
        ((WebElement) this.tabla.obtenerColumnaDeTabla("Acciones").get(0)).findElement(By.tagName("a")).click();

        String tituloDePaginaAgregarArticulos = "Volver a Edificios y ubicaciones";
        waitForTextToAppear(tituloDePaginaAgregarArticulos);
        shouldContainText(tituloDePaginaAgregarArticulos);
    }




}
