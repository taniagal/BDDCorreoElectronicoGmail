package com.sura.guidewire.policycenter.definitions.cuenta;

import com.sura.guidewire.policycenter.steps.contacto.BusquedaContactoSteps;
import com.sura.guidewire.policycenter.steps.cuenta.InformacionTitularCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

@SuppressWarnings("WeakerAccess")
public class InformacionTitularCuentaDefinitions {
    @Steps
    InformacionTitularCuentaSteps informacionTitularCuentaSteps;

    @Steps
    BusquedaContactoSteps buscarContactoSteps;


    @Given("que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>")
    public void givenExisteTitularCuenta(@Named("tipoDoc") String tipoDoc,
                                         @Named("nombre") String nombre,
                                         @Named("apellido") String apellido) {
        buscarContactoSteps.ir_A_Buscar_Contacto();
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, nombre, "", apellido, "");
    }

    @When("ingrese a informacion del titular de la cuenta")
    public void givenEstoyEnInformacionTitularCuenta() {
        informacionTitularCuentaSteps.seleccionarInformacionTitularCuenta();
    }

    @Then("debe mostrarme la informacion basica <informacionBasica>, metricas <metricas>, transacciones de polizas pendientes <transacciones> y siniestros abiertos <siniestros>")
    public void thenMostrarInformacionbasicaMetricasTransaccionesSiniestros(@Named("informacionBasica") String informacionBasica,
                                                                            @Named("metricas") String metricas,
                                                                            @Named("transacciones") String transacciones,
                                                                            @Named("siniestros") String siniestros) {
        informacionTitularCuentaSteps.validarEncabezadosInformacionTitularCuenta(informacionBasica, metricas, transacciones, siniestros);
    }

    @Then("debe mostrarme en la informacion basica: Titular de la cuenta, tipo de documento, Nro de documento, prima en vigencia, Segmentacion, Comportamiento, Total no Facturado, total actualmente facturado total vencido y total pendiente $infoBasica")
    public void thenMostrarInformacionBasica(ExamplesTable infoBasica) {
        informacionTitularCuentaSteps.validarInformacionBasica(infoBasica);
    }

    @Then("debe mostrarme en metricas de valor del cliente: Anio de vigencia de la primera poliza <anioVigencia>, polizas activas <polizasActivas>, Cancelado por el cliente <canceladoPorCliente>, cancelado por la compania de seguros por falta de pago <canceladoPorCompania>, otras cancelaciones <otrasCancelaciones>, prima vitalicia <primaVitalicia>. Informacion de siniestros abiertos: Total de siniestros abiertos <totalSiniestrosAbiertos>, total neto incurrido <totalNetoIncurrido>.")
    public void thenMostrarInformacionMetricas(@Named("anioVigencia") String anioVigencia,
                                               @Named("canceladoPorCliente") String canceladoPorCliente, @Named("canceladoPorCompania") String canceladoPorCompania,
                                               @Named("otrasCancelaciones") String otrasCancelaciones, @Named("primaVitalicia") String primaVitalicia,
                                               @Named("totalSiniestrosAbiertos") String totalSiniestrosAbiertos, @Named("totalNetoIncurrido") String totalNetoIncurrido) {

        informacionTitularCuentaSteps.validarInformacionMetricas(anioVigencia, canceladoPorCliente, canceladoPorCompania, otrasCancelaciones, primaVitalicia,
                totalSiniestrosAbiertos, totalNetoIncurrido);
    }

    @Then("el nombre del titular de la cuenta debe aparecer con el nombre completo <nombreCompleto>, es decir, nombre 1 seguido de nombre 2 seguido de apellido 1 seguido de apellido 2.")
    public void thenMostrarNombreCompleto(@Named("nombreCompleto") String nombreCompleto) {

        informacionTitularCuentaSteps.validarNombreCompletoPersonaNatural(nombreCompleto);
    }

    @Then("debe mostrarme: Fecha de creación <fechaCreacion>, Numero de poliza <nroPoliza>, producto <producto>, Numero de transaccion <nroTransaccion>, Tipo <tipo>, estado <estado>.")
    public void thenMostrarInformacionTransacciones(@Named("fechaCreacion") String fechaCreacion, @Named("nroPoliza") String nroPoliza,
                                                    @Named("producto") String producto, @Named("nroTransaccion") String nroTransaccion,
                                                    @Named("tipo") String tipo, @Named("estado") String estado) {

        informacionTitularCuentaSteps.validarInformacionTransacciones(fechaCreacion, nroPoliza, producto, nroTransaccion, tipo, estado);
    }

    @Then("debe mostrarme Numero de poliza <numeroPoliza>, producto <producto>, asegurado <asegurado>, Fecha de perdida <fechaPerdida>, numero de siniestros <numeroSiniestros>, Estado <estado>, total incurrido <totalIncurrido>.")
    public void thenMostrarInformacionSiniestros(@Named("numeroPoliza") String nroPoliza, @Named("producto") String producto,
                                                 @Named("asegurado") String asegurado, @Named("fechaPerdida") String fechaPerdida,
                                                 @Named("numeroSiniestros") String numeroSiniestros, @Named("estado") String estado,
                                                 @Named("totalIncurrido") String totalIncurrido) {

        informacionTitularCuentaSteps.validarInformacionSiniestros(nroPoliza, producto, asegurado, fechaPerdida, numeroSiniestros,
                estado, totalIncurrido);
    }

    @Then("los campos que se muestren no deben permitir la edicion, es decir, todos los campos seran solo informativos.")
    public void thenValidarCamposComoNoEditables() {

        informacionTitularCuentaSteps.validarCamposComoNoEditables();
    }

    @Then("si el dato actividad economica esta vacio, este campo se debe ocultar, de lo contrario, se debe mostrar la actividad economica normalmente.")
    public void thenMostrarActividadEconomica(@Named("actividadEconomica") String actividadEconomica) {

        informacionTitularCuentaSteps.validarCampoActividadEconomica(actividadEconomica);
    }
}
