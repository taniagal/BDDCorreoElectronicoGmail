package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.DireccionesDeContactoVinculadasPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DireccionesDeContactoVinculadasSteps extends ScenarioSteps {

    private final DireccionesDeContactoVinculadasPage direccionesDeContactoVinculadas = new DireccionesDeContactoVinculadasPage(getDriver());

    public DireccionesDeContactoVinculadasSteps(Pages pages) {
        super(pages);
    }

    public void buscarCuenta(String numeroCuenta) {
        direccionesDeContactoVinculadas.buscarCuenta(numeroCuenta);
    }

    public void vincularDirecciones() {
        direccionesDeContactoVinculadas.vincularDirecciones();
    }

    public void validarInformacion(ExamplesTable resultadoFiltroActividades) {
        direccionesDeContactoVinculadas.validarInformacion(resultadoFiltroActividades);
    }
}
