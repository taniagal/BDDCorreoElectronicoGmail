package com.sura.guidewire.policycenter.steps.renovacion;

import com.sura.guidewire.policycenter.pages.renovacion.ModificacionRenovacionCoberturasPAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ModificacionRenovacionCoberturasPASteps extends ScenarioSteps {

    private ModificacionRenovacionCoberturasPAPage modificacionRenovacionCoberturas;

    @Step
    public void irAPantallaDeCoberturasAutoPersonal() {
        modificacionRenovacionCoberturas.irAPantallaCoberturas();
    }

    @Step
    public void irAPantallaDeCoberturasAutoPersonalSinRetroactividad() {
        modificacionRenovacionCoberturas.irAPantallaCoberturasSinValidacionFecha();
    }

    @Step
    public void validarCoberturasDeLaPoliza(ExamplesTable coberturas) {
        modificacionRenovacionCoberturas.validarCoberturasPoliza(coberturas);
    }

    @Step
    public void intentarRetirarCoberturaObligatoria(ExamplesTable cobertura) {
        modificacionRenovacionCoberturas.retirarCoberturaObligatoria(cobertura);
    }

    @Step
    public void validarQueNoSePermitanRetirarCoberturasObligatorias() {
        modificacionRenovacionCoberturas.validarCoberturasObligatorias();
    }

    @Step
    public void modificarDeduciblesYLimitesDeLasCoberturas() {
        modificacionRenovacionCoberturas.modificarDeduciblesYLimites();
    }

    @Step
    public void retirarCoberturasQueSonOpcionales() {
        modificacionRenovacionCoberturas.retirarCoberturasOpcionales();
    }

    @Step
    public void adicionarNuevaCobertura() {
        modificacionRenovacionCoberturas.adicionarNuevaCobertura();
    }

    @Step
    public void editarTransaccionDePoliza() {
        modificacionRenovacionCoberturas.editarTransaccionPoliza();
    }

    @Step
    public void borrar_espacio_trabajo() {
        modificacionRenovacionCoberturas.borrarEspacioTrabajo();
    }
}
