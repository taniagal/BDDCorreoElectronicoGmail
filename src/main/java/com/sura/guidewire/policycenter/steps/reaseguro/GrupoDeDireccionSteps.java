package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.reaseguro.GrupoDeDireccionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class GrupoDeDireccionSteps extends ScenarioSteps {

    GrupoDeDireccionPage grupoDeDireccionPage;

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
    public void seleccionarOpcionVerApartirDe(String verApartirDe) {
        grupoDeDireccionPage.seleccionarOpcionVerApartirDe(verApartirDe);
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
