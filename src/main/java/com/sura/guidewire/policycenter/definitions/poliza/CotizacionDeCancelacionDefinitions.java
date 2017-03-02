package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.cancelacion.CotizacionDeCancelacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CotizacionDeCancelacionDefinitions {

    @Steps
    CotizacionDeCancelacionSteps cotizacionDeCancelacionSteps;

    @When("realice el proceso de cancelacion completo")
    public void whenRealiceElProcesoDeCancelacionCompleto() {
        cotizacionDeCancelacionSteps.llenar_formulario_cancelacion();
    }

    @Then("se deben mostrar los campos informativos de la cancelacion")
    public void thenSeDebenMostrarLosCamposInformativosDeLaCancelacion() {
        cotizacionDeCancelacionSteps.validar_campos_en_formulario_de_cancelacion();
    }
}
