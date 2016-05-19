package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

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

    @FindBy(xpath="/*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:Producer-inputEl']")
    WebElementFacade txtAgente;

    @FindBy(xpath=".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:ProducerCode-inputEl']")
    WebElementFacade txtCodigoAgente;

    @FindBy(xpath=".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;

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

    public BusquedaDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        txtNumeroPoliza.waitUntilClickable();
        txtNumeroPoliza.clear();
        txtNumeroPoliza.sendKeys(buscarNumeroPoliza);
        btnBuscar.click();
    }

    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda){
        for (Map<String,String> row : resultadoBusqueda.getRows()) {
            assertThat(grdNumeroPoliza.getText(), containsText(row.get("numeroPoliza")));
            assertThat(grdAseguradoNombrado.getText(), containsText(row.get("nombreAsegurado")));
            assertThat(grdNumeroCuenta.getText(), containsText(row.get("numeroCuenta")));
            assertThat(grdProducto.getText(), containsText(row.get("producto")));
            assertThat(grdEstado.getText(), containsText(row.get("estado")));
            assertThat(grdFechaVigencia.getText(), is(notNullValue()));
            assertThat(grdFechaExpiracion.getText(), is(notNullValue()));
            assertThat(grdAgente.getText(), is(notNullValue()));
        }
    }
    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta) {
        txtNumeroCuenta.waitUntilClickable();
        txtNumeroCuenta.clear();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        btnBuscar.click();
    }


}
