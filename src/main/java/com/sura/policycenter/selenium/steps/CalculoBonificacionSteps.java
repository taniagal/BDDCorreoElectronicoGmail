package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.CalculoBonificacionPage;
import com.sura.policycenter.selenium.pages.TarifaAutosPage;
import com.sura.policycenter.selenium.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CalculoBonificacionSteps extends ScenarioSteps{
    CalculoBonificacionPage bonificacionPage = new CalculoBonificacionPage(getDriver());
    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());

    public CalculoBonificacionSteps(Pages pages){
        super(pages);
    }

    @Step
    public void agregar_placa_y_asegurado(String placa) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarPlaca(placa);
    }


    @Step
    public void verificar_bono_tecnico(String bono) {
        bonificacionPage.verificarBonoTecnico(bono);
    }

    @Step
    public void verificar_bono_comercial(String bono) {
        bonificacionPage.verificarBonoComercial(bono);
    }
}
