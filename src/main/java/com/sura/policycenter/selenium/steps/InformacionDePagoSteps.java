package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesInformacionDePagoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class InformacionDePagoSteps extends ScenarioSteps{

    nomclase.optenerinstancia.metodoallamar()

    opcionesInformacionDePagoPage;

    //OpcionesInformacionDePagoPage h = new OpcionesInformacionDePagoPage();



    public InformacionDePagoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresar_a_pantalla_pagos(){opcionesInformacionDePagoPage.clickEnPagos();
    }

    @Step
    public void valida_ingreso_a_pantalla_pago(){opcionesInformacionDePagoPage.validaIngresoAPago();
    }

    @Step
    public void valida_metodo_de_pago(String nombreMetodoPago) {opcionesInformacionDePagoPage.validaPago(nombreMetodoPago, null);
    }

    public void valida_plan_de_pago(String programa) {
        opcionesInformacionDePagoPage.validaPago(null, programa);
    }
}
