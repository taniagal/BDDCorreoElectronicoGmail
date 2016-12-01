package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.ExpedicionDePolizaSteps;
import net.thucydides.core.annotations.Manual;
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

    @When("voy a expedir una poliza por cambio")
    public void expedirPolizaCambio() {
        expedicionDePolizaSteps.clic_en_expedir_poliza_por_cambio();
    }


    @When("confirmo el mensaje de expedir poliza")
    public void confirmarMensajeDeExpedirPoliza() {
        expedicionDePolizaSteps.clic_en_aceptar_del_mensaje_de_confirmacion();
    }
    @When("ingrese a ver cotizacion de poliza expedida")
    public void cuandoIngreseAVerCotizacionDePolizExpedida(){
        expedicionDePolizaSteps.clic_en_ver_cotizacion();
    }

    @When("valide la solicitud de requisitos")
    public void validarSolicitudRequisitos() {
        expedicionDePolizaSteps.validarMensajeRequisitos();
    }

    @When("cancelo el mensaje <mensaje> de expedir poliza")
    public void cancelarExpedicionDePoliza(@Named("mensaje") String mensaje){
        expedicionDePolizaSteps.clic_en_cancelar_del_mensaje_de_confirmacion(mensaje);
    }


    @Then("debe mostrar el resumen de la poliza expedida con la informacion de cotizacion <infoCotizacion>, poliza <infoPoliza>, administrador de contizaciones <admorCotizacion>, nueva cotizacion <nuevaCotizacion>, escritorio <escritorio>")
    public void validarResumenDeLaPolizaExpedida(@Named("infoCotizacion") String infoCotizacion,
                                                 @Named("infoPoliza") String infoPoliza,
                                                 @Named("admorCotizacion") String admorCotizacion,
                                                 @Named("nuevaCotizacion") String nuevaCotizacion,
                                                 @Named("escritorio") String escritorio) {
        expedicionDePolizaSteps.validar_resumen_de_la_poliza_expedida(infoCotizacion, infoPoliza, admorCotizacion,
                                                                      nuevaCotizacion, escritorio);
    }

    @Then("El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>")
    public void validarMensajeDeRiesgos(@Named("mensaje") String mensaje) {
        expedicionDePolizaSteps.validar_mensaje(mensaje);
    }

    @Then("debe volver a la pantalla de cotizacion")
    public void validarCancelacionDeExpedicionDePoliza(){
        expedicionDePolizaSteps.validar_que_vuelve_a_la_ventana_de_cotizacion();
    }


    @SuppressWarnings("EmptyMethod")
    @Then("debe enviar un mensaje a un buzon previamente configurado cuando existe un interes adicional riesgo consultable")
    @Manual
    public void validacionBeneficiarioRiesgoConsultable() {
        // Se realiza manualmente.
    }
}
