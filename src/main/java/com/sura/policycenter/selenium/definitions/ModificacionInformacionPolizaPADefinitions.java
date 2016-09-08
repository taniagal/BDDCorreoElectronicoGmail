package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.ModificacionInformacionPolizaPASteps;
import java.util.HashMap;
import java.util.Map;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;


public class ModificacionInformacionPolizaPADefinitions {

    private final Map<String, String> labelsInformacionPoliza = new HashMap<>();

    @Steps
    ModificacionInformacionPolizaPASteps modificacionInformacionPolizaPASteps;

    public ModificacionInformacionPolizaPADefinitions(){
        labelsInformacionPoliza.put("tipoDocumento", "Tipo documento");
        labelsInformacionPoliza.put("numeroDocumento", "Número documento");
        labelsInformacionPoliza.put("nombre", "Nombre");
        labelsInformacionPoliza.put("telefono", "Teléfono");
        labelsInformacionPoliza.put("numeroDocumento", "Número documento");
        labelsInformacionPoliza.put("direccion", "Dirección de la póliza");
        labelsInformacionPoliza.put("tipoDireccion", "Tipo de dirección");
        labelsInformacionPoliza.put("descripcionDireccion", "Descripción de la dirección");
        labelsInformacionPoliza.put("organizacion", "Organización");
        labelsInformacionPoliza.put("canal", "Canal");
        labelsInformacionPoliza.put("tipoPoliza", "Tipo de póliza");
        labelsInformacionPoliza.put("tipoPlazo", "Tipo de plazo");
        labelsInformacionPoliza.put("fechaInicioVigencia", "Fecha inicio de vigencia");
        labelsInformacionPoliza.put("fechaFinVigencia", "Fecha fin de vigencia");
        labelsInformacionPoliza.put("fechaExpedicion", "Fecha de expedición");
        labelsInformacionPoliza.put("polizaFinanciada", "Póliza financiada");
        labelsInformacionPoliza.put("oficinaRadicacion", "Oficina de radicación");
        labelsInformacionPoliza.put("codigoAgente", "Código de agente");
        labelsInformacionPoliza.put("descuentoPoliza", "Descuento póliza");
    }

    @Given("ya se tiene una poliza expedida <numeroPoliza>")
    public void ingresarPoliza(@Named("numeroPoliza") String numeroPoliza){
        modificacionInformacionPolizaPASteps.ingresarPoliza(numeroPoliza);
    }

    @When("ingrese a modificar dicha cotizacion")
    public void ingresarAModificarCotizacion(){
        modificacionInformacionPolizaPASteps.irAModificarInformacionPoliza();
    }

    @When("adicione un segundo tomador <tipoDocumento> <numeroDocumento>")
    public void adicionarSegundoTomador(@Named("tipoDocumento") String tipoDocumento,
                                        @Named("numeroDocumento") String numeroDocumento){
        modificacionInformacionPolizaPASteps.irAModificarInformacionPoliza();
        modificacionInformacionPolizaPASteps.adicionarSegundoTomador(tipoDocumento, numeroDocumento);
    }

    @When("el tomador sea riesgo consultable")
    public void validarTomadorRiesgo(){
        modificacionInformacionPolizaPASteps.validarTomadorRiesgo();
    }

    @When("el tomador sea riesgo PEP")
    public void validarRiesgoPEP(){
        modificacionInformacionPolizaPASteps.validarTomadorRiesgo();
    }

    @SuppressWarnings("EmptyMethod")
    @When("el tipo de poliza es PPAutos")
    @Manual
    public void validarTipoPolizaPPAutos(){
        //Se ejecuta manualmente
    }

    @Then("se debe visualizar los datos de la informacion de la poliza $informacionPoliza")
    public void visualizarInformacionPoliza(ExamplesTable informacionPoliza){
        modificacionInformacionPolizaPASteps.validarInformacionPoliza(labelsInformacionPoliza, informacionPoliza);
    }

