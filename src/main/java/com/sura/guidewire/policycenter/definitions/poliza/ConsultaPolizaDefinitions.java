package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.poliza.BusquedaDePolizaSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import consultaservicio.SAPClient;
import net.thucydides.core.annotations.Steps;
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
        SAPClient.consultaPolizaEnSap(numeroPoliza);
    }
}
