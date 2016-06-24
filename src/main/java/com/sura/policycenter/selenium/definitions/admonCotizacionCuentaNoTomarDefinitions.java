package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.AdmonCotizacionCuentaNoTomarSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


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
        // PENDING
    }

    @When("quiera no tomar la cotizacion por una razon <razon>")
    public void whenQuieraNoTomarLaCotizacionPorUnaRazonrazon() {
        // PENDING
    }

    @Then("el sistema debe mostrar el estado No tomada <numCotizacion>")
    public void thenElSistemaDebeMostrarElEstadoNoTomadanumCotizacion() {
        // PENDING
    }

    @Then("desahabilitar la opcion de acciones")
    public void thenDesahabilitarLaOpcionDeAcciones() {
        // PENDING
    }


}
