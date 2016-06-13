package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.ExpedicionDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class ExpedicionDePolizaDefinitions {

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Given("Que tengo una cotizacion <cotizacion> y voy a crear una poliza")
    public void ingresaInformacionPoliza(@Named("cotizacion")String cotizacion) {
        expedicionDePolizaSteps.navegar_barra_superior(cotizacion);
    }

    @When("voy a expedir una poliza")
    public void expedirPoliza() {
        expedicionDePolizaSteps.clic_en_expedir_poliza();
    }

    @When("confirmo el mensaje <mensaje> de expedir poliza")
    public void confirmarMensajeDeExpedirPoliza(@Named("mensaje") String mensaje) {
        expedicionDePolizaSteps.clic_en_aceptar_del_mensaje_de_confirmacion(mensaje);
    }

    @Then("debe mostrar el resumen de la poliza expedida con numero de la cotizacion <numCotizacion> y numero de poliza <poliza>")
    public void validarResumenDeLaPolizaExpedida(@Named("numCotizacion") String numCotizacion,
                                                 @Named("poliza") String poliza) {
        expedicionDePolizaSteps.validar_resumen_de_la_poliza_expedida(numCotizacion, poliza);
    }
}
