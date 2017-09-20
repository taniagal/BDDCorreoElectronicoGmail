package com.sura.guidewire.policycenter.definitions.cancelacion;

import com.sura.guidewire.policycenter.steps.cancelacion.CancelacionPolizaRetroactivaSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CancelacionPolizaRetroactivaDefinitions {

    @Steps
    CancelacionPolizaRetroactivaSteps cancelacionPolizaRetroactivaSteps;

    @Given("carga de aplicacion: $urlAmbiente")
    public void cargaAplicacion(String urlAmbiente) {
        cancelacionPolizaRetroactivaSteps.cargaAmbiente(urlAmbiente);
    }

    @When("se va a loguear en PolicyCenter Lab: $country, $user y $password se debe mostrar: $message")
    public void loguearPolicyLaboratorio(String country, String user, String password, String message) {
        pcs.loginSeus(country, user, password);
        pcs.assertion(message);
    }

    @Then("voy a cerrar sesion de policy lab")
    public void cerrarSesionPolicyLab() {
        cancelacionPolizaRetroactivaSteps.cerrarSesionClaims();
    }
}