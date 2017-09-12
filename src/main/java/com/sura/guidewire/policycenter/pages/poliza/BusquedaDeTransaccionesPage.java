package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;

import java.util.Map;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BusquedaDeTransaccionesPage extends PageUtil {

    protected static final String PATH_TBL_TRANSACCIONES_DE_POLIZA = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_TransactionsLV-body']//tbody/";
    protected static final String COTIZACION = "Cotización";
    protected static final String CANCELACION = "Cancelación";
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    WebElementFacade labelCostoTotalCotizar;
    @FindBy(xpath = ".//*[@id=':TabLinkMenuButton-btnIconEl']")
    private WebElementFacade mnuConfiguracion;
    @FindBy(xpath = ".//*[@id='TabBar:LogoutTabBarLink-textEl']")
    private WebElementFacade mnuLogOut;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Vehicles:PolicyFile_PersonalAuto_VehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade labelPlaca;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_DatesDV:PolicyPerEffDate-inputEl']")
    private WebElementFacade labelFechaInicioVigencia;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnWrap']")
    private WebElementFacade menuBuscar;


    public BusquedaDeTransaccionesPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarLaOpcionTransacciones() {
        menuItemTransacciones.waitUntilPresent();
        super.clickearElemento(menuItemTransacciones);
        waitForTextToAppear("Búsqueda de transacciones");
    }

    public void buscarTransacciones() {
        menuBuscar.waitUntilPresent();
        menuBuscar.click();
        menuItemTransacciones.click();
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

    public void validarPolizaExpedida(ExamplesTable filtro) {
        int contadorIteraciones = CONSTANTE_0;
        while ("".equals(tblNroPoliza.getText()) && contadorIteraciones < CONSTANTE_MAXIMO_EJECUCIONES) {
            this.botonRestablecer.waitUntilVisible().click();
            this.ingresarLosDatosDeBusqueda(filtro);
            this.clicEnElBotonBuscar();
            contadorIteraciones++;
        }
    }

    public void verTransaccionCotizador() {
        String nroPoliza = tblNroPoliza.getText();
        Serenity.setSessionVariable("numeroPoliza".toLowerCase().trim()).to(nroPoliza);
        Serenity.setSessionVariable("polizaTemp".toLowerCase().trim()).to(nroPoliza);
        tblNroPoliza.click();
        String costoTotal = labelCostoTotal.getText();
        Serenity.setSessionVariable("valorCostoTotal".toLowerCase().trim()).to(costoTotal);
        String primaTotal = labelPrimaTotal.getText();
        Serenity.setSessionVariable("valorPrimaTotal".toLowerCase().trim()).to(primaTotal);
        String impuestosTarifas = labelImpuestoTarifa.getText();
        Serenity.setSessionVariable("valorImpuesto".toLowerCase().trim()).to(impuestosTarifas);
        String fechaInicioVigencia = labelFechaInicioVigencia.getText();
        Serenity.setSessionVariable("valorFechaExpedicion".toLowerCase().trim()).to(fechaInicioVigencia);
    }

    public void capturarCostoTotalCotizacion() {
        String costoTotalCotizacion = labelCostoTotalCotizar.getText();
        Serenity.setSessionVariable("valor prima".toLowerCase().trim()).to(costoTotalCotizacion);
    }

    public void capturarPlaca() {
        String placa = labelPlaca.getText();
        Serenity.setSessionVariable("valorPlaca".toLowerCase().trim()).to(placa);
    }

    public void ingresarLosDatosDeBusqueda(ExamplesTable filtro) {
        Map<String, String> datosDeBusqueda = filtro.getRows().get(0);
        String session = Serenity.sessionVariableCalled("numero cotizacion".toLowerCase().trim());
        String data = (datosDeBusqueda.get("idTransaccion"));
        String idTransaccion;
        if (session != null) {
            idTransaccion = (session);
        } else {
            idTransaccion = (data);
        }
        String aplicacionDeOrigen = datosDeBusqueda.get("aplicacionDeOrigen");
        String producto = datosDeBusqueda.get("producto");
        esperarHasta(TIEMPO_2000);
        if (!aplicacionDeOrigen.isEmpty()) {
            comboAplicacionDeOrigen.waitUntilVisible();
            esperarHasta(TIEMPO_1000);
            seleccionarItem(comboAplicacionDeOrigen, aplicacionDeOrigen);
        }
        if (!producto.isEmpty()) {
            comboProducto.waitUntilVisible();
            esperarHasta(TIEMPO_1000);
            seleccionarItem(comboProducto, producto);
        }
        if (!idTransaccion.isEmpty()) {
            esperarHasta(TIEMPO_1000);
            campoIdTransaccion.type(idTransaccion);
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

    public void verificarRetornoValorTotalPrima() {
        String valorPrimaTotal = Serenity.sessionVariableCalled("valor prima".toLowerCase().trim());
        valorPrimaTotal = valorPrimaTotal.substring(CONSTANTE_2, valorPrimaTotal.length());
        MatcherAssert.assertThat("Error en el valor prima total, expected: " + VALOR_PRIMA_CERO +
                BUT_WAS + labelPrimaTotal.getText(), VALOR_PRIMA_CERO.equals(labelPrimaTotal.getText()));
        MatcherAssert.assertThat("Error en el valor impuestos y tarifas, expected: " + VALOR_PRIMA_CERO +
                BUT_WAS + labelImpuestoTarifa.getText(), VALOR_PRIMA_CERO.equals(labelImpuestoTarifa.getText()));
        MatcherAssert.assertThat("Error en el valor costo total, expected: " + VALOR_PRIMA_CERO +
                BUT_WAS + labelCostoTotal.getText(), VALOR_PRIMA_CERO.equals(labelCostoTotal.getText()));
        for (int k = CONSTANTE_1; k < CONSTANTE_3; k++) {
            WebElementFacade tipoTransaccion = $(PATH_TBL_TRANSACCIONES_DE_POLIZA + "tr[" + k + "]/td[5]");
            WebElementFacade fechaTransaccion = $(PATH_TBL_TRANSACCIONES_DE_POLIZA + "tr[" + k + "]/td[3]");
            WebElementFacade valorPrima = $(PATH_TBL_TRANSACCIONES_DE_POLIZA + "tr[" + k + "]/td[7]");

            if (CANCELACION.equals(tipoTransaccion.getText())) {
                MatcherAssert.assertThat("Error en el valor de la prima, expected: " + "-".concat(valorPrimaTotal) +
                        BUT_WAS + valorPrima.getText(), valorPrima.getText().contains(valorPrimaTotal) && valorPrima.getText().contains("-"));
            }
            if (COTIZACION.equals(tipoTransaccion.getText())) {
                MatcherAssert.assertThat("Error en el valor de la prima, expected: " + valorPrimaTotal +
                        BUT_WAS + valorPrima.getText(), valorPrima.getText().contains(valorPrimaTotal));
            }
            MatcherAssert.assertThat("Error en la fecha de transacción, expected: " + Utils.sumarDiasALaFechaActual(CONSTANTE_0) +
                    BUT_WAS + fechaTransaccion.getText(), Utils.sumarDiasALaFechaActual(CONSTANTE_0).equals(fechaTransaccion.getText()));
        }
    }
}
