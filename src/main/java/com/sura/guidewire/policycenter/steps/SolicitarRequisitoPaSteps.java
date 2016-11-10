package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.SolicitarRequisitoPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class SolicitarRequisitoPaSteps extends ScenarioSteps{

    private SolicitarRequisitoPaPage solicitarRequisitoPa;

    @Step
    public void validar_Que_Se_Habilite_La_Opcion_Solicitar_Requisitos() {
        solicitarRequisitoPa.validarOpcionHabilitada();
    }

    @Step
    public void validar_Que_Se_Muestre_Mensaje_De_Advertencia(ExamplesTable mensaje){
        solicitarRequisitoPa.validarAdvertenciaRequisitos(mensaje);
    }

    @Step
    public void validar_Que_Existan_Requisitos_Pendientes() {
        solicitarRequisitoPa.validarRequisitos();
    }
}
