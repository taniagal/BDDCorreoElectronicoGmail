package com.sura.guidewire.policycenter.definitions.administracion;

import com.sura.guidewire.policycenter.steps.administracion.CapturaMedioDeVentasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CapturaMedioDeVentasDefinitions {
    @Steps
    CapturaMedioDeVentasSteps capturaMedioDeVentasSteps;

    @Given("estoy en el menu de administracion")
    public void irAlMenuAdministracion() {
        capturaMedioDeVentasSteps.irAlMenuAdministracion();
    }

    @Given("seleccione la opcion de  configuracion red comercial")
    @When("seleccione la opcion de  configuracion red comercial")
    public void irARedComercial() {
        capturaMedioDeVentasSteps.irARedComercial();
    }

    @When("deben aparecer las siguientes opciones: $opciones")
    public void validarOpcionesRedComercial(ExamplesTable opciones) {
        capturaMedioDeVentasSteps.validarOpcionesRedComercial(opciones);
    }

    @Then("deben aparecer las siguientes opciones por medio de venta: $opciones")
    public void validarOpcionesMediosDeVenta(ExamplesTable opciones) {
        capturaMedioDeVentasSteps.validarOpcionesMedioDeVenta(opciones);
    }

    @Then("deben aparecer las siguientes opciones por oficina: $opciones")
    public void validarOpcionesOficina(ExamplesTable opciones) {
        capturaMedioDeVentasSteps.validarOpcionesOficina(opciones);
    }

    @Then("deben aparecer las siguientes opciones por canal: $opciones")
    public void validarOpcionesCanal(ExamplesTable opciones) {
        capturaMedioDeVentasSteps.validarOpcionesCanal(opciones);
    }

    @When("cuando vaya a la opcion canales")
    public void irACanales() {
        capturaMedioDeVentasSteps.irACanales();
    }

    @Then("los botones buscar y restablecer")
    public void verificarPrsenciaBotones() {
        capturaMedioDeVentasSteps.verificarPresenciaBotones();
    }

    @When("cuando vaya al menu acciones a crear un nuevo canal")
    public void crearNuevoCanal() {
        capturaMedioDeVentasSteps.crearNuevoCanal();
    }

    @When("cuando vaya a la opciones medios de venta")
    public void irAMediosDeVenta() {
        capturaMedioDeVentasSteps.irAMediosDeVenta();
    }

    @When("cuando vaya a la opcion oficinas por canal")
    public void irAOficinasPorCanal() {
        capturaMedioDeVentasSteps.irAOficinasPorCanal();
    }

    @When("cuando vaya a la opcion medio de venta por canal")
    public void irAMediosDeVentaPorCanal() {
        capturaMedioDeVentasSteps.irAMediosDeVentaPorCanal();
    }

    @Then("vaya al menu acciones a adicionar medios de venta a un canal")
    public void menuMedioDeVentaPorCanalNuevo() {
        capturaMedioDeVentasSteps.irMenuMedioDeVentaPorCanalNuevo();
    }

    @Then("agrego el canal <canalCom> y le adiciono el medio de venta <medioVenta> que voy a asociarle")
    public void asociarMedioDeVentaACanal(@Named("canalCom") String canalCom, @Named("medioVenta") String medioVenta) {
        capturaMedioDeVentasSteps.asociarMedioDeVentaACanal(canalCom, medioVenta);
    }

    @When("cuando agrege un canal comercial:$canalComercial")
    @Then("cuando agrege un canal comercial:$canalComercial")
    public void buscarCanalComercial(ExamplesTable canalComercial) {
        capturaMedioDeVentasSteps.buscarCanalComercial(canalComercial);
    }

    @Then("se deben mostrar los medios de venta asociados a ese canal: $mediosDeVentaAsociados")
    public void buscarMedioDeVentaAsociado(ExamplesTable mediosDeVentaAsociados) {
        capturaMedioDeVentasSteps.buscarMedioDeVentaAsociado(mediosDeVentaAsociados);
    }

    @Then("debe adicionarse satisfactoriamente el medio de venta al canal")
    public void verificarAdiccionMedioDeVentaACanal() {
        capturaMedioDeVentasSteps.verificarAdiccionMedioDeVentaACanal();
    }
}
