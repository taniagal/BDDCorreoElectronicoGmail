package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.CotizacionSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;


public class CotizacionDefinitions {

    @Steps
    CotizacionSteps cotizador;

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;


    @Then("en cotizacion de poliza debe estar en estado <estadodos> las siguientes opciones $menusesperados")
    public void entoncesEnCotizacionDePolizaDebenEstarEnEstado(@Named("estadouno") String estadouno, @Named("estadodos") String estadodos, ExamplesTable menusesperados) {
        cotizador.validarCamposCotizacionPoliza(estadouno, estadodos, menusesperados);
    }

    @When("comience una nueva cotizacion con cuenta <cuenta> y agente <agente>")
    public void comenzarCotizacion(@Named("cuenta") String cuenta, @Named("agente") String agente) {
        nuevaCotizacionSteps.irANuevaCotizacion();
        nuevaCotizacionSteps.seleccionarAgente(cuenta, agente);
    }

    @Then("debo poder ver la fecha efectiva de la cotizacion")
    public void verificarFechaEfectivaDeCotizacion() {
        nuevaCotizacionSteps.verificarFechaEfectivaDeCotizacion();
    }
}
