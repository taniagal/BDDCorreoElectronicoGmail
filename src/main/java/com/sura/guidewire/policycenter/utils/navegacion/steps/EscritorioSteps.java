package com.sura.guidewire.policycenter.utils.navegacion.steps;


import com.sura.guidewire.policycenter.utils.menu.acciones.escritorio.EscritorioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EscritorioSteps extends ScenarioSteps {

    private EscritorioPage escritorioPage;
    @Step
    public void irAmenuActividad() {
        escritorioPage.irAMenuActividad();
    }
    @Step
    public void verificarAuditoriaFinal(String numeroPoliza) {
        escritorioPage.verificarAuditoriaFinal(numeroPoliza);
    }
}
