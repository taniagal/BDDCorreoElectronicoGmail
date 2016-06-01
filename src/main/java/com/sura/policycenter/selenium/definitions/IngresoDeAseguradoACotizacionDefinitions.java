package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.steps.BusquedaContactoSteps;
import com.sura.policycenter.selenium.steps.IngresoDeAseguradoACotizacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class IngresoDeAseguradoACotizacionDefinitions {

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Steps
    private IngresoDeAseguradoACotizacionSteps ingresoDeAseguradoACotizacionSteps;

    @Steps
    private BusquedaContactoSteps busquedaContactoSteps;

    @Given("voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>")
    public void irABuscarCuenta(@Named("cuenta") String cuenta){
        inicioPage().irACuentaBuscar(cuenta);
        }

    @Given("crear una cotizacion nueva")
    public void crearNuevaCotizacion(){
        inicioPage().irANuevoEnvioDeCuenta();
    }


    @When("quiera agregar un asegurado")
    public void agregarAsegurado(){
        ingresoDeAseguradoACotizacionSteps.irAIngresarAsegurado();
        ingresoDeAseguradoACotizacionSteps.agregarAsegurado();
    }

    @When("agregue un asegurado que es contacto de la cuenta")
    public void agregarAseguradoContactoDeLaCuenta(){
        ingresoDeAseguradoACotizacionSteps.agregarAseguradoContactoDeLaCuenta();
    }

    @When("agregue un asegurado del directorio")
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

    @Then("Se debe mostrar las opciones: $listaAgregar")
    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar){
        ingresoDeAseguradoACotizacionSteps.validarOpcionesDeAgregar(listaAgregar);
    }

    @Then("debe quedar agregado como asegurado <nombre>")
    public void validarAseguradoAgregado(@Named("nombre") String nombre){
        ingresoDeAseguradoACotizacionSteps.validarAseguradoAgregado(nombre);
    }

}


