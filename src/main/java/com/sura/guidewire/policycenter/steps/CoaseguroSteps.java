package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CoaseguroPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class CoaseguroSteps extends ScenarioSteps {
    CoaseguroPage coaseguroPage = new CoaseguroPage(getDriver());

    public CoaseguroSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void validarCampos() {
        coaseguroPage.validarCampos();
    }

    @Step
    public void agregarCoaseguro(ExamplesTable datos) {
        coaseguroPage.agregarCoaseguro(datos);
    }

    @Step
    public void verificarPorcentajeDeParticipacion() {
        coaseguroPage.verificarPorcentajeParticipacion();
        coaseguroPage.guardarCosaeguro();
    }

    @Step
    public void guardarCoaseguro() {
        coaseguroPage.guardarCosaeguro();
    }

    @Step
    public void verificarCoaseguro() {
        coaseguroPage.verificarCoaseguro();
    }

    @Step
    public void verificarMensaje(String mensaje) {
        coaseguroPage.verificarMensaje(mensaje);
    }
}
