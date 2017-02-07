package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.reaseguro.SobrescribirTasaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;

public class SobrescribirTasaSteps extends ScenarioSteps{

    SobrescribirTasaPage sobrescribirTasaPage;

    public SobrescribirTasaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresarRiesgosAplicablesEnTabla() {
        sobrescribirTasaPage.ingresaCantidadDeCoberturas();
    }

    @Step
    public void crearAcuerdoFacultativo() {
        sobrescribirTasaPage.clicEnBotonCrearAcuerdosFacultativos();
        MatcherAssert.assertThat("No aparecio ventana de confirmacion para el acuerdo" , sobrescribirTasaPage.validaVentanaDeConfirmacion().equals(true) );
        sobrescribirTasaPage.clicAceptarAcurdosFacultativos();
    }

    public void validaMensajeEnPantalla(String mensaje) {
        MatcherAssert.assertThat("No aparecio mensaje que valida las coberturas en los contratos", sobrescribirTasaPage.mensajeEnPantalla().contains(mensaje));
    }

    public void aceptaAcuerdoFacultativo() {
        sobrescribirTasaPage.clicAceptarAcurdosFacultativoVolverAtras();
    }

    public void validaObjetoReasegurableSinAsociacionDeAcuerdosFacultativos(String tipoContrato) {
        MatcherAssert.assertThat("El contrato no pertenece al ingresado", tipoContrato.equals(sobrescribirTasaPage.buscaObjetoReasegurado(tipoContrato)));
    }
}
