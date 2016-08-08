package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.AgregarRiesgosPolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class AgregarRiesgosPolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    AgregarRiesgosPolizaColectivaSteps agregarRiesgosPolizaColectivaSteps;

    @When("de clic en agregar riesgo para ir a la ventana de riesgos")
    public void clicEnAgregarRiesgoInfoPoliza(){
        agregarRiesgosPolizaColectivaSteps.clicEnAgregarRiesgoInfoPoliza();
    }

    @When("de clic en agregar riesgo para agregar un riesgo a la poliza colectiva")
    public void clicEnAgregarRiesgo(){
        agregarRiesgosPolizaColectivaSteps.clicEnAgregarRiesgo();
    }
}
