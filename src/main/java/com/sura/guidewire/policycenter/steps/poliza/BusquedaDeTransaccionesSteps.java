package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.colectivas.BusquedaDeRiesgosPage;
import com.sura.guidewire.policycenter.pages.poliza.BusquedaDeTransaccionesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class BusquedaDeTransaccionesSteps extends ScenarioSteps {

    BusquedaDeRiesgosPage busquedaDeRiesgosPage;
    BusquedaDeTransaccionesPage busquedaDeTransaccionesPage;

    @Step
    public void irABuscarTransacciones() {
        busquedaDeRiesgosPage.clicEnLaOpcionBuscar();
        busquedaDeTransaccionesPage.seleccionarLaOpcionTransacciones();
        busquedaDeTransaccionesPage.clicEnElBotonRestablecer();
    }

    @Step
    public void ingresarLosDatosDeBusqueda(ExamplesTable filtro) {
        busquedaDeTransaccionesPage.ingresarLosDatosDeBusqueda(filtro);
        busquedaDeTransaccionesPage.clicEnElBotonBuscar();
    }

    @Step
    public void validarResultadosDeBusqueda(ExamplesTable resultados) {
        Map<String, String> resultadoEsperado = resultados.getRows().get(0);
        String resultadoPagina = busquedaDeTransaccionesPage.validarResultadosDeBusqueda();
        MatcherAssert.assertThat(resultadoPagina, Matchers.containsString(resultadoEsperado.get("numeroPoliza")));
        MatcherAssert.assertThat(resultadoPagina, Matchers.containsString(resultadoEsperado.get("numeroTransaccion")));
        MatcherAssert.assertThat(resultadoPagina, Matchers.containsString(resultadoEsperado.get("estado")));
        MatcherAssert.assertThat(resultadoPagina, Matchers.containsString(resultadoEsperado.get("tipo")));
    }
}
