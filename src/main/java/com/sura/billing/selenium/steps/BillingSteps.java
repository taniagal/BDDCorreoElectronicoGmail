package com.sura.billing.selenium.steps;

import com.sura.billing.selenium.pages.AbrirAppPage;
import com.sura.billing.selenium.pages.EscritorioPage;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jorghome on 22/04/2016.
 */
public class BillingSteps extends ScenarioSteps {

    Guidewire gw = new Guidewire(getDriver());
    AbrirAppPage abrirAppPage = new AbrirAppPage(getDriver());
    EscritorioPage escritorioPage = new EscritorioPage(getDriver());

    public BillingSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open() {
        abrirAppPage.open();
    }

    @Step
    public void login(String usuario, String contrasenia) {
        gw.login(usuario, contrasenia);
    }

    @Step
    public void assertion(String element) {
        escritorioPage.assertion(element);
    }

    @Step
    public void admDiasFestivos() {
        escritorioPage.admDiasFestivos();
    }

    @Step
    public void assertionFestivo(String msj2){
        escritorioPage.asercionFestivo(msj2);
    }

    @Step
    public void logout() {
        gw.logout();
    }

}
