package com.sura.claims.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;


public class Reclamacion extends Guidewire {
    Guidewire gw = new Guidewire(getDriver());
    public Reclamacion(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen" +
            ":LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Picker" +
            "-triggerWrap']")
    WebElementFacade lugar;

    @FindBy(xpath = ".//*[@id='NewClaimSaved:NewClaimSavedScreen:ttlBar']")
    WebElementFacade lblNuevaReclamacion;

    @FindBy(xpath = ".//li[4]")
    WebElementFacade asegurado;

    @FindBy(xpath = "//div[6]/div/ul/li")
    WebElementFacade direcciondelugar;

    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen" +
            ":LossDetailsAddressDV:Description-inputEl']")
    WebElementFacade txtDescripcion;

    @FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow" +
            ":BasicInfoDetailViewPanelDV:ReportedBy_Name-triggerWrap")
    WebElementFacade flechitaAbajo;

    @FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:RightPanel" +
            ":FNOLWizard_BasicInfoRightPanelSet:1:InsuredVehicleDV:InsuredVehicleInputGroup:_checkbox")
    WebElementFacade checkVehiculoInvo;

    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow" +
            ":BasicInfoDetailViewPanelDV:ReportedBy_Name-labelEl']")
    WebElementFacade lblNombre;

    @FindBy(xpath = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:RightPanel" +
            ":FNOLWizard_BasicInfoRightPanelSet:0:InsuredVehicleDV:InsuredVehicleInputGroup:_checkbox")
    WebElementFacade chkVehiuloInvolucrado;

    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow" +
            ":BasicInfoDetailViewPanelDV:Claim_ReportedByType-inputEl']")
    WebElementFacade txtRelacionAsegurado;

    @FindBy(xpath = ".//*[@id='FNOLWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguiente;

    @FindBy(xpath = ".//*[@id='FNOLWizard:Finish-btnInnerEl']")
    WebElementFacade btnFinalizar;

    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:policyNumber" +
            "-inputEl']")
    WebElementFacade txtNpoliza;

    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade mnuReclamacion;

    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:ttlBar']")
    WebElementFacade lblMensaje;

    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Search']")
    WebElementFacade btnBuscar;

    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow" +
            ":BasicInfoDetailViewPanelDV:ReportedBy_Name-inputEl']")
    WebElementFacade txtNombre;

    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade txtApellido;

    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade txtNombreOrganizacion;

    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade cboTipoPoliza;

    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_LossDate" +
            "-inputEl']")
    WebElementFacade txtFechaSiniestro;

    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen" +
            ":LossDetailsAddressDV:Claim_LossCause-triggerWrap']")
    WebElementFacade listaCausas;

    @FindBy(xpath = "//li[8]")
    WebElementFacade causaRoboEstereo;

    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_true-inputEl']")
    WebElementFacade rdobuttonBuscarPoliza;

    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_false-inputEl']")
    WebElementFacade rdobuttonCrearPoliza;

    // Initialize slf4j logs
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    /**
     *
     * @param npoliza numero de poliza
     *
     */
    public void llenarReclamacion(String npoliza) {
        Actions act = new Actions(getDriver());
        primerFormulario(npoliza);
        segundoFormulario(act);
        tercerFormulario(act);
    }

    private void primerFormulario(String Npoliza) {
         /*Primer Formulario*/
        rdobuttonBuscarPoliza.click();
        txtNpoliza.sendKeys(Npoliza);
        btnBuscar.click();
        txtFechaSiniestro.sendKeys("04/21/2016");
        txtFechaSiniestro.hasFocus();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            LOGGER.error("This is error : " + e);
        }
        btnSiguiente.click();
    }

    private void segundoFormulario(Actions act) {
         /*Segundo Formulario*/
        flechitaAbajo.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        asegurado.waitUntilClickable();
        asegurado.click();
        txtRelacionAsegurado.clear();
        txtRelacionAsegurado.sendKeys("Persona");
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            LOGGER.error("This is error : " + e);
        }
        checkVehiculoInvo.waitUntilEnabled();
        checkVehiculoInvo.click();
        btnSiguiente.click();
    }

    private void tercerFormulario(Actions act) {
        listaCausas.waitUntilClickable();
        listaCausas.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        causaRoboEstereo.click();
        txtDescripcion.sendKeys("Prueba reclamacion Edd, automatizada con SERENITY BBD" +
                "Y SELENIUM WEBDRIVER...");
        lugar.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        direcciondelugar.click();
        btnFinalizar.click();
    }

    public void asercion(String msn) {
        gw.asercion(lblNuevaReclamacion.getText(), msn);
    }

}
