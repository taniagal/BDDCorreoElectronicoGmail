package com.sura.guidewire.policycenter.util.menu.opciones.cuenta;

import com.sura.guidewire.policycenter.util.PageUtil;
import com.sura.guidewire.policycenter.util.GwNavegacionUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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
import org.slf4j.LoggerFactory;



public class OpcionesAdminitradorCotizaciones extends PageUtil {
    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:0']")
    private WebElementFacade lblCotizacionesCuenta;
    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManager_NewSubmission-btnInnerEl']")
    private WebElementFacade btnNuevaCotizacion;
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
    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:0:SubmissionProduct']")
    private WebElementFacade lblAutoPersonal;
    @FindBy(xpath = "//tbody/tr/td[10]/div")
    private WebElementFacade campoCartas;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-labelEl']")
    private WebElementFacade labelNombreAgente;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-labelEl']")
    private WebElementFacade labelCodigoAgente;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:0:SubmissionActions:SubmissionActionsMenuItemSet:NotTakenJob-itemEl']")
    private WebElementFacade itmNoTomarJ;
    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:0:SubmissionActions:SubmissionActionsMenuIcon']")
    private WebElementFacade btnAccionesJ;
    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuIcon']")
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
    @FindBy(xpath = ".//*[@id='DeclineReasonPopup:RejectScreen:Cancel-btnInnerEl']")
    private WebElementFacade btnCancelar;
    @FindBy(xpath = ".//*[@id='NotTakenReasonPopup:RejectScreen:Cancel-btnInnerEl']")
    private WebElementFacade btnCancelarNoTomar;
    @FindBy(xpath = ".//*[@id='DeclineReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl']")
    private WebElementFacade listaTipoRazon;
    @FindBy(xpath = ".//*[@id='NotTakenReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl']")
    private WebElementFacade listaTipoRazonNoTomar;
    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuItemSet:Decline']")
    private WebElementFacade itmDeclinarComProp;
    @FindBy(id = "DeclineReasonPopup:RejectScreen:_msgs")
    private WebElementFacade msg;
    @FindBy(id = "NotTakenReasonPopup:RejectScreen:_msgs")
    private WebElementFacade msgNoTomar;


