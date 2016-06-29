package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;

import java.security.Key;
import java.util.List;
import java.util.Map;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import static java.util.concurrent.TimeUnit.SECONDS;

public class OpcionesAdminitradorCotizaciones extends Guidewire {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesAdminitradorCotizaciones.class);

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

    private int band=0;

    public OpcionesAdminitradorCotizaciones(WebDriver driver) {
        super(driver);
    }

    public void seleccionarAcciones(){
        band=0;
        int i=0;
        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if(!(cells.get(2).getText().equals("") || cells.get(2).getText().equals(" "))) {
                if ((cells.get(7).getText().equals("Cotizado") || cells.get(7).getText().equals("Borrador")) && band==0) {
                    WebElementFacade botonAccciones = findBy(".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:" + i + ":SubmissionActions:SubmissionActionsMenuIcon']");
                    botonAccciones.click();
                    band=i;
                }
                i++;
            }
        }
    }

    public void validarEstadosCotizacion(String estadoDeclinar, String estadoNoTomar){
        if(band!=0){
            WebElementFacade itemDeclinar = findBy(".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:"+band+":SubmissionActions:SubmissionActionsMenuItemSet:Decline-itemEl']");
            WebElementFacade itemNoTomar  = findBy(".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:"+band+":SubmissionActions:SubmissionActionsMenuItemSet:NotTakenJob-itemEl']");
            MatcherAssert.assertThat(itemDeclinar.getText(), Is.is(Matchers.equalTo(estadoDeclinar)));
            MatcherAssert.assertThat(itemNoTomar.getText(), Is.is(Matchers.equalTo(estadoNoTomar)));
        }else{
            MatcherAssert.assertThat(null, Is.is(Matchers.nullValue()));
        }
    }

    public void crearNuevaCotizacion() {
        waitForTextToAppear("Cotizaciones de la cuenta", 1000);
        btnNuevaCotizacion.click();
    }

    public void validarCreacionCotizacion(){
        waitForTextToAppear("Nueva cotización", 1000);
        boolean validacion = false;
        if(labelCodigoAgente.isPresent() && labelNombreAgente.isPresent()){
            validacion = true;
        }
        MatcherAssert.assertThat(validacion,Is.is(true));
    }

    public void validarOpcionRetirar(String retirar){
        Boolean validacion = false;
        WebElementFacade listaAcciones = findBy(".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:"+band+":SubmissionActions:SubmissionActionsMenuIcon-fieldMenu']");
        validacion = listaAcciones.containsElements(retirar);
        MatcherAssert.assertThat(validacion,Is.is(false));
    }

    public void seleccionarFiltros(String cotizacion, String producto){
        waitForTextToAppear("Cotizaciones de la cuenta",1000);
        waitFor(txtCotizaciones).shouldBeVisible();
        txtCotizaciones.click();
        WebElementFacade cbxCotizacion = findBy(".//li[contains(.,'"+cotizacion+"')]");
        waitForTextToAppear(cotizacion,1000);
        waitFor(cbxCotizacion).shouldBeVisible();
        cbxCotizacion.click();
        waitFor(txtProductos).shouldBeVisible();
        txtProductos.click();
        WebElementFacade cbxProducto = findBy(".//li[contains(.,'"+producto+"')]");
        waitForTextToAppear(producto,1000);
        waitFor(cbxProducto).shouldBeVisible();
        cbxProducto.click();
        act.sendKeys(Keys.ENTER);
    }

    public void mostrarInfoCotizacion(String producto) {
        waitForTextToAppear(producto,2000);
        String tProductos = "Todos Los Productos";
        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if(tProductos.equals(producto) && !(cells.get(1).getText().equals("") || cells.get(1).getText().equals(" "))){
                MatcherAssert.assertThat(cells.get(1).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(2).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(3).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(4).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(5).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(7).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
            } else if(!(cells.get(1).getText().equals("") || cells.get(1).getText().equals(" "))){
                boolean valido = cells.get(1).getText().equals(producto);
                MatcherAssert.assertThat(cells.get(1).getText(), Is.is(Matchers.equalTo(producto)));
                MatcherAssert.assertThat(cells.get(2).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(3).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(4).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(5).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(7).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
            }
        }
    }

    public void validarLabelsCotizaciones(Map<String, String> labelsCotizaciones) {
        String validacion = null;
        try {
            waitForTextToAppear("Cotizaciones de la cuenta",1000);
            MatcherAssert.assertThat(lblCotizacionesCuenta.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("lblCotizaciones"))));
            MatcherAssert.assertThat(btnNuevaCotizacion.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("btnNuevaCotizacion"))));
            MatcherAssert.assertThat(colAcciones.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("acciones"))));
            MatcherAssert.assertThat(colProducto.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("producto"))));
            MatcherAssert.assertThat(colNumCotizacion.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("numCotizacion"))));
            MatcherAssert.assertThat(colTipoCotizacion.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("tipoCotizacion"))));
            MatcherAssert.assertThat(colFechaIniVigencia.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("fechaIniVigencia"))));
            MatcherAssert.assertThat(colFechaFinVigencia.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("fechaFinVigencia"))));
            MatcherAssert.assertThat(colNumeroPoliza.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("numPoliza"))));
            MatcherAssert.assertThat(colEstado.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("estado"))));
            MatcherAssert.assertThat(colCostoTotal.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("costoTotal"))));
            MatcherAssert.assertThat(colCartas.getText().toString(),Is.is(Matchers.equalTo(labelsCotizaciones.get("cartas"))));
        } catch(Exception e) {
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
            if(!vacio.equals(cells.get(2).getText()) && cells.get(7).getText().equals(expedida)){
                MatcherAssert.assertThat(cells.get(6).getText(),Is.is(Matchers.notNullValue()));
            }else if(!vacio.equals(cells.get(2).getText()) && !expedida.equals(cells.get(7).getText())){
                MatcherAssert.assertThat(cells.get(6).getText(),Is.is(Matchers.equalTo(vacio)));
            }
        }
    }

    public void validarNumeroPoliza() {

        Integer contador = 0;
        String expedida = "Expedida";

        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!(" ".equals(cells.get(2).getText()) && " ".equals(cells.get(6).getText())) && expedida.equals(cells.get(7).getText())) {
                contador++;
            }
        }
        MatcherAssert.assertThat(contador,Is.is(Matchers.equalTo(1)));
    }

    public void validarEstadoCotizacionDeclinado(String propiedadComercial, String declinado) {
        boolean validacion = false;
        String excepcion = null;
        int i=0;
        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if(!cells.get(2).getText().equals(" ")) {
                if (cells.get(1).getText().equals(propiedadComercial) && cells.get(7).getText().equals(declinado)) {
                    band=i;
                }
                i++;
            }
        }
    }

    public void mostrarBotonCrearCartaDeclinacion(String crearCarta) {
        if(band!=0){
            WebElementFacade botonCrearCartaDeclinacion = findBy(".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:"+band+":DeclineLetter']");
            MatcherAssert.assertThat(botonCrearCartaDeclinacion.getText(), Is.is(Matchers.equalTo(crearCarta)));
            band=0;
        }else{
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
        waitABit(1000);
        txtProductos.click();
        WebElementFacade cbxProducto = findBy(".//li[contains(.,'"+producto+"')]");
        waitABit(1000);
        cbxProducto.click();
        act.sendKeys(Keys.ENTER);
        waitABit(1500);
    }
}