package com.sura.guidewire.policycenter.definitions.modificaciones;

import com.sura.guidewire.policycenter.steps.poliza.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.modificacion.PlanDeTrabajoSteps;
import com.sura.guidewire.policycenter.steps.poliza.PolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

public class PlandeTrabajoDefinitions {

    @Steps
    PlanDeTrabajoSteps planDeTrabajoSteps;
    @Steps
    PolizaSteps polizaSteps;
    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;


    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultable() {
        planDeTrabajoSteps.ingresar_al_plan_de_trabajo();
    }

    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en cambio de poliza")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultableEnCambioDePoliza() {
        planDeTrabajoSteps.ingresar_al_plan_de_trabajo_en_cambio_de_poliza();
    }

    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en renovacion de poliza")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultableEnRenovacionoDePoliza() {
        planDeTrabajoSteps.ingresar_al_plan_de_trabajo_en_renovacion_de_poliza();
        informacionDePolizaMrcSteps.ingresarAInformacionDePoliza();
        polizaSteps.seleccionarOpcionCierre();
        polizaSteps.seleccionarOpcionRetirarTransaccion();
        polizaSteps.confirmarCancelacion();
    }


}
