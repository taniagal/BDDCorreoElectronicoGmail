package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.Set;

public class AjustesDeReglasRenovacionMrcPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-inputEl']")
    private WebElementFacade comboInstruccion;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:NonRenewReason-inputEl']")
    private WebElementFacade comboRazonDeNoRenovacion;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:SecurityLevel-inputEl']")
    private WebElementFacade comboNivelSeguridad;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Text-inputEl']")
    private WebElementFacade textFieldTextoInstruccion;
    @FindBy(xpath = ".//*[@id='centerPanel']")
    private WebElementFacade labelMensaje;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Update']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = "//a[contains(.,'Siguiente >')]")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = "//a[contains(.,'Editar transacción de póliza')]")
    private WebElementFacade botonEditarTransaccion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:RenewalQuote']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions']")
    private WebElementFacade comboOpcionesCompromiso;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton']")
    private WebElementFacade comboAgregarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton:AddFromSearch']")
    private WebElementFacade itemAgregarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:1:UWIssueRowSet:SpecialApprove']")
    private WebElementFacade botonAprobacionEspecial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:AcceptedReinsurance:Comission-inputEl']")
    private WebElementFacade campoComisionReaseguroAceptado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:AcceptedReinsurance:Comission-inputEl']")
    private WebElementFacade campoCambioComisionReaseguroAceptado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:AcceptedReinsurance:DepositRate-inputEl']")
    private WebElementFacade campoPorcentajeDepositoRetenido;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:AcceptedReinsurance:DepositRate-inputEl']")
    private WebElementFacade campoCambioPorcentajeDepositoRetenido;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:AcceptedReinsurance:TaxRate-inputEl']")
    private WebElementFacade campoPorcentajeImpuestosAplicables;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:AcceptedReinsurance:TaxRate-inputEl']")
    private WebElementFacade campoCambioPorcentajeImpuestosAplicables;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:AcceptedReinsurance:TransferCost-inputEl']")
    private WebElementFacade campoCostoTransferencia;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:AcceptedReinsurance:TransferCost-inputEl']")
    private WebElementFacade campoCambioCostoTransferencia;

    public AjustesDeReglasRenovacionMrcPage(WebDriver driver) {
        super(driver);
    }


    public void obtenerMensajeUW(ExamplesTable mensajes) {

        Map<String, String> mensajesAEvaluar = mensajes.getRow(0);
        Set<String> llaves = mensajesAEvaluar.keySet();

        waitForTextToAppear("Asuntos que bloquean la expedición");
        String contenidoLabelMensaje = labelMensaje.getText();
        for (String llave : llaves) {
            String mensajeAux = mensajesAEvaluar.get(llave);
            MatcherAssert.assertThat("No se mostro el mensaje UW", contenidoLabelMensaje.contains(mensajeAux));
        }
    }

    public void diligencieInstruccionesPrevias(ExamplesTable datos) {

        Map<String, String> mapaDatos = datos.getRow(0);

        waitFor(comboInstruccion);
        seleccionarItem(comboInstruccion, mapaDatos.get("instruccion"));
        seleccionarItem(comboRazonDeNoRenovacion, mapaDatos.get("razonNoRenovacion"));
        seleccionarItem(comboNivelSeguridad, mapaDatos.get("nivelSeguridad"));
        textFieldTextoInstruccion.sendKeys(mapaDatos.get("Texto"));
        botonActualizar.click();
    }

    public void continuarConRenovacion() {
        waitFor(botonSiguiente);
        botonSiguiente.click();
        waitFor(botonEditarTransaccion);
        botonEditarTransaccion.click();
    }

    public void ingresarAsegurado(String opcionAgregar) {
        waitFor(comboAgregarAsegurado);
        comboAgregarAsegurado.click();
        waitFor(itemAgregarAsegurado);
        itemAgregarAsegurado.click();
    }

    public void aprobacionEspecial() {
        waitFor(botonAprobacionEspecial);
        botonAprobacionEspecial.click();
    }

    public void diligenciarCamposReaseguroAceptado(ExamplesTable valores) {
        Map<String, String> valoresCampos = valores.getRow(0);
        waitFor(campoComisionReaseguroAceptado);
        campoComisionReaseguroAceptado.sendKeys(valoresCampos.get("comision"));
        campoPorcentajeDepositoRetenido.sendKeys(valoresCampos.get("deposito"));
        campoPorcentajeImpuestosAplicables.sendKeys(valoresCampos.get("impuesto"));
        campoCostoTransferencia.sendKeys(valoresCampos.get("transferencia"));
    }

    public void ingresarRegistrosReaseguro(ExamplesTable registros){
        Map<String, String> registrosCampos = registros.getRow(0);
        waitFor(campoCambioComisionReaseguroAceptado);
        campoCambioComisionReaseguroAceptado.sendKeys(registrosCampos.get("comision"));
        campoCambioPorcentajeDepositoRetenido.sendKeys(registrosCampos.get("deposito"));
        campoCambioPorcentajeImpuestosAplicables.sendKeys(registrosCampos.get("impuesto"));
        campoCambioCostoTransferencia.sendKeys(registrosCampos.get("transferencia"));
    }
}