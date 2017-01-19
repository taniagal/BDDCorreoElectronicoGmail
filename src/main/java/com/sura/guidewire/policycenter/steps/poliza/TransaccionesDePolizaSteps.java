package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.TransaccionesDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class TransaccionesDePolizaSteps extends ScenarioSteps{

    @Page
    TransaccionesDePolizaPage transaccionesDePolizaPage;

    @Step
    public void irATransaccionesDePoliza() {
        transaccionesDePolizaPage.irATransaccionesDePoliza();
    }

    @Step
    public void consultarTransaccionesDePolizaPorNumero(String numeroTransaccion) {
        transaccionesDePolizaPage.consultarTransaccionesDePolizaPorNumero(numeroTransaccion);
    }

    @Step
    public void validarDetalleTransaccion() {
        MatcherAssert.assertThat("El detalle de la transaccion no coincide con el esperado", transaccionesDePolizaPage.validarDetalleTransaccion(), Is.is(Matchers.equalTo(true)));
    }

    @Step
    public void seleccionarTransacciones() {
        transaccionesDePolizaPage.seleccionarTransacciones();
    }

    @Step
    public void compararTransacciones() {
        transaccionesDePolizaPage.compararTransacciones();
    }

    @Step
    public void visualizarDiferenciasTransacciones(ExamplesTable diferenciasTransacciones) {
        Map<String, String> diferencias = diferenciasTransacciones.getRows().get(0);
        MatcherAssert.assertThat("La información de transacciones no coindice",
                transaccionesDePolizaPage.validarDiferenciasTransacciones(diferencias.get("cotizacion"), diferencias.get("cambioPoliza")),
                Is.is(Matchers.equalTo(true)));
    }
}
