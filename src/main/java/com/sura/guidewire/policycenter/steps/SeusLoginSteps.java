package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.util.PageUtil;
import com.sura.guidewire.policycenter.pages.SeusLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class SeusLoginSteps  extends ScenarioSteps {

    private final SeusLoginPage seus = new SeusLoginPage(getDriver());
    private final PageUtil gw = new PageUtil(getDriver());

    public SeusLoginSteps(Pages pages) {
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
        String usuario = "pedrvevi";
        String contrasenia = "pedrvevi";
        seus.open();
        seus.login(pais,usuario, contrasenia);
    }
}
