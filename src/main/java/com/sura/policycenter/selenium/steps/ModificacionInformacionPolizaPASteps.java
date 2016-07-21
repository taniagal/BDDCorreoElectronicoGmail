package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ModificacionInformacionPolizaPAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.reports.html.ExampleTable;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class ModificacionInformacionPolizaPASteps extends ScenarioSteps{

    ModificacionInformacionPolizaPAPage modificacionInformacionPolizaPAPage = new ModificacionInformacionPolizaPAPage(getDriver());

    public ModificacionInformacionPolizaPASteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresarPoliza(String numeroPoliza) {
        modificacionInformacionPolizaPAPage.ingresarPoliza(numeroPoliza);
    }

    @Step
    public void irAModificarInformacionPoliza() {
        modificacionInformacionPolizaPAPage.irAModificarInformacionPoliza();
    }

    @Step
    public void validarInformacionPoliza(Map<String, String> labelsInformacionPoliza, ExamplesTable informacionPoliza){
        modificacionInformacionPolizaPAPage.validarInformacionPoliza(labelsInformacionPoliza, informacionPoliza);
    }

    @Step
    public void adicionarSegundoTomador(String tipoDocumento, String numeroDocumento) {
        modificacionInformacionPolizaPAPage.adicionarSegundoTomador(tipoDocumento, numeroDocumento);
    }

    @Step
    public void validarRegistroSegundoTomador(Map<String, String> datosSegundoTomador) {
        modificacionInformacionPolizaPAPage.validarRegistroSegundoTomador(datosSegundoTomador);
    }

    @Step
    public void validarTomadorRiesgo() {
        modificacionInformacionPolizaPAPage.validarTomadorRiesgo();
    }

    @Step
    public void validarBloqueoSegundoTomador(String mensaje) {
        modificacionInformacionPolizaPAPage.validarBloqueoSegundoTomador(mensaje);
    }

    @Step
    public void validarRestriccionEdicionTomador() {
        modificacionInformacionPolizaPAPage.validarRestriccionEdicionTomador();
    }
}
