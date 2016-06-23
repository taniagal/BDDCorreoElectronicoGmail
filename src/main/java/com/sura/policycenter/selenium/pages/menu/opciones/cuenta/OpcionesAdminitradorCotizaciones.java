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
    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuIcon']")
    private WebElementFacade btnAcciones;
    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuItemSet:Decline-textEl']")
    private WebElementFacade itmDeclinar;
    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuItemSet:NotTakenJob-textEl']")
    private WebElementFacade itmNoTomar;
    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManager_NewSubmission-btnInnerEl']")
    private WebElementFacade btnNuevaCotizacion;
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
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-labelEl']")
    private WebElementFacade labelNombreAgente;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-labelEl']")
    private WebElementFacade labelCodigoAgente;

    public OpcionesAdminitradorCotizaciones(WebDriver driver) {
        super(driver);
    }

    public void seleccionarAcciones(){
        waitForTextToAppear("Cotizaciones de la cuenta", 1500);
        btnAcciones.click();
    }

    public void validarEstadosCotizacion(String estadoDeclinar, String estadoNoTomar){
        MatcherAssert.assertThat(itmDeclinar.getText(), Is.is(Matchers.equalTo(estadoDeclinar)));
        MatcherAssert.assertThat(itmNoTomar.getText(), Is.is(Matchers.equalTo(estadoNoTomar)));
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
        validacion = lstAcciones.containsElements(retirar);
        MatcherAssert.assertThat(validacion,Is.is(false));
    }

    public void seleccionarFiltros(String cotizacion, String producto){
        //waitABit(1000);
        waitForTextToAppear("Cotizaciones de la cuenta",1000);
        waitFor(txtCotizaciones).shouldBeVisible();
        txtCotizaciones.click();
        WebElementFacade cbxCotizacion = findBy(".//li[contains(.,'"+cotizacion+"')]");
        //waitABit(1000);
        waitForTextToAppear(cotizacion,1000);
        waitFor(cbxCotizacion).shouldBeVisible();
        cbxCotizacion.click();

        //waitABit(1000);
        //waitForTextToAppear("Todos los productos",1000);
        waitFor(txtProductos).shouldBeVisible();
        txtProductos.click();
        WebElementFacade cbxProducto = findBy(".//li[contains(.,'"+producto+"')]");
        //waitABit(1000);
        waitForTextToAppear(producto,1000);
        waitFor(cbxProducto).shouldBeVisible();
        cbxProducto.click();
        act.sendKeys(Keys.ENTER);
        //waitABit(1500);
    }

    public void mostrarInfoCotizacion(String producto) {
        String tProductos = "Todos Los Productos";
        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if(tProductos.equals(producto) && !(" ".equals(cells.get(1).getText()))) {
                MatcherAssert.assertThat(cells.get(1).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(2).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(3).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(4).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(5).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
                MatcherAssert.assertThat(cells.get(7).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
            } else if(!(" ".equals(cells.get(1).getText()))){
                boolean valido = cells.get(1).getText().equals(producto);
                MatcherAssert.assertThat(cells.get(1).getText(), Is.is(Matchers.not(Matchers.equalTo(null))));
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

        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!" ".equals(cells.get(2).getText()) && cells.get(7).getText().equals(estado)) {
                contador++;
            }
        }

        if(expedida.equals(estado)){
            MatcherAssert.assertThat(contador,Is.is(Matchers.greaterThan(0)));
        }else {
            MatcherAssert.assertThat(contador,Is.is(Matchers.greaterThan(0)));
        }
    }

    public void validarNumeroPoliza() {

        Integer contador = 0;
        String expedida = "Expedida";

        List<WebElement> allRows = tblCotizaciones.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!" ".equals(cells.get(2).getText()) && !" ".equals(cells.get(6).getText()) && expedida.equals(cells.get(7).getText())) {
                contador++;
            }
        }
        MatcherAssert.assertThat(contador,Is.is(Matchers.equalTo(1)));
    }

    public void validarEstadoCotizacionDeclinado(String propiedadComercial, String declinado) {

        MatcherAssert.assertThat(lblPropiedadComercialDeclinado.getText(), Is.is(Matchers.equalTo(propiedadComercial)));
        MatcherAssert.assertThat(lblDeclinado.getText(), Is.is(Matchers.equalTo(declinado)));

    }

    public void mostrarBotonCrearCartaDeclinacion(String crearCarta) {
        MatcherAssert.assertThat(btnCrearCartaDeclinacion.getText(), Is.is(Matchers.equalTo(crearCarta)));
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
