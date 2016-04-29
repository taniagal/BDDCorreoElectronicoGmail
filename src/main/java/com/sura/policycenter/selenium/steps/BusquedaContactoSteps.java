package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.HistorialCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class BusquedaContactoSteps extends ScenarioSteps {

    BusquedaContactoPage busquedaContactoPage = new BusquedaContactoPage(getDriver());

    public BusquedaContactoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void accionarBuscarContacto() {

        busquedaContactoPage.accionarBuscarContacto();
    }

    @Step
    public void buscarContactoPorTipoYNroIdentificacion(String tipoIdentificacion, String numeroIdentificacion) {
        busquedaContactoPage.buscarContactoPorTipoYNroIdentificacion(tipoIdentificacion, numeroIdentificacion);
    }

    @Step
    public void buscarContactoPorPrimerNombreYPrimerApellido(String primerNombre, String primerApellido) {
        busquedaContactoPage.buscarContactoPersona(primerNombre, primerApellido);
    }

    @Step
    public void buscarContactoPorPrimerNombreYPrimerApellidoSinVerDetalles(String primerNombre, String primerApellido) {
        busquedaContactoPage.buscarContactoPersonaSinVerDetalle(primerNombre, primerApellido);
    }

    @Step
    public void consultarPersonaJuridaPorRazonSocial(String razonSocial){
        busquedaContactoPage.consultarPersonaJuridaPorRazonSocial(razonSocial);
    }

    //TODO
    @Step
    public void verInformacionPersonaJuridica(){
        busquedaContactoPage.verInformacionPersonaJuridica();
    }
}
