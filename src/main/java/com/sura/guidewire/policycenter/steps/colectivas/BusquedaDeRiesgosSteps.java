package com.sura.guidewire.policycenter.steps.colectivas;

import com.sura.guidewire.policycenter.pages.colectivas.BusquedaDeRiesgosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class BusquedaDeRiesgosSteps extends ScenarioSteps {

    BusquedaDeRiesgosPage busquedaDeRiesgosPage;

    @Step
    public void irALaBusquedaDeRiesgos() {
        busquedaDeRiesgosPage.clicEnLaOpcionBuscar();
        busquedaDeRiesgosPage.seleccionarLaOpcionRiesgos();
        busquedaDeRiesgosPage.clicEnElBotonRestablecer();
    }

    @Step
    public void ingresarCriteriosDeBusqueda(ExamplesTable filtros) {
        busquedaDeRiesgosPage.seleccionarProducto(filtros);
        busquedaDeRiesgosPage.ingresarPlaca(filtros);
        busquedaDeRiesgosPage.clicEnBuscar();
    }

    @Step
    public void ingresarCriteriosDeBusquedaMrc(ExamplesTable filtros) {
        busquedaDeRiesgosPage.seleccionarProducto(filtros);
        busquedaDeRiesgosPage.seleccionarPais(filtros);
        busquedaDeRiesgosPage.seleccionarDepartamento(filtros);
        busquedaDeRiesgosPage.seleccionarCiudad(filtros);
        busquedaDeRiesgosPage.ingresarDireccion(filtros);
        busquedaDeRiesgosPage.clicEnBuscar();
    }

    @Step
    public void validarResultadosDeLaConsulta(ExamplesTable riesgos) {
        Map<String, String> datosEsperados = riesgos.getRows().get(0);
        MatcherAssert.assertThat(busquedaDeRiesgosPage.obtenerPlaca(), Is.is(Matchers.equalTo(datosEsperados.get("placa"))));
        MatcherAssert.assertThat(busquedaDeRiesgosPage.obtenerTipoDePoliza(), Is.is(Matchers.equalTo(datosEsperados.get("tipoPoliza"))));
        MatcherAssert.assertThat(busquedaDeRiesgosPage.obtenerEstado(), Is.is(Matchers.equalTo(datosEsperados.get("estado"))));
        busquedaDeRiesgosPage.validarDatosDeTabla();
    }

    @Step
    public void validarResultadosDeLaConsultaMrc(ExamplesTable riesgos) {
        Map<String, String> datosEsperados = riesgos.getRows().get(0);
        MatcherAssert.assertThat("No se encontró el tipo de poliza", busquedaDeRiesgosPage.obtenerTipoDePoliza(), Is.is(Matchers.equalTo(datosEsperados.get("tipoPoliza"))));
        MatcherAssert.assertThat("No se encontró la dirección", busquedaDeRiesgosPage.obtenerDireccion(), Is.is(Matchers.equalTo(datosEsperados.get("direccion"))));
        MatcherAssert.assertThat("No se encontró el estado de la poliza", busquedaDeRiesgosPage.obtenerEstadoMrc(), Is.is(Matchers.equalTo(datosEsperados.get("estado"))));
        busquedaDeRiesgosPage.validarDatosDeTablaMrc();
    }

    @Step
    public void validarConsultaDePolizaDesdeLaConsultaDeRiesgos(String placaEsperada) {
        busquedaDeRiesgosPage.clickEnElLinkPlaca();
        MatcherAssert.assertThat(busquedaDeRiesgosPage.validarConsultaDePolizaDesdeLaConsultaDeRiesgos(), Is.is(Matchers.equalTo(placaEsperada)));
    }

    @Step
    public void validarConsultaDePolizaDesdeLaConsultaDeRiesgosPorPoliza(String placaEsperada) {
        MatcherAssert.assertThat(busquedaDeRiesgosPage.validarConsultaDePolizaDesdeLaConsultaDeRiesgos(), Is.is(Matchers.equalTo(placaEsperada)));
    }

    @Step
    public void irAConsultarLaInformacionDeLaPoliza() {
        busquedaDeRiesgosPage.clickEnElLinkPoliza();
    }
}
