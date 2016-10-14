package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.DisponibilidadDetalleProductoSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")
public class DisponibilidadDetalleProductoDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private DisponibilidadDetalleProductoSteps disponibilidadDetalleProductoSteps;

    @Given("quiero expedir una poliza nueva")
    public void accionarNuevoEnvio() {
        disponibilidadDetalleProductoSteps.accionarNuevoEnvio();
    }

    @Given("seleccione el agente <agente>")
    public void seleccionarAgente(@Named("agente") String agente){
        disponibilidadDetalleProductoSteps.seleccionarAgente(agente);
    }

    @When("seleccione el agente <agente>")
    public void seleccionarAgenteCotizacion(@Named("agente") String agente){
        disponibilidadDetalleProductoSteps.seleccionarAgente(agente);
    }

    @When("seleccione la opcion informacion de poliza")
    public void verInformacionDePoliza() {
        disponibilidadDetalleProductoSteps.verInformacionPoliza();
    }

    @Then("debo ver la organizacion <infoOrganizacion> seleccionada")
    public void validarLaOrganizacion(@Named("infoOrganizacion") String infoOrganizacion){
        disponibilidadDetalleProductoSteps.validarLaOrganizacion(infoOrganizacion);
    }

    @Then("debor ver el canal <infoCanal> seleccionado")
    public void validarElCanal(@Named("infoCanal") String infoCanal){
        disponibilidadDetalleProductoSteps.validarElCanal(infoCanal);
    }

    @Then("debo ver el tipo de poliza <infoTipoPoliza> seleccionado")
    public void validarElProducto(@Named("infoTipoPoliza") String infoTipoPoliza){
        disponibilidadDetalleProductoSteps.validarElProducto(infoTipoPoliza);
    }

}
