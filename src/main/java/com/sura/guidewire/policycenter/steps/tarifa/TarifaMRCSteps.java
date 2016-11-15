package com.sura.guidewire.policycenter.steps.tarifa;

import com.sura.guidewire.policycenter.pages.PolizasDePrimeraPerdidaPage;
import com.sura.guidewire.policycenter.pages.tarifa.TarifaMRCPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class TarifaMRCSteps extends ScenarioSteps {
    TarifaMRCPage tarifaMRCPage = new TarifaMRCPage(getDriver());
    PolizasDePrimeraPerdidaPage polizasDePrimeraPerdidaPage = new PolizasDePrimeraPerdidaPage(getDriver());


    public TarifaMRCSteps(Pages page) {
        super(page);
    }

    @Step
    public void verificarTarifacion(String prima) {
        tarifaMRCPage.verificarTarifacion(prima);
    }

    @Step
    public void irAArticulos() {
        polizasDePrimeraPerdidaPage.irAArticulos();
    }

    @Step
    public void seleccionarCobertura(ExamplesTable datos) {
        tarifaMRCPage.irAArticulo();
        tarifaMRCPage.seleccionarCoberturaTerremoto(datos);
    }

    @Step
    public void seleccionarDeducibleSi() {
        tarifaMRCPage.seleccionarDeducibleSi();
    }

    @Step
    public void seleccionarDeducibleNo() {
        tarifaMRCPage.seleccionarDeducibleNo();
    }

    @Step
    public void agregarArticulo() {
        tarifaMRCPage.agregarArticulo();
    }

    @Step
    public void irAModificadores() {
        tarifaMRCPage.irAModificadores();
    }

    @Step
    public void verificarModificadores() {
        tarifaMRCPage.verificarModificadores();
    }

    @Step
    public void verificarTasaGlobal() {
        tarifaMRCPage.verificarTasaGlobal();
    }

    @Step
    public void verificarMensaje(String mensaje) {
        tarifaMRCPage.verificarMensaje(mensaje);
    }

    @Step
    public void ingresarTasaGlobal(String valor) {
        tarifaMRCPage.ingresarTasaGlobal(valor);
    }

    @Step
    public void seleccionarAMIT(ExamplesTable datos) {
        tarifaMRCPage.seleccionarCoberturaAMIT();
    }
}
