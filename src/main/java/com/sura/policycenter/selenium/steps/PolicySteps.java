package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.SeusLoginPage;
import com.sura.policycenter.selenium.pages.EscritorioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.AbrirAppPage;

public class PolicySteps extends ScenarioSteps {

    SeusLoginPage seus = new SeusLoginPage(getDriver());
    Guidewire gw = new Guidewire(getDriver());
    AbrirAppPage abrirapp = new AbrirAppPage(getDriver());
    EscritorioPage escritorioPagePage = new EscritorioPage(getDriver());

    public PolicySteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open() {
        abrirapp.open();
    }

    @Step
    public void openSeus() {
        seus.open();
    }

    @Step
    public void login(String usuario, String contrasenia) {
        open();
        gw.login(usuario, contrasenia);
    }

    @Step
    public void loginSeus(String pais,String usuario, String contrasenia) {
        seus.login(pais,usuario, contrasenia);
    }

    @Step
    public void assertion(String element) {
        escritorioPagePage.assertion(element);
    }

    @Step
    public void nuevoContactoPersona() {
        escritorioPagePage.nuevoContactoPersona();
    }

    @Step
    public void logout() {
        gw.logout();
    }

    @Step
    public void elegirLenguaje(){
        gw.elegirLenguaje();
    }

}
