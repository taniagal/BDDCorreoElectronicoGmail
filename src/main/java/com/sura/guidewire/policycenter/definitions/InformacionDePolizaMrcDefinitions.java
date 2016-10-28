package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.InformacionDePolizaMrcSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class InformacionDePolizaMrcDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;


    @Given("se inicio una nueva suscripcion <numeroCuenta>")
    public void iniciaNuevaSuscripcionCuenta(@Named("numeroCuenta") String numeroCuenta) {
        informacionDePolizaMrcSteps.navegar_barra_superior(numeroCuenta);
        informacionDePolizaMrcSteps.navegar_por_las_opciones_de_acciones();
    }

    @When("este expidiendo una poliza de propiedad comercial")
    public void expidePolizaPropiedadComercial() {
        informacionDePolizaMrcSteps.selecciona_cotizacion_para_producto();
    }

    @When("seleccione el producto <nomProducto> a expedir")
    public void seleccioneElProducto(@Named("nomProducto") String nomProducto){
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
    public void tomadorAdicionalRiesgoConsultabale(@Named("cedula")String cedula) {
         informacionDePolizaMrcSteps.ingresar_tomador_adicional(cedula);
    }

    @Then("se debe mostrar un mensaje de error <mensaje> <mensaje2>")
    public void mensajesDeErrorRiesgosYPeps(@Named("mensaje")String mensaje,
                                            @Named("mensaje2")String mensaje2) {
        informacionDePolizaMrcSteps.valida_mensaje_en_pantalla(mensaje);
       // informacionDePolizaMrcSteps.valida_mensaje_en_pantalla(mensaje2);
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


}

