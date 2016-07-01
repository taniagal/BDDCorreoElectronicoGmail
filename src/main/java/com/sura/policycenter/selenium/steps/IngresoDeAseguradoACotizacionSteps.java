package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.EdicionContactoAseguradoPage;
import com.sura.policycenter.selenium.pages.IngresoDeAseguradoACotizacionPage;
import com.sura.policycenter.selenium.pages.IngresoNuevoContactoAseguradoPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;

public class IngresoDeAseguradoACotizacionSteps extends ScenarioSteps{

    private final IngresoDeAseguradoACotizacionPage ingresoDeAseguradoACotizacionPage = new IngresoDeAseguradoACotizacionPage(getDriver());
    private final IngresoNuevoContactoAseguradoPage ingresoNuevoContactoAseguradoPage = new IngresoNuevoContactoAseguradoPage(getDriver());
    private final EdicionContactoAseguradoPage edicionContactoAseguradoPage = new EdicionContactoAseguradoPage(getDriver());

    public IngresoDeAseguradoACotizacionSteps (Pages pages){
        super(pages);
    }

    public void irAIngresarAsegurado() {
        ingresoDeAseguradoACotizacionPage.irAIngresarAsegurado();
    }

    public void agregarAsegurado() {
        ingresoDeAseguradoACotizacionPage.agregarAsegurado();
    }

    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar) {
        MatcherAssert.assertThat(ingresoDeAseguradoACotizacionPage.validarOpcionesDeAgregar(listaAgregar), Is.is(Matchers.equalTo("Elementos de la opción Agregar correctos")));
    }

    public void agregarAseguradoContactoDeLaCuenta() {
        ingresoDeAseguradoACotizacionPage.agregarAseguradoContactoDeLaCuenta();
    }

    public void agregarAseguradoContactoDelDirectorio() {
        ingresoDeAseguradoACotizacionPage.agregarAseguradoContactoDelDirectorio();
    }

    public void seleccionarContactoDelDirectorio() {
        ingresoDeAseguradoACotizacionPage.seleccionarContactoDelDirectorio();
    }

    public void seleccionarNuevaPersonaNatural() {
        ingresoDeAseguradoACotizacionPage.seleccionarNuevaPersonaNatural();
    }

    public void ingresarDatosNuevaPersonaNatural(ExamplesTable datosPersonaNatural) {
        ingresoNuevoContactoAseguradoPage.ingresarDatosNuevaPersonaNatural(datosPersonaNatural);
    }

    public void seleccionarNuevaPersonaJuridica() {
        ingresoDeAseguradoACotizacionPage.seleccionarNuevaPersonaJuridica();
    }

    public void ingresarDatosNuevaPersonaJuridica(ExamplesTable datosPersonaJuridica) {
        ingresoNuevoContactoAseguradoPage.ingresarDatosNuevaPersonaJuridica(datosPersonaJuridica);
    }

    public void validarMensaje(String mensaje) {
        MatcherAssert.assertThat(ingresoDeAseguradoACotizacionPage.validarMensaje(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void validarAseguradosAgregados(ExamplesTable asegurados) {
        ingresoDeAseguradoACotizacionPage.validarAseguradosAgregados(asegurados);
    }

    public void volverAAsegurados() {
        ingresoDeAseguradoACotizacionPage.volverAAsegurados();
    }

    public void editarDatosNuevaPersonaNatural(ExamplesTable edicionPersonaNatural) {
        edicionContactoAseguradoPage.editarDatosNuevaPersonaNatural(edicionPersonaNatural);
    }

    public void editarDatosNuevaPersonaJuridica(ExamplesTable edicionPersonaJuridica) {
        edicionContactoAseguradoPage.editarDatosNuevaPersonaJuridica(edicionPersonaJuridica);
    }

    public void seleccionarContactoAgregado() {
        ingresoDeAseguradoACotizacionPage.seleccionarContactoAgregado();
    }

    public void quitarAseguradoDeLaLista() {
        ingresoDeAseguradoACotizacionPage.quitarAseguradoDeLaLista();
    }

    public void validarAseguradoEliminado() {
        ingresoDeAseguradoACotizacionPage.validarAseguradoEliminado();
    }

    public void irASiguiente() {
        ingresoDeAseguradoACotizacionPage.irASiguiente();
    }

    public void validarMensajeDeIntegraciones(String mensaje) {
        ingresoDeAseguradoACotizacionPage.validarMensajeDeIntegraciones(mensaje);
    }

    public void irACrearNuevaCotizacion() {
        ingresoDeAseguradoACotizacionPage.irACrearNuevaCotizacion();
    }

    public void ingresarCuenta(String cuenta) {
        ingresoDeAseguradoACotizacionPage.ingresarCuenta(cuenta);
    }

    public void validarBotonNoVisible() {
        ingresoDeAseguradoACotizacionPage.validarBotonNoVisible();
    }
}
