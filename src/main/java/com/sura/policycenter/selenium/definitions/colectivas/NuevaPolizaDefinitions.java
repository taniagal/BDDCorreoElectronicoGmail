package com.sura.policycenter.selenium.definitions.colectivas;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.colectivas.NuevaPolizaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class NuevaPolizaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    NuevaPolizaSteps nuevaPolizaSteps;

    @Given("que voy a buscar la cuenta <numCuenta>")
    public void buscarCuenta(@Named("numCuenta") String numCuenta){
        nuevaPolizaSteps.buscarCuenta(numCuenta);
    }

    @When("despliegue la lista de organizacion")
    public void dar_clic_en_la_lista_organizacion(){
        nuevaPolizaSteps.desplegarListaDeOrganizaciones();
    }

    @When("seleccione la organizacion <organizacion>")
    public void seleccionar_la_organizacion(@Named("organizacion") String organizacion){
        nuevaPolizaSteps.seleccionarOrganizacion(organizacion);
    }

    @When("despliegue la lista canal")
    public void dar_clic_en_la_lista_canal(){
        nuevaPolizaSteps.desplegarListaCanal();
    }

    @When("seleccione el canal <canal>")
    public void seleccionar_el_canal(@Named("canal") String canal){
        nuevaPolizaSteps.seleccionarCanal(canal);
    }

    @When("seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion")
    public void seleccionar_tipo_de_poliza(@Named("tipoPoliza") String tipoPoliza){
        nuevaPolizaSteps.seleccionarElTipoDePoliza(tipoPoliza);
    }

    @Then("debo poder ver las listas de organizacion y canal, las opciones de individual y colectiva, la opcion individual\n" +
            "seleccionada por defecto")
    public void validar_campos_de_la_ventana_nueva_cotizacion(){
        nuevaPolizaSteps.validarCamposDeLaVentanaNuevaCotizacion();
    }

    @Then("la tabla de productos con los productos de Autos y Multiriesgo corporativo y los botones para elegir producto deshabilitados")
    public void validar_los_botones_de_la_tabla_productos_deshabilitados(){
        nuevaPolizaSteps.validarBotonesDeLaTablaProductosDeshabilitados();
    }

    @Then("me debe mostrar las organizaciones: $listaOrganizaciones")
    public void validar_lista_de_organizaciones(ExamplesTable listaOrganizaciones){
        nuevaPolizaSteps.validarListaDeOrganizaciones(listaOrganizaciones);
    }

    @Then("la lista de canal debe mostrar los siguientes datos <datosListaCanal>")
    public void validar_lista_canal_de_acuerdo_a_la_organizacion(@Named("datosListaCanal") String datosListaCanal){
        nuevaPolizaSteps.validaListaCanalDeAcuerdoALaOrganizacion(datosListaCanal);
    }

    @Then("debo ver los productos <productos> para el tipo de poliza <tipoPoliza> seleccionado")
    public void validar_los_productos_disponibles(@Named("productos") String productos,
                                                  @Named("tipoPoliza") String tipoPoliza){
        nuevaPolizaSteps.validarProductos(productos, tipoPoliza);
    }

    @Then("los botones de elegir producto deben estar habilitados")
    public void validar_botones_para_elegir_producto_habilitados(){
        nuevaPolizaSteps.validarBotonesHabilitados();
    }
}
