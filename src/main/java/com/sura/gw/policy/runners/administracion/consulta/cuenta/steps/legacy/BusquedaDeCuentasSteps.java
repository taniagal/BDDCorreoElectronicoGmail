package com.sura.gw.policy.runners.administracion.consulta.cuenta.steps.legacy;


import com.sura.gw.policy.runners.administracion.consulta.cuenta.pages.legacy.BusquedaDeCuentasPage;
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
        busquedaDeCuentasPage.irABuscarCuentas();
    }

    @Step
    public void buscarCuentaPorNombreYApellido(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        busquedaDeCuentasPage.buscarCuentaPorNombreYApellido(primerNombre, segundoNombre, primerApellido, segundoApellido);
    }

    @Step
    public void buscarCuentaPorIdentificacion(String tipoDocumento, String numeroDocumento) {
        busquedaDeCuentasPage.buscarCuentaPorIdentificacion(tipoDocumento, numeroDocumento);
    }

    @Step
    public void mostrarInformacionDeLaCuenta(String numeroCuenta, String nombre, String direccion) {
        busquedaDeCuentasPage.mostrarInformacionDeLaCuenta(numeroCuenta, nombre, direccion);
    }

    @Step
    public void validarMensaje(String mensaje) {
        busquedaDeCuentasPage.validarMensaje(mensaje);
    }

    @Step
    public void buscarCuentaPorRazonSocial(String razonSocial) {
        busquedaDeCuentasPage.buscarCuentaPorRazonSocial(razonSocial);
    }

    @Step
    public void seleccionarTipoDocumento(String tipoDocumento) {
        busquedaDeCuentasPage.seleccionarTipoIdentificacion(tipoDocumento);
    }

    @Step
    public void validarCampos() {
        busquedaDeCuentasPage.validarCamposDelFormulario();
    }

    @Step
    public void validarEtiquetasDeCampos() {
        busquedaDeCuentasPage.validarEtiquetasDelFormulario();
    }

    public void buscarCuentaPorNombreComercial(String nombreComercial) {
        busquedaDeCuentasPage.buscarCuentaPorNombreComercial(nombreComercial);
    }

    public void seleccionarImprimir() {
        busquedaDeCuentasPage.seleccionarImprimir();
    }

    public void validarOpcionesDeImprimir(String imprimir, String exportar, String exportarPersonalizado) {
        busquedaDeCuentasPage.validarOpcionesDeImprimir(imprimir, exportar, exportarPersonalizado);
    }

    public void ingresarRazonSocialYPrimerNombre(String razonSocial, String primerNombre) {
        busquedaDeCuentasPage.ingresarRazonSocialYPrimerNombre(razonSocial, primerNombre);
    }

    public void ingresarNombreComercialYPrimerNombre(String nombreComercial, String primerNombre) {
        busquedaDeCuentasPage.ingresarNombreComercialYPrimerNombre(nombreComercial, primerNombre);
    }

    public void ingresarRazonSocialYNombreComercial(String nombreComercial, String razonSocial) {
        busquedaDeCuentasPage.ingresarRazonSocialYNombreComercial(nombreComercial, razonSocial);
    }
}
