package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.pages.contacto.BusquedaContactoPage;
import com.sura.guidewire.policycenter.pages.cuenta.CuentasAsociadasAContactoPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

public class CuentasAsociadasAContactoSteps extends ScenarioSteps {
    @Page
    BusquedaContactoPage busquedaContacto;
    @Page
    CuentasAsociadasAContactoPage cuentasAsociadasaContacto;


    @Step
    public void navegarBarraSuperior() {
        busquedaContacto.irABuscarContacto();
    }

    @Step
    public void buscarContactoPersona(String tipoContacto, String nombre, String apellido) {
        busquedaContacto.irABuscarContacto();
        busquedaContacto.consultarContactoPorNombresYApellidos(tipoContacto, nombre, "", apellido, "");
        busquedaContacto.seleccionarContacto();
    }

    @Step
    public void buscarContactoEmpresa(String tipoContacto, String razonSocial) {
        busquedaContacto.consultarPersonaJuridaPorRazonSocial(tipoContacto, razonSocial);
        busquedaContacto.seleccionarContacto();
    }

    @Step
    public void buscarContactoSel(String tipoContacto, String nombre, String apellido, String numero) {
        busquedaContacto.irABuscarContacto();
        busquedaContacto.buscarContacto(tipoContacto, nombre, apellido, numero);
    }

    @Step
    public void listarCuentasAsociadasAContacto(String nombre, String direccion, String telefono, String email, String rol) {
        cuentasAsociadasaContacto.validarCamposLista(nombre, direccion, telefono, email, rol);
    }

    @Step
    public void validarMensajeCuenta(String mensaje) {
        cuentasAsociadasaContacto.validarMensaje(mensaje);
    }

}
