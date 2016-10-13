package com.sura.policycenter.selenium.pages.colectivas;


import com.sura.commons.selenium.Commons;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.joda.time.LocalDateTime;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.LoggerFactory;

public class InformacionDePolizaColectivaPage extends PageObject {

    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ttlBar']")
    WebElementFacade tituloDePagina;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:PrimaryNamedInsuredLabel-labelEl']")
    WebElementFacade tituloTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade tipoDocumento;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade numeroDocumento;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:Name-inputEl']")
    WebElementFacade nombreTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:Phone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    WebElementFacade telefonoTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:AddressType-inputEl']")
    WebElementFacade tipoDireccionTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:AddressDescription-inputEl']")
    WebElementFacade descripcionDireccionTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:AddressSummary-inputEl']")
    WebElementFacade direccionDeLaPoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ChangePolicyAddressButton:ChangePolicyAddressButtonMenuIcon']")
    WebElementFacade botonCambiarDireccion;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:0']")
    WebElementFacade detallesDePolizaTitulo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:SalesOrganizationType-inputEl']")
    WebElementFacade organizacion;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:ChannelType-inputEl']")
    WebElementFacade canal;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:PolicyType-inputEl']")
    WebElementFacade tipoDePoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:TermType-inputEl']")
    WebElementFacade campoTipoPlazo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:EffectiveDate-inputEl']")
    WebElementFacade fechaInicioVigencia;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:ExpirationDate-bodyEl']")
    WebElementFacade campoFechaFinVigencia;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:IssueDate-inputEl']")
    WebElementFacade fechaExpedicion;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:FundedPolicyInputSet:QuestionFundedPolicy_true-inputEl']")
    WebElementFacade radioPolizaFinanciadaSi;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:FundedPolicyInputSet:QuestionFundedPolicy_false-inputEl']")
    WebElementFacade radioPolizaFinanciadaNo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:PolicyInfoProducerOfRecordInputSet:Producer-inputEl']")
    WebElementFacade oficinaRadicacion;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:PolicyInfoProducerOfRecordInputSet:ProducerCode-inputEl']")
    WebElementFacade codAgente;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:modifier-inputEl']")
    WebElementFacade descuentoPoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:addConinsuranceLink']")
    WebElementFacade linkAgregarCoaseguro;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:CollectiveProductSelectionLV:CollectiveProductSelection_ExtLV-body']")
    WebElementFacade tablaProductos;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ChangeSecondaryNamedInsuredButton:ChangeSecondaryNamedInsuredButtonMenuIcon']/img")
    WebElementFacade botonTomadorSecundario;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ChangeSecondaryNamedInsuredButton:ExistingNamedInsured-textEl']")
    WebElementFacade submenuContactoExistente;
    @FindBy(xpath = "//span[contains(.,'GLORIA GALLEGO')]")
    WebElementFacade submenuContacto;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:_msgs']/div")
    WebElementFacade mensajeDescuento;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:SecondaryNamedInsuredInfo:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade tipoDocumentoSegundo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:SecondaryNamedInsuredInfo:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade numeroDocumentoSegundo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ChangeSecondaryNamedInsuredButton-inputEl']")
    WebElementFacade nombreSegundo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ChangeSecondaryNamedInsuredLabel-inputEl']")
    WebElementFacade nombreSegundoLink;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:SecondaryNamedInsuredPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    WebElementFacade telefonoSegundo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:SecondaryAddress-inputEl']")
    WebElementFacade direccionSegundo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:SecondaryNamedInsureAddressType-inputEl']")
    WebElementFacade tipoDireccionSegundo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:SecondaryNamedInsuredAddressDescription-inputEl']")
    WebElementFacade descripcionDireccionSegundo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:Update-btnInnerEl']")
    WebElementFacade botonSiguiente;
    @FindBy(xpath = "//tbody/tr/td[3]/div")
    WebElementFacade campoPorcentajeParticipacionSura;
    @FindBy(xpath = "//div[5]/table/tbody/tr/td[2]/input")
    WebElementFacade campoPorcentajeParticipacionSuraTexto;
    @FindBy(xpath = "//tr[2]/td[3]/div")
    WebElementFacade campoPorcentajeParticipacionOtra;
    @FindBy(xpath = "//div[5]/table/tbody/tr/td[2]/input")
    WebElementFacade campoPorcentajeParticipacionOtraTexto;
    @FindBy(xpath = "//tr[2]/td[2]/div")
    WebElementFacade listaAseguradora;
    @FindBy(xpath = "//div[6]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    WebElementFacade campoAseguradora;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    WebElementFacade botonAceptarCoaseguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Cancel-btnInnerEl']")
    WebElementFacade botonCancelarCoaseguro;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:editConinsuranceLink']")
    WebElementFacade linkEditarCoaseguro;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:deleteCoinsurance']")
    WebElementFacade linkEliminarCoaseguro;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(InformacionDePolizaColectivaPage.class);

