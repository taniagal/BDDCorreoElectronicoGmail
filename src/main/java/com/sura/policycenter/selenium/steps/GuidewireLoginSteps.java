package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.GuidewireLoginPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


import static com.sura.policycenter.selenium.pages.GuidewireLoginPages.*;


public class GuidewireLoginSteps extends ScenarioSteps {

    GuidewireLoginPages login = new GuidewireLoginPages();

    @Step
    public String validar_que_el_titulo_de_la_pagina_principal_sea_mis_actividads() {

        return login.obtenerTituloPaginaPplAcceso();
    }

    @Step
    public void logearse_a_policycenter_como_su(String usuario, String contrasenia, String pais) {
        if (login.elemento(TXT_USUARIO_SEUS) == null && login.elemento(TXT_CONTRASENIA_SEUS) == null) {
            login.enter("su").into(login.elemento(TXT_USUARIO));
            login.enter("gw").into(login.elemento(TXT_CONTRASENIA));
            login.elemento(BTN_LOGIN).click();
        } else {
            login.enter(usuario).into(login.elemento(TXT_USUARIO_SEUS));
            login.enter(contrasenia).into(login.elemento(TXT_CONTRASENIA_SEUS));
        }
        if (login.elemento(CBO_PAIS) != null){
            login.elemento(CBO_PAIS).selectByVisibleText(pais);
            login.elemento(BTN_LOGIN_SEUS).click();
        }

    }
}
