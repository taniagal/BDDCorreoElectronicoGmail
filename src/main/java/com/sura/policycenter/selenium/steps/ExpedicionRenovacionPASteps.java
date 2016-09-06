package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.renovacion.ExpedicionRenovacionPAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionRenovacionPASteps extends ScenarioSteps{

    private final ExpedicionRenovacionPAPage expedicionRenovacionPAPage = new ExpedicionRenovacionPAPage(getDriver());

    @Step
    public void emitir_Renovacion() {
        expedicionRenovacionPAPage.emitirRenovacion();
    }

    @Step
    public void validar_Mensaje_Advertencia_De_Renovacion(ExamplesTable mensaje) {
        expedicionRenovacionPAPage.validarMensajeAdvertencia(mensaje);
    }
}
