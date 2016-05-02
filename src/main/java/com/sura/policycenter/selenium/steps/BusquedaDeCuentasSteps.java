package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaDeCuentasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BusquedaDeCuentasSteps extends ScenarioSteps{

    BusquedaDeCuentasPage busquedaDeCuentasPage = new BusquedaDeCuentasPage(getDriver());

    public BusquedaDeCuentasSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresarABuscarCuentas() {
        busquedaDeCuentasPage.ingresarABuscarCuentas();
    }

    @Step
    public void buscarCuentaPorNombreYApellido(String primerNombre, String primerApellido) {
        busquedaDeCuentasPage.buscarCuentaPorNombreYApellido(primerNombre, primerApellido);
    }

    @Step
    public void mostrarInformacionDeLaCuenta(String numeroCuenta, String nombre, String direccion) {
        busquedaDeCuentasPage.mostrarInformacionDeLaCuenta(numeroCuenta, nombre, direccion);
    }
}
