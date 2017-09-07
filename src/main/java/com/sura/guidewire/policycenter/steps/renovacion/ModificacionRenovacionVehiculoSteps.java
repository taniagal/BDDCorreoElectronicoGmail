package com.sura.guidewire.policycenter.steps.renovacion;

import com.sura.guidewire.policycenter.pages.renovacion.ModificacionRenovacionVehiculoPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class ModificacionRenovacionVehiculoSteps extends ScenarioSteps {
    @Page
    ModificacionRenovacionVehiculoPage modificacionRenovacionVehiculo;

    @Step
    public void irAModificarVehiculo() {
        modificacionRenovacionVehiculo.irAModificarVehiculo();
    }

    @Step
    public void validarQueLosCamposSeanEditables() {
        modificacionRenovacionVehiculo.validarEdicionCampos();
    }

    @Step
    public void validarQueLosCamposNoSePuedanModificar() {
        modificacionRenovacionVehiculo.validarCamposNoEditablesVehiculo();
    }

    @Step
    public void validarQueLosBotonesNoSonVisibles() {
        modificacionRenovacionVehiculo.validarBotonesNoVisibles();
    }

    @Step
    public void irAVehiculos() {
        modificacionRenovacionVehiculo.irAVehiculos();
    }
}
