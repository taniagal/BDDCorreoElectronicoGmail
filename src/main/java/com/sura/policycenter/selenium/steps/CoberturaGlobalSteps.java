package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.CoberturaGlobalPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CoberturaGlobalSteps extends ScenarioSteps {
    CoberturaGlobalPage coberturaGlobalPage = new CoberturaGlobalPage(getDriver());
    public CoberturaGlobalSteps(Pages pages){
        super(pages);
    }

    public void ir_a_coberturas_globales(){
        coberturaGlobalPage.irACoberturasGlobales();
    }

}
