package com.sura.guidewire.policycenter.definitions.cancelacion;

import com.sura.guidewire.policycenter.steps.cancelacion.CancelacionPolizaRetroactivaSteps;
import com.sura.guidewire.policycenter.steps.cancelacion.ProcesoDeCancelacionSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.commons.PolicySteps;
import com.sura.guidewire.policycenter.steps.poliza.BusquedaDePolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.PolizaSteps;
import com.sura.guidewire.policycenter.steps.renovacion.AjustesDeReglasRenovacionMrcSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.ModificadoresDeTarifaSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import com.sura.guidewire.policycenter.utils.Utils;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;

public class CancelacionPolizaRetroactivaDefinitions {

    @Steps
    CancelacionPolizaRetroactivaSteps cancelacionPolizaRetroactivaSteps;
    @Steps
    PolicySteps policySteps;
    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;
    @Steps
    TarifaAutosSteps tarifaAutosSteps;
    @Steps
    ModificadoresDeTarifaSteps modificadoresDeTarifaSteps;
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;
    @Steps
    BusquedaDePolizaSteps buscarNumeroPoliza;
    @Steps
    PolizaSteps polizaSteps;
    @Steps
    ProcesoDeCancelacionSteps procesoDeCancelacionSteps;
    @Steps
    AjustesDeReglasRenovacionMrcSteps ajustesDeReglasRenovacionMrcSteps;


    @Given("carga de aplicacion de Policy: $urlAmbiente")
    public void cargaAplicacion(String urlAmbiente) {
        cancelacionPolizaRetroactivaSteps.cargaAmbiente(urlAmbiente);
    }

    @When("logueo en PolicyCenter Lab: $country, $user y $password se debe mostrar: $message")
    public void loguearPolicyLaboratorio(String country, String user, String password, String message) {
        policySteps.loginSeus(country, user, password);
        policySteps.assertion(message);
    }
    @When("voy a cotizar poliza de autos individual: $datosCotizacion")
    public void nuevaPoliza(ExamplesTable datosCotizacion) {
        nuevaCotizacionSteps.irANuevaCotizacion();
        nuevaCotizacionSteps.seleccionarProducto(datosCotizacion);
    }
    @When("ingrese datos del asegurado de policy <tipo_documento> <documento>")
    public void agregarDatosAsegurado(@Named("tipo_documento") String tipoDocumento, @Named("documento") String documento) {
        tarifaAutosSteps.agregarAsegurados(tipoDocumento, documento);
    }
    @When("ingrese los datos del vehiculo que va asegurar: $datosVehiculo")
    public void ingresarVehiculo(ExamplesTable datosVehiculo) {
        modificadoresDeTarifaSteps.agregarVehiculo(datosVehiculo);
    }
    @When("clic a la pantalla de coberturas")
    public void seleccionarBotonSiguiente() {

        tarifaAutosSteps.seleccionarBotonSiguiente();
    }
    @When("seleccione todas las coberturas del plan: $coberturas")
    public void agregarTodasLasCoberturasDeComision(ExamplesTable coberturas) {
        tarifaAutosSteps.seleccionarCoberturasComisionPactada(coberturas);
    }
    @When("expedir poliza y capturar el numero")
    public void expedirYCapturarPoliza() {
        tasaUnicaSteps.expedirPolizaUAT();
        Serenity.setSessionVariable("numeroPoliza".toLowerCase().trim()).to(buscarNumeroPoliza.capturarNumeroPoliza());
    }
    @When("expedir la poliza de autos")
    public void expedirPoliza() {
        tasaUnicaSteps.expedirPolizaUAT();
    }

    @When("capturar el numero de cotizacion")
    public void capturarNumeroCotizacionPoliza() {
        cancelacionPolizaRetroactivaSteps.capturarNumeroCotizacion();
    }

    @Given("capturar el numero de cotizacion en estado borrador")
    public void capturarCotizacionBorrador(){
        cancelacionPolizaRetroactivaSteps.capturarNumeroCotizacion();
    }

    @When("capturar el numero de cotizacion en estado borrador")
    public void capturarCotizacion(){
        cancelacionPolizaRetroactivaSteps.capturarNumeroCotizacion();
    }

    @When("capturar el numero de cotizacion en estado borrador en la modificacion")
    public void capturarCotizacionModificacion(){
        cancelacionPolizaRetroactivaSteps.capturarNumeroCotizacionModificacion();
    }
    @When("aprobar la cancelacion de la poliza $dataTable")
    public void aprobarCancelacion(ExamplesTable dataTable){
        polizaSteps.seleccionarBotonAcciones().seleccionarCancelarPoliza();
        polizaSteps.ingresarMotivosCancelacion(dataTable.getRow(0).get("motivo"), dataTable.getRow(0).get("descripcion"));
        polizaSteps.validarBotonCancelarPoliza(dataTable.getRow(0).get("motivo"), dataTable.getRow(0).get("descripcion"));
        polizaSteps.ingresarFechaCancelacion(Utils.sumarDiasALaFechaActual(Integer.parseInt(dataTable.getRow(0).get("Fecha"))));
        polizaSteps.iniciarCancelacionFacultativo();
        polizaSteps.efectuarCancelacion();
        if (dataTable.getRow(0).get("descripcion").contains("cotizador")) {
            procesoDeCancelacionSteps.darClicBotonDetalle();
            ajustesDeReglasRenovacionMrcSteps.realizarAprobacionEspecialConVariasObservaciones();
            polizaSteps.cliquearOpcionCompromiso();
        }
    }
    @When("voy al resumen de la poliza")
    public void verResumenPoliza(){
        polizaSteps.verResumenDeLaPolizaExpedida();
    }

    @Then("voy a cerrar sesion de policy lab")
    public void cerrarSesionPolicyLab() {
        cancelacionPolizaRetroactivaSteps.cerrarSesionClaims();
    }
}