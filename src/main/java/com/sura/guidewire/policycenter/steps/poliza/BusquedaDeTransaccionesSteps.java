package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.colectivas.BusquedaDeRiesgosPage;
import com.sura.guidewire.policycenter.pages.poliza.BusquedaDeTransaccionesPage;

import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDeTransaccionesSteps extends ScenarioSteps {

    @Page
    BusquedaDeRiesgosPage busquedaDeRiesgosPage;

    @Page
    BusquedaDeTransaccionesPage busquedaDeTransaccionesPage;

    @Step
    public void irABuscarTransacciones() {
        busquedaDeRiesgosPage.clicEnLaOpcionBuscar();
        busquedaDeTransaccionesPage.seleccionarLaOpcionTransacciones();
        busquedaDeTransaccionesPage.clicEnElBotonRestablecer();
    }

    @Step
    public void buscarTransacciones() {
        busquedaDeTransaccionesPage.buscarTransacciones();
        busquedaDeTransaccionesPage.seleccionarLaOpcionTransacciones();
        busquedaDeTransaccionesPage.clicEnElBotonRestablecer();
    }

    @Step
    public void ingresarLosDatosDeBusqueda(ExamplesTable filtro) {
        busquedaDeTransaccionesPage.ingresarLosDatosDeBusqueda(filtro);
        busquedaDeTransaccionesPage.clicEnElBotonBuscar();
    }

    @Step
    public void ingresarLosDatosDeBusquedaTransversal(ExamplesTable filtro) {
        busquedaDeTransaccionesPage.ingresarLosDatosDeBusqueda(filtro);
        busquedaDeTransaccionesPage.clicEnElBotonBuscar();
        busquedaDeTransaccionesPage.validarPolizaExpedida(filtro);
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

    @Step
    public void verTransaccionCotizador() {
        busquedaDeTransaccionesPage.verTransaccionCotizador();
    }

    @Step
    public void capturarPlacaYExpedicion() {
        busquedaDeTransaccionesPage.capturarPlaca();
    }

    @Step
    public void cerrarSesionPolicy() {
        busquedaDeTransaccionesPage.cerrarSesionPolicy();
    }

    @Step
    public void capturarCostoTotalCotizacion() {
        busquedaDeTransaccionesPage.capturarCostoTotalCotizacion();
    }

    @Step
    public void verificarRetornoValorTotalPrima() {
        busquedaDeTransaccionesPage.verificarRetornoValorTotalPrima();
    }

    @Step
    public void verificarTarifaPolizaCancelada() {
        busquedaDeTransaccionesPage.verificarTarifaPolizaCancelada();
    }
}