package com.sura.policycenter.selenium.pages.colectivas;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.lang.String;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:FundedPolicyInputSet:QuestionFundedPolicy_true-boxLabelEl']")
    WebElementFacade polizaFinanciadaSi;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:FundedPolicyInputSet:QuestionFundedPolicy_false-boxLabelEl']")
    WebElementFacade polizaFinanciadaNo;
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
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ChangeSecondaryNamedInsuredButton:ExistingNamedInsured:0:UnassignedAccountContact-textEl']")
    WebElementFacade submenuContacto;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:_msgs']/div")
    WebElementFacade mensajeDescuento;
    @FindBy(xpath = "")
    WebElementFacade mensajeRetroactividad;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:SecondaryNamedInsuredInfo:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade tipoDocumentoSegundo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:SecondaryNamedInsuredInfo:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade numeroDocumentoSegundo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ChangeSecondaryNamedInsuredButton-inputEl']")
    WebElementFacade nombreSegundo;
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
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:editConinsuranceLink']")
    WebElementFacade linkEliminarCoaseguro;

    private static String BTN_ELEGIR_PRODUCTO_ = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:CollectiveProductSelectionLV:CollectiveProductSelection_ExtLV:";

    private Guidewire guidewire = new Guidewire(getDriver());

    private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    private Date fechaHoy = new Date();
    private static final DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy");

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
        MatcherAssert.assertThat(fechaExpedicion.getValue(), Is.is(Matchers.equalTo(dateFormat.format(fechaHoy))));
        MatcherAssert.assertThat(oficinaRadicacion.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("oficina"))));
        MatcherAssert.assertThat(codAgente.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("codAgente"))));
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
        guidewire.waitUntil(1000);
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
        fechaInicioVigencia.typeAndTab(nuevaFechaInicio.toString("MM/dd/yyyy"));
    }

    public void ingresarDescuentoPoliza(String descuento) {
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
        guidewire.waitUntil(1500);
        MatcherAssert.assertThat(mensajePantalla.getText(), containsText(mensaje));
    }

    public void validarMensajeDescuentoInvalido(String mensaje) {
        validarMensaje(mensajeDescuento, mensaje);
    }

    public void ingresarFechaInicioInvalidaParaRetroactividad(String sesentaDias) {
        LocalDateTime nuevaFechaInicio;
        if ("menos".equals(sesentaDias)) {
            nuevaFechaInicio = (LocalDateTime.now().minusMonths(2).minusDays(1));
            fechaInicioVigencia.clear();
            fechaInicioVigencia.typeAndTab(nuevaFechaInicio.toString("MM/dd/yyyy"));
        } else {
            nuevaFechaInicio = (LocalDateTime.now().plusMonths(2).plusDays(1));
            fechaInicioVigencia.clear();
            fechaInicioVigencia.typeAndTab(nuevaFechaInicio.toString("MM/dd/yyyy"));
        }
    }

    public void clicEnSiguiente() {
        botonSiguiente.click();
    }

    public void validarFechaFinDeVigencia(int aniosFinVigencia, String tipoPlazo) {
        String fechaFinVigencia = LocalDateTime.now().plusYears(aniosFinVigencia).toString("MM/dd/yyyy");
        System.out.println("fecha fin de vigencia obtenida " + fechaFinVigencia);
//        guidewire.waitUntil(1000);
//        int anioVigenciaProducto = LocalDateTime.now().getYear() + aniosFinVigencia;
//        String fechaFinVigencia = LocalDateTime.now().getMonthOfYear() + "/" + LocalDateTime.now().getDayOfMonth() + "/" + anioVigenciaProducto;
        MatcherAssert.assertThat(campoFechaFinVigencia.getText(), containsText(fechaFinVigencia));
        MatcherAssert.assertThat(campoTipoPlazo.getValue(), Is.is(Matchers.equalTo(tipoPlazo)));
    }

    public void validarFechaFinDeVigenciaCambiada(int aniosFinVigencia) {
        String nuevaFechaFin = fechaInicioVigencia.getValue();
        Integer anioVigenciaProducto = Integer.parseInt(nuevaFechaFin.substring(6, 10)) + aniosFinVigencia;
        System.out.println("año vigencia " + nuevaFechaFin.substring(6, 10));
        System.out.println("anioVigenciaProducto " + anioVigenciaProducto);
        String fechaFinVigencia = nuevaFechaFin.replace(nuevaFechaFin.substring(6, 10), anioVigenciaProducto.toString());
        System.out.println("fecha fin vigencia cambiada " + fechaFinVigencia);
        MatcherAssert.assertThat(campoFechaFinVigencia.getText(), Is.is(Matchers.equalTo(fechaFinVigencia)));
    }

    public void validarMensajeRetroactividadInvalida(String mensaje) {
        validarMensaje(mensajeRetroactividad, mensaje);
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
        campoAseguradora.clear();
        campoAseguradora.sendKeys("Axxa");
    }

    public void darClicEnAceptarDeCoaseuguro() {
        botonAceptarCoaseguro.click();
    }

    public void validarLinksDeCoaseguroVisiblesYHabilitados(){
        waitForTextToAppear("Información de la póliza colectiva");
        linkEditarCoaseguro.shouldBeVisible();
        linkEditarCoaseguro.shouldBeEnabled();
        linkEliminarCoaseguro.shouldBeVisible();
        linkEliminarCoaseguro.shouldBeEnabled();
    }

    public void clicEnEliminarCoaseguro(){
        linkEliminarCoaseguro.click();
    }

    public void clicEnEditarCoaseguro(){
        linkEditarCoaseguro.click();
    }

    public void validarEliminacionDeCoaseguro(){
        linkEditarCoaseguro.shouldNotBeVisible();
        linkEliminarCoaseguro.shouldNotBeVisible();
        linkAgregarCoaseguro.shouldBeVisible();
        linkAgregarCoaseguro.shouldBeEnabled();
    }

    public void validarPantallaDeEdicion(){
        MatcherAssert.assertThat(campoPorcentajeParticipacionSura.getText(), containsText("60"));
        MatcherAssert.assertThat(campoPorcentajeParticipacionOtra.getText(), containsText("40"));
        MatcherAssert.assertThat(campoAseguradora.getText(), containsText("Axxa"));
    }

    public void clicEnCancelarDeCoaseguro(){
        botonCancelarCoaseguro.click();
        waitForTextToAppear("Información de la póliza colectiva");
    }
}
