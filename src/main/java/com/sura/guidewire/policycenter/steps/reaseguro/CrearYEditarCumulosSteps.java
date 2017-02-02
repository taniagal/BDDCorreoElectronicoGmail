package com.sura.guidewire.policycenter.steps.reaseguro;

import com.sura.guidewire.policycenter.pages.reaseguro.CrearYEditarCumulosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;


public class CrearYEditarCumulosSteps extends ScenarioSteps {

    CrearYEditarCumulosPage crearYEditarCumulosPage = new CrearYEditarCumulosPage(getDriver());

    public CrearYEditarCumulosSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresar_a_opcion_reaseguro() {
        crearYEditarCumulosPage.ingresarReaseguroOpciones();
    }

    @Step
    public void ingresar_a_opcion_crear_acuerdo_facultativo() {
        crearYEditarCumulosPage.ingresarAcuerdosFacultativos();
    }

    @Step
    public void ingresarDescripcionDeAcuerdoyDireccion(String descripcionDeAcuerdo) {
        crearYEditarCumulosPage.ingresarDescripcionDeAcuerdoYDireccion(descripcionDeAcuerdo);
    }

    @Step
    public void ingresarModalidadDeTasaEnTabla(ExamplesTable datosReaseguradores) {
        crearYEditarCumulosPage.ingresaParticipacion(datosReaseguradores);
        crearYEditarCumulosPage.ingresoInformacionDeReaseguroEnTabla();
        crearYEditarCumulosPage.ingresarComisionYValorReaseguro(datosReaseguradores);
        crearYEditarCumulosPage.seleccionaModalidadPrima(datosReaseguradores);
      //  crearYEditarCumulosPage.ingresaComisionPromotoraEIntermediario(datosReaseguradores);
    }

    @Step
    public void validaTasaBruta() {
        crearYEditarCumulosPage.validaTasaBrutaDeCesion();
    }

    @Step
    public void validaTasaNeta() {
        crearYEditarCumulosPage.validaTasaNetaDeCesion();
    }

    @Step
    public void validacionUtilidadesNegativas(String mensaje) {
        crearYEditarCumulosPage.validaUtilidadesNegativas(mensaje);
    }

    public void validaPrimaBruta() {
        crearYEditarCumulosPage.validaPrimaBrutaDeCesion();
    }
}
