package com.sura.guidewire.policycenter.definitions;


import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.*;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import net.thucydides.core.annotations.Steps;
import org.eclipse.jetty.util.annotation.Name;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

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
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @Given("ingrese un valor maximo para los accesorios <accesorios>")
    public void ingresarValorAccesorios(@Named("accesorios") String accesorios){
        expedicionDePolizaRequisitosPendientesSteps.ingresarValorAccesorios(accesorios);

    }
    @Given("seleccione la opcion importado por terceros")
    public void seleccionarImportado(){
        expedicionDePolizaRequisitosPendientesSteps.seleccionarVehiculoImportado();

    }
    @Given("ingrese un beneficiario oneroso")
    public void ingresarBeneficiarioOneroso(){
        expedicionDePolizaRequisitosPendientesSteps.clickEnInteresAdicional();

    }

    @Then("debo ver un mensaje bloqueante $mensaje")
    public void mensajeBloqueante(ExamplesTable mensaje){
        expedicionDePolizaRequisitosPendientesSteps.verMensaje(mensaje);

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
    @Given("vaya a agregar el vehiculo con los siguientes datos: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        expedicionDePolizaRequisitosPendientesSteps.agregarVehiculo(datosVehiculo);
    }
    @When("se ingrese a la opcion vehiculos")
    public void irAVehiculosModificacion() {
        expedicionDePolizaRequisitosPendientesSteps.clickVehiculos();
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
    @When("intente cotizar el cambio de poliza")
    public void cotizarCambioDePoliza() {
        expedicionDePolizaRequisitosPendientesSteps.clickOpcionCotizar();
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




}
