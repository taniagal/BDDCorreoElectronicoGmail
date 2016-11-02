package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.CancelacionPolizaClaimsSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CancelacionPolizaClaimsDefinitions {

    @Steps
    CancelacionPolizaClaimsSteps cancelacionPolizaClaimsSteps;

    @When("ingrese el motivo de perdida total y en claims tenga dicho <motivo>")
    @Alias("ingrese el motivo de perdida total y en claims tenga otro <motivo>")
    public void whenIngreseElMotivoDePerdidaTotalYEnClaimsTengaDichomotivo(@Named("motivo")String motivo) {
        cancelacionPolizaClaimsSteps.ingresar_motivo_de_cancelacion(motivo);
    }

    @When("quiera iniciar la cancelacion")
    public void whenQuieraIniciarLaCancelacion() {
        cancelacionPolizaClaimsSteps.iniciar_cancelacion();
    }

    @Then("debe permitir iniciar la cancelacion")
    public void thenDebePermitirIniciarLaCancelacion() {
        cancelacionPolizaClaimsSteps.valida_se_inicie_la_cancelacion();
    }

    @Then("no debe permitir iniciar la cancelacion <mensaje>")
    public void thenNoDebePermitirIniciarLaCancelacion(@Named("mensaje")String mensaje) {
        cancelacionPolizaClaimsSteps.valida_mensaje_inicio_cancelacion(mensaje);
    }

}
