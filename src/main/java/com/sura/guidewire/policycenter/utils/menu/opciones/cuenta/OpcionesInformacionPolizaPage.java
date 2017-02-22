package com.sura.guidewire.policycenter.utils.menu.opciones.cuenta;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class OpcionesInformacionPolizaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']")
    private WebElementFacade tablaProductos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyQuotaNumber-labelEl']")
    private WebElementFacade labelNumeroCuotas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']")
    private WebElementFacade fechaVigenciaPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']")
    private WebElementFacade fechaExpiracionPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-inputEl']")
    private WebElementFacade fechaEscrita;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-inputEl']")
    private WebElementFacade tipoPlazoPoliza;
    @FindBy(xpath = ".//tr[5]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade botonTipoPlazo;
    @FindBy(xpath = ".//tr[12]/td/table/tbody/tr/td[2]/table/tbody/tr/td[3]/a/img")
    private WebElementFacade botonAseguradoSecundario;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:SecondaryNamedInsuredABContactAdder-textEl']")
    private WebElementFacade itemPersonaDelDirectorio;
    @FindBy(xpath = ".//td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade botonTipoDocumento;
    @FindBy(xpath = ".//*[contains(@id, 'DocumentType-inputEl')]")
    private WebElementFacade textoTipoDocumento;
    @FindBy(xpath = ".//li")
    private WebElementFacade itemTipoDocumento;
    @FindBy(xpath = ".//*[contains(@id, 'GlobalPersonNameInputSet:FirstName-inputEl')]")
    private WebElementFacade textoPrimerNombre;
    @FindBy(xpath = ".//*[contains(@id, 'GlobalPersonNameInputSet:LastName-inputEl')]")
    private WebElementFacade textoPrimerApellido;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscarContacto;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    private WebElementFacade botonSeleccionarContacto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:DocumentType-labelEl']")
    private WebElementFacade labelTipoDocumentoSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade labelNumeroDocumentoSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade labelTelefonoSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:SecondaryAddress-labelEl']")
    private WebElementFacade labelDireccionSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressType-labelEl']")
    private WebElementFacade labelTipoDireccionSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressDescription-labelEl']")
    private WebElementFacade labelDescripcionDireccionSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade textoTipoDocumentoSegundoTomador;
    @FindBy(xpath = ".//*[contains(@id, 'OfficialIDInputSet:OfficialIDDV_Input-inputEl')]")
    private WebElementFacade textoNumeroDocumentoSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade textoTelefonoSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:SecondaryAddress-inputEl']")
    private WebElementFacade textoDireccionSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressType-inputEl']")
    private WebElementFacade textoTipoDireccionSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:AddressDescription-inputEl']")
    private WebElementFacade textoDescripcionDireccionSegundoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:modifier-inputEl']")
    private WebElementFacade textoDescuentoPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:QuestionFundedPolicy_true-inputEl']")
    private WebElementFacade polizaFinanciada;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:QuestionFundedPolicy_false-inputEl']")
    private WebElementFacade polizaFinanciadaNo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyQuotaNumber-inputEl']")
    private WebElementFacade textoNumeroCuotas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']/div")
    private WebElementFacade mensajeValidacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade campoOrganizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-inputEl']")
    private WebElementFacade campoCanal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']")
    WebElementFacade campoTipoPoliza;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    private WebElementFacade comboBoxNombreAgente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']")
    private WebElementFacade grupoMensajes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']/div")
    private WebElementFacade menuInformacionPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']/div")
    private WebElementFacade mensajeFinanciacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:AdditionalNamedPersonAdder-textEl']")
    private WebElementFacade opcionNuevaPersona;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl')]")
    private WebElementFacade campoDepartamento;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl')]")
    private WebElementFacade campoCiudad;
    @FindBy(xpath = "//*[contains(@id, 'ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl')]")
    private WebElementFacade campoDireccion;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDetailScreen:ForceDupCheckUpdate-btnInnerEl')]")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//input[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyEmployee_ExtInputSet:employee_true-inputEl']")
    private WebElementFacade botonEmpleadoSuraSi;
    @FindBy(xpath = ".//input[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:HasAgreedFranchiseCommission_true-inputEl']")
    private WebElementFacade botonHonorarioPactadoSi;
    @FindBy(xpath = ".//input[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:AgreedFranchiseCommission-inputEl']")
    private WebElementFacade campoHonorarioPactado;
    private static final int CONSTANTE_50 = 50;

    public OpcionesInformacionPolizaPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarAgenteCotizacion() {
        comboBoxNombreAgente.click();
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void seleccionarProducto() {
        esperarHasta(TIEMPO_2000);
        WebElementFacade botonElegirProducto = findBy(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV:" + this.encontrarProducto().toString() + ":addSubmission']");
        botonElegirProducto.click();
    }

    public Integer encontrarProducto() {
        waitFor(tablaProductos).waitUntilPresent();
        Integer filaBoton = 0;
        List<WebElement> filas = tablaProductos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if ("Autos".equals(columna.get(1).getText())) {
                return filaBoton;
            }
            filaBoton++;
        }
        return filaBoton;
    }

    public void modificarFechaVigencia(String tipoPlazo, String fechaInicioVigencia) {
        String validacion = null;
        waitFor(fechaVigenciaPoliza).shouldBePresent();
        try {
            MatcherAssert.assertThat(fechaVigenciaPoliza.getTextValue(), Is.is(Matchers.equalTo(fechaEscrita.getTextValue())));
        } catch (Exception e) {
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
        seleccionarItem(tipoPlazoPoliza, tipoPlazo);
        esperarPorValor(tipoPlazoPoliza, tipoPlazo);
        esperarHasta(TIEMPO_1000);
        waitFor(fechaVigenciaPoliza).shouldBeVisible();
        esperarHasta(TIEMPO_1000);
        fechaVigenciaPoliza.click();
        $(fechaVigenciaPoliza).type(fechaInicioVigencia);
        waitFor(fechaExpiracionPoliza).shouldBeVisible();
        esperarHasta(TIEMPO_1000);
        fechaExpiracionPoliza.click();
    }

    public void calcularFechaFinVigencia(String fechaFinVigencia) {
        waitForTextToAppear("Tomador");
        WebElementFacade campoFechaFinVigencia = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']");
        MatcherAssert.assertThat(campoFechaFinVigencia.getText(), Matchers.is(Matchers.equalTo(fechaFinVigencia)));
    }

    public void adicionarSegundoTomador(String tipoDocumento, String primerNombre, String primerApellido) {
        waitForTextToAppear("Tomador secundario");
        esperarHasta(TIEMPO_2000);
        waitFor(botonAseguradoSecundario).shouldBeVisible();
        botonAseguradoSecundario.click();
        waitFor(itemPersonaDelDirectorio).shouldBeVisible();
        itemPersonaDelDirectorio.click();
        esperarHasta(TIEMPO_1000);
        waitFor(botonTipoDocumento).shouldBeVisible();
        botonTipoDocumento.click();
        waitFor(textoTipoDocumento).shouldBeVisible();
        textoTipoDocumento.type(tipoDocumento);
        waitFor(itemTipoDocumento).shouldBeVisible();
        itemTipoDocumento.click();
        waitFor(textoPrimerNombre).shouldBeVisible();
        textoPrimerNombre.type(primerNombre);
        waitFor(textoPrimerApellido).shouldBeVisible();
        textoPrimerApellido.type(primerApellido);
        waitFor(botonBuscarContacto).shouldBeVisible();
        botonBuscarContacto.click();
        waitFor(botonSeleccionarContacto).shouldBeVisible();
        botonSeleccionarContacto.click();
    }

    public void validarRegistroSegundoTomador(Map<String, String> datosSegundoTomador) {
        String validacion = null;
        try {
            MatcherAssert.assertThat(this.labelTipoDocumentoSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("tipoDocumento"))));
            MatcherAssert.assertThat(this.labelNumeroDocumentoSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("numeroDocumento"))));
            MatcherAssert.assertThat(this.labelTelefonoSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("telefono"))));
            MatcherAssert.assertThat(this.labelDireccionSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("direccion"))));
            MatcherAssert.assertThat(this.labelTipoDireccionSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("tipoDireccion"))));
            MatcherAssert.assertThat(this.labelDescripcionDireccionSegundoTomador.getText(), Is.is(Matchers.equalTo(datosSegundoTomador.get("descripcionDireccion"))));


            MatcherAssert.assertThat(this.textoTipoDocumentoSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(this.textoNumeroDocumentoSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(this.textoTelefonoSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(this.textoDireccionSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(this.textoTipoDireccionSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
            MatcherAssert.assertThat(this.textoDescripcionDireccionSegundoTomador, Is.is(Matchers.not(Matchers.equalTo(null))));
        } catch (Exception e) {
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public void ingresarPorcentajeDescuentoPoliza(String porcentaje) {
        waitFor(textoDescuentoPoliza);
        textoDescuentoPoliza.type(porcentaje);
        waitFor(botonSiguiente);
        clickearElemento(botonSiguiente);
    }

    public void validarMensajePorcentajePoliza(String mensaje) {
        waitForTextToAppear("Descuento póliza");
        waitFor(textoDescuentoPoliza).shouldBeVisible();
        String descuentoPoliza = textoDescuentoPoliza.getValue();
        waitFor(mensajeValidacion).shouldBeVisible();
        if (esNumerico(descuentoPoliza)) {
            if (Integer.parseInt(descuentoPoliza) > CONSTANTE_50 || Integer.parseInt(descuentoPoliza) < 0) {
                MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
            }
        } else {
            MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
        }
    }

    private static boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public void validarDecimalesPorcentaje(String mensaje) {
        waitFor(mensajeValidacion).shouldContainText(mensaje);
        MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void definirPolizaFinanciada() {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(polizaFinanciada).click();
    }

    public void ingresarNumeroCuotas() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(labelNumeroCuotas).shouldBePresent();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(textoNumeroCuotas).clear();
        textoNumeroCuotas.typeAndTab("11");
        esperarHasta(TIEMPO_1000);
    }

    public void validarRetroactividadPoliza(String mensaje) {
        esperarHasta(TIEMPO_30000);
        botonSiguiente.click();
        waitFor(mensajeValidacion).shouldBePresent();
        MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void modificarFechaInicioVigencia(String organizacionDetalle, String canalDetalle, String tipoPoliza, String tipoPlazo, String fechaInicioVigencia) {
        MatcherAssert.assertThat(campoOrganizacion.getText(), Is.is(Matchers.equalTo(organizacionDetalle)));
        MatcherAssert.assertThat(campoCanal.getText(), Is.is(Matchers.equalTo(canalDetalle)));
        MatcherAssert.assertThat(campoTipoPoliza.getText(), Is.is(Matchers.equalTo(tipoPoliza)));
        String validacion = null;
        waitFor(fechaVigenciaPoliza).shouldBePresent();
        try {
            MatcherAssert.assertThat(fechaVigenciaPoliza.getTextValue(), Is.is(Matchers.equalTo(fechaEscrita.getTextValue())));
        } catch (Exception e) {
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
        waitFor(botonTipoPlazo).shouldBeVisible();
        botonTipoPlazo.click();
        waitFor(tipoPlazoPoliza).shouldBeVisible();
        $(tipoPlazoPoliza).typeAndTab(tipoPlazo);
        esperarHasta(TIEMPO_1000);
        waitFor(fechaVigenciaPoliza).shouldBeVisible();
        fechaVigenciaPoliza.click();
        $(fechaVigenciaPoliza).type(fechaInicioVigencia);
        waitFor(fechaExpiracionPoliza).shouldBeVisible();
        esperarHasta(TIEMPO_2000);
        fechaExpiracionPoliza.click();
    }

    public void pasarASiguienteOpcion() {
        waitFor(botonSiguiente).shouldBeVisible();
        botonSiguiente.click();
        esperarHasta(TIEMPO_1000);
    }

    public void identificarTipoYNumeroIdentificacion(String tipoDocumento, String numeroDocumento) {
        esperarHasta(TIEMPO_1000);
        String validacion = null;
        WebElementFacade campoTipoDocumento = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-inputEl']");
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(campoTipoDocumento).shouldBeVisible();
        WebElementFacade campoNumeroDocumento = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']");
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(campoNumeroDocumento).shouldBeVisible();
        try {
            MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(tipoDocumento)));
            MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(numeroDocumento)));
        } catch (Exception e) {
            LOGGER.error(validacion, e);
        }
        esperarHasta(TIEMPO_1000);
    }

    public void validarMensajeBloqueoPEP(String mensaje) {
        esperarHasta(TIEMPO_1000);
        waitFor(grupoMensajes).shouldBePresent();
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
        botonSiguiente.click();
        esperarHasta(TIEMPO_2000);
    }

    public void permitirContinuarCotizacionAsegurados() {
        esperarHasta(TIEMPO_1000);
        WebElementFacade labelTituloAsegurados = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']");
        waitFor(labelTituloAsegurados).shouldBePresent();
        MatcherAssert.assertThat(labelTituloAsegurados.getText(), Is.is(Matchers.equalTo("Asegurados")));
        esperarHasta(TIEMPO_1000);
    }

    public void irAInformacionDePoliza() {
        waitFor(menuInformacionPoliza).click();
        waitForTextToAppear("Información de póliza");
    }

    public void noIndicarPolizaFinanciada() {
        polizaFinanciadaNo.waitUntilPresent();
        clickearElemento(polizaFinanciadaNo);
    }

    public void noHabilitarNumeroCuotas() {
        boolean validacion = labelNumeroCuotas.isCurrentlyEnabled();
        MatcherAssert.assertThat(validacion, Is.is(Matchers.not(Matchers.equalTo(true))));
    }

    public void seleccionarOpcionSiguiente() {
        botonSiguiente.click();
        esperarHasta(TIEMPO_1500);
    }

    public void validarMensajeFinanciacion(String mensaje) {
        MatcherAssert.assertThat(mensajeFinanciacion.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void adicionarSegundoTomadorOpcionNuevaPersona(ExamplesTable informacionContacto) {
        waitForTextToAppear("Tomador secundario");
        waitFor(botonAseguradoSecundario).shouldBeVisible();
        botonAseguradoSecundario.click();
        waitFor(opcionNuevaPersona).shouldBeVisible();
        opcionNuevaPersona.click();
        waitForTextToAppear("Segundo tomador");
        this.ingresarDatosDeContacto(informacionContacto);
    }

    public void ingresarDatosDeContacto(ExamplesTable informacionContacto) {
        Map<String, String> contacto = informacionContacto.getRows().get(0);
        super.seleccionarItem(textoTipoDocumento, contacto.get("tipoDocumento"));
        textoNumeroDocumentoSegundoTomador.type(contacto.get("numeroDocumento"));
        textoPrimerNombre.type(contacto.get("primerNombre"));
        textoPrimerApellido.type(contacto.get("primerApellido"));
        campoDireccion.type(contacto.get("direccion"));
        super.seleccionarItem(campoDepartamento, contacto.get("departamento"));
        super.esperarPorValor(campoDepartamento, contacto.get("departamento"));
        esperarHasta(TIEMPO_2000);
        super.seleccionarItem(campoCiudad, contacto.get("ciudad"));
        super.esperarPorValor(campoCiudad, contacto.get("ciudad"));
        super.clickearElemento(botonAceptar);
    }

    public void seleccionarOpcionEmpleadoSura() {
        botonEmpleadoSuraSi.waitUntilPresent().click();
    }

    public void ingresarValorHonorarioPactado(ExamplesTable valor){
        botonHonorarioPactadoSi.waitUntilVisible().click();
        campoHonorarioPactado.waitUntilVisible().click();
        campoHonorarioPactado.clear();
        Map<String, String> valorHonorarioPactado = valor.getRows().get(0);
        campoHonorarioPactado.waitUntilVisible().sendKeys(valorHonorarioPactado.get("VALOR"));
    }
}