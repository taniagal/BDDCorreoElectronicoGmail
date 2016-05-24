package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
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

    }
}
