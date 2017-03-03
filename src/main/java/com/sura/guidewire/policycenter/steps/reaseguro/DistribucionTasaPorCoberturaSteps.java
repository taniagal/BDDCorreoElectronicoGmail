package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.reaseguro.CrearYEditarCumulosPage;
import com.sura.guidewire.policycenter.pages.reaseguro.DistribucionTasaPorCoberturaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DistribucionTasaPorCoberturaSteps extends ScenarioSteps {

    DistribucionTasaPorCoberturaPage distribucionTasaPorCoberturaPage;
    CrearYEditarCumulosPage crearYEditarCumulosPage;

    @Step
    public void ingresaPrimerReaseguradorEnTabla(ExamplesTable datosReaseguradores) {
        crearYEditarCumulosPage.ingresaParticipacion(datosReaseguradores);
        crearYEditarCumulosPage.ingresoInformacionDeReaseguroEnTabla();
        crearYEditarCumulosPage.ingresarComisionYValorReaseguro(datosReaseguradores);
        crearYEditarCumulosPage.seleccionaModalidadPrima(datosReaseguradores);
    }

    @Step
    public void ingresarReaseguradores(ExamplesTable infoReasegurador) {
        distribucionTasaPorCoberturaPage.AgregarReaseguradoresATabla(infoReasegurador);
    }
}
