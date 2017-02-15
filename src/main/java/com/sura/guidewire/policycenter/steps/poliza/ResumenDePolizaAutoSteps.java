package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.ResumenDePolizaAutoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class ResumenDePolizaAutoSteps {

    @Page
    private ResumenDePolizaAutoPage resumenDePolizaAutoPage;

    @Step
    public void visualizacionPoliza() {
        resumenDePolizaAutoPage.visualizarPoliza();
    }
    
    @Step
    public void verificacionDeCamposResumen(ExamplesTable datosAverificar) {
        resumenDePolizaAutoPage.verificacionDeCampos(datosAverificar);
    }

    @Step
    public void verificarCamposCoaseguro(ExamplesTable datos) {
        resumenDePolizaAutoPage.verificoCamposCoaseguro(datos);
    }


}
