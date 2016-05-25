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

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen" +
            ":LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Picker" +
            "-triggerWrap']")
    private WebElementFacade lugar;
    @FindBy(xpath = ".//*[@id='NewClaimSaved:NewClaimSavedScreen:ttlBar']")
    private WebElementFacade lblNuevaReclamacion;
    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Claim_ReportedByType-inputEl']")
    private WebElementFacade asegurado;
    @FindBy(xpath = "//div[6]/div/ul/li")
    private WebElementFacade direcciondelugar;
    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen" +
            ":LossDetailsAddressDV:Description-inputEl']")
    private WebElementFacade txtDescripcion;
    @FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-inputEl")
    private WebElementFacade nombre;
    @FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:RightPanel" +
            ":FNOLWizard_BasicInfoRightPanelSet:1:InsuredVehicleDV:InsuredVehicleInputGroup:_checkbox")
    private WebElementFacade checkVehiculoInvo;
    @FindBy(xpath = ".//*[@id='FNOLWizard:Next-btnInnerEl']")
    private WebElementFacade btnSiguiente;
    @FindBy(xpath = ".//*[@id='FNOLWizard:Finish-btnInnerEl']")
    private WebElementFacade btnFinalizar;
    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:policyNumber" +
            "-inputEl']")
    private WebElementFacade txtNpoliza;
    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Search']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_LossDate" +
            "-inputEl']")
    private WebElementFacade txtFechaSiniestro;
    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen" +
            ":LossDetailsAddressDV:Claim_LossCause-triggerWrap']")
    private WebElementFacade listaCausas;
    @FindBy(xpath = "//li[8]")
    private WebElementFacade causaRoboEstereo;
    @FindBy(xpath = ".//*[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_true-inputEl']")
    private WebElementFacade rdobuttonBuscarPoliza;

    public Reclamacion(WebDriver driver) {
        super(driver);
    }

    /**
     *
     * @param npoliza numero de reclamacion
     *
     */
    public void llenarReclamacion(String npoliza) {
        Actions act = new Actions(getDriver());
        primerFormulario(npoliza);
        segundoFormulario(act);
        tercerFormulario(act);
    }

    private void primerFormulario(String nPoliza) {
        rdobuttonBuscarPoliza.click();
        txtNpoliza.sendKeys(nPoliza);
        btnBuscar.click();
        txtFechaSiniestro.sendKeys("04/21/2016");
        txtFechaSiniestro.hasFocus();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            LOGGER.error("This is error : " + e);
        }
        btnSiguiente.click();
    }

    private void segundoFormulario(Actions act) {
        nombre.click();
        nombre.sendKeys("Allen Robertson");
        nombre.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            LOGGER.error("This is error : " + e);
        }
        asegurado.click();
        asegurado.sendKeys("Persona");
        asegurado.sendKeys(Keys.ENTER);
        checkVehiculoInvo.waitUntilEnabled();
        checkVehiculoInvo.click();
        btnSiguiente.click();
    }

    private void tercerFormulario(Actions act) {
        Actions action = act;
        listaCausas.waitUntilClickable();
        listaCausas.click();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        causaRoboEstereo.click();
        txtDescripcion.sendKeys("Prueba reclamacion Edd, automatizada con SERENITY BBD" +
                "Y SELENIUM WEBDRIVER...");
        lugar.click();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        direcciondelugar.click();
        btnFinalizar.click();
    }

    public void asercion(String msn) {
        asercion(lblNuevaReclamacion.getText(), msn);
    }

}
