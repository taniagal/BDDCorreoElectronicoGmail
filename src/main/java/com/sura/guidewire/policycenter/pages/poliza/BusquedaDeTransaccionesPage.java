package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
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
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_DatesDV:PolicyPerPremium-inputEl']")
    WebElementFacade labelPrimaTotal;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_DatesDV:PolicyPerTaxes-inputEl']")
    WebElementFacade labelImpuestoTarifa;
    @FindBy(xpath = ".//*[@id=':TabLinkMenuButton-btnIconEl']")
    private WebElementFacade mnuConfiguracion;
    @FindBy(xpath = ".//*[@id='TabBar:LogoutTabBarLink-textEl']")
    private WebElementFacade mnuLogOut;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Vehicles:PolicyFile_PersonalAuto_VehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade labelPlaca;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuInfoBar:StatusAndExpDate-btnInnerEl']/span")
    private WebElementFacade labelExpedicion;

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
        Serenity.setSessionVariable("valorCostoTotal".toLowerCase().trim()).to(costoTotal);
        String primaTotal = labelPrimaTotal.getText();
        Serenity.setSessionVariable("valorPrimaTotal".toLowerCase().trim()).to(primaTotal);
        String impuestosTarifas = labelImpuestoTarifa.getText();
        Serenity.setSessionVariable("valorImpuesto".toLowerCase().trim()).to(impuestosTarifas);
    }

    public void capturarPlacaYExpedicion() {
        String placa = labelPlaca.getText();
        Serenity.setSessionVariable("valorPlaca".toLowerCase().trim()).to(placa);
        String fechaExpedicion = labelExpedicion.getText();
        Serenity.setSessionVariable("valorFechaExpedicion".toLowerCase().trim()).to(fechaExpedicion);
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
            comboAplicacionDeOrigen.waitUntilClickable();
            seleccionarItem(comboAplicacionDeOrigen, aplicacionDeOrigen);
        }
        if (!producto.isEmpty()) {
            seleccionarItem(comboProducto, producto);
        }
    }

    public String validarResultadosDeBusqueda() {
        tablaResultadosDeBusqueda.waitUntilVisible();
        return tablaResultadosDeBusqueda.getText();
    }

    public void cerrarSesionPolicy() {
        mnuConfiguracion.click();
        mnuLogOut.click();
    }
}
