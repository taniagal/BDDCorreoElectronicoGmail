package com.sura.guidewire.selenium;

import com.sura.policycenter.selenium.pages.AbrirAppPage;
import com.sura.policycenter.selenium.pages.EscritorioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class SeusLoginSteps  extends ScenarioSteps {

    SeusLoginPage seus = new SeusLoginPage(getDriver());
    EscritorioPage escritorioPagePage = new EscritorioPage(getDriver());

    public SeusLoginSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void login(String pais, String usuario, String contrasenia) {

        String element = "Mis actividades";

        seus.open();
        seus.login(pais, usuario, contrasenia);
        escritorioPagePage.assertion(element);
    }

}
