package com.sura.guidewire.policycenter.steps.renovacion;

import com.sura.guidewire.policycenter.pages.renovacion.ModificacionRenovacionPolicyInfoAseguradoPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class ModificacionRenovacionPolicyInfoAseguradoSteps extends ScenarioSteps{
    @Page
    ModificacionRenovacionPolicyInfoAseguradoPage modificacionRenovacionPolicyInfoAsegurado;

    @Step
    public void irAInformacionDePoliza() {
        modificacionRenovacionPolicyInfoAsegurado.irAInformacionDePoliza();
    }

    @Step
    public void validarQueSePuedaAdicionarSegundoTomador(ExamplesTable tomadorSecundario) {
        modificacionRenovacionPolicyInfoAsegurado.validarAdicionSegundoTomador(tomadorSecundario);
    }

    @Step
    public void validarQueElTomadorPrincipalNoSePuedaModificar() {
        modificacionRenovacionPolicyInfoAsegurado.validarNoEdicionTomadorPrincipal();
    }

    @Step
    public void cambiarTipoDePlazo(ExamplesTable tipoPlazo) {
        modificacionRenovacionPolicyInfoAsegurado.cambiarTipoDePlazo(tipoPlazo);
    }

    @Step
    public void recalcularFechaFinVigencia(ExamplesTable fechaVigencia) {
        modificacionRenovacionPolicyInfoAsegurado.recalcularFechaFinVigencia(fechaVigencia);
    }

    @Step
    public void validarCamposNoEditablesInformacionPoliza() {
        modificacionRenovacionPolicyInfoAsegurado.validarCamposNoEditablesInfoPoliza();
    }

    @Step
    public void irAPantallaDeAsegurados() {
        modificacionRenovacionPolicyInfoAsegurado.irAAsegurados();
    }

    @Step
    public void validarQueElAseguradoNoPuedaEditarse() {
        modificacionRenovacionPolicyInfoAsegurado.validarNoEdicionAsegurado();
    }
}
