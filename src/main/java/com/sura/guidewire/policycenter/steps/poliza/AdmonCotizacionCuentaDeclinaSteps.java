package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class AdmonCotizacionCuentaDeclinaSteps extends ScenarioSteps {

    private final OpcionesAdminitradorCotizaciones opcionesAdminitradorCotizaciones = new OpcionesAdminitradorCotizaciones(getDriver());

    public AdmonCotizacionCuentaDeclinaSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }


    @Step
    public void navegarBarraSuperior(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
        inicioPage().irAOpcionesAdministradorCotizaciones();
    }

    @Step
    public void seleccionarOpcionEnAcciones() {
        opcionesAdminitradorCotizaciones.seleccionarAccionesDeclinar();
    }

    @Step
    public void ingresarInformacionAlMomentoDeRechazar(String razon) {
        opcionesAdminitradorCotizaciones.ingresaRechazo(razon);
    }

    @Step
    public void declinarSinRazon() {
        opcionesAdminitradorCotizaciones.noIngresaRechazo();
    }

    @Step
    public void validaEstadoDeLaCotizacion(String numCotizacion, String accion) {
        opcionesAdminitradorCotizaciones.validaEstado(numCotizacion, accion);
    }

    @Step
    public void inhabilitaAcciones() {
        opcionesAdminitradorCotizaciones.validaAccionDesabilita();
    }

    @Step
    public void validaMensaje(String mensaje) {
        opcionesAdminitradorCotizaciones.validaMensaje(mensaje);
    }

    @Step
    public void validaListaDeRazones(ExamplesTable listaRazones){
        opcionesAdminitradorCotizaciones.validarOpcionesDeAgregar(listaRazones);
    }

    @Step
    public void cotizarParaLaOpcionDeclinar() {
        opcionesAdminitradorCotizaciones.cotizarParaOpcionesDeclinarYNoTomar("declinar");
    }
}
