package com.sura.policycenter.selenium.pages;

import com.sura.serinitybdd.util.GwNavegacionUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IngresoDeAseguradoACotizacionPage extends PageObject{

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission']")
    WebElementFacade botonElegirAutoPersonal;

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']/div")
    WebElementFacade botonAsegurados;

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver']")
    WebElementFacade botonAgregar;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact']")
    WebElementFacade opcionContactoDeCuenta;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddFromSearch']")
    WebElementFacade opcionContactoDelDirectorio;

    @FindBy(xpath = ".//span[contains(.,'DONIA GLORIA GALLEGO')]")
    WebElementFacade contactoDeCuenta;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    WebElementFacade seleccionarContactoDelDirectorio;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV-body']")
    WebElementFacade tablaAsegurados;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddNewDriver:0:ContactType']")
    WebElementFacade opcionNuevoPersonaNatural;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddNewDriver:1:ContactType']")
    WebElementFacade opcionNuevoPersonaJuridica;

    public IngresoDeAseguradoACotizacionPage(WebDriver driver){
        super(driver);
    }

    public void irAIngresarAsegurado() {
        waitFor(botonElegirAutoPersonal);
        botonElegirAutoPersonal.click();
        waitFor(botonAsegurados);
        botonAsegurados.click();
    }

    public void agregarAsegurado() {
        botonAgregar.click();
    }

    public String validarOpcionesDeAgregar(ExamplesTable listaAgregar) {
        List<WebElementFacade> elementosAgregar;
        List<String> elementosRequeridos = null;
        String opcionesOk = "Elementos de la opción Agregar no están presentes";
        try {
            elementosRequeridos = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(listaAgregar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        elementosAgregar = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//*[@class='x-box-inner x-vertical-box-overflow-body']/div/div/a/span");
        for (int i = 1; i < elementosRequeridos.size(); i++) {
            for (WebElementFacade opciones : elementosAgregar) {
                if(elementosRequeridos.get(i).equals(opciones.getText()) && elementosAgregar.size()==(elementosRequeridos.size()-1)){
                    opcionesOk = "Elementos de la opción Agregar correctos";
                }else { opcionesOk = "Elementos de la opción Agregar no están presentes";}
            }
        }
        return opcionesOk;
    }

    public void agregarAseguradoContactoDeLaCuenta() {
        waitFor(opcionContactoDeCuenta);
        opcionContactoDeCuenta.click();
        waitFor(contactoDeCuenta);
        contactoDeCuenta.click();
    }


    public String validarAseguradoAgregado() {
        waitABit(1000);
        List<WebElement> allRows = tablaAsegurados.findElements(By.tagName("tr"));
        return allRows.get(0).getText();
    }

    public void agregarAseguradoContactoDelDirectorio() {
        opcionContactoDelDirectorio.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void seleccionarContactoDelDirectorio() {
        seleccionarContactoDelDirectorio.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void seleccionarNuevaPersonaNatural() {
        opcionNuevoPersonaNatural.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void seleccionarNuevaPersonaJuridica() {
        opcionNuevoPersonaJuridica.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }
}
