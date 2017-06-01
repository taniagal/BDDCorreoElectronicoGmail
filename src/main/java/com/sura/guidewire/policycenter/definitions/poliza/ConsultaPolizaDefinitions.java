package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.poliza.BusquedaDePolizaSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import consultaservicio.RespuestaServicio;
import consultaservicio.SAPClient;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.net.MalformedURLException;

public class ConsultaPolizaDefinitions {

    @Steps
    BusquedaDePolizaSteps buscarNumeroPoliza;
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;
    protected static String numeroPoliza = "";

    @When("expido la poliza y capturo el numero de poliza")
    public void expedirPoliza() {
        tasaUnicaSteps.expedirPoliza();
        numeroPoliza = buscarNumeroPoliza.capturarNumeroPoliza();
    }

    @Then("se valida la creacion de la poliza en SAP")
    public void validarCreacionPolizaSaP() throws MalformedURLException {
        boolean resultado = true;
        SAPClient consultaPolizaSap = new SAPClient();
        RespuestaServicio respuestaServicio = new RespuestaServicio();
        respuestaServicio = consultaPolizaSap.consultaPolizaEnSap(numeroPoliza);
        if (respuestaServicio.getResultado() == 1) {
            resultado = false;
        }
        MatcherAssert.assertThat("Error al buscar la poliza en sap: " + respuestaServicio.getMensaje(), resultado);
    }
}
