package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.renovacion.ExpedicionRenovacionPaValidacionesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ExpedicionRenovacionPaValidacionesSteps extends ScenarioSteps{

    private ExpedicionRenovacionPaValidacionesPage expedicionRenovacionPaValidacionesPage;

    @Step
    public void validar_Que_No_Se_Tenga_Motor_Ni_Chasis_Ingresados() {
        expedicionRenovacionPaValidacionesPage.validarExpedicionDeRenovacion();
    }

    @Step
    public void validar_Valor_Accesorios_Y_Accesorios_Especiales() {
        expedicionRenovacionPaValidacionesPage.validarExpedicionDeRenovacion();
    }

    @Step
    public void validar_Valor_Asegurado_Superior_A_Vigencia_Anterior() {
        expedicionRenovacionPaValidacionesPage.validarExpedicionDeRenovacion();
    }

    @Step
    public void validar_Valor_Asegurado_Inferior_A_Vigencia_Anterior() {
        expedicionRenovacionPaValidacionesPage.validarExpedicionDeRenovacion();
    }
}
