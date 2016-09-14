package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.renovacion.ReglaPreRenovacionDirPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ReglaPreRenovacionDirPaSteps extends ScenarioSteps {
    public ReglaPreRenovacionDirPaSteps(Pages pages) {
        super(pages);
    }

    ReglaPreRenovacionDirPaPage reglaPreRenovacionDirPaPage;

    @Step
    public void ingresar_instruccion_previa_a_renovacion() {
        reglaPreRenovacionDirPaPage.ingresarARenovacion();
        reglaPreRenovacionDirPaPage.ingresaEditarInstrucciones();
    }

    @Step
    public void valida_opciones_intruccion_detalles(ExamplesTable opcionesDir) throws Exception {
        reglaPreRenovacionDirPaPage.validaLista(opcionesDir);
    }
}
