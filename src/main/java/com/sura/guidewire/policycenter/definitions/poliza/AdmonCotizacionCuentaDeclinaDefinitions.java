package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.AdmonCotizacionCuentaDeclinaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;


public class AdmonCotizacionCuentaDeclinaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    AdmonCotizacionCuentaDeclinaSteps admonCotizacionCuentaSteps;


    @When("estoy visualizando las cotizaciones de la cuenta <numCuenta>")
    public void visualizacionDeCotizacion(@Named("numCuenta") String numCuenta) {
        admonCotizacionCuentaSteps.navegarBarraSuperior(numCuenta);
    }

    @When("cotice para la opcion declinar MRC")
    public void cotizarParaLaOpcionDeclinar() {
        admonCotizacionCuentaSteps.cotizarParaLaOpcionDeclinar();
    }

    @When("quiera declinar la cotizacion por cualquier razon <razon>")
    public void razonDeclinarCotizacion(@Named("razon") String razon) {
        admonCotizacionCuentaSteps.seleccionarOpcionEnAcciones();
        admonCotizacionCuentaSteps.ingresarInformacionAlMomentoDeRechazar(razon);
    }

    @Then("el sistema debe mostrar el estado declinada <numCotizacion> <accion>")
    public void estadoDeclinarCotizacion(@Named("numCotizacion") String numCotizacion,
                                         @Named("accion") String accion) {
        admonCotizacionCuentaSteps.validaEstadoDeLaCotizacion(numCotizacion, accion);
    }

    @Then("desahabilitar la opcion de acciones para no ser modificada")
    public void thenDesahabilitarLaOpcionDeAccionesParaNoSerModificada() {
        admonCotizacionCuentaSteps.inhabilitaAcciones();
    }

    @When("quiera declinar la cotizacion sin ingresar la razon")
    public void navegaCotizacion() {
        admonCotizacionCuentaSteps.seleccionarOpcionEnAcciones();
        admonCotizacionCuentaSteps.declinarSinRazon();
    }

    @Then("el sistema debe mostrar un mesaje <mensaje>")
    public void mostarMensaje(@Named("mensaje") String mensaje) {
        admonCotizacionCuentaSteps.validaMensaje(mensaje);
    }

    @When("quiera declinar la cotizacion")
    public void declinar() {
        admonCotizacionCuentaSteps.seleccionarOpcionEnAcciones();
    }

    @When("el sistema debe mostrarme todas las opciones: $listaCodRazon")
    public void validarOpciones(ExamplesTable listaCodRazon) {
        admonCotizacionCuentaSteps.validaListaDeRazones(listaCodRazon);
    }

}
