package com.sura.gw.navegacion.steps;

import com.sura.gw.navegacion.pages.PolizaNavBarPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class PolizaNavBarSteps extends ScenarioSteps {

    PolizaNavBarPages menuPoliza;

    @Step
    public void seleccionar_opcion_desplegable_de_menu_superior_poliza() {
        menuPoliza.seleccionarMenu();
    }

    @Step
    public void ingresar_numero_de_subscripcion_y_teclear_enter(String numeroSubscripcion) {
        menuPoliza._consultarNumeroDeSubscripcion(numeroSubscripcion);
    }


    @Step
    public void ingresar_numero_de_poliza_y_teclear_enter(String numeroDePoliza) {
        menuPoliza.consultarNumeroDePoliza(numeroDePoliza);
    }
}
