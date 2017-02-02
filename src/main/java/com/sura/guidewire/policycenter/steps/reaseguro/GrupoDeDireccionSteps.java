package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.reaseguro.GrupoDeDireccionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class GrupoDeDireccionSteps extends ScenarioSteps {

    GrupoDeDireccionPage grupoDeDireccionPages;

    @Step
    public void validaInformacionDeCotaparte() {
        grupoDeDireccionPages.obtienePorcentajeDeCesionYRetencionEnContratoCotaparte();
        grupoDeDireccionPages.validaMontoRetenidoEnContratoEnCotaparte();
        grupoDeDireccionPages.validaMontoCedidoEnContratoEnCotaparte();
    }

    @Step
    public void validainformaciondeExcedente() {
        grupoDeDireccionPages.validaMontoCedidoEnContratoEnExcedido();
    }
}
