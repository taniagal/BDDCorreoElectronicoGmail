package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesCrearPartcCuentaPage;
import com.sura.policycenter.selenium.pages.menu.superior.buscar.BuscarCuentasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CrearParticipantesCuentaSteps extends ScenarioSteps {

    private final BuscarCuentasPage buscarCuentasPage = new BuscarCuentasPage (getDriver());
    private final OpcionesCrearPartcCuentaPage opcionesCrearPartcCuentaPage = new OpcionesCrearPartcCuentaPage (getDriver());

    public CrearParticipantesCuentaSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

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
        opcionesCrearPartcCuentaPage.navegacionCreaParticipante();
    }

    @Step
    public void validaParticipante (){
        opcionesCrearPartcCuentaPage.verificarCamposParticipantes();
    }
}
