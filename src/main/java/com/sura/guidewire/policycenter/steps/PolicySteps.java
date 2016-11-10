package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.InicioPage;
import com.sura.guidewire.policycenter.pages.SeusLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class PolicySteps extends ScenarioSteps {

    private final SeusLoginPage seus = new SeusLoginPage(getDriver());

    public PolicySteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void openSeus() {
        seus.open();
    }

    @Step
    public void loginSeus(String pais,String usuario, String contrasenia) {
        seus.login(pais,usuario, contrasenia);
    }

    @Step
    public void assertion(String element) {
        inicioPage().assertion(element);
    }

    @Step
    public void nuevoContactoPersona() {
        inicioPage().irANuevaPersona();
    }
}
