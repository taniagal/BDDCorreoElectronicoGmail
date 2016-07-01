package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.AdmonCotizacionCuentaNoTomarSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;


public class AdmonCotizacionCuentaNoTomarDefinitions {

    @Steps
    AdmonCotizacionCuentaNoTomarSteps admonCotizacionCuentaNoTomarSteps;


    @When("no quiera tomar la cotizacion sin ingresar una razon")
    public void tomarCotizacionSinRazon() {
        admonCotizacionCuentaNoTomarSteps.seleccionar_opcion_en_acciones();
        admonCotizacionCuentaNoTomarSteps.declinar_sin_razon();
    }

    @Then("el sistema debe mostrar un mesaje <mensaje> y bloquear la accion")
    public void mensajeYBloqueoDeAccion(@Named("mensaje") String mensaje) {
        admonCotizacionCuentaNoTomarSteps.valida_mensaje(mensaje);
    }


    @When("no quiera tomar la cotizacion")
    public void noTomarCotizacion() {
        admonCotizacionCuentaNoTomarSteps.seleccionar_opcion_en_acciones();
    }

    @When("no quiera tomar la cotizacion por una razon <razon>")
    public void whenQuieraNoTomarLaCotizacionPorUnaRazonrazon(@Named("razon") String razon) {
        admonCotizacionCuentaNoTomarSteps.seleccionar_opcion_en_acciones();
        admonCotizacionCuentaNoTomarSteps.ingresar_informacion_al_momento_de_rechazar(razon);
    }

    @Then("el sistema debe mostrar el estado no tomada <numCotizacion> <accion>")
    public void thenElSistemaDebeMostrarElEstadoNoTomadanumCotizacion(@Named("numCotizacion") String numCotizacion,
                                                                      @Named("accion") String accion) {
        admonCotizacionCuentaNoTomarSteps.valida_estado_de_la_cotizacion(numCotizacion, accion);
    }

    @Then("desahabilitar la opcion de acciones")
    public void thenDesahabilitarLaOpcionDeAcciones() {
        admonCotizacionCuentaNoTomarSteps.inhabilita_acciones();
    }
    @Then("el sistema debe mostrarme todas las siguientes opciones: $listaCodRazon")
    public void validarOpciones(ExamplesTable listaCodRazon) throws Exception {
        admonCotizacionCuentaNoTomarSteps.valida_lista_de_razones(listaCodRazon);
    }

}

