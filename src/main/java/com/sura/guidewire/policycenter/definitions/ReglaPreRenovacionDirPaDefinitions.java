package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.CambioDePolizaSteps;
import com.sura.guidewire.policycenter.steps.ReglaPreRenovacionDirPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ReglaPreRenovacionDirPaDefinitions {


    @Steps
    CambioDePolizaSteps cambioDePolizaSteps;

    @Steps
    ReglaPreRenovacionDirPaSteps reglaPreRenovacionDirPaSteps;

    @Given("que existe una <poliza> y esta dentro de la vigencia")
    public void givenQueExisteUnaPolizaYEstaDentroDeLaVigencia(@Named("poliza")String poliza) {
        cambioDePolizaSteps.irABuscarPoliza(poliza);
    }

    @When("desee registrar una direccion de prerenovacion")
    public void whenDeseeRegistrarUnaDireccionDePrerenovacion() {
        cambioDePolizaSteps.irAMenuAcciones();
        reglaPreRenovacionDirPaSteps.ingresar_instruccion_previa_a_renovacion();
    }

    @Then("se deben habilitar solo las opciones: $opcionesDir")
    public void thenhabilitarInstrucciones(ExamplesTable opcionesDir) throws Exception {
        reglaPreRenovacionDirPaSteps.valida_opciones_intruccion_detalles(opcionesDir);
    }

}
