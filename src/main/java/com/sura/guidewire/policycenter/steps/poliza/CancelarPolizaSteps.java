package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.CancelarPolizaPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CancelarPolizaSteps {
    @Page
    CancelarPolizaPage cancelarPolizaPage;
    @Step
    public void cancelarPoliza() throws InterruptedException {
        cancelarPolizaPage.cancelarPoliza();
    }
@Step
    public void consultarParaCancelar() {
        cancelarPolizaPage.consultarParaCancelar();
    }
}
