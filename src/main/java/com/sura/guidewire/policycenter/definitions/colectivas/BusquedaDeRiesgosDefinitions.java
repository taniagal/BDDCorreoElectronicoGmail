package com.sura.guidewire.policycenter.definitions.colectivas;


import com.sura.guidewire.policycenter.steps.colectivas.BusquedaDeRiesgosSteps;
import com.sura.guidewire.policycenter.steps.colectivas.PolizaPrincipalPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDeRiesgosDefinitions {

    @Steps
    BusquedaDeRiesgosSteps busquedaDeRiesgosSteps;

    @Steps
    PolizaPrincipalPaSteps polizaPrincipalPaSteps;

    @Given("que voy a la busqueda de riesgos")
    public void irALaBusquedaDeRiesgos() {
        busquedaDeRiesgosSteps.irALaBusquedaDeRiesgos();
    }

    @When("este buscando un riesgo por los filtros producto y placa del vehiculo $filtros")
    public void ingresarCriteriosDeBusqueda(ExamplesTable filtros) {
        busquedaDeRiesgosSteps.ingresarCriteriosDeBusqueda(filtros);
    }

    @When("este buscando un riesgo por los filtros pais departamento ciudad y direccion  $filtros")
    public void ingresarCriteriosDeBusquedaMrc(ExamplesTable filtros) {
        busquedaDeRiesgosSteps.ingresarCriteriosDeBusquedaMrc(filtros);
    }

    @When("quiera ver la informacion de la poliza")
    public void irAConsultarLaInformacionDeLaPoliza() {
        busquedaDeRiesgosSteps.irAConsultarLaInformacionDeLaPoliza();
    }

    @When("ingreso a la busqueda de riesgos")
    public void ingresoABusquedaDeRiesgos() {
        busquedaDeRiesgosSteps.irALaBusquedaDeRiesgos();
    }

    @Then("debo ver la informacion de los riesgos asociados $riesgos")
    public void validarResultadosDeLaConsulta(ExamplesTable riesgos) {
        busquedaDeRiesgosSteps.validarResultadosDeLaConsulta(riesgos);
    }

    @Then("se debe visualizar la informacion de los riesgos asociados en MRC $riesgos")
    public void validarResultadosDeLaConsultaMrc(ExamplesTable riesgos) {
        busquedaDeRiesgosSteps.validarResultadosDeLaConsultaMrc(riesgos);
    }

    @Then("cuando vaya a ver los detalles de la consulta debo ver la informacion de la poliza asociada <placa>")
    public void validarConsultaDePolizaDesdeLaConsultaDeRiesgos(@Named("placa") String placa) {
        busquedaDeRiesgosSteps.validarConsultaDePolizaDesdeLaConsultaDeRiesgos(placa);
    }

    @Then("debo poder ver la informacion de la poliza asociada <placa>")
    public void validarConsultaDeRiesgoDesdeLaConsultaDeRiesgos(@Named("placa") String placa) {
        busquedaDeRiesgosSteps.validarConsultaDePolizaDesdeLaConsultaDeRiesgosPorPoliza(placa);
    }

    @Then("debo poder ver el resumen de la poliza colectiva")
    public void validarConsultaDeRiesgoDesdeElLinkPoliza() {
        polizaPrincipalPaSteps.validarQueLasOpcionesDeAseguradosVehiculosCoberturasNoSonVisibles();
        polizaPrincipalPaSteps.validarQueLasOpcionesDelMenuLateralEnHerramientasEnPolizaExpedidaSonVisibles();
    }
}
