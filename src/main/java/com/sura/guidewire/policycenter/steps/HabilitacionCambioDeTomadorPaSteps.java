package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.HabilitacionCambioDeTomadorPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class HabilitacionCambioDeTomadorPaSteps extends ScenarioSteps {
    @Page
    HabilitacionCambioDeTomadorPage habilitacionCambioDeTomadorPage;

    @Step
    public void validarPresenciaBotonCambiarTomadorPrincipal(ExamplesTable opciones) {
        Map<String, String> itemsCambiarTomador;
        String listaOpcionesCambiarTomador = habilitacionCambioDeTomadorPage.validarItemsCambiarTomador();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            itemsCambiarTomador = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesCambiarTomador, Matchers.containsString(itemsCambiarTomador.get("opciones")));
        }
    }

    @Step
    public void cambiarTomadorPrincipal(String numeroDocumento, String tipoDocumento) {
        habilitacionCambioDeTomadorPage.cambiarTomadorPrincipal(numeroDocumento, tipoDocumento);
    }

    @Step
    public void validarMensajePeps(ExamplesTable mensaje) {
        String mensajePeps = mensaje.getRow(0).get("mensaje");
        MatcherAssert.assertThat("mensaje personalizado", habilitacionCambioDeTomadorPage.validarmensajePeps(), Matchers.containsString(mensajePeps));
    }

    @Step
    public void validarMensajeRiesgoConsultable(ExamplesTable mensaje) {
        String mensajeRiesgoConsultable = mensaje.getRow(0).get("mensaje");
        MatcherAssert.assertThat("mensaje personalizado", habilitacionCambioDeTomadorPage.validarmensajeRiesgoConsultable(), Matchers.containsString(mensajeRiesgoConsultable));
    }

}

