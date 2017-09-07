package com.sura.guidewire.policycenter.steps.renovacion;


import com.sura.guidewire.policycenter.pages.renovacion.ReglaPreRenovacionDirPaPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class ReglaPreRenovacionDirPaSteps extends ScenarioSteps {
    @Page
    ReglaPreRenovacionDirPaPage reglaPreRenovacionDirPaPage;

    public ReglaPreRenovacionDirPaSteps(Pages pages) {
        super(pages);
    }


    @Step
    public void ingresarInstruccionPreviaARenovacion() {
        reglaPreRenovacionDirPaPage.ingresarARenovacion();
        reglaPreRenovacionDirPaPage.ingresaEditarInstrucciones();
    }

    @Step
    public void validaOpcionesIntruccionDetalles(ExamplesTable opcionesDir) {
        reglaPreRenovacionDirPaPage.validaLista(opcionesDir);
    }
}
