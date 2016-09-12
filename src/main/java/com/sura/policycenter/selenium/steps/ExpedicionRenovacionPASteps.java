package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.renovacion.ExpedicionRenovacionPAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionRenovacionPASteps extends ScenarioSteps{

    private final ExpedicionRenovacionPAPage expedicionRenovacionPAPage = new ExpedicionRenovacionPAPage(getDriver());

    public ExpedicionRenovacionPASteps(Pages pages){
        super(pages);
    }

    @Step
    public void emitir_Renovacion() {
        expedicionRenovacionPAPage.emitirRenovacion();
    }

    @Step
    public void validar_Mensaje_Advertencia_De_Renovacion(ExamplesTable mensaje) {
        expedicionRenovacionPAPage.validarMensajeAdvertencia(mensaje);
    }

    @Step
    public void mostrar_El_Resumen_De_La_Renovacion() {
        expedicionRenovacionPAPage.mostrarResumenRenovacion();
    }

    @Step
    public void validar_Que_Se_Muestre_Mensaje_De_Renovacion_Realizada(String mensaje) {
        expedicionRenovacionPAPage.validarMensajeRenovacionRealizada(mensaje);
    }
}
