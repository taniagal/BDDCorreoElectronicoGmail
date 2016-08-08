package com.sura.policycenter.selenium.pages.colectivas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class AgregarRiesgosPolizaColectivaPages extends PageObject{

    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:RisksButton-btnInnerEl']")
    WebElementFacade botonAgregarRiesgoInfoPoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:RisksButton-btnInnerEl']")
    WebElementFacade botonAgregarRiesgo;

    public AgregarRiesgosPolizaColectivaPages(WebDriver driver){
        super(driver);
    }

    public void clicEnAgregarRiesgoInfoPoliza() {
        waitFor(botonAgregarRiesgoInfoPoliza);
        botonAgregarRiesgoInfoPoliza.click();
        waitForTextToAppear("Riesgos");
    }

    public void clicEnAgregarRiesgo() {
        waitFor(botonAgregarRiesgo);
        botonAgregarRiesgo.click();
    }
}
