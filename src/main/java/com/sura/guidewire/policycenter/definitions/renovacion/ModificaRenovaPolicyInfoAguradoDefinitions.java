package com.sura.guidewire.policycenter.definitions.renovacion;

import com.sura.guidewire.policycenter.steps.renovacion.ModificacionRenovacionPolicyInfoAseguradoSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ModificaRenovaPolicyInfoAguradoDefinitions {

    @Steps
    ModificacionRenovacionPolicyInfoAseguradoSteps modificacionRenovacionPolicyInfoAseguradoSteps;

    @When("desee adicionar un segundo tomador")
    public void adicionarSegundoTomador() {
        modificacionRenovacionPolicyInfoAseguradoSteps.irAInformacionDePoliza();
    }

    @When("trate de eliminar o editar el primer tomador")
    public void editarTomadorPrincipal() {
        modificacionRenovacionPolicyInfoAseguradoSteps.irAInformacionDePoliza();
    }

    @When("cambie el tipo de plazo $tipoPlazo")
    public void cambarTipoPlazo(ExamplesTable tipoPlazo) {
        modificacionRenovacionPolicyInfoAseguradoSteps.irAInformacionDePoliza();
        modificacionRenovacionPolicyInfoAseguradoSteps.cambiarTipoDePlazo(tipoPlazo);
    }

    @When("me encuentre en la pantalla de Informacion de poliza")
    public void irAInformacionDePoliza() {
        modificacionRenovacionPolicyInfoAseguradoSteps.irAInformacionDePoliza();
    }

    @When("me encuentre en la pantalla de Asegurados")
    public void irAAsegurados() {
        modificacionRenovacionPolicyInfoAseguradoSteps.irAPantallaDeAsegurados();
    }

    @Then("debo poder adicionar un segundo tomador $tomadorSecundario")
    public void validarAdicionSegundoTomador(ExamplesTable tomadorSecundario) {
        modificacionRenovacionPolicyInfoAseguradoSteps.validarQueSePuedaAdicionarSegundoTomador(tomadorSecundario);
    }

    @Then("no se debe permitir editar o eliminar el primer tomador")
    public void validarEdicionTomadorPrincipal() {
        modificacionRenovacionPolicyInfoAseguradoSteps.validarQueElTomadorPrincipalNoSePuedaModificar();
    }

    @Then("se debe recalcular el valor de la fecha fin de vigencia de la poliza a partir del plazo inidicado,\n" +
            "tomando como fecha inicial la fecha de inicio de vigencia del periodo a renovar $fechaVigencia")
    public void recalcularFechaFinVigencia(ExamplesTable fechaVigencia) {
        modificacionRenovacionPolicyInfoAseguradoSteps.recalcularFechaFinVigencia(fechaVigencia);
    }

    @Then("no se debe permitir editar la siguiente informacion: Organizacion de venta, tipo de canal, \n" +
            "tipo de poliza, tasa a partir de la fecha, fecha inicio de vigencia, fecha fin de vigencia")
    public void validarCamposNoEditables() {
        modificacionRenovacionPolicyInfoAseguradoSteps.validarCamposNoEditablesInformacionPoliza();
    }

    @Then("no debo poder modificar o adicionar un asegurado")
    public void validarNoEdicionAsegurado() {
        modificacionRenovacionPolicyInfoAseguradoSteps.validarQueElAseguradoNoPuedaEditarse();
    }
}
