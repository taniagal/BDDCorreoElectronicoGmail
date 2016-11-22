package com.sura.guidewire.policycenter.steps;

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
    public void navegar_barra_superior(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
        inicioPage().irAOpcionesAdministradorCotizaciones();
    }

    @Step
    public void seleccionar_opcion_en_acciones() {
        opcionesAdminitradorCotizaciones.seleccionarAccionesDeclinar();
    }

    @Step
    public void ingresar_informacion_al_momento_de_rechazar(String razon) {
        opcionesAdminitradorCotizaciones.ingresaRechazo(razon);
    }

    @Step
    public void declinar_sin_razon() {
        opcionesAdminitradorCotizaciones.noIngresaRechazo();
    }

    @Step
    public void valida_estado_de_la_cotizacion(String numCotizacion, String accion) {
        opcionesAdminitradorCotizaciones.validaEstado(numCotizacion, accion);
    }

    @Step
    public void inhabilita_acciones() {
        opcionesAdminitradorCotizaciones.validaAccionDesabilita();
    }

    @Step
    public void valida_mensaje(String mensaje) {
        opcionesAdminitradorCotizaciones.validaMensaje(mensaje);
    }

    @Step
    public void valida_lista_de_razones(ExamplesTable listaRazones){
        opcionesAdminitradorCotizaciones.validarOpcionesDeAgregar(listaRazones);
    }


}
