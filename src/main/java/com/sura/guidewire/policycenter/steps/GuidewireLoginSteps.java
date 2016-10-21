package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.GuidewireLoginPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class GuidewireLoginSteps extends ScenarioSteps {

    GuidewireLoginPages login = new GuidewireLoginPages();

    @Step
    public String validar_que_el_titulo_de_la_pagina_principal_sea_mis_actividads() {

        return login.obtenerTituloPaginaPplAcceso();
    }

    @Step
    public void logearse_a_policycenter_como_su(String usuario, String contrasenia, String pais) {
        if (login.elemento(GuidewireLoginPages.TXT_USUARIO_SEUS) == null && login.elemento(GuidewireLoginPages.TXT_CONTRASENIA_SEUS) == null) {
            login.enter("su").into(login.elemento(GuidewireLoginPages.TXT_USUARIO));
            login.enter("gw").into(login.elemento(GuidewireLoginPages.TXT_CONTRASENIA));
            login.elemento(GuidewireLoginPages.BTN_LOGIN).click();
        } else {
            login.enter(usuario).into(login.elemento(GuidewireLoginPages.TXT_USUARIO_SEUS));
            login.enter(contrasenia).into(login.elemento(GuidewireLoginPages.TXT_CONTRASENIA_SEUS));
        }
        if (login.elemento(GuidewireLoginPages.CBO_PAIS) != null){
            login.elemento(GuidewireLoginPages.CBO_PAIS).selectByVisibleText(pais);
            login.elemento(GuidewireLoginPages.BTN_LOGIN_SEUS).click();
        }

    }
}