    private static String BTN_ELEGIR_PRODUCTO_ = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:CollectiveProductSelectionLV:CollectiveProductSelection_ExtLV:";
    private static final String DD_MM_YYYY = "dd/MM/yyyy";

    private final Commons commons = new Commons(getDriver());
    private final DateFormat dateFormat = new SimpleDateFormat(DD_MM_YYYY);
    private static final Date fechaHoy = new Date();
    private static final String ROLLISTAS = "textbox";

    public InformacionDePolizaColectivaPage(WebDriver driver) {
        super(driver);
    }

    public void validarInformacionDePolizaColectiva(ExamplesTable informacionPolizaColectiva) {
        Map<String, String> infoPoliza = informacionPolizaColectiva.getRows().get(0);
        waitForTextToAppear("Información de la póliza colectiva", 30000);
        MatcherAssert.assertThat(tituloDePagina.getText(), Is.is(Matchers.equalTo(infoPoliza.get("titulo"))));
        MatcherAssert.assertThat(tituloTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tomadorInfo"))));
        MatcherAssert.assertThat(tipoDocumento.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoDocumento"))));
        MatcherAssert.assertThat(numeroDocumento.getText(), Is.is(Matchers.equalTo(infoPoliza.get("numeroDocumento"))));
        MatcherAssert.assertThat(nombreTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("nombre"))));
        MatcherAssert.assertThat(telefonoTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("telefono"))));
        MatcherAssert.assertThat(tipoDireccionTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoDireccion"))));
        MatcherAssert.assertThat(descripcionDireccionTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("descripcionDir"))));
        MatcherAssert.assertThat(direccionDeLaPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("direccionDePoliza"))));
        MatcherAssert.assertThat(detallesDePolizaTitulo.getText(), Is.is(Matchers.equalTo(infoPoliza.get("detallePoliza"))));
        MatcherAssert.assertThat(organizacion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("organizacion"))));
        MatcherAssert.assertThat(canal.getText(), Is.is(Matchers.equalTo(infoPoliza.get("canal"))));
        MatcherAssert.assertThat(tipoDePoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoPoliza"))));
        MatcherAssert.assertThat(campoTipoPlazo.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("tipoPlazo"))));
        MatcherAssert.assertThat(fechaInicioVigencia.getValue(), Is.is(Matchers.equalTo(dateFormat.format(fechaHoy))));
        MatcherAssert.assertThat(campoFechaFinVigencia.getText(), containsText(infoPoliza.get("fechaFin")));
        MatcherAssert.assertThat(fechaExpedicion.getText(), Is.is(Matchers.equalTo(dateFormat.format(fechaHoy))));
        MatcherAssert.assertThat(oficinaRadicacion.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("oficina"))));
        MatcherAssert.assertThat("Error, no se encontró el código de agente", codAgente.getValue().contains(infoPoliza.get("codAgente")));
        MatcherAssert.assertThat(descuentoPoliza.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("descuentoPoliza"))));
        botonCambiarDireccion.shouldBeVisible();
        linkAgregarCoaseguro.shouldBeVisible();
        linkAgregarCoaseguro.shouldContainText(infoPoliza.get("agregarCoaseguro"));
        radioPolizaFinanciadaSi.shouldNotBeVisible();
        radioPolizaFinanciadaNo.shouldNotBeVisible();
    }

    public void seleccionarProductoPolizaColectiva(String producto) {
        String xpathBotonElegirProducto = BTN_ELEGIR_PRODUCTO_ + this.encontrarProducto(producto).toString() + ":addSubmission']";
        WebElementFacade botonElegirProducto = findBy(xpathBotonElegirProducto);
        botonElegirProducto.waitUntilEnabled();
        commons.waitUntil(1000);
        botonElegirProducto.click();
    }


    public Integer encontrarProducto(String producto) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(tablaProductos).waitUntilVisible();
        Integer filaBoton = 0;
        List<WebElement> filas = tablaProductos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (producto.equals(columna.get(1).getText())) {
                return filaBoton;
            }
            filaBoton++;
        }
        return filaBoton;
    }

    public void cambiarFechaInicioVigencia() {
        LocalDateTime nuevaFechaInicio = LocalDateTime.now().minusMonths(1);
        fechaInicioVigencia.clear();
        fechaInicioVigencia.typeAndTab(nuevaFechaInicio.toString(DD_MM_YYYY));
    }

    public void ingresarDescuentoPoliza(String descuento) {
        waitFor(descuentoPoliza);
        descuentoPoliza.clear();
        descuentoPoliza.sendKeys(descuento);
    }

    public void seleccionarSegundoTomador() {
        Actions accion = new Actions(getDriver());
        botonTomadorSecundario.click();
        waitFor(submenuContactoExistente);
        accion.moveToElement(submenuContactoExistente).release(submenuContactoExistente).build().perform();
        waitFor(submenuContacto);
        accion.moveToElement(submenuContacto).release(submenuContacto).click().build().perform();
    }

    public void validarMensaje(WebElementFacade mensajePantalla, String mensaje) {
        waitFor(mensajePantalla).waitUntilVisible();
        commons.waitUntil(1500);
        MatcherAssert.assertThat(mensajePantalla.getText(), containsText(mensaje));
    }

    public void validarMensajeDescuentoInvalido(String mensaje) {
        validarMensaje(mensajeDescuento, mensaje);
    }

    public void ingresarFechaInicioInvalidaParaRetroactividad(String sesentaDias, int dias) {
        LocalDateTime nuevaFechaInicio;
        if ("menos".equals(sesentaDias)) {
            nuevaFechaInicio = LocalDateTime.now().minusDays(dias);
            fechaInicioVigencia.clear();
            fechaInicioVigencia.typeAndTab(nuevaFechaInicio.toString(DD_MM_YYYY));
        } else {
            nuevaFechaInicio = LocalDateTime.now().plusDays(dias);
            fechaInicioVigencia.clear();
            fechaInicioVigencia.typeAndTab(nuevaFechaInicio.toString(DD_MM_YYYY));
        }
    }

    public void clicEnSiguiente() {
        if (botonSiguiente.isPresent()) {
            try {
                waitFor(botonSiguiente);
                botonSiguiente.click();
            } catch (Exception e) {
                commons.waitUntil(2000);
                botonSiguiente.click();
            }
        }
    }

    public void validarFechaFinDeVigencia(int aniosFinVigencia, String tipoPlazo) {
        String fechaFinVigencia = LocalDateTime.now().plusYears(aniosFinVigencia).toString(DD_MM_YYYY);
        MatcherAssert.assertThat(campoFechaFinVigencia.getText(), containsText(fechaFinVigencia));
        MatcherAssert.assertThat(campoTipoPlazo.getValue(), Is.is(Matchers.equalTo(tipoPlazo)));
    }

    public void validarFechaFinDeVigenciaCambiada(int aniosFinVigencia) {
        commons.waitUntil(1000);
        String nuevaFechaFin = fechaInicioVigencia.getValue();
        Integer anioVigenciaProducto = Integer.parseInt(nuevaFechaFin.substring(6, 10)) + aniosFinVigencia;
        String fechaFinVigencia = nuevaFechaFin.replace(nuevaFechaFin.substring(6, 10), anioVigenciaProducto.toString());
        MatcherAssert.assertThat(campoFechaFinVigencia.getText(), Is.is(Matchers.equalTo(fechaFinVigencia)));
    }

    public void validarDatosDeSegundoTomador(ExamplesTable informacionSegundoTomador) {
        Map<String, String> infoSegundoTomador = informacionSegundoTomador.getRows().get(0);
        waitForTextToAppear(infoSegundoTomador.get("numeroDocumentoSegundo"));
        MatcherAssert.assertThat(tipoDocumentoSegundo.getText(), containsText(infoSegundoTomador.get("tipoDocumentoSegundo")));
        MatcherAssert.assertThat(numeroDocumentoSegundo.getText(), containsText(infoSegundoTomador.get("numeroDocumentoSegundo")));
        MatcherAssert.assertThat(nombreSegundo.getText(), containsText(infoSegundoTomador.get("nombreSegundo")));
        MatcherAssert.assertThat(telefonoSegundo.getText(), containsText(infoSegundoTomador.get("telefonoSegundo")));
        MatcherAssert.assertThat(direccionSegundo.getText(), containsText(infoSegundoTomador.get("direccionSegundo")));
        MatcherAssert.assertThat(tipoDireccionSegundo.getText(), containsText(infoSegundoTomador.get("tipoDireccionSegundo")));
        MatcherAssert.assertThat(descripcionDireccionSegundo.getText(), containsText(infoSegundoTomador.get("descripcionDireccionSegundo")));
    }

    public void clicEnAgregarCoaseguro() {
        linkAgregarCoaseguro.click();
        waitForTextToAppear("Coaseguro");
    }

    public void ingresarPorcentajeDeParticipacion() {
        campoPorcentajeParticipacionSura.click();
        campoPorcentajeParticipacionSuraTexto.sendKeys("60");
        campoPorcentajeParticipacionOtra.click();
        campoPorcentajeParticipacionOtraTexto.sendKeys("40");
        listaAseguradora.click();
        commons.ingresarDato(campoAseguradora, "ALLIANZ SEGUROS S.A.");
        Actions actions = new Actions(getDriver());
        commons.waitUntil(1000);
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.TAB).build().perform();
    }

    public void darClicEnAceptarDeCoaseuguro() {
        botonAceptarCoaseguro.click();
    }

    public void validarLinksDeCoaseguroVisiblesYHabilitados() {
        waitForTextToAppear("Información de la póliza colectiva");
        linkEditarCoaseguro.waitUntilPresent();
        linkEliminarCoaseguro.waitUntilPresent();
    }

    public void clicEnEliminarCoaseguro() {
        linkEliminarCoaseguro.click();
    }

    public void clicEnEditarCoaseguro() {
        linkEditarCoaseguro.click();
    }

    public void validarEliminacionDeCoaseguro() {
        waitFor(linkAgregarCoaseguro);
        linkEditarCoaseguro.shouldNotBeVisible();
        linkEliminarCoaseguro.shouldNotBeVisible();
        linkAgregarCoaseguro.shouldBeVisible();
        linkAgregarCoaseguro.shouldBeEnabled();
    }

    public void validarPantallaDeEdicion() {
        MatcherAssert.assertThat(campoPorcentajeParticipacionSura.getText(), containsText("60"));
        MatcherAssert.assertThat(campoPorcentajeParticipacionOtra.getText(), containsText("40"));
        MatcherAssert.assertThat(listaAseguradora.getText(), containsText("ALLIANZ SEGUROS S.A."));
    }

    public void clicEnCancelarDeCoaseguro() {
        botonCancelarCoaseguro.click();
        waitForTextToAppear("Información de la póliza colectiva");
    }

    public void validarLosElementosDeshabilitados() {
        waitFor(botonSiguiente).waitUntilNotVisible();
        commons.waitUntil(2000);
        MatcherAssert.assertThat(linkAgregarCoaseguro.getAttribute("href"), Is.is(Matchers.equalTo("")));
        MatcherAssert.assertThat(organizacion.getAttribute("role"), Is.is(Matchers.equalTo(ROLLISTAS)));
        MatcherAssert.assertThat(canal.getAttribute("role"), Is.is(Matchers.equalTo(ROLLISTAS)));
        MatcherAssert.assertThat(tipoDePoliza.getAttribute("role"), Is.is(Matchers.equalTo(ROLLISTAS)));
        MatcherAssert.assertThat(campoTipoPlazo.getAttribute("role"), Is.is(Matchers.equalTo(ROLLISTAS)));
        MatcherAssert.assertThat(fechaInicioVigencia.getAttribute("role"), Is.is(Matchers.equalTo(ROLLISTAS)));
        MatcherAssert.assertThat(codAgente.getAttribute("role"), Is.is(Matchers.equalTo(ROLLISTAS)));
    }

    public void clicEnUnTomadorDeLaPoliza(String tomador) {
        if ("tomador".equals(tomador)) {
            botonSiguiente.waitUntilNotVisible();
            waitFor(nombreTomador);
            nombreTomador.click();
        } else {
            waitFor(nombreSegundoLink);
            nombreSegundoLink.click();
        }
    }
}
