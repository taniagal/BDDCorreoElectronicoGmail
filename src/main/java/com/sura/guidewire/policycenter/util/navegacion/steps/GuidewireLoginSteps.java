package com.sura.guidewire.policycenter.util.navegacion.steps;

import com.sura.guidewire.policycenter.util.navegacion.pages.GuidewireLoginPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;


public class GuidewireLoginSteps extends ScenarioSteps {
    private GuidewireLoginPages loginPage;

    public GuidewireLoginPages getLoginPage() {
        return loginPage;
    }


    @Step
    public String validar_que_el_titulo_de_la_pagina_principal_sea_mis_actividads() {
        return loginPage.obtenerTituloPaginaPplAcceso();
    }

    @Step
    public void abrir_navegador(WebDriver driver) {
        this.loginPage = new GuidewireLoginPages(driver);
        this.loginPage.open();
    }

    @Step
    public void loguearse_a_policycenter_con_rol(String rolUsuario){
        abrir_navegador(SerenityWebdriverManager.inThisTestThread().getCurrentDriver());
        loginPage.ingresar_por_rol(rolUsuario);
    }

    @Step
    public void loguearse_a_policycenter_como_su(String usuario, String contrasenia, String pais) {
        if (loginPage.elemento(GuidewireLoginPages.TXT_USUARIO_SEUS) == null && loginPage.elemento(GuidewireLoginPages.TXT_CONTRASENIA_SEUS) == null) {
            loginPage.enter("su").into(loginPage.elemento(GuidewireLoginPages.TXT_USUARIO));
            loginPage.enter("gw").into(loginPage.elemento(GuidewireLoginPages.TXT_CONTRASENIA));
            loginPage.elemento(GuidewireLoginPages.BTN_LOGIN).click();
        } else {
            loginPage.enter(usuario).into(loginPage.elemento(GuidewireLoginPages.TXT_USUARIO_SEUS));
            loginPage.enter(contrasenia).into(loginPage.elemento(GuidewireLoginPages.TXT_CONTRASENIA_SEUS));
        }
        if (loginPage.elemento(GuidewireLoginPages.CBO_PAIS) != null){
            loginPage.elemento(GuidewireLoginPages.CBO_PAIS).selectByVisibleText(pais);
            loginPage.elemento(GuidewireLoginPages.BTN_LOGIN_SEUS).click();
        }

    }


}