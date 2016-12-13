package com.sura.guidewire.policycenter.steps.commons;


import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import com.sura.guidewire.policycenter.steps.ValidacionesInformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class NuevaCotizacionSteps extends ScenarioSteps {
    NuevaCotizacionPage nuevaCotizacionPage = new NuevaCotizacionPage(getDriver());
    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());
    @Steps
    ValidacionesInformacionDeVehiculoSteps vehiculoSteps;

    public NuevaCotizacionSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void copiarEnvio() {
        nuevaCotizacionPage.copiarEnvio();
    }

    @Step
    public void irANuevaCotizacion() {
        nuevaCotizacionPage.irANuevaCotizacion();
    }

    @Step
    public void seleccionarProducto(ExamplesTable datosCotizacion) {
        nuevaCotizacionPage.seleccionarProducto(datosCotizacion);
    }

    @Step
    public void seleccionDeProducto(String producto) {
        nuevaCotizacionPage.seleccionDeProducto(producto);
    }

    @Step
    public void irABuscarCotizacion(String cotizacion) {
        inicioPage().irABuscarSubPoliza(cotizacion);
    }

    @Step
    public void cotizarEnvioCopiadoPa(ExamplesTable datosCotizacion) {
        vehiculoPage.irAVehiculos();
        vehiculoSteps.agregarPlaca();
        vehiculoPage.agregarCiudadDeCirculacion(datosCotizacion);
        vehiculoPage.clickSiguiente();
        seleccionarCoberturaBasicas(datosCotizacion);
        tarifaAutosPage.intentarCotizar();
    }

    @Step
    public void cotizarEnvioCopiadoPa(){
        nuevaCotizacionPage.cotizarEnvioCopiada();
    }

    @Step
    public void clickBotonCotizar(){
        tarifaAutosPage.cotizar();
    }

    @Step
    public void intentarCotizar(){
        tarifaAutosPage.intentarCotizar();
    }

    @Step
    public void seleccionarCoberturaBasicas(ExamplesTable datosCotizacion){
        tarifaAutosPage.seleccionarCoberturas(datosCotizacion);
        tarifaAutosPage.desMarcarCoberturas();
    }
}
