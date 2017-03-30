package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.modificaciones.PolizaFinanciadaPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class PolizaFinanciadaSteps {
    @Page
    PolizaFinanciadaPage polizaFinanciadaPage;
    @Page
    TarifaAutosPage tarifaAutosPage;

    @Step
    public void seleccionarOpcionFinanciarPoliza() {
        polizaFinanciadaPage.seleccionarOpcionFinanciarPoliza();
    }

    @Step
    public void ingresarNumeroDeCuotasAFinanciar(String numeroCuotas) {
        polizaFinanciadaPage.ingresarNumeroDeCuotasAFinanciar(numeroCuotas);
    }

    @Step
    public void visualizarInformacionDePolizaFinanciada(ExamplesTable informacionFinanciacion) {
        String informacionPolizaFinanciada = informacionFinanciacion.getRow(0).get("informacionFinanciacion");
        MatcherAssert.assertThat("mensaje personalizado", polizaFinanciadaPage.validarInformacionDePolizaFinanciada(), Matchers.containsString(informacionPolizaFinanciada));
    }

    @Step
    public void seleccionarOpcionNoFinanciarPoliza() {
        polizaFinanciadaPage.seleccionarOpcionNoFinanciarPoliza();

    }

    @Step
    public void validarNoCampoNumeroDeCuotas() {
        polizaFinanciadaPage.validarNoCampoNumeroDeCuotas();
    }

    @Step
    public void validarCuotasAFinanciar(ExamplesTable numeroCuotas) {
        String numeroCuotasAFinanciar1 = numeroCuotas.getRow(0).get("opcionesCuotas");
        String numeroCuotasAFinanciar2 = numeroCuotas.getRow(1).get("opcionesCuotas");
        Map<String, String> cuotasObtenidas = polizaFinanciadaPage.validarNumeroCuotasAFinanciar();
        MatcherAssert.assertThat("No existe el numero de cuotas", cuotasObtenidas.get("numeroCuota11"), Matchers.containsString(numeroCuotasAFinanciar1));
        MatcherAssert.assertThat("No existe el numero de cuotas", cuotasObtenidas.get("numeroCuota12"), Matchers.containsString(numeroCuotasAFinanciar2));
    }

    @Step
    public void clickEnOpcionFinanciarPoliza(ExamplesTable datos) {
        polizaFinanciadaPage.financiarPoliza(datos);
    }

    public void agregarCoberturas(ExamplesTable datos) {
        tarifaAutosPage.seleccionarCoberturasBasica(datos);
        tarifaAutosPage.desMarcarCoberturas();
    }
}
