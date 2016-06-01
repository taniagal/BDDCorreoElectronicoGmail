package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.GuidewireLoginPages;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.sura.policycenter.selenium.pages.GuidewireLoginPages.TXT_CONTRASENIA;
import static com.sura.policycenter.selenium.pages.GuidewireLoginPages.TXT_USUARIO;


public class GuidewireLoginSteps extends ScenarioSteps {

    GuidewireLoginPages login;

    @Step
    public void ingresar_usuario(String usuario) {
        login.digitar(TXT_USUARIO, usuario);
    }

    @Step
    public void ingresar_contrasenia(String contrasenia) {
        login.digitar(TXT_CONTRASENIA, contrasenia);
    }

    @Step
    public void enviar_credenciales() {
        Serenity.takeScreenshot();
        login.clicBoton();
    }

    @Step
    public String validar_que_el_titulo_de_la_pagina_principal_sea_mis_actividads() {

        return login.obtenerTituloPaginaPplAcceso();
    }


}
