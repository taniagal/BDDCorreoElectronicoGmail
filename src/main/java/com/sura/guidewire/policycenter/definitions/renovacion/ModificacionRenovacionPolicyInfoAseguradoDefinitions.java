package com.sura.guidewire.policycenter.definitions.renovacion;

import com.sura.guidewire.policycenter.steps.renovacion.ModificacionRenovacionPolicyInfoAseguradoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ModificacionRenovacionPolicyInfoAseguradoDefinitions {

    @Steps
    ModificacionRenovacionPolicyInfoAseguradoSteps modificacionRenovacionPolicyInfoAseguradoSteps;

    @When("desee adicionar un segundo tomador")
    public void adicionarSegundoTomador(){
        modificacionRenovacionPolicyInfoAseguradoSteps.ir_A_Informacion_De_Poliza();
    }

    @When("trate de eliminar o editar el primer tomador")
    public void editarTomadorPrincipal(){
        modificacionRenovacionPolicyInfoAseguradoSteps.ir_A_Informacion_De_Poliza();
    }

    @When("cambie el tipo de plazo $tipoPlazo")
    public void cambarTipoPlazo(ExamplesTable tipoPlazo){
        modificacionRenovacionPolicyInfoAseguradoSteps.ir_A_Informacion_De_Poliza();
        modificacionRenovacionPolicyInfoAseguradoSteps.cambiar_Tipo_De_Plazo(tipoPlazo);
    }

    @When("me encuentre en la pantalla de Informacion de poliza")
    public void irAInformacionDePoliza(){
        modificacionRenovacionPolicyInfoAseguradoSteps.ir_A_Informacion_De_Poliza();
    }

    @When("me encuentre en la pantalla de Asegurados")
    public void irAAsegurados(){
        modificacionRenovacionPolicyInfoAseguradoSteps.ir_A_Pantalla_De_Asegurados();
    }

    @Then("debo poder adicionar un segundo tomador $tomadorSecundario")
    public void validarAdicionSegundoTomador(ExamplesTable tomadorSecundario){
        modificacionRenovacionPolicyInfoAseguradoSteps.validar_Que_Se_Pueda_Adicionar_Segundo_Tomador(tomadorSecundario);
    }

    @Then("no se debe permitir editar o eliminar el primer tomador")
    public void validarEdicionTomadorPrincipal(){
        modificacionRenovacionPolicyInfoAseguradoSteps.validar_Que_El_Tomador_Principal_No_Se_Pueda_Modificar();
    }

    @Then("se debe recalcular el valor de la fecha fin de vigencia de la poliza a partir del plazo inidicado,\n" +
            "tomando como fecha inicial la fecha de inicio de vigencia del periodo a renovar $fechaVigencia")
    public void recalcularFechaFinVigencia(ExamplesTable fechaVigencia){
        modificacionRenovacionPolicyInfoAseguradoSteps.recalcular_Fecha_Fin_Vigencia(fechaVigencia);
    }

    @Then("no se debe permitir editar la siguiente informacion: Organizacion de venta, tipo de canal, \n" +
            "tipo de poliza, tasa a partir de la fecha, fecha inicio de vigencia, fecha fin de vigencia")
    public void validarCamposNoEditables(){
        modificacionRenovacionPolicyInfoAseguradoSteps.validar_Campos_No_Editables_Informacion_Poliza();
    }

    @Then("no debo poder modificar o adicionar un asegurado")
    public void validarNoEdicionAsegurado(){
        modificacionRenovacionPolicyInfoAseguradoSteps.validar_Que_El_Asegurado_No_Pueda_Editarse();
    }
}
