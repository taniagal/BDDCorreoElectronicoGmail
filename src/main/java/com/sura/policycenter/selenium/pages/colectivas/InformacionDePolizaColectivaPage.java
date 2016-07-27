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
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:PhoneDisplay-inputEl']")
    WebElementFacade telefonoTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:AddressType-inputEl']")
    WebElementFacade tipoDireccionTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:AddressDescription-inputEl']")
    WebElementFacade descripcionDireccionTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ChangePolicyAddressButton-inputEl']")
    WebElementFacade direccionDeLaPoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:0']")
    WebElementFacade detallesDePolizaTitulo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:SalesOrganizationType-inputEl']")
    WebElementFacade organizacion;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:ChannelType-inputEl']")
    WebElementFacade canal;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:PolicyType-inputEl']")
    WebElementFacade tipoDePoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:TermType-inputEl']")
    WebElementFacade tipoPlazo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:EffectiveDate-inputEl']")
    WebElementFacade fechaInicioVigencia;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:ExpirationDate-bodyEl']")
    WebElementFacade fechaFinVigencia;
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
    @FindBy(xpath = "")
    WebElementFacade mensajeDescuento;
    @FindBy(xpath = "")
    WebElementFacade mensajeRetroactividad;

    private static String BTN_ELEGIR_PRODUCTO_ = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:CollectiveProductSelectionLV:CollectiveProductSelection_ExtLV:";

    private Guidewire guidewire = new Guidewire(getDriver());

    private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    private Date date = new Date();

    public InformacionDePolizaColectivaPage(WebDriver driver) {
        super(driver);
    }

    public void validarInformacionDePolizaColectiva(ExamplesTable informacionPolizaColectiva) {
        Map<String, String> infoPoliza = informacionPolizaColectiva.getRows().get(0);
        waitForTextToAppear("Información de la póliza colectiva");
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
        MatcherAssert.assertThat(tipoPlazo.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("tipoPlazo"))));
        MatcherAssert.assertThat(fechaInicioVigencia.getValue(), Is.is(Matchers.equalTo(dateFormat.format(date))));
        MatcherAssert.assertThat(fechaFinVigencia.getText(), containsText(infoPoliza.get("fechaFin")));
        MatcherAssert.assertThat(fechaExpedicion.getText(), Is.is(Matchers.equalTo(dateFormat.format(date))));
        MatcherAssert.assertThat(polizaFinanciadaSi.getText(), Is.is(Matchers.equalTo(infoPoliza.get("polizaFinanciadaSi"))));
        MatcherAssert.assertThat(polizaFinanciadaNo.getText(), Is.is(Matchers.equalTo(infoPoliza.get("polizaFinanciadaNo"))));
        MatcherAssert.assertThat(oficinaRadicacion.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("oficina"))));
        MatcherAssert.assertThat(codAgente.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("codAgente"))));
        MatcherAssert.assertThat(descuentoPoliza.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("descuentoPoliza"))));
        linkAgregarCoaseguro.shouldBeVisible();
        linkAgregarCoaseguro.shouldContainText(infoPoliza.get("agregarCoaseguro"));
        radioPolizaFinanciadaSi.shouldNotBeEnabled();
        radioPolizaFinanciadaNo.shouldNotBeEnabled();
    }

    public void seleccionarProductoPolizaColectiva(String producto){
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

    public String validarFechaFinDeVigencia(int aniosFinVigencia){
        int anioVigenciaProducto = LocalDateTime.now().getYear() + aniosFinVigencia;
        String fechaFinVigencia = LocalDateTime.now().getMonthOfYear() + "/" + LocalDateTime.now().getDayOfMonth() + "/" + anioVigenciaProducto  ;
        return fechaFinVigencia;
    }

    public void validarFechaFinDeVigenciaCambiada(int aniosFinVigencia){
        String nuevaFechaFin = fechaInicioVigencia.getValue();
        Integer anioVigenciaProducto = Integer.parseInt(nuevaFechaFin.substring(6, 9)) + aniosFinVigencia;
        String fechaFinVigencia =  nuevaFechaFin.replace(nuevaFechaFin.substring(6, 9), anioVigenciaProducto.toString());
    }

    public void cambiarFechaInicioVigencia(String nuevaFechaInicio){
        fechaInicioVigencia.clear();
        fechaInicioVigencia.typeAndTab(nuevaFechaInicio);
    }

    public void ingresarDescuentoPoliza(String descuento){
        descuentoPoliza.clear();
        descuentoPoliza.sendKeys(descuento);
    }

    public void validarMensaje(WebElementFacade mensajePantalla, String mensaje){
        waitFor(mensajePantalla).waitUntilVisible();
        MatcherAssert.assertThat(mensajePantalla.getText(), containsText(mensaje));
    }

    public void validarMensajeDescuentoInvalido(String mensaje){
        validarMensaje(mensajeDescuento, mensaje);
    }

    public void ingresarFechaInicioInvalidaParaRetroactividad(){}

    public void validarMensajeRetroactividadInvalida(String mensaje){
        validarMensaje(mensajeRetroactividad, mensaje);
    }

}
