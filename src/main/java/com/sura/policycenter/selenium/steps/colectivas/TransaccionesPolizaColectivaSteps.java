package com.sura.policycenter.selenium.steps.colectivas;


import com.sura.policycenter.selenium.pages.colectivas.TransaccionesPolizaColectivaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class TransaccionesPolizaColectivaSteps extends ScenarioSteps {

    private TransaccionesPolizaColectivaPage transaccionesPolizaColectivaPage;

    @Step
    public void validarOpcionesDelMenuParaPolizaColectivaEIndividual() {
        transaccionesPolizaColectivaPage.validarOpcionesDelMenu();
    }

    @Step
    public void seleccionarLaOpcionTransaccionesPolizaIndividual() {
        transaccionesPolizaColectivaPage.seleccionarLaOpcionTransaccionesPolizaIndividual();
    }

    @Step
    public void validarTransaccionesDePolizaColectiva(ExamplesTable transacciones) {
        transaccionesPolizaColectivaPage.validarTransaccionesDePolizaColectiva(transacciones);
    }

    @Step
    public void validarTransaccionesDePolizaIndividual() {
        transaccionesPolizaColectivaPage.validarTransaccionesDePolizaIndividual();
    }

    @Step
    public void darClicEnElNumeroDePoliza() {
        transaccionesPolizaColectivaPage.darClicEnElNumeroDePoliza();
    }

    @Step
    public void validarConsultaDeTomador() {
        transaccionesPolizaColectivaPage.validarConsultaDeTomador();
    }

    @Step
    public void clicEnTransaccionesDePolizaColectiva() {
        transaccionesPolizaColectivaPage.clicEnTransaccionesDePolizaColectiva();
    }
}
