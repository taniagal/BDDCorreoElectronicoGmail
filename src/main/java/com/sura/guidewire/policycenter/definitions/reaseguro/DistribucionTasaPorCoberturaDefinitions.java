package com.sura.guidewire.policycenter.definitions.reaseguro;

import com.sura.guidewire.policycenter.steps.poliza.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.CrearYEditarCumulosSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.DistribucionTasaPorCoberturaSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.SobrescribirTasaSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class DistribucionTasaPorCoberturaDefinitions {

    @Steps
    CrearYEditarCumulosSteps crearYEditarCumulosSteps;

    @Steps
    DistribucionTasaPorCoberturaSteps distribucionTasaPorCoberturaSteps;

    @Steps
    SobrescribirTasaSteps sobrescribirTasaSteps;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;


    @Given("ingrese la informacion de un acuerdo facultativo con tasa comercial deseada <descripcionDeAcuerdo>")
    public void ingreseAcuerdoFacultativo(@Named("descripcionDeAcuerdo") String descripcionDeAcuerdo) {
        crearYEditarCumulosSteps.ingresar_a_opcion_reaseguro();
        crearYEditarCumulosSteps.ingresar_a_opcion_crear_acuerdo_facultativo();
        distribucionTasaPorCoberturaSteps.ingresarTasaComercialDeseada();
        crearYEditarCumulosSteps.ingresarDescripcionDeAcuerdoyDireccion(descripcionDeAcuerdo);
    }

    @Given("seleccione la poliza como reaseguro especial")
    public void whenSeleccioneLaPolizaComoReaseguroAceptado() {
        distribucionTasaPorCoberturaSteps.seleccionarSiEnReaseguro();
    }

    @Given("cotice el articulo")
    public void agregarArticulo() {
        distribucionTasaPorCoberturaSteps.agregarArticulo();
    }

    @When("Ingrese la información de los reaseguradores $infoReasegurador")
    public void whenIngreseLaInformacionDeLosReaseguradores(ExamplesTable infoReasegurador) {
        distribucionTasaPorCoberturaSteps.ingresarReaseguradores(infoReasegurador);
        sobrescribirTasaSteps.crearAcuerdoFacultativo();
        sobrescribirTasaSteps.aceptaAcuerdoFacultativo();
    }

    @Then("deben aparecer los riesgos reasegurables por cada cobertura: $tablaRiesgosReasegurables")
    public void thenRiesgosReasegurables(ExamplesTable tablaRiesgosReasegurables) {
        distribucionTasaPorCoberturaSteps.ingresaARiesgosPorCobertura(tablaRiesgosReasegurables);
    }

}
