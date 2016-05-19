package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

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

    @FindBy(xpath="//td[5]/div")
    WebElementFacade grdNumeroCuenta;

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

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BusquedaDePolizaPage.class);

    public BusquedaDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        this.limpiarCampos();
        txtNumeroPoliza.sendKeys(buscarNumeroPoliza);
        btnBuscar.click();
    }

    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda){
        List<WebElement> allRows = tablaResultados.findElements(By.tagName("tr"));
        try {
        for (Map<String,String> row : resultadoBusqueda.getRows()) {
            for (WebElement row2 : allRows) {
                List<WebElement> cells = row2.findElements(By.tagName("td"));
                System.out.println("Celda 2" + cells.get(2).getText());
                assertThat(cells.get(2).getText(), containsText(row.get("numeroPoliza")));
                assertThat(grdAseguradoNombrado.getText(), containsText(row.get("nombreAsegurado")));
                assertThat(grdNumeroCuenta.getText(), containsText(row.get("numeroCuenta")));
                assertThat(grdProducto.getText(), containsText(row.get("producto")));
                assertThat(grdEstado.getText(), containsText(row.get("estado")));
                assertThat(grdFechaVigencia.getText(), is(notNullValue()));
                assertThat(grdFechaExpiracion.getText(), is(notNullValue()));
                assertThat(grdAgente.getText(), containsText(row.get("agente")));
            }
        }
        }catch(Exception e) {
            LOGGER.error("This is error", e);
        }
    }

    public void limpiarCampos(){
        waitABit(2000);
        txtNumeroPoliza.waitUntilEnabled();
        txtNumeroPoliza.clear();
        txtNumeroCuenta.waitUntilEnabled();
        txtNumeroCuenta.clear();
        waitABit(2000);
    }

    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta) {
        this.limpiarCampos();
        txtNumeroCuenta.sendKeys(numeroCuenta);
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
        txtProducto.clear();
        txtProducto.sendKeys("<ninguno>");
        txtProducto.sendKeys(Keys.ENTER);
        txtNumeroCuenta.sendKeys(numeroCuenta);
        waitABit(2000);
        txtAgente.sendKeys(agente);
        btnBuscar.click();
    }

    public void buscarPolizaPorNumeroCuentaYCodigoAgente(String numeroCuenta, String codigoAgente) {
        this.limpiarCampos();
        txtAgente.clear();
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
