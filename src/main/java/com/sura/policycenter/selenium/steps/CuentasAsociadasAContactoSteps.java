package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.CuentasAsociadasAContactoPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CuentasAsociadasAContactoSteps extends ScenarioSteps {

    private BusquedaContactoPage busquedaPage = new BusquedaContactoPage(getDriver());
    private CuentasAsociadasAContactoPage cuentasAsociadasAContactoPage = new CuentasAsociadasAContactoPage(getDriver());
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    public CuentasAsociadasAContactoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void navegarBarraSuperior() {
        inicioPage().irABuscarContacto();
    }

    @Step
    public void buscarContactoPersona(String tipoContacto, String nombre, String apellido) {
        inicioPage().irABuscarContacto();
        busquedaPage.consultarContactoPorNombresYApellidos(tipoContacto,nombre,"",apellido,"");
        busquedaPage.seleccionarContacto();
    }

    @Step
    public void buscarContactoEmpresa(String tipoContacto, String razonSocial){
        busquedaPage.consultarPersonaJuridaPorRazonSocial(tipoContacto, razonSocial);
        busquedaPage.seleccionarContacto();
    }

    @Step
    public void buscarContactoSel(String tipoContacto, String nombre, String apellido, String numero) {
        //busquedaPage.accionarBuscarContacto();
        inicioPage().irABuscarContacto();
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
