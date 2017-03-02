package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.poliza.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaMRCSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;

public class ValidacionesValorComercialArticulosMrcDefinitions {

    @Steps
    TarifaMRCSteps tarifaMRCSteps;

    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;

    @When("ingresar valor comercial de cobertura <valorcomercial>")
    public void ingresarValorComercial(String valorcomercial) {
        edificiosUbicacionesSteps.seleccionarCheckAseguradoValorComercial();
        edificiosUbicacionesSteps.ingresarValorComercialAsegurado(valorcomercial);
        tarifaMRCSteps.seleccionarCoberturaDanos();
    }
}
