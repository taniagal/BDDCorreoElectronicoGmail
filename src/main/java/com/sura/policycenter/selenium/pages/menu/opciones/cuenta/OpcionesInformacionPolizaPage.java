package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.commons.selenium.Commons;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.joda.time.LocalDateTime;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class OpcionesInformacionPolizaPage extends Commons {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesInformacionPolizaPage.class);
    private static final String DD_MM_YYYY = "dd/MM/yyyy";

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    WebElementFacade campoNombreAgente;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']")
    WebElementFacade tablaProductos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-labelEl']")
    private WebElementFacade labelTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade labelNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-labelEl']")
    private WebElementFacade labelNombre;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade labelTelefono;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:ChangePolicyAddressButton-labelEl']")
    private WebElementFacade labelDireccionPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressType-labelEl']")
    private WebElementFacade labelTipoDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressDescription-labelEl']")
    private WebElementFacade labelDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:0']")
    private WebElementFacade labelDetallesPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-labelEl']")
    private WebElementFacade labelOrganizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-labelEl']")
    private WebElementFacade labelCanal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-labelEl']")
    private WebElementFacade labelTipoPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-labelEl']")
    private WebElementFacade labelTipoPlazo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-labelEl']")
    private WebElementFacade labelFechaVigencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-labelEl']")
    private WebElementFacade labelFechaExpiracion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-labelEl']")
    private WebElementFacade labelFechaEscrita;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:QuestionFundedPolicy-labelEl']")
    private WebElementFacade labelPolizaFinanciada;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyQuotaNumber-labelEl']")
    private WebElementFacade labelNumeroCuotas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:0']")
    private WebElementFacade labelAgenteRegistro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:Producer-labelEl']")
    private WebElementFacade labelOrganizacionAgente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducerCode-labelEl']")
    private WebElementFacade labelCodigoAgente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:3']")
    private WebElementFacade labelModificadorPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:modifier-labelEl']")
    private WebElementFacade labelDescuentoPoliza;
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
    @FindBy(xpath = ".//li")
    private WebElementFacade itemTipoPlazo;
    @FindBy(xpath = ".//tr[12]/td/table/tbody/tr/td[2]/table/tbody/tr/td[3]/a/img")
    private WebElementFacade botonAseguradoSecundario;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:SecondaryNamedInsuredABContactAdder-textEl']")
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
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
    @FindBy(xpath = ".//tr[11]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade botonNumeroCuotas;
    @FindBy(xpath = "//li[contains(.,'12')]")
    private WebElementFacade itemNumeroCuotas;
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducerCode-inputEl']")
    private WebElementFacade campoAgente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:Producer-inputEl']")
    private WebElementFacade campoOficina;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade tipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    private WebElementFacade numeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl']")
    private WebElementFacade nombreTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade telefonoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    private WebElementFacade direccionTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressType-inputEl']")
    private WebElementFacade tipoDirTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressDescription-inputEl']")
    private WebElementFacade descripcionDireccionTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']/div")
    private WebElementFacade menuInformacionPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']/div")
    private WebElementFacade mensajeFinanciacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:ChangePolicyAddressButton:ChangePolicyAddressButtonMenuIcon']/img")
    private WebElementFacade botonCambiarDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:ChangeSecondaryNamedInsuredButtonMenuIcon']/img")
    private WebElementFacade botonCambiarTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:addConinsuranceLink']")
    private WebElementFacade linkCoaseguro;


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
        waitUntil(2000);
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

    public void visualizarInformacionPoliza(Map<String, String> infoPoliza) {
        String validacion = null;
        try {
            MatcherAssert.assertThat(this.labelTipoDocumento.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoDocumento"))));
            MatcherAssert.assertThat(this.labelNumeroDocumento.getText(), Is.is(Matchers.equalTo(infoPoliza.get("numeroDocumento"))));
            MatcherAssert.assertThat(this.labelNombre.getText(), Is.is(Matchers.equalTo(infoPoliza.get("nombre"))));
            MatcherAssert.assertThat(this.labelTelefono.getText(), Is.is(Matchers.equalTo(infoPoliza.get("telefono"))));
            MatcherAssert.assertThat(this.labelDireccionPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("direccionPoliza"))));
            MatcherAssert.assertThat(this.labelTipoDireccion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoDireccion"))));
            MatcherAssert.assertThat(this.labelDescripcionDireccion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("descripcionDireccion"))));
            MatcherAssert.assertThat(this.labelDetallesPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("labelDetallesPoliza"))));
            MatcherAssert.assertThat(this.labelOrganizacion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("organizacion"))));
            MatcherAssert.assertThat(this.labelCanal.getText(), Is.is(Matchers.equalTo(infoPoliza.get("canal"))));
            MatcherAssert.assertThat(this.labelTipoPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoPoliza"))));
            MatcherAssert.assertThat(this.labelTipoPlazo.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoPlazo"))));
            MatcherAssert.assertThat(this.labelFechaVigencia.getText(), Is.is(Matchers.equalTo(infoPoliza.get("fechaVigencia"))));
            MatcherAssert.assertThat(this.labelFechaExpiracion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("fechaExpiracion"))));
            MatcherAssert.assertThat(this.labelFechaEscrita.getText(), Is.is(Matchers.equalTo(infoPoliza.get("fechaEscrita"))));
            MatcherAssert.assertThat(this.labelPolizaFinanciada.getText(), Is.is(Matchers.equalTo(infoPoliza.get("polizaFinanciada"))));
            MatcherAssert.assertThat(this.labelAgenteRegistro.getText(), Is.is(Matchers.equalTo(infoPoliza.get("labelAgenteRegistro"))));
            MatcherAssert.assertThat(this.labelOrganizacionAgente.getText(), Is.is(Matchers.equalTo(infoPoliza.get("organizacionAgente"))));
            MatcherAssert.assertThat(this.labelCodigoAgente.getText(), Is.is(Matchers.equalTo(infoPoliza.get("codigoAgente"))));
            MatcherAssert.assertThat(this.labelModificadorPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("modificadorPoliza"))));
            MatcherAssert.assertThat(this.labelDescuentoPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("descuentoPoliza"))));
        } catch (Exception e) {
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
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
        waitFor(botonTipoPlazo).shouldBeVisible();
        botonTipoPlazo.click();
        waitFor(tipoPlazoPoliza).shouldBeVisible();
        $(tipoPlazoPoliza).type(tipoPlazo);
        waitFor(itemTipoPlazo).shouldBeVisible();
        itemTipoPlazo.click();
        waitUntil(1000);
        waitFor(fechaVigenciaPoliza).shouldBeVisible();
        waitUntil(1000);
        fechaVigenciaPoliza.click();
        $(fechaVigenciaPoliza).type(fechaInicioVigencia);
        waitFor(fechaExpiracionPoliza).shouldBeVisible();
        waitUntil(1000);
        fechaExpiracionPoliza.click();
    }

    public void calcularFechaFinVigencia(String fechaInicioVigencia) {
        waitForTextToAppear("Tomador");
        waitFor(tipoPlazoPoliza).shouldBeVisible();
        String tipoPlazo = tipoPlazoPoliza.getValue();
        waitFor(fechaVigenciaPoliza).shouldBeVisible();
        String fechaVigencia = fechaVigenciaPoliza.getValue();
        waitFor(fechaExpiracionPoliza).shouldBeVisible();
        String fechaExpiracion = fechaExpiracionPoliza.getTextValue();
        String aniovig = fechaVigencia.substring(6, 10);
        String anioexp = fechaExpiracion.substring(6, 10);
        String mesvig = fechaVigencia.substring(0, 2);
        String mesexp = fechaExpiracion.substring(0, 2);
        String diavig = fechaVigencia.substring(3, 5);
        String diaexp = fechaExpiracion.substring(3, 5);
        int aniovignum = Integer.parseInt(aniovig);
        int anioexpnum = Integer.parseInt(anioexp);
        int mesvignum = Integer.parseInt(mesvig);
        int mesexpnum = Integer.parseInt(mesexp);
        int diavignum = Integer.parseInt(diavig);
        int diaexpnum = Integer.parseInt(diaexp);
        int restaanio = anioexpnum - aniovignum;
        int restames = mesexpnum - mesvignum;
        int restadia = diaexpnum - diavignum;

        if ("Anual".equals(tipoPlazo)) {
            MatcherAssert.assertThat(restaanio, Is.is(Matchers.equalTo(1)));
            MatcherAssert.assertThat(restames, Is.is(Matchers.equalTo(0)));
            MatcherAssert.assertThat(restadia, Is.is(Matchers.equalTo(0)));
        } else if ("6 meses".equals(tipoPlazo)) {
            if (mesvignum > 6) {
                MatcherAssert.assertThat(restaanio, Is.is(Matchers.equalTo(1)));
                MatcherAssert.assertThat(restames, Is.is(Matchers.equalTo(-6)));
            } else {
                MatcherAssert.assertThat(restaanio, Is.is(Matchers.equalTo(0)));
                MatcherAssert.assertThat(restames, Is.is(Matchers.equalTo(6)));
            }
            MatcherAssert.assertThat(restadia, Is.is(Matchers.equalTo(0)));
        } else if ("Otra".equals(tipoPlazo)) {
            waitFor(fechaExpiracionPoliza).shouldBeVisible();
            MatcherAssert.assertThat(fechaExpiracionPoliza.getTagName(), Is.is(Matchers.equalTo("input")));
        }

    }

    public void adicionarSegundoTomador(String tipoDocumento, String primerNombre, String primerApellido) {
        waitForTextToAppear("Tomador secundario");
        waitUntil(2000);
        waitFor(botonAseguradoSecundario).shouldBeVisible();
        botonAseguradoSecundario.click();
        waitFor(itemPersonaDelDirectorio).shouldBeVisible();
        itemPersonaDelDirectorio.click();
        waitUntil(1000);
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
        botonSiguiente.click();
    }

    public void validarMensajePorcentajePoliza(String mensaje) {
        waitForTextToAppear("Descuento póliza");
        waitFor(textoDescuentoPoliza).shouldBeVisible();
        String descuentoPoliza = textoDescuentoPoliza.getValue();
        waitFor(mensajeValidacion).shouldBeVisible();
        if (esNumerico(descuentoPoliza)) {
            if (Integer.parseInt(descuentoPoliza) > 50 || Integer.parseInt(descuentoPoliza) < 0) {
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
        try {
            double descuentoPoliza = Double.parseDouble(textoDescuentoPoliza.getValue());
            int pEntera = (int) descuentoPoliza;
            double pDecimal = descuentoPoliza - pEntera;
            String parteEntera = Integer.toString(pEntera);
            String parteDecimal = Double.toString(pDecimal);
            if (parteEntera.length() > 2 || parteDecimal.length() > 2) {
                waitFor(mensajeValidacion).shouldBePresent();
                MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
            }
        } catch (StaleElementReferenceException element) {
            element.printStackTrace();
        }
    }

    public void definirPolizaFinanciada() {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(polizaFinanciada).click();
    }

    public void ingresarNumeroCuotas() {
        waitFor(labelNumeroCuotas).shouldBePresent();
        MatcherAssert.assertThat(labelNumeroCuotas.getText(), labelNumeroCuotas.isCurrentlyVisible());
        MatcherAssert.assertThat(textoNumeroCuotas.getText(), textoNumeroCuotas.isCurrentlyVisible());
        waitUntil(2000);
        botonNumeroCuotas.click();
        itemNumeroCuotas.click();
        waitFor(fechaExpiracionPoliza).shouldBeVisible();
        fechaExpiracionPoliza.click();
        waitUntil(1000);
    }

    public void validarRetroactividadPoliza(String mensaje) {
        waitUntil(3000);
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
        waitUntil(1000);
        waitFor(fechaVigenciaPoliza).shouldBeVisible();
        fechaVigenciaPoliza.click();
        $(fechaVigenciaPoliza).type(fechaInicioVigencia);
        waitFor(fechaExpiracionPoliza).shouldBeVisible();
        waitUntil(2000);
        fechaExpiracionPoliza.click();
    }

    public void pasarASiguienteOpcion() {
        waitFor(botonSiguiente).shouldBeVisible();
        botonSiguiente.click();
        waitUntil(1000);
    }

    public void identificarTipoYNumeroIdentificacion(String tipoDocumento, String numeroDocumento) {
        waitUntil(1000);
        String validacion = null;
        WebElementFacade campoTipoDocumento = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-inputEl']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(campoTipoDocumento).shouldBeVisible();
        WebElementFacade campoNumeroDocumento = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(campoNumeroDocumento).shouldBeVisible();
        try {
            MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(tipoDocumento)));
            MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(numeroDocumento)));
        } catch (Exception e) {
            LOGGER.error(validacion, e);
        }
        waitUntil(1000);
    }

    public void validarMensajeBloqueoPEP(String mensaje) {
        waitUntil(1000);
        waitFor(grupoMensajes).shouldBePresent();
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
        botonSiguiente.click();
        waitUntil(2000);
    }

    public void permitirContinuarCotizacionAsegurados() {
        waitUntil(1000);
        WebElementFacade labelTituloAsegurados = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']");
        waitFor(labelTituloAsegurados).shouldBePresent();
        MatcherAssert.assertThat(labelTituloAsegurados.getText(), Is.is(Matchers.equalTo("Asegurados")));
        waitUntil(1000);
    }

    public void irAInformacionDePoliza() {
        waitFor(menuInformacionPoliza).click();
        waitForTextToAppear("Información de póliza");
    }

    public void noIndicarPolizaFinanciada() {
        waitFor(polizaFinanciadaNo).click();
    }

    public void noHabilitarNumeroCuotas() {
        boolean validacion = labelNumeroCuotas.isCurrentlyEnabled();
        MatcherAssert.assertThat(validacion, Is.is(Matchers.not(Matchers.equalTo(true))));
    }

    public void seleccionarOpcionSiguiente() {
        botonSiguiente.click();
        waitUntil(1500);
    }

    public void validarMensajeFinanciacion(String mensaje){
        MatcherAssert.assertThat(mensajeFinanciacion.getText(),Is.is(Matchers.equalTo(mensaje)));
    }

    /**
     * Métodos para las validaciones de pólizas hija de pólizas colectivas
     */
    public void validarInfoPolizaPA(ExamplesTable infoPolizaPA) {
        Map<String, String> informacionPoliza = infoPolizaPA.getRows().get(0);
        String fechaFin = LocalDateTime.now().plusYears(Integer.parseInt(informacionPoliza.get("aniosVigencia"))).toString(DD_MM_YYYY);
        waitForTextToAppear("Información de póliza", 30000);
        try {
            MatcherAssert.assertThat(tipoDocumento.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("tipoDocumentoTomador"))));
            MatcherAssert.assertThat(numeroDocumento.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("numeroDocumentoTomador"))));
            MatcherAssert.assertThat(nombreTomador.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("nombreTomador"))));
            MatcherAssert.assertThat(telefonoTomador.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("telefonoTomador"))));
            MatcherAssert.assertThat(tipoDirTomador.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("tipoDireccionTomador"))));
            MatcherAssert.assertThat(descripcionDireccionTomador.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("descripcionDirTomador"))));
            MatcherAssert.assertThat(direccionTomador.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("direccionTomador"))));
            MatcherAssert.assertThat(campoOrganizacion.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("organizacion"))));
            MatcherAssert.assertThat(campoCanal.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("canal"))));
            MatcherAssert.assertThat(campoTipoPoliza.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("tipoPoliza"))));
            MatcherAssert.assertThat(tipoPlazoPoliza.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("tipoPlazo"))));
            MatcherAssert.assertThat(fechaVigenciaPoliza.getValue(), Is.is(Matchers.equalTo(LocalDateTime.now().toString(DD_MM_YYYY))));
            MatcherAssert.assertThat(fechaExpiracionPoliza.getText(), containsText(fechaFin));
            MatcherAssert.assertThat(fechaEscrita.getText(), Is.is(Matchers.equalTo(LocalDateTime.now().toString(DD_MM_YYYY))));
            MatcherAssert.assertThat(campoOficina.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("oficina"))));
            MatcherAssert.assertThat(campoAgente.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("agente"))));
            MatcherAssert.assertThat(textoDescuentoPoliza.getText(), Is.is(Matchers.equalTo(informacionPoliza.get("descuento"))));
            setImplicitTimeout(2, TimeUnit.SECONDS);
            MatcherAssert.assertThat(botonCambiarDireccion.isVisible(), Is.is(Matchers.equalTo(false)));
            MatcherAssert.assertThat(botonCambiarTomador.isVisible(), Is.is(Matchers.equalTo(false)));
            MatcherAssert.assertThat(linkCoaseguro.isVisible(), Is.is(Matchers.equalTo(false)));
            MatcherAssert.assertThat(polizaFinanciada.isVisible(), Is.is(Matchers.equalTo(false)));
            resetImplicitTimeout();
        } catch (AssertionError assertionError) {
            resetImplicitTimeout();
            LOGGER.error("Algún elemento de la pantalla no es válido", assertionError);
        }
    }

    public void validarFechaFinVigenciaPolizaColectivaAutos() {
        MatcherAssert.assertThat(fechaExpiracionPoliza.getText(), Is.is(Matchers.equalTo(LocalDateTime.now().plusYears(1).toString(DD_MM_YYYY))));
    }

    public void validarFechaInicioVigenciaPolizaColectiva() {
        MatcherAssert.assertThat(fechaVigenciaPoliza.getValue(), Is.is(Matchers.equalTo(LocalDateTime.now().toString(DD_MM_YYYY))));
    }

    public void validarFechaFinVigenciaPolizaColectivaCommercial(int numeroDias) {
        MatcherAssert.assertThat(fechaExpiracionPoliza.getText(), Is.is(Matchers.equalTo(LocalDateTime.now().minusDays(numeroDias).plusYears(1).toString(DD_MM_YYYY))));
    }

    public void validarFechaInicioVigenciaMenorALaPolizaMadre(String mensaje) {
        WebElementFacade mensajeFechaInicioColectiva = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']/div");
        MatcherAssert.assertThat(mensajeFechaInicioColectiva.getText(), Matchers.containsString(mensaje + " (" + LocalDateTime.now().plusDays(1).toString(DD_MM_YYYY) + ")"));
    }
}

