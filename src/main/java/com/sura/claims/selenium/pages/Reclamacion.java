package com.sura.claims.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by edwabuac on 19/04/2016.
 */
public class Reclamacion extends Guidewire{

    public Reclamacion(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:policyNumber-inputEl']")
    WebElementFacade txtNpoliza;

    @FindBy(xpath=".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade mnuReclamacion;

    @FindBy(xpath=".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade txtNombre;

    @FindBy(xpath=".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade txtApellido;

    @FindBy(xpath=".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade txtNombreOrganizacion;

    @FindBy(xpath=".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade cboTipoPoliza;

    @FindBy(xpath=".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:date-inputEl']")
    WebElementFacade txtFechaSiniestro;

    @FindBy(xpath=".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_true-inputEl']")
    WebElementFacade rdobuttonBuscarPoliza;

    @FindBy(xpath=".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_false-inputEl']")
    WebElementFacade rdobuttonCrearPoliza;

    public void llenarReclamacion(String Npoliza) {
        txtNpoliza.sendKeys(Npoliza);
        rdobuttonBuscarPoliza.click();
    }

}
