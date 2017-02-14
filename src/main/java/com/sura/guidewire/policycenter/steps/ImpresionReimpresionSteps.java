package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.ImpresionReimpresionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;


public class ImpresionReimpresionSteps extends ScenarioSteps {
    @Page
    ImpresionReimpresionPage impresionReimpresionPage;

    @Step
    public void irATransaccionesDePoliza() {
        impresionReimpresionPage.irATransaccionesDePoliza();
    }

    @Step
    public void validarBotonReimpresion() {
        impresionReimpresionPage.validarBotonReimpresion();
    }

    public void seleccionarTransaccionesDeCuenta() {

    }

    public void expedirRenovacionPoliza() {
    }
}
