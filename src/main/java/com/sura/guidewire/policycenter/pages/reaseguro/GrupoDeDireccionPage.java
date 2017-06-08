package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
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
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[3]/td[7]")
    private WebElementFacade tblRiesgoCedidoAcuerdoFacultativo;
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
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:groupTIV-inputEl')]")
    private WebElementFacade linkBaseReasegurableCumulo;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:TIV-inputEl')]")
    private WebElementFacade lblBaseReasegurableRiesgo;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:ViewAsOf:ViewAsOf_Arg-inputEl')]")
    private WebElementFacade comboBoxVerApartirDe;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV_tb:Add']")
    WebElementFacade btnAgregarAcuerdosFacultativos;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV:1:reName']")
    WebElementFacade btnAgregaInformacionSegundoReaseguro;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:program-inputEl']")
    WebElementFacade checkBoxContratosAutomaticos;
    @FindBy(xpath = "//span[contains(.,'Aceptar')]")
    WebElementFacade btnAceptar;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:ToolbarButton-btnInnerEl']")
    WebElementFacade btnCrearAcuerdosFacultativos;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarFacultativo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']")
    WebElementFacade txtFechaFinVigencia;


    private static final double CONSTANTE_CIEN = 100.0;
    private static final long CONSTANTE_CONTRATO_COUTAPARTE = 4000000000L;
    private static String porcentajeDeRetencionContratoCotaparte = null;

    public GrupoDeDireccionPage(WebDriver driver) {
        super(driver);
    }

    public void obtienePorcentajeDeCesionYRetencionEnContratoCotaparte() {
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
        MatcherAssert.assertThat("Error en el valor retenido en cuotaparte, expected: " + calculaMontoRetenidoEnContrato() + BUT_WAS + lblValorRetenidoCp.getText(), lblValorRetenidoCp.getText().equals(calculaMontoRetenidoEnContrato()));
    }

    public void validaMontoCedidoEnContratoEnCotaparte() {
        MatcherAssert.assertThat("Error en el valor cedido en cuontaparte, expected: " + calculaMontoCedidoEnContratoCotaparte() +
                BUT_WAS + tblRiesgoCedidoContratoCotaparteBasico.getText(), tblRiesgoCedidoContratoCotaparteBasico.getText().equals(calculaMontoCedidoEnContratoCotaparte()));
    }

    public void validaMontoCedidoEnContratoEnExcedido() {
        MatcherAssert.assertThat("Error en el valor en contrato excedido, expected: " + calculaMontoCedidoEnContratoCotaparte() +
                BUT_WAS + tblRiesgoCedidoContratoExcedenteBasico.getText(), tblRiesgoCedidoContratoExcedenteBasico.getText().equals(calculaMontoCedidoEnContratoExdente()));
    }

    public void verificarBaseReasegurableRiesgo(ExamplesTable examplesTable) {
        comboBoxVerApartirDe.waitUntilPresent();
        Map<String, String> data = examplesTable.getRow(0);
        String baseReasegurableRiesgo = lblBaseReasegurableRiesgo.getText().substring(CONSTANTE_1, lblBaseReasegurableRiesgo.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor Base reasegurable riesgo, expected: " + data.get("baseReasegurableRiesgo") +
                BUT_WAS + baseReasegurableRiesgo, baseReasegurableRiesgo.equals(data.get("baseReasegurableRiesgo")));
    }

    public void verificarBaseReaseguroContrato(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String baseReasegoContrato = lblBaseReaseguroContratoAutomatico.getText().substring(CONSTANTE_1, lblBaseReaseguroContratoAutomatico.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor Base distribución de reaseguro contrato automático, expected: " + data.get("baseReaseguroContrato") +
                BUT_WAS + baseReasegoContrato, baseReasegoContrato.equals(data.get("baseReaseguroContrato")));
    }

    public void verificarValorRetenidoCP(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorRetenidoCP = lblValorRetenidoCp.getText().substring(CONSTANTE_1, lblValorRetenidoCp.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor retenido contrato cuota parte, expected: " + data.get("valorRetenidoCP") +
                BUT_WAS + valorRetenidoCP, valorRetenidoCP.equals(data.get("valorRetenidoCP")));
    }

    public void verificarValorRiesgoCedidoCP(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorRiesgoCedidoCP = tblRiesgoCedidoContratoCotaparteBasico.getText().substring(CONSTANTE_1, tblRiesgoCedidoContratoCotaparteBasico.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor riesgo cedido cuota parte, expected: " + data.get("riesgoCedidoCP") +
                BUT_WAS + valorRiesgoCedidoCP, valorRiesgoCedidoCP.equals(data.get("riesgoCedidoCP")));
    }

    public void verificarValorRiesgoCedidoEX(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorRiesgoCedidoEX = tblRiesgoCedidoContratoExcedenteBasico.getText().substring(CONSTANTE_1, tblRiesgoCedidoContratoExcedenteBasico.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor riesgo cedido excedente, expected: " + data.get("riesgoCedidoEX") +
                BUT_WAS + valorRiesgoCedidoEX, valorRiesgoCedidoEX.equals(data.get("riesgoCedidoEX")));
    }

    public void verificarValorRiesgoCedidoAcuerdoFacultativo(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        if (data.get("riesgoCedidoAcuerdoFacultativo") != null) {
            String valorRiesgoCedidoAcuerdo = tblRiesgoCedidoAcuerdoFacultativo.getText().substring(CONSTANTE_1, tblRiesgoCedidoAcuerdoFacultativo.getText().length() - CONSTANTE_6);
            MatcherAssert.assertThat("Error en el valor riesgo cedido del acuerdo facultativo, expected: " + data.get("riesgoCedidoAcuerdoFacultativo") +
                    BUT_WAS + valorRiesgoCedidoAcuerdo, valorRiesgoCedidoAcuerdo.equals(data.get("riesgoCedidoAcuerdoFacultativo")));
        }
    }

    public void verificarLimiteCuotaParte(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorLimiteCuotaPate = tblLimiteContratoCp.getText().substring(CONSTANTE_1, tblLimiteContratoCp.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el limite contrato cuota parte, expected: " + data.get("limiteContratoCP") +
                BUT_WAS + valorLimiteCuotaPate, valorLimiteCuotaPate.equals(data.get("limiteContratoCP")));
    }

    public void validarLimiteCuotaParte(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        double riesgoCedidoCP = Double.parseDouble(data.get("riesgoCedidoCP").replace(".", ""));
        double retenidoCP = Double.parseDouble(data.get("valorRetenidoCP").replace(".", ""));
        double limiteCP = Double.parseDouble(data.get("limiteContratoCP").replace(".", ""));
        double suma = riesgoCedidoCP + retenidoCP;
        MatcherAssert.assertThat("Error, el limite del contrato cuota parte no es igual al riesgo cedido más el retenido, expected: " + limiteCP +
                BUT_WAS + suma, String.valueOf(suma).equals(String.valueOf(limiteCP)));
    }

    public void verificarBaseReasegurableCumulo(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String baseReasegurableCumulo = linkBaseReasegurableCumulo.getText().substring(CONSTANTE_1, linkBaseReasegurableCumulo.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor Base reasegurable Cúmulo, expected: " + data.get("baseReasegurableCumulo") +
                BUT_WAS + baseReasegurableCumulo, baseReasegurableCumulo.equals(data.get("baseReasegurableCumulo")));
    }

    public void seleccionarOpcionVerApartirDe(String verApartirDe) {
        comboBoxVerApartirDe.waitUntilPresent();
        int intentos = 0;
        while (intentos < 3) {
            if (!verApartirDe.equals(comboBoxVerApartirDe.getValue())) {
                comboBoxVerApartirDe.clear();
                comboBoxVerApartirDe.sendKeys(Keys.ARROW_DOWN);
                comboBoxVerApartirDe.sendKeys(Keys.ENTER);
                comboBoxVerApartirDe.sendKeys(Keys.TAB);
                esperarHasta(TIEMPO_2000);
                seleccionarItem(comboBoxVerApartirDe, verApartirDe);
                comboBoxVerApartirDe.sendKeys(Keys.TAB);
            } else {
             intentos = CONSTANTE_3;
            }
            intentos++;
        }
        esperarHasta(TIEMPO_2000);
    }

    public void ingresarSegundoReasegurador() {
        esperarYClickearBoton(btnAgregarAcuerdosFacultativos);
        esperarYClickearBoton(btnAgregaInformacionSegundoReaseguro);
        checkBoxContratosAutomaticos.click();
        esperarYClickearBoton(btnAceptar);
    }

    public void aceptarFacultativo() {
        esperarYClickearBoton(btnCrearAcuerdosFacultativos);
        waitForTextToAppear("Se crearán los acuerdos facultativos con la información ingresada en esta plantilla.");
        esperarYClickearBoton(btnAceptarFacultativo);
        waitForAllTextToAppear("Facultative agreements have been successfully created.");
        btnAceptar.click();
    }

    public String ingresarFechaFinVigencia() {
        txtFechaFinVigencia.clear();
        txtFechaFinVigencia.sendKeys(Utils.sumarDiasALaFechaActual(CONSTANTE_0));
        esperarHasta(TIEMPO_2000);
        return Utils.sumarDiasALaFechaActual(CONSTANTE_0);
    }
}
