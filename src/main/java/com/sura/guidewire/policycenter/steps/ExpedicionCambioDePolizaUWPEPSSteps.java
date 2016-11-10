package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.ExpedicionCambioDePolizaUWPEPSPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionCambioDePolizaUWPEPSSteps extends ScenarioSteps {

    private final ExpedicionCambioDePolizaUWPEPSPage expedirCambioDePolizaUWPEPSPage = new ExpedicionCambioDePolizaUWPEPSPage(getDriver());

    public ExpedicionCambioDePolizaUWPEPSSteps(Pages pages) {
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
    public void validar_Mensaje_Que_Devuelve_El_Servicio_PEPS(String mensaje) {
        expedirCambioDePolizaUWPEPSPage.aceptarExpedir();
        expedirCambioDePolizaUWPEPSPage.validarMensajePEP(mensaje);
    }

    @Step
    public void validar_Concatenacion_Mensaje(ExamplesTable texto) {
        expedirCambioDePolizaUWPEPSPage.validarConcatenacionMensaje(texto);
    }

}
