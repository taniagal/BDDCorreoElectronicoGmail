package com.sura.guidewire.policycenter.definitions.modificaciones;

import com.sura.guidewire.policycenter.steps.modificacion.PlanDeTrabajoSteps;
import com.sura.guidewire.policycenter.steps.poliza.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.poliza.PolizaSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class PlandeTrabajoDefinitions {

    @Steps
    PlanDeTrabajoSteps planDeTrabajoSteps;
    @Steps
    PolizaSteps polizaSteps;
    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;


    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultable() {
        planDeTrabajoSteps.ingresarAlPlanDeTrabajo();
    }

    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en cambio de poliza")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultableEnCambioDePoliza() {
        planDeTrabajoSteps.ingresarAlPlanDeTrabajoEnCambioDePoliza();
    }

    @Then("se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en renovacion de poliza")
    public void entoncesSeDebeGenerarUnaActividadPorCadaDniODireccionDiferenteQueSeaRiesgoConsultableEnRenovacionoDePoliza() {
        planDeTrabajoSteps.ingresarAlPlanDeTrabajoEnRenovacionDePoliza();
        informacionDePolizaMrcSteps.ingresarAInformacionDePoliza();
        polizaSteps.seleccionarOpcionCierre();
        polizaSteps.seleccionarOpcionRetirarTransaccion();
        polizaSteps.confirmarCancelacion();
    }
    @When("ingrese a la opcion plan de trabajo")
    public void seDebeGenerarActividadPorEnCancelacionDePoliza(){
        planDeTrabajoSteps.ingresarAlPlanDeTrabajoCancelacion();
    }
    @When("ingrese a la opcion plan de trabajo para cancelacion")
    public void ingresarOpcionDeTrabajoCancelacion(){
        planDeTrabajoSteps.ingresarAlPlanDeTrabajoSoloCancelacion();
    }
    @When("ingrese a la opcion Analisis de Riesgo")
    public void seDebeGenerarReglaEnAnalisisDeRiesgoCancelacionDepoliza(){
        planDeTrabajoSteps.ingresarAlAnalisisDeRiesgoCancelacion();
    }
    @When("ingresar a la opcion plan de trabajo en nueva poliza")
    public void seDebeGenerarActividadesEnPolizaNueva(){
        planDeTrabajoSteps.ingresarAlPlanDeTrabajoPolizaNueva();
    }
}
