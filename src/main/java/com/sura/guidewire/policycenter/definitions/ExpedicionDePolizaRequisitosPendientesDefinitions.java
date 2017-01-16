package com.sura.guidewire.policycenter.definitions;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.ExpedicionDePolizaRequisitosPendientesSteps;
import com.sura.guidewire.policycenter.steps.InformacionPolizaPASteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionDePolizaRequisitosPendientesDefinitions {
    @Steps
    ExpedicionDePolizaRequisitosPendientesSteps expedicionDePolizaRequisitosPendientesSteps;

    @Steps
    InformacionPolizaPASteps informacionPolizaPASteps;

    @When("ingrese un valor maximo para los accesorios <accesorios>")
    public void ingresarValorAccesorios(@Named("accesorios") String accesorios) {
        expedicionDePolizaRequisitosPendientesSteps.ingresarValorAccesorios(accesorios);
    }

    @Given("deseleccione la opcion vehiculo cero kilometros")
    public void deseleccionarVehiculoCeroKilometros() {
        expedicionDePolizaRequisitosPendientesSteps.deseleccionarVehiculoCeroKilometros();
    }

    @When("debo ver un mensaje opcional $mensaje")
    public void mensajeOpcional(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesSteps.verMensajeOpcional(mensaje);
    }

    @When("seleccione la opcion importado por terceros")
    public void seleccionarImportado() {
        expedicionDePolizaRequisitosPendientesSteps.seleccionarVehiculoImportado();
    }

    @Given("ingrese los siguientes datos del vehiculo: $datos")
    public void datosVehiculo(ExamplesTable datos) {
        expedicionDePolizaRequisitosPendientesSteps.datosVehiculo(datos);
    }

    @When("ingrese un beneficiario oneroso en modificacion <beneficiario>")
    public void ingresarBeneficiarioOnerosoModificacion(@Named("beneficiario") String beneficiario) {
        expedicionDePolizaRequisitosPendientesSteps.clickEnInteresAdicionalModificacion(beneficiario);
    }

    @When("ingrese algunas coberturas en modificacion <deducible> <perdidaLlaves>")
    public void ingresarCoberturasModificacion(@Named("deducible") String deducible, @Named("perdidaLlaves") String perdidaLlaves) {
        expedicionDePolizaRequisitosPendientesSteps.ingresarCoberturasModificacion(deducible, perdidaLlaves);
    }

    @When("vaya a vehiculos en expedicion")
    public void irAVehiculos() {
        expedicionDePolizaRequisitosPendientesSteps.irAVehiculos();
    }

    @Then("debo ver un mensaje bloqueante en modificacion $mensaje")
    public void mensajeBloqueanteModificacion(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesSteps.verMensajeBloqueante(mensaje);
    }

    @When("debo ver un mensaje bloqueante $mensaje")
    public void mensajeBloqueante(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesSteps.verMensaje(mensaje);
    }

    @Then("debo ver un mensaje bloqueante accesorios $mensaje")
    public void mensajeBloqueanteAccesorios(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesSteps.verMensaje(mensaje);
    }

    @Then("debe salir un mensaje de requisitos obligatorios en cancelacion $mensaje")
    public void mensajeBloqueanteCancelacion(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesSteps.verMensajecancelacion(mensaje);

    }

    @Given("estoy expidiendo una poliza de autos")
    public void accionarExpedirPolizaAuto() {
        informacionPolizaPASteps.accionarNuevaCotizacion();
        informacionPolizaPASteps.seleccionarAgenteCotizacion();
    }

    @Given("seleccione el producto para expedir la poliza")
    public void elegirElProductoParaLaPoliza() {
        informacionPolizaPASteps.seleccionarProducto();
        informacionPolizaPASteps.accionarInformacionPoliza();
    }

    @When("se ingrese a la opcion vehiculos")
    public void irAVehiculosModificacion() {
        expedicionDePolizaRequisitosPendientesSteps.clickVehiculos();
    }

    @When("ingrese la ciudad de circulacion <ciudad>")
    public void agregarCiudadCirculacion(@Named("ciudad") String ciudad) {
        expedicionDePolizaRequisitosPendientesSteps.agregarCiudadCirculacion(ciudad);
    }

    @When("intente cotizar el cambio de poliza")
    public void cotizarCambioDePoliza() {
        expedicionDePolizaRequisitosPendientesSteps.clickOpcionCotizar();
    }

}
