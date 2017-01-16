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
    WebElementFacade tblRiesgoCedidoContratoBasico;

    private static final long CONSTANTE_CIEN = 100;

    public GrupoDeDireccionPages(WebDriver driver) {
        super(driver);
    }

    public void validaMontoRetenidoEnContratoEnCotaparte() {
        MatcherAssert.assertThat("Error en el valor, expected: " + calculaMontoRetenidoEnContrato() +
                " but was: " + lblValorRetenidoCp.getText(), lblLimiteContratoCp.getText().equals(calculaMontoRetenidoEnContrato()));
    }

    public void validaMontoCedidoEnContratoEnCotaparte() {
        MatcherAssert.assertThat("Error en el valor, expected: " + calculaMontoCedidoEnContrato() +
                " but was: " + tblRiesgoCedidoContratoBasico.getText(), tblRiesgoCedidoContratoBasico.getText().equals(calculaMontoCedidoEnContrato()));
    }

    public String calculaMontoRetenidoEnContrato() {
        long valorMontoRetenidoEnContrato = (Long.parseLong(lblPorcentajeRetSobreRiesgo.getText()) * Utils.convierteTextoEnNumero(lblLimiteContratoCp)) / CONSTANTE_CIEN;
        String cadenaConValor = Utils.convierteNumeroEnTexto(valorMontoRetenidoEnContrato);
        return cadenaConValor;
    }

    public String calculaMontoCedidoEnContrato() {
        long valorCedidoEnContratoBasico = ((CONSTANTE_CIEN - Long.parseLong(lblPorcentajeRetSobreRiesgo.getText())) * Utils.convierteTextoEnNumero(lblLimiteContratoCp)) / CONSTANTE_CIEN ;
        String cadenaConValor = Utils.convierteNumeroEnTexto(valorCedidoEnContratoBasico);
        return cadenaConValor;
    }


    public void validaMontoretenidoEnContratoExcedente() {

    }
}
