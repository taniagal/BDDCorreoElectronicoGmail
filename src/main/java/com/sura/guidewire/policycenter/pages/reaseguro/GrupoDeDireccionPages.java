package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.text.DecimalFormat;

public class GrupoDeDireccionPages extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRiskDV:DefaultGrossRetention-inputEl']")
    private WebElementFacade lblLimiteContratoCp;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRiskDV:PropRetention-inputEl']")
    private WebElementFacade lblValorRetenidoCp;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body']/div/table/tbody/tr[1]/td[7]")
    private WebElementFacade tblRiesgoCedidoContratoCotaparteBasico;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body']/div/table/tbody/tr[2]/td[7]")
    private WebElementFacade tblRiesgoCedidoContratoExcedenteBasico;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body']/div/table/tbody/tr[1]/td[2]")
    private WebElementFacade tblnumeroDeAcuerdoContrato;
    @FindBy(xpath = ".//*[@id='EditAgreementPopup:__crumb__']")
    private WebElementFacade linkVolverAReaseguro;
    @FindBy(xpath = ".//*[@id='EditAgreementPopup:AgreementScreen:AgreementCoverageInputSet:ReteinedShare-inputEl']")
    private WebElementFacade lblPorcentajeRetencionVigente;
    @FindBy(xpath = ".//*[@id='EditAgreementPopup:AgreementScreen:AgreementCoverageInputSet:CededShare-inputEl']")
    private WebElementFacade lblPorcentajeCesionVigente;

    private static final double CONSTANTE_CIEN = 100.0;
    private static final long CONSTANTE_CONTRATO_COUTAPARTE = 4000000000L;
    private static String porcentajeDeRetencionContratoCotaparte = null;

    public GrupoDeDireccionPages(WebDriver driver) {
        super(driver);
    }

    public void obtienePorcentajeDeCesionYRetencionEnContratoCotaparte(){
        tblnumeroDeAcuerdoContrato.waitUntilPresent();
        clickearElemento(tblnumeroDeAcuerdoContrato);
        porcentajeDeRetencionContratoCotaparte = lblPorcentajeRetencionVigente.getText();
        linkVolverAReaseguro.waitUntilPresent();
        clickearElemento(linkVolverAReaseguro);
    }

    public String calculaMontoRetenidoEnContrato() {
        DecimalFormat formateador = new DecimalFormat("###,###.##");
        double valorMontoRetenidoEnContrato = (Double.parseDouble(porcentajeDeRetencionContratoCotaparte.replace(",", ".")) * Utils.convierteTextoEnNumero(lblLimiteContratoCp)) / CONSTANTE_CIEN;
        return formateador.format(valorMontoRetenidoEnContrato);
    }

    public String calculaMontoCedidoEnContratoCotaparte() {
        double valorCedidoEnContratoBasico = ((CONSTANTE_CIEN - Double.parseDouble(porcentajeDeRetencionContratoCotaparte)) * Utils.convierteTextoEnNumero(lblLimiteContratoCp)) / CONSTANTE_CIEN;
        return Utils.convierteNumeroEnTexto(valorCedidoEnContratoBasico);
    }

    public String calculaMontoCedidoEnContratoExdente() {
        double valorCedidoEnContratoBasicoExcedido = CONSTANTE_CONTRATO_COUTAPARTE - Utils.convierteTextoEnNumero(lblLimiteContratoCp);
        return Utils.convierteNumeroEnTexto(valorCedidoEnContratoBasicoExcedido);
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
}
