package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.ModificacionInformacionPolizaPASteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.HashMap;
import java.util.Map;

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
        labelsInformacionPoliza.put("tipoPoliza", "Tipo de Póliza");
        labelsInformacionPoliza.put("tipoPlazo", "Tipo de Plazo");
        labelsInformacionPoliza.put("fechaInicioVigencia", "Fecha inicio de vigencia");
        labelsInformacionPoliza.put("fechaFinVigencia", "Fecha fin de vigencia");
        labelsInformacionPoliza.put("fechaExpedicion", "Fecha de expedición");
        labelsInformacionPoliza.put("polizaFinanciada", "¿Póliza financiada?");
        labelsInformacionPoliza.put("oficinaRadicacion", "Oficina de radicación");
        labelsInformacionPoliza.put("codigoAgente", "Código de agente");
        labelsInformacionPoliza.put("descuentoPoliza", "Descuento Póliza");
    }

    @Given("ya se tiene una poliza expedida <numeroPoliza>")
    public void ingresarPoliza(@Named("numeroPoliza") String numeroPoliza){
        modificacionInformacionPolizaPASteps.ingresarPoliza(numeroPoliza);
    }

    @When("ingrese a modificar dicha cotizacion")
    public void ingresarAModificarCotizacion(){
        modificacionInformacionPolizaPASteps.irAModificarInformacionPoliza();
    }

    @Then("se debe visualizar los datos de la informacion de la poliza $informacionPoliza")
    public void visualizarInformacionPoliza(ExamplesTable informacionPoliza){
        modificacionInformacionPolizaPASteps.validarInformacionPoliza(labelsInformacionPoliza, informacionPoliza);
    }
}