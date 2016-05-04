package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.HistorialCuentaPage;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.yecht.Data;

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
    public void consultarPersonaJuridaPorRazonSocial(String tipoDoc, String razonSocial){
        busquedaContactoPage.consultarPersonaJuridaPorRazonSocial(tipoDoc, razonSocial);
    }

    //TODO
    @Step
    public void verInformacionPersonaJuridica(){
        busquedaContactoPage.verInformacionPersonaJuridica();
    }

    @Step
    public void validarInformacionTipoId() {
        busquedaContactoPage.validarInformacionTipoId();
    }

    @Step
    public void validarMensaje(String msjVal) {
        busquedaContactoPage.validarMensaje(msjVal);
    }

    @Step
    public void consultarContactoNumDoc(String tipoDoc, String numDoc) {
        busquedaContactoPage.consultarContactoNumDoc(tipoDoc, numDoc);
    }

    @Step
    public void consultarContactoTipoDoc(String tipoDoc) {
        busquedaContactoPage.consultarContactoTipoDoc(tipoDoc);
    }

    @Step
    public void consultarPersonaJuridicaTipoNumDoc(String numDoc) {
        busquedaContactoPage.consultarPersonaJuridicaTipoNumDoc(numDoc);
    }

    @Step
    @Pending
    public void verInfoPersonaJuridica() {
        busquedaContactoPage.verInfoPersonaJuridica();
    }

    @Step
    public void verInfoPersonaNatural() {
        busquedaContactoPage.verInfoPersonaNatural();
    }

    @Step
    public void consultarContactoTipoNumDoc(String tipoDoc, String numDoc) {
        busquedaContactoPage.consultarContactoTipoNumDoc(tipoDoc, numDoc);
    }

    @Step
    public void consultarContactoPorNombresYApellidos(String tipoDoc, String primerNombre, String segundoNombre,
                                                      String primerApellido, String segundoApellido) {
        busquedaContactoPage.consultarContactoPorNombresYApellidos(tipoDoc, primerNombre, segundoNombre, primerApellido, segundoApellido);
    }

    @Step
    public void consultarContactoNombreComercial(String tipoDoc, String nombreComercial) {
        busquedaContactoPage.consultarContactoNombreComercial(tipoDoc, nombreComercial);
    }
}
