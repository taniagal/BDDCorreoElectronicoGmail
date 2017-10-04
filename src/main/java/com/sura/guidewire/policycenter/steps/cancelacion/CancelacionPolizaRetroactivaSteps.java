package com.sura.guidewire.policycenter.steps.cancelacion;

import com.sura.guidewire.policycenter.pages.cancelacion.CancelacionPolizaRetroactivaPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

public class CancelacionPolizaRetroactivaSteps extends ScenarioSteps {

    @Page
    CancelacionPolizaRetroactivaPage cancelacionPolizaRetroactivaPage;

    @Step
    public void cargaAmbiente(String contexto) {
        cancelacionPolizaRetroactivaPage.accesoAplicativo(contexto);
    }

    @Step
    public void cerrarSesionClaims(){

        cancelacionPolizaRetroactivaPage.cerrarSesionClaims();
    }
    @Step
    public void capturarNumeroCotizacion(){
        cancelacionPolizaRetroactivaPage.capturarNumeroCotizacion();
    }

    @Step
    public void capturarNumeroCotizacionModificacion() {
        cancelacionPolizaRetroactivaPage.capturarNumeroCotizacionModificacion();

    }
}
