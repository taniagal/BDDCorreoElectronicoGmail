package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.NuevoContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CrearNuevoContactoSteps extends ScenarioSteps {

    private String cedula = "";
    private String nit = "";
    private String tipoDoc="";
    private final Guidewire gw = new Guidewire(getDriver());
    private final NuevoContactoPage nuevoContactoPage = new NuevoContactoPage(getDriver());
    private InicioPage inicioPage() { return getPages().currentPageAt(InicioPage.class); }

    private void  initRandoms(){
        cedula = gw.cedulaRandom();
        nit = gw.nitRandom();
    }

    public CrearNuevoContactoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void nuevoContactoPersona() {
        inicioPage().irANuevaPersona();
    }

    @Step
    public void seleccionarTipoDocumentoPersonaNatural(String tipoDocumento){
        nuevoContactoPage.seleccionarTipoDocumento(tipoDocumento);
        tipoDoc = tipoDocumento;
    }

    @Step
    public void ingresarNumeroDocumentoPersonaNatural(String numeroDocumento){
        if("".equals(cedula) || "".equals(nit))
            initRandoms();
        if(("NIT").equals(tipoDoc)) {
            nuevoContactoPage.ingresarNumeroDocumento(nit);
        } else {
            nuevoContactoPage.ingresarNumeroDocumento(cedula);
        }
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
    public void ingresarDireccionPersonaNatural(String direccion, String departamento, String ciudad){
        nuevoContactoPage.ingresarDireccion(direccion, departamento, ciudad);
    }

    @Step
    public void ingresarDireccionPersonaNatural2(String direccion, String departamento, String ciudad, String tipoDireccion){
        nuevoContactoPage.ingresarDireccion2(direccion, departamento, ciudad, tipoDireccion);
    }

    @Step
    public void actualizar(String primerNombre){
        nuevoContactoPage.actualizarPersonaNatural(primerNombre);
    }

    @Step
    public void btnCrearPersona(){
        nuevoContactoPage.btnActualizarPersonaNatural();
    }

    /**
     * Crear contacto persona juridica
     */
    @Step
    public void nuevoContactoPersonaJuridica() {
        inicioPage().irANuevaCompania();
    }

    @Step
    public void ingresarRazonSocial( String razonSocial) {
        nuevoContactoPage.ingresarRazonSocial(razonSocial);
    }
    @Step
    public void actualizarJuridica(String razonSocial){
        nuevoContactoPage.actualizarJuridica(razonSocial);
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
