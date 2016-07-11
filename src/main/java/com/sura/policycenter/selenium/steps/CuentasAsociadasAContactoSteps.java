package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.CuentasAsociadasAContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CuentasAsociadasAContactoSteps extends ScenarioSteps {

    private BusquedaContactoPage busquedaContactoPage;
    private CuentasAsociadasAContactoPage cuentasAsociadasAContactoPage;


    @Step
    public void navegarBarraSuperior() {
        busquedaContactoPage.irABuscarContacto();
    }

    @Step
    public void buscarContactoPersona(String tipoContacto, String nombre, String apellido) {
        busquedaContactoPage.irABuscarContacto();
        busquedaContactoPage.buscarContacto(tipoContacto, nombre, apellido);
        busquedaContactoPage.seleccionarContacto();
    }

    @Step
    public void buscarContactoEmpresa(String tipoContacto, String razonSocial){
        busquedaContactoPage.consultarPersonaJuridaPorRazonSocial(tipoContacto, razonSocial);
        busquedaContactoPage.seleccionarContacto();
    }

    @Step
    public void buscarContactoSel(String tipoContacto, String nombre, String apellido, String numero) {
        busquedaContactoPage.irABuscarContacto();
        busquedaContactoPage.buscarContacto(tipoContacto, nombre, apellido, numero);
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
