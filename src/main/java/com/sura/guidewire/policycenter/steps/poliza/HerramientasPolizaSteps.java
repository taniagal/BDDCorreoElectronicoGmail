package com.sura.guidewire.policycenter.steps.poliza;


import com.sura.guidewire.policycenter.pages.poliza.HerramientasPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class HerramientasPolizaSteps  extends ScenarioSteps {

    @Page
    private HerramientasPolizaPage herramientasPolizaPage;

    @Step
    public void ingresarProgramaAuditoria() {
        herramientasPolizaPage.ingresarProgramaAuditoria();
    }
    @Step
    public void validarProgramaAuditoria(ExamplesTable opciones) {
        herramientasPolizaPage.validarProgramaAuditoria(opciones);
    }
    @Step
    public void validarProgramaSinAuditoria(ExamplesTable opciones) {
        herramientasPolizaPage.validarProgramaSinAuditoria(opciones);
    }
}
