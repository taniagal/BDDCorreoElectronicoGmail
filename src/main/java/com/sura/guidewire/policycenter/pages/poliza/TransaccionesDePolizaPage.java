package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TransaccionesDePolizaPage extends PageUtil{

    @FindBy(xpath = ".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Jobs']/div/span")
    private WebElementFacade menuTransaccionesPoliza;
    @FindBy(xpath = ".//*[@id='PolicyFile_Jobs:Policy_JobsScreen:jobNumberToFilter-inputEl']")
    private WebElementFacade campoNumeroTransaccion;
    @FindBy(xpath = ".//td/div/table/tbody/tr[4]/td")
    private WebElementFacade columnaNumeroTransaccion;
    @FindBy(xpath = ".//*[@id='PolicyFile_Jobs:Policy_JobsScreen:DetailPanel:Policy_JobInfoDV:PeriodEffDate-inputEl']")
    private WebElementFacade campoFechaVigencia;
    @FindBy(xpath = ".//*[@id='PolicyFile_Jobs:Policy_JobsScreen:DetailPanel:Policy_JobInfoDV:CloseDate-inputEl']")
    private WebElementFacade campoFechaExpedicion;
    @FindBy(xpath = "//div[2]/div/div/div/div/span/div")
    private WebElementFacade cajaChequeoTransaccion;
    @FindBy(xpath = ".//*[@id='PolicyFile_Jobs:Policy_JobsScreen:DetailPanel:JobsLV_tb:Policy_Jobs_DiffButton-btnInnerEl']")
    private WebElementFacade botonComparar;
    @FindBy(xpath = ".//div/div/div[2]/div/span")
    private WebElementFacade campoCotizacion;
    @FindBy(xpath = ".//div/div/div[3]/div/span")
    private WebElementFacade campoCambioPoliza;

    public TransaccionesDePolizaPage (WebDriver driver) {
        super(driver);
    }

    public void irATransaccionesDePoliza() {
        esperarYClickearBoton(menuTransaccionesPoliza);
    }

    public void consultarTransaccionesDePolizaPorNumero(String numeroTransaccion) {
        ingresarDato(campoNumeroTransaccion, numeroTransaccion);
        clickearElemento(columnaNumeroTransaccion);
    }

    public boolean validarDetalleTransaccion() {
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(campoFechaVigencia).shouldBeCurrentlyVisible();
        if("null".equals(campoFechaVigencia.getText()) && "null".equals(campoFechaExpedicion.getText())) {
            return false;
        }else{
            return true;
        }
    }

    public void seleccionarTransacciones() {
        clickearElemento(cajaChequeoTransaccion);
    }

    public void compararTransacciones() {
        clickearElemento(botonComparar);
    }

    public boolean validarDiferenciasTransacciones(String cotizacion, String cambioPoliza){
        waitForTextToAppear("Diferencias entre transacciones");
        boolean datosIguales = false;
        setImplicitTimeout(TIEMPO_10, TimeUnit.SECONDS);
        if(cotizacion.equals(campoCotizacion.getText()) && cambioPoliza.equals(campoCambioPoliza.getText())){
            datosIguales = true;
        }
        resetImplicitTimeout();
        return datosIguales;
    }
}
