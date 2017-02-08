package com.sura.guidewire.policycenter.steps.contacto;

import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.pages.contacto.NuevoContactoPage;
import com.sura.guidewire.policycenter.utils.Utils;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CrearNuevoContactoSteps extends ScenarioSteps {

    private String cedula = "";
    private String nit = "";
    private String tipoDoc = "";
    private final NuevoContactoPage nuevoContactoPage = new NuevoContactoPage(getDriver());

    public CrearNuevoContactoSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    private void initRandoms() {
        cedula = Utils.cedulaRandom();
        nit = Utils.nitRandom();
    }

    @Step
    public void actualizar(String primerNombre) {
        nuevoContactoPage.actualizarPersonaNatural(primerNombre);
    }

    @Step
    public void actualizar_juridica(String razonSocial) {
        nuevoContactoPage.actualizarJuridica(razonSocial);
    }

    @Step
    public void crear_persona() {
        nuevoContactoPage.btnActualizarPersonaNatural();
    }

    @Step
    public void ingresarNumeroDocumentoPersonaNatural(String numeroDocumento) {
        if ("".equals(cedula) || "".equals(nit)) {
            initRandoms();
        }
        if (numeroDocumento.contains("123")) {
            nuevoContactoPage.ingresarNumeroDocumento(numeroDocumento);
        } else {
            if (("NIT").equals(tipoDoc)) {
                nuevoContactoPage.ingresarNumeroDocumento(nit);
            } else {
                nuevoContactoPage.ingresarNumeroDocumento(cedula);
            }
        }
    }

    @Step
    public void ingresarPrimerNombrePersonaNatural(String primerNombre) {
        nuevoContactoPage.ingresarPrimerNombre(primerNombre);
    }

    @Step
    public void ingresarPrimerApellidoPersonaNatural(String primerApellido) {
        nuevoContactoPage.ingresarPrimerApellido(primerApellido);
    }

    @Step
    public void ingresarDireccionPersonaNatural(String direccion, String departamento, String ciudad) {
        nuevoContactoPage.ingresarDireccionDepartamenteYCiudad(direccion, departamento, ciudad);
    }


    @Step
    public void ingresarNumeroTelefonoFijo(String tipoTelefonoFijo, String numeroTelefonoFijo) {
        nuevoContactoPage.ingresarTelefonoFijo(tipoTelefonoFijo, numeroTelefonoFijo);
    }

    @Step
    public void ingresarRazonSocial(String razonSocial) {
        nuevoContactoPage.ingresarRazonSocial(razonSocial);
    }

    @Step
    public void nuevoContactoPersona() {
        inicioPage().irANuevaPersona();
    }

    @Step
    public void nuevoContactoPersonaJuridica() {
        inicioPage().irANuevaCompania();
    }

    @Step
    public void seleccionarTipoDireccionPersonaNatural(String tipoDireccion) {
        nuevoContactoPage.seleccionarTipoDireccion(tipoDireccion);
    }

    @Step
    public void seleccionarTipoDocumentoPersonaNatural(String tipoDocumento) {
        nuevoContactoPage.seleccionarTipoDocumento(tipoDocumento);
        tipoDoc = tipoDocumento;
    }

    @Step
    public void validarCampoPaisDepartamentoYCiudad() {
        nuevoContactoPage.validarCampoPaisDepartamentoYCiudad();
    }

    @Step
    public void verificarContactoExistente() {
        nuevoContactoPage.verificarContactoExistente();
    }

    @Step
    public void ingresarFechaDeNacimiento(String fecha) {
        nuevoContactoPage.ingresarFechaDeNacimiento(fecha);
    }

    @Step
    public void ingresarSegundoNombreYSegundoApellido(String segundoNombre, String segundoApellido) {
        nuevoContactoPage.ingresarSegundoNombreYSegundoApellido(segundoNombre, segundoApellido);
    }

}
