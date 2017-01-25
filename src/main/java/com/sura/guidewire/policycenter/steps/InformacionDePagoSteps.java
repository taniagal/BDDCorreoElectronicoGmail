package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionDePagoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class InformacionDePagoSteps extends ScenarioSteps{


    OpcionesInformacionDePagoPage opcionesInformacionDePagoPage;

    public InformacionDePagoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresarAPantallaPagos(){opcionesInformacionDePagoPage.clickEnPagos();
    }

    @Step
    public void validaIngresoAPantallaPago(){opcionesInformacionDePagoPage.validaIngresoAPago();
    }

    @Step
    public void validaMetodoDePago(String nombreMetodoPago) {
        opcionesInformacionDePagoPage.validaPago(nombreMetodoPago);
    }

    @Step
    public void validaPrograma(String programa) {
        opcionesInformacionDePagoPage.validaPrograma(programa);
    }

}
