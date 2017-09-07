package com.sura.guidewire.policycenter.steps.renovacion;


import com.sura.guidewire.policycenter.pages.poliza.EdificiosyUbicacionesWidget;
import com.sura.guidewire.policycenter.pages.renovacion.AjustesDeReglasRenovacionMrcPage;

import net.thucydides.core.annotations.Step;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class AjustesDeReglasRenovacionMrcSteps {

    private static EdificiosyUbicacionesWidget edificiosyUbicacionesWidget;
    @Page
    public AjustesDeReglasRenovacionMrcPage ajustesDeReglasRenovacionMrcPage;

    @Step
    public void obtenerMensajeUW(ExamplesTable mensajes) {
        ajustesDeReglasRenovacionMrcPage.obtenerMensajeUW(mensajes);
    }

    @Step
    public void diligencieIntruccionesPrevias(ExamplesTable datos) {
        ajustesDeReglasRenovacionMrcPage.diligencieInstruccionesPrevias(datos);
    }

    @Step
    public void continuarConRenovacion() {
        ajustesDeReglasRenovacionMrcPage.continuarConRenovacion();
    }

    @Step
    public void ingresarElAsegurado(String opcionAgregar) {
        ajustesDeReglasRenovacionMrcPage.ingresarAsegurado(opcionAgregar);
    }

    @Step
    public void realiceAprobacionEspecial() {
        ajustesDeReglasRenovacionMrcPage.aprobacionEspecial();
    }

    @Step
    public void realizarAprobacionEspecialConVariasObservaciones() {
        ajustesDeReglasRenovacionMrcPage.realizarAprobacionEspecialConVariasObservaciones();
    }

    @Step
    public void selecionarBotonAgregarArticulo(String numeroUbicacion) {

        int ubicacionNumero = 1;
        if (numeroUbicacion != null && (!numeroUbicacion.isEmpty())) {
            ubicacionNumero = Integer.parseInt(numeroUbicacion);
        }
        edificiosyUbicacionesWidget.agregarArticulosEnUbicacionEnRenovacion(ubicacionNumero);
    }

    @Step
    public void diligenciarCamposReaseguroAceptado(ExamplesTable valores) {
        ajustesDeReglasRenovacionMrcPage.diligenciarCamposReaseguroAceptado(valores);
    }

    @Step
    public void ingresarRegistrosReaseguro(ExamplesTable registros) {
        ajustesDeReglasRenovacionMrcPage.ingresarRegistrosReaseguro(registros);
    }

    @Step
    public void descarteCambios() {
        edificiosyUbicacionesWidget.descarteCambios();
    }

}
