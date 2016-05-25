package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.AbrirAppPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class PruebaMenuSteps extends ScenarioSteps {

    private Guidewire guidewire() {
        return getPages().currentPageAt(Guidewire.class);
    }
    private AbrirAppPage abrirAppPage() {
        return getPages().currentPageAt(AbrirAppPage.class);
    }
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    public PruebaMenuSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open() {
        abrirAppPage().open();
    }

    @Step
    public void login(String usuario, String contrasenia) {
        guidewire().login(usuario, contrasenia);
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
