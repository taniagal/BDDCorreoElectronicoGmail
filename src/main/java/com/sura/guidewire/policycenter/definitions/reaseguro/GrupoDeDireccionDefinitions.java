package com.sura.guidewire.policycenter.definitions.reaseguro;


import com.sura.guidewire.policycenter.definitions.InformacionDePolizaMrcDefinitions;
import com.sura.guidewire.policycenter.steps.reaseguro.CrearYEditarCumulosSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.GrupoDeDireccionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GrupoDeDireccionDefinitions {

    @Steps
    InformacionDePolizaMrcDefinitions informacionDePolizaMrcDefinitions;

    @Steps
    CrearYEditarCumulosSteps crearYEditarCumulosSteps;

    @Steps
    GrupoDeDireccionSteps grupoDeDireccionSteps;



    @Given("ingrese la <fechaInicioVigencia> para un anio")
    public void givenModifiqueLasFechasParaQueSeanCreadasEnDosPeriodos(@Named("fechaInicioVigencia")String fechaInicioVigencia) {
        informacionDePolizaMrcDefinitions.modificaFechaInicioFechaFin(fechaInicioVigencia);
    }

    @When("ingrese a la opcion de reaseguro")
    public void whenIngreseALaOpcionDeReaseguro() {
        crearYEditarCumulosSteps.ingresar_a_opcion_reaseguro();
    }

    @Then("se debe validar los valores del CP, monto retenido y cedido del contrato")
    public void thenSeDebeValidarLosValoresDelCP() {
        grupoDeDireccionSteps.validaInformacionDeCotaparte();
    }

    @Then("se debe validar los valores del EX")
    public void thenSeDebeValidarLosValoresDelEX() {
        // PENDING
    }


}
