package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.ImpresionReimpresionPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;


public class ImpresionReimpresionPaSteps extends ScenarioSteps {
    @Page
    ImpresionReimpresionPaPage impresionReimpresionPaPage;

    @Step
    public void irATransaccionesDePoliza() {
        impresionReimpresionPaPage.irATransaccionesDePoliza();
    }

    @Step
    public void validarBotonReimpresion() {
        impresionReimpresionPaPage.validarBotonReimpresion();
    }

    @Step
    public void expedirRenovacionPoliza() {
        impresionReimpresionPaPage.expedirRenovacionPoliza();
    }

    @Step
    public void validarOpcionesReimprimir(ExamplesTable opciones) {
        Map<String, String> itemsReimprimir;
        String listaOpcionesDeclinacion = impresionReimpresionPaPage.validarItemsReimpresion();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            itemsReimprimir = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesDeclinacion, Matchers.containsString(itemsReimprimir.get("opciones")));
        }
    }

    @Step
    public void validarNoPresenciaDeReimpresion() {
        impresionReimpresionPaPage.validarNoPresenciaDeReimpresion();
    }

    public void SeleccionarOpcionDocumento() {
        impresionReimpresionPaPage.seleccionarOpcionDocumento();
    }

    public void validarOpcionesSeleccionadas() {
        impresionReimpresionPaPage.validarOpcionesReimpresion();
    }
}
