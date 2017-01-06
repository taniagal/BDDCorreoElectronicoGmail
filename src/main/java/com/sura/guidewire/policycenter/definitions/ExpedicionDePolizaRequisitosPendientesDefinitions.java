package com.sura.guidewire.policycenter.definitions;


import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.*;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WhenPageOpens;
import org.eclipse.jetty.util.annotation.Name;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.support.FindBy;

public class ExpedicionDePolizaRequisitosPendientesDefinitions {
    @Steps
    ExpedicionDePolizaRequisitosPendientesSteps expedicionDePolizaRequisitosPendientesSteps;
    @Steps
    DetalleDeAseguradoDeCotizacionSteps detalleDeAseguradoDeCotizacionSteps;
    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;
    @Steps
    GuidewireLoginSteps guidewireLoginSteps;
    @Steps
    InformacionPolizaPASteps informacionPolizaPASteps;
    @Steps
    TarifaAutosSteps tarifaAutosSteps;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @When("ingrese un valor maximo para los accesorios <accesorios>")
    public void ingresarValorAccesorios(@Named("accesorios") String accesorios){
        expedicionDePolizaRequisitosPendientesSteps.ingresarValorAccesorios(accesorios);

    }
    @Given("deseleccione la opcion vehiculo cero kilometros")
    public void deseleccionarVehiculoCeroKilometros(){
        expedicionDePolizaRequisitosPendientesSteps.deseleccionarVehiculoCeroKilometros();

    }

    @When("debo ver un mensaje opcional $mensaje")
    public void mensajeOpcional(ExamplesTable mensaje){
        expedicionDePolizaRequisitosPendientesSteps.verMensajeOpcional(mensaje);

    }
    @Then("debo ver un mensaje opcional cero kilometros $mensaje")
    public void mensajeOpcionalCeroKilometros(ExamplesTable mensaje){
        expedicionDePolizaRequisitosPendientesSteps.verMensajeOpcional(mensaje);

    }
    @When("seleccione la opcion importado por terceros")
    public void seleccionarImportado(){
        expedicionDePolizaRequisitosPendientesSteps.seleccionarVehiculoImportado();

    }
    @When("intente cotizar la poliza")
    public void cotizarPoliza(){
        expedicionDePolizaRequisitosPendientesSteps.cotizarPoliza();

    }
    @Given("ingrese los siguientes datos del vehiculo: $datos")
    public void datosVehiculo(ExamplesTable datos){
        expedicionDePolizaRequisitosPendientesSteps.datosVehiculo(datos);

    }
    @When("ingrese un beneficiario oneroso")
    public void ingresarBeneficiarioOneroso(){
        expedicionDePolizaRequisitosPendientesSteps.clickEnInteresAdicional();

    }
    @When("ingrese un beneficiario oneroso en modificacion <beneficiario>")
    public void ingresarBeneficiarioOnerosoModificacion(@Named("beneficiario") String beneficiario){
        expedicionDePolizaRequisitosPendientesSteps.clickEnInteresAdicionalModificacion(beneficiario);

    }
    @When("ingrese algunas coberturas en modificacion <deducible> <perdida_llaves>")
    public void ingresarCoberturasModificacion(@Named("deducible") String deducible , @Named("perdida_llaves") String perdida_llaves){
        expedicionDePolizaRequisitosPendientesSteps.ingresarCoberturasModificacion(deducible,perdida_llaves);

    }
    @When("vaya a vehiculos en expedicion")
    public void irAVehiculos(){
        expedicionDePolizaRequisitosPendientesSteps.irAVehiculos();

    }
    @Then("debo ver un mensaje bloqueante en modificacion $mensaje")
    public void mensajeBloqueanteModificacion(ExamplesTable mensaje){
        expedicionDePolizaRequisitosPendientesSteps.verMensajeBloqueante(mensaje);

    }
    @When("debo ver un mensaje bloqueante $mensaje")
    public void mensajeBloqueante(ExamplesTable mensaje){
        expedicionDePolizaRequisitosPendientesSteps.verMensaje(mensaje);

    }
    @Then("debo ver un mensaje bloqueante accesorios $mensaje")
    public void mensajeBloqueanteAccesorios(ExamplesTable mensaje){
        expedicionDePolizaRequisitosPendientesSteps.verMensaje(mensaje);

    }
    @Then("debe salir un mensaje de requisitos obligatorios en cancelacion $mensaje")
    public void mensajeBloqueanteCancelacion(ExamplesTable mensaje){
        expedicionDePolizaRequisitosPendientesSteps.verMensajecancelacion(mensaje);

    }
    @When("vaya a la opcion requisitos")
    public void opcionRequisitos(){
        expedicionDePolizaRequisitosPendientesSteps.verRequisitosPendientes();
    }
    @When("haga un logeo en desarrollo <usuario> y <contrasenia> y <pais>")
    public void logueoDesarrollo(@Named("usuario")String usuario, @Named("contrasenia") String contrasenia, @Named("pais") String pais){
        guidewireLoginSteps.logearse_a_policycenter_como_su(usuario, contrasenia, pais);

    }
    @Given("seleccione el producto <producto> para expedir la poliza")
    public void elegirProducto(@org.jbehave.core.annotations.Named("producto") String producto){
        nuevaCotizacionSteps.seleccionDeProducto(producto);
    }
    @Given("quiera agregar un asegurado")
    public void irAIngresarAsegurado() {
        detalleDeAseguradoDeCotizacionSteps.irAIngresarAsegurado();
    }

