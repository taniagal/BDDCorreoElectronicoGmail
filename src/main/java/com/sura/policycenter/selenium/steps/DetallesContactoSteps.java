package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.DetallesContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class DetallesContactoSteps extends ScenarioSteps {
    BusquedaContactoPage busquedaContactoPage = new BusquedaContactoPage(getDriver());
    DetallesContactoPage detallesContactoPage = new DetallesContactoPage(getDriver());

    public DetallesContactoSteps(Pages pages){
        super(pages);
    }


    @Step
    public void abrir_detalles_contacto(String tipoDocumento, String documento){
        detallesContactoPage.irABuscarContacto();
        busquedaContactoPage.consultarContactoNumDoc(tipoDocumento,documento);
        busquedaContactoPage.seleccionarContacto();
    }

    @Step
    public void actualizar_contacto(){
        detallesContactoPage.actualizaContacto();
    }

    @Step
    public void editar_contacto(){
        detallesContactoPage.editarContacto();
    }

    @Step
    public void agregar_nombre(String segundoNombre) {
        detallesContactoPage.agregarNombre(segundoNombre);
    }

    @Step
    public void agregar_apellido(String segundoApellido){
        detallesContactoPage.agregarApellido(segundoApellido);
    }

    @Step
    public void agregar_profesion_estado_civil_y_tipo_familia(String profesion, String estadoCivil, String tipoFamilia) {
        detallesContactoPage.agregarCombos(profesion,estadoCivil,tipoFamilia);
    }

    @Step
    public void agregar_telefono_residencia(String telefonoResidencial) {
        detallesContactoPage.agregarTelefonosResidencial(telefonoResidencial);
    }

    @Step
    public void agregar_telefono_trabajo(String telefonoTrabajo){
        detallesContactoPage.agregarTelefonoTrabajo(telefonoTrabajo);
    }

    @Step
    public void agregar_telefono_celular(String telefonoCelular){
        detallesContactoPage.agregarTelefonoCelular(telefonoCelular);
    }

    @Step
    public void agregar_correos(String correoElectronicoPrimario, String correoElectronicoSecundario) {
        detallesContactoPage.agregarCorreo(correoElectronicoPrimario,correoElectronicoSecundario);
    }

    @Step
    public void agregar_nueva_direccion(){
        detallesContactoPage.agregarDireccion();
    }

    @Step
    public void agregar_razon_social(String nombreComercial, String actividadComercial) {
        detallesContactoPage.agregarRazonSocial(nombreComercial,actividadComercial);
    }

    @Step
    public void agregar_empleados(String numeroEmpleados, String ventasAnuales, String valorActivos) {
        detallesContactoPage.agregarEmpleados(numeroEmpleados,ventasAnuales,valorActivos);
    }

    @Step
    public void agregar_correos_persona_juridica(String telefonoOficina, String correoPrimario, String correoSecundario) {
        detallesContactoPage.agregarCorreosJ(telefonoOficina,correoPrimario,correoSecundario);
    }

    @Step
    public void ir_a_direcciones() {
        detallesContactoPage.irADirecciones();
    }

    @Step
    public void validar_mensaje(String mensaje) {
        detallesContactoPage.validarMensaje(mensaje);
    }

    @Step
    public void validar_datos_patalla() {
        detallesContactoPage.validarDatosPantalla();
    }

    @Step
    public void validar_campos() {
        detallesContactoPage.validarCampos();
    }

    @Step
    public void validar_direccion(){
        detallesContactoPage.validarDireccion();
    }

    @Step
    public void verificar_campos_persona_natural() {
        detallesContactoPage.verificarCamposPersonaNatural();
    }

    @Step
    public void verificar_campos_persona_juridica() {
        detallesContactoPage.verificarCamposPersonaJuridica();
    }
    @Step
    public void verificar_actualizacion_persona(){
        detallesContactoPage.verificarActualizacion();
    }

    @Step
    public void verificar_actualizacion_persona_juridica(){
        detallesContactoPage.verificarActualizacionJuridico();
    }

    @Step
    public void verificar_estado_de_documento(){
        detallesContactoPage.verificarEstadoDeDocumento();
    }
}
