package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CuentasOrdenesDeTrabajoSteps;
import com.sura.policycenter.selenium.steps.DisponibilidadDetalleProductoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.HashMap;
import java.util.Map;

public class InformacionPolizaPADefinitions {

    @Steps
    private CuentasOrdenesDeTrabajoSteps cuentasOrdenesTrabajoSteps;

    @Steps
    private DisponibilidadDetalleProductoSteps disponibilidadDetalleProductoSteps;

    private Map<String, String> infoPoliza = new HashMap<>();

    public InformacionPolizaPADefinitions(){
        
    }

    @Given("ya se inicio una nueva suscripcion <numeroCuenta>")
    public void iniciarSuscripcion(@Named("numeroCuenta") String numeroCuenta){
        cuentasOrdenesTrabajoSteps.seleccionarCuenta(numeroCuenta);
    }

    @When("estoy expidiendo una poliza de autos")
    public void accionarExpedirPolizaAuto(){
        disponibilidadDetalleProductoSteps.accionarNuevoEnvio();
    }

    @Then("se debe visalizar los datos del tomador, como son: tipo y numero de identificacion, nombre completo,\n" +
            "telefono, dirección, vigencia de la poliza (valor por defecto), nombre del agente, fecha de suscripción y\n" +
            "nombre de la compania aseguradora")
    public void visualizarInformacionPoliza(){

    }
}
