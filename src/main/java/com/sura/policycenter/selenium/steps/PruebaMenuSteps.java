package com.sura.policycenter.selenium.steps;

import com.sura.commons.selenium.Commons;
import com.sura.policycenter.selenium.pages.AbrirAppPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class PruebaMenuSteps extends ScenarioSteps {

    public PruebaMenuSteps(Pages pages) {
        super(pages);
    }

    private Commons guidewire() {
        return getPages().currentPageAt(Commons.class);
    }
    private AbrirAppPage abrirAppPage() {
        return getPages().currentPageAt(AbrirAppPage.class);
    }
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void open() {
        abrirAppPage().open();
    }


    @Step
    public void assertion(String element) {
        inicioPage().assertion(element);
    }

    @Step
    public void pruebaNavegacion (){
        inicioPage().irAMisActividades();
        waitABit(3000);
    }

    @Step
    public void logout() {
        guidewire().logout();
    }
}
