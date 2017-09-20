package com.sura.guidewire.policycenter.definitions.cancelacion;

import com.sura.guidewire.policycenter.steps.cancelacion.CancelacionPolizaRetroactivaSteps;
import com.sura.guidewire.policycenter.steps.cancelacion.ProcesoDeCancelacionSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.commons.PolicySteps;
import com.sura.guidewire.policycenter.steps.poliza.AjustePantallaPagosYValidacionesSteps;
import com.sura.guidewire.policycenter.steps.poliza.BusquedaDePolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.PolizaSteps;
import com.sura.guidewire.policycenter.steps.renovacion.AjustesDeReglasRenovacionMrcSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.ModificadoresDeTarifaSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import com.sura.guidewire.policycenter.utils.Utils;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
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


    @Given("carga de aplicacion: $urlAmbiente")
    public void cargaAplicacion(String urlAmbiente) {
        cancelacionPolizaRetroactivaSteps.cargaAmbiente(urlAmbiente);
    }

    @When("se va a loguear en PolicyCenter Lab: $country, $user y $password se debe mostrar: $message")
    public void loguearPolicyLaboratorio(String country, String user, String password, String message) {
        policySteps.loginSeus(country, user, password);
        policySteps.assertion(message);
    }
    @When("voy a cotizar poliza de autos: $datosCotizacion")
    public void nuevaPoliza(ExamplesTable datosCotizacion) {
        nuevaCotizacionSteps.irANuevaCotizacion();
        nuevaCotizacionSteps.seleccionarProducto(datosCotizacion);
    }
    @When("ingrese datos del asegurado <tipo_documento> <documento>")
    public void agregarDatosAsegurado(@Named("tipo_documento") String tipoDocumento, @Named("documento") String documento) {
        tarifaAutosSteps.agregarAsegurados(tipoDocumento, documento);
    }
    @When("ingrese los datos del vehiculo que se va asegurar: $datosVehiculo")
    public void ingresarVehiculo(ExamplesTable datosVehiculo) {
        modificadoresDeTarifaSteps.agregarVehiculo(datosVehiculo);
    }
    @When("de clic a la pantalla de coberturas")
    public void seleccionarBotonSiguiente() {
        tarifaAutosSteps.seleccionarBotonSiguiente();
    }
    @When("seleccione todas las coberturas del plan asociado: $coberturas")
    public void agregarTodasLasCoberturasDeComision(ExamplesTable coberturas) {
        tarifaAutosSteps.seleccionarCoberturasComisionPactada(coberturas);
    }
    @When("expida la poliza y capture el numero")
    public void expedirYCapturarPoliza() {
        tasaUnicaSteps.expedirPolizaUAT();
        Serenity.setSessionVariable("numeroPoliza".toLowerCase().trim()).to(buscarNumeroPoliza.capturarNumeroPoliza());
    }
    @When("se aprueba la cancelacion de la poliza $dataTable")
    public void aprobarCancelacion(ExamplesTable dataTable){
        polizaSteps.seleccionarBotonAcciones().seleccionarCancelarPoliza();
        polizaSteps.ingresarMotivosCancelacion(dataTable.getRow(0).get("motivo"), dataTable.getRow(0).get("descripcion"));
        polizaSteps.ingresarFechaCancelacion(Utils.sumarDiasALaFechaActual(0));
        polizaSteps.iniciarCancelacionFacultativo();
        polizaSteps.efectuarCancelacion();
        if (dataTable.getRow(0).get("descripcion").contains("cotizador")) {
            procesoDeCancelacionSteps.darClicBotonDetalle();
            ajustesDeReglasRenovacionMrcSteps.realizarAprobacionEspecialConVariasObservaciones();
            polizaSteps.cliquearOpcionCompromiso();
        }
        polizaSteps.ingresarResumenCancelacionPoliza();
    }

    @Then("voy a cerrar sesion de policy lab")
    public void cerrarSesionPolicyLab() {
        cancelacionPolizaRetroactivaSteps.cerrarSesionClaims();
    }
}