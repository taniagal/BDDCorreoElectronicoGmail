package com.sura.guidewire.policycenter.steps.colectivas;

import com.sura.guidewire.policycenter.pages.colectivas.BusquedaDeRiesgosPAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

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
        Map<String, String> datosEsperados = riesgos.getRows().get(0);
        MatcherAssert.assertThat(busquedaDeRiesgosPAPage.obtenerPlaca(), Is.is(Matchers.equalTo(datosEsperados.get("placa"))));
        MatcherAssert.assertThat(busquedaDeRiesgosPAPage.obtenerTipoDePoliza(), Is.is(Matchers.equalTo(datosEsperados.get("tipoPoliza"))));
        busquedaDeRiesgosPAPage.validarDatosDeTabla();
    }
}
