package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ValidacionDelNegocioCoberturaPage extends Guidewire{

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:addLocationsTB-btnInnerEl']")
    private WebElementFacade botonAgregarUbicacion;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:addLocationsTB:AddNewLocation-itemEl']")
    private WebElementFacade botonAgregarNuevaUbicacion;
    @FindBy(xpath=".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:_msgs']")
    WebElementFacade mensajePantalla;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBlanketScreen:ttlBar']")
    WebElementFacade lblCorbeturasGlobales;





    Actions actions = new Actions(getDriver());

    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage = new OpcionesInformacionPolizaMrcPage(getDriver());
    public ValidacionDelNegocioCoberturaPage(WebDriver driver) {
        super(driver);
    }

    public void irAUbicacion(){
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonSiguiente).waitUntilPresent().click();
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonAgregarUbicacion).waitUntilPresent().click();
        botonSiguiente.click();
    }

    public void validaMensajeEnPantalla(String mensaje) {
        opcionesInformacionPolizaMrcPage.waitInfoPoliza(mensajePantalla);
        MatcherAssert.assertThat("El mensaje en pantalla no es el esperado",mensajePantalla.getText(), Matchers.containsString(mensaje));
    }

    public void validaPasoAPantalla() {
        opcionesInformacionPolizaMrcPage.waitInfoPoliza(mensajePantalla);
        botonSiguiente.click();
        opcionesInformacionPolizaMrcPage.waitInfoPoliza(lblCorbeturasGlobales);
        MatcherAssert.assertThat("Error: este esenario debe pasar a la siguinete" +
                        "pantalla",lblCorbeturasGlobales.isVisible());
    }
}
