package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class AdmonCotizacionCuentaSteps extends ScenarioSteps {

    public AdmonCotizacionCuentaSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    private OpcionesAdminitradorCotizaciones opcionesAdminitradorCotizaciones = new OpcionesAdminitradorCotizaciones(getDriver());

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
    public void valida_estado_de_la_cotizacion(String numCotizacion, String razon) {
        opcionesAdminitradorCotizaciones.validaEstado(numCotizacion, razon);
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
    public void valida_lista_de_razones(ExamplesTable listaRazones) throws Exception{
        opcionesAdminitradorCotizaciones.validarOpcionesDeAgregar(listaRazones);
    }


}
