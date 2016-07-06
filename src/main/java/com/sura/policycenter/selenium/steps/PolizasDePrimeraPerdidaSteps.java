package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.PolizasDePrimeraPerdidaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class PolizasDePrimeraPerdidaSteps extends ScenarioSteps{
    PolizasDePrimeraPerdidaPage polizasDePrimeraPerdidaPage = new PolizasDePrimeraPerdidaPage(getDriver());

    public PolizasDePrimeraPerdidaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresar_articulo(ExamplesTable datos) {
        polizasDePrimeraPerdidaPage.irAArticulos();
    }
}
