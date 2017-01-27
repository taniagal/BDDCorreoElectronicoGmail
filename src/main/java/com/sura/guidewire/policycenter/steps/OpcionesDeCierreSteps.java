package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.OpcionesDeCierrePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class OpcionesDeCierreSteps extends ScenarioSteps {

    @Page
    OpcionesDeCierrePage opcionesDeCierrePage;

    @Step
    public void irAOpcionesDeCierre() {
        opcionesDeCierrePage.irAOpcionesDeCierre();
    }

    @Step
    public void validarInformacionDeclinar(ExamplesTable opcionesDeclinacion) {
        Map<String, String> itemsDeclinacion;
        for (int i = 0; i < opcionesDeclinacion.getRowCount(); i++) {
            itemsDeclinacion = opcionesDeclinacion.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", opcionesDeCierrePage.validarItemsDeclinacion(itemsDeclinacion.get("itemDeclinacion")), Is.is(Matchers.equalTo(true)));
        }
    }
}
