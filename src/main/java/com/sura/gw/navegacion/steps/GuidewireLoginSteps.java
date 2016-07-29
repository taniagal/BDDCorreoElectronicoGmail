package com.sura.gw.navegacion.steps;

import com.sura.gw.navegacion.pages.GuidewireLoginPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepInterceptor;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import static com.sura.gw.navegacion.pages.GuidewireLoginPages.*;

public class GuidewireLoginSteps extends ScenarioSteps {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

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

        SerenityWebdriverManager.inThisTestThread().resetCurrentDriver();
        abrir_navegador(SerenityWebdriverManager.inThisTestThread().getCurrentDriver());

        if (loginPage.elemento(TXT_USUARIO_SEUS) == null && loginPage.elemento(TXT_CONTRASENIA_SEUS) == null) {
            if ("Asesor".equals(rolUsuario)){
                loginPage.enter("su").into(loginPage.elemento(TXT_USUARIO));
                loginPage.enter("gw").into(loginPage.elemento(TXT_CONTRASENIA));
                loginPage.elemento(BTN_LOGIN).click();
            }

        } else {
            if ("Asesor".equals(rolUsuario)){
                loginPage.enter("pedrvevi").into(loginPage.elemento(TXT_USUARIO_SEUS));
                loginPage.enter("pedrvevi").into(loginPage.elemento(TXT_CONTRASENIA_SEUS));
                loginPage.elemento(CBO_PAIS).selectByVisibleText("Colombia");
                loginPage.elemento(BTN_LOGIN_SEUS).click();
            }

        }
        
    }

    @Step
    public void loguearse_a_policycenter_como_su(String usuario, String contrasenia, String pais) {
        if (loginPage.elemento(TXT_USUARIO_SEUS) == null && loginPage.elemento(TXT_CONTRASENIA_SEUS) == null) {
            loginPage.enter("su").into(loginPage.elemento(TXT_USUARIO));
            loginPage.enter("gw").into(loginPage.elemento(TXT_CONTRASENIA));
            loginPage.elemento(BTN_LOGIN).click();
        } else {
            loginPage.enter(usuario).into(loginPage.elemento(TXT_USUARIO_SEUS));
            loginPage.enter(contrasenia).into(loginPage.elemento(TXT_CONTRASENIA_SEUS));
        }
        if (loginPage.elemento(CBO_PAIS) != null){
            loginPage.elemento(CBO_PAIS).selectByVisibleText(pais);
            loginPage.elemento(BTN_LOGIN_SEUS).click();
        }

    }


}
