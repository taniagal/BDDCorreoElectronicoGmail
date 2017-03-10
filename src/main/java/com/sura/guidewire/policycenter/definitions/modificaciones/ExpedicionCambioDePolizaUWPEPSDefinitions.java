package com.sura.guidewire.policycenter.definitions.modificaciones;

import com.sura.guidewire.policycenter.steps.poliza.CotizacionMRCSteps;
import com.sura.guidewire.policycenter.steps.modificacion.ExpedicionCambioDePolizaUWPEPSSteps;
import com.sura.guidewire.policycenter.steps.poliza.ExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.GeneracionUwIssueRiesgosConsultablesPaSteps;
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

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Steps
    GeneracionUwIssueRiesgosConsultablesPaSteps generacionUwIssueRiesgosConsultablesPaSteps;

    @Given("existe una cotizacion <numeroCotizacion>")
    public void irABuscarCotizacion(@Named("numeroCotizacion") String cotizacion){
        expedicionDePolizaSteps.navegarBarraSuperior(cotizacion);
    }

    @Given("existe una cotizacion <numeroCotizacion> la cual se va a modificar")
    public void irAModificarCotizacion(@Named("numeroCotizacion") String numeroCotizacion){
        cotizacionMRCSteps.irABuscarCotizacionPoliza(numeroCotizacion);
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

    @Then("al ir a la opcion de analisis de riesgo")
    public void irAAnalisisDeRiesgo(){
        generacionUwIssueRiesgosConsultablesPaSteps.irAAnalisisDeRiesgo();
    }

    @Then("mostrar el mensaje <validacion> que devuelve el servicio")
    public void validarMensaje(@Named("validacion") String mensaje){
        expedicionCambioDePolizaUWPEPSSteps.validar_Mensaje_Que_Devuelve_El_Servicio_PEPS(mensaje);
    }

    @Then("concatenarlo con el texto $texto")
    public void concatenarMensaje(ExamplesTable texto){
        expedicionCambioDePolizaUWPEPSSteps.validar_Concatenacion_Mensaje(texto);
    }

    @Then("debo ver un UW issue para la figura indicada $mensaje")
    public void validarUWIssuePEP(ExamplesTable mensaje){
        generacionUwIssueRiesgosConsultablesPaSteps.validarQueSeGenereUwIssue(mensaje);
    }
}