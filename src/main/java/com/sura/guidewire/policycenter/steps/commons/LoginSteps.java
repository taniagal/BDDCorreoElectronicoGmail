package com.sura.guidewire.policycenter.steps.commons;

import com.sura.guidewire.policycenter.pages.commons.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    private final LoginPage seus = new LoginPage(getDriver());

    public LoginSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void login(String pais, String usuario, String contrasenia) {
        seus.open();
        seus.login(pais, usuario, contrasenia);
    }


    @Step
    public void login() {
        String pais = "Colombia";
        String usuario = "su";
        String contrasenia = "sura2017";
        seus.open();
        seus.login(pais,usuario, contrasenia);
    }
}