    @Then("el tomador debe quedar registrado en la informacion de la poliza")
    public void validarRegistroSegundoTomador(){
        Map <String, String> datosSegundoTomador = new HashMap<>();
        datosSegundoTomador.put("tipoDocumento", "Tipo documento");
        datosSegundoTomador.put("numeroDocumento", "Número documento");
        datosSegundoTomador.put("telefono", "Teléfono");
        datosSegundoTomador.put("direccion", "Dirección");
        datosSegundoTomador.put("tipoDireccion", "Tipo de dirección");
        datosSegundoTomador.put("descripcionDireccion", "Descripción de la dirección");
        modificacionInformacionPolizaPASteps.validarRegistroSegundoTomador(datosSegundoTomador);
    }

    @Then("se debe bloquear el registro del tomador y mostrar un mensaje <mensaje>")
    public void validarBloqueoSegundoTomador(@Named("mensaje") String mensaje){
        modificacionInformacionPolizaPASteps.validarBloqueoSegundoTomador(mensaje);
    }

    @Then("no se debe permitir cambiar el tomador primario")
    public void validarRestriccionEdicionTomador(){
        modificacionInformacionPolizaPASteps.validarRestriccionEdicionTomador();
    }

    @SuppressWarnings("EmptyMethod")
    @Then("se debe habilitar el campo poliza financiada")
    @Manual
    public void habilitarPolizaFinanciada(){
        //Se ejecuta manualmente
    }

    @When("se presione el boton siguiente")
    public void presionarBotonSiguiente(){
        modificacionInformacionPolizaPASteps.presionarBotonSiguiente();
    }

    @Then("se debe mostrar el mensaje como warning <mensaje> que se obtenga de Riesgos PEPS de tomador")
    public void validarMensajeWarningTomador(@Named("mensaje") String mensaje){
        modificacionInformacionPolizaPASteps.validarMensajeWarningTomador(mensaje);
    }

    @Then("se debe mostrar el mensaje como warning <mensaje> que se obtenga de Riesgos PEPS de asegurado")
    public void validarMensajeWarningAsegurado(@Named("mensaje") String mensaje){
        modificacionInformacionPolizaPASteps.validarMensajeWarningAsegurado(mensaje);
    }

    @Then("se debe pemitir continuar la cotizacion")
    public void permitirContinuarCotizacion(){
        modificacionInformacionPolizaPASteps.permitirContinuarCotizacion();
    }

    @When("ingrese a la opcion asegurados")
    public void irAOpcionAsegurados(){
        modificacionInformacionPolizaPASteps.irAOpcionAsegurados();
    }

    @When("adicione un asegurado <tipoDocumento> <numeroDocumento>")
    public void adicionarAsegurado(@Named("tipoDocumento") String tipoDocumento,
                                   @Named("numeroDocumento") String numeroDocumento){
        modificacionInformacionPolizaPASteps.adicionarAsegurado(tipoDocumento, numeroDocumento);
    }

    @When("ingrese a la opcion vehiculos")
    public void irAOpcionVehiculos(){
        modificacionInformacionPolizaPASteps.irAOpcionVehiculos();
    }

    @When("adicione un interes adicional <tipoDocumento> <numeroDocumento>")
    @Manual
    public void adicionarInteresAdicional(@Named("tipoDocumento") String tipoDocumento,
                                          @Named("numeroDocumento") String numeroDocumento){
        // Se realiza manualmente
    }

    @Then("se debe permitir continuar a asegurados de la modificacion")
    public void validarContinuacionDeCotizacionInformacion(){
        modificacionInformacionPolizaPASteps.validarContinuacionDeCotizacion("Asegurados",
                ".//span[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']");
    }

    @Then("se debe permitir continuar a vehiculos de la modificacion")
    public void validarContinuacionDeCotizacionAsegurados(){
        modificacionInformacionPolizaPASteps.validarContinuacionDeCotizacion("Vehículos",
                ".//span[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:ttlBar']");
    }

    @Then("se debe permitir continuar a coberturas de la modificacion")
    public void validarContinuacionDeCotizacionVehiculos(){
        modificacionInformacionPolizaPASteps.validarContinuacionDeCotizacion("Coberturas de auto personal",
                ".//span[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:ttlBar']");
    }
}