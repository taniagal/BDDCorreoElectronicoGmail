package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.DetallesContactoPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class DetallesContactoSteps extends ScenarioSteps {
    BusquedaContactoPage bc = new BusquedaContactoPage(getDriver());
    DetallesContactoPage dc = new DetallesContactoPage(getDriver());

    public DetallesContactoSteps(Pages pages){
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }


    @Step
    public void abrirDetallesContactoPersona(String primerNombre, String primerApellido){
        inicioPage().irABuscarContacto();
        bc.consultarContactoPorNombresYApellidos("CEDULA DE CIUDADANIA",primerNombre,"",primerApellido,"");
        bc.seleccionarContacto();
    }

    @Step
    public void verificarCamposPersonaNatural() {
        dc.verificarCamposPersonaNatural();
    }

    @Step
    public void abrirDetallesContactoEmpresa(String nombreEmpresa) {
        inicioPage().irABuscarContacto();
        bc.consultarPersonaJuridaPorRazonSocial("NIT", nombreEmpresa);
        bc.seleccionarContacto();
    }

    @Step
    public void verificarCamposPersonaJuridica() {
        dc.verificarCamposPersonaJuridica();
    }

    @Step
    public void actualizarContacto(){
        dc.actualizaContacto();
    }

    @Step
    public void verificarActualizacionPersona(){
        dc.verificarActualizacion();
    }

    @Step
    public void verificarActualizacionPersonaJuridica(){
        dc.verificarActualizacionJuridico();
    }

    @Step
    public void agregarNombre(String segundoNombre) {
        dc.editarContacto();
        dc.agregarNombre(segundoNombre);
    }

    @Step
    public void agregarApellido(String segundoApellido){
        dc.agregarApellido(segundoApellido);
    }

    @Step
    public void agregarLists(String profesion,String estadoCivil,String tipoFamilia) {
        dc.agregarLists(profesion,estadoCivil,tipoFamilia);
    }

    @Step
    public void agregarTelefonoResidencia(String telefonoResidencial) {
        dc.agregarTelefonosResidencial(telefonoResidencial);
    }

    @Step
    public void agregarTelefonoTrabajo(String telefonoTrabajo){
        dc.agregarTelefonoTrabajo(telefonoTrabajo);
    }

    @Step
    public void agregarTelefonoCelular(String telefonoCelular){
        dc.agregarTelefonoCelular(telefonoCelular);
    }

    @Step
    public void agregarCorreos(String correoElectronicoPrimario, String correoElectronicoSecundario) {
        dc.agregarCorreo(correoElectronicoPrimario,correoElectronicoSecundario);
    }

    @Step
    public void agregarDireccion() {
        dc.editarContacto();
        dc.irADirecciones();
    }

    @Step
    public void agregarNuevaDireccion(){
        dc.agregarDireccion();
    }

    @Step
    public void validarDatosPatalla() {
        dc.validarDatosPantalla();
    }

    @Step
    public void validarCampos() {
        dc.validarCampos();
    }

    @Step
    public void validarDireccion(String tipoDireccion){
        dc.validarDireccion(tipoDireccion);
    }

    @Step
    public void agregarRazonSocial(String nombreComercial, String actividadComercial) {
        dc.editarContacto();
        dc.agregarRazonSocial(nombreComercial,actividadComercial);
    }

    @Step
    public void validarMensaje(String mensaje) {
        dc.validarMensaje(mensaje);
    }

    @Step
    public void agregarEmpleados(String numeroEmpleados, String ventasAnuales, String valorActivos) {
        dc.agregarEmpleados(numeroEmpleados,ventasAnuales,valorActivos);
    }

    @Step
    public void agregarCorreosJ(String telefonoOficina, String correoPrimario, String correoSecundario) {
        dc.agregarCorreosJ(telefonoOficina,correoPrimario,correoSecundario);
    }
}
