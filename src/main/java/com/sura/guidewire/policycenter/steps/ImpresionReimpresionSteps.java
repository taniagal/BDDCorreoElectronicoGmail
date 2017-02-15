package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.ImpresionReimpresionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;


public class ImpresionReimpresionSteps extends ScenarioSteps {
    @Page
    ImpresionReimpresionPage impresionReimpresionPage;

    @Step
    public void irATransaccionesDePoliza() {
        impresionReimpresionPage.irATransaccionesDePoliza();
    }

    @Step
    public void validarBotonReimpresion() {
        impresionReimpresionPage.validarBotonReimpresion();
    }

    @Step
    public void seleccionarTransaccionesDeCuenta() {
    }

    @Step
    public void expedirRenovacionPoliza() {
        impresionReimpresionPage.expedirRenovacionPoliza();
    }

    @Step
    public void validarOpcionesReimprimir(ExamplesTable opciones) {
        Map<String, String> itemsReimprimir;
        String listaOpcionesDeclinacion = impresionReimpresionPage.validarItemsReimpresion();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            itemsReimprimir = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesDeclinacion, Matchers.containsString(itemsReimprimir.get("opciones")));
        }
    }

    @Step
    public void validarNoPresenciaDeReimpresion() {
        impresionReimpresionPage.validarNoPresenciaDeReimpresion();
    }
}
