package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.poliza.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
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

    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;


    @Given("se inicio una nueva suscripcion <numeroCuenta>")
    public void iniciaNuevaSuscripcionCuenta(@Named("numeroCuenta") String numeroCuenta) {
        informacionDePolizaMrcSteps.navegarBarraSuperior(numeroCuenta);
        informacionDePolizaMrcSteps.navegarPorLasOpcionesDeAcciones();
    }

    @Given("que estoy iniciando nueva suscripcion <numCuenta> con rol de usuario <rolUsuario>")
    public void iniciaNuevaSuscripcion(@Named("numCuenta") String numeroCuenta, @Named("rolUsuario") String rolUsuario) {

        if (SerenityWebdriverManager.inThisTestThread().hasAnInstantiatedDriver()) {
            SerenityWebdriverManager.inThisTestThread().resetCurrentDriver();
        }

        guidewireLogin.dadoQueAccedoAPolicyCenterConRol(rolUsuario);

        informacionDePolizaMrcSteps.navegarBarraSuperior(numeroCuenta);
        informacionDePolizaMrcSteps.navegarPorLasOpcionesDeAcciones();
    }

    @When("ingrese a la cuenta <numCuenta>")
    public void cuandoIngreseALaCuenta(@Named("numCuenta") String numeroCuenta) {
        informacionDePolizaMrcSteps.navegarBarraSuperior(numeroCuenta);
        informacionDePolizaMrcSteps.navegarPorLasOpcionesDeAcciones();
    }

    @When("cotice una poliza")
    public void cuandoCotizeUnaPoliza() {
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
    }

    @When("cotice y expida la sustitucion")
    @Alias("cotice y expida la poliza")
    public void cuandoCotizeYExpidaPoliza() {
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
        tasaUnicaSteps.expedirPoliza();
    }

    @When("cotice una poliza principal")
    public void cuandoCoticeUnaPolizaPrincipal() {
        informacionDePolizaMrcSteps.seleccionarOpcionCotizarPolizaPrincipal();
    }

    @When("quiero agregar un coaseguro <TipoCo> con particion de aseguradoras $entradatable")
    public void cuandoQuieroAgregarunCoaseguro(@Named("TipoCo") String tipoCo, ExamplesTable entradatable) {
        informacionDePolizaMrcSteps.agrego_un_coaseguro(tipoCo, entradatable);
    }

    @When("ingrese a edificios y ubicaciones")
    public void cuandoIntenteIngresarAEdificiosYUbicaciones() {
        informacionDePolizaMrcSteps.ingresarAEdificiosYUbicaciones();
    }

    @When("ingrese a edificios y ubicaciones en cambio de poliza")
    public void cuandoIntenteIngresarAEdificiosYUbicacionesEnCambioDePoliza() {
        informacionDePolizaMrcSteps.ingresarAEdificiosYUbicacionesEnCambioDePoliza();
    }

    @When("ingrese a edificios y ubicaciones en renovacion de poliza")
    public void cuandoIntenteIngresarAEdificiosYUbicacionesRenovacionDePoliza() {
        informacionDePolizaMrcSteps.ingresarAEdificiosYUbicacionesEnRenovacionDePoliza();

    }

    @When("ingrese a informacion de poliza")
    public void cuandoIngreseAInformacionDePoliza() {
        informacionDePolizaMrcSteps.ingresarAInformacionDePoliza();
    }

    @When("ingrese a la opcion informacion de poliza")
    public void cuandoSeleccioneLaOpcionInformacionDePoliza() {
        informacionDePolizaMrcSteps.ingresarAOpcionInformacionDePoliza();
    }

    @Then("en $variable deben estar en estado <estadodos> las siguientes opciones $menusesperados")
    public void entoncesenInformacionDePolizaSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno, @Named("estadodos") String estadodos, ExamplesTable menusesperados) {
        informacionDePolizaMrcSteps.validarCamposInformacionPoliza(estadouno, estadodos, menusesperados);
    }


    @When("de clic en Aceptar de la ventana Coaseguro")
    public void darClicEnAceptarDeCoaseuguro() {
        informacionDePolizaMrcSteps.darClicEnAceptarDeCoaseuguro();
    }

    @Then("se debe validar que se muestren los mensajes de obligatoriedad siguientes $mensajesesperados")
    public void entoncesSeDebenValidarQueSeMuestrenLosMensajesDeObligatoriedad(ExamplesTable mensajesesperados) {
        informacionDePolizaMrcSteps.validarMensajesCoaseguros(mensajesesperados);
    }

    @When("seleccione el producto <nomProducto> a expedir")
    public void seleccioneElProducto(@Named("nomProducto") String nomProducto) {
        informacionDePolizaMrcSteps.seleccionarProducto(nomProducto);
    }

    @Then("se debe visualizar los datos del tomador <tomador>")
    public void datosDelTomadorYAdicional(@Named("tomador") String tomador) {
        informacionDePolizaMrcSteps.validaDatosDelTomador(tomador);
    }

    /*
    * 2 Historia
    */

    @When("modifique la fecha de inicio de vigencia de la poliza <fechaInicioVigencia>")
    public void modificaFechaInicioFechaFin(@Named("fechaInicioVigencia") String fechaInicioVigencia) {
        informacionDePolizaMrcSteps.ingresarFechaDeVigencia(fechaInicioVigencia);
    }

    @Then("se debe mostrar un mensaje <mensajeerror> de error")
    public void mostarMensaError(@Named("mensajeerror") String mensaje) {
        informacionDePolizaMrcSteps.validaMensajeEnPantalla(mensaje);
    }


    /*
    * 3 Historia
    */

    @When("quiera agregar un tomador adicional que es riesgo consultable <tipo_documento> <documento>")
    public void tomadorAdicionalRiesgoConsultabale(@Named("tipo_documento") String tipoDocumento, @Named("documento") String documento) {
        informacionDePolizaMrcSteps.ingresarTomadorAdicional(tipoDocumento, documento);
    }

    @When("seleccione poliza de tipo no reaseguro especial")
    public void cuandoSeleccionPolizDeTipoNoReaseguroEspecial() {
        informacionDePolizaMrcSteps.seleccionarPolizaTipoNoReaseguro();
    }

    @Then("se debe mostrar un mensaje de error <mensaje> <mensaje2>")
    public void mensajesDeErrorRiesgosYPeps(@Named("mensaje") String mensaje,
                                            @Named("mensaje2") String mensaje2) {
        informacionDePolizaMrcSteps.validaMensajeEnPantalla(mensaje);
    }

     /*
    * 4 Historia
    */


    @When("seleccione la poliza como reaseguro especial")
    public void whenSeleccioneLaPolizaComoReaseguroAceptado() {
        informacionDePolizaMrcSteps.seleccionarSiEnReaseguro();
    }

    @Then("la etiqueta del tomador debe cambiar a tomador cedente")
    public void thenLaEtiquetaDelTomadorDebeCambiarATomadorCedente() {
        informacionDePolizaMrcSteps.validaOpcionesReaseguro();
    }

    @Then("la etiqueta reaseguro debe marcarce a (si) automaticamente sin ser editable")
    public void cambioTomadorReaseguro() {
        informacionDePolizaMrcSteps.validaOpcionesReaseguro();
    }

    @Then("se debe ocultar la opcion de tomadores adicionales")
    public void thenSeDebeOcultarLaOpcionDeTomadoresAdicionales() {
        informacionDePolizaMrcSteps.validaOpcionesReaseguro();
    }

    /*
    *Bug Automatizado: Ocultar dirección en formulario
     */

    @When("requiera quitar la descripcion de la direccion del contacto")
    public void whenRequieraQuitarLaDescripcionDeLaDireccionDelContacto() {
        informacionDePolizaMrcSteps.eliminarDescripcionDeDireccionEnContacto();
    }

    @Then("debe desaparecer del formulario principal")
    public void thenDebeDesaparecerDelFormularioPrincipal() {
        informacionDePolizaMrcSteps.validarDescipcionDeDireccion();
    }

    @Then("no se debe inhabilitar la opcion Numero de documento")
    public void entoncesNoSeDebeHabilitarLaOpcionNumeroDeDocumento() {
        informacionDePolizaMrcSteps.validarCamposInhabilitados();
    }


    @Then("deben estar en estado <estadouno> las siguientes opciones $menusesperados")
    public void entoncesSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno, ExamplesTable menusesperados) {
        informacionDePolizaMrcSteps.validarCampos(estadouno, menusesperados);
    }

    @Then ("deben estar en estado <estadodos> las siguientes opciones $menusesperados")
    public void entoncesSeDebenValidarLasSiguientesOpcionesDos(@Named("estadouno") String estadouno, @Named("estadodos") String estadodos, ExamplesTable menusesperados) {
        informacionDePolizaMrcSteps.validarCampos(estadodos, menusesperados);
    }

    @Then("ningun campo puede ser editable en informacion")
    public void entoncesNingunCampoPuedeSerEditable() {
        informacionDePolizaMrcSteps.validarCamposNoEditablesEnInformacionDePoliza();
    }


}

