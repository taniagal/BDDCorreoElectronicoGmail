package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.serinitybdd.util.GwNavegacionUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.List;

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

    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda) throws Exception{
        List<String> datosAValidar = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(resultadoBusqueda);
    }
    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta) {
        txtNumeroCuenta.waitUntilClickable();
        txtNumeroCuenta.clear();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        btnBuscar.click();
    }


}
