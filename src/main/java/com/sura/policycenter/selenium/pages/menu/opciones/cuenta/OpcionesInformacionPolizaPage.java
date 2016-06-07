package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.bytedeco.javacpp.opencv_core;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

public class OpcionesInformacionPolizaPage extends Guidewire {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesInformacionPolizaPage.class);

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PrimaryNamedInsuredLabel-labelEl']")
    private WebElementFacade labelAseguradoPrimario;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-labelEl']")
    private WebElementFacade labelTipoDocumento;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade labelNumeroDocumento;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-labelEl']")
    private WebElementFacade labelNombre;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade labelTelefono;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:ChangePolicyAddressButton-labelEl']")
    private WebElementFacade labelDireccionPoliza;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressType-labelEl']")
    private WebElementFacade labelTipoDireccion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressDescription-labelEl']")
    private WebElementFacade labelDescripcionDireccion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:0']")
    private WebElementFacade labelDetallesPoliza;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-labelEl']")
    private WebElementFacade labelOrganizacion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-labelEl']")
    private WebElementFacade labelCanal;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PAPolicyType-labelEl']")
    private WebElementFacade labelTipoPoliza;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-labelEl']")
    private WebElementFacade labelTipoPlazo;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-labelEl']")
    private WebElementFacade labelFechaVigencia;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-labelEl']")
    private WebElementFacade labelFechaExpiracion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-labelEl']")
    private WebElementFacade labelFechaEscrita;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:QuestionFundedPolicy-labelEl']")
    private WebElementFacade labelPolizaFinanciada;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:FundedPolicyQuotaNumber-labelEl']")
    private WebElementFacade labelNumeroCuotas;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:0']")
    private WebElementFacade labelAgenteRegistro;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:Producer-labelEl']")
    private WebElementFacade labelOrganizacionAgente;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducerCode-labelEl']")
    private WebElementFacade labelCodigoAgente;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:QuestionStandardCommission-labelEl']")
    private WebElementFacade labelComisionEstandar;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AgreedCommission-labelEl']")
    private WebElementFacade labelComisionPactada;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:UWCompanyInputSet:0']")
    private WebElementFacade labelCompaniaAseguradora;

    @FindBy(xpath = "//label[contains(@for,'PolicyInfoDV:QuestionFeeAgreed-inputEl')]")
    private WebElementFacade labelHonorarioPactado;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PromoterFeeAgreed-labelEl']")
    private WebElementFacade labelHonorarioPromotora;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:5']")
    private WebElementFacade labelModificadorPoliza;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyDiscount-labelEl']")
    private WebElementFacade labelDescuentoPoliza;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']")
    private WebElementFacade fechaVigenciaPoliza;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']")
    private WebElementFacade fechaExpiracionPoliza;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-inputEl']")
    private WebElementFacade fechaEscrita;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-inputEl']")
    private WebElementFacade tipoPlazoPoliza;

    @FindBy(xpath = "//tr[5]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade botonTipoPlazo;

    @FindBy(xpath = ".//li")
    private WebElementFacade itemTipoPlazo;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:ChangeSecondaryNamedInsuredButtonMenuIcon']/img")
    private WebElementFacade botonAseguradoSecundario;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:SecondaryNamedInsuredABContactAdder-textEl']")
    private WebElementFacade itemPersonaDelDirectorio;

    @FindBy(xpath = ".//td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade botonTipoDocumento;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade textoTipoDocumento;

    @FindBy(xpath = ".//li")
    private WebElementFacade itemTipoDocumento;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade textoPrimerNombre;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade textoPrimerApellido;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscarContacto;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    private WebElementFacade botonSeleccionarContacto;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton-inputEl']")
    private WebElementFacade labelNombreSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:DocumentType-labelEl']")
    private WebElementFacade labelTipoDocumentoSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade labelNumeroDocumentoSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade labelTelefonoSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:SecondaryAddress-labelEl']")
    private WebElementFacade labelDireccionSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressType-labelEl']")
    private WebElementFacade labelTipoDireccionSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressDescription-labelEl']")
    private WebElementFacade labelDescripcionDireccionSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade textoTipoDocumentoSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    private WebElementFacade textoNumeroDocumentoSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade textoTelefonoSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:SecondaryAddress-inputEl']")
    private WebElementFacade textoDireccionSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressType-inputEl']")
    private WebElementFacade textoTipoDireccionSegundoTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressDescription-inputEl']")
    private WebElementFacade textoDescripcionDireccionSegundoTomador;

    @FindBy(xpath = ".//tr[20]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade botonOficinaRadicacion;

    @FindBy(xpath = ".//input[contains(@id,'PolicyInfoDV:UWCompanyInputSet:UWCompany-inputEl')]")
    private WebElementFacade textoOficinaRadicacion;

    @FindBy(xpath = ".//li")
    private WebElementFacade itemOficinaRadicacion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:UWCompanyInputSet:0']")
    private WebElementFacade labelOficinaRadicacion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyDiscount-inputEl']")
    private WebElementFacade textoDescuentoPoliza;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:QuestionFundedPolicy_true-boxLabelEl']")
    private WebElementFacade polizaFinanciada;

    @FindBy(xpath = ".//tr[11]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade botonNumeroCuotas;

    @FindBy(xpath = ".//li[2]")
    private WebElementFacade itemNumeroCuotas;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:FundedPolicyQuotaNumber-inputEl']")
    private WebElementFacade textoNumeroCuotas;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:_msgs']/div")
    private WebElementFacade mensajeValidacion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;

    public OpcionesInformacionPolizaPage(WebDriver driver) {
        super(driver);
    }

    public void visualizarInformacionPoliza(Map<String, String> infoPoliza) {
        String validacion = null;
        try{
            MatcherAssert.assertThat(labelAseguradoPrimario.getText(), Is.is(Matchers.equalTo(infoPoliza.get("labelAseguradoPrimario"))));
            MatcherAssert.assertThat(labelTipoDocumento.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoDocumento"))));
            MatcherAssert.assertThat(labelNumeroDocumento.getText(), Is.is(Matchers.equalTo(infoPoliza.get("numeroDocumento"))));
            MatcherAssert.assertThat(labelNombre.getText(), Is.is(Matchers.equalTo(infoPoliza.get("nombre"))));
            MatcherAssert.assertThat(labelTelefono.getText(), Is.is(Matchers.equalTo(infoPoliza.get("telefono"))));
            MatcherAssert.assertThat(labelDireccionPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("direccionPoliza"))));
            MatcherAssert.assertThat(labelTipoDireccion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoDireccion"))));
            MatcherAssert.assertThat(labelDescripcionDireccion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("descripcionDireccion"))));
            MatcherAssert.assertThat(labelDetallesPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("labelDetallesPoliza"))));
            MatcherAssert.assertThat(labelOrganizacion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("organizacion"))));
            MatcherAssert.assertThat(labelCanal.getText(), Is.is(Matchers.equalTo(infoPoliza.get("canal"))));
            MatcherAssert.assertThat(labelTipoPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoPoliza"))));
            MatcherAssert.assertThat(labelTipoPlazo.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoPlazo"))));
            MatcherAssert.assertThat(labelFechaVigencia.getText(), Is.is(Matchers.equalTo(infoPoliza.get("fechaVigencia"))));
            MatcherAssert.assertThat(labelFechaExpiracion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("fechaExpiracion"))));
            MatcherAssert.assertThat(labelFechaEscrita.getText(), Is.is(Matchers.equalTo(infoPoliza.get("fechaEscrita"))));
            MatcherAssert.assertThat(labelPolizaFinanciada.getText(), Is.is(Matchers.equalTo(infoPoliza.get("polizaFinanciada"))));
            MatcherAssert.assertThat(labelNumeroCuotas.getText(), Is.is(Matchers.equalTo(infoPoliza.get("numeroCuotas"))));
            MatcherAssert.assertThat(labelAgenteRegistro.getText(), Is.is(Matchers.equalTo(infoPoliza.get("labelAgenteRegistro"))));
            MatcherAssert.assertThat(labelOrganizacionAgente.getText(), Is.is(Matchers.equalTo(infoPoliza.get("organizacionAgente"))));
            MatcherAssert.assertThat(labelCodigoAgente.getText(), Is.is(Matchers.equalTo(infoPoliza.get("codigoAgente"))));
            //assertThat(labelComisionEstandar.getText(), is(equalTo(infoPoliza.get("comisionEstandar"))));
            //assertThat(labelComisionPactada.getText(), is(equalTo(infoPoliza.get("comisionPactada"))));
            //assertThat(labelCompaniaAseguradora.getText(), is(equalTo(infoPoliza.get("companiasAseguradoras"))));
            //assertThat(labelHonorarioPactado.getText(), is(equalTo(infoPoliza.get("honorarioPactado"))));
            //assertThat(labelHonorarioPromotora.getText(), is(equalTo(infoPoliza.get("honorarioPromotora"))));
            MatcherAssert.assertThat(labelOficinaRadicacion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("oficinaRadicacion"))));
            MatcherAssert.assertThat(labelModificadorPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("modificadorPoliza"))));
            MatcherAssert.assertThat(labelDescuentoPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("descuentoPoliza"))));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public void modificarFechaVigencia(String tipoPlazo, String fechaInicioVigencia) {
        String validacion = null;
        try{
            MatcherAssert.assertThat(fechaVigenciaPoliza.getTextValue(), Is.is(Matchers.equalTo(fechaEscrita.getTextValue())));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
        waitFor(botonTipoPlazo);
        botonTipoPlazo.click();
        waitFor(tipoPlazoPoliza);
        tipoPlazoPoliza.type(tipoPlazo);
        waitFor(itemTipoPlazo);
        itemTipoPlazo.click();
        waitABit(1000);
        waitFor(fechaVigenciaPoliza);
        fechaVigenciaPoliza.type(fechaInicioVigencia);
        waitFor(fechaExpiracionPoliza);
        waitABit(1000);
        fechaExpiracionPoliza.click();
    }

    public void calcularFechaFinVigencia(String fechaInicioVigencia) {

        String tipoPlazo = tipoPlazoPoliza.getValue();
        String fechaVigencia = fechaVigenciaPoliza.getValue();
        String fechaExpiracion = fechaExpiracionPoliza.getTextValue();
        String aniovig = fechaVigencia.substring(6,10);
        String anioexp = fechaExpiracion.substring(6,10);
        String mesvig = fechaVigencia.substring(0,2);
        String mesexp = fechaExpiracion.substring(0,2);
        String diavig = fechaVigencia.substring(3,5);
        String diaexp = fechaExpiracion.substring(3,5);
        int aniovignum = Integer.parseInt(aniovig);
        int anioexpnum = Integer.parseInt(anioexp);
        int mesvignum = Integer.parseInt(mesvig);
        int mesexpnum = Integer.parseInt(mesexp);
        int diavignum = Integer.parseInt(diavig);
        int diaexpnum = Integer.parseInt(diaexp);
        int restaanio = anioexpnum - aniovignum;
        int restames = mesexpnum - mesvignum;
        int restadia = diaexpnum - diavignum;

        if(tipoPlazo.equals("Anual")){
            MatcherAssert.assertThat(restaanio, Is.is(Matchers.equalTo(1)));
            MatcherAssert.assertThat(restames, Is.is(Matchers.equalTo(0)));
            MatcherAssert.assertThat(restadia, Is.is(Matchers.equalTo(0)));
        }else if(tipoPlazo.equals("6 meses")){
            if(mesvignum>6){
                MatcherAssert.assertThat(restaanio, Is.is(Matchers.equalTo(1)));
                MatcherAssert.assertThat(restames, Is.is(Matchers.equalTo(-6)));
            }
            else {
                MatcherAssert.assertThat(restaanio, Is.is(Matchers.equalTo(0)));
                MatcherAssert.assertThat(restames, Is.is(Matchers.equalTo(6)));
            }
            MatcherAssert.assertThat(restadia, Is.is(Matchers.equalTo(0)));
        }else if(tipoPlazo.equals("Otra")){
            MatcherAssert.assertThat(fechaExpiracionPoliza.getTagName(), Is.is(Matchers.equalTo("input")));
        }

    }

    public void adicionarSegundoTomador(String tipoDocumento, String primerNombre, String primerApellido) {
        waitFor(botonAseguradoSecundario);
        botonAseguradoSecundario.click();
        waitFor(itemPersonaDelDirectorio);
        itemPersonaDelDirectorio.click();
        waitABit(1000);
        waitFor(botonTipoDocumento);
        botonTipoDocumento.click();
        waitFor(textoTipoDocumento);
        textoTipoDocumento.type(tipoDocumento);
        waitFor(itemTipoDocumento);
        itemTipoDocumento.click();
        waitFor(textoPrimerNombre);
        textoPrimerNombre.type(primerNombre);
        waitFor(textoPrimerApellido);
        textoPrimerApellido.type(primerApellido);
        waitFor(botonBuscarContacto);
        botonBuscarContacto.click();
        waitFor(botonSeleccionarContacto);
        botonSeleccionarContacto.click();
    }

    public void validarRegistroSegundoTomador(Map<String, String> datosSegundoTomador) {
        String validacion = null;
        try {
            MatcherAssert.assertThat(labelTipoDocumentoSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("tipoDocumento"))));
            MatcherAssert.assertThat(labelNumeroDocumentoSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("numeroDocumento"))));
            MatcherAssert.assertThat(labelTelefonoSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("telefono"))));
            MatcherAssert.assertThat(labelDireccionSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("direccion"))));
            MatcherAssert.assertThat(labelTipoDireccionSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("tipoDireccion"))));
            MatcherAssert.assertThat(labelDescripcionDireccionSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("descripcionDireccion"))));
            MatcherAssert.assertThat(textoTipoDocumentoSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(textoNumeroDocumentoSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(textoTelefonoSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(textoDireccionSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(textoTipoDireccionSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(textoDescripcionDireccionSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public void seleccionarOficinaRadicacion(String oficinaRadicacion) {
        waitFor(botonOficinaRadicacion);
        botonOficinaRadicacion.click();
        waitFor(textoOficinaRadicacion);
        textoOficinaRadicacion.type(oficinaRadicacion);
        waitFor(itemOficinaRadicacion);
        itemOficinaRadicacion.click();
        waitFor(fechaVigenciaPoliza);
        fechaVigenciaPoliza.click();
    }

    public void validarSeleccionOficinaRadicacion(String oficinaRadicacion) {
        String validacion = null;
        try{
            MatcherAssert.assertThat(textoOficinaRadicacion.getValue(), Is.is(Matchers.equalTo(oficinaRadicacion)));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public void ingresarPorcentajeDescuentoPoliza(String porcentaje) {
        waitFor(textoDescuentoPoliza);
        textoDescuentoPoliza.type(porcentaje);
        waitFor(botonSiguiente);
        botonSiguiente.click();
    }

    public void validarMensajePorcentajePoliza(String mensaje) {
        int descuentoPoliza = Integer.parseInt(textoDescuentoPoliza.getValue());
        if(descuentoPoliza > 50.00){
            MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
        }
    }

    public void validarDecimalesPorcentaje(String mensaje) {
        double descuentoPoliza = Double.parseDouble(textoDescuentoPoliza.getValue());
        int pEntera = (int)descuentoPoliza;
        double pDecimal = descuentoPoliza - pEntera;
        String parteEntera = Integer.toString(pEntera);
        String parteDecimal = Double.toString(pDecimal);

        if(parteEntera.length()>2 || parteDecimal.length()>2){
            MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
        }
    }

    public void definirPolizaFinanciada() {
        waitFor(polizaFinanciada);
        polizaFinanciada.click();
    }

    public void ingresarNumeroCuotas() {
        waitFor(labelNumeroCuotas);
        MatcherAssert.assertThat(labelNumeroCuotas.getText(), labelNumeroCuotas.isCurrentlyVisible());
        MatcherAssert.assertThat(textoNumeroCuotas.getText(), textoNumeroCuotas.isCurrentlyVisible());
        botonNumeroCuotas.click();
        itemNumeroCuotas.click();
        waitABit(500);
    }

    public void validarRetroactividadPoliza(String fechaInicioVigencia, String mensaje) {
        String validacion = null;
        SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yyyy");
        Date fechaVigencia = null;
        Date fechaActual = new Date();
        String strFechaactual = formato.format(fechaActual);

        try {
            fechaVigencia = formato.parse(fechaInicioVigencia);
            fechaActual = formato.parse(strFechaactual);
            long dif = Math.abs(fechaActual.getTime() - fechaVigencia.getTime());
            long dias = dif/(1000*60*60*24);
            if(dias>60){
                MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
            }

        }catch (Exception e) {
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }

        MatcherAssert.assertThat(validacion,Is.is(Matchers.equalTo(null)));
    }
}
