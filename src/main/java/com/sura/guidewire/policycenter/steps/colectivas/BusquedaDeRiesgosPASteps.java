package com.sura.guidewire.policycenter.steps.colectivas;

import com.sura.guidewire.policycenter.pages.colectivas.BusquedaDeRiesgosPAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDeRiesgosPASteps extends ScenarioSteps {

    BusquedaDeRiesgosPAPage busquedaDeRiesgosPAPage;

    @Step
    public void irALaBusquedaDeRiesgos() {
        busquedaDeRiesgosPAPage.clicEnLaOpcionBuscar();
        busquedaDeRiesgosPAPage.seleccionarLaOpcionRiesgos();
        busquedaDeRiesgosPAPage.clicEnElBotonRestablecer();
    }

    @Step
    public void ingresarCriteriosDeBusqueda(ExamplesTable filtros) {
        busquedaDeRiesgosPAPage.seleccionarProducto(filtros);
        busquedaDeRiesgosPAPage.ingresarPlaca(filtros);
        busquedaDeRiesgosPAPage.clicEnBuscar();
    }

    @Step
    public void validarResultadosDeLaConsulta(ExamplesTable riesgos) {
        busquedaDeRiesgosPAPage.validarDatosDeTabla(riesgos);
    }
}
