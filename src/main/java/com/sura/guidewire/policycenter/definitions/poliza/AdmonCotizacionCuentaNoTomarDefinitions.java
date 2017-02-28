package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.AdmonCotizacionCuentaNoTomarSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;


public class AdmonCotizacionCuentaNoTomarDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    AdmonCotizacionCuentaNoTomarSteps admonCotizacionCuentaNoTomarSteps;


    @When("no quiera tomar la cotizacion sin ingresar una razon")
    public void tomarCotizacionSinRazon() {
        admonCotizacionCuentaNoTomarSteps.seleccionarOpcionEnAcciones();
        admonCotizacionCuentaNoTomarSteps.declinarSinRazon();
    }

    @Then("el sistema debe mostrar un mesaje <mensaje> y bloquear la accion")
    public void mensajeYBloqueoDeAccion(@Named("mensaje") String mensaje) {
        admonCotizacionCuentaNoTomarSteps.validaMensaje(mensaje);
    }


    @When("no quiera tomar la cotizacion")
    public void noTomarCotizacion() {
        admonCotizacionCuentaNoTomarSteps.seleccionarOpcionEnAcciones();
    }

    @When("no quiera tomar la cotizacion por una razon <razon>")
    public void whenQuieraNoTomarLaCotizacionPorUnaRazonrazon(@Named("razon") String razon) {
        admonCotizacionCuentaNoTomarSteps.seleccionarOpcionEnAcciones();
        admonCotizacionCuentaNoTomarSteps.ingresarInformacionAlMomentoDeRechazar(razon);
    }

    @When("cotice para la opcion no tomar MRC")
    public void cotizarParaLaOpcionNoTomar() {
        admonCotizacionCuentaNoTomarSteps.cotizarParaLaOpcionNoTomar();
    }

    @Then("el sistema debe mostrar el estado no tomada <numCotizacion> <accion>")
    public void thenElSistemaDebeMostrarElEstadoNoTomadanumCotizacion(@Named("numCotizacion") String numCotizacion,
                                                                      @Named("accion") String accion) {
        admonCotizacionCuentaNoTomarSteps.validaEstadoDeLaCotizacion(numCotizacion, accion);
    }

    @Then("desahabilitar la opcion de acciones")
    public void thenDesahabilitarLaOpcionDeAcciones() {
        admonCotizacionCuentaNoTomarSteps.inhabilitaAcciones();
    }

    @Then("el sistema debe mostrarme todas las siguientes opciones: $listaCodRazon")
    public void validarOpciones(ExamplesTable listaCodRazon){
        admonCotizacionCuentaNoTomarSteps.validaListaDeRazones(listaCodRazon);
    }

}

