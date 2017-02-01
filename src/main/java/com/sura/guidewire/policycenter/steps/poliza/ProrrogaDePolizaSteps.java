package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.ProrrogaDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;

public class ProrrogaDePolizaSteps extends ScenarioSteps{

    @Page
    private ProrrogaDePolizaPage prorrogaDePolizaPage;

    @Step
    public void validarProrroga() {
        MatcherAssert.assertThat("No se está mostrando el campo de prórroga", prorrogaDePolizaPage.validarProrroga(), Is.is(Matchers.equalTo(true)));
        prorrogaDePolizaPage.habilitarProrroga();
    }

    @Step
    public void validarFechaFinVigencia() {
        MatcherAssert.assertThat("La fecha de vigencia no es editable", prorrogaDePolizaPage.validarFechaFinVigencia(), Is.is(Matchers.equalTo("input")));
    }
}
