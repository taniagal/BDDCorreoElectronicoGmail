package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ExpedirCambioDePolizaUWPEPSPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ExpedirCambioDePolizaUWPEPSSteps extends ScenarioSteps {

    private final ExpedirCambioDePolizaUWPEPSPage expedirCambioDePolizaUWPEPSPage = new ExpedirCambioDePolizaUWPEPSPage(getDriver());

    public ExpedirCambioDePolizaUWPEPSSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void validar_Figuras_Igual_DNI(String tipoDocumento, String numeroDocumento) {
        expedirCambioDePolizaUWPEPSPage.validarFigurasIgualDNI(tipoDocumento, numeroDocumento);
    }

    @Step
    public void emitir_poliza() {
        expedirCambioDePolizaUWPEPSPage.emitirPoliza();
    }

    @Step
    public void ir_A_Pantalla_UW() {
        expedirCambioDePolizaUWPEPSPage.irAPantallaUW();
    }

    @Step
    public void validar_Mensaje_Que_Devuelve_El_Servicio_PEPS(String mensaje) {
        expedirCambioDePolizaUWPEPSPage.validarMensajePEP(mensaje);
    }

    @Step
    public void validar_Concatenacion_Mensaje(ExamplesTable texto) {
        expedirCambioDePolizaUWPEPSPage.validarConcatenacionMensaje(texto);
    }
}
