package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.reaseguro.GrupoDeDireccionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

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
}
