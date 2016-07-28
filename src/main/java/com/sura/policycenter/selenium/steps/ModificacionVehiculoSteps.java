package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ModificacionVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ModificacionVehiculoSteps extends ScenarioSteps{

    ModificacionVehiculoPage modificacionVehiculoPage = new ModificacionVehiculoPage(getDriver());

    public ModificacionVehiculoSteps (Pages pages) {
        super(pages);
    }

    @Step
    public void ir_A_Modificar_Vehiculo() {
        modificacionVehiculoPage.irAModificarVehiculo();
    }

    @Step
    public void digitar_Fasecolda_Y_Modelo(String numeroFasecolda, String modelo) {
        modificacionVehiculoPage.digitarFasecoldaYModelo(numeroFasecolda, modelo);
    }

    @Step
    public void recuperar_Datos_Vehiculo(String claseVehiculo, String marca, String linea) {
        modificacionVehiculoPage.mostrarDatosVehiculo(claseVehiculo, marca, linea);
    }

    @Step
    public void registrar_Zona_De_Circulacion(String ciudadCirculacion) {
        modificacionVehiculoPage.registrarZonaCirculacion(ciudadCirculacion);
    }

    @Step
    public void validar_Zona_De_Circulacion(String mensaje) {
        modificacionVehiculoPage.validarZonaCirculacion(mensaje);
    }
}