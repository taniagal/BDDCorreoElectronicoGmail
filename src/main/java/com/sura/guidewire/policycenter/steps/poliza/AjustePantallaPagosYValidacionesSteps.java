package com.sura.guidewire.policycenter.steps.poliza;


import com.sura.guidewire.policycenter.pages.poliza.AjustePantallaPagosYValidacionesPage;
import com.sura.guidewire.policycenter.utils.Parametros;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

public class AjustePantallaPagosYValidacionesSteps extends ScenarioSteps {

    @Page
    AjustePantallaPagosYValidacionesPage ajustePantallaPagosYValidacionesPage;

    @Step
    public void seleccionarArticuloFlotante(Parametros parametros) {
        ajustePantallaPagosYValidacionesPage.seleccionarArticuloFlotante(parametros);
    }

    @Step
    public void validacionDatosDePantallaPago(Parametros parametros) {
        ajustePantallaPagosYValidacionesPage.validacionDatosDePantalla(parametros);
    }

    @Step
    public void seleccionarPlanInformacionPrimas(Parametros parametros) {
        ajustePantallaPagosYValidacionesPage.seleccionarPlanInformacionPrimas(parametros);
    }
}
