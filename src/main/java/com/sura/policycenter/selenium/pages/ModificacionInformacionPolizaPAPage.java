package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ModificacionInformacionPolizaPAPage extends Commons{

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ModificacionInformacionPolizaPAPage.class);

    Actions act = new Actions(getDriver());

    @FindBy(xpath=".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElementFacade menuPoliza;
    @FindBy(xpath=".//*[@id='TabBar:PolicyTab:PolicyTab_NewSubmission-textEl']")
    private WebElementFacade labelNuevaCotizacion;
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
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-labelEl']")
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
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton-labelEl']")
    private WebElementFacade labelTomadorSecundario;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath=".//td[@id='PolicyChangeWizard:LOBWizardStepGroup:PADrivers']/div/span")
    private WebElementFacade itemAsegurados;
    @FindBy(xpath=".//td[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div/span")
    private WebElementFacade itemVehiculos;

    //td[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div/span

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
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(labelNuevaCotizacion).shouldBePresent();
        campoBuscarPoliza.typeAndEnter(numeroPoliza);
        waitUntil(2000);
    }

    public void irAModificarInformacionPoliza() {
        waitUntil(2500);
        waitFor(menuAcciones).shouldBePresent();
        menuAcciones.click();
        waitFor(itemCambiarPoliza).shouldBeVisible();
        itemCambiarPoliza.click();
        waitFor(botonSiguienteInfoPoliza).shouldBeVisible();
        botonSiguienteInfoPoliza.click();
        waitUntil(2000);
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
        }else{
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
        MatcherAssert.assertThat(campoFechaInicioVigencia.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(campoFechaFinVigencia.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(campoFechaExpedicion.getText(), Is.is(Matchers.notNullValue()));
    }

    public void adicionarSegundoTomador(String tipoDocumento, String numeroDocumento) {
        waitUntil(5000);
        waitFor(labelTomadorSecundario).shouldBePresent();
        WebElementFacade botonTomadorSecundario = findBy(".//tr[12]/td/table/tbody/tr/td[2]/table/tbody/tr/td[3]/a/img");
        waitFor(botonTomadorSecundario).click();
        WebElementFacade itemPersonaDirectorio = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:SecondaryNamedInsuredABContactAdder-textEl']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(itemPersonaDirectorio).click();
        adicionarContacto(tipoDocumento, numeroDocumento);
    }

    public void adicionarContacto(String tipoDocumento, String numeroDocumento){
        waitUntil(1000);
        WebElementFacade campoTxtTipoDocumento = findBy(".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(campoTxtTipoDocumento).typeAndTab(tipoDocumento);
        waitUntil(1000);
        WebElementFacade campoTxtNumeroDocumento = findBy(".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(campoTxtNumeroDocumento).type(numeroDocumento);
        WebElementFacade botonBuscarContacto = findBy(".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']");
        waitUntil(1000);
        waitFor(botonBuscarContacto).click();
        WebElementFacade botonSeleccionarContacto = findBy(".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']");
        waitFor(botonSeleccionarContacto).shouldBeVisible();
        botonSeleccionarContacto.click();
    }

    public void validarRegistroSegundoTomador(Map<String, String> datosSegundoTomador) {
        WebElementFacade labelTipoDocumentoSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:DocumentType-labelEl']");
        WebElementFacade labelNumeroDocumentoSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:OfficialIDDV_Input-labelEl']");
        WebElementFacade labelTelefonoSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-labelEl']");
        WebElementFacade labelDireccionSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:SecondaryAddress-labelEl']");
        WebElementFacade labelTipoDireccionSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressType-labelEl']");
        WebElementFacade labelDescripcionDireccionSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressDescription-labelEl']");
        WebElementFacade campoTipoDocumentoSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:DocumentType-inputEl']");
        WebElementFacade campoNumeroDocumentoSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']");
        WebElementFacade campoDireccionSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:SecondaryAddress-inputEl']");
        WebElementFacade campoTipoDireccionSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressType-inputEl']");
        WebElementFacade campoDescripcionDireccionSegundoTomador = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressDescription-inputEl']");
        String validacion = null;
        try {
            MatcherAssert.assertThat(labelTipoDocumentoSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("tipoDocumento"))));
            MatcherAssert.assertThat(labelNumeroDocumentoSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("numeroDocumento"))));
            MatcherAssert.assertThat(labelTelefonoSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("telefono"))));
            MatcherAssert.assertThat(labelDireccionSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("direccion"))));
            MatcherAssert.assertThat(labelTipoDireccionSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("tipoDireccion"))));
            MatcherAssert.assertThat(labelDescripcionDireccionSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("descripcionDireccion"))));
            MatcherAssert.assertThat(campoTipoDocumentoSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(campoNumeroDocumentoSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(campoDireccionSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(campoTipoDireccionSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(campoDescripcionDireccionSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public void validarTomadorRiesgo() {
        waitFor(botonCotizar).click();
        waitUntil(1000);
    }

    public void validarBloqueoSegundoTomador(String mensaje) {
        String validacion = null;
        WebElementFacade labelResultadosValidacion = findBy(".//*[@id='wsTabBar:wsTab_0-btnInnerEl']");
        waitFor(labelResultadosValidacion).shouldBePresent();
        WebElementFacade grupoMensajes = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']");
        try {
            MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public void validarRestriccionEdicionTomador() {
        String validacion = null;
        try {
            MatcherAssert.assertThat(campoTipoDocumento.getTagName(), Is.is(Matchers.not(Matchers.equalTo("input"))));
            MatcherAssert.assertThat(campoNumeroDocumento.getTagName(), Is.is(Matchers.not(Matchers.equalTo("input"))));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
    }

    public void presionarBotonSiguiente(){
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonSiguiente).shouldBeVisible();
        botonSiguiente.click();
        waitUntil(1000);
    }

    public void validarMensajeWarningTomador(String mensaje) {
        waitUntil(1000);
        WebElementFacade grupoMensajes = findBy(".//div[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:_msgs']/div");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(grupoMensajes).shouldBePresent();
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
        botonSiguiente.click();
        waitUntil(2000);
    }

    public void validarMensajeWarningAsegurado(String mensaje) {
        waitUntil(1000);
        WebElementFacade grupoMensajes = findBy(".//div[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:_msgs']/div");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(grupoMensajes).shouldBePresent();
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
        botonSiguiente.click();
        waitUntil(2000);
    }

    public void permitirContinuarCotizacion() {
        waitUntil(1000);
        WebElementFacade labelTituloAsegurados = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(labelTituloAsegurados).shouldBePresent();
        MatcherAssert.assertThat(labelTituloAsegurados.getText(), Is.is(Matchers.equalTo("Asegurados")));
        waitUntil(1000);
    }

    public void irAOpcionAsegurados() {
        waitFor(itemAsegurados);
        itemAsegurados.click();
    }

    public void adicionarAsegurado(String tipoDocumento, String numeroDocumento) {
        waitUntil(5000);
        WebElementFacade botonAgregar= findBy(". //span[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnEl']/span");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonAgregar).click();
        WebElementFacade itemPersonaDirectorio = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddFromSearch-textEl']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(itemPersonaDirectorio).click();
        adicionarContacto(tipoDocumento, numeroDocumento);
    }

    public void irAOpcionVehiculos() {
        waitFor(itemVehiculos);
        itemVehiculos.click();
    }

    public void validarContinuacionDeCotizacion(String encabezado, String xpathEncabezado) {
        waitUntil(1000);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonSiguiente).shouldBePresent();
        botonSiguiente.click();
        WebElementFacade labelTitulo = findBy(xpathEncabezado);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(labelTitulo).shouldBePresent();
        MatcherAssert.assertThat(labelTitulo.getText(), Is.is(Matchers.equalTo(encabezado)));
        waitUntil(1000);
    }
}
