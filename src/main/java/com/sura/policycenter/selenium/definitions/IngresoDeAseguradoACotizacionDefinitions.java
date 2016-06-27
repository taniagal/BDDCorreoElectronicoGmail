package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.BusquedaContactoSteps;
import com.sura.policycenter.selenium.steps.IngresoDeAseguradoACotizacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class IngresoDeAseguradoACotizacionDefinitions {

    @Steps
    private IngresoDeAseguradoACotizacionSteps ingresoDeAseguradoACotizacionSteps;

    @Steps
    private BusquedaContactoSteps busquedaContactoSteps;

    @Given("voy a crear una nueva cotizacion")
    public void irACrearNuevaCotizacion(@Named("cuenta") String cuenta){
        ingresoDeAseguradoACotizacionSteps.irACrearNuevaCotizacion();
        }

    @Given("crear una cotizacion nueva con la cuenta <cuenta>")
    public void crearNuevaCotizacion(@Named("cuenta") String cuenta){
        ingresoDeAseguradoACotizacionSteps.ingresarCuenta(cuenta);
    }

    @When("quiera agregar un asegurado")
    public void irAIngresarAsegurado(){
        ingresoDeAseguradoACotizacionSteps.irAIngresarAsegurado();
    }

    @When("vaya a la opcion agregar")
    public void agregarAsegurado(){
        ingresoDeAseguradoACotizacionSteps.agregarAsegurado();
    }

    @When("agregue un asegurado que es contacto de la cuenta")
    public void agregarAseguradoContactoDeLaCuenta(){
        ingresoDeAseguradoACotizacionSteps.agregarAseguradoContactoDeLaCuenta();
    }

    @When("consulte un asegurado del directorio")
    public void agregarAseguradoContactoDelDirectorio(){
        ingresoDeAseguradoACotizacionSteps.agregarAseguradoContactoDelDirectorio();
    }

    @When("ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>")
    public void buscarContactoPorIdentificacion(@Named("tipoId") String tipoId,
                                                @Named("numeroId") String numeroId){
        busquedaContactoSteps.consultarContactoPorTipoDocumentoCotizacion(tipoId, numeroId);
    }

    @When("seleccione el contacto a agregar")
    public void seleccionarContactoAAgregarDelDirectorio(){
        ingresoDeAseguradoACotizacionSteps.seleccionarContactoDelDirectorio();
    }

    @When("seleccione ingresar nueva persona natural")
    public void seleccionarNuevaPersonaNatural(){
        ingresoDeAseguradoACotizacionSteps.seleccionarNuevaPersonaNatural();
    }

    @When("ingrese los datos de persona natural: $datosPersonaNatural")
    public void ingresarDatosNuevaPersonaNatural(ExamplesTable datosPersonaNatural){
        ingresoDeAseguradoACotizacionSteps.ingresarDatosNuevaPersonaNatural(datosPersonaNatural);
    }

    @When("seleccione ingresar nueva persona juridica")
    public void seleccionarNuevaPersonaJuridica(){
        ingresoDeAseguradoACotizacionSteps.seleccionarNuevaPersonaJuridica();
    }

    @When("ingrese los datos de persona juridica: $datosPersonaJuridica")
    public void ingresarDatosNuevaPersonaJuridica(ExamplesTable datosPersonaJuridica){
        ingresoDeAseguradoACotizacionSteps.ingresarDatosNuevaPersonaJuridica(datosPersonaJuridica);
    }

    @When("vuelva a ver los asegurados")
    public void volverAAsegurados(){
        ingresoDeAseguradoACotizacionSteps.volverAAsegurados();
    }

    @When("quiera editar los datos del nuevo contacto persona natural: $edicionPersonaNatural")
    public void editarDatosNuevaPersonaNatural(ExamplesTable edicionPersonaNatural){
        ingresoDeAseguradoACotizacionSteps.editarDatosNuevaPersonaNatural(edicionPersonaNatural);
    }

    @When("quiera editar los datos del nuevo contacto persona juridica: $edicionPersonaJuridica")
    public void editarDatosNuevaPersonaJuridica(ExamplesTable edicionPersonaJuridica){
        ingresoDeAseguradoACotizacionSteps.editarDatosNuevaPersonaJuridica(edicionPersonaJuridica);
    }

    @When("seleccione el contacto agregado")
    public void seleccionarContactoAgregado(){
        ingresoDeAseguradoACotizacionSteps.seleccionarContactoAgregado();
    }

    @When("quite el contacto de la lista")
    public void quitarAseguradoDeLaLista(){
        ingresoDeAseguradoACotizacionSteps.quitarAseguradoDeLaLista();
    }

    @When("vaya al siguiente paso de la cotizacion")
    public void irASiguiente(){
        ingresoDeAseguradoACotizacionSteps.irASiguiente();
    }

    @Then("Se debe mostrar las opciones: $listaAgregar")
    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar){
        ingresoDeAseguradoACotizacionSteps.validarOpcionesDeAgregar(listaAgregar);
    }

    @Then("deben quedar agregados como asegurados: $asegurados")
    public void validarAseguradosAgregados(ExamplesTable asegurados){
        ingresoDeAseguradoACotizacionSteps.validarAseguradosAgregados(asegurados);
    }

    @Then("debe mostrar el mensaje del directorio <mensaje>")
    public void validarMensaje(@Named("mensaje") String mensaje){
        ingresoDeAseguradoACotizacionSteps.validarMensaje(mensaje);
    }

    @Then("la lista de asegurados debe quedar vacia")
    public void  validarAseguradoEliminado(){
        ingresoDeAseguradoACotizacionSteps.validarAseguradoEliminado();
    }

    @Then("muestre el mensaje de validacion del asegurado <mensaje>")
    public void validarMensajeDeIntegraciones(@Named("mensaje") String mensaje){
        ingresoDeAseguradoACotizacionSteps.validarMensajeDeIntegraciones(mensaje);
    }

    @Then("el boton recuperar mvr no es visible")
    public void validarBotonNoVisible(){
        ingresoDeAseguradoACotizacionSteps.validarBotonNoVisible();
    }

}


