package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.pages.ConsultaDetalleDeAseguradosPage;
import com.sura.guidewire.policycenter.pages.DetalleDeAseguradoDeCotizacionPage;
import com.sura.guidewire.policycenter.pages.EdicionContactoAseguradoPage;
import com.sura.guidewire.policycenter.pages.IngresoNuevoContactoAseguradoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;

public class DetalleDeAseguradoDeCotizacionSteps extends ScenarioSteps{

    private final DetalleDeAseguradoDeCotizacionPage detalleDeAseguradoDeCotizacionPage = new DetalleDeAseguradoDeCotizacionPage(getDriver());
    private final IngresoNuevoContactoAseguradoPage ingresoNuevoContactoAseguradoPage = new IngresoNuevoContactoAseguradoPage(getDriver());
    private final EdicionContactoAseguradoPage edicionContactoAseguradoPage = new EdicionContactoAseguradoPage(getDriver());
    private final ConsultaDetalleDeAseguradosPage consultaDetalleDeAseguradosPage = new ConsultaDetalleDeAseguradosPage(getDriver());


    public DetalleDeAseguradoDeCotizacionSteps(Pages pages){
        super(pages);
    }

    @Step
    public void irAIngresarAsegurado() {
        detalleDeAseguradoDeCotizacionPage.irAIngresarAsegurado();
    }

    @Step
    public void agregarAsegurado() {
        detalleDeAseguradoDeCotizacionPage.agregarAsegurado();
    }

    @Step
    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar) {
        Integer opcionesEsperadas = listaAgregar.getRowCount();
        MatcherAssert.assertThat(detalleDeAseguradoDeCotizacionPage.validarOpcionesDeAgregar(listaAgregar).toString(), Is.is(Matchers.equalTo(opcionesEsperadas.toString())));
    }

    @Step
    public void agregarAseguradoContactoDeLaCuenta() {
        detalleDeAseguradoDeCotizacionPage.agregarAseguradoContactoDeLaCuenta();
    }

    public void agregarAseguradoContactoDelDirectorio() {
        detalleDeAseguradoDeCotizacionPage.agregarAseguradoContactoDelDirectorio();
    }

    @Step
    public void seleccionarContactoDelDirectorio() {
        detalleDeAseguradoDeCotizacionPage.seleccionarContactoDelDirectorio();
    }

    @Step
    public void seleccionarNuevaPersonaNatural() {
        detalleDeAseguradoDeCotizacionPage.seleccionarNuevaPersonaNatural();
    }

    @Step
    public void ingresarDatosNuevaPersonaNatural(ExamplesTable datosPersonaNatural) {
        ingresoNuevoContactoAseguradoPage.ingresarDatosNuevaPersonaNatural(datosPersonaNatural);
    }

    @Step
    public void seleccionarNuevaPersonaJuridica() {
        detalleDeAseguradoDeCotizacionPage.seleccionarNuevaPersonaJuridica();
    }

    @Step
    public void ingresarDatosNuevaPersonaJuridica(ExamplesTable datosPersonaJuridica) {
        ingresoNuevoContactoAseguradoPage.ingresarDatosNuevaPersonaJuridica(datosPersonaJuridica);
    }

    public void validarMensaje(String mensaje) {
        MatcherAssert.assertThat(detalleDeAseguradoDeCotizacionPage.validarMensaje(), Is.is(Matchers.equalTo(mensaje)));
    }

    @Step
    public void validarAseguradosAgregados(ExamplesTable asegurados) {
        detalleDeAseguradoDeCotizacionPage.validarAseguradosAgregados(asegurados);
    }

    @Step
    public void volverAAsegurados() {
        detalleDeAseguradoDeCotizacionPage.volverAAsegurados();
    }

    public void editarDatosNuevaPersonaNatural(ExamplesTable edicionPersonaNatural) {
        edicionContactoAseguradoPage.editarDatosNuevaPersonaNatural(edicionPersonaNatural);
    }

    @Step
    public void editarDatosNuevaPersonaJuridica(ExamplesTable edicionPersonaJuridica) {
        edicionContactoAseguradoPage.editarDatosNuevaPersonaJuridica(edicionPersonaJuridica);
    }

    @Step
    public void seleccionarContactoAgregado() {
        detalleDeAseguradoDeCotizacionPage.seleccionarContactoAgregado();
    }

    @Step
    public void quitarAseguradoDeLaLista() {
        detalleDeAseguradoDeCotizacionPage.quitarAseguradoDeLaLista();
    }

    @Step
    public void validarAseguradoEliminado() {
        detalleDeAseguradoDeCotizacionPage.validarAseguradoEliminado();
    }

    @Step
    public void irASiguiente() {
        detalleDeAseguradoDeCotizacionPage.irASiguiente();
    }

    @Step
    public void validarMensajeDeIntegraciones(String mensaje) {
        detalleDeAseguradoDeCotizacionPage.validarMensajeDeIntegraciones(mensaje);
    }

    @Step
    public void irACrearNuevaCotizacion() {
        detalleDeAseguradoDeCotizacionPage.irACrearNuevaCotizacion();
    }

    @Step
    public void ingresarCuenta(String cuenta) {
        detalleDeAseguradoDeCotizacionPage.ingresarCuenta(cuenta);
    }

    @Step
    public void validarBotonNoVisible() {
        detalleDeAseguradoDeCotizacionPage.validarBotonNoVisible();
    }

    @Step
    public void validarContinuacionDeCotizacion() {
        detalleDeAseguradoDeCotizacionPage.validarContinuacionDeCotizacion();
    }

    @Step
    public void validarDetalleDeRiesgo(ExamplesTable datosAsegurado) {
        consultaDetalleDeAseguradosPage.validarDetalleDeRiesgo(datosAsegurado);
    }
}
