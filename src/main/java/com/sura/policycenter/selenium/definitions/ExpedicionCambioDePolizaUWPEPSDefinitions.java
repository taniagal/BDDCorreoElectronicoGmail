package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.ExpedicionCambioDePolizaUWPEPSSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionCambioDePolizaUWPEPSDefinitions {

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    ExpedicionCambioDePolizaUWPEPSSteps expedicionCambioDePolizaUWPEPSSteps;

    @Given("existe una cotizacion <numeroCotizacion>")
    public void irABuscarCotizacion(@Named("numeroCotizacion") String numeroCotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(numeroCotizacion);
    }

    @Given("existe una cotizacion <numeroCotizacion> la cual se va a modificar")
    public void irAModificarCotizacion(@Named("numeroCotizacion") String numeroCotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(numeroCotizacion);
    }

    @Given("el tomador <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS")
    public void validarTomadorPEP(@Named("tipoDocumento") String tipoDocumento,
                                       @Named("numeroDocumento") String numeroDocumento){
        expedicionCambioDePolizaUWPEPSSteps.validar_Figuras_Igual_DNI(tipoDocumento, numeroDocumento);
    }

    @Given("el asegurado <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS")
    public void validarAseguradoPEP(@Named("tipoDocumento") String tipoDocumento,
                                    @Named("numeroDocumento") String numeroDocumento){
        expedicionCambioDePolizaUWPEPSSteps.validar_Figuras_Igual_DNI(tipoDocumento, numeroDocumento);
    }

    @Given("el beneficiario <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS")
    public void validarBeneficiarioPEP(@Named("tipoDocumento") String tipoDocumento,
                                       @Named("numeroDocumento") String numeroDocumento){
        expedicionCambioDePolizaUWPEPSSteps.validar_Figuras_Igual_DNI(tipoDocumento, numeroDocumento);
    }

    @Given("se identifica como riesgo PEPS")
    public void validarRiesgoPEP(@Named("tipoDocumento") String tipoDocumento,
                                 @Named("numeroDocumento") String numeroDocumento){
        expedicionCambioDePolizaUWPEPSSteps.validar_Figuras_Igual_DNI(tipoDocumento, numeroDocumento);
    }

    @When("intente expedir la poliza")
    public void emitirPoliza(){
        expedicionCambioDePolizaUWPEPSSteps.emitir_poliza();
    }

    @Then("se debe generar un UW issue")
    public void irAPantallaUW(){
        expedicionCambioDePolizaUWPEPSSteps.ir_A_Pantalla_UW();
    }

    @Then("mostrar el mensaje <mensaje> que devuelve el servicio")
    public void validarMensaje(@Named("mensaje") String mensaje){
        expedicionCambioDePolizaUWPEPSSteps.validar_Mensaje_Que_Devuelve_El_Servicio_PEPS(mensaje);
    }

    @Then("concatenarlo con el texto $texto")
    public void concatenarMensaje(ExamplesTable texto){
        expedicionCambioDePolizaUWPEPSSteps.validar_Concatenacion_Mensaje(texto);
    }
}
