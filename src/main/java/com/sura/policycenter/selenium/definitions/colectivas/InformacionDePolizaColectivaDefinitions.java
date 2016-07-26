package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.InformacionDePolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class InformacionDePolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    InformacionDePolizaColectivaSteps informacionDePolizaColectivaSteps;

    @Then("debo ver los siguiente campos en la pantalla con su respectiva informacion: $informacionPolizaColectiva")
    public void validarInformacionDePolizaColectiva(ExamplesTable informacionPolizaColectiva){
        informacionDePolizaColectivaSteps.validarInformacionDePolizaColectiva(informacionPolizaColectiva);
    }
}
