package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionDePolizaSteps;
import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.CotizacionPADetalleSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.HashMap;
import java.util.Map;

public class CotizacionMRCDefinitions {

    private final Map<String, String> labelsCotizacionPoliza = new HashMap<>();

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
        labelsCotizacionPoliza.put("impuestos", "Impuestos y cargos extra");
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

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    CotizacionDePolizaSteps cotizacionDePolizaSteps;

    @Given("se ha realizado la cotizacion MRC <cotizacion>")
    public void givenIrALaCotizacion(@Named("cotizacion") String cotizacion) {
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @Given("se registraron los riesgos y coberturas que se desean cotizar <cotizacion>")
    public void buscarCotizacionBorrador(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @When("ingrese a consultar la cotizacion")
    public void consultarCotizacion(){
        cotizacionMRCSteps.ver_Detalle_Cotizacion();
    }

    @When("realice la cotizacion")
    public void ingresarACotizacion(){
        cotizacionMRCSteps.ingresar_A_Cotizacion();
    }

    @When("los participantes y/o ubicaciones sean riesgo consultable")
    public void validarTipoRiesgo(){
        cotizacionMRCSteps.validar_Tipo_Riesgo();
    }

    @When("los participantes (tomador, asegurado y/o beneficiario) sean identificados como PEP")
    public void validarRiesgoPEP(){
        cotizacionMRCSteps.validar_Tipo_Riesgo();
    }

    @When("ya exista una cotizacion en estado cotizado del mismo cliente, para el producto Multiriesgo corporativo con un\n" +
            "agente diferente al que se ingreso")
    public void validarExclusividadCotizacion(){
        cotizacionMRCSteps.validar_Tipo_Riesgo();
    }

    @Then("debo ver la informacion de la cotizacion $informacionCotizacion")
    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion){
        cotizacionMRCSteps.validar_Informacion_Cotizacion(labelsCotizacionPoliza, informacionCotizacion);
    }

    @Then("debo ver la prima <primaTotal> a cobrar al cliente")
    public void validarPrimaTotal(@Named("primaTotal") String primaTotal){
        cotizacionMRCSteps.validar_Prima(primaTotal);
    }

    @Then("se muestre el detalle de la prima por riesgo")
    public void mostrarDetallePrima(){
        cotizacionMRCSteps.mostrar_Detalle_Prima_Por_Riesgo(labelsCotizacionPoliza);
    }

    @Then("no debe permitir cotizar; se debe mostrar el mensaje de respuesta <mensaje> que envie riesgos consultables")
    public void validarBloqueoCotizacionMRC(@Named("mensaje") String mensaje) {
        cotizacionMRCSteps.validar_Bloqueo_Cotizacion(mensaje);
    }

    @Then("no debe permitir cotizar; se debe mostrar el mensaje de respuesta <mensaje> que envie PEP")
    public void validarBloqueoPEP(@Named("mensaje") String mensaje) {
        cotizacionMRCSteps.validar_Bloqueo_Cotizacion(mensaje);
    }

    @Then("no debe permitir cotizar; se debe mostrar el mensaje de error <mensaje>")
    public void validarBloqueoExclusividad(@Named("mensaje") String mensaje) {
        cotizacionMRCSteps.validar_Bloqueo_Cotizacion(mensaje);
    }
}