package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.CuentasAsociadasAContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CuentasAsociadasAContactoSteps extends ScenarioSteps {

    BusquedaContactoPage busquedaPage = new BusquedaContactoPage(getDriver());
    CuentasAsociadasAContactoPage cuentasAsociadasAContactoPage = new CuentasAsociadasAContactoPage(getDriver());

    public CuentasAsociadasAContactoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void buscarContacto(String tipoContacto, String nombre, String apellido) {
        busquedaPage.accionarBuscarContacto();
        busquedaPage.buscarContacto(tipoContacto, nombre, apellido);
    }

    @Step
    public void buscarContactoSel(String tipoContacto, String nombre, String apellido, String numero) {
        busquedaPage.accionarBuscarContacto();
        busquedaPage.buscarContacto(tipoContacto, nombre, apellido, numero);
    }

    @Step
    public void listarCuentasAsociadasAContacto(String nombre, String direccion, String telefono, String email, String rol) {
        cuentasAsociadasAContactoPage.validarCamposLista(nombre, direccion, telefono, email, rol);
    }

    @Step
    public void validarMensajeCuenta(String mensaje) {
        cuentasAsociadasAContactoPage.validarMensaje(mensaje);
    }


}
