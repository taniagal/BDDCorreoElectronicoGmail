package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.ExpedicionDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by jonamele on 07/06/2016.
 */
public class ExpedicionPolizaDefinitions {

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Given("Estoy ingresando la informacion de una poliza para ser expedida <numCuenta>")
    public void ingresaInformacionPoliza(@Named("numCuenta")String numCuenta) {
        expedicionDePolizaSteps.navegar_barra_superior(numCuenta);
    }

    @When(" vaya a expedir una poliza nueva para una propiedad comercial <nomProducto> donde el tomador sea un riesgo consultable")
    public void expidePolizaNombreComercial(@Named("nomProducto")String nomProducto) {
        expedicionDePolizaSteps.navega_barra_acciones();
        expedicionDePolizaSteps.navega_page_tipo_propiedad(nomProducto);
        expedicionDePolizaSteps.inicia_cotizacion_de_poliza_propiedad_comercial();

    }
    @Then(" Se debe bloquear la expedicion")
    public void thenSeDebeBloquearLaExpedicion() {

    }

    @Then("  debe mostrar el mensaje <mensaje>")
    public void thenDebeMostrarElMensajemensaje() {
        // PENDING
    }
}
