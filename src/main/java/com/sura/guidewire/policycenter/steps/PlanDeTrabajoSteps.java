package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.PlanDeTrabajoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by juanzaag on 04/11/2016.
 */
public class PlanDeTrabajoSteps extends ScenarioSteps {


    PlanDeTrabajoPage planDeTrabajoPage;


    @Step
    public void ingresar_al_plan_de_trabajo(){
        planDeTrabajoPage.ingresarALaOpcionPlanDeTrabajo();
        planDeTrabajoPage.validarActividadesGeneradasEnRiesgo();
    }
    @Step
    public void ingresar_al_plan_de_trabajo_en_cambio_de_poliza(){
        planDeTrabajoPage.ingresarALaOpcionPlanDeTrabajoEnCambioDePoliza();
        planDeTrabajoPage.validarActividadesGeneradasEnRiesgo();
    }
    @Step
    public void ingresar_al_plan_de_trabajo_en_renovacion_de_poliza(){
        planDeTrabajoPage.ingresarALaOpcionPlanDeTrabajoEnRenovacionDePoliza();
        planDeTrabajoPage.validarActividadesGeneradasEnRiesgo();
    }
}
