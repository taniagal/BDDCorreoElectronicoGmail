package com.sura.guidewire.policycenter.steps.tarifacion;

import com.sura.guidewire.policycenter.pages.tarifacion.TarifaMRCPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class TarifaMRCSteps extends ScenarioSteps{
    TarifaMRCPage tarifaMRCPage = new TarifaMRCPage(getDriver());

    public TarifaMRCSteps(Pages page){
        super(page);
    }

    @Step
    public void verificar_tarifacion(String prima) {
        tarifaMRCPage.verificarTarifacion(prima);
    }
}
