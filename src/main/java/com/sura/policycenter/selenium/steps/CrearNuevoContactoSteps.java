package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.EscritorioPage;
import com.sura.policycenter.selenium.pages.NuevoContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by brayruru on 2016/04/25.
 */
public class CrearNuevoContactoSteps extends ScenarioSteps {

    private final Guidewire gw = new Guidewire(getDriver());
    private final EscritorioPage escritorioPagePage = new EscritorioPage(getDriver());
    private final NuevoContactoPage nuevoContactoPage = new NuevoContactoPage(getDriver());

    private String cedula = "";
    private String nit = "";


    private void  initRandoms(){
        cedula = gw.cedulaRandom();
        nit = gw.nitRandom();

    }

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
        if("".equals(cedula) || "".equals(nit)){
            initRandoms();
        }
        nuevoContactoPage.ingresarNumeroDocumento(cedula);
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
        nuevoContactoPage.actualizarPersonaNatural();
    }

    @Step
    public void btnCrearPersona(){
        nuevoContactoPage.btnActualizarPersonaNatural();
    }

    //////CREAR CONTACTO PERSONA JURIDICA

    @Step
    public void nuevoContactoPersonaJuridica() {
        escritorioPagePage.nuevoContactoPersonaJuridica();
    }

    @Step
    public void ingresarRazonSocial( String razonSocial) {
        nuevoContactoPage.ingresarRazonSocial(razonSocial);
    }
    @Step
    public void actualizarJuridica(){
        nuevoContactoPage.actualizarJuridica();
    }

    @Step
    public void verificarContactoExistente(){
        nuevoContactoPage.verificarContactoExistente();
    }


    @Step
    public void ingresarNumeroTelefonoFijo(String tipoTelefonoFijo, String numeroTelefonoFijo){
        nuevoContactoPage.ingresarTelefonoFijo(tipoTelefonoFijo,numeroTelefonoFijo);
    }

    @Step
    public void validarCampoPaisDepartamentoYCiudad(){
        nuevoContactoPage.validarCampoPaisDepartamentoYCiudad();
    }





}
