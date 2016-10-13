package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.renovacion.ModificacionRenovacionCoberturasPAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ModificacionRenovacionCoberturasPASteps extends ScenarioSteps {

    private ModificacionRenovacionCoberturasPAPage modificacionRenovacionCoberturas;

    @Step
    public void ir_A_Pantalla_de_Coberturas_Auto_Personal() {
        modificacionRenovacionCoberturas.irAPantallaCoberturas();
    }

    @Step
    public void ir_A_Pantalla_de_Coberturas_Auto_Personal_sin_retroactividad() {
        modificacionRenovacionCoberturas.irAPantallaCoberturasSinValidacionFecha();
    }

    @Step
    public void validar_Coberturas_De_La_Poliza(ExamplesTable coberturas) {
        modificacionRenovacionCoberturas.validarCoberturasPoliza(coberturas);
    }

    @Step
    public void intentar_Retirar_Cobertura_Obligatoria(ExamplesTable cobertura) {
        modificacionRenovacionCoberturas.retirarCoberturaObligatoria(cobertura);
    }

    @Step
    public void validar_Que_No_Se_Permitan_Retirar_Coberturas_Obligatorias() {
        modificacionRenovacionCoberturas.validarCoberturasObligatorias();
    }

    @Step
    public void modificar_Deducibles_Y_Limites_De_Las_Coberturas() {
        modificacionRenovacionCoberturas.modificarDeduciblesYLimites();
    }

    @Step
    public void retirar_Coberturas_Que_Son_Opcionales() {
        modificacionRenovacionCoberturas.retirarCoberturasOpcionales();
    }

    @Step
    public void adicionar_Nueva_Cobertura() {
        modificacionRenovacionCoberturas.adicionarNuevaCobertura();
    }

    @Step
    public void editar_Transaccion_De_Poliza() {
        modificacionRenovacionCoberturas.editarTransaccionPoliza();
    }

    @Step
    public void borrar_espacio_trabajo() {
        modificacionRenovacionCoberturas.borrarEspacioTrabajo();
    }
}
