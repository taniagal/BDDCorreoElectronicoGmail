package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.serinitybdd.util.GwNavegacionUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;


import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class OpcionesAdminitradorCotizaciones extends Guidewire {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesAdminitradorCotizaciones.class);

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:0']")
    private WebElementFacade lblCotizacionesCuenta;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuIcon']")
    private WebElementFacade btnAcciones;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:2:SubmissionActions:SubmissionActionsMenuItemSet:Decline']")
    private WebElementFacade itmDeclinar;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuItemSet:NotTakenJob-textEl']")
    private WebElementFacade itmNoTomar;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManager_NewSubmission-btnInnerEl']")
    private WebElementFacade btnNuevaCotizacion;

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ttlBar']")
    private WebElementFacade lblEnviosNuevos;

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:Producer-labelEl']")
    private WebElementFacade lblOrganizacion;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuIcon-fieldMenu']")
    private WebElementFacade lstAcciones;

    @FindBy(xpath = "//td/div/div[3]/div/table")
    private WebElementFacade tblCotizaciones;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:submissionFilter-inputEl']")
    private WebElementFacade txtCotizaciones;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:productFilter-inputEl']")
    private WebElementFacade txtProductos;

    @FindBy(xpath = ".//div[2]/div/div/div/div/span")
    private WebElementFacade colAcciones;

    @FindBy(xpath = ".//div/div/div[2]/div/span")
    private WebElementFacade colProducto;

    @FindBy(xpath = "//div[3]/div/span")
    private WebElementFacade colNumCotizacion;

    @FindBy(xpath = "//div/div/div[4]/div/span")
    private WebElementFacade colTipoCotizacion;

    @FindBy(xpath = "//div[5]/div/span")
    private WebElementFacade colFechaIniVigencia;

    @FindBy(xpath = "//div[6]/div/span")
    private WebElementFacade colFechaFinVigencia;

    @FindBy(xpath = "//div[7]/div/span")
    private WebElementFacade colNumeroPoliza;

    @FindBy(xpath = "//div[8]/div/span")
    private WebElementFacade colEstado;

    @FindBy(xpath = "//div[9]/div/span")
    private WebElementFacade colCostoTotal;

    @FindBy(xpath = "//div[10]/div/span")
    private WebElementFacade colCartas;

    @FindBy(xpath = "//tr[7]/td[2]/div/span[2]")
    private WebElementFacade lblPropiedadComercialDeclinado;

    @FindBy(xpath = "//tr[7]/td[8]/div")
    private WebElementFacade lblDeclinado;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:3:DeclineLetter']")
    private WebElementFacade btnCrearCartaDeclinacion;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:0:SubmissionProduct']")
    private WebElementFacade lblAutoPersonal;

    @FindBy(xpath = "//tbody/tr/td[10]/div")
    private WebElementFacade campoCartas;

    /*
    * WebElementFacade ingresados para story Nueva
    * */

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:4:SubmissionActions:SubmissionActionsMenuIcon']")
    private WebElementFacade btnAcciones2;

    @FindBy(xpath = ".//*[@id='DeclineReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl']")
    private WebElementFacade txtCodRazon;

    @FindBy(xpath = ".//*[@id='DeclineReasonPopup:RejectScreen:RejectReasonDV:RejectReasonText-inputEl']")
    private WebElementFacade txtRazonCartaDeclina;

    @FindBy(xpath = ".//*[@id='NotTakenReasonPopup:RejectScreen:RejectReasonDV:RejectReasonText-inputEl']")
    private WebElementFacade txtRazonCartaNoTomar;

    @FindBy(xpath = ".//*[@id='DeclineReasonPopup:RejectScreen:Update-btnInnerEl']")
    private WebElementFacade btnRechazar;

    @FindBy(xpath = ".//*[@id='NotTakenReasonPopup:RejectScreen:Update']")
    private WebElementFacade btnNoTomar;

    @FindBy (xpath = ".//*[@id='DeclineReasonPopup:RejectScreen:Cancel-btnInnerEl']")
    private WebElementFacade btnCancelar;

    @FindBy (xpath = ".//*[@id='NotTakenReasonPopup:RejectScreen:Cancel-btnInnerEl']")
    private WebElementFacade btnCancelarNoTomar;

    @FindBy (xpath = ".//*[@id='DeclineReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl']")
    private WebElementFacade listaTipoRazon;

    @FindBy (xpath = ".//*[@id='NotTakenReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl']")
    private WebElementFacade listaTipoRazonNoTomar;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:4:SubmissionActions:SubmissionActionsMenuItemSet:Decline']")
    private WebElementFacade itmDeclinarComProp;

    @FindBy(id = "DeclineReasonPopup:RejectScreen:_msgs")
    private WebElementFacade msg;

    @FindBy(id = "NotTakenReasonPopup:RejectScreen:_msgs")
    private WebElementFacade msgNoTomar;


    public OpcionesAdminitradorCotizaciones(WebDriver driver) {
        super(driver);
    }

    public void seleccionarAcciones() {
        waitFor(btnAcciones).waitUntilClickable();
        btnAcciones.click();
    }

    public void validarEstadosCotizacion(String estadoDeclinar, String estadoNoTomar) {
        assertThat(itmDeclinar.getText(), is(equalTo(estadoDeclinar)));
        assertThat(itmNoTomar.getText(), is(equalTo(estadoNoTomar)));
    }

    public void crearNuevaCotizacion() {
        waitABit(1000);
        btnNuevaCotizacion.click();
    }

    public void validarCreacionCotizacion() {
        waitABit(1000);
        boolean validacion = false;
        if (lblEnviosNuevos.isPresent() && lblOrganizacion.isPresent()) {
            validacion = true;
        }
        assertTrue(validacion);
    }

    public void validarOpcionRetirar(String retirar) {
        Boolean validacion = false;
        validacion = lstAcciones.containsElements(retirar);
        assertFalse(validacion);
    }

    public void seleccionarFiltros(String cotizacion, String producto) {
        waitABit(1000);
        txtCotizaciones.click();
        WebElementFacade cbxCotizacion = findBy(".//li[contains(.,'" + cotizacion + "')]");
        waitABit(1000);
        cbxCotizacion.click();
        waitABit(1000);
        txtProductos.click();
        WebElementFacade cbxProducto = findBy(".//li[contains(.,'" + producto + "')]");
        waitABit(1000);
        cbxProducto.click();
        act.sendKeys(Keys.ENTER);
        waitABit(1500);
    }

    public void mostrarInfoCotizacion(String producto) {
        String tProductos = "Todos Los Productos";
        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (tProductos.equals(producto) && !(" ".equals(cells.get(1).getText()))) {
                assertThat(cells.get(1).getText(), is(not(equalTo(null))));
                assertThat(cells.get(2).getText(), is(not(equalTo(null))));
                assertThat(cells.get(3).getText(), is(not(equalTo(null))));
                assertThat(cells.get(4).getText(), is(not(equalTo(null))));
                assertThat(cells.get(5).getText(), is(not(equalTo(null))));
                assertThat(cells.get(7).getText(), is(not(equalTo(null))));
            } else if (!(" ".equals(cells.get(1).getText()))) {
                boolean valido = cells.get(1).getText().equals(producto);
                assertTrue(valido);
                assertThat(cells.get(1).getText(), is(not(equalTo(null))));
                assertThat(cells.get(2).getText(), is(not(equalTo(null))));
                assertThat(cells.get(3).getText(), is(not(equalTo(null))));
                assertThat(cells.get(4).getText(), is(not(equalTo(null))));
                assertThat(cells.get(5).getText(), is(not(equalTo(null))));
                assertThat(cells.get(7).getText(), is(not(equalTo(null))));
            }
        }

    }

    public void validarLabelsCotizaciones(Map<String, String> labelsCotizaciones) {
        try {
            Thread.sleep(2000);
            assertThat(lblCotizacionesCuenta.getText().toString(), is(equalTo(labelsCotizaciones.get("lblCotizaciones"))));
            assertThat(btnNuevaCotizacion.getText().toString(), is(equalTo(labelsCotizaciones.get("btnNuevaCotizacion"))));
            assertThat(colAcciones.getText().toString(), is(equalTo(labelsCotizaciones.get("acciones"))));
            assertThat(colProducto.getText().toString(), is(equalTo(labelsCotizaciones.get("producto"))));
            assertThat(colNumCotizacion.getText().toString(), is(equalTo(labelsCotizaciones.get("numCotizacion"))));
            assertThat(colTipoCotizacion.getText().toString(), is(equalTo(labelsCotizaciones.get("tipoCotizacion"))));
            assertThat(colFechaIniVigencia.getText().toString(), is(equalTo(labelsCotizaciones.get("fechaIniVigencia"))));
            assertThat(colFechaFinVigencia.getText().toString(), is(equalTo(labelsCotizaciones.get("fechaFinVigencia"))));
            assertThat(colNumeroPoliza.getText().toString(), is(equalTo(labelsCotizaciones.get("numPoliza"))));
            assertThat(colEstado.getText().toString(), is(equalTo(labelsCotizaciones.get("estado"))));
            assertThat(colCostoTotal.getText().toString(), is(equalTo(labelsCotizaciones.get("costoTotal"))));
            assertThat(colCartas.getText().toString(), is(equalTo(labelsCotizaciones.get("cartas"))));
        } catch (InterruptedException e) {
            LOGGER.error("This is error", e);
        }
    }

    public void validarEstadoDiferenteExpedida(String estado) {

        Integer contador = 0;

        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!" ".equals(cells.get(2).getText()) && cells.get(7).getText().equals(estado)) {
                contador++;
            }
        }

        if ("Expedida".equals(estado)) {
            assertThat(contador, is(equalTo(1)));
        } else if (!"Expedida".equals(estado)) {
            assertThat(contador, is(equalTo(1)));
        }
    }

    public void validarNumeroPoliza() {

        Integer contador = 0;

        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!" ".equals(cells.get(2).getText()) && !" ".equals(cells.get(6).getText()) && "Expedida".equals(cells.get(7).getText())) {
                contador++;
            }
        }
        assertThat(contador, is(equalTo(1)));
    }

    public void validarEstadoCotizacionDeclinado(String propiedadComercial, String declinado) {

        assertThat(lblPropiedadComercialDeclinado.getText(), is(equalTo(propiedadComercial)));
        assertThat(lblDeclinado.getText(), is(equalTo(declinado)));

    }

    public void mostrarBotonCrearCartaDeclinacion(String crearCarta) {
        assertThat(btnCrearCartaDeclinacion.getText(), is(equalTo(crearCarta)));
    }

    public void validarEstadoAutoPersonal(String producto) {
        assertThat(lblAutoPersonal.getText(), is(equalTo(producto)));
    }

    public void noMostrarBotonCrearCarta(String crearCarta) {
        assertThat(campoCartas.getText(), is(not(equalTo(crearCarta))));
    }

    public void mostrarTodosLosProductos(String producto) {
        waitABit(1000);
        txtProductos.click();
        WebElementFacade cbxProducto = findBy(".//li[contains(.,'" + producto + "')]");
        waitABit(1000);
        cbxProducto.click();
        act.sendKeys(Keys.ENTER);
        waitABit(1500);
    }

    /**
     * Metodos Ingresados para re-usar el mismo Page.
     * Intervenido por: Jonathan Mejia Leon
     * Fecha de intervencion: 21/06/2016
     * Motivo: Uso del page para Administracion de cotización (Declinar-No Tomar)
     * Story usada: admon_cotizacion_cuenta.story
     */

    public void seleccionarAccionesDeclinar() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnAcciones2).waitUntilClickable();
        btnAcciones2.click();
        $(itmDeclinarComProp).click();
    }

    public void seleccionarAccionesNoTomar() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnAcciones).waitUntilClickable();
        btnAcciones.click();
        $(itmNoTomar).click();
    }

    public void ingresaRechazo(String razon) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(txtCodRazon).shouldBeEnabled();
        txtCodRazon.clear();
        txtCodRazon.sendKeys(razon);
        txtRazonCartaDeclina.click();
        txtRazonCartaDeclina.sendKeys("Texto de Razon caracteres especiales !#$%&/()=");
        btnRechazar.click();
    }

    public void noIngresaRechazo() {
        txtRazonCartaDeclina.click();
        txtRazonCartaDeclina.sendKeys("Texto de Razon caracteres especiales !#$%&/()=");
        btnRechazar.click();
    }

    public void ingresaRechazoNoTomar(String razon) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(listaTipoRazonNoTomar).shouldBeEnabled();
        listaTipoRazonNoTomar.clear();
        listaTipoRazonNoTomar.sendKeys(razon);
        txtRazonCartaNoTomar.click();
        txtRazonCartaNoTomar.sendKeys("Texto de Razon caracteres especiales !#$%&/()=");
        btnNoTomar.click();
    }

    public void noIngresaRechazoNoTomar() {
        txtRazonCartaNoTomar.click();
        txtRazonCartaNoTomar.sendKeys("Texto de Razon caracteres especiales !#$%&/()=");
        btnNoTomar.click();
    }

    private List<WebElementFacade> getListaCotizaciones() {
        List<WebElementFacade> numerosCotizacion;
        numerosCotizacion = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV-body']/div/table/tbody/tr/td[3]");
        return numerosCotizacion;
    }

    private List<WebElementFacade> getListaEstado() {
        List<WebElementFacade> numeroEstado;
        numeroEstado = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV-body']/div/table/tbody/tr/td[8]");
        return numeroEstado;
    }

    public void validaEstado(String numCotizacion, String accion) {
        int i = 0;
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
        if (getListaCotizaciones().size()>0) {
            for (WebElementFacade cotizacion : getListaCotizaciones()) {
                if (numCotizacion.equals(cotizacion.getText())) {
                   assertThat("El estado no pertenece a la accion dada", accion.equals(getListaEstado().get(i).getText()));
                   break;
                }
                i++;
            }

        }
    }

    public void validaAccionDesabilita (){
        assertThat("Boton Acciones no esta presente", !btnAcciones2.isPresent());
    }

    public void validaAccionDesabilitaNoTomar (){
        assertThat("Boton Acciones no esta presente", !btnAcciones.isPresent());
    }

    public void validaMensaje(String mensaje) {
        waitFor(msg).waitUntilVisible();
        assertThat("Fallo mensaje en campo obligatorio RAZON", msg.containsText(mensaje));
        btnCancelar.click();
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
    }

    public void validaMensajeNoTomar(String mensaje) {
        waitFor(msgNoTomar).waitUntilVisible();
        assertThat("Fallo mensaje en campo obligatorio RAZON", msgNoTomar.containsText(mensaje));
        btnCancelarNoTomar.click();
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
    }

    public void validarOpcionesDeAgregar (ExamplesTable listaRazones) throws Exception{
        listaTipoRazon.click();
        this.validarDatosDeLaLista(listaRazones);
        btnCancelar.click();
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
    }

    public void validarOpcionesDeAgregarNoTomar (ExamplesTable listaRazones) throws Exception{
        listaTipoRazonNoTomar.click();
        this.validarDatosDeLaLista(listaRazones);
        btnCancelarNoTomar.click();
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
    }

    public void validarTodasLasCotizaciones (){
        assertThat("No se pudieron visualizar las polizas", getListaCotizaciones().size()<=0);
    }

    private  void validarDatosDeLaLista(ExamplesTable tipoCanal) throws Exception{
        List<WebElementFacade> elementosTipoCanalVentas;
        List<String> elementosRequeridos = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(tipoCanal);
        for (String tipo : elementosRequeridos) {
            elementosTipoCanalVentas = withTimeoutOf(1, TimeUnit.SECONDS).findAll("//li[contains(.,'"+tipo+"')]");
            for (WebElementFacade lista : elementosTipoCanalVentas){
                assertThat(tipo, Matchers.containsString(lista.getText()));
            }
        }
    }
}

