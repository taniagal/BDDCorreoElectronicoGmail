package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.DetalleDeAseguradoDeCotizacionPage;
import com.sura.policycenter.selenium.pages.EdicionContactoAseguradoPage;
import com.sura.policycenter.selenium.pages.IngresoNuevoContactoAseguradoPage;
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

    public DetalleDeAseguradoDeCotizacionSteps(Pages pages){
        super(pages);
    }

    public void irAIngresarAsegurado() {
        detalleDeAseguradoDeCotizacionPage.irAIngresarAsegurado();
    }

    public void agregarAsegurado() {
        detalleDeAseguradoDeCotizacionPage.agregarAsegurado();
    }

    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar) {
        MatcherAssert.assertThat(detalleDeAseguradoDeCotizacionPage.validarOpcionesDeAgregar(listaAgregar), Is.is(Matchers.equalTo("Elementos de la opción Agregar correctos")));
    }

    public void agregarAseguradoContactoDeLaCuenta() {
        detalleDeAseguradoDeCotizacionPage.agregarAseguradoContactoDeLaCuenta();
    }

    public void agregarAseguradoContactoDelDirectorio() {
        detalleDeAseguradoDeCotizacionPage.agregarAseguradoContactoDelDirectorio();
    }

    public void seleccionarContactoDelDirectorio() {
        detalleDeAseguradoDeCotizacionPage.seleccionarContactoDelDirectorio();
    }

    public void seleccionarNuevaPersonaNatural() {
        detalleDeAseguradoDeCotizacionPage.seleccionarNuevaPersonaNatural();
    }

    public void ingresarDatosNuevaPersonaNatural(ExamplesTable datosPersonaNatural) {
        ingresoNuevoContactoAseguradoPage.ingresarDatosNuevaPersonaNatural(datosPersonaNatural);
    }

    public void seleccionarNuevaPersonaJuridica() {
        detalleDeAseguradoDeCotizacionPage.seleccionarNuevaPersonaJuridica();
    }

    public void ingresarDatosNuevaPersonaJuridica(ExamplesTable datosPersonaJuridica) {
        ingresoNuevoContactoAseguradoPage.ingresarDatosNuevaPersonaJuridica(datosPersonaJuridica);
    }

    public void validarMensaje(String mensaje) {
        MatcherAssert.assertThat(detalleDeAseguradoDeCotizacionPage.validarMensaje(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void validarAseguradosAgregados(ExamplesTable asegurados) {
        detalleDeAseguradoDeCotizacionPage.validarAseguradosAgregados(asegurados);
    }

    public void volverAAsegurados() {
        detalleDeAseguradoDeCotizacionPage.volverAAsegurados();
    }

    public void editarDatosNuevaPersonaNatural(ExamplesTable edicionPersonaNatural) {
        edicionContactoAseguradoPage.editarDatosNuevaPersonaNatural(edicionPersonaNatural);
    }

    public void editarDatosNuevaPersonaJuridica(ExamplesTable edicionPersonaJuridica) {
        edicionContactoAseguradoPage.editarDatosNuevaPersonaJuridica(edicionPersonaJuridica);
    }

    public void seleccionarContactoAgregado() {
        detalleDeAseguradoDeCotizacionPage.seleccionarContactoAgregado();
    }

    public void quitarAseguradoDeLaLista() {
        detalleDeAseguradoDeCotizacionPage.quitarAseguradoDeLaLista();
    }

    public void validarAseguradoEliminado() {
        detalleDeAseguradoDeCotizacionPage.validarAseguradoEliminado();
    }

    public void irASiguiente() {
        detalleDeAseguradoDeCotizacionPage.irASiguiente();
    }

    public void validarMensajeDeIntegraciones(String mensaje) {
        detalleDeAseguradoDeCotizacionPage.validarMensajeDeIntegraciones(mensaje);
    }

    public void irACrearNuevaCotizacion() {
        detalleDeAseguradoDeCotizacionPage.irACrearNuevaCotizacion();
    }

    public void ingresarCuenta(String cuenta) {
        detalleDeAseguradoDeCotizacionPage.ingresarCuenta(cuenta);
    }

    public void validarBotonNoVisible() {
        detalleDeAseguradoDeCotizacionPage.validarBotonNoVisible();
    }
}
