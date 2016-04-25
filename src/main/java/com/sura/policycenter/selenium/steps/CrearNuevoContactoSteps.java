package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.SeusLoginPage;
import com.sura.policycenter.selenium.pages.EscritorioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by brayruru on 2016/04/25.
 */
public class CrearNuevoContactoSteps extends ScenarioSteps {

    SeusLoginPage seus = new SeusLoginPage(getDriver());
    EscritorioPage escritorioPagePage = new EscritorioPage(getDriver());

    public CrearNuevoContactoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void openSeus() {
        seus.open();
    }

    @Step
    public void loginSeus(String pais,String usuario, String contrasenia) {
        seus.login(pais, usuario, contrasenia);
    }

    @Step
    public void nuevoContactoPersona() {
        escritorioPagePage.nuevoContactoPersona();
    }

    @Step
    public void ingrerarTipoDocumentoPersonaNatural(){
        ;
    }

}
