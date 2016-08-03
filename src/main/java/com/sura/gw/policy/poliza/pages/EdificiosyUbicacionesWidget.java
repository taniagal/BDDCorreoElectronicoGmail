package com.sura.gw.policy.poliza.pages;

import com.sura.gw.navegacion.util.widget.TableWidgetPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.Keys;

import java.util.List;

public class EdificiosyUbicacionesWidget extends PageObject {

    private static String XPATH_DIV_CONTENEDOR_TABLA = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV']";
    private static String LINK_AGREGAR_UBICACION = "//a[contains(.,'Agregar ubicación')]";
    private static String LINK_OPCION_UBICACION_NUEVA = "//a[contains(.,'Ubicación nueva')]";

    TableWidgetPage tabla;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;

    private void obtenerTabla() {
        this.tabla = new TableWidgetPage(SerenityWebdriverManager.inThisTestThread().getCurrentDriver());
        this.tabla.buscarTabla(XPATH_DIV_CONTENEDOR_TABLA);

    }

    public void agregarArticuloAPrimerUbicacion() {

        waitForTextToAppear("Edificios y ubicaciones");
        if (tabla == null) {
            obtenerTabla();
        }
        waitFor(botonAgregarArticulos).waitUntilPresent();
        List<WebElementFacade> elementosList = findAll(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']");
        elementosList.get(0).click();
        String tituloDePaginaAgregarArticulos = "Volver a Edificios y ubicaciones";
        waitForTextToAppear(tituloDePaginaAgregarArticulos);
        shouldContainText(tituloDePaginaAgregarArticulos);
    }

    public void agregarNuevaUbicacion(String pais, String depto, String ciudad, String direccion, String actividadEconomica){
        waitForTextToAppear("Edificios y ubicaciones");
        findBy(LINK_AGREGAR_UBICACION).waitUntilVisible().waitUntilClickable();
        findBy(LINK_AGREGAR_UBICACION).shouldBeVisible();
        findBy(LINK_AGREGAR_UBICACION).click();

        findBy(LINK_OPCION_UBICACION_NUEVA).waitUntilVisible().waitUntilClickable();
        findBy(LINK_OPCION_UBICACION_NUEVA).shouldBeVisible();
        findBy(LINK_OPCION_UBICACION_NUEVA).click();

        waitForTextToAppear("Información de ubicación");
        String XPATH_PAIS = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']";
        String XPATH_DEPTO = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']";
        String XPATH_CIUDAD = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']";
        String XPATH_DIRECCION = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']";
        String XPATH_ACTIVIDAD_ECONOMICA = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:EconomicActivity-inputEl']";


        $(XPATH_PAIS).type(pais);
        $(XPATH_PAIS).click();

        waitFor(3).seconds();
        enter(depto).into($(XPATH_DEPTO));
        waitFor(3).seconds();
        $(XPATH_DEPTO).click();

        waitFor(3).seconds();
        enter(ciudad).into($(XPATH_CIUDAD));
        waitFor(3).seconds();
        $(XPATH_CIUDAD).click();

        waitFor(3).seconds();
        enter(direccion).into($(XPATH_DIRECCION));
        waitFor(3).seconds();
        $(XPATH_DIRECCION).click();

        waitFor(3).seconds();
        enter(actividadEconomica).into($(XPATH_ACTIVIDAD_ECONOMICA));
        waitFor(10).seconds();
        $(XPATH_ACTIVIDAD_ECONOMICA).sendKeys(Keys.ENTER);
        waitFor(3).seconds();

        findBy(".//*[@id='CPLocationPopup:Update']").waitUntilVisible().waitUntilClickable().click();
        waitFor(10).seconds();
    }


    public void ingresarNuevaUbicacionConRiesgoConsultable() {
        agregarNuevaUbicacion("Colombia", "ANTIOQUIA", "MEDELLIN", "CR 65 45 45", "Acabado de productos textiles");
    }

}
