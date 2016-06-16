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
    public void abrir_detalles_contacto_persona(String primerNombre, String primerApellido){
        inicioPage().irABuscarContacto();
        busquedaContactoPage.consultarContactoPorNombresYApellidos("CEDULA DE CIUDADANIA",primerNombre,"",primerApellido,"");
        busquedaContactoPage.seleccionarContacto();
    }

    @Step
    public void abrir_detalles_contacto_empresa(String nombreEmpresa) {
        inicioPage().irABuscarContacto();
        busquedaContactoPage.consultarPersonaJuridaPorRazonSocial("NIT", nombreEmpresa);
        busquedaContactoPage.seleccionarContacto();
    }

    @Step
    public void actualizar_contacto(){
        detallesContactoPage.actualizaContacto();
    }

    @Step
    public void agregar_nombre(String segundoNombre) {
        detallesContactoPage.editarContacto();
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
        detallesContactoPage.editarContacto();
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
        detallesContactoPage.editarContacto();
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
    public void validar_direccion(String tipoDireccion){
        detallesContactoPage.validarDireccion(tipoDireccion);
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
