package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CambioDePolizaPage;
import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.fluentlenium.core.annotation.Page;

public class CambioDePolizaSteps extends ScenarioSteps {

    @Page
    private CambioDePolizaPage cambioDePolizaPage;

    @Page
    NuevaCotizacionPage nuevaCotizacionPage;

    private InicioPage inicioPage() {
        return ThucydidesWebDriverSupport.getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void irABuscarPoliza(String numeroPoliza) {
        inicioPage().irABuscarPoliza(numeroPoliza);
    }

    @Step
    public void irAMenuAcciones() {
        cambioDePolizaPage.irAMenuAcciones();
    }

    @Step
    public void cambiarPoliza() {
        cambioDePolizaPage.cambiarPoliza();
    }

    @Step
    public void esReaseguroEspecial(String reaseguroEspecial) {
        cambioDePolizaPage.esReaseguroEspecial(reaseguroEspecial);
    }

    @Step
    public void validarMensaje(String mensaje) {
        cambioDePolizaPage.validarMensaje(mensaje);
    }


    @Step
    public void seleccionarInformacionPoliza() {
        cambioDePolizaPage.seleccionarInformacionPoliza();
    }

    @Step
    public void validarMensajeNoReaseguro() {
        cambioDePolizaPage.validarMensajeNoHayReaseguro();
    }

    @Step
    public void ingresarReaseguroEspecial() {
        cambioDePolizaPage.ingresarReaseguroEspecial();
    }

    @Step
    public void cambiarFechaDeVigencia(String dias) {
        cambioDePolizaPage.cambiarFechaDeVigencia(dias);
    }

    @Step
    public void llenarInformacionDePoliza() {
        nuevaCotizacionPage.llenarInfoPoliza();
    }
}
