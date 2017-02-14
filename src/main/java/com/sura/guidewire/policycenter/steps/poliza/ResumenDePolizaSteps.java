package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.ResumenDePolizaPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class ResumenDePolizaSteps {

    @Page
    private ResumenDePolizaPage resumenDePolizaPage;


    @Step
    public void ingresarAResumen() {
        resumenDePolizaPage.ingresoAResumen();
    }


    @Step
    public void visualizacionPoliza() {
        resumenDePolizaPage.visualizarPoliza();
    }


    @Step
    public void verificacionDeCamposResumen(ExamplesTable datosAverificar) {
        resumenDePolizaPage.verificacionDeCampos(datosAverificar);
    }


}
