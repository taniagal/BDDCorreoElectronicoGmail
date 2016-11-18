package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.ModificacionInformacionPolizaPASteps;
import com.sura.guidewire.policycenter.steps.ModificacionVehiculoSteps;
import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireSteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ModificacionVehiculoDefinitions{
    @Steps
    ModificacionVehiculoSteps modificacionVehiculoSteps;

    @Steps
    ModificacionInformacionPolizaPASteps modificacionInformacionPolizaPASteps;
    @Steps
    GuidewireSteps guidewire;

    @Given("se tiene una poliza expedida <numeroPoliza>")
    public void buscarPoliza(@Named("numeroPoliza") String numeroPoliza){
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(numeroPoliza);
        modificacionInformacionPolizaPASteps.irAModificarInformacionPoliza();
        modificacionVehiculoSteps.ir_A_Modificar_Vehiculo();
    }

    @When("digite el numero fasecolda <numeroFasecolda> y modelo <modelo> de un vehiculo")
    public void digitarFasecoldaYModelo(@Named("numeroFasecolda") String numeroFasecolda,
                                        @Named("modelo") String modelo){
        modificacionVehiculoSteps.digitar_Fasecolda_Y_Modelo(numeroFasecolda, modelo);
    }

    @When("registre una zona de circulacion no permitida <ciudadCirculacion>")
    public void registrarZonaCirculacion(@Named("ciudadCirculacion") String ciudadCirculacion){
        modificacionVehiculoSteps.registrar_Zona_De_Circulacion(ciudadCirculacion);
    }

    @SuppressWarnings("EmptyMethod")
    @When("se ingrese a modificar la informacion del vehiculo")
    @Manual
    public void modificarInformacionVehiculo(){
        //Se ejecuta manualmente
    }

    @Then("se deben recuperar los datos del vehiculo: clase vehiculo <claseVehiculo>, marca <marca>  y linea <linea>")
    public void recuperarDatosVehiculo(@Named("claseVehiculo") String claseVehiculo,
                                       @Named("marca") String marca,
                                       @Named("linea") String linea){
        modificacionVehiculoSteps.recuperar_Datos_Vehiculo(claseVehiculo, marca, linea);
    }

    @Then("se debe mostrar un mensaje <mensaje> indicando la restriccion")
    public void validarZonaCirculacion(@Named("mensaje") String mensaje){
        modificacionVehiculoSteps.validar_Zona_De_Circulacion(mensaje);
    }

    @SuppressWarnings("EmptyMethod")
    @Then("se debe mostrar en los campos de bonificación tecnica y comercial el porcentaje en cada uno de ellos")
    @Manual
    public void validarBonificacionesVehiculo(){
        //Se ejecuta manualmente
    }

    @Then("se debe mostrar el mensaje como warning <mensaje> que se obtenga de Riesgos PEPS de interes adicional")
    public void validarMensajeWarningInteresAdicional(@Named("mensaje") String mensaje){
        // Se realiza manualmente.
    }

    @Then("se debe permitir continuar a coberturas de auto personal")
    public void validarContinuacionDeCotizacionInteresAdicional(){
        // Se realiza manualmente
    }
}