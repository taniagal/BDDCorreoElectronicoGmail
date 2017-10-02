package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.modificaciones.CambioDePolizaPage;
import com.sura.guidewire.policycenter.pages.poliza.PolizaPage;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class CambioDePolizaSteps extends ScenarioSteps {

    @Page
    NuevaCotizacionPage nuevaCotizacionPage;
    @Page
    PolizaPage polizaPage;
    @Page
    private CambioDePolizaPage cambioDePolizaPage;

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

    @Step
    public void irAMenuEdificiosYUbicaciones() {
        cambioDePolizaPage.irAMenuEdificiosYUbicaciones();
    }

    @Step
    public void ingresarAEdificionYUbicacionesPolyceChange() {
        cambioDePolizaPage.ingresarAEdificionYUbicacionesPolyceChange();
    }

    @Step
    public void validarMercanciaFlotante(Parametros parametros) {
        cambioDePolizaPage.validarMercanciaFlotante(parametros);
    }
    @Step
    public void modificarDatosVehiculo(ExamplesTable datos) {
        cambioDePolizaPage.modificarDatosvehiculo(datos);
    }
    @Step
    public void cambioVehiculo(ExamplesTable cambiosVehiculo) {
        cambioDePolizaPage.cambioVehiculo(cambiosVehiculo);
    }

    @Step
    public void presionarBotonSiguiente() {
        cambioDePolizaPage.presionarOpcionSiguiente();
    }
}
