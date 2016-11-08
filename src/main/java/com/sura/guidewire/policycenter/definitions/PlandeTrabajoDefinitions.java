package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.PlanDeTrabajoSteps;
import com.sura.guidewire.policycenter.steps.PolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

/**
 * Created by juanzaag on 04/11/2016.
 */
public class PlandeTrabajoDefinitions {

    @Steps
    PlanDeTrabajoSteps planDeTrabajoSteps;


    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consutable")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultable()
    {
        planDeTrabajoSteps.ingresar_al_plan_de_trabajo();
    }


}
