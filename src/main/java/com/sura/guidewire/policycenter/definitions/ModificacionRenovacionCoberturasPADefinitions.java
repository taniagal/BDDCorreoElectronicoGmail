package com.sura.guidewire.policycenter.definitions;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.CotizacionMRCSteps;
import com.sura.guidewire.policycenter.steps.ModificacionRenovacionCoberturasPASteps;
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
        cotizacionMRCSteps.irABuscarCotizacionPoliza(cotizacionRenovacion);
    }

    @When("este en la pantalla de coberturas")
    public void irAPantallaCoberturas(){
        modificacionRenovacionCoberturasPASteps.irAPantallaDeCoberturasAutoPersonal();
    }

    @When("este en la pantalla de coberturas sin validar fecha")
    public void irAPantallaCoberturasSinValidaRetroactividad(){
        modificacionRenovacionCoberturasPASteps.irAPantallaDeCoberturasAutoPersonalSinRetroactividad();
    }

    @When("intente retirar coberturas obligatorias $cobertura")
    public void retirarCoberturasObligatorias(ExamplesTable cobertura){
        modificacionRenovacionCoberturasPASteps.editarTransaccionDePoliza();
        modificacionRenovacionCoberturasPASteps.intentarRetirarCoberturaObligatoria(cobertura);
    }

    @Then("se deben cargar todas las coberturas con las que venia la poliza $coberturas")
    public void validarCoberturasPoliza(ExamplesTable coberturas){
        modificacionRenovacionCoberturasPASteps.validarCoberturasDeLaPoliza(coberturas);
    }

    @Then("no debo poder retirar las coberturas obligatorias")
    public void validarRetiroCoberturas(){
        modificacionRenovacionCoberturasPASteps.validarQueNoSePermitanRetirarCoberturasObligatorias();
    }

    @Then("debo poder modificar los deducibles y limites tanto de las coberturas opcionales como obligatorias")
    public void modificarDeduciblesYLimites(){
        modificacionRenovacionCoberturasPASteps.modificarDeduciblesYLimitesDeLasCoberturas();
    }

    @Then("debo poder retirar una cobertura que es Opcional")
    public void retirarCoberturasOpcionales(){
        modificacionRenovacionCoberturasPASteps.retirarCoberturasQueSonOpcionales();
    }

    @Then("debo poder adicionar una nueva cobertura")
    public void adicionarNuevaCobertura(){
        modificacionRenovacionCoberturasPASteps.adicionarNuevaCobertura();
    }
}
