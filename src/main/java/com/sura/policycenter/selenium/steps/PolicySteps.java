package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.guidewire.selenium.SeusLoginPage;
import com.sura.policycenter.selenium.pages.AbrirAppPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class PolicySteps extends ScenarioSteps {

    private SeusLoginPage seus = new SeusLoginPage(getDriver());
    private Guidewire gw = new Guidewire(getDriver());
    private AbrirAppPage abrirapp = new AbrirAppPage(getDriver());
    private InicioPage inicioPage = new InicioPage(getDriver());
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

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
        inicioPage.assertion(element);
    }

    @Step
    public void nuevoContactoPersona() {
        inicioPage().irANuevaPersona();
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
