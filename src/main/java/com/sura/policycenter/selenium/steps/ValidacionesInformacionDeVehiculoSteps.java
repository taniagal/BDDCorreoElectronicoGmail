package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ValidacionesInformacionDeVehiculoSteps extends ScenarioSteps{

    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());

    public ValidacionesInformacionDeVehiculoSteps(Pages pages){
        super(pages);
    }


    @Step
    public void verificar_mensajes(ExamplesTable mensajes) {
        vehiculoPage.verificarMensajes(mensajes);
    }

    @Step
    public void ir_a_vehiculos() {
        vehiculoPage.irAVehiculos();
    }
}
