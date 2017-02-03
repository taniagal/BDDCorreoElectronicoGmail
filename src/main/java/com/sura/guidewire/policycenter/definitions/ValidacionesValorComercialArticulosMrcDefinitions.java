package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;

public class ValidacionesValorComercialArticulosMrcDefinitions {

    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;

    @When("ingresar valor comercial de cobertura <valorcomercial>")
    public void ingresarValorComercial(String valorcomercial){
        edificiosUbicacionesSteps.seleccionarCheckAseguradoValorComercial();
        edificiosUbicacionesSteps.ingresarValorComercialAsegurado(valorcomercial);
    }
}
