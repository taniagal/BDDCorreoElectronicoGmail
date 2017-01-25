package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.reaseguro.CesionDePrimaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CesionDePrimaSteps extends ScenarioSteps {

    CesionDePrimaPage cesionDePrimaPage;
    public CesionDePrimaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresarPrimasCedidas() {
        cesionDePrimaPage.clicEnBotonPrimasCedidas();
    }

    @Step
    public void irAResumenDePoliza() {
        cesionDePrimaPage.irAResumenDePoliza();
    }

    @Step
    public void ingresarATodasLasTransacciones() {
        cesionDePrimaPage.ingresaATodasTransacciones();
    }

    public void ejecutaTareaPrimasCedidas() {
        cesionDePrimaPage.ejecutarTareaPrimasCedidas();
    }
}
