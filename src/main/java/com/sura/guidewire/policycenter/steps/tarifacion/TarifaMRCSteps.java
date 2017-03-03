package com.sura.guidewire.policycenter.steps.tarifacion;

import com.sura.guidewire.policycenter.pages.poliza.PolizasDePrimeraPerdidaPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaMRCPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaTasaUnicaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class TarifaMRCSteps extends ScenarioSteps {
    @Page
    TarifaMRCPage tarifaMRCPage;
    @Page
    PolizasDePrimeraPerdidaPage polizasDePrimeraPerdidaPage;
    @Page
    TarifaTasaUnicaPage tasaUnicaPage;

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
        tarifaMRCPage.ingresarValorReconstruccion(datos);
        tarifaMRCPage.seleccionarCobertura(datos);
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
    public void cotizarArticuloBloqueado() {
        tarifaMRCPage.cotizarArticuloBloqueado();
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
    public void verificarTarifacionEnCobertura(String prima) {
        tarifaMRCPage.verificarTarifacionEnCobertura(prima);
    }

    @Step
    public void verificarImpuestos(){
        tarifaMRCPage.verificarImpuestos();
    }

    @Step
    public void seleccionarCoberturaDanos() {
        tarifaMRCPage.seleccionarCoberturaDanios();
    }

    @Step
    public void verificarTarifacionEnCoberturasTerremotoYSustraccion(ExamplesTable primasPoliza) {
        tarifaMRCPage.verificarTarifacionEnCoberturasTerremotoYSustraccion(primasPoliza);
    }

    @Step
    public void seleccionarArticulosYTodadsSusCoberturas(ExamplesTable datos){
        tarifaMRCPage.irAArticulo();
        tarifaMRCPage.seleccionarArticulosYTodadsSusCoberturas(datos);
    }

    @Step
    public void verificarTarifacion(ExamplesTable datos){
        tarifaMRCPage.verificarTarifacion(datos);
    }

    @Step
    public void ingresarValorcomercial(String valor, String valorIndice) {
        tarifaMRCPage.ingrasarValorComercial(valor, valorIndice);
    }

    @Step
    public void validarTasaGlobal(String tasa) {
        tarifaMRCPage.validarTasaGlobal(tasa);
    }

    @Step
    public void cambiarTasaGlobal(String tasaC) {
        tasaUnicaPage.editarTransaccion();
        tarifaMRCPage.cambiarTasaGlobal(tasaC);
    }

    @Step
    public void ingrasarIndiceVariableMaquinaria(String valor){
        tarifaMRCPage.ingrasarIndiceVariableMaquinaria(valor);
    }

    @Step
    public void ingresarValorcomercial(String valor) {
        tarifaMRCPage.ingrasarValorComercial(valor);
    }
}