    @Given("vaya a la opcion agregar")
    public void agregarAsegurado() {
        detalleDeAseguradoDeCotizacionSteps.agregarAsegurado();
    }

    @Given("seleccione ingresar nueva persona natural")
    public void seleccionarNuevaPersonaNatural() {
        detalleDeAseguradoDeCotizacionSteps.seleccionarNuevaPersonaNatural();
    }

    @Given("ingrese los datos de persona natural: $datosPersonaNatural")
    public void ingresarDatosNuevaPersonaNatural(ExamplesTable datosPersonaNatural) {
        detalleDeAseguradoDeCotizacionSteps.ingresarDatosNuevaPersonaNatural(datosPersonaNatural);
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
    @When("ingrese un valor de accesorios superior al permitido <accesorios>")
    public void valorAccesoriosModificacion(@Named("accesorios") String accesorios) {
        expedicionDePolizaRequisitosPendientesSteps.agregarAccesoriosModificacion(accesorios);
    }
    @Given("seleccione algunas coberturas: $coberturas")
    public void agregarCoberturas(ExamplesTable coberturas) {
        tasaUnicaSteps.seleciconarCoberturas(coberturas);
        expedicionDePolizaRequisitosPendientesSteps.validarBotonCotizacion();
    }
    @When("voy al archivo de poliza")
    public void archivoDePoliza() {
        expedicionDePolizaRequisitosPendientesSteps.clickArchivoDePoliza();
    }
    @When("cambie el valor de los accesorios")
    public void cambiarAccesorios() {
        expedicionDePolizaRequisitosPendientesSteps.cambiarValorAccesorios();
    }
    @When("intente cotizar el cambio de poliza")
    public void cotizarCambioDePoliza() {
        expedicionDePolizaRequisitosPendientesSteps.clickOpcionCotizar();
    }

    @When("seleccionamos el motivo de cancelacion")
    public void cancelarPoliza() {
        expedicionDePolizaRequisitosPendientesSteps.cancelarPoliza();
    }

    @When("de click en expedir poliza")
    public void expedirCambioPoliza() {
        expedicionDePolizaRequisitosPendientesSteps.clickExpedirPoliza();
    }
    @When("ingrese la ciudad <ciudad>")
    public void ingresarCiudad(@Named("ciudad")String ciudad) {
        expedicionDePolizaRequisitosPendientesSteps.ingresarCiudadModificacionPoliza(ciudad);
    }
    @Given("de click en cero kilometros")
    public void clickKilometraje() {
        expedicionDePolizaRequisitosPendientesSteps.clickVehiculoCeroKilometros();
    }


    @Given("ingrese los datos del vehiculo: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        tarifaAutosSteps.agregarVehiculo(datosVehiculo);
    }

}
