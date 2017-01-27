package com.sura.guidewire.policycenter.definitions.colectivas;


import com.sura.guidewire.policycenter.steps.colectivas.BusquedaDeRiesgosPASteps;
import com.sura.guidewire.policycenter.steps.colectivas.PolizaPrincipalPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDeRiesgosPADefinitions {

    @Steps
    BusquedaDeRiesgosPASteps busquedaDeRiesgosPASteps;

    @Steps
    PolizaPrincipalPaSteps polizaPrincipalPaSteps;

    @Given("que voy a la busqueda de riesgos")
    public void irALaBusquedaDeRiesgos() {
        busquedaDeRiesgosPASteps.irALaBusquedaDeRiesgos();
    }

    @When("este buscando un riesgo por los filtros producto y placa del vehiculo $filtros")
    public void ingresarCriteriosDeBusqueda(ExamplesTable filtros) {
        busquedaDeRiesgosPASteps.ingresarCriteriosDeBusqueda(filtros);
    }

    @When("quiera ver la informacion de la poliza")
    public void irAConsultarLaInformacionDeLaPoliza() {
        busquedaDeRiesgosPASteps.irAConsultarLaInformacionDeLaPoliza();
    }

    @Then("debo ver la informacion de los riesgos asociados $riesgos")
    public void validarResultadosDeLaConsulta(ExamplesTable riesgos) {
        busquedaDeRiesgosPASteps.validarResultadosDeLaConsulta(riesgos);
    }

    @Then("cuando vaya a ver los detalles de la consulta debo ver la informacion de la poliza asociada <placa>")
    public void validarConsultaDePolizaDesdeLaConsultaDeRiesgos(@Named("placa") String placa) {
        busquedaDeRiesgosPASteps.validarConsultaDePolizaDesdeLaConsultaDeRiesgos(placa);
    }

    @Then("debo poder ver la informacion de la poliza asociada <placa>")
    public void validarConsultaDeRiesgoDesdeLaConsultaDeRiesgos(@Named("placa") String placa) {
        busquedaDeRiesgosPASteps.validarConsultaDePolizaDesdeLaConsultaDeRiesgosPorPoliza(placa);
    }

    @Then("debo poder ver el resumen de la poliza colectiva")
    public void validarConsultaDeRiesgoDesdeElLinkPoliza() {
        polizaPrincipalPaSteps.validarQueLasOpcionesDeAseguradosVehiculosCoberturasNoSonVisibles();
        polizaPrincipalPaSteps.validarQueLasOpcionesDelMenuLateralEnHerramientasEnPolizaExpedidaSonVisibles();
    }
}
