package com.sura.guidewire.policycenter.pages.renovacion;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;


public class ModificacionRenovacionPolicyInfoAseguradoPage extends PageUtil{

    public ModificacionRenovacionPolicyInfoAseguradoPage(WebDriver driver){
        super(driver);
    }

    public void irAInformacionDePoliza() {
        WebElementFacade informacionPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyInfo']/div/span");
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(informacionPoliza).click();
        WebElementFacade labelInfoPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:ttlBar']");
        withTimeoutOf(WAIT_TIME_28,TimeUnit.SECONDS).waitFor(labelInfoPoliza).shouldBeVisible();
    }

    public void validarAdicionSegundoTomador(ExamplesTable tomadorSecundario) {
        Map<String, String> infoTomador = tomadorSecundario.getRows().get(0);
        WebElementFacade adicionarSegundoTomador = findBy(".//tr[11]/td/table/tbody/tr/td[2]/table/tbody/tr/td[3]/a/img");
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(adicionarSegundoTomador).click();
        WebElementFacade itemContactoExistente = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:ExistingNamedInsured-textEl']");
        withTimeoutOf(WAIT_TIME_10,TimeUnit.SECONDS).waitFor(itemContactoExistente).click();
        WebElementFacade itemTomadorSecundario = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:ExistingNamedInsured:0:UnassignedAccountContact-textEl']");
        withTimeoutOf(WAIT_TIME_10,TimeUnit.SECONDS).waitFor(itemTomadorSecundario).click();
        WebElementFacade labelTomadorSecundario = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton-inputEl']");
        WebElementFacade labelTipoDocumento = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:DocumentType-inputEl']");
        WebElementFacade labelNumeroDocumento = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']");
        withTimeoutOf(WAIT_TIME_28,TimeUnit.SECONDS).waitFor(labelTipoDocumento).shouldBeVisible();
        MatcherAssert.assertThat(labelTomadorSecundario.getText(), Matchers.is(Matchers.equalTo(infoTomador.get("tomador"))));
        MatcherAssert.assertThat(labelTipoDocumento.getText(), Matchers.is(Matchers.equalTo(infoTomador.get("tipoDocumento"))));
        MatcherAssert.assertThat(labelNumeroDocumento.getText(), Matchers.is(Matchers.equalTo(infoTomador.get("numeroDocumento"))));
    }

    public void validarNoEdicionTomadorPrincipal() {
        WebElementFacade tipoDocumento = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-inputEl']");
        WebElementFacade numeroDocumento = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']");
        WebElementFacade nombreTomador = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl']");
        String editable = "input";
        MatcherAssert.assertThat(tipoDocumento.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
        MatcherAssert.assertThat(numeroDocumento.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
        MatcherAssert.assertThat(nombreTomador.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
    }

    public void cambiarTipoDePlazo(ExamplesTable tipoPlazo) {
        Map<String, String> plazo = tipoPlazo.getRows().get(0);
        WebElementFacade campoTipoPlazo = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-inputEl']");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(campoTipoPlazo).clear();
        campoTipoPlazo.typeAndTab(plazo.get("tipoPlazo"));
    }

    public void recalcularFechaFinVigencia(ExamplesTable fechaVigencia) {
        Map<String, String> fechasVigencia = fechaVigencia.getRows().get(0);
        WebElementFacade fechaInicioVigencia = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']");
        WebElementFacade fechaFinVigencia = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']");
        waitForTextToAppear(fechasVigencia.get("fechaFinVigencia"));
        MatcherAssert.assertThat(fechaInicioVigencia.getText(), Matchers.is(Matchers.equalTo(fechasVigencia.get("fechaInicioVigencia"))));
        MatcherAssert.assertThat(fechaFinVigencia.getText(), Matchers.is(Matchers.equalTo(fechasVigencia.get("fechaFinVigencia"))));
    }

    public void validarCamposNoEditablesInfoPoliza() {
        WebElementFacade organizacion = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-bodyEl']");
        WebElementFacade canal = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-bodyEl']");
        WebElementFacade tipoPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']");
        WebElementFacade fechaInicioVigencia = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']");
        WebElementFacade fechaFinVigencia = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']");
        String editable = "input";
        MatcherAssert.assertThat(organizacion.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
        MatcherAssert.assertThat(canal.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
        MatcherAssert.assertThat(tipoPoliza.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
        MatcherAssert.assertThat(fechaInicioVigencia.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
        MatcherAssert.assertThat(fechaFinVigencia.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
    }

    public void irAAsegurados(){
        WebElementFacade itemAsegurados = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:PADrivers']/div/span");
        withTimeoutOf(WAIT_TIME_28,TimeUnit.SECONDS).waitFor(itemAsegurados).click();
        waitUntil(WAIT_TIME_1000);
        itemAsegurados.click();
        WebElementFacade labelAsegurados = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']");
        withTimeoutOf(WAIT_TIME_28,TimeUnit.SECONDS).waitFor(labelAsegurados).shouldBeVisible();
    }

    public void validarNoEdicionAsegurado() {
        WebElementFacade tipoDocumento = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:OfficialIDInputSet:DocumentType-inputEl']");
        WebElementFacade numeroDocumento = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']");
        String editable = "input";
        MatcherAssert.assertThat(tipoDocumento.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
        MatcherAssert.assertThat(numeroDocumento.getTagName(),Matchers.is(Matchers.not(Matchers.equalTo(editable))));
    }
}
