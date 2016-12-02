package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.CambioEnExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.ExpedicionDePolizaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class CambioEnExpedicionDePolizaDefinitios {

    @Managed
    WebDriver driver;

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Steps
    CambioEnExpedicionDePolizaSteps cambioEnExpedicionDePolizaSteps;


    @Given("Que tengo una cotizacion <cotizacion>")
    public void givenQueTengoUnaCotizacioncotizacion(@Named("cotizacion")String cotizacion) {
        expedicionDePolizaSteps.navegar_barra_superior(cotizacion);
    }


    @When("cuando vaya expedir el cambio de una poliza")
    public void expedirCambioDePoliza(){
        cambioEnExpedicionDePolizaSteps.clicEnExpedirPoliza();
    }

    @When("confirmo el mensaje de expedir cambio de poliza")
    public void confirmarMensajeDeExpedirPoliza() {
        cambioEnExpedicionDePolizaSteps.clicEnAceptarDelMensajeDeConfirmacion();
    }

    @Then("debe mostrar el resumen de la poliza expedida con la informacion del cambio <infoCambio>, poliza <infoPoliza>,  escritorio <escritorio>")
    public void confirma (@Named("infoCambio")String infoCambio,
                          @Named("infoPoliza")String infoPoliza,
                          @Named("escritorio")String escritorio){
        cambioEnExpedicionDePolizaSteps.validarResumenDeLaPolizaExpedida(infoCambio, infoPoliza, escritorio);
    }

    @Then("cancelo el mensaje de expedir cambio de poliza")
    public void cancelarMensajeDeExpedirPoliza() {
        cambioEnExpedicionDePolizaSteps.clicEnCancelarDelMensajeDeConfirmacion();
    }

}