    private static final String SUBMITIONXPATH = ".//img[contains(@id,'SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:";
    private static final String DECLINELETTER = "//a[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:";
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesAdminitradorCotizaciones.class);
    private static final int CONSTANTE_7 = 7;
    private static final int CONSTANTE_6 = 6;
    private static final int CONSTANTE_5 = 5;
    private static final int CONSTANTE_4 = 4;
    private static final int CONSTANTE_3 = 3;
    private static final int CONSTANTE_2 = 2;
    private int band = 0;

    public OpcionesAdminitradorCotizaciones(WebDriver driver) {
        super(driver);
    }

    public void seleccionarAcciones() {
        band = 0;
        int i = 0;
        withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS).waitFor(tblCotizaciones).waitUntilPresent();
        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!("".equals(cells.get(CONSTANTE_2).getText()) || " ".equals(cells.get(CONSTANTE_2).getText()))) {
                if ("Cotizado".equals(cells.get(CONSTANTE_7).getText()) || "Borrador".equals(cells.get(CONSTANTE_7).getText())) {
                    try {
                        WebElementFacade botonAccciones = findBy(SUBMITIONXPATH + i + ":SubmissionActions:SubmissionActionsMenuIcon')]");
                        botonAccciones.click();
                        waitFor(CONSTANTE_2).seconds();
                        band = i;
                    } catch (Exception e){
                        LOGGER.info(" "+e);
                    }
                    break;
                }
                i++;
            }
        }
    }

    public void validarEstadosCotizacion(String estadoDeclinar, String estadoNoTomar) {
        if (band != 0) {
            WebElementFacade itemDeclinar = findBy(SUBMITIONXPATH + band + ":SubmissionActions:SubmissionActionsMenuItemSet:Decline-itemEl']");
            WebElementFacade itemNoTomar = findBy(SUBMITIONXPATH + band + ":SubmissionActions:SubmissionActionsMenuItemSet:NotTakenJob-itemEl']");
            MatcherAssert.assertThat(itemDeclinar.getText(), Is.is(Matchers.equalTo(estadoDeclinar)));
            MatcherAssert.assertThat(itemNoTomar.getText(), Is.is(Matchers.equalTo(estadoNoTomar)));
        } else {
            MatcherAssert.assertThat(null, Is.is(Matchers.nullValue()));
        }
    }

    public void crearNuevaCotizacion() {
        waitForTextToAppear("Cotizaciones de la cuenta", WAIT_TIME_1000);
        btnNuevaCotizacion.click();
    }

    public void validarCreacionCotizacion() {
        waitForTextToAppear("Nueva cotización", WAIT_TIME_1000);
        boolean validacion = false;
        if (labelCodigoAgente.isPresent() && labelNombreAgente.isPresent()) {
            validacion = true;
        }
        MatcherAssert.assertThat(validacion, Is.is(true));
    }

    public void validarOpcionRetirar(String retirar) {
        Boolean validacion = false;
        validacion = containsText(retirar);
        MatcherAssert.assertThat(validacion, Is.is(false));
    }

    public void seleccionarFiltros(String cotizacion, String producto) {
        waitForTextToAppear("Cotizaciones de la cuenta", WAIT_TIME_1000);
        waitFor(txtCotizaciones).shouldBeVisible();
        txtCotizaciones.click();
        WebElementFacade cbxCotizacion = findBy(".//li[contains(.,'" + cotizacion + "')]");
        waitForTextToAppear(cotizacion, WAIT_TIME_2000);
        waitFor(cbxCotizacion).shouldBeVisible();
        cbxCotizacion.click();
        waitFor(txtProductos).shouldBeVisible();
        txtProductos.click();
        WebElementFacade cbxProducto = findBy(".//li[contains(.,'" + producto + "')]");
        waitForTextToAppear(producto, WAIT_TIME_2000);
        waitFor(cbxProducto).shouldBeVisible();
        cbxProducto.click();
        act.sendKeys(Keys.ENTER);
    }

    public void mostrarInfoCotizacion(String producto) {
        waitForTextToAppear(producto, WAIT_TIME_2500);
        waitUntil(WAIT_TIME_1000);
        String tProductos = "Todos Los Productos";
        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (tProductos.equals(producto) && !("".equals(cells.get(1).getText()) || " ".equals(cells.get(1).getText()))) {
                MatcherAssert.assertThat(cells.get(1).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(CONSTANTE_2).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(CONSTANTE_3).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(CONSTANTE_4).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(CONSTANTE_5).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(CONSTANTE_7).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
            } else if (!("".equals(cells.get(1).getText()) || " ".equals(cells.get(1).getText()))) {
                boolean valido = cells.get(1).getText().equals(producto);
                MatcherAssert.assertThat(cells.get(1).getText(), Is.is(Matchers.equalTo(producto)));
                MatcherAssert.assertThat(cells.get(CONSTANTE_2).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(CONSTANTE_3).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(CONSTANTE_4).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(CONSTANTE_5).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(CONSTANTE_7).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
            }
        }
    }

    public void validarLabelsCotizaciones(Map<String, String> labelsCotizaciones) {
        String validacion = null;
        try {
            waitForTextToAppear("Cotizaciones de la cuenta");
            MatcherAssert.assertThat(lblCotizacionesCuenta.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("lblCotizaciones"))));
            MatcherAssert.assertThat(btnNuevaCotizacion.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("btnNuevaCotizacion"))));
            MatcherAssert.assertThat(colAcciones.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("acciones"))));
            MatcherAssert.assertThat(colProducto.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("producto"))));
            MatcherAssert.assertThat(colNumCotizacion.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("numCotizacion"))));
            MatcherAssert.assertThat(colTipoCotizacion.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("tipoCotizacion"))));
            MatcherAssert.assertThat(colFechaIniVigencia.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("fechaIniVigencia"))));
            MatcherAssert.assertThat(colFechaFinVigencia.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("fechaFinVigencia"))));
            MatcherAssert.assertThat(colNumeroPoliza.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("numPoliza"))));
            MatcherAssert.assertThat(colEstado.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("estado"))));
            MatcherAssert.assertThat(colCostoTotal.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("costoTotal"))));
            MatcherAssert.assertThat(colCartas.getText().toString(), Is.is(Matchers.equalTo(labelsCotizaciones.get("cartas"))));
        } catch (Exception e) {
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public void validarEstadoDiferenteExpedida(String estado) {

        Integer contador = 0;
        String expedida = "Expedida";
        String vacio = " ";

        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!vacio.equals(cells.get(CONSTANTE_2).getText()) && cells.get(CONSTANTE_7).getText().equals(expedida)) {
                MatcherAssert.assertThat(cells.get(CONSTANTE_6).getText(), Is.is(Matchers.notNullValue()));
            } else if (!vacio.equals(cells.get(CONSTANTE_2).getText()) && !expedida.equals(cells.get(CONSTANTE_7).getText())) {
                MatcherAssert.assertThat(cells.get(CONSTANTE_6).getText(), Is.is(Matchers.equalTo(vacio)));
            }
        }
    }

    public void validarNumeroPoliza() {

        Integer contador = 0;
        String expedida = "Expedida";

        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!(" ".equals(cells.get(CONSTANTE_2).getText()) && " ".equals(cells.get(CONSTANTE_6).getText())) && expedida.equals(cells.get(CONSTANTE_7).getText())) {
                contador++;
            }
        }
        MatcherAssert.assertThat(contador, Is.is(Matchers.greaterThan(0)));
    }

    public void validarEstadoCotizacionDeclinado(String propiedadComercial, String declinado) {
        boolean validacion = false;
        String excepcion = null;
        int i = 0;
        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!" ".equals(cells.get(CONSTANTE_2).getText())) {
                if (cells.get(1).getText().equals(propiedadComercial) && cells.get(CONSTANTE_7).getText().equals(declinado)) {
                    band = i;
                    break;
                }
                i++;
            }
        }
    }

    public void mostrarBotonCrearCartaDeclinacion(String crearCarta) {
        if (band != 0) {
            WebElementFacade botonCrearCartaDeclinacion = findBy(DECLINELETTER+band+":DeclineLetter']");
            MatcherAssert.assertThat(botonCrearCartaDeclinacion.getText(), Is.is(Matchers.equalTo(crearCarta)));
            band = 0;
        } else {
            MatcherAssert.assertThat(null, Is.is(Matchers.nullValue()));
        }
    }

    public void validarEstadoAutoPersonal(String producto) {
        MatcherAssert.assertThat(lblAutoPersonal.getText(), Is.is(Matchers.equalTo(producto)));
    }

    public void noMostrarBotonCrearCarta(String crearCarta) {
        MatcherAssert.assertThat(campoCartas.getText(), Is.is(Matchers.not(Matchers.equalTo(crearCarta))));
    }

    public void mostrarTodosLosProductos(String producto) {
        waitUntil(WAIT_TIME_1000);
        txtProductos.click();
        WebElementFacade cbxProducto = findBy(".//li[contains(.,'" + producto + "')]");
        waitUntil(WAIT_TIME_1000);
        cbxProducto.click();
        act.sendKeys(Keys.ENTER);
        waitUntil(WAIT_TIME_1500);
    }

    /**
     * Metodos Ingresados para re-usar el mismo Page.TEST_22266665}
     * Intervenido por: Jonathan Mejia Leon
     * Fecha de intervencion: 21/06/2016
     * Motivo: Uso del page para Administracion de cotización (Declinar-No Tomar)
     * Story usada: admon_cotizacion_cuenta.story
     */

    public void seleccionarAccionesDeclinar() {
        btnAcciones2.waitUntilVisible().waitUntilClickable().click();
        $(itmDeclinarComProp).waitUntilVisible().waitUntilClickable().click();
    }

    public void seleccionarAccionesNoTomar() {
        btnAccionesJ.waitUntilVisible().waitUntilClickable().click();
        $(itmNoTomarJ).waitUntilVisible().waitUntilClickable().click();
    }

    public void ingresaRechazo(String razon) {
        withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS).waitFor(txtCodRazon).shouldBeEnabled();
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
        withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS).waitFor(listaTipoRazonNoTomar).shouldBeEnabled();
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
        numerosCotizacion = withTimeoutOf(WAIT_TIME_1, TimeUnit.SECONDS).findAll(".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV-body']/div/table/tbody/tr/td[3]");
        return numerosCotizacion;
    }

    private List<WebElementFacade> getListaEstado() {
        List<WebElementFacade> numeroEstado;
        numeroEstado = withTimeoutOf(WAIT_TIME_1, TimeUnit.SECONDS).findAll(".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV-body']/div/table/tbody/tr/td[8]");
        return numeroEstado;
    }

    public void validaEstado(String numCotizacion, String accion) {
        int i = 0;
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
        if (!getListaCotizaciones().isEmpty()) {
            for (WebElementFacade cotizacion : getListaCotizaciones()) {
                if (numCotizacion.equals(cotizacion.getText())) {
                    MatcherAssert.assertThat("El estado no pertenece a la accion dada", accion.equals(getListaEstado().get(i).getText()));
                    break;
                }
                i++;
            }

        }
    }

    public void validaAccionDesabilita() {
        MatcherAssert.assertThat("Boton Acciones no esta presente", !btnAcciones2.isPresent());
    }

    public void validaAccionDesabilitaNoTomar() {
        MatcherAssert.assertThat("Boton Acciones no esta presente", !btnAccionesJ.isPresent());
    }

    public void validaMensaje(String mensaje) {
        waitFor(msg).waitUntilVisible();
        MatcherAssert.assertThat("Fallo mensaje en campo obligatorio RAZON", msg.containsText(mensaje));
        btnCancelar.click();
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
    }

    public void validaMensajeNoTomar(String mensaje) {
        waitFor(msgNoTomar).waitUntilVisible();
        MatcherAssert.assertThat("Fallo mensaje en campo obligatorio RAZON", msgNoTomar.containsText(mensaje));
        btnCancelarNoTomar.click();
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
    }

    public void validarOpcionesDeAgregar(ExamplesTable listaRazones) throws Exception {
        listaTipoRazon.click();
        this.validarDatosDeLaLista(listaRazones);
        btnCancelar.click();
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
    }

    public void validarOpcionesDeAgregarNoTomar(ExamplesTable listaRazones) throws Exception {
        listaTipoRazonNoTomar.click();
        this.validarDatosDeLaLista(listaRazones);
        btnCancelarNoTomar.click();
        waitFor(lblCotizacionesCuenta).waitUntilVisible();
    }

    public void validarTodasLasCotizaciones() {
        MatcherAssert.assertThat("No se pudieron visualizar las polizas", getListaCotizaciones().isEmpty());
    }

    private void validarDatosDeLaLista(ExamplesTable tipoCanal) throws Exception {
        List<WebElementFacade> elementosTipoCanalVentas;
        List<String> elementosRequeridos = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(tipoCanal);
        for (String tipo : elementosRequeridos) {
            elementosTipoCanalVentas = withTimeoutOf(WAIT_TIME_1, TimeUnit.SECONDS).findAll("//li[contains(.,'" + tipo + "')]");
            for (WebElementFacade lista : elementosTipoCanalVentas) {
                MatcherAssert.assertThat(tipo, Matchers.containsString(lista.getText()));
            }
        }
    }
}
