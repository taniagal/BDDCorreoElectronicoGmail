package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.TransaccionesDePolizaPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class TransaccionesDePolizaSteps extends ScenarioSteps{

    @Page
    TransaccionesDePolizaPage transaccionesDePolizaPage;

    public void irATransaccionesDePoliza() {
        transaccionesDePolizaPage.irATransaccionesDePoliza();
    }

    public void consultarTransaccionesDePolizaPorNumero(String numeroTransaccion) {
    }
}
