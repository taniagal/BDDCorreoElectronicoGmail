package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.AdmonCotizacionCuentaDeclinaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
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

    @Given("que estoy visualizando las cotizaciones de la cuenta <numCuenta>")
    public void visualizaCotizacion(@Named("numCuenta") String numCuenta) {
        admonCotizacionCuentaSteps.navegar_barra_superior(numCuenta);
    }

    @When("estoy visualizando las cotizaciones de la cuenta <numCuenta>")
    public void visualizacionDeCotizacion(@Named("numCuenta") String numCuenta) {
        admonCotizacionCuentaSteps.navegar_barra_superior(numCuenta);
    }

    @When("quiera declinar la cotizacion por cualquier razon <razon>")
    public void razonDeclinarCotizacion(@Named("razon") String razon) {
        admonCotizacionCuentaSteps.seleccionar_opcion_en_acciones();
        admonCotizacionCuentaSteps.ingresar_informacion_al_momento_de_rechazar(razon);
    }

    @Then("el sistema debe mostrar el estado declinada <numCotizacion> <accion>")
    public void estadoDeclinarCotizacion(@Named("numCotizacion") String numCotizacion,
                                         @Named("accion") String accion) {
        admonCotizacionCuentaSteps.valida_estado_de_la_cotizacion(numCotizacion, accion);
    }

    @Then("desahabilitar la opcion de acciones para no ser modificada")
    public void thenDesahabilitarLaOpcionDeAccionesParaNoSerModificada() {
        admonCotizacionCuentaSteps.inhabilita_acciones();
    }

    @When("quiera declinar la cotizacion sin ingresar la razon")
    public void navegaCotizacion() {
        admonCotizacionCuentaSteps.seleccionar_opcion_en_acciones();
        admonCotizacionCuentaSteps.declinar_sin_razon();
    }

    @Then("el sistema debe mostrar un mesaje <mensaje>")
    public void mostarMensaje(@Named("mensaje") String mensaje) {
        admonCotizacionCuentaSteps.valida_mensaje(mensaje);
    }

    @When("quiera declinar la cotizacion")
    public void declinar () {
        admonCotizacionCuentaSteps.seleccionar_opcion_en_acciones();
    }

    @Then("el sistema debe mostrarme todas las opciones: $listaCodRazon")
    public void validarOpciones(ExamplesTable listaCodRazon){
        admonCotizacionCuentaSteps.valida_lista_de_razones(listaCodRazon);
    }

}
