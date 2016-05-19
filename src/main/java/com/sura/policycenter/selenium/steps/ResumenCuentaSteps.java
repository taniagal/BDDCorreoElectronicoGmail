package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaDeCuentasPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesResumenCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Map;

/**
 * Created by diegcaac on 18/05/2016.
 */
public class ResumenCuentaSteps extends ScenarioSteps {

    OpcionesResumenCuentaPage opcionesResumenCuentaPage = new OpcionesResumenCuentaPage(getDriver());

    private InicioPage inicioPage() { return getPages().currentPageAt(InicioPage.class); }
    public ResumenCuentaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void consultarResumenCuenta(){
        inicioPage().irAOpcionesResumenCuenta();
    }

    @Step
    public void verInfoResumenCuenta(Map<String, String> infoResumenCuenta) {
        opcionesResumenCuentaPage.verInfoResumenCuenta(infoResumenCuenta);
    }
}
