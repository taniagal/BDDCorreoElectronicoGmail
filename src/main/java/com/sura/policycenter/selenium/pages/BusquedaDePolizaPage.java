package com.sura.policycenter.selenium.pages;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class BusquedaDePolizaPage extends PageObject{

    @FindBy(xpath=".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:PolicyNumberCriterion-inputEl']")
    WebElementFacade txtNumeroPoliza;
    @FindBy(xpath=".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:AccountNumber-inputEl']")
    WebElementFacade txtNumeroCuenta;
    @FindBy(xpath=".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:ProductName-inputEl']")
    WebElementFacade txtProducto;
    @FindBy(xpath=".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:Producer-inputEl']")
    WebElementFacade txtAgente;
    @FindBy(xpath=".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:ProducerCode-inputEl']")
    WebElementFacade txtCodigoAgente;
    @FindBy(xpath=".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;
    @FindBy(xpath = ".//div[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV-body']/div/table")
    WebElementFacade tablaResultados;
    @FindBy(xpath="//a[contains(text(),'TEST_22222222')]")
    WebElementFacade grdNumeroPoliza;
    @FindBy(xpath="//td[4]/div")
    WebElementFacade grdAseguradoNombrado;
    @FindBy(xpath="//td[6]/div")
    WebElementFacade grdProducto;
    @FindBy(xpath="//td[7]/div")
    WebElementFacade grdEstado;
    @FindBy(xpath="//td[8]/div")
    WebElementFacade grdFechaVigencia;
    @FindBy(xpath="//td[9]/div")
    WebElementFacade grdFechaExpiracion;
    @FindBy(xpath="//td[10]/div")
    WebElementFacade grdAgente;
    @FindBy(xpath = "//div[@id='PolicySearch:PolicySearchScreen:_msgs']/div")
    WebElementFacade msjValidacion;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab']")
    WebElementFacade menuBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_PolicySearch']")
    WebElementFacade menuBuscarPoliza;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:ttlBar']")
    WebElementFacade tituloBuscarPoliza;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    WebElementFacade botonRestablecer;

    public BusquedaDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void irABuscarPoliza() {
        menuBuscar.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().click();
        waitForAnyTextToAppear("Buscar", "Búsqueda");
        if(!tituloBuscarPoliza.isVisible()){
            menuBuscarPoliza.click();
            waitForTextToAppear("Buscar pólizas");
        }
    }

    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        this.limpiarCampos();
        try {
            txtNumeroPoliza.sendKeys(buscarNumeroPoliza);
            btnBuscar.click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }

    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda) {
        try{
            tablaResultados.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
            List<WebElement> allRows = tablaResultados.findElements(By.tagName("tr"));
            Map<String, String> sampleData = resultadoBusqueda.getRows().get(0);
            MatcherAssert.assertThat(grdNumeroPoliza.getText(), Is.is(Matchers.equalTo(sampleData.get("numeroPoliza"))));
            MatcherAssert.assertThat(grdAseguradoNombrado.getText(), Is.is(Matchers.equalTo(sampleData.get("nombreAsegurado"))));
            MatcherAssert.assertThat(grdProducto.getText(), Is.is(Matchers.equalTo(sampleData.get("producto"))));
            MatcherAssert.assertThat(grdEstado.getText(), Is.is(Matchers.equalTo(sampleData.get("estado"))));
            MatcherAssert.assertThat(grdFechaVigencia.getText(), Is.is(Matchers.notNullValue()));
            MatcherAssert.assertThat(grdFechaExpiracion.getText(), Is.is(Matchers.notNullValue()));
            MatcherAssert.assertThat(grdAgente.getText(), Is.is(Matchers.equalTo(sampleData.get("agente"))));

            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                MatcherAssert.assertThat(cells.get(4).getText(), Is.is(Matchers.equalTo(sampleData.get("numeroCuenta"))));
            }
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }

    public void limpiarCampos(){
        try{
            botonRestablecer.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
        waitABit(1000);
    }

    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta) {
        this.limpiarCampos();
        try {
            txtNumeroCuenta.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().sendKeys(numeroCuenta);
            btnBuscar.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
            btnBuscar.click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }


    public void validarMensajeDeConsultaSinResultados(String mensaje) {
        msjValidacion.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
        MatcherAssert.assertThat(msjValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void buscarPolizaPorProducto(String producto) {
        this.limpiarCampos();
        try {
            txtProducto.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
            txtProducto.clear();
            txtProducto.sendKeys(producto);
            txtProducto.sendKeys(Keys.ENTER);
            waitFor(ExpectedConditions.elementToBeClickable(btnBuscar));
            btnBuscar.click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }

    public void buscarPolizaPorAgente(String agente) {
        this.limpiarCampos();
        try {
            txtAgente.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().sendKeys(agente);
            btnBuscar.click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }

    public void buscarPolizaPorCodigoAgente(String codigoAgente) {
        this.limpiarCampos();
        try{
            txtCodigoAgente.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().sendKeys(codigoAgente);
            btnBuscar.click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }

    public void buscarPolizaPorNumeroCuentaYProducto(String numeroCuenta, String producto) {
        this.limpiarCampos();
        try {
            txtNumeroCuenta.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().sendKeys(numeroCuenta);
            txtProducto.clear();
            txtProducto.sendKeys(producto);
            txtProducto.sendKeys(Keys.ENTER);
            btnBuscar.click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }

    public void buscarPorNumerocuentaYAgente(String numeroCuenta, String agente) {
        this.limpiarCampos();
        try {
            txtNumeroCuenta.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().sendKeys(numeroCuenta);
            txtAgente.sendKeys(agente);
            btnBuscar.click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }

    public void buscarPolizaPorNumeroCuentaYCodigoAgente(String numeroCuenta, String codigoAgente) {
        this.limpiarCampos();
        try{
            txtNumeroCuenta.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().sendKeys(numeroCuenta);
            txtCodigoAgente.sendKeys(codigoAgente);
            btnBuscar.click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }

    public void buscarPolizaPorNumeroCuentaYDosOpcionales(String numeroCuenta, String producto, String codigoAgente) {
        this.limpiarCampos();
        try{
            txtNumeroCuenta.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().sendKeys(numeroCuenta);
            txtProducto.clear();
            txtProducto.sendKeys(producto);
            txtProducto.sendKeys(Keys.ENTER);
            txtCodigoAgente.sendKeys(codigoAgente);
            btnBuscar.click();
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }
}
