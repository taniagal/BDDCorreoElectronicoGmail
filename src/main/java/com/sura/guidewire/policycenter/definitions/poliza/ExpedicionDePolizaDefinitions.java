package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.ExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.colectivas.PolizaPrincipalPaSteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class ExpedicionDePolizaDefinitions {

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Steps
    PolizaPrincipalPaSteps polizaPrincipalPaSteps;

    @Given("Que tengo una cotizacion <cotizacion> y voy a crear una poliza")
    public void ingresaInformacionPoliza(@Named("cotizacion")String cotizacion) {
        expedicionDePolizaSteps.navegarBarraSuperior(cotizacion);
    }

    @When("voy a expedir una poliza")
    public void expedirPoliza() {
        expedicionDePolizaSteps.clicEnExpedirPoliza();
    }

    @Then("voy a expedir una poliza")
    public void expedirPolizaDos() {
        expedicionDePolizaSteps.clicEnExpedirPoliza();
    }

    @When("voy a expedir una poliza por cambio")
    public void expedirPolizaCambio() {
        expedicionDePolizaSteps.clic_en_expedir_poliza_por_cambio();
    }


    @When("confirmo el mensaje de expedir poliza")
    public void confirmarMensajeDeExpedirPoliza() {
        expedicionDePolizaSteps.clicEnAceptarDelMensajeDeConfirmacion();
    }

    @Then("confirmo el mensaje de expedir poliza")
    public void confirmarMensajeDeExpedirPolizaDos() {
        expedicionDePolizaSteps.clicEnAceptarDelMensajeDeConfirmacion();
    }

    @When("confirmo el mensaje de expedir poliza con requisitos")
    public void confirmarMensajeDeExpedirPolizaConRequisitosPendientes() {
        expedicionDePolizaSteps.clicEnAceptarDelMensajeDeConfirmacionYRequisitos();
    }

    @When("ingrese a ver cotizacion de poliza expedida")
    public void cuandoIngreseAVerCotizacionDePolizExpedida(){
        expedicionDePolizaSteps.clicEnVerCotizacion();
    }

    @When("valide la solicitud de requisitos <requisitos>")
    public void validarSolicitudRequisitos(@Named("requisitos") String requisitos) {
        expedicionDePolizaSteps.validarMensajeRequisitos(requisitos);
    }

    @When("cancelo el mensaje <mensaje> de expedir poliza")
    public void cancelarExpedicionDePoliza(@Named("mensaje") String mensaje){
        expedicionDePolizaSteps.clicEnCancelarDelMensajeDeConfirmacion(mensaje);
    }

    @Then("debe mostrar el resumen de la poliza expedida con la informacion de cotizacion <infoCotizacion>")
    public void validarResumenDeLaPolizaExpedida(@Named("infoCotizacion") String infoCotizacion) {
        expedicionDePolizaSteps.validarResumenDeLaPolizaExpedida(infoCotizacion);
    }

    @Then("El proceso se debe frenar y debe mostrar el mensaje de error <mensaje> y <mensaje2>")
    public void validarMensajesDeRiesgos(@Named("mensaje") String mensaje, @Named("mensaje2") String mensaje2) {
        expedicionDePolizaSteps.validar_mensaje_direccion(mensaje);
        expedicionDePolizaSteps.validar_mensaje_direccion(mensaje2);
        polizaPrincipalPaSteps.validarMenuOpcionFormulariosNoEsVisible();
    }

    @Then("El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>")
    public void validarMensajeDeRiesgos(@Named("mensaje") String mensaje) {
        expedicionDePolizaSteps.validar_mensaje(mensaje);
    }

    @SuppressWarnings("EmptyMethod")
    @Then("debe enviar un mensaje a un buzon previamente configurado cuando existe un interes adicional riesgo consultable")
    @Manual
    public void validacionBeneficiarioRiesgoConsultable() {
        // Se realiza manualmente.
    }
}
