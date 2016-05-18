package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.InformacionTitularCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class InformacionTitularCuentaDefinitions {

    @Steps
    SeusLoginSteps seusLoginSteps;

    @Steps
    InformacionTitularCuentaSteps informacionTitularCuentaSteps;

    //@Steps
    //BusquedaContactoSteps buscarContactoSteps;


    @Given("que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>")
    public void givenExisteTitularCuenta(@Named("tipoDoc") String tipoDoc,
                                         @Named("nombre") String nombre,
                                         @Named("apellido") String apellido) {
        //buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, nombre, "", apellido, "");
    }

    @When("ingrese a informacion del titular de la cuenta")
    public void givenEstoyEnInformacionTitularCuenta() {
        informacionTitularCuentaSteps.seleccionarInformacionTitularCuenta();
    }

    @Then("debe mostrarme la informacion basica <informacionBasica>, metricas <metricas>, transacciones de polizas pendientes <transacciones> y siniestros abiertos <reclamaciones>")
    public void thenMostrarInformacionbasicaMetricasTransaccionesSiniestros(@Named("informacionBasica") String informacionBasica,
                                                                            @Named("metricas") String metricas,
                                                                            @Named("transacciones") String transacciones,
                                                                            @Named("reclamaciones") String reclamaciones){
        informacionTitularCuentaSteps.validarEncabezadosInformacionTitularCuenta(informacionBasica, metricas, transacciones, reclamaciones);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @Then("debe mostrarme en la informacion basica: Titular de la cuenta <titularCuenta>, tipo de documento <tipoDocumento>,\n" +
            "Nro de documento <nroDocumento>, prima en vigencia <primaVigencia>, Segmentacion <segmentacion>, Comportamiento <comportamiento>,\n" +
            "actividad economica <actividadEconomica>, Total no Facturado <totalNoFacturado>, total actualmente facturado <totalFacturado>,\n" +
            "total vencido <totalvencido> y total pendiente <totalPendiente>.")
    public void thenMostrarInformacionBasica(@Named("titularCuenta")String titularCuenta,@Named("tipoDocumento")String tipoDocumento,
                                             @Named("nroDocumento")String nroDocumento,@Named("primaVigencia")String primaVigencia,
                                             @Named("segmentacion")String segmentacion,@Named("comportamiento")String comportamiento,
                                             @Named("actividadEconomica")String actividadEconomica,@Named("totalNoFacturado")String totalNoFacturado,
                                             @Named("totalFacturado")String totalFacturado, @Named("totalvencido")String totalvencido,
                                             @Named("totalPendiente")String totalPendiente){

        informacionTitularCuentaSteps.validarInformacionBasica(titularCuenta,tipoDocumento,nroDocumento,primaVigencia, segmentacion, comportamiento,
                actividadEconomica, totalNoFacturado, totalFacturado, totalvencido, totalPendiente);
    }


    @Then("debe mostrarme en metricas de valor del cliente: Anio de vigencia de la primera poliza <anioVigencia>, polizas activas <polizasActivas>,\n" +
            "Cancelado por el cliente <canceladoPorCliente>, cancelado por la compania de seguros por falta de pago <canceladoPorCompania>,\n" +
            "otras cancelaciones <otrasCancelaciones>, prima vitalicia <primaVitalicia>.\n" +
            "Informacion de siniestros abiertos: Total de siniestros abiertos <totalSiniestrosAbiertos>, total neto incurrido <totalNetoIncurrido>.")
    public void thenMostrarInformacionMetricas(@Named("anioVigencia")String anioVigencia,@Named("polizasActivas")String polizasActivas,
                                               @Named("canceladoPorCliente")String canceladoPorCliente,@Named("canceladoPorCompania")String canceladoPorCompania,
                                               @Named("otrasCancelaciones")String otrasCancelaciones,@Named("primaVitalicia")String primaVitalicia,
                                               @Named("totalSiniestrosAbiertos")String totalSiniestrosAbiertos,@Named("totalNetoIncurrido")String totalNetoIncurrido){

        informacionTitularCuentaSteps.validarInformacionMetricas(anioVigencia,polizasActivas,canceladoPorCliente,canceladoPorCompania, otrasCancelaciones, primaVitalicia,
                totalSiniestrosAbiertos, totalNetoIncurrido);
    }




    @Then("debe mostrarme: Fecha de creación <fechaCreacion>, Numero de poliza <nroPoliza>, producto <producto>,\n" +
            "Numero de transaccion <nroTransaccion>, Tipo <tipo>, estado <estado>")
    public void thenMostrarInformacionTransacciones(@Named("fechaCreacion")String fechaCreacion,@Named("nroPoliza")String nroPoliza,
                                                    @Named("producto")String producto,@Named("nroTransaccion")String nroTransaccion,
                                                    @Named("tipo")String tipo,@Named("estado")String estado){

        informacionTitularCuentaSteps.validarInformacionTransacciones(fechaCreacion, nroPoliza, producto, nroTransaccion, tipo, estado);
    }


    @Then("debe mostrarme Numero de poliza <nroPoliza>, producto <producto>, asegurado <asegurado>, Fecha de perdida <fechaPerdida>,\n" +
            "numero de siniestro <nroSiniestro>, Estado <estado>, total incurrido <totalIncurrido>.")
    public void thenMostrarInformacionSiniestros(@Named("nroPoliza")String nroPoliza,@Named("producto")String producto,
                                                 @Named("asegurado")String asegurado,@Named("fechaPerdida")String fechaPerdida,
                                                 @Named("nroSiniestro")String nroSiniestro,@Named("estado")String estado,
                                                 @Named("totalIncurrido")String totalIncurrido){

        informacionTitularCuentaSteps.validarInformacionSiniestros(nroPoliza, producto, asegurado, fechaPerdida, nroSiniestro,
                estado, totalIncurrido);
    }


    @Then("el nombre del titular de la cuenta debe aparecer con el nombre completo, es decir, nombre 1 <primerNombre>\n" +
            "seguido de nombre 2 <segundoNombre> seguido de apellido 1 <primerApellido> seguido de apellido 2 <segundoApellido>.")
    public void thenMostrarNombreCompleto(@Named("primerNombre")String primerNombre,@Named("segundoNombre")String segundoNombre,
                                          @Named("primerApellido")String primerApellido,@Named("segundoApellido")String segundoApellido){

        informacionTitularCuentaSteps.validarNombreCompletoPersonaNatural(primerNombre, segundoNombre, primerApellido, segundoApellido);
    }
}