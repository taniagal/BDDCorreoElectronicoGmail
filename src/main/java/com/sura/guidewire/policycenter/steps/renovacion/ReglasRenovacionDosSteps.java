package com.sura.guidewire.policycenter.steps.renovacion;


import com.sura.guidewire.policycenter.pages.renovacion.ReglasRenovacionDosPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

public class ReglasRenovacionDosSteps extends ScenarioSteps {

    @Page
    ReglasRenovacionDosPage reglasRenovacionDosPage;

    @Step
    public void clicSiguienteHastaVehiculos() {
        reglasRenovacionDosPage.clicHastaVehiculo();
    }

    @Step
    public void editarTransaccion() {
        reglasRenovacionDosPage.editarTransaccion();
    }


    @Step
    public void ingresarValorMayorEnAccesorios() {
        reglasRenovacionDosPage.ingresaValorMayorVeintePorciento();
    }

    @Step
    public void ingresarValorMayorDelVehiculoEnAcceEspeciales() {
        reglasRenovacionDosPage.ingresaValorAccesoriosEspeciales();
    }

    @Step
    public void validaMensajesEnPantalla(String mensaje1, String mensaje2) {
        reglasRenovacionDosPage.validacionMensajeValores(mensaje1);
        reglasRenovacionDosPage.validacionMensajeValores(mensaje2);
        reglasRenovacionDosPage.cerrarTransaccion();
    }
}
