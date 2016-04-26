package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.CuentasAsociadasAContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CuentasAsociadasAContactoSteps extends ScenarioSteps {

    BusquedaContactoPage busquedaPage = new BusquedaContactoPage(getDriver());
    CuentasAsociadasAContactoPage associatedAccountPage = new CuentasAsociadasAContactoPage(getDriver());

    public CuentasAsociadasAContactoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void buscarContacto(String nombre, String apellido) {
        busquedaPage.accionarBuscarContacto();
        busquedaPage.buscarContactoPersona(nombre, apellido);
    }

    @Step
    public void listarCuentasAsociadasAContacto(String nombre, String direccion, String telefono, String email, String rol) {
        associatedAccountPage.validarCamposLista(nombre, direccion, telefono, email, rol);
    }

    @Step
    public void validarMensajeCuenta(String mensaje) {
        associatedAccountPage.validarMensaje(mensaje);
    }
}
