package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.CambioEnExpedicionDePolizaSteps;
import com.sura.policycenter.selenium.steps.ExpedicionDePolizaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Manual;
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
        cambioEnExpedicionDePolizaSteps.clic_en_expedir_poliza();
    }

    @When("confirmo el mensaje de expedir cambio de poliza")
    public void confirmarMensajeDeExpedirPoliza() {
        cambioEnExpedicionDePolizaSteps.clic_en_aceptar_del_mensaje_de_confirmacion();
    }

    @Then("debe mostrar el resumen de la poliza expedida con la informacion del cambio <infoCambio>, poliza <infoPoliza>,  escritorio <escritorio>")
    public void confirma (@Named("infoCambio")String infoCambio,
                          @Named("infoPoliza")String infoPoliza,
                          @Named("escritorio")String escritorio){
        cambioEnExpedicionDePolizaSteps.validar_resumen_de_la_poliza_expedida(infoCambio, infoPoliza, escritorio);
    }

    @Then("cancelo el mensaje de expedir cambio de poliza")
    public void cancelarMensajeDeExpedirPoliza() {
        cambioEnExpedicionDePolizaSteps.clic_en_cancelar_del_mensaje_de_confirmacion();
    }


    @Manual
    @Then("se deben validar todos las etiquetas y mensajes del formulario <mensaje>")
    public void manual (@Named("mensaje")String mensaje){

    }

}
