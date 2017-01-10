package com.sura.guidewire.policycenter.steps.reaseguro;

import com.sura.guidewire.policycenter.pages.reaseguro.CrearYEditarCumulosPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;


public class CrearYEditarCumulosSteps extends ScenarioSteps {

    CrearYEditarCumulosPages crearYEditarCumulosPages = new CrearYEditarCumulosPages(getDriver());

    public CrearYEditarCumulosSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresar_a_opcion_reaseguro() {
        crearYEditarCumulosPages.ingresarReaseguroOpciones();
    }

    @Step
    public void ingresar_a_opcion_crear_acuerdo_facultativo() {
        crearYEditarCumulosPages.ingresarAcuerdosFacultativos();
    }

    @Step
    public void ingresarDescripcionDeAcuerdoyDireccion(String descripcionDeAcuerdo) {
        crearYEditarCumulosPages.ingresarDescripcionDeAcuerdoYDireccion(descripcionDeAcuerdo);
    }

    @Step
    public void ingresarModalidadDeTasaEnTabla(ExamplesTable datosReaseguradores) {
        crearYEditarCumulosPages.ingresaParticipacion(datosReaseguradores);
        crearYEditarCumulosPages.ingresoInformacionDeReaseguroEnTabla();
        crearYEditarCumulosPages.ingresarComisionYValorReaseguro(datosReaseguradores);
        crearYEditarCumulosPages.seleccionaModalidadPrima(datosReaseguradores);
        crearYEditarCumulosPages.ingresaComisionPromotoraEIntermediario(datosReaseguradores);
    }

    @Step
    public void validaTasaBruta() {
        crearYEditarCumulosPages.validaTasaBrutaDeCesion();
    }

    @Step
    public void validaTasaNeta() {
        crearYEditarCumulosPages.calculaTasaNetaDeCesionRegla();
        crearYEditarCumulosPages.validaTasaNetaDeCesion();
    }

    @Step
    public void validacionUtilidadesNegativas(String mensaje) {
        crearYEditarCumulosPages.validaUtilidadesNegativas(mensaje);
    }

    public void validaPrimaBruta() {
        crearYEditarCumulosPages.validaPrimaBrutaDeCesion();
    }
}
