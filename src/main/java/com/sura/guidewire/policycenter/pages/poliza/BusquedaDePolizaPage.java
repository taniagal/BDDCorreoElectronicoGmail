package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;


public class BusquedaDePolizaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:PolicyNumberCriterion-inputEl']")
    WebElementFacade txtNumeroPoliza;
    @FindBy(xpath = ".//*[contains(@id, 'PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:AccountNumber-inputEl')]")
    WebElementFacade txtNumeroCuenta;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:ProductName-inputEl']")
    WebElementFacade txtProducto;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:Producer-inputEl']")
    WebElementFacade txtAgente;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:ProducerCode-inputEl']")
    WebElementFacade txtCodigoAgente;
    @FindBy(xpath = ".//*[contains(@id,'PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search')]")
    WebElementFacade btnBuscar;
    @FindBy(xpath = ".//div[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV-body']/div/table")
    WebElementFacade tablaResultados;
    @FindBy(xpath = "//div[contains(@id, '_msgs')]/div")
    WebElementFacade msjValidacion;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab']")
    WebElementFacade menuBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_PolicySearch']")
    WebElementFacade menuBuscarPoliza;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:ttlBar']")
    WebElementFacade tituloBuscarPoliza;
    @FindBy(xpath = ".//*[contains(@id,'PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset')]")
    WebElementFacade botonRestablecer;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    WebElementFacade numPoliza;
    @FindBy(xpath = ".//*[@id='PolicySearchPopup:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV:0:_Select']")
    WebElementFacade linkBotonNumeroPolizaEncontrada;


    protected static final int TIEMPO_3500 = 3500;
    protected static final int CONSTANTE_10 = 10;
    protected static final int CONSTANTE_9 = 9;
    protected static final int CONSTANTE_8 = 8;
    protected static final int CONSTANTE_7 = 7;
    protected static final int CONSTANTE_6 = 6;
    protected static final int CONSTANTE_5 = 5;
    protected static final int CONSTANTE_4 = 4;
    protected static final int CONSTANTE_3 = 3;
    protected static final int CONSTANTE_2 = 2;
    protected static final int CONSTANTE_1 = 1;

    public BusquedaDePolizaPage(WebDriver driver) {
        super(driver);
    }

    public void irABuscarPoliza() {
        waitFor(menuBuscar).waitUntilPresent();
        menuBuscar.click();
        waitForAnyTextToAppear("Buscar", "Búsqueda");
        if (!tituloBuscarPoliza.isVisible()) {
            menuBuscarPoliza.click();
            waitForTextToAppear("Buscar pólizas");
        }
        this.limpiarCampos();
    }

    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        this.limpiarCampos();
        waitFor(txtNumeroPoliza).waitUntilPresent();
        txtNumeroPoliza.sendKeys(buscarNumeroPoliza);
        this.clicEnBotonBuscar();
    }

    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda) {
        waitFor(tablaResultados).waitUntilPresent();
        List<WebElement> allRows = tablaResultados.findElements(By.tagName("tr"));
        Map<String, String> sampleData = resultadoBusqueda.getRows().get(0);
        List<WebElement> celdas = allRows.get(this.encontrarPoliza(sampleData.get("numeroPoliza"), allRows)).findElements(By.tagName("td"));
        MatcherAssert.assertThat(celdas.get(CONSTANTE_2).getText(), Is.is(Matchers.equalTo(sampleData.get("tipoPoliza"))));
        MatcherAssert.assertThat(celdas.get(CONSTANTE_3).getText(), Is.is(Matchers.equalTo(sampleData.get("numeroPoliza"))));
        MatcherAssert.assertThat(celdas.get(CONSTANTE_4).getText(), Is.is(Matchers.equalTo(sampleData.get("nombreAsegurado"))));
        MatcherAssert.assertThat(celdas.get(CONSTANTE_6).getText(), Is.is(Matchers.equalTo(sampleData.get("producto"))));
        MatcherAssert.assertThat(celdas.get(CONSTANTE_8).getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(celdas.get(CONSTANTE_9).getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(celdas.get(CONSTANTE_7).getText(), Is.is(Matchers.equalTo(sampleData.get("estado"))));
        MatcherAssert.assertThat(celdas.get(CONSTANTE_10).getText(), Is.is(Matchers.equalTo(sampleData.get("agente"))));

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            MatcherAssert.assertThat(cells.get(CONSTANTE_5).getText(), Is.is(Matchers.equalTo(sampleData.get("numeroCuenta"))));
        }
    }

    public Integer encontrarPoliza(String poliza, List<WebElement> filas) {
        Integer filaPoliza = 0;
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (poliza.equals(columna.get(CONSTANTE_3).getText())) {
                return filaPoliza;
            }
            filaPoliza++;
        }
        return filaPoliza;
    }

    public void limpiarCampos() {
        esperarHasta(TIEMPO_3500);
        waitFor(botonRestablecer).waitUntilPresent();
        botonRestablecer.click();
        esperarHasta(TIEMPO_3500);
    }

    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta) {
        this.limpiarCampos();
        waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        this.clicEnBotonBuscar();
    }

    public void buscarPolizaPorNumeroDeCuentaSeleccionar(String numeroCuenta) {
        this.limpiarCampos();
        waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        this.clicEnBotonBuscar();
        WebElementFacade linkNumeroPoliza = getElemento(".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV:0:PolicyNumber']");
        clicObjeto(linkNumeroPoliza);
        esperarObjetoClikeableServidor(".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:0']");
    }

    public void seleccionarNumeroPolizaEcontrada() {
        clicObjeto(linkBotonNumeroPolizaEncontrada);
    }

    public void clicEnBotonBuscar(){
        waitFor(btnBuscar).waitUntilPresent().waitUntilClickable();
        clickearElemento(btnBuscar);
    }


    public void validarMensajeDeConsultaSinResultados(String mensaje) {
        waitFor(msjValidacion).waitUntilPresent();
        MatcherAssert.assertThat(msjValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void buscarPolizaPorProducto(String producto) {
        this.limpiarCampos();
        this.ingresarDatoEnCampoProducto(producto);
        this.clicEnBotonBuscar();
    }

    public void ingresarDatoEnCampoProducto(String producto){
        waitFor(txtProducto).waitUntilPresent();
        txtProducto.clear();
        txtProducto.sendKeys(producto);
        txtProducto.sendKeys(Keys.ENTER);
    }

    public void buscarPolizaPorAgente(String agente) {
        this.limpiarCampos();
        waitFor(txtAgente).waitUntilPresent();
        txtAgente.sendKeys(agente);
        this.clicEnBotonBuscar();
    }

    public void buscarPolizaPorCodigoAgente(String codigoAgente) {
        this.limpiarCampos();
        waitFor(txtCodigoAgente).waitUntilPresent();
        txtCodigoAgente.sendKeys(codigoAgente);
        this.clicEnBotonBuscar();
    }

    public void buscarPolizaPorNumeroCuentaYProducto(String numeroCuenta, String producto) {
        this.limpiarCampos();
        waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        this.ingresarDatoEnCampoProducto(producto);
        this.clicEnBotonBuscar();
    }

    public void buscarPorNumerocuentaYAgente(String numeroCuenta, String agente) {
        this.limpiarCampos();
        waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        txtAgente.sendKeys(agente);
        this.clicEnBotonBuscar();
    }

    public void buscarPolizaPorNumeroCuentaYCodigoAgente(String numeroCuenta, String codigoAgente) {
        this.limpiarCampos();
        waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        txtCodigoAgente.sendKeys(codigoAgente);
        this.clicEnBotonBuscar();
    }

    public void buscarPolizaPorNumeroCuentaYDosOpcionales(String numeroCuenta, String producto, String codigoAgente) {
        this.limpiarCampos();
        waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        this.ingresarDatoEnCampoProducto(producto);
        txtCodigoAgente.sendKeys(codigoAgente);
        this.clicEnBotonBuscar();
    }
    public void buscarNumeroDePoliza(){
        String poliza = Utils.quitaCaracteresACadena(numPoliza);
        irABuscarPoliza();
        buscarPolizaPorNumeroDePoliza(poliza);

    }

    public String capturarNumeroPoliza () {
        return Utils.quitaCaracteresACadena(numPoliza);
    }
}