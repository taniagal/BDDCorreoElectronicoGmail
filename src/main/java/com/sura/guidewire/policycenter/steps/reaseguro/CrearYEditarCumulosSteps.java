package com.sura.guidewire.policycenter.steps.reaseguro;

import com.sura.guidewire.policycenter.pages.reaseguro.CrearYEditarCumulosPages;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class CrearYEditarCumulosSteps extends ScenarioSteps {

    CrearYEditarCumulosPages crearYEditarCumulosPages = new CrearYEditarCumulosPages (getDriver());

    public CrearYEditarCumulosSteps(Pages pages){
        super(pages);
    }


    public void ingresar_a_opcion_reaseguro() {
        crearYEditarCumulosPages.ingresarReaseguroOpciones();
    }

    public void ingresar_a_opcion_crear_acuerdo_facultativo() {
        crearYEditarCumulosPages.ingresarAcuerdosFacultativos();
    }
}
