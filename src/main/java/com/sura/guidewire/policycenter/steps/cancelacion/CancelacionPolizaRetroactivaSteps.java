package com.sura.guidewire.policycenter.steps.cancelacion;

import com.sura.guidewire.policycenter.pages.cancelacion.CancelacionPolizaRetroactivaPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class CancelacionPolizaRetroactivaSteps {

    @Steps
    CancelacionPolizaRetroactivaPage cancelacionPolizaRetroactivaPage;

    @Step
    public void cargaAmbiente(String contexto) {
        cancelacionPolizaRetroactivaPage.accesoAplicativo(contexto);
    }

    @Step
    public void cerrarSesionClaims(){
        cancelacionPolizaRetroactivaPage.cerrarSesionClaims();
    }
}
