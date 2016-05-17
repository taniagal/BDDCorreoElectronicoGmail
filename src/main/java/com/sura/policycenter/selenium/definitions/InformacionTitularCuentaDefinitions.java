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
    public void thenMostratInformacionBasica(@Named("titularCuenta")String titularCuenta,@Named("tipoDocumento")String tipoDocumento,
                                            @Named("nroDocumento")String nroDocumento,@Named("primaVigencia")String primaVigencia,
                                            @Named("segmentacion")String segmentacion,@Named("comportamiento")String comportamiento,
                                            @Named("actividadEconomica")String actividadEconomica,@Named("totalNoFacturado")String totalNoFacturado,
                                            @Named("totalFacturado")String totalFacturado, @Named("totalvencido")String totalvencido,
                                            @Named("totalPendiente")String totalPendiente){

        informacionTitularCuentaSteps.validarInformacionBasica(titularCuenta,tipoDocumento,nroDocumento,primaVigencia, segmentacion, comportamiento,
                actividadEconomica, totalNoFacturado, totalFacturado, totalvencido, totalPendiente);
    }

}