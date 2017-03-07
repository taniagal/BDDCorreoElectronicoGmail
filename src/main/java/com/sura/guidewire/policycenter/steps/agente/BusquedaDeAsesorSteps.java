package com.sura.guidewire.policycenter.steps.agente;

import com.sura.guidewire.policycenter.pages.agente.BusquedaDeAsesorPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class BusquedaDeAsesorSteps extends ScenarioSteps {

    BusquedaDeAsesorPage busquedaDeAgentePage;

    @Step
    public void irALaPantallaDeBusquedaDeAgente() {
        busquedaDeAgentePage.irALaVentanaBusquedaDeAgente();
        busquedaDeAgentePage.clicEnElBotonRestablecer();
    }

    @Step
    public void validarCamposOcultosDeLaPantalla() {
        Map<String, Boolean> elementos = busquedaDeAgentePage.validarElementosNoVisiblesDeLaPantalla();
        MatcherAssert.assertThat(elementos.get("codigoAgentePrimario"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("estado"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("codigoSucursal"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("organizacion"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("linkUsuario1"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("checkDeseaBuscarAsegurador"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("linkUsuario2"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("moneda"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("pais"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("departamento"), Is.is(Matchers.equalTo(Boolean.FALSE)));
        MatcherAssert.assertThat(elementos.get("ciudad"), Is.is(Matchers.equalTo(Boolean.FALSE)));
    }

    @Step
    public void ingresarCodigoDeAgente(String codigoAsesor) {
        busquedaDeAgentePage.ingresarCodigoAgente(codigoAsesor);
    }

    @Step
    public void ingresarNombreDeAgente(String nombreAgente) {
        busquedaDeAgentePage.ingresarNombreDeAgente(nombreAgente);
    }

    @Step
    public void validarResultadosDeConsulta(ExamplesTable resultado) {
        busquedaDeAgentePage.clicEnElBotonBuscar();
        Map<String, String> resultadoEsperado = resultado.getRows().get(0);
        Map<String, String> resultadoBusqueda = busquedaDeAgentePage.obtenerResultadosDeBusqueda();
        MatcherAssert.assertThat(resultadoBusqueda.get("codigoAsesor"), Is.is(Matchers.equalTo(resultadoEsperado.get("codigoAsesor"))));
        MatcherAssert.assertThat(resultadoBusqueda.get("nombreAsesor"), Is.is(Matchers.equalTo(resultadoEsperado.get("nombreAsesor"))));
        MatcherAssert.assertThat(resultadoBusqueda.get("estado"), Is.is(Matchers.equalTo(resultadoEsperado.get("estado"))));
        MatcherAssert.assertThat(resultadoBusqueda.get("organizacion"), Is.is(Matchers.equalTo(resultadoEsperado.get("organizacion"))));
        MatcherAssert.assertThat(resultadoBusqueda.get("codigoSucursal"), Is.is(Matchers.equalTo(resultadoEsperado.get("codigoSucursal"))));
        MatcherAssert.assertThat(resultadoBusqueda.get("sucursal"), Is.is(Matchers.equalTo(resultadoEsperado.get("sucursal"))));
    }

    @Step
    public void noIngresarDatosEnLosCamposDeFiltro() {
        busquedaDeAgentePage.clicEnElBotonBuscar();
    }

    @Step
    public void validarMensaje(String mensajeEsperado) {
        busquedaDeAgentePage.clicEnElBotonBuscar();
        busquedaDeAgentePage.validarMensajeDeBusquedaDeAsesores(mensajeEsperado);
    }
}
