package com.sura.policycenter.selenium.pages;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.List;
import java.util.Map;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class BusquedaDePolizaPage extends Guidewire{

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

    public BusquedaDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        this.limpiarCampos();
        txtNumeroPoliza.sendKeys(buscarNumeroPoliza);
        btnBuscar.click();
    }

    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda) {
        waitABit(2000);
        tablaResultados.waitUntilClickable();
        List<WebElement> allRows = tablaResultados.findElements(By.tagName("tr"));
        Map<String, String> sampleData = resultadoBusqueda.getRows().get(0);
        assertThat(grdNumeroPoliza.getText(), is(equalTo(sampleData.get("numeroPoliza"))));
        assertThat(grdAseguradoNombrado.getText(), is(equalTo(sampleData.get("nombreAsegurado"))));
        assertThat(grdProducto.getText(), is(equalTo(sampleData.get("producto"))));
        assertThat(grdEstado.getText(), is(equalTo(sampleData.get("estado"))));
        assertThat(grdFechaVigencia.getText(), is(notNullValue()));
        assertThat(grdFechaExpiracion.getText(), is(notNullValue()));
        assertThat(grdAgente.getText(), is(equalTo(sampleData.get("agente"))));

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            assertThat(cells.get(4).getText(), is(equalTo(sampleData.get("numeroCuenta"))));
        }
    }

    public void limpiarCampos(){
        waitABit(2000);
        txtNumeroPoliza.waitUntilClickable();
        txtNumeroPoliza.clear();
        txtNumeroCuenta.waitUntilClickable();
        txtNumeroCuenta.clear();
        txtAgente.clear();
        txtCodigoAgente.clear();
        waitABit(2000);
    }

    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta) {
        this.limpiarCampos();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        btnBuscar.waitUntilClickable();
        btnBuscar.click();
    }


    public void validarMensajeDeConsultaSinResultados(String mensaje) {
        msjValidacion.waitUntilVisible();
        assertThat(msjValidacion.getText(), is(equalTo(mensaje)));
    }

    public void limpiarCampoProducto(){
        txtProducto.waitUntilClickable();
        txtProducto.clear();
        txtProducto.sendKeys("<ninguno>");
        txtProducto.sendKeys(Keys.ENTER);
    }

    public void buscarPolizaPorProducto(String producto) {
        this.limpiarCampos();
        txtProducto.waitUntilClickable();
        txtProducto.clear();
        txtProducto.sendKeys(producto);
        txtProducto.sendKeys(Keys.ENTER);
        waitABit(2000);
        btnBuscar.click();
    }

    public void buscarPolizaPorAgente(String agente) {
        this.limpiarCampos();
        this.limpiarCampoProducto();
        txtAgente.sendKeys(agente);
        btnBuscar.click();
    }

    public void buscarPolizaPorCodigoAgente(String codigoAgente) {
        this.limpiarCampos();
        this.limpiarCampoProducto();
        txtCodigoAgente.sendKeys(codigoAgente);
        btnBuscar.click();
    }

    public void buscarPolizaPorNumeroCuentaYProducto(String numeroCuenta, String producto) {
        this.limpiarCampos();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        txtProducto.clear();
        txtProducto.sendKeys(producto);
        txtProducto.sendKeys(Keys.ENTER);
        btnBuscar.click();
    }

    public void buscarPorNumerocuentaYAgente(String numeroCuenta, String agente) {
        this.limpiarCampos();
        this.limpiarCampoProducto();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        waitABit(2000);
        txtAgente.sendKeys(agente);
        btnBuscar.click();
    }

    public void buscarPolizaPorNumeroCuentaYCodigoAgente(String numeroCuenta, String codigoAgente) {
        this.limpiarCampos();
        this.limpiarCampoProducto();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        txtCodigoAgente.sendKeys(codigoAgente);
        btnBuscar.click();
    }

    public void buscarPolizaPorNumeroCuentaYDosOpcionales(String numeroCuenta, String producto, String codigoAgente) {
        this.limpiarCampos();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        txtProducto.clear();
        txtProducto.sendKeys(producto);
        txtProducto.sendKeys(Keys.ENTER);
        txtCodigoAgente.sendKeys(codigoAgente);
        btnBuscar.click();
    }
}
