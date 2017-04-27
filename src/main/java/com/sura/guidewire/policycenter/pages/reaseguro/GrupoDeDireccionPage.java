package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class GrupoDeDireccionPage extends PageUtil {

    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[1]/td[5]")
    private WebElementFacade tblLimiteContratoCp;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRiskDV:PropRetention-inputEl')]")
    private WebElementFacade lblValorRetenidoCp;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[1]/td[7]")
    private WebElementFacade tblRiesgoCedidoContratoCotaparteBasico;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[2]/td[7]")
    private WebElementFacade tblRiesgoCedidoContratoExcedenteBasico;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[1]/td[2]")
    private WebElementFacade tblnumeroDeAcuerdoContrato;
    @FindBy(xpath = ".//*[@id='EditAgreementPopup:__crumb__']")
    private WebElementFacade linkVolverAReaseguro;
    @FindBy(xpath = ".//*[@id='EditAgreementPopup:AgreementScreen:AgreementCoverageInputSet:ReteinedShare-inputEl']")
    private WebElementFacade lblPorcentajeRetencionVigente;
    @FindBy(xpath = ".//*[@id='EditAgreementPopup:AgreementScreen:AgreementCoverageInputSet:CededShare-inputEl']")
    private WebElementFacade lblPorcentajeCesionVigente;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:TIVMinusFac-inputEl')]")
    private WebElementFacade lblBaseReaseguroContratoAutomatico;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[1]/td[8]")
    private WebElementFacade tblProporcionCuotaParte;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[2]/td[8]")
    private WebElementFacade tblProporcionExcedente;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRiskDV:RetainedPropShare-inputEl')]")
    private WebElementFacade lblProporcionRetencion;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:groupTIV-inputEl')]")
    private WebElementFacade linkBaseReasegurableCumulo;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:ViewAsOf:ViewAsOf_Arg-inputEl')]")
    private WebElementFacade comboBoxVerApartirDe;


    private static final double CONSTANTE_CIEN = 100.0;
    private static final long CONSTANTE_CONTRATO_COUTAPARTE = 4000000000L;
    private static String porcentajeDeRetencionContratoCotaparte = null;

    public GrupoDeDireccionPage(WebDriver driver) {
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
        porcentajeDeRetencionContratoCotaparte = porcentajeDeRetencionContratoCotaparte.replace(",", ".");
        double valorMontoRetenidoEnContrato = (Double.parseDouble(porcentajeDeRetencionContratoCotaparte) * Utils.convierteTextoEnNumero(tblLimiteContratoCp)) / CONSTANTE_CIEN;
        return Utils.convierteNumeroEnTexto(valorMontoRetenidoEnContrato);
    }

    public String calculaMontoCedidoEnContratoCotaparte() {
        double valorCedidoEnContratoBasico = ((CONSTANTE_CIEN - Double.parseDouble(porcentajeDeRetencionContratoCotaparte)) * Utils.convierteTextoEnNumero(tblLimiteContratoCp)) / CONSTANTE_CIEN;
        return Utils.convierteNumeroEnTexto(valorCedidoEnContratoBasico);
    }

    public String calculaMontoCedidoEnContratoExdente() {
        double valorCedidoEnContratoBasicoExcedido = CONSTANTE_CONTRATO_COUTAPARTE - Utils.convierteTextoEnNumero(tblLimiteContratoCp);
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

    public void verificarBaseReasegurableRiesgo(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String baseReasegurable = lblBaseReaseguroContratoAutomatico.getText().substring(CONSTANTE_1, lblBaseReaseguroContratoAutomatico.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor Base distribución de reaseguro contrato automático, expected: " + data.get("baseReasegurableRiesgo") +
                " but was: " + baseReasegurable, baseReasegurable.equals(data.get("baseReasegurableRiesgo")));
    }

    public void verificarValorRetenidoCP(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorRetenidoCP = lblValorRetenidoCp.getText().substring(CONSTANTE_1, lblValorRetenidoCp.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor retenido contrato cuota parte, expected: " + data.get("valorRetenidoCP") +
                " but was: " + valorRetenidoCP, valorRetenidoCP.equals(data.get("valorRetenidoCP")));
    }

    public void verificarValorRiesgoCedidoCP(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorRiesgoCedidoCP = tblRiesgoCedidoContratoCotaparteBasico.getText().substring(CONSTANTE_1, tblRiesgoCedidoContratoCotaparteBasico.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor riesgo cedido cuota parte, expected: " + data.get("riesgoCedidoCP") +
                " but was: " + valorRiesgoCedidoCP, valorRiesgoCedidoCP.equals(data.get("riesgoCedidoCP")));
    }

    public void verificarValorRiesgoCedidoEX(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorRiesgoCedidoEX = tblRiesgoCedidoContratoExcedenteBasico.getText().substring(CONSTANTE_1, tblRiesgoCedidoContratoExcedenteBasico.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor riesgo cedido excedente, expected: " + data.get("riesgoCedidoEX") +
                " but was: " + valorRiesgoCedidoEX, valorRiesgoCedidoEX.equals(data.get("riesgoCedidoEX")));
    }

    public void verificarLimiteCuotaParte(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorLimiteCuotaPate = tblLimiteContratoCp.getText().substring(CONSTANTE_1, tblLimiteContratoCp.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el limite contrato cuota parte, expected: " + data.get("limiteContratoCP") +
                " but was: " + valorLimiteCuotaPate, valorLimiteCuotaPate.equals(data.get("limiteContratoCP")));
    }

    public void verificarProporcionCP(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        MatcherAssert.assertThat("Error en la proporción cuota parte, expected: " + data.get("proporcionCP") +
                " but was: " + tblProporcionCuotaParte.getText(), tblProporcionCuotaParte.getText().equals(data.get("proporcionCP")));
    }

    public void verificarProporcionEX(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        MatcherAssert.assertThat("Error en la proporción del excedente, expected: " + data.get("proporcionEX") +
                " but was: " + tblProporcionExcedente.getText(), tblProporcionExcedente.getText().equals(data.get("proporcionEX")));
    }

    public void verificarProporcionRetencion(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        MatcherAssert.assertThat("Error en la proporción de la retención, expected: " + data.get("proporcionRetencion") +
                " but was: " + lblProporcionRetencion.getText(), lblProporcionRetencion.getText().equals(data.get("proporcionRetencion")));
    }

    public void validarLimiteCuotaParte(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        double riesgoCedidoCP = Double.parseDouble(data.get("riesgoCedidoCP").replace(".",""));
        double retenidoCP = Double.parseDouble(data.get("valorRetenidoCP").replace(".",""));
        double limiteCP = Double.parseDouble(data.get("limiteContratoCP").replace(".",""));
        double suma = riesgoCedidoCP + retenidoCP;
        MatcherAssert.assertThat("Error, el limite del contrato cuota parte no es igual al riesgo cedido más el retenido, expected: " + String.valueOf(limiteCP) +
                " but was: " + String.valueOf(suma), String.valueOf(suma).equals(String.valueOf(limiteCP)));
    }

    public void verificarBaseReasegurableCumulo(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String baseReasegurableCumulo = linkBaseReasegurableCumulo.getText().substring(CONSTANTE_1, linkBaseReasegurableCumulo.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor Base reasegurable Cúmulo, expected: " + data.get("baseReasegurableCumulo") +
                " but was: " + baseReasegurableCumulo, baseReasegurableCumulo.equals(data.get("baseReasegurableCumulo")));
    }

    public void seleccionarOpcionVerApartirDe(String verApartirDe){
        comboBoxVerApartirDe.waitUntilPresent();
        seleccionarItem(comboBoxVerApartirDe, verApartirDe);
    }
}
