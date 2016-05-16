package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.BuscarActividadesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class BuscarActividadesDefinitions {

    @Steps
    BuscarActividadesSteps buscarActividadesSteps;

    @Given("que me encuentro en la busqueda de actividades")
    public void buscarActividades() {
        buscarActividadesSteps.buscarActividades();
    }

    @When("quiera realizar la busqueda de actividades por el filtro asignado a <usuario>")
    public void filtrarPorUsuarioAsignado(@Named("usuario") String usuario ) {
        buscarActividadesSteps.filtrarPorAsignado(usuario);
    }

    @Then("me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado(s):\r\ncolumna con icono estrella(tootip: Actividad nueva o actualizada) <icono>, Fecha de vencimiento <fechaVencimiento>,\r\nprioridad <prioridad>, estado <estadoActividad> , asunto <asunto>, ID <id>, Titular de la cuenta <titularCuenta>, producto\r\n<producto>, asignado por <asignadoPor>, estado <estado>")
    public void validarActividadesAsignadas(@Named("icono")String icono,
                                            @Named("fechaVencimiento") String fechaVencimiento,
                                            @Named("prioridad") String prioridad,
                                            @Named("estadoActividad") String estadoActividad,
                                            @Named("asunto") String asunto,
                                            @Named("id") String id,
                                            @Named("titularCuenta") String titularCuenta,
                                            @Named("producto") String producto,
                                            @Named("asignadoPor") String asignadoPor,
                                            @Named("estado") String estado) {

        buscarActividadesSteps.validarResultado(icono, fechaVencimiento, prioridad, estadoActividad, asunto,
                id, titularCuenta, producto, asignadoPor, estado);
    }

    @When("quiera realizar la busqueda de actividades por el filtro numero de poliza<numeroPoliza>")
    public void filtarPorNumeroDePoliza(@Named("numeroPoliza") String numeroPoliza) {
        buscarActividadesSteps.filtrarPorNumeroDePoliza(numeroPoliza);
    }

    @When("quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>")
    public void filtarPorNumeroDeCuenta(@Named("numeroCuenta") String numeroCuenta) {
        buscarActividadesSteps.filtrarPorNumeroDeCuenta(numeroCuenta);
    }

}
