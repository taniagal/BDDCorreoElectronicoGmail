package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.DisponibilidadDetalleProductoSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
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

    @Given("seleccione el agente <agente>")
    public void seleccionarAgente(@Named("agente") String agente){
        disponibilidadDetalleProductoSteps.seleccionarAgente(agente);
    }

    @Given("viendo Informacion de poliza")
    public void verInformacionDePoliza() {
        disponibilidadDetalleProductoSteps.verInformacionPoliza();
    }

    @When("seleccione Organizacion de ventas: <organizacion>")
    public void seleccionarOrganizacionDeVentas(@Named("organizacion") String organizacion) {
        disponibilidadDetalleProductoSteps.seleccionarOrganizacionDeVentas(organizacion);
    }

    @When("seleccione Organizacion de ventas: <otraOrganizacion>")
    public void seleccionarOtraOrganizacionDeVentas(@Named("otraOrganizacion") String otraOrganizacion) {
        disponibilidadDetalleProductoSteps.seleccionarOrganizacionDeVentas(otraOrganizacion);
    }

    @When("seleccione Tipo de canal ventas: <otroTipoCanal>")
    public void seleccionarOtroTipoCanalDeVentas(@Named("otroTipoCanal") String otroTipoCanal){
        disponibilidadDetalleProductoSteps.seleccionarTipoCanalDeVentas(otroTipoCanal);
    }

    @When("seleccione Tipo de canal ventas: <tipoCanal>")
    public void seleccionarTipoCanalDeVentas(@Named("tipoCanal") String tipoCanal){
        disponibilidadDetalleProductoSteps.seleccionarTipoCanalDeVentas(tipoCanal);
    }

    @When("seleccione PA tipo de poliza: <tipoPoliza>")
    public void seleccionarPATipoPoliza(@Named("tipoPoliza") String tipoPoliza){
        disponibilidadDetalleProductoSteps.seleccionarPATipoPoliza(tipoPoliza);
    }

    @Then("tipo de canal ventas debe contener los valores $tipoCanal")
    public void validarTipoCanalVentas(ExamplesTable tipoCanal) throws Exception {
        disponibilidadDetalleProductoSteps.validarTipoCanalVentas(tipoCanal);
    }

    @Then("PA tipo de poliza debe contener los valores $PATipoPoliza")
    public void validarPATipoDePoliza(ExamplesTable paTipoPoliza) throws Exception {
        disponibilidadDetalleProductoSteps.validarPATipoPoliza(paTipoPoliza);
    }

    @Then("tipo de canal ventas debe tener el valor vacio")
    public void validarActualizacionDeListaTipoCanal(){
        disponibilidadDetalleProductoSteps.validarActualizacionDeListaTipoCanal();
    }

    @Then("PA tipo de poliza debe tener el valor vacio")
    public void validarActualizacionDeListaPATipoPoliza(){
        disponibilidadDetalleProductoSteps.validarActualizacionDeListaPATipoPoliza();
    }

}
