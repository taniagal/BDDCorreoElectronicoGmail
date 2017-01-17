package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

public class GrupoDeDireccionPages extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRiskDV:DefaultGrossRetention-inputEl']")
    WebElementFacade lblLimiteContratoCp;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRiskDV:RetainedPropShare-inputEl']")
    WebElementFacade lblPorcentajeRetSobreRiesgo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRiskDV:PropRetention-inputEl']")
    WebElementFacade lblValorRetenidoCp;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body']/div/table/tbody/tr[1]/td[7]")
    WebElementFacade tblRiesgoCedidoContratoCotaparteBasico;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body']/div/table/tbody/tr[2]/td[7]")
    WebElementFacade tblRiesgoCedidoContratoExcedenteBasico;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body']/div/table/tbody/tr[1]/td[2]")
    WebElementFacade tblnumeroDeAcuerdoContrato;

    private static final double CONSTANTE_CIEN = 100.0;
    private static final long CONSTANTE_CONTRATO_COUTAPARTE = 4000000000L;
    private static double porcentajeDeCesionContratoCotaparte = 0;
    private static double porcentajeDeRetencionContratoCotaparte = 0;

    public GrupoDeDireccionPages(WebDriver driver) {
        super(driver);
    }

    public void validaMontoRetenidoEnContratoEnCotaparte() {
        MatcherAssert.assertThat("Error en el valor retenido en cuotaparte, expected: " + calculaMontoRetenidoEnContrato() + " but was: " + lblValorRetenidoCp.getText(), lblValorRetenidoCp.getText().equals(calculaMontoRetenidoEnContrato()));
    }

    public void validaMontoCedidoEnContratoEnCotaparte() {
        MatcherAssert.assertThat("Error en el valor cedido en cuontaparte, expected: " + calculaMontoCedidoEnContratoCotaparte() +
                " but was: " + tblRiesgoCedidoContratoCotaparteBasico.getText(), tblRiesgoCedidoContratoCotaparteBasico.getText().equals(calculaMontoCedidoEnContratoCotaparte()));
    }

    public void validaMontoCedidoEnContratoEnExcedido() {
        MatcherAssert.assertThat("Error en el valor en contrato excedido, expected: " + calculaMontoCedidoEnContratoCotaparte() +
                " but was: " + tblRiesgoCedidoContratoExcedenteBasico.getText(), tblRiesgoCedidoContratoExcedenteBasico.getText().equals(calculaMontoCedidoEnContratoExdente()));
    }

    public String calculaMontoRetenidoEnContrato() {
        double valorMontoRetenidoEnContrato = (Double.parseDouble(lblPorcentajeRetSobreRiesgo.getText().replace(",", ".")) * Utils.convierteTextoEnNumero(lblLimiteContratoCp)) / CONSTANTE_CIEN;
        String cadenaConValor = Utils.convierteNumeroEnTexto(valorMontoRetenidoEnContrato);
        return cadenaConValor;
    }

    public String calculaMontoCedidoEnContratoCotaparte() {
        double valorCedidoEnContratoBasico = ((CONSTANTE_CIEN - Double.parseDouble(lblPorcentajeRetSobreRiesgo.getText())) * Utils.convierteTextoEnNumero(lblLimiteContratoCp)) / CONSTANTE_CIEN;
        String textoConValor = Utils.convierteNumeroEnTexto(valorCedidoEnContratoBasico);
        return textoConValor;
    }

    public String calculaMontoCedidoEnContratoExdente() {
        double valorCedidoEnContratoBasicoExcedido = CONSTANTE_CONTRATO_COUTAPARTE - Utils.convierteTextoEnNumero(lblLimiteContratoCp);
        String textoConValor = Utils.convierteNumeroEnTexto(valorCedidoEnContratoBasicoExcedido);
        return textoConValor;
    }

    public void obtienePorcentajeDeCesionYRetencionEnContratoCotaparte(){

    }
}
