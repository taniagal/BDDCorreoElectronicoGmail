package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.renovacion.ModificacionRenovacionVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ModificacionRenovacionVehiculoSteps extends ScenarioSteps {

    private ModificacionRenovacionVehiculoPage modificacionRenovacionVehiculo;

    @Step
    public void ir_A_Modificar_Vehiculo() {
        modificacionRenovacionVehiculo.irAModificarVehiculo();
    }

    @Step
    public void validar_Que_Los_Campos_Sean_Editables() {
        modificacionRenovacionVehiculo.validarEdicionCampos();
    }

    @Step
    public void validar_Que_Los_Campos_No_Se_Puedan_Modificar() {
        modificacionRenovacionVehiculo.validarCamposNoEditablesVehiculo();
    }

    @Step
    public void validar_Que_Los_Botones_No_Son_Visibles() {
        modificacionRenovacionVehiculo.validarBotonesNoVisibles();
    }

    @Step
    public void ir_A_Vehiculos() {
        modificacionRenovacionVehiculo.irAVehiculos();
    }
}
