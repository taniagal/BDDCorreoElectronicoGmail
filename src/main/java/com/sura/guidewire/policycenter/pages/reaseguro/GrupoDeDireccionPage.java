package com.sura.guidewire.policycenter.pages.reaseguro;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GrupoDeDireccionPage extends PageUtil {

    private static final double CONSTANTE_CIEN = 100.0;
    private static final long CONSTANTE_CONTRATO_COUTAPARTE = 4000000000L;
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
    BigDecimal bigDec;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[1]/td[5]")
    private WebElementFacade tblLimiteContratoCp;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[1]/td[6]")
    private WebElementFacade tblPorcentajeCesionCP;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[2]/td[4]")
    private WebElementFacade tblLimiteInferiorExceso;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRiskDV:PropRetention-inputEl')]")
    private WebElementFacade lblValorRetenidoCp;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[1]/td[7]")
    private WebElementFacade tblRiesgoCedidoContratoCotaparteBasico;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[2]/td[7]")
    private WebElementFacade tblRiesgoCedidoContratoExcedenteBasico;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body')]/div/table/tbody/tr[1]/td[8]")
    private WebElementFacade tblProporcionCuotaParte;
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
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRiskDV:RetainedPropShare-inputEl')]")
    private WebElementFacade lblRetencionSobreElRiesgo;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:ViewAsOf:ViewAsOf_Arg-inputEl')]")
    private WebElementFacade comboBoxVerApartirDe;
    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:PerRiskDV:NetRetention-inputEl')]")
    private WebElementFacade lblRetencionNeta;
    private String porcentajeDeRetencionContratoCotaparte = null;

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

    public void validarRetencionSobreElRiesgo() {
        String calculoRetencionSobreRiesgo;
        String retencionSobreRiesgo = lblRetencionSobreElRiesgo.getText();
        Double valorRetenido = Double.parseDouble(lblValorRetenidoCp.getText().substring(CONSTANTE_1, lblValorRetenidoCp.getText().length() - CONSTANTE_6).replace(".", ""));
        Double baseReasegoContrato = Double.parseDouble(lblBaseReaseguroContratoAutomatico.getText().substring(CONSTANTE_1, lblBaseReaseguroContratoAutomatico.getText().length() - CONSTANTE_6).replace(".", ""));
        BigDecimal retencionSobreElRiesgo = new BigDecimal((valorRetenido / baseReasegoContrato) * CONSTANTE_CIEN);
        if (String.valueOf(retencionSobreElRiesgo).length() > 6) {
            calculoRetencionSobreRiesgo = String.valueOf(retencionSobreElRiesgo).substring(CONSTANTE_0, CONSTANTE_7).replace(".", ",");
        } else {
            calculoRetencionSobreRiesgo = String.valueOf(retencionSobreElRiesgo).replace(".", ",");
        }
        MatcherAssert.assertThat("Error en el valor Retención sobre el riesgo, expected: " + calculoRetencionSobreRiesgo +
                BUT_WAS + retencionSobreRiesgo, retencionSobreRiesgo.contains(calculoRetencionSobreRiesgo));
    }

    public void validarProporcionCP() {
        String calculoProporcionCP;
        String proporcionCP = tblProporcionCuotaParte.getText();
        Double riesgoCedidoCP = Double.parseDouble(tblRiesgoCedidoContratoCotaparteBasico.getText().substring(CONSTANTE_1, tblRiesgoCedidoContratoCotaparteBasico.getText().length() - CONSTANTE_6).replace(".", ""));
        Double baseReaseguroContrato = Double.parseDouble(lblBaseReaseguroContratoAutomatico.getText().substring(CONSTANTE_1, lblBaseReaseguroContratoAutomatico.getText().length() - CONSTANTE_6).replace(".", ""));
        BigDecimal decProporcionCP = new BigDecimal((riesgoCedidoCP / baseReaseguroContrato) * CONSTANTE_CIEN);
        if (String.valueOf(decProporcionCP).length() > 6) {
            calculoProporcionCP = String.valueOf(decProporcionCP).substring(CONSTANTE_0, CONSTANTE_7).replace(".", ",");
        } else {
            calculoProporcionCP = String.valueOf(decProporcionCP).replace(".", ",");
        }
        MatcherAssert.assertThat("Error en el valor de la proporción cuota parte, expected: " + proporcionCP +
                BUT_WAS + calculoProporcionCP, proporcionCP.contains(calculoProporcionCP));
    }

    public void verificarValorRetenidoCP(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorRetenidoCP = lblValorRetenidoCp.getText().substring(CONSTANTE_1, lblValorRetenidoCp.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor retenido contrato cuota parte, expected: " + data.get("valorRetenidoCP") +
                BUT_WAS + valorRetenidoCP, valorRetenidoCP.equals(data.get("valorRetenidoCP")));
    }

    public void validarValorRetenido() {
        String valorRetenido = lblValorRetenidoCp.getText().substring(CONSTANTE_1, lblValorRetenidoCp.getText().length() - CONSTANTE_6).replace(".", "");
        Double limiteContratoCP = Double.parseDouble(tblLimiteContratoCp.getText().substring(CONSTANTE_1, tblLimiteContratoCp.getText().length() - CONSTANTE_6).replace(".", ""));
        Double baseReaseguroContrato = Double.parseDouble(lblBaseReaseguroContratoAutomatico.getText().substring(CONSTANTE_1, lblBaseReaseguroContratoAutomatico.getText().length() - CONSTANTE_6).replace(".", ""));
        BigDecimal calculoRetenido = new BigDecimal(baseReaseguroContrato - limiteContratoCP);
        String calculoValorRetenido = String.valueOf(calculoRetenido);
        MatcherAssert.assertThat("Error en el valor retenido, expected: " + calculoValorRetenido + BUT_WAS + valorRetenido, valorRetenido.equals(calculoValorRetenido));
    }

    public void verificarValorRiesgoCedidoCP(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        String valorRiesgoCedidoCP = tblRiesgoCedidoContratoCotaparteBasico.getText().substring(CONSTANTE_1, tblRiesgoCedidoContratoCotaparteBasico.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor riesgo cedido cuota parte, expected: " + data.get("riesgoCedidoCP") +
                BUT_WAS + valorRiesgoCedidoCP, valorRiesgoCedidoCP.equals(data.get("riesgoCedidoCP")));
    }

    public void validarRiesgoCedidoCP() {
        String riesgoCedidoCP = tblRiesgoCedidoContratoCotaparteBasico.getText().substring(CONSTANTE_1, tblRiesgoCedidoContratoCotaparteBasico.getText().length() - CONSTANTE_6).replace(".", "");
        Double limiteContratoCP = Double.parseDouble(tblLimiteContratoCp.getText().substring(CONSTANTE_1, tblLimiteContratoCp.getText().length() - CONSTANTE_6).replace(".", ""));
        Integer porcentajeCesion = Integer.parseInt(tblPorcentajeCesionCP.getText());
        BigDecimal riesgoCP = new BigDecimal(limiteContratoCP * porcentajeCesion / 100);
        String calculoRiesgoCP = String.valueOf(riesgoCP);
        MatcherAssert.assertThat("Error en el valor riesgo cedido cuota parte, expected: " + calculoRiesgoCP + BUT_WAS + riesgoCedidoCP, riesgoCedidoCP.equals(calculoRiesgoCP));
    }

    public void verificarValorRiesgoCedidoEX(ExamplesTable examplesTable) {
        Map<String, String> data = examplesTable.getRow(0);
        if (data.get("riesgoCedidoEX") != null) {
            String valorRiesgoCedidoEX = tblRiesgoCedidoContratoExcedenteBasico.getText().substring(CONSTANTE_1, tblRiesgoCedidoContratoExcedenteBasico.getText().length() - CONSTANTE_6);
            MatcherAssert.assertThat("Error en el valor riesgo cedido excedente, expected: " + data.get("riesgoCedidoEX") +
                    BUT_WAS + valorRiesgoCedidoEX, valorRiesgoCedidoEX.equals(data.get("riesgoCedidoEX")));
        }
    }

    public void validarRiesgoCedidoOperativoExceso() {
        String calculoRiesgoExceso;
        String riesgoCedidoCP = tblRiesgoCedidoContratoExcedenteBasico.getText().substring(CONSTANTE_1, tblRiesgoCedidoContratoExcedenteBasico.getText().length() - CONSTANTE_6).replace(".", "");
        if (lblRetencionNeta.getText().equals(lblValorRetenidoCp.getText())) {
            calculoRiesgoExceso = String.valueOf(CONSTANTE_0);
        } else {
            Double valorRetenidoCP = Double.parseDouble(lblValorRetenidoCp.getText().substring(CONSTANTE_1, lblValorRetenidoCp.getText().length() - CONSTANTE_6).replace(".", ""));
            Double limiteInferiorExceso = Double.parseDouble(tblLimiteInferiorExceso.getText().substring(CONSTANTE_1, tblLimiteInferiorExceso.getText().length() - CONSTANTE_6).replace(".", ""));
            BigDecimal riesgoExceso = new BigDecimal(valorRetenidoCP - limiteInferiorExceso);
            calculoRiesgoExceso = String.valueOf(riesgoExceso);
        }
        MatcherAssert.assertThat("Error en el valor riesgo cedido operativo de exceso, expected: " + riesgoCedidoCP + BUT_WAS + calculoRiesgoExceso, riesgoCedidoCP.equals(calculoRiesgoExceso));
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
        if (data.get("baseReasegurableCumulo") != null) {
            String baseReasegurableCumulo = linkBaseReasegurableCumulo.getText().substring(CONSTANTE_1, linkBaseReasegurableCumulo.getText().length() - CONSTANTE_6);
            MatcherAssert.assertThat("Error en el valor Base reasegurable Cúmulo, expected: " + data.get("baseReasegurableCumulo") +
                    BUT_WAS + baseReasegurableCumulo, baseReasegurableCumulo.equals(data.get("baseReasegurableCumulo")));
        }
    }

    public void seleccionarOpcionVerApartirDe(String verApartirDe) {
        comboBoxVerApartirDe.waitUntilPresent();
        int intentos = 0;
        while (intentos < CONSTANTE_3) {
            if (!verApartirDe.equals(comboBoxVerApartirDe.getValue())) {
                comboBoxVerApartirDe.clear();
                comboBoxVerApartirDe.sendKeys(Keys.ARROW_DOWN);
                comboBoxVerApartirDe.sendKeys(Keys.ENTER);
                esperarHasta(TIEMPO_2000);
                if (!verApartirDe.equals(comboBoxVerApartirDe.getValue())) {
                    seleccionarItem(comboBoxVerApartirDe, verApartirDe);
                }
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
        esperarHasta(TIEMPO_3500);
        waitForAllTextToAppear("Facultative agreements have been successfully created.");
        btnAceptar.click();
    }

    public String ingresarFechaFinVigencia() {
        txtFechaFinVigencia.clear();
        txtFechaFinVigencia.sendKeys(Utils.sumarDiasALaFechaActual(CONSTANTE_0));
        esperarHasta(TIEMPO_2000);
        return Utils.sumarDiasALaFechaActual(CONSTANTE_0);
    }

    public void cliquearRegistroAutosPD(String gruposAutos) {

        List<WebElementFacade> grupoAutos = findAll(".//*[contains(@id,'PolicyReinsuranceCV:2-body')]/div/table/tbody/tr");
        for (WebElementFacade grupoAuto : grupoAutos) {
            if (grupoAuto.containsText(gruposAutos)) {
                esperarObjetoClikeableServidorWe(grupoAuto);
                esperarHasta(TIEMPO_3500);
                break;
            }
        }
    }
}
