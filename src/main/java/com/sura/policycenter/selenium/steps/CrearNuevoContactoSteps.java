package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.EscritorioPage;
import com.sura.policycenter.selenium.pages.NuevoContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by brayruru on 2016/04/25.
 */
public class CrearNuevoContactoSteps extends ScenarioSteps {

    EscritorioPage escritorioPagePage = new EscritorioPage(getDriver());
    NuevoContactoPage nuevoContactoPage = new NuevoContactoPage(getDriver());

    public CrearNuevoContactoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void nuevoContactoPersona() {
        escritorioPagePage.nuevoContactoPersona();
    }

    @Step
    public void seleccionarTipoDocumentoPersonaNatural(String tipoDocumento){
        nuevoContactoPage.seleccionarTipoDocumento(tipoDocumento);

    }

    @Step
    public void ingresarNumeroDocumentoPersonaNatural(String numeroDocumento){
        nuevoContactoPage.ingresarNumeroDocumento(numeroDocumento);
    }

    @Step
    public void ingresarPrimerNombrePersonaNatural(String primerNombre){
        nuevoContactoPage.ingresarPrimerNombre(primerNombre);
    }

    @Step
    public void ingresarPrimerApellidoPersonaNatural(String primerApellido){
        nuevoContactoPage.ingresarPrimerApellido(primerApellido);
    }

    @Step
    public void seleccionarTipoDireccionPersonaNatural(String tipoDireccion){
        nuevoContactoPage.seleccionarTipoDireccion(tipoDireccion);
    }

    @Step
    public void ingresarDireccionPersonaNatural(String direccion){
        nuevoContactoPage.ingresarDireccion(direccion);
    }

    @Step
    public void actualizar(){
        nuevoContactoPage.actualizar();
    }


    @Step
    public void ingresarNumeroTelefonoFijo(String tipoTelefonoFijo, String numeroTelefonoFijo){
        nuevoContactoPage.ingresarTelefonoFijo(tipoTelefonoFijo,numeroTelefonoFijo);
    }



}
