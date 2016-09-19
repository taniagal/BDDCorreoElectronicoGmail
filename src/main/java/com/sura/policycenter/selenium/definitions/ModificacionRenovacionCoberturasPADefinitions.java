package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.ModificacionRenovacionCoberturasPASteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;

public class ModificacionRenovacionCoberturasPADefinitions {
    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    ModificacionRenovacionCoberturasPASteps modificacionRenovacionCoberturasPASteps;

    @Given("estoy renovando una poliza <cotizacionRenovacion>")
    public void irABuscarCotizacionRenovacion(@Named("cotizacionRenovacion") String cotizacionRenovacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacionRenovacion);
    }

    @When("este en la pantalla de coberturas")
    public void irAPantallaCoberturas(){
        modificacionRenovacionCoberturasPASteps.ir_A_Pantalla_de_Coberturas_Auto_Personal();
    }

    @When("intente retirar coberturas obligatorias $cobertura")
    public void retirarCoberturasObligatorias(ExamplesTable cobertura){
        modificacionRenovacionCoberturasPASteps.intentar_Retirar_Cobertura_Obligatoria(cobertura);
    }

    @Then("se deben cargar todas las coberturas con las que venia la poliza $coberturas")
    public void validarCoberturasPoliza(ExamplesTable coberturas){
        modificacionRenovacionCoberturasPASteps.validar_Coberturas_De_La_Poliza(coberturas);
    }

    @Then("no debo poder retirar las coberturas obligatorias")
    public void validarRetiroCoberturas(){
        modificacionRenovacionCoberturasPASteps.validar_Que_No_Se_Permitan_Retirar_Coberturas_Obligatorias();
    }

    @Then("debo poder modificar los deducibles y limites tanto de las coberturas opcionales como obligatorias")
    public void modificarDeduciblesYLimites(){
        modificacionRenovacionCoberturasPASteps.modificar_Deducibles_Y_Limites_De_Las_Coberturas();
    }

    @Then("debo poder retirar una cobertura que es Opcional")
    public void retirarCoberturasOpcionales(){
        modificacionRenovacionCoberturasPASteps.retirar_Coberturas_Que_Son_Opcionales();
    }

    @Then("debo poder adicionar una nueva cobertura")
    public void adicionarNuevaCobertura(){
        modificacionRenovacionCoberturasPASteps.adicionar_Nueva_Cobertura();
    }
}
