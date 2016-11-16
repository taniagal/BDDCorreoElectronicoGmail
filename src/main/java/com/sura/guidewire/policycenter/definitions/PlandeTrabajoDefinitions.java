package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.InformacionDePolizaMrcSteps;
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
    @Steps
    PolizaSteps polizaSteps;
    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;


    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultable()
    {
        planDeTrabajoSteps.ingresar_al_plan_de_trabajo();
    }

    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en cambio de poliza")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultableEnCambioDePoliza()
    {
        planDeTrabajoSteps.ingresar_al_plan_de_trabajo_en_cambio_de_poliza();
    }
    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en renovacion de poliza")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultableEnRenovacionoDePoliza()
    {
        planDeTrabajoSteps.ingresar_al_plan_de_trabajo_en_renovacion_de_poliza();
        informacionDePolizaMrcSteps.ingresar_a_informacion_de_poliza();
        polizaSteps.seleccionarOpcionCierre();
        polizaSteps.seleccionarOpcionRetirarTransaccion();
        polizaSteps.confirmarCancelacion();
    }


}
