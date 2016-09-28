package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.BusquedaContactoSteps;
import com.sura.policycenter.selenium.steps.DetalleDeAseguradoDeCotizacionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class DetalleDeAseguradoDeCotizacionDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private DetalleDeAseguradoDeCotizacionSteps detalleDeAseguradoDeCotizacionSteps;

    @Steps
    private BusquedaContactoSteps busquedaContactoSteps;

    @Given("voy a crear una nueva cotizacion")
    public void irACrearNuevaCotizacion(@Named("cuenta") String cuenta){
        detalleDeAseguradoDeCotizacionSteps.irACrearNuevaCotizacion();
        }

    @Given("crear una cotizacion nueva con la cuenta <cuenta>")
    public void crearNuevaCotizacion(@Named("cuenta") String cuenta){
        detalleDeAseguradoDeCotizacionSteps.ingresarCuenta(cuenta);
    }

    @When("quiera agregar un asegurado")
    public void irAIngresarAsegurado(){
        detalleDeAseguradoDeCotizacionSteps.irAIngresarAsegurado();
    }

    @When("vaya a la opcion agregar")
    public void agregarAsegurado(){
        detalleDeAseguradoDeCotizacionSteps.agregarAsegurado();
    }

    @When("agregue un asegurado que es contacto de la cuenta")
    public void agregarAseguradoContactoDeLaCuenta(){
        detalleDeAseguradoDeCotizacionSteps.agregarAseguradoContactoDeLaCuenta();
    }

    @When("consulte un asegurado del directorio")
    public void agregarAseguradoContactoDelDirectorio(){
        detalleDeAseguradoDeCotizacionSteps.agregarAseguradoContactoDelDirectorio();
    }

    @When("ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>")
    public void buscarContactoPorIdentificacion(@Named("tipoId") String tipoId,
                                                @Named("numeroId") String numeroId){
        busquedaContactoSteps.consultarContactoPorTipoDocumentoCotizacion(tipoId, numeroId);
    }

    @When("seleccione el contacto a agregar")
    public void seleccionarContactoAAgregarDelDirectorio(){
        detalleDeAseguradoDeCotizacionSteps.seleccionarContactoDelDirectorio();
    }

    @When("seleccione ingresar nueva persona natural")
    public void seleccionarNuevaPersonaNatural(){
        detalleDeAseguradoDeCotizacionSteps.seleccionarNuevaPersonaNatural();
    }

    @When("ingrese los datos de persona natural: $datosPersonaNatural")
    public void ingresarDatosNuevaPersonaNatural(ExamplesTable datosPersonaNatural){
        detalleDeAseguradoDeCotizacionSteps.ingresarDatosNuevaPersonaNatural(datosPersonaNatural);
    }

    @When("seleccione ingresar nueva persona juridica")
    public void seleccionarNuevaPersonaJuridica(){
        detalleDeAseguradoDeCotizacionSteps.seleccionarNuevaPersonaJuridica();
    }

    @When("ingrese los datos de persona juridica: $datosPersonaJuridica")
    public void ingresarDatosNuevaPersonaJuridica(ExamplesTable datosPersonaJuridica){
        detalleDeAseguradoDeCotizacionSteps.ingresarDatosNuevaPersonaJuridica(datosPersonaJuridica);
    }

    @When("vuelva a ver los asegurados")
    public void volverAAsegurados(){
        detalleDeAseguradoDeCotizacionSteps.volverAAsegurados();
    }

    @When("quiera editar los datos del nuevo contacto persona natural: $edicionPersonaNatural")
    public void editarDatosNuevaPersonaNatural(ExamplesTable edicionPersonaNatural){
        detalleDeAseguradoDeCotizacionSteps.editarDatosNuevaPersonaNatural(edicionPersonaNatural);
    }

    @When("quiera editar los datos del nuevo contacto persona juridica: $edicionPersonaJuridica")
    public void editarDatosNuevaPersonaJuridica(ExamplesTable edicionPersonaJuridica){
        detalleDeAseguradoDeCotizacionSteps.editarDatosNuevaPersonaJuridica(edicionPersonaJuridica);
    }

    @When("seleccione el contacto agregado")
    public void seleccionarContactoAgregado(){
        detalleDeAseguradoDeCotizacionSteps.seleccionarContactoAgregado();
    }

    @When("quite el contacto de la lista")
    public void quitarAseguradoDeLaLista(){
        detalleDeAseguradoDeCotizacionSteps.quitarAseguradoDeLaLista();
    }

    @When("vaya al siguiente paso de la cotizacion")
    public void irASiguiente(){
        detalleDeAseguradoDeCotizacionSteps.irASiguiente();
    }

    @Then("Se debe mostrar las opciones: $listaAgregar")
    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar){
        detalleDeAseguradoDeCotizacionSteps.validarOpcionesDeAgregar(listaAgregar);
    }

    @Then("deben quedar agregados como asegurados: $asegurados")
    public void validarAseguradosAgregados(ExamplesTable asegurados){
        detalleDeAseguradoDeCotizacionSteps.validarAseguradosAgregados(asegurados);
    }

    @Then("debe mostrar el mensaje del directorio <mensaje>")
    public void validarMensaje(@Named("mensaje") String mensaje){
        detalleDeAseguradoDeCotizacionSteps.validarMensaje(mensaje);
    }

    @Then("la lista de asegurados debe quedar vacia")
    public void  validarAseguradoEliminado(){
        detalleDeAseguradoDeCotizacionSteps.validarAseguradoEliminado();
    }

    @Then("muestre el mensaje de validacion del asegurado <mensaje>")
    public void validarMensajeDeIntegraciones(@Named("mensaje") String mensaje){
        detalleDeAseguradoDeCotizacionSteps.validarMensajeDeIntegraciones(mensaje);
    }

    @Then("muestre el mensaje de validacion del asegurado <mensaje> que viene de Riesgos Consultables")
    public void validarMensajeRCC(@Named("mensaje") String mensaje){
        detalleDeAseguradoDeCotizacionSteps.validarMensajeDeIntegraciones(mensaje);
    }

    @Then("el boton recuperar mvr no es visible")
    public void validarBotonNoVisible(){
        detalleDeAseguradoDeCotizacionSteps.validarBotonNoVisible();
    }

    @Then("se debe permitir continuar la cotizacion")
    public void validarContinuacionDeCotizacion(){
        detalleDeAseguradoDeCotizacionSteps.validarContinuacionDeCotizacion();
    }

    @Then("debo ver el detalle del asegurado y no debe permitir la modificacion de los datos $datosAsegurado")
    public void validarDetalleDeRiesgo(ExamplesTable datosAsegurado){
        detalleDeAseguradoDeCotizacionSteps.validarDetalleDeRiesgo(datosAsegurado);
    }
}


