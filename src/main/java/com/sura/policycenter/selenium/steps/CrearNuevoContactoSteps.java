package com.sura.policycenter.selenium.steps;

import com.sura.commons.selenium.Commons;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.NuevoContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CrearNuevoContactoSteps extends ScenarioSteps {

    private String cedula = "";
    private String nit = "";
    private String tipoDoc="";
    private final Commons gw = new Commons(getDriver());
    private final NuevoContactoPage nuevoContactoPage = new NuevoContactoPage(getDriver());

    public CrearNuevoContactoSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    private void  initRandoms(){
        cedula = gw.cedulaRandom();
        nit = gw.nitRandom();
    }

    @Step
    public void actualizar(String primerNombre){
        nuevoContactoPage.actualizarPersonaNatural(primerNombre);
    }

    @Step
    public void actualizar_juridica(String razonSocial){
        nuevoContactoPage.actualizarJuridica(razonSocial);
    }

    @Step
    public void crear_persona(){
        nuevoContactoPage.btnActualizarPersonaNatural();
    }

    @Step
    public void ingresar_numero_documento_persona_natural(String numeroDocumento){
        if("".equals(cedula) || "".equals(nit)) {
            initRandoms();
        }
        if(("NIT").equals(tipoDoc)) {
            nuevoContactoPage.ingresarNumeroDocumento(nit);
        } else {
            nuevoContactoPage.ingresarNumeroDocumento(cedula);
        }
    }

    @Step
    public void ingresar_primer_nombre_persona_natural(String primerNombre){
        nuevoContactoPage.ingresarPrimerNombre(primerNombre);
    }

    @Step
    public void ingresar_primer_apellido_persona_natural(String primerApellido){
        nuevoContactoPage.ingresarPrimerApellido(primerApellido);
    }

    @Step
    public void ingresar_direccion_persona_natural(String direccion, String departamento, String ciudad){
        nuevoContactoPage.ingresarDireccionDepartamenteYCiudad(direccion, departamento, ciudad);
    }


    @Step
    public void ingresar_numero_telefono_fijo(String tipoTelefonoFijo, String numeroTelefonoFijo){
        nuevoContactoPage.ingresarTelefonoFijo(tipoTelefonoFijo,numeroTelefonoFijo);
    }

    @Step
    public void ingresar_direccion_persona_natural2(String direccion, String departamento, String ciudad, String tipoDireccion){
        nuevoContactoPage.ingresarDireccion2(direccion, departamento, ciudad, tipoDireccion);
    }

    @Step
    public void ingresar_razon_social(String razonSocial) {
        nuevoContactoPage.ingresarRazonSocial(razonSocial);
    }

    @Step
    public void nuevo_contacto_persona() {
        inicioPage().irANuevaPersona();
    }

    @Step
    public void nuevo_contacto_persona_juridica() {
        inicioPage().irANuevaCompania();
    }

    @Step
    public void seleccionar_tipo_direccion_persona_natural(String tipoDireccion){
        nuevoContactoPage.seleccionarTipoDireccion(tipoDireccion);
    }

    @Step
    public void seleccionar_tipo_documento_persona_natural(String tipoDocumento){
        nuevoContactoPage.seleccionarTipoDocumento(tipoDocumento);
        tipoDoc = tipoDocumento;
    }

    @Step
    public void validar_campo_pais_departamento_y_ciudad(){
        nuevoContactoPage.validarCampoPaisDepartamentoYCiudad();
    }

    @Step
    public void verificar_contacto_existente(){
        nuevoContactoPage.verificarContactoExistente();
    }

}
