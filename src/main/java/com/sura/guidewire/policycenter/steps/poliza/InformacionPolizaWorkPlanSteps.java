package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.InformacionPolizaWorkPlanPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;


public class InformacionPolizaWorkPlanSteps extends ScenarioSteps {
    @Page
    InformacionPolizaWorkPlanPage informacionPolizaWorkPlanPage;

    @Step
    public void clickPlanTrabajo() {
        informacionPolizaWorkPlanPage.clickPlanTrabajo();
    }

    @Step
    public void validarDatosTransaccion() {
        informacionPolizaWorkPlanPage.validarDatosPlanDeTrabajo();
    }

    @Step
    public void buscarActividades() {
        informacionPolizaWorkPlanPage.buscarActividades();
    }

    @Step
    public void menuActividades() {
        informacionPolizaWorkPlanPage.validarMenuActividades();
    }
}
