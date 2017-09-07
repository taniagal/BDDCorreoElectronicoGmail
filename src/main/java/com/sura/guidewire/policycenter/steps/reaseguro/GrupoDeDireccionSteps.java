package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.reaseguro.GrupoDeDireccionPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class GrupoDeDireccionSteps extends ScenarioSteps {

    @Page
    GrupoDeDireccionPage grupoDeDireccionPage;
    private String fechaActual = "";

    @Step
    public void validaInformacionDeCotaparte() {
        grupoDeDireccionPage.obtienePorcentajeDeCesionYRetencionEnContratoCotaparte();
        grupoDeDireccionPage.validaMontoRetenidoEnContratoEnCotaparte();
        grupoDeDireccionPage.validaMontoCedidoEnContratoEnCotaparte();
    }

    @Step
    public void validainformaciondeExcedente() {
        grupoDeDireccionPage.validaMontoCedidoEnContratoEnExcedido();
    }

    @Step
    public void cliquearRegistroAutosPD(String gruposAutos) {
        grupoDeDireccionPage.cliquearRegistroAutosPD(gruposAutos);
    }

    @Step
    public void verificarValoresContratosReasegurables(ExamplesTable examplesTable) {

        grupoDeDireccionPage.verificarBaseReasegurableRiesgo(examplesTable);
        grupoDeDireccionPage.verificarBaseReaseguroContrato(examplesTable);
        grupoDeDireccionPage.verificarValorRiesgoCedidoCP(examplesTable);
        grupoDeDireccionPage.verificarValorRetenidoCP(examplesTable);
        grupoDeDireccionPage.verificarValorRiesgoCedidoEX(examplesTable);
        grupoDeDireccionPage.verificarLimiteCuotaParte(examplesTable);
        grupoDeDireccionPage.validarLimiteCuotaParte(examplesTable);
        grupoDeDireccionPage.verificarBaseReasegurableCumulo(examplesTable);
        grupoDeDireccionPage.verificarValorRiesgoCedidoAcuerdoFacultativo(examplesTable);
    }

    @Step
    public void verificarBasesReasegurablesRiesgos(ExamplesTable examplesTable) {
        grupoDeDireccionPage.verificarBaseReasegurableRiesgo(examplesTable);
        grupoDeDireccionPage.verificarBaseReaseguroContrato(examplesTable);
    }

    @Step
    public void validarValorRetenidoRiesgoCedidoCuotaParte() {
        grupoDeDireccionPage.validarValorRetenido();
        grupoDeDireccionPage.validarRiesgoCedidoCP();
    }

    @Step
    public void validarPorcentajeRetencionRiesgoCedido() {
        grupoDeDireccionPage.validarRetencionSobreElRiesgo();
        grupoDeDireccionPage.validarRiesgoCedidoOperativoExceso();
        grupoDeDireccionPage.validarProporcionCP();
    }

    @Step
    public void seleccionarOpcionVerApartirDe(String verApartirDe) {
        if (verApartirDe.startsWith("-")) {
            grupoDeDireccionPage.seleccionarOpcionVerApartirDe(fechaActual + " " + verApartirDe);
        } else if (verApartirDe.endsWith("-")) {
            grupoDeDireccionPage.seleccionarOpcionVerApartirDe(verApartirDe + " " + fechaActual);
        } else {
            grupoDeDireccionPage.seleccionarOpcionVerApartirDe(verApartirDe);
        }
    }

    @Step
    public void ingresarFechaFinVigencia() {
        fechaActual = grupoDeDireccionPage.ingresarFechaFinVigencia();
    }

    @Step
    public void ingresarSegundoReasegurador() {
        grupoDeDireccionPage.ingresarSegundoReasegurador();
    }

    @Step
    public void aceptarAcuerdoFacultativo() {
        grupoDeDireccionPage.aceptarFacultativo();
    }
}
