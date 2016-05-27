package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import java.util.List;
import java.util.Map;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
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

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuItemSet:Decline-textEl']")
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

    @FindBy(xpath = "//tr[9]/td[2]/div/span[2]")
    private WebElementFacade lblPropiedadComercialDeclinado;

    @FindBy(xpath = "//tr[9]/td[8]/div")
    private WebElementFacade lblDeclinado;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:4:DeclineLetter']")
    private WebElementFacade btnCrearCartaDeclinacion;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:0:SubmissionProduct']")
    private WebElementFacade lblAutoPersonal;

    @FindBy(xpath = "//tbody/tr/td[10]/div")
    private WebElementFacade campoCartas;

    public OpcionesAdminitradorCotizaciones(WebDriver driver) {
        super(driver);
    }

    public void seleccionarAcciones(){
        waitABit(1000);
        btnAcciones.click();
    }

    public void validarEstadosCotizacion(String estadoDeclinar, String estadoNoTomar){
        assertThat(itmDeclinar.getText(), is(equalTo(estadoDeclinar)));
        assertThat(itmNoTomar.getText(), is(equalTo(estadoNoTomar)));
    }

    public void crearNuevaCotizacion() {
        waitABit(1000);
        btnNuevaCotizacion.click();
    }

    public void validarCreacionCotizacion(){
        waitABit(1000);
        boolean validacion = false;
        if(lblEnviosNuevos.isPresent() && lblOrganizacion.isPresent()){
            validacion = true;
        }
        assertTrue(validacion);
    }

    public void validarOpcionRetirar(String retirar){
        Boolean validacion = false;
        validacion = lstAcciones.containsElements(retirar);
        assertFalse(validacion);
    }

    public void seleccionarFiltros(String cotizacion, String producto){
        waitABit(1000);
        txtCotizaciones.click();
        WebElementFacade cbxCotizacion = findBy(".//li[contains(.,'"+cotizacion+"')]");
        waitABit(1000);
        cbxCotizacion.click();

        waitABit(1000);
        txtProductos.click();
        WebElementFacade cbxProducto = findBy(".//li[contains(.,'"+producto+"')]");
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
            if(tProductos.equals(producto) && !(" ".equals(cells.get(1).getText()))) {
                assertThat(cells.get(1).getText(), is(not(equalTo(null))));
                assertThat(cells.get(2).getText(), is(not(equalTo(null))));
                assertThat(cells.get(3).getText(), is(not(equalTo(null))));
                assertThat(cells.get(4).getText(), is(not(equalTo(null))));
                assertThat(cells.get(5).getText(), is(not(equalTo(null))));
                assertThat(cells.get(7).getText(), is(not(equalTo(null))));
            } else if(!(" ".equals(cells.get(1).getText()))){
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
            assertThat(lblCotizacionesCuenta.getText().toString(),is(equalTo(labelsCotizaciones.get("lblCotizaciones"))));
            assertThat(btnNuevaCotizacion.getText().toString(),is(equalTo(labelsCotizaciones.get("btnNuevaCotizacion"))));
            assertThat(colAcciones.getText().toString(),is(equalTo(labelsCotizaciones.get("acciones"))));
            assertThat(colProducto.getText().toString(),is(equalTo(labelsCotizaciones.get("producto"))));
            assertThat(colNumCotizacion.getText().toString(),is(equalTo(labelsCotizaciones.get("numCotizacion"))));
            assertThat(colTipoCotizacion.getText().toString(),is(equalTo(labelsCotizaciones.get("tipoCotizacion"))));
            assertThat(colFechaIniVigencia.getText().toString(),is(equalTo(labelsCotizaciones.get("fechaIniVigencia"))));
            assertThat(colFechaFinVigencia.getText().toString(),is(equalTo(labelsCotizaciones.get("fechaFinVigencia"))));
            assertThat(colNumeroPoliza.getText().toString(),is(equalTo(labelsCotizaciones.get("numPoliza"))));
            assertThat(colEstado.getText().toString(),is(equalTo(labelsCotizaciones.get("estado"))));
            assertThat(colCostoTotal.getText().toString(),is(equalTo(labelsCotizaciones.get("costoTotal"))));
            assertThat(colCartas.getText().toString(),is(equalTo(labelsCotizaciones.get("cartas"))));
        } catch(InterruptedException e) {
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

        if("Expedida".equals(estado)){
            assertThat(contador,is(equalTo(2)));
        }else if (!"Expedida".equals(estado)){
            assertThat(contador,is(equalTo(1)));
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
        assertThat(contador,is(equalTo(2)));
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
        WebElementFacade cbxProducto = findBy(".//li[contains(.,'"+producto+"')]");
        waitABit(1000);
        cbxProducto.click();
        act.sendKeys(Keys.ENTER);
        waitABit(1500);
    }
}
