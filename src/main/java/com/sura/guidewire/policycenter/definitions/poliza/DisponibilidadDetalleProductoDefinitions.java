package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.DisponibilidadDetalleProductoSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;
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

    @Given("seleccione el agente y la oficina de radicacion: $agente")
    public void seleccionarAgente(ExamplesTable agente){
        disponibilidadDetalleProductoSteps.seleccionarAgente(agente);
    }

    @When("seleccione el agente y la oficina de radicacion: $agente")
    public void seleccionarAgenteCotizacion(ExamplesTable agente){
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
