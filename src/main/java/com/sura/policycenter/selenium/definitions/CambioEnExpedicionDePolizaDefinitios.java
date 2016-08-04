package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ExpedicionDePolizaSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

public class CambioEnExpedicionDePolizaDefinitios {

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Step

    @Given("Que tengo una cotizacion <cotizacion>")
    public void givenQueTengoUnaCotizacioncotizacion(@Named("cotizacion")String cotizacion) {
        expedicionDePolizaSteps.navegar_barra_superior(cotizacion);
    }

    @When("quiera realizar una modificacion permitida")
    public void givenQuieraModificarla() {
        // PENDING
    }
}
