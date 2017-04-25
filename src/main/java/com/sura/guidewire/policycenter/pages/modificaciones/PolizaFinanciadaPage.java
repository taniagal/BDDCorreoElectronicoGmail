package com.sura.guidewire.policycenter.pages.modificaciones;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class PolizaFinanciadaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyPolicyChange_true-inputEl']")
    private WebElementFacade optSiFinanciarPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:QuestionFundedPolicy_true-inputEl']")
    private WebElementFacade optSiFinanciarPolizaSubmission;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyPolicyChange_false-inputEl']")
    private WebElementFacade optNoFinanciarPoliza;
    @FindBy(xpath = ".//*[contains(@id,'PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet') and contains(@role,'combobox')]")
    private WebElementFacade conboBoxNumeroCuotas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyQuotaNumber-inputEl']")
    private WebElementFacade conboBoxNumeroCuotasSubmission;
    @FindBy(xpath = "//div[contains(.,'11')]")
    private WebElementFacade labelNumeroCuotas;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:6-body']")
    private WebElementFacade tblInformacionDePoliza;
    @FindBy(xpath = "html/body/div[7]")
    private WebElementFacade itemNumeroCuotas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']")
    private WebElementFacade menuItemAsegurados;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonAgregarAsegurado;
    @FindBy(xpath = ".//span[contains(.,'Contactos de la cuenta')]")
    private WebElementFacade lblContactosDeLaCuenta;
    @FindBy(xpath = "//span[contains(@id,'tb:AddDriver:AddExistingContact:0:UnassignedDriver-textEl')]")
    private WebElementFacade lblPrimerContacto;


    public PolizaFinanciadaPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarOpcionFinanciarPoliza() {
        optSiFinanciarPoliza.click();
    }

    public void ingresarNumeroDeCuotasAFinanciar(String numeroCuotas) {
        seleccionarItem(conboBoxNumeroCuotas, numeroCuotas);
    }

    public void seleccionarOpcionNoFinanciarPoliza() {
        optNoFinanciarPoliza.click();
    }

    public void validarNoCampoNumeroDeCuotas() {
        conboBoxNumeroCuotas.waitUntilNotVisible();
    }

    public String validarInformacionDePolizaFinanciada() {
        tblInformacionDePoliza.waitUntilPresent();
        return tblInformacionDePoliza.getText();
    }

    public Map<String, String> validarNumeroCuotasAFinanciar() {
        HashMap<String, String> numeroDeCuotas = new HashMap<>();
        conboBoxNumeroCuotas.waitUntilPresent();
        conboBoxNumeroCuotas.click();
        String cuota11 = findBy(".//li[contains(., '11')]").getText();
        String cuota12 = findBy(".//li[contains(., '12')]").getText();
        numeroDeCuotas.put("numeroCuota11", cuota11);
        numeroDeCuotas.put("numeroCuota12", cuota12);
        return numeroDeCuotas;
    }

    public void financiarPoliza(ExamplesTable datos) {
        Map<String, String> dato = datos.getRow(0);
        optSiFinanciarPolizaSubmission.click();
        seleccionDeNumeroCuotas(dato.get("numeroCuotas"));
    }

    public void seleccionDeNumeroCuotas(String numeroDeCuotas) {
        seleccionarItem(conboBoxNumeroCuotasSubmission, numeroDeCuotas);
    }

    public void agregarAseguradoQueEsTitulardeLaCuenta() {
        Actions act = new Actions(getDriver());
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(menuItemAsegurados).waitUntilPresent();
        clickearElemento(menuItemAsegurados);
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if ($(".message").isPresent()) {
            clickearElemento(menuItemAsegurados);
        }
        resetImplicitTimeout();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonAgregarAsegurado).waitUntilPresent().click();
        act.moveToElement(lblContactosDeLaCuenta.waitUntilVisible()).click().build().perform();
        act.moveToElement(lblPrimerContacto.waitUntilVisible()).click().build().perform();
    }


}
