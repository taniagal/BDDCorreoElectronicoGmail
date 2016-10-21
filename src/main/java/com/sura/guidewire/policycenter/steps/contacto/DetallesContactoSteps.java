package com.sura.guidewire.policycenter.steps.contacto;

import com.sura.guidewire.policycenter.pages.contacto.BusquedaContactoPage;
import com.sura.guidewire.policycenter.pages.contacto.DetallesContactoPage;
import com.sura.guidewire.policycenter.pages.contacto.DireccionPrincipalDeUnContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DetallesContactoSteps extends ScenarioSteps {
    BusquedaContactoPage busquedaContactoPage = new BusquedaContactoPage(getDriver());
    DetallesContactoPage detallesContactoPage = new DetallesContactoPage(getDriver());
    DireccionPrincipalDeUnContactoPage direccionPrincipalDeUnContactoPage = new DireccionPrincipalDeUnContactoPage(getDriver());

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
        detallesContactoPage.setNombre(segundoNombre);
    }

    @Step
    public void agregar_apellido(String segundoApellido){
        detallesContactoPage.setApellido(segundoApellido);
    }

    @Step
    public void agregar_profesion_estado_civil_y_tipo_familia(String profesion, String estadoCivil, String tipoFamilia) {
        detallesContactoPage.setDatosComboBoxes(profesion,estadoCivil,tipoFamilia);
    }

    @Step
    public void agregar_telefono_residencia(String telefonoResidencial) {
        detallesContactoPage.setTelefonosResidencial(telefonoResidencial);
    }

    @Step
    public void agregar_telefono_trabajo(String telefonoTrabajo){
        detallesContactoPage.setTelefonoTrabajo(telefonoTrabajo);
    }

    @Step
    public void agregar_telefono_celular(String telefonoCelular){
        detallesContactoPage.setTelefonoCelular(telefonoCelular);
    }

    @Step
    public void agregar_correos(String correoElectronicoPrimario, String correoElectronicoSecundario) {
        detallesContactoPage.setCorreo(correoElectronicoPrimario,correoElectronicoSecundario);
    }

    @Step
    public void agregar_nueva_direccion(){
        detallesContactoPage.setDireccion();
    }

    @Step
    public void agregar_razon_social(String nombreComercial, String actividadComercial) {
        detallesContactoPage.setRazonSocial(nombreComercial,actividadComercial);
    }

    @Step
    public void agregar_empleados(String numeroEmpleados, String ventasAnuales, String valorActivos) {
        detallesContactoPage.setEmpleados(numeroEmpleados,ventasAnuales,valorActivos);
    }

    @Step
    public void agregar_correos_persona_juridica(String telefonoOficina, String correoPrimario, String correoSecundario) {
        detallesContactoPage.setCorreosJ(telefonoOficina,correoPrimario,correoSecundario);
    }

    @Step
    public void agregar_direccion(ExamplesTable datos){
        direccionPrincipalDeUnContactoPage.agregarDireccion(datos);
    }

    @Step
    public void ir_a_direcciones() {
        direccionPrincipalDeUnContactoPage.irADirecciones();
    }

    @Step
    public void validar_mensaje(String mensaje) {
        detallesContactoPage.validarMensaje(mensaje);
    }

    @Step
    public void validar_datos_patalla() {
        direccionPrincipalDeUnContactoPage.validarDatosPantalla();
    }

    @Step
    public void validar_campos() {
        direccionPrincipalDeUnContactoPage.validarCampos();
    }

    @Step
    public void validar_direccion(){
        direccionPrincipalDeUnContactoPage.validarDireccion();
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
