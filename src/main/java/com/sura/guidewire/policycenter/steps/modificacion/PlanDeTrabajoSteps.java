package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.modificaciones.PlanDeTrabajoPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class PlanDeTrabajoSteps extends ScenarioSteps {

    @Page
    PlanDeTrabajoPage planDeTrabajo;


    @Step
    public void ingresarAlPlanDeTrabajo(){
        planDeTrabajo.ingresarALaOpcionPlanDeTrabajo();
        planDeTrabajo.validarActividadesGeneradasEnRiesgo();
    }
    @Step
    public void ingresarAlPlanDeTrabajoEnCambioDePoliza(){
        planDeTrabajo.ingresarALaOpcionPlanDeTrabajoEnCambioDePoliza();
        planDeTrabajo.validarActividadesGeneradasEnRiesgo();
    }
    @Step
    public void ingresarAlPlanDeTrabajoEnRenovacionDePoliza(){
        planDeTrabajo.ingresarALaOpcionPlanDeTrabajoEnRenovacionDePoliza();
        planDeTrabajo.validarActividadesGeneradasEnRiesgo();
    }
}
