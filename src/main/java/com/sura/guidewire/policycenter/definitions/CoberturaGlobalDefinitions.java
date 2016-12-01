package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.commons.LoginSteps;
import com.sura.guidewire.policycenter.steps.CoberturaGlobalSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CoberturaGlobalDefinitions {
    @Steps
    CoberturaGlobalSteps coberturaGlobalSteps;
    @Steps
    LoginSteps loginSteps;

    @When("agregue coberturas globales con datos: $datosCobertura")
    public void agregarCoberturas(ExamplesTable datosCobertura){
        coberturaGlobalSteps.ir_a_coberturas_globales();
        coberturaGlobalSteps.agregar_coberturas_globales(datosCobertura);
    }
    @When("seleccione la opcion coberturas globales")
    public void cuandoSeleccioneLaOpcionAgregarCobertura(){
        coberturaGlobalSteps.ir_a_coberturas_globales();
    }
    @When("seleccione la opcion agregar cobertura global")
    public void cuandoSeleccioneLaOpcionAgregarCoberturaGlobal(){
        coberturaGlobalSteps.ir_a_agregar_cobertura_global();
    }

    @Then("debe mostrarme las coberturas incluidas y las ubicaciones cubiertas")
    public void verificarCoberturasyUbicaciones(){
        coberturaGlobalSteps.verificar_coberturas_y_ubicaciones();
    }

    @When("agregue una cobertura global con datos: $datosCobertura")
    public void agregarCobertura(ExamplesTable datosCobertura){
        coberturaGlobalSteps.ir_a_coberturas_globales();
        coberturaGlobalSteps.seleccionar_cobertura_unica(datosCobertura);
    }

    @Then("debe mostrarme un mensaje<mensaje> de error")
    public void verificarMensajeError(@Named("mensaje")String mensaje){
        coberturaGlobalSteps.verificar_mensaje_error(mensaje);
    }

   /* @Then("en agregar coberturas globales deben estar en estado <estadouno> las siguientes opciones $menusesperados")
    public void entoncesEnAgregarCoberturasSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno,@Named("estadodos") String estadodos, ExamplesTable menusesperados){
        coberturaGlobalSteps.validar_campos_agregar_cobertura(estadouno,estadodos,menusesperados);
    }  */

    @Then("en agregar coberturas globales deben estar en estado <estadouno> las siguientes opciones $menusesperados")
    public void entoncesEnAgregarCoberturasSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno, ExamplesTable menusesperados){
        String estadodos = "";
        coberturaGlobalSteps.validar_campos_agregar_cobertura(estadouno,estadodos,menusesperados);
    }

}
