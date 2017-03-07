package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.modificaciones.PolizaFinanciadaPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

public class PolizaFinanciadaSteps {
    @Page
    PolizaFinanciadaPage polizaFinanciadaPage;
    @Page
    TarifaAutosPage tarifaAutosPage;

    @Step
    public void SeleccionarOpcionFinanciarPoliza() {
        polizaFinanciadaPage.SeleccionarOpcionFinanciarPoliza();
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
    public void ValidarNoCampoNumeroDeCuotas() {
        polizaFinanciadaPage.ValidarNoCampoNumeroDeCuotas();
    }

    @Step
    public void validarCuotasAFinanciar(ExamplesTable numeroCuotas) {
        String numeroCuotasAFinanciar = numeroCuotas.getRow(0).get("numeroCuotas");
        MatcherAssert.assertThat("No existe el numero de cuotas", polizaFinanciadaPage.validarNumeroCuotasAFinanciar(), Matchers.containsString(numeroCuotasAFinanciar));
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
