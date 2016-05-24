package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesCrearPartcCuentaPage;
import com.sura.policycenter.selenium.pages.menu.superior.buscar.BuscarCuentasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jonamele on 16/05/2016.
 */
public class CotizacionesDeLaCuentaSteps extends ScenarioSteps {

    public CotizacionesDeLaCuentaSteps(Pages pages) {super(pages);}
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }
    BuscarCuentasPage buscarCuentasPage = new BuscarCuentasPage (getDriver());
    OpcionesCrearPartcCuentaPage opcionesCrearPartcCuentaPage = new OpcionesCrearPartcCuentaPage (getDriver());
    OpcionesAdminitradorCotizaciones opcionesAdministradorCotizaciones = new OpcionesAdminitradorCotizaciones(getDriver());

    @Step
    public void navegaBuscarCuentaPar (){
        inicioPage().irABuscarCuentas();
    }

    @Step
    public void buscaCuenta (String numCuenta){
        buscarCuentasPage.navegacionBuscarCuenta(numCuenta);
    }

    @Step
    public void creaParticipante (){
        inicioPage().irAOpcionesCrearPartcCuenta();
        opcionesCrearPartcCuentaPage.navegacionCreaParticipante();
    }

    @Step
    public void validaParticipante (){
        opcionesCrearPartcCuentaPage.verificarCamposParticipantes();
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
}