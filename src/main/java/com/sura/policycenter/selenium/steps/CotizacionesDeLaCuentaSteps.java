package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import com.sura.policycenter.selenium.pages.menu.superior.buscar.BuscarCuentasPage;
import java.util.Map;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CotizacionesDeLaCuentaSteps extends ScenarioSteps {

    private final BuscarCuentasPage buscarCuentasPage = new BuscarCuentasPage (getDriver());
    private final OpcionesAdminitradorCotizaciones opcionesAdministradorCotizaciones = new OpcionesAdminitradorCotizaciones(getDriver());

    public CotizacionesDeLaCuentaSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void logout() {
        buscarCuentasPage.logout();
    }

    @Step
    public void seleccionarCotizacionesDeLaCuenta() {
        inicioPage().irAOpcionesAdministradorCotizaciones();
    }

    @Step
    public void seleccionarAccionesCotizacion() {
        opcionesAdministradorCotizaciones.seleccionarAcciones();
    }

    @Step
    public void validarEstadosCotizacion(String declinar, String noTomar) {
        opcionesAdministradorCotizaciones.validarEstadosCotizacion(declinar, noTomar);
    }

    @Step
    public void crearNuevaCotizacion() {
        opcionesAdministradorCotizaciones.crearNuevaCotizacion();
    }

    @Step
    public void validarCreacionCotizacion() {
        opcionesAdministradorCotizaciones.validarCreacionCotizacion();
    }

    @Step
    public void validarOpcionRetirar(String retirar) {
        opcionesAdministradorCotizaciones.validarOpcionRetirar(retirar);
    }

    @Step
    public void seleccionarFiltros(String cotizacion, String producto) {
        opcionesAdministradorCotizaciones.seleccionarFiltros(cotizacion, producto);
    }

    @Step
    public void mostrarInfoCotizacion(String producto) {
        opcionesAdministradorCotizaciones.mostrarInfoCotizacion(producto);
    }

    @Step
    public void validarLabelsCotizaciones(Map<String, String> labelsCotizaciones) {
        opcionesAdministradorCotizaciones.validarLabelsCotizaciones(labelsCotizaciones);
    }

    @Step
    public void validarEstadoDiferenteExpedida(String estado) {
        opcionesAdministradorCotizaciones.validarEstadoDiferenteExpedida(estado);
    }

    @Step
    public void validarNumeroPoliza() {
        opcionesAdministradorCotizaciones.validarNumeroPoliza();
    }

    @Step
    public void validarEstadoCotizacionDeclinado(String propiedadComercial, String cotizado) {
        opcionesAdministradorCotizaciones.validarEstadoCotizacionDeclinado(propiedadComercial, cotizado);
    }

    @Step
    public void mostrarBotonCrearCartaDeclinacion(String crearCarta) {
        opcionesAdministradorCotizaciones.mostrarBotonCrearCartaDeclinacion(crearCarta);
    }

    @Step
    public void validarEstadoAutoPersonal(String producto) {
        opcionesAdministradorCotizaciones.validarEstadoAutoPersonal(producto);
    }

    @Step
    public void noMostrarBotonCrearCarta(String crearCarta) {
        opcionesAdministradorCotizaciones.noMostrarBotonCrearCarta(crearCarta);
    }

    @Step
    public void mostrarTodosLosProductos(String producto) {
        opcionesAdministradorCotizaciones.mostrarTodosLosProductos(producto);
    }
}