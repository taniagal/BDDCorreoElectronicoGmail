package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesInformacionDePagoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class InformacionDePagoSteps extends ScenarioSteps{

    OpcionesInformacionDePagoPage opcionesInformacionDePagoPage;
    public InformacionDePagoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresar_a_pantalla_pagos(){
        opcionesInformacionDePagoPage.clickEnPagos();
    }

    @Step
    public void valida_ingreso_a_pantalla_pago(){
        opcionesInformacionDePagoPage.validaIngresoAPago();
    }
}
