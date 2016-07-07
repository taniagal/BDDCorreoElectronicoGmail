package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.BusquedaActividadesSteps;
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

    @When("quiera realizar la busqueda de actividades por el filtro asignado a <usuario>")
    public void filtrarPorUsuarioAsignado(@Named("usuario") String usuario ) {
        busquedaActividadesSteps.filtrarPorAsignado(usuario);
    }

    @Then("me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado: $resultadoFiltroActividades")
    public void validarActividadesAsignadas(ExamplesTable resultadoFiltroActividades){
        busquedaActividadesSteps.validarResultado(resultadoFiltroActividades);
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
    public void buscarPorFiltrosUsuarioYPrioridad(@Named("usuario") String usuario,
                                                  @Named("filtroPrioridad") String filtroPrioridad) {
        busquedaActividadesSteps.buscarPorFiltrosUsuarioYPrioridad(usuario, filtroPrioridad);
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y estado de actividad <estadoActividad>")
    public void buscarPorFiltrosUsuarioYEstadoDeActividad(@Named("usuario") String usuario,
                                                          @Named("estadoActividad") String estadoActividad) {
        busquedaActividadesSteps.buscarPorFiltrosUsuarioYEstadoDeActividad(usuario, estadoActividad);
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y vencida <filtroVencida>")
    public void buscarPorFiltrosUsuarioYVencida(@Named("usuario") String usuario,
                                                @Named("filtroVencida") String filtroVencida) {
        busquedaActividadesSteps.buscarPorFiltrosUsuarioYVencida(usuario, filtroVencida);
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
