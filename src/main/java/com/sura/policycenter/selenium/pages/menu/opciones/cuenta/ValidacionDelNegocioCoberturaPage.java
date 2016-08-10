package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ValidacionDelNegocioCoberturaPage extends Guidewire{

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:addLocationsTB-btnInnerEl']")
    private WebElementFacade botonAgregarUbicacion;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:addLocationsTB:AddNewLocation-itemEl']")
    private WebElementFacade botonAgregarNuevaUbicacion;


    Actions actions = new Actions(getDriver());

    public ValidacionDelNegocioCoberturaPage(WebDriver driver) {
        super(driver);
    }

    public void agregaNuevaUbicacion (){
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonAgregarUbicacion).waitUntilPresent().click();
        botonAgregarNuevaUbicacion.click();

    }



}
