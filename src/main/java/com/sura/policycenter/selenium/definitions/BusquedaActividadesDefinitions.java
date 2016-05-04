package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.BusquedaActividadesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class BusquedaActividadesDefinitions {

    @Steps
    BusquedaActividadesSteps busquedaActividadesSteps;

    @Given("que me encuentro en la busqueda de actividades")
    public void buscarActividades() {
        busquedaActividadesSteps.buscarActividades();
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a <usuario>")
    public void filtrarPorUsuarioAsignado(@Named("usuario") String usuario ) {
        busquedaActividadesSteps.filtrarPorAsignado(usuario);
    }

    @Then("me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:\r\nprioridad <prioridad>, estado <estadoActividad> , asunto <asunto>, Titular de la cuenta <titularCuenta>, producto\r\n<producto>, asignado por <asignadoPor>, estado <estado>")
    public void validarActividadesAsignadas(@Named("prioridad") String prioridad,
                                            @Named("estadoActividad") String estadoActividad,
                                            @Named("asunto") String asunto,
                                            @Named("titularCuenta") String titularCuenta,
                                            @Named("producto") String producto,
                                            @Named("asignadoPor") String asignadoPor,
                                            @Named("estado") String estado) {
        busquedaActividadesSteps.validarResultado(prioridad, estadoActividad, asunto,
                titularCuenta, producto, asignadoPor, estado);
    }

    @When("quiera realizar la busqueda de actividades por el filtro numero de poliza<numeroPoliza>")
    public void filtarPorNumeroDePoliza(@Named("numeroPoliza") String numeroPoliza) {
        busquedaActividadesSteps.filtrarPorNumeroDePoliza(numeroPoliza);
    }

    @When("quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>")
    public void filtarPorNumeroDeCuenta(@Named("numeroCuenta") String numeroCuenta) {
        busquedaActividadesSteps.filtrarPorNumeroDeCuenta(numeroCuenta);
    }

    @When("quiera realizar la busqueda de actividades sin algun filtro")
    public void buscarSinFiltro() {
        busquedaActividadesSteps.buscarSinFiltro();
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y prioridad <filtroPrioridad>")
    public void buscarPorFiltrosRequeridoYOpcional(@Named("usuario") String usuario,
                                                   @Named("prioridad") String prioridad) {
        busquedaActividadesSteps.buscarPorFiltrosRequeridoYOpcional(usuario, prioridad);
    }

    @When("quiera realizar la busqueda de actividades solo por el filtro estado de actividad <estadoActividad>")
    public void buscarPorFiltroOpcional(@Named("estadoActividad") String estadoActividad) {
        busquedaActividadesSteps.buscarPorFiltroOpcional(estadoActividad);
    }

    @Then("me debe mostrar el siguiente mensaje <mensaje>")
    public void validarMensajeFiltroRequerido(@Named("mensaje") String mensaje) {
        busquedaActividadesSteps.validarMensajeFiltroRequerido(mensaje);
    }

}
