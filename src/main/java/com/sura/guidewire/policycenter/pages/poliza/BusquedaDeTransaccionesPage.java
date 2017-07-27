package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class BusquedaDeTransaccionesPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_IdTransactionSearch']/div/span")
    WebElementFacade menuItemTransacciones;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:IdTransaction-inputEl']")
    WebElementFacade campoIdTransaccion;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:originMethod-inputEl']")
    WebElementFacade comboAplicacionDeOrigen;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:selectedProduct-inputEl']")
    WebElementFacade comboProducto;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    WebElementFacade botonRestablecer;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:resultsLV-body']")
    WebElementFacade tablaResultadosDeBusqueda;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:resultsLV:0:PolicyNumber']")
    WebElementFacade tblNroPoliza;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_DatesDV:PolicyPerCost-inputEl']")
    WebElementFacade labelCostoTotal;

    public BusquedaDeTransaccionesPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarLaOpcionTransacciones() {
        menuItemTransacciones.waitUntilPresent();
        super.clickearElemento(menuItemTransacciones);
        waitForTextToAppear("Búsqueda de transacciones");
    }

    public void clicEnElBotonRestablecer() {
        botonRestablecer.waitUntilPresent();
        super.clickearElemento(botonRestablecer);
        waitForTextToAppear("No hay datos para mostrar");
        clickearElemento(campoIdTransaccion);
    }

    public void clicEnElBotonBuscar() {
        botonBuscar.waitUntilPresent();
        super.clickearElemento(botonBuscar);
    }

    public void verTransaccionCotizador() {
        String nroPoliza = tblNroPoliza.getText();
        Serenity.setSessionVariable("numeroPoliza".toLowerCase().trim()).to(nroPoliza);
        tblNroPoliza.click();
        String costoTotal = labelCostoTotal.getText();
        Serenity.setSessionVariable("valorPrima".toLowerCase().trim()).to(costoTotal);
    }

    public void ingresarLosDatosDeBusqueda(ExamplesTable filtro) {
        Map<String, String> datosDeBusqueda = filtro.getRows().get(0);
        String idTransaccion = datosDeBusqueda.get("idTransaccion");
        String aplicacionDeOrigen = datosDeBusqueda.get("aplicacionDeOrigen");
        String producto = datosDeBusqueda.get("producto");
        if (!idTransaccion.isEmpty()) {
            campoIdTransaccion.sendKeys(idTransaccion);
        }
        if (!aplicacionDeOrigen.isEmpty()) {
            seleccionarItem(comboAplicacionDeOrigen, aplicacionDeOrigen);
        }
        if (!producto.isEmpty()) {
            seleccionarItem(comboProducto, producto);
        }
    }

    public String validarResultadosDeBusqueda() {
        waitForTextToAppear("Mostrando ");
        tablaResultadosDeBusqueda.waitUntilPresent();
        return tablaResultadosDeBusqueda.getText();
    }
}
