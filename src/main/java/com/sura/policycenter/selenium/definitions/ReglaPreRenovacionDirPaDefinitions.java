package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.CambioDePolizaSteps;
import com.sura.policycenter.selenium.steps.ReglaPreRenovacionDirPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

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
        reglaPreRenovacionDirPaSteps.

    }

    @Then("se deben habilitar solo las opciones: $opcionesDir")
    public void thenSeDebenHabilitarSoloLasOpcionesAltaSiniestralidadMalasPrácticasDeAsistenciaNegocioEstatal() {

    }
}
