package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.DetallesContactoPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class DetallesContactoSteps extends ScenarioSteps {
    BusquedaContactoPage busquedaContactoPage = new BusquedaContactoPage(getDriver());
    DetallesContactoPage detallesContactoPage = new DetallesContactoPage(getDriver());

    public DetallesContactoSteps(Pages pages){
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }


    @Step
    public void abrirDetallesContactoPersona(String primerNombre, String primerApellido){
        inicioPage().irABuscarContacto();
        busquedaContactoPage.consultarContactoPorNombresYApellidos("CEDULA DE CIUDADANIA",primerNombre,"",primerApellido,"");
        busquedaContactoPage.seleccionarContacto();
    }

    @Step
    public void verificarCamposPersonaNatural() {
        detallesContactoPage.verificarCamposPersonaNatural();
    }

    @Step
    public void abrirDetallesContactoEmpresa(String nombreEmpresa) {
        inicioPage().irABuscarContacto();
        busquedaContactoPage.consultarPersonaJuridaPorRazonSocial("NIT", nombreEmpresa);
        busquedaContactoPage.seleccionarContacto();
    }

    @Step
    public void verificarCamposPersonaJuridica() {
        detallesContactoPage.verificarCamposPersonaJuridica();
    }

    @Step
    public void actualizarContacto(){
        detallesContactoPage.actualizaContacto();
    }

    @Step
    public void verificarActualizacionPersona(){
        detallesContactoPage.verificarActualizacion();
    }

    @Step
    public void verificarActualizacionPersonaJuridica(){
        detallesContactoPage.verificarActualizacionJuridico();
    }

    @Step
    public void agregarNombre(String segundoNombre) {
        detallesContactoPage.editarContacto();
        detallesContactoPage.agregarNombre(segundoNombre);
    }

    @Step
    public void agregarApellido(String segundoApellido){
        detallesContactoPage.agregarApellido(segundoApellido);
    }

    @Step
    public void agregarLists(String profesion,String estadoCivil,String tipoFamilia) {
        detallesContactoPage.agregarLists(profesion,estadoCivil,tipoFamilia);
    }

    @Step
    public void agregarTelefonoResidencia(String telefonoResidencial) {
        detallesContactoPage.agregarTelefonosResidencial(telefonoResidencial);
    }

    @Step
    public void agregarTelefonoTrabajo(String telefonoTrabajo){
        detallesContactoPage.agregarTelefonoTrabajo(telefonoTrabajo);
    }

    @Step
    public void agregarTelefonoCelular(String telefonoCelular){
        detallesContactoPage.agregarTelefonoCelular(telefonoCelular);
    }

    @Step
    public void agregarCorreos(String correoElectronicoPrimario, String correoElectronicoSecundario) {
        detallesContactoPage.agregarCorreo(correoElectronicoPrimario,correoElectronicoSecundario);
    }

    @Step
    public void agregarDireccion() {
        detallesContactoPage.editarContacto();
        detallesContactoPage.irADirecciones();
    }

    @Step
    public void agregarNuevaDireccion(){
        detallesContactoPage.agregarDireccion();
    }

    @Step
    public void validarDatosPatalla() {
        detallesContactoPage.validarDatosPantalla();
    }

    @Step
    public void validarCampos() {
        detallesContactoPage.validarCampos();
    }

    @Step
    public void validarDireccion(String tipoDireccion){
        detallesContactoPage.validarDireccion(tipoDireccion);
    }

    @Step
    public void agregarRazonSocial(String nombreComercial, String actividadComercial) {
        detallesContactoPage.editarContacto();
        detallesContactoPage.agregarRazonSocial(nombreComercial,actividadComercial);
    }

    @Step
    public void validarMensaje(String mensaje) {
        detallesContactoPage.validarMensaje(mensaje);
    }

    @Step
    public void verificarEstadoDocumento(){
        detallesContactoPage.verificarEstadoDeDocumento();
    }
    @Step
    public void agregarEmpleados(String numeroEmpleados, String ventasAnuales, String valorActivos) {
        detallesContactoPage.agregarEmpleados(numeroEmpleados,ventasAnuales,valorActivos);
    }

    @Step
    public void agregarCorreosJ(String telefonoOficina, String correoPrimario, String correoSecundario) {
        detallesContactoPage.agregarCorreosJ(telefonoOficina,correoPrimario,correoSecundario);
    }
}
