package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CotizacionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.CotizacionMRCSteps;
import com.sura.guidewire.policycenter.steps.DetalleDeAseguradoDeCotizacionSteps;
import com.sura.guidewire.policycenter.steps.InformacionDePolizaMrcSteps;
import net.thucydides.core.annotations.Steps;
import org.eclipse.jetty.util.annotation.Name;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.HashMap;
import java.util.Map;


public class CotizacionMRCDefinitions {

    private final Map<String, String> labelsCotizacionPoliza = new HashMap<>();

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    CotizacionDePolizaSteps cotizacionDePolizaSteps;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @Steps
    DetalleDeAseguradoDeCotizacionSteps detalleDeAseguradoDeCotizacionSteps;

    public CotizacionMRCDefinitions(){
        labelsCotizacionPoliza.put("numeroCotizacion", "Número de cotización");
        labelsCotizacionPoliza.put("vigenciaPoliza", "Vigencia de la póliza");
        labelsCotizacionPoliza.put("tomador", "Tomador");
        labelsCotizacionPoliza.put("tipoDocumento", "Tipo documento");
        labelsCotizacionPoliza.put("numeroDocumento", "Número documento");
        labelsCotizacionPoliza.put("direccion", "Dirección");
        labelsCotizacionPoliza.put("tipoDireccion", "Tipo de dirección");
        labelsCotizacionPoliza.put("descripcionDireccion", "Descripción de la dirección");
        labelsCotizacionPoliza.put("empresaAseguradora", "Empresa aseguradora");
        labelsCotizacionPoliza.put("primaTotal", "Prima total");
        labelsCotizacionPoliza.put("impuestos", "Iva");
        labelsCotizacionPoliza.put("costoTotal", "Costo total");
        labelsCotizacionPoliza.put("tabPrimaPoliza", "Prima de póliza");
        labelsCotizacionPoliza.put("botonAnularClasificacion", "Anular clasificación");
        labelsCotizacionPoliza.put("primas", "Primas");
        labelsCotizacionPoliza.put("columnaConsecutivo", "#");
        labelsCotizacionPoliza.put("columnaDescripcion", "Descripción");
        labelsCotizacionPoliza.put("columnaMonto", "Monto");
        labelsCotizacionPoliza.put("otrosCargos", "Otros cargos");
        labelsCotizacionPoliza.put("columnaDescripcionCargos", "Descripción");
        labelsCotizacionPoliza.put("columnaEstadoCargos", "Estado");
        labelsCotizacionPoliza.put("columnaMontoCargos", "Monto");
    }


    @Given("se ha realizado la cotizacion MRC <cotizacion>")
    public void givenIrALaCotizacion(@Named("cotizacion") String cotizacion) {
        cotizacionMRCSteps.irABuscarCotizacionPoliza(cotizacion);
    }

    @Given("se registraron los riesgos y coberturas que se desean cotizar <cotizacion>")
    public void buscarCotizacionBorrador(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.irABuscarCotizacionPoliza(cotizacion);
    }

    @When("ingrese a consultar la cotizacion")
    public void consultarCotizacion(){
        cotizacionMRCSteps.verDetalleCotizacion();
    }

    @When("realice la cotizacion")
    public void ingresarACotizacion(){
        cotizacionMRCSteps.ingresarACotizacion();
    }

    @When("los participantes y/o ubicaciones sean riesgo consultable")
    public void validarTipoRiesgo(){
        cotizacionMRCSteps.validarTipoRiesgo();
    }

    @When("los participantes (tomador, asegurado y/o beneficiario) sean identificados como PEP")
    public void validarRiesgoPEP(){
        cotizacionMRCSteps.validarTipoRiesgo();
    }

    @When("ya exista una cotizacion en estado cotizado del mismo cliente, para el producto Multiriesgo corporativo con un\n" +
            "agente diferente al que se ingreso")
    public void validarExclusividadCotizacion(){
        cotizacionMRCSteps.validarTipoRiesgo();
    }

    @When("voy a crear una nueva cotizacion")
    public void irACrearCotizacion(){
        detalleDeAseguradoDeCotizacionSteps.irACrearNuevaCotizacion();
    }

    @When("crear una cotizacion nueva con la cuenta <cuenta>")
    public void crearCotizacion(@Named("cuenta") String cuenta){
        detalleDeAseguradoDeCotizacionSteps.ingresarCuenta(cuenta);
    }

    @Then("debo ver la informacion de la cotizacion $informacionCotizacion")
    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion){
        cotizacionMRCSteps.validarInformacionCotizacion(labelsCotizacionPoliza, informacionCotizacion);
    }

    @Then("debo ver la prima <primaTotal> a cobrar al cliente")
    public void validarPrimaTotal(@Named("primaTotal") String primaTotal){
        cotizacionMRCSteps.validarPrima(primaTotal);
    }

    @Then("se muestre el detalle de la prima por riesgo")
    public void mostrarDetallePrima(){
        cotizacionMRCSteps.mostrarDetallePrimaPorRiesgo(labelsCotizacionPoliza);
    }

    @Then("no debe permitir cotizar; se debe mostrar el mensaje de respuesta <mensaje> que envie riesgos consultables")
    public void validarBloqueoCotizacionMRC(@Named("mensaje") String mensaje) {
        cotizacionMRCSteps.validarBloqueoCotizacion(mensaje);
    }

    @Then("no debe permitir cotizar; se debe mostrar el mensaje de respuesta <mensajePEP> que envie PEP")
    public void validarBloqueoPEP(@Named("mensajePEP") String mensaje) {
        cotizacionMRCSteps.validarBloqueoCotizacion(mensaje);
    }

    @Then("no debe permitir cotizar; se debe mostrar el mensaje de error <mensaje>")
    public void validarBloqueoExclusividad(@Named("mensaje") String mensaje) {
        cotizacionMRCSteps.validarBloqueoExclusividad(mensaje);
    }

    @Then("se debe generar un UW issue para poder expedir la póliza nueva <mensaje>")
    public void validarMensajeUWAlExpedir(@Name("mensaje") String mensaje){
        cotizacionMRCSteps.validarMensajeUWAlExpedir(mensaje);
    }
}