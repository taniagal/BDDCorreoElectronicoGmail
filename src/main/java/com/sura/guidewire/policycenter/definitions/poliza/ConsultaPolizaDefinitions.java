package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.BusquedaDePolizaSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import consultaservicio.SAPClient;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.net.MalformedURLException;

public class ConsultaPolizaDefinitions {

    @Steps
    BusquedaDePolizaSteps buscarNumeroPoliza;
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;
    public String numeroPoliza = "";

    @When("expido la poliza y capturo el numero de poliza")
    public void expedirPoliza() {
        tasaUnicaSteps.expedirPolizaUAT();
        numeroPoliza = buscarNumeroPoliza.capturarNumeroPoliza();
        Serenity.setSessionVariable("noPoliza".toLowerCase().trim()).to(numeroPoliza);
    }

    @Then("se valida la creacion de la poliza en SAP")
    public void validarCreacionPolizaSaP() throws MalformedURLException {
        SAPClient.consultaPolizaEnSap(Serenity.sessionVariableCalled("noPoliza".toLowerCase().trim()));
    }
}
