package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.CotizacionMRCPage;
import com.sura.guidewire.policycenter.pages.reaseguro.CesionDePrimaPage;
import com.sura.guidewire.policycenter.pages.reaseguro.CrearYEditarCumulosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

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
        //cotizacionMRCPage.irABuscarCotizacion(numeroDeEnvio);
        cesionDePrimaPage.clicEnBotonPrimasCedidas();
    }

    @Step
    public void irAResumenDePoliza() {
        cesionDePrimaPage.irAResumenDePoliza();
    }

    @Step
    public void ingresarATodasLasTransacciones() {
        cesionDePrimaPage.ingresaATodasTransacciones();
    }

    @Step
    public void ejecutaTareaPrimasCedidas() {
        cesionDePrimaPage.ejecutarTareaPrimasCedidas();
    }

    @Step
    public void tomaYbuscaConNumeroDeEnvio() {
        numeroDeEnvio = cesionDePrimaPage.tomaNumeroDeEnvio();
        cotizacionMRCPage.irABuscarCotizacion(numeroDeEnvio);
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

    public void ingresaADetalleDeContratoCuotaparte() {
        cesionDePrimaPage.ingresaADetalleDeContratoCuotaParte();
    }
}
