package com.sura.policycenter.selenium.pages;


import com.sura.commons.selenium.Commons;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BusquedaDePolizaPage extends PageObject {

    Commons commons = new Commons(getDriver());

    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:PolicyNumberCriterion-inputEl']")
    WebElementFacade txtNumeroPoliza;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:AccountNumber-inputEl']")
    WebElementFacade txtNumeroCuenta;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:ProductName-inputEl']")
    WebElementFacade txtProducto;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:Producer-inputEl']")
    WebElementFacade txtAgente;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:ProducerCode-inputEl']")
    WebElementFacade txtCodigoAgente;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;
    @FindBy(xpath = ".//div[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV-body']/div/table")
    WebElementFacade tablaResultados;
    @FindBy(xpath = "//a[contains(text(),'TEST_22222222')]")
    WebElementFacade grdNumeroPoliza;
    @FindBy(xpath = "//td[4]/div")
    WebElementFacade grdAseguradoNombrado;
    @FindBy(xpath = "//td[6]/div")
    WebElementFacade grdProducto;
    @FindBy(xpath = "//td[7]/div")
    WebElementFacade grdEstado;
    @FindBy(xpath = "//td[8]/div")
    WebElementFacade grdFechaVigencia;
    @FindBy(xpath = "//td[9]/div")
    WebElementFacade grdFechaExpiracion;
    @FindBy(xpath = "//td[10]/div")
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

    public BusquedaDePolizaPage(WebDriver driver) {
        super(driver);
    }

    public void irABuscarPoliza() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(menuBuscar).waitUntilPresent();
        menuBuscar.click();
        waitForAnyTextToAppear("Buscar", "Búsqueda");
        if (!tituloBuscarPoliza.isVisible()) {
            menuBuscarPoliza.click();
            waitForTextToAppear("Buscar pólizas");
        }
    }

    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        this.limpiarCampos();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(txtNumeroPoliza).waitUntilPresent();
        txtNumeroPoliza.sendKeys(buscarNumeroPoliza);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(tablaResultados).waitUntilPresent();
        List<WebElement> allRows = tablaResultados.findElements(By.tagName("tr"));
        Map<String, String> sampleData = resultadoBusqueda.getRows().get(0);
        List<WebElement> celdas = allRows.get(this.encontrarPoliza(sampleData.get("numeroPoliza"), allRows)).findElements(By.tagName("td"));
        MatcherAssert.assertThat(celdas.get(2).getText(), Is.is(Matchers.equalTo(sampleData.get("numeroPoliza"))));
        MatcherAssert.assertThat(celdas.get(3).getText(), Is.is(Matchers.equalTo(sampleData.get("nombreAsegurado"))));
        MatcherAssert.assertThat(celdas.get(5).getText(), Is.is(Matchers.equalTo(sampleData.get("producto"))));
        MatcherAssert.assertThat(celdas.get(6).getText(), Is.is(Matchers.equalTo(sampleData.get("estado"))));
        MatcherAssert.assertThat(celdas.get(7).getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(celdas.get(8).getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(celdas.get(9).getText(), Is.is(Matchers.equalTo(sampleData.get("agente"))));

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            MatcherAssert.assertThat(cells.get(4).getText(), Is.is(Matchers.equalTo(sampleData.get("numeroCuenta"))));
        }
    }

    public Integer encontrarPoliza(String poliza, List<WebElement> filas) {
        Integer filaPoliza = 0;
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (poliza.equals(columna.get(2).getText())) {
                return filaPoliza;
            }
            filaPoliza++;
        }
        return filaPoliza;
    }

    public void limpiarCampos() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(botonRestablecer).waitUntilPresent();
        botonRestablecer.click();
        commons.waitUntil(3500);
    }

    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta) {
        this.limpiarCampos();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }


    public void validarMensajeDeConsultaSinResultados(String mensaje) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(msjValidacion).waitUntilPresent();
        MatcherAssert.assertThat(msjValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void buscarPolizaPorProducto(String producto) {
        this.limpiarCampos();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtProducto).waitUntilPresent();
        txtProducto.clear();
        txtProducto.sendKeys(producto);
        txtProducto.sendKeys(Keys.ENTER);
        waitFor(ExpectedConditions.elementToBeClickable(btnBuscar));
        btnBuscar.click();
    }

    public void buscarPolizaPorAgente(String agente) {
        this.limpiarCampos();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtAgente).waitUntilPresent();
        txtAgente.sendKeys(agente);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void buscarPolizaPorCodigoAgente(String codigoAgente) {
        this.limpiarCampos();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtCodigoAgente).waitUntilPresent();
        txtCodigoAgente.sendKeys(codigoAgente);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void buscarPolizaPorNumeroCuentaYProducto(String numeroCuenta, String producto) {
        this.limpiarCampos();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtProducto).waitUntilPresent();
        txtProducto.clear();
        txtProducto.sendKeys(producto);
        txtProducto.sendKeys(Keys.ENTER);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void buscarPorNumerocuentaYAgente(String numeroCuenta, String agente) {
        this.limpiarCampos();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        txtAgente.sendKeys(agente);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void buscarPolizaPorNumeroCuentaYCodigoAgente(String numeroCuenta, String codigoAgente) {
        this.limpiarCampos();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        txtCodigoAgente.sendKeys(codigoAgente);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void buscarPolizaPorNumeroCuentaYDosOpcionales(String numeroCuenta, String producto, String codigoAgente) {
        this.limpiarCampos();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        txtProducto.clear();
        txtProducto.sendKeys(producto);
        txtProducto.sendKeys(Keys.ENTER);
        txtCodigoAgente.sendKeys(codigoAgente);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }
}
