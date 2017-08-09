package com.sura.guidewire.policycenter.definitions.actividades;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.actividades.BusquedaActividadesSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")
public class BusquedaActividadesDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private BusquedaActividadesSteps busquedaActividadesSteps;

    @Given("que me encuentro en la busqueda de actividades")
    public void buscarActividades() {
        busquedaActividadesSteps.buscarActividades();
    }

    @When("agregue una actividad a la poliza")
    public void agregarActividadALaPoliza() {
        busquedaActividadesSteps.agregarActividadALaPoliza();
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a <usuario>")
    public void filtrarPorUsuarioAsignado(@Named("usuario") String usuario) {
        busquedaActividadesSteps.filtrarPorAsignado(usuario);
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a Uusuario: $user")
    public void filtrarPorUsuario(String user) {
        busquedaActividadesSteps.filtrarPorAsignado(user);
    }

    @Then("me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado: $resultadoFiltroActividades")
    public void validarActividadesAsignadas(ExamplesTable resultadoFiltroActividades) {
        busquedaActividadesSteps.validarResultado(resultadoFiltroActividades);
    }

    @When("quiera realizar la busqueda de actividades por el filtro numero de poliza<nroPoliza>")
    public void filtarPorNumeroDePoliza(@Named("nroPoliza") String nroPoliza) {
        busquedaActividadesSteps.filtrarPorNumeroDePoliza(nroPoliza);
    }

    @When("quiera realizar la busqueda de actividades por el filtro Numero de Poliza: $numPoliza")
    public void filtarPorNumeroPoliza(String numPoliza) {
        busquedaActividadesSteps.filtrarPorNumeroDePoliza(numPoliza);
    }

    @When("quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>")
    public void filtarPorNumeroDeCuenta(@Named("numeroCuenta") String numeroCuenta) {
        busquedaActividadesSteps.filtrarPorNumeroDeCuenta(numeroCuenta);
    }

    @When("quiera realizar la busqueda de actividades por el filtro Numero de Cuenta: $numCuenta")
    public void filtarPorNumeroCuenta(String numCuenta) {
        busquedaActividadesSteps.filtrarPorNumeroDeCuenta(numCuenta);
    }

    @When("quiera realizar la busqueda de actividades sin algun filtro")
    public void buscarSinFiltro() {
        busquedaActividadesSteps.buscarSinFiltro();
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a Usuario: $user y Prioridad: $prioridad")
    public void buscarPorFiltrosUsuarioYPrioridad(String user, String prioridad) {
        busquedaActividadesSteps.buscarPorFiltrosUsuarioYPrioridad(user, prioridad);
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a Usuario: $user y Estado de actividad: $actividad")
    public void buscarPorFiltrosUsuarioYEstadoDeActividad(String user, String actividad) {
        busquedaActividadesSteps.buscarPorFiltrosUsuarioYEstadoDeActividad(user, actividad);
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a Usuario: $user y Vencida: $vencida")
    public void buscarPorFiltrosUsuarioYVencida(String user, String vencida) {
        busquedaActividadesSteps.buscarPorFiltrosUsuarioYVencida(user, vencida);
    }

    @When("quiera realizar la busqueda de actividades solo por el filtro estado de actividad <estadoActividad>")
    public void buscarPorFiltroOpcional(@Named("estadoActividad") String estadoActividad) {
        busquedaActividadesSteps.buscarPorFiltroOpcional(estadoActividad);
    }

    @Then("me debe mostrar el siguiente mensaje <mensaje>")
    public void validarMensajeFiltroRequerido(@Named("mensaje") String mensaje) {
        busquedaActividadesSteps.validarMensajeFiltroRequerido(mensaje);
    }

    @Then("me debe mostrar el siguiente Mensaje: $message")
    public void validarMensajeRequerido(String message) {
        busquedaActividadesSteps.validarMensajeFiltroRequerido(message);
    }

    @Then("la poliza debe quedar con una actividad asignada")
    public void asignarActividadAPoliza() {
        busquedaActividadesSteps.asignarActividadAPoliza();
    }

}
