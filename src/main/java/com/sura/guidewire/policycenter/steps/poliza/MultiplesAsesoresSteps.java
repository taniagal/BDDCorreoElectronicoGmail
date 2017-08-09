package com.sura.guidewire.policycenter.steps.poliza;


import com.sura.guidewire.policycenter.pages.poliza.MultiplesAsesoresPage;
import com.sura.guidewire.policycenter.utils.Parametros;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.jbehave.core.model.ExamplesTable;

public class MultiplesAsesoresSteps extends ScenarioSteps {
    MultiplesAsesoresPage multiplesAsesoresPage;

    @Step
    public void adicionarAsesoresDeComision() {
        multiplesAsesoresPage.adicionarAsesoresDeComision();
    }

    @Step
    public void ingresarInformacionDelAsesor(ExamplesTable parametros) {
       multiplesAsesoresPage.ingresarInformacionDelAsesor(parametros);
    }

    @Step
    public void validarDatosDelAsesor(Parametros opciones) {
        multiplesAsesoresPage.validarDatosDelAsesor(opciones);
    }

    @Step
    public void validarMensajes(Parametros parametros) {
        multiplesAsesoresPage.validacionMensaje(parametros);
    }
}
