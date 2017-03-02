package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


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
    @FindBy(xpath = ".//*[@id='EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade campoPrimerNombreEdicionInteresAdicional;
    @FindBy(xpath = ".//*[@id='EditPolicyContactRolePopup:ContactDetailScreen:Update-btnInnerEl']")
    private WebElementFacade botonAceptarEdicionInteresAdicional;
    @FindBy(xpath = ".//*[contains(@id, 'AdditionalInterestLV:0:Name')]")
    private WebElementFacade linkNombreInteresAdicional;

    public TipoDeOnerosoPaPage(WebDriver driver) {
        super(driver);
    }

    public void agregarInteresAdicional() {
        linkInteresAdicional.waitUntilPresent().click();
        botonAgregar.waitUntilPresent().click();
        clickearElemento(menuIntemOtrosContactos);
        clickearElemento(menuItemContacto1);
    }
    public void verificarMarca(){
        waitFor(ExpectedConditions.attributeContains(radioBotonSeNecesitaCertificadoSi, "background-position", "0px -15px"));
        MatcherAssert.assertThat("Error no se encuentra marcado el campo Requiere certificado en Si","0px -15px".equals(radioBotonSeNecesitaCertificadoSi.getCssValue("background-position")));
    }

    public void editarInteresAdicional(String nombre) {
        linkNombreInteresAdicional.waitUntilPresent().click();
        waitForTextToAppear("Interés adicional");
        campoPrimerNombreEdicionInteresAdicional.type(nombre);
        botonAceptarEdicionInteresAdicional.click();
    }
}
