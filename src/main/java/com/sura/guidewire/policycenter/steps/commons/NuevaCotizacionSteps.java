package com.sura.guidewire.policycenter.steps.commons;


import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class NuevaCotizacionSteps extends ScenarioSteps {
    NuevaCotizacionPage nuevaCotizacionPage = new NuevaCotizacionPage(getDriver());

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
    public void cotizarEnvioCopiado() {
        nuevaCotizacionPage.cotizarEnvioCopiada();
    }
}
