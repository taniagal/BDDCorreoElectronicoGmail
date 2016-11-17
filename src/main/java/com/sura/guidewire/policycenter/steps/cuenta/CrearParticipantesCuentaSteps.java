package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesCrearPartcCuentaPage;
import com.sura.guidewire.policycenter.utils.navegacion.pages.BuscarNavBarPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CrearParticipantesCuentaSteps extends ScenarioSteps {
    private final OpcionesCrearPartcCuentaPage opcionesCrearPartcCuentaPage = new OpcionesCrearPartcCuentaPage (getDriver());
    private final BuscarNavBarPages buscarNavBarPages = new BuscarNavBarPages();

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
        buscarNavBarPages.navegacionBuscarCuenta(numCuenta);
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
