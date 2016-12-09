package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.utils.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class InformacionDePolizaMrcDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @Steps
    IngresoAPolicyCenterDefinitions guidewireLogin;


    @Given("se inicio una nueva suscripcion <numeroCuenta>")
    public void iniciaNuevaSuscripcionCuenta(@Named("numeroCuenta") String numeroCuenta) {
        informacionDePolizaMrcSteps.navegar_barra_superior(numeroCuenta);
        informacionDePolizaMrcSteps.navegar_por_las_opciones_de_acciones();
    }

    @Given("que estoy iniciando nueva suscripcion <numCuenta> con rol de usuario <rolUsuario>")
    public void iniciaNuevaSuscripcion(@Named("numCuenta") String numeroCuenta, @Named("rolUsuario") String rolUsuario) {

        if (SerenityWebdriverManager.inThisTestThread().hasAnInstantiatedDriver()) {
            SerenityWebdriverManager.inThisTestThread().resetCurrentDriver();
        }

        guidewireLogin.dadoQueAccedoAPolicyCenterConRol(rolUsuario);

        informacionDePolizaMrcSteps.navegar_barra_superior(numeroCuenta);
        informacionDePolizaMrcSteps.navegar_por_las_opciones_de_acciones();
    }

    @When("ingrese a la cuenta <numCuenta>")
    public void cuandoIngreseALaCuenta(@Named("numCuenta") String numeroCuenta) {
        informacionDePolizaMrcSteps.navegar_barra_superior(numeroCuenta);
        informacionDePolizaMrcSteps.navegar_por_las_opciones_de_acciones();
    }

    @When("este expidiendo una poliza de propiedad comercial")
    public void expidePolizaPropiedadComercial() {
        informacionDePolizaMrcSteps.selecciona_cotizacion_para_producto();
    }


    @When("quiero expedir una poliza nueva con los siguientes datos: <agente> <producto>")
    public void cuandoQuieroExpedirUnaPolizaNuevaConLosSiguientesDatos(@Named("agente") String agente,
                                                                       @Named("producto") String producto) {

        informacionDePolizaMrcSteps.ingresar_nueva_cotizacion(agente, producto);

    }

    @When("cotice una poliza")
    public void cuandoCotizeUnaPoliza(){
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
    }

    @When("quiero agregar un coaseguro <TipoCo> con particion de aseguradoras $entradatable")
    public void cuandoQuieroAgregarunCoaseguro(@Named("TipoCo") String tipoCo, ExamplesTable entradatable) {
        informacionDePolizaMrcSteps.agrego_un_coaseguro(tipoCo, entradatable);
    }

    @When("ingrese a edificios y ubicaciones")
    public void cuandoIntenteIngresarAEdificiosYUbicaciones() {
        informacionDePolizaMrcSteps.ingresar_a_edificios_y_ubicaciones();
    }
    @When("ingrese a edificios y ubicaciones en cambio de poliza")
    public void cuandoIntenteIngresarAEdificiosYUbicacionesEnCambioDePoliza() {
        informacionDePolizaMrcSteps.ingresar_a_edificios_y_ubicaciones_en_cambio_de_poliza();
    }
    @When("ingrese a edificios y ubicaciones en renovacion de poliza")
    public void cuandoIntenteIngresarAEdificiosYUbicacionesRenovacionDePoliza() {
        informacionDePolizaMrcSteps.ingresar_a_edificios_y_ubicaciones_en_renovacion_de_poliza();

    }
    @When("ingrese a informacion de poliza")
    public void cuandoIngreseAInformacionDePoliza(){
        informacionDePolizaMrcSteps.ingresar_a_informacion_de_poliza();
    }

    @When("ingrese a la opcion informacion de poliza")
    public void cuandoSeleccioneLaOpcionInformacionDePoliza(){
        informacionDePolizaMrcSteps.ingresar_a_opcion_informacion_de_poliza();
    }

    @Then("en informacion de poliza deben estar en estado <estadodos> las siguientes opciones $menusesperados")
    public void entoncesenInformacionDePolizaSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno,@Named("estadodos") String estadodos, ExamplesTable menusesperados){
        informacionDePolizaMrcSteps.validar_campos_informacion_poliza(estadouno,estadodos,menusesperados);
    }


    @When("de clic en Aceptar de la ventana Coaseguro")
    public void darClicEnAceptarDeCoaseuguro(){
        informacionDePolizaMrcSteps.darClicEnAceptarDeCoaseuguro();
    }

    @Then("se debe validar que se muestren los mensajes de obligatoriedad siguientes $mensajesesperados")
    public void entoncesSeDebenValidarQueSeMuestrenLosMensajesDeObligatoriedad(ExamplesTable mensajesesperados) {
        informacionDePolizaMrcSteps.validar_mensajes_coaseguros(mensajesesperados);
    }

    @When("seleccione el producto <nomProducto> a expedir")
    public void seleccioneElProducto(@Named("nomProducto") String nomProducto) {
        informacionDePolizaMrcSteps.seleccionar_producto(nomProducto);
    }

    @Then("se debe visualizar los datos del tomador <tomador>")
    public void datosDelTomadorYAdicional(@Named("tomador") String tomador) {
        informacionDePolizaMrcSteps.valida_datos_del_tomador(tomador);
    }

    /*
    * 2 Historia
    */

    @When("modifique la fecha de inicio de vigencia de la poliza <fechaInicioVigencia>")
    public void modificaFechaInicioFechaFin(@Named("fechaInicioVigencia") String fechaInicioVigencia) {
        informacionDePolizaMrcSteps.ingresar_fecha_de_vigencia(fechaInicioVigencia);
    }

    @Then("se debe mostrar un mensaje <mensaje> de error")
    public void mostarMensaError(@Named("mensaje") String mensaje) {
        informacionDePolizaMrcSteps.valida_mensaje_en_pantalla(mensaje);
    }


    /*
    * 3 Historia
    */

    @When("quiera agregar un tomador adicional que es riesgo consultable <cedula>")
    public void tomadorAdicionalRiesgoConsultabale(@Named("cedula") String cedula) {
        informacionDePolizaMrcSteps.ingresar_tomador_adicional(cedula);
    }

    @When("seleccione poliza de tipo no reaseguro especial")
    public void cuandoSeleccionPolizDeTipoNoReaseguroEspecial(){
        informacionDePolizaMrcSteps.seleccionar_poliza_tipo_no_reaseguro();
    }

    @Then("se debe mostrar un mensaje de error <mensaje> <mensaje2>")
    public void mensajesDeErrorRiesgosYPeps(@Named("mensaje") String mensaje,
                                            @Named("mensaje2") String mensaje2) {
        informacionDePolizaMrcSteps.valida_mensaje_en_pantalla(mensaje);
    }

     /*
    * 4 Historia
    */


    @When("seleccione la poliza como reaseguro especial")
    public void whenSeleccioneLaPolizaComoReaseguroAceptado() {
        informacionDePolizaMrcSteps.seleccionar_si_en_reaseguro();
    }

    @Then("la etiqueta del tomador debe cambiar a tomador cedente")
    public void thenLaEtiquetaDelTomadorDebeCambiarATomadorCedente() {
        informacionDePolizaMrcSteps.valida_opciones_reaseguro();
    }

    @Then("la etiqueta reaseguro debe marcarce a (si) automaticamente sin ser editable")
    public void cambioTomadorReaseguro() {
        informacionDePolizaMrcSteps.valida_opciones_reaseguro();
    }

    @Then("se debe ocultar la opcion de tomadores adicionales")
    public void thenSeDebeOcultarLaOpcionDeTomadoresAdicionales() {
        informacionDePolizaMrcSteps.valida_opciones_reaseguro();
    }

    /*
    *Bug Automatizado: Ocultar dirección en formulario
     */

    @When("requiera quitar la descripcion de la direccion del contacto")
    public void whenRequieraQuitarLaDescripcionDeLaDireccionDelContacto() {
        informacionDePolizaMrcSteps.eliminar_descripcion_de_direccion_en_contacto();
    }

    @Then("debe desaparecer del formulario principal")
    public void thenDebeDesaparecerDelFormularioPrincipal() {
        informacionDePolizaMrcSteps.validar_descipcion_de_direccion();
    }

    @Then("no se debe inhabilitar la opcion Numero de documento")
    public void entoncesNoSeDebeHabilitarLaOpcionNumeroDeDocumento() {
        informacionDePolizaMrcSteps.validar_campos_inhabilitados();
    }


    @Then("deben estar en estado <estadouno> las siguientes opciones $menusesperados")
    @Aliases(values = {
            "deben estar en estado <estadodos> las siguientes opciones $menusesperados",
    })
    public void entoncesSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno,@Named("estadodos") String estadodos, ExamplesTable menusesperados){
        informacionDePolizaMrcSteps.validar_campos(estadouno,estadodos,menusesperados);
    }
    @Then("ningun campo puede ser editable en informacion")
    public void entoncesNingunCampoPuedeSerEditable(){
        informacionDePolizaMrcSteps.validarCamposNoEditablesEnInformacionDePoliza();
    }




}

