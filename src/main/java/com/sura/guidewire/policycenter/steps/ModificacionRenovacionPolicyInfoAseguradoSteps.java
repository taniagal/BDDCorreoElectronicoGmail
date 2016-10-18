package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.renovacion.ModificacionRenovacionPolicyInfoAseguradoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ModificacionRenovacionPolicyInfoAseguradoSteps extends ScenarioSteps{

    private ModificacionRenovacionPolicyInfoAseguradoPage modificacionRenovacionPolicyInfoAsegurado;

    @Step
    public void ir_A_Informacion_De_Poliza() {
        modificacionRenovacionPolicyInfoAsegurado.irAInformacionDePoliza();
    }

    @Step
    public void validar_Que_Se_Pueda_Adicionar_Segundo_Tomador(ExamplesTable tomadorSecundario) {
        modificacionRenovacionPolicyInfoAsegurado.validarAdicionSegundoTomador(tomadorSecundario);
    }

    @Step
    public void validar_Que_El_Tomador_Principal_No_Se_Pueda_Modificar() {
        modificacionRenovacionPolicyInfoAsegurado.validarNoEdicionTomadorPrincipal();
    }

    @Step
    public void cambiar_Tipo_De_Plazo(ExamplesTable tipoPlazo) {
        modificacionRenovacionPolicyInfoAsegurado.cambiarTipoDePlazo(tipoPlazo);
    }

    @Step
    public void recalcular_Fecha_Fin_Vigencia(ExamplesTable fechaVigencia) {
        modificacionRenovacionPolicyInfoAsegurado.recalcularFechaFinVigencia(fechaVigencia);
    }

    @Step
    public void validar_Campos_No_Editables_Informacion_Poliza() {
        modificacionRenovacionPolicyInfoAsegurado.validarCamposNoEditablesInfoPoliza();
    }

    @Step
    public void ir_A_Pantalla_De_Asegurados() {
        modificacionRenovacionPolicyInfoAsegurado.irAAsegurados();
    }

    @Step
    public void validar_Que_El_Asegurado_No_Pueda_Editarse() {
        modificacionRenovacionPolicyInfoAsegurado.validarNoEdicionAsegurado();
    }
}
