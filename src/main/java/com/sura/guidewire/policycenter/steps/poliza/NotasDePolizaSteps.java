package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.NotasDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;

public class NotasDePolizaSteps extends ScenarioSteps{

    @Page
    private NotasDePolizaPage notasDePolizaPage;

    @Step
    public void irANotasDePoliza() {
        notasDePolizaPage.irANotasDePoliza();
    }

    @Step
    public void seleccionarRangoDeFechas(ExamplesTable rangoFechas) {
        notasDePolizaPage.seleccionarRangoDeFechas(rangoFechas);
    }

    @Step
    public void validarNotasPorRangoDeFecha() {
        MatcherAssert.assertThat(notasDePolizaPage.validarNotasPorRangoDeFecha(), Is.is(Matchers.notNullValue()));
    }
}
