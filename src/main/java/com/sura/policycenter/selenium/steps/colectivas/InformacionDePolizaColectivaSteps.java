package com.sura.policycenter.selenium.steps.colectivas;


import com.sura.policycenter.selenium.pages.colectivas.InformacionDePolizaColectivaPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class InformacionDePolizaColectivaSteps extends ScenarioSteps{

    InformacionDePolizaColectivaPage informacionDePolizaColectivaPage;

    public void validarInformacionDePolizaColectiva(ExamplesTable informacionPolizaColectiva) {
        informacionDePolizaColectivaPage.validarInformacionDePolizaColectiva(informacionPolizaColectiva);
    }
}
