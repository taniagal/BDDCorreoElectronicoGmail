package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.poliza.CotizacionMRCPage;
import com.sura.guidewire.policycenter.pages.reaseguro.CesionDePrimaPage;
import com.sura.guidewire.policycenter.pages.reaseguro.CrearYEditarCumulosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class CesionDePrimaSteps extends ScenarioSteps {

    CesionDePrimaPage cesionDePrimaPage;
    CotizacionMRCPage cotizacionMRCPage;
    CrearYEditarCumulosPage crearYEditarCumulosPage;
    private String numeroDeEnvio;
    public CesionDePrimaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresarPrimasCedidas() {
        cesionDePrimaPage.clicEnBotonPrimasCedidas();
    }

    @Step
    public void ingresarATodasLasTransacciones() {
        cesionDePrimaPage.ingresaATodasTransacciones();
    }

    @Step
    public void verificarPrimasCedidas(ExamplesTable datos) {
        cesionDePrimaPage.verificarPrimasCedidas(datos);
    }

    @Step
    public void verConsolidadoPrimasCedidas() {
        cesionDePrimaPage.verConsolidadoPrimasCedidas();
    }

    @Step
    public void ejecutaTareaPrimasCedidas(String nombreTarea, String estado) {
        cesionDePrimaPage.ejecutarTareaPrimasCedidas(nombreTarea, estado);
    }

    @Step
    public void tomaYbuscaConNumeroDeEnvio() {
        numeroDeEnvio = cesionDePrimaPage.tomaNumeroDeEnvio();
    }

    public void mostrarInformacionGeneralDeCobertura(String informacionGeneralCobertura) {
        cesionDePrimaPage.validarInformacionGeneralDeCobertura(informacionGeneralCobertura);
    }

    public void ingresarPrimasDespuesDeEjecutarTareaEnCedidas() {
       cotizacionMRCPage.irABuscarCotizacion(numeroDeEnvio);
       crearYEditarCumulosPage.ingresarReaseguroOpciones();
       cesionDePrimaPage.clicEnBotonPrimasCedidas();
    }

    public void ingresaADetalleDeContratoExcedente() {
        cesionDePrimaPage.ingresaADetalleDeContratoExcedente();
        cesionDePrimaPage.validarCondicionesDeContratoExcedente();
    }

    @Step
    public void validaCondicionesYValoresContratos() {
        cesionDePrimaPage.validaReaseguroYDistribucionEnTabla();
    }

    @Step
    public void ingresaAPolizaExpedida() {
        cesionDePrimaPage.ingresaAPolizaExpedida();
    }
}
