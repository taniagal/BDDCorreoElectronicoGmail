package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.Escritorio;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.AbrirApp;

/**
 * Created by jorghome on 16/03/2016.
 */
public class PolicySteps extends ScenarioSteps {

    Guidewire gw = new Guidewire(getDriver());
    AbrirApp abrirapp = new AbrirApp(getDriver());
    Escritorio escritorio = new Escritorio(getDriver());

    public PolicySteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open() {
        abrirapp.open();
    }

    @Step
    public void login(String usuario, String contrasena) {
        gw.login(usuario, contrasena);
    }

    @Step
    public void assertion(String element) {
        escritorio.assertion(element);
    }

    @Step
    public void nuevoContactoPersona() {
        escritorio.nuevoContactoPersona();
    }

    @Step
    public void logout() {
        gw.logout();
    }

}
