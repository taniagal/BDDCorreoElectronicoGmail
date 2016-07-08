package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.InformacionDePolizaMrcSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class InformacionDePolizaMrcDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;



    @Given("se inicio una nueva suscripcion <numeroCuenta>")
    public void iniciaNuevaSuscripcionCuenta(@Named("numeroCuenta")String numeroCuenta) {
        informacionDePolizaMrcSteps.navegar_barra_superior(numeroCuenta);
        informacionDePolizaMrcSteps.navegar_por_las_opciones_de_acciones();
    }

    @When("este expidiendo una poliza de propiedad comercial <nomProducto>")
    public void expidePolizaPropiedadComercial(@Named("nomProducto")String nomProducto) {
        informacionDePolizaMrcSteps.selecciona_cotizacion_para_producto(nomProducto);
    }

    @Then("se debe visualizar los datos del tomador <tomador>")
    public void datosDelTomadorYAdicional(@Named("tomador")String tomador) {
         informacionDePolizaMrcSteps.valida_datos_del_tomador(tomador);
    }

    /*
    * 2 Historia
    */

    @When("modifique la fecha de inicio de vigencia de la poliza <fechaInicioVigencia>")
    public void modificaFechaInicioFechaFin(@Named("fechaInicioVigencia")String fechaInicioVigencia) {
         informacionDePolizaMrcSteps.ingresar_fecha_de_vigencia(fechaInicioVigencia);
    }

    @Then("se debe mostrar un mensaje <mensaje> de error")
    public void mostarMensaError(@Named("mensaje")String mensaje) {
        informacionDePolizaMrcSteps.valida_mensaje_en_pantalla(mensaje);
    }

    @Then("bloquear la operacion")
    public void bloqueoDeAplicacion() {
        informacionDePolizaMrcSteps.bloqueo_de_aplicacion();
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
        informacionDePolizaMrcSteps.valida_mensaje_en_pantalla(mensaje2);
    }

     /*
    * 4 Historia
    */


    @When("seleccione la poliza como reaseguro aceptado")
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



}
