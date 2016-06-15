package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.CoberturaGlobalSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;

public class CoberturaGlobalDefinitions {
@Steps
    CoberturaGlobalSteps coberturaGlobalSteps;

    @When("vaya a agregar un cobertura global")
    public void agregarCobertura(){
        coberturaGlobalSteps.ir_a_coberturas_globales();
    }
}
