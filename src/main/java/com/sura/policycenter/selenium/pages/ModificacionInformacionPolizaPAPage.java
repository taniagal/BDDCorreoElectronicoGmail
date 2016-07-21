package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ModificacionInformacionPolizaPAPage extends Guidewire{

    Actions act = new Actions(getDriver());

    @FindBy(xpath=".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElementFacade menuPoliza;
    @FindBy(xpath=".//*[@id='TabBar:PolicyTab:PolicyTab_PolicyRetrievalItem-inputEl']")
    private WebElementFacade campoBuscarPoliza;
    @FindBy(xpath=".//*[@id='PolicyFile:PolicyFileMenuActions-btnInnerEl']")
    private WebElementFacade menuAcciones;
    @FindBy(xpath=".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-itemEl']")
    private WebElementFacade itemCambiarPoliza;
    @FindBy(xpath=".//*[@id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange']")
    private WebElementFacade botonSiguienteInfoPoliza;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-labelEl']")
    private WebElementFacade labelTipoDocumento;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade labelNumeroDocumento;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-labelEl']")
    private WebElementFacade labelNombre;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade labelTelefono;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:ChangePolicyAddressButton-labelEl']")
    private WebElementFacade labelDireccionPoliza;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressType-labelEl']")
    private WebElementFacade labelTipoDireccion;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressDescription-labelEl']")
    private WebElementFacade labelDescripcionDireccion;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-labelEl']")
    private WebElementFacade labelOrganizacion;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-labelEl']")
    private WebElementFacade labelCanal;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PAPolicyType-labelEl']")
    private WebElementFacade labelTipoPoliza;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-labelEl']")
    private WebElementFacade labelTipoPlazo;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-labelEl']")
    private WebElementFacade labelFechaInicioVigencia;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-labelEl']")
    private WebElementFacade labelFechaFinVigencia;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-labelEl']")
    private WebElementFacade labelFechaExpedicion;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:QuestionFundedPolicy-labelEl']")
    private WebElementFacade labelPolizaFinanciada;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:Producer-labelEl']")
    private WebElementFacade labelOficinaRadicacion;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducerCode-labelEl']")
    private WebElementFacade labelCodigoAgente;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:modifier-labelEl']")
    private WebElementFacade labelDescuentoPoliza;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl']")
    private WebElementFacade campoNombre;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade campoTelefono;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    private WebElementFacade campoDireccion;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressType-inputEl']")
    private WebElementFacade campoTipoDireccion;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressDescription-inputEl']")
    private WebElementFacade campoDescripcionDireccion;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-inputEl']")
    private WebElementFacade campoTipoPlazo;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']")
    private WebElementFacade campoFechaInicioVigencia;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']")
    private WebElementFacade campoFechaFinVigencia;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-inputEl']")
    private WebElementFacade campoFechaExpedicion;

    public ModificacionInformacionPolizaPAPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarPoliza(String numeroPoliza) {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(menuPoliza).click();
        waitUntil(2000);
        menuPoliza.click();
        waitUntil(1000);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitUntil(2000);
        campoBuscarPoliza.typeAndEnter(numeroPoliza);
        waitUntil(2000);
    }

    public void irAModificarInformacionPoliza() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(menuAcciones).shouldBePresent();
        menuAcciones.click();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(itemCambiarPoliza).shouldBeVisible();
        itemCambiarPoliza.click();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonSiguienteInfoPoliza).shouldBeVisible();
        botonSiguienteInfoPoliza.click();
    }

    public void validarInformacionPoliza(Map<String, String> labelsInformacionPoliza, ExamplesTable informacionPoliza) {
        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(campoTipoDocumento).shouldBePresent();
        Map<String, String> datosPoliza;
        MatcherAssert.assertThat(labelTipoDocumento.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("tipoDocumento"))));
        MatcherAssert.assertThat(labelNumeroDocumento.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("numeroDocumento"))));
        MatcherAssert.assertThat(labelNombre.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("nombre"))));
        MatcherAssert.assertThat(labelTelefono.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("telefono"))));
        MatcherAssert.assertThat(labelDireccionPoliza.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("direccion"))));
        MatcherAssert.assertThat(labelTipoDireccion.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("tipoDireccion"))));
        MatcherAssert.assertThat(labelDescripcionDireccion.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("descripcionDireccion"))));
        MatcherAssert.assertThat(labelOrganizacion.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("organizacion"))));
        MatcherAssert.assertThat(labelCanal.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("canal"))));
        MatcherAssert.assertThat(labelTipoPoliza.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("tipoPoliza"))));
        MatcherAssert.assertThat(labelTipoPlazo.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("tipoPlazo"))));
        MatcherAssert.assertThat(labelFechaInicioVigencia.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("fechaInicioVigencia"))));
        MatcherAssert.assertThat(labelFechaFinVigencia.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("fechaFinVigencia"))));
        MatcherAssert.assertThat(labelFechaExpedicion.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("fechaExpedicion"))));
        MatcherAssert.assertThat(labelPolizaFinanciada.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("polizaFinanciada"))));
        MatcherAssert.assertThat(labelOficinaRadicacion.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("oficinaRadicacion"))));
        MatcherAssert.assertThat(labelCodigoAgente.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("codigoAgente"))));
        MatcherAssert.assertThat(labelDescuentoPoliza.getText(), Is.is(Matchers.equalTo(labelsInformacionPoliza.get("descuentoPoliza"))));

        if (campoNumeroDocumento.getText().equals(informacionPoliza.getRows().get(0).get("numeroDocumento"))) {
            datosPoliza = informacionPoliza.getRows().get(0);
        }
        else{
            datosPoliza = informacionPoliza.getRows().get(1);
        }
        MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(datosPoliza.get("tipoDocumento"))));
        MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(datosPoliza.get("numeroDocumento"))));
        MatcherAssert.assertThat(campoNombre.getText(), Is.is(Matchers.equalTo(datosPoliza.get("nombre"))));
        MatcherAssert.assertThat(campoTelefono.getText(), Is.is(Matchers.equalTo(datosPoliza.get("telefono"))));
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(datosPoliza.get("direccion"))));
        MatcherAssert.assertThat(campoTipoDireccion.getText(), Is.is(Matchers.equalTo(datosPoliza.get("tipoDireccion"))));
        MatcherAssert.assertThat(campoDescripcionDireccion.getText(), Is.is(Matchers.equalTo(datosPoliza.get("descripcionDireccion"))));
        MatcherAssert.assertThat(campoTipoPlazo.getText(), Is.is(Matchers.equalTo(datosPoliza.get("tipoPlazo"))));
        MatcherAssert.assertThat(campoFechaInicioVigencia.getText(), Is.is(Matchers.equalTo(datosPoliza.get("fechaInicioVigencia"))));
        MatcherAssert.assertThat(campoFechaFinVigencia.getText(), Is.is(Matchers.equalTo(datosPoliza.get("fechaFinVigencia"))));
        MatcherAssert.assertThat(campoFechaExpedicion.getText(), Is.is(Matchers.equalTo(datosPoliza.get("fechaExpedicion"))));
    }
}