package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


public class PolizasDePrimeraPerdidaPage extends PageUtil {
    @FindBy(xpath=".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;

    public PolizasDePrimeraPerdidaPage(WebDriver driver){
        super(driver);
    }

    public void irAArticulos() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonSiguiente).waitUntilPresent().click();
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(botonAgregarArticulos).waitUntilPresent().click();
    }
}
