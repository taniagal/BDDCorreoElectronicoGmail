package com.sura.claims.selenium.steps;

import com.sura.claims.selenium.pages.AbrirApp;
import com.sura.claims.selenium.pages.Escritorio;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by edwabuac on 15/04/2016.
 */

public class ClaimsSteps extends ScenarioSteps{
    Guidewire gw;
    AbrirApp abrir;
    Escritorio escritorio;


    public ClaimsSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open() {
        abrir.open();
    }

    @Step
    public void login(String usuario, String contrasena) {
        gw.login(usuario,contrasena);
    }

    @Step
    public void assertion(String element) {
        escritorio.assertion(element);
    }

}
