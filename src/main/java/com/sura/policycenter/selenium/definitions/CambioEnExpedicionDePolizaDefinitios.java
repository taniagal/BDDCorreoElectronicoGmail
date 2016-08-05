package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ExpedicionDePolizaSteps;
import com.sura.policycenter.selenium.steps.InformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

public class CambioEnExpedicionDePolizaDefinitios {

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Steps
    InformacionDeVehiculoSteps informacionDeVehiculoSteps;


    @Given("Que tengo una cotizacion <cotizacion>")
    public void givenQueTengoUnaCotizacioncotizacion(@Named("cotizacion")String cotizacion) {
        expedicionDePolizaSteps.navegar_barra_superior(cotizacion);
    }

    @When("quiera realizar una modificacion permitida <valorAccesorio> <valorAccesorioEsp>")
    public void givenQuieraModificarla(@Named("valorAccesorio")String valorAccesorio,
                                       @Named("valorAccesorioEsp")String valorAccesorioEsp) {

        informacionDeVehiculoSteps.ingresar_valores_accesorios(valorAccesorio, valorAccesorioEsp);
    }
}
