package com.sura.guidewire.selenium;

import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class SeusLoginSteps  extends ScenarioSteps {

    private final SeusLoginPage seus = new SeusLoginPage(getDriver());
    private final Guidewire gw = new Guidewire(getDriver());
    private final InicioPage inicioPage = new InicioPage(getDriver());

    public SeusLoginSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void login(String pais, String usuario, String contrasenia) {

        String element = "Mis actividades";

        seus.open();
        seus.login(pais, usuario, contrasenia);
        inicioPage.assertion(element);
    }


    @Step
    public void login() {

        String pais = "Colombia";
        String usuario = "pedrvevi";
        String contrasenia = "pedrvevi";
        String element = "Mis actividades";

        seus.open();
        seus.login(pais,usuario, contrasenia);
        inicioPage.assertion(element);
    }

    @Step
    public void logout() {
        gw.logout();
    }


    @Step
    public void close() {
        gw.close();
    }
}
