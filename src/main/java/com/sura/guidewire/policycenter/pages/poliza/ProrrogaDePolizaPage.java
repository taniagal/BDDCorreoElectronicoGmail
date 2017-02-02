package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProrrogaDePolizaPage extends PageUtil{

    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:extensionPA-labelEl']")
    private WebElementFacade labelProrroga;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:extensionPA_true-inputEl']")
    private WebElementFacade campoProrroga;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']")
    private WebElementFacade campoFechaFinVigencia;

    public ProrrogaDePolizaPage(WebDriver driver) {
        super(driver);
    }

    public Boolean validarProrroga() {
        return withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(labelProrroga).isPresent();
    }

    public void habilitarProrroga() {
        clickearElemento(campoProrroga);
        clickearElemento(botonSiguiente);
    }

    public String validarFechaFinVigencia(){
        return withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(campoFechaFinVigencia).getTagName();
    }
}
