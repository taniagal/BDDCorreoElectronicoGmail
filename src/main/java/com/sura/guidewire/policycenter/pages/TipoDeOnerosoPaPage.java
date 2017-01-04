package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class TipoDeOnerosoPaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestCardTab-btnInnerEl']")
    private WebElementFacade linkInteresAdicional;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton']")
    private WebElementFacade botonAgregar;
    @FindBy(xpath = ".//span[contains(.,'Otros contactos')]")
    private WebElementFacade menuIntemOtrosContactos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddOtherContact:0:acctContact']")
    private WebElementFacade menuItemContacto1;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV-body']/*/table/tbody/tr/td[5]")
    private WebElementFacade comboBoxTipoBeneficiario;
    @FindBy(xpath = ".//input[@inputvalue='true']")
    private WebElementFacade radioBotonSeNecesitaCertificadoSi;

    public TipoDeOnerosoPaPage(WebDriver driver) {
        super(driver);
    }

    public void agregarInteresAdicional() {
        linkInteresAdicional.waitUntilPresent().click();
        botonAgregar.waitUntilPresent().click();
        clickElement(menuIntemOtrosContactos);
        clickElement(menuItemContacto1);
    }
    public void verificarMarca(){
        MatcherAssert.assertThat("Error no se encuentra marcado el campo Requiere certificado en Si","0px -15px".equals(radioBotonSeNecesitaCertificadoSi.getCssValue("background-position")));
    }
}
