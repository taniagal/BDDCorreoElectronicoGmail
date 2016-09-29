package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.TarifaTasaUnicaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TarifaTasaUnicaPADefinitions {
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;

    @When("vaya a cargar el archivo con las tasas")
    public void irAInformacionDePoliza(){
        tasaUnicaSteps.ir_a_informacion_de_poliza();
    }

    @Then("me deben aparecer las opciones de exportar el archivo")
    public void verificarelementosExportacion(){
        tasaUnicaSteps.verificar_elementos_exportacion();

    }

    @Then("las de importar el archivo")
    public void verificarelementosImportacion(){
        tasaUnicaSteps.verificar_elementos_importacion();
    }


    @Given("estoy realizando una cotizacion")
    public void givenEstoyRealizandoUnaCotizacion() {
        // Manual
    }

    @When("Cuando se vaya a realizar la carga del archivo")
    public void whenCuandoSeVayaARealizarLaCargaDelArchivo() {
        // Manual
    }

    @Then("se debe poder exportar la estructura del archivo para luego ser cargada")
    public void thenSeDebePoderExportarLaEstructuraDelArchivoParaLuegoSerCargada() {
        // Manual
    }

    @Then("se debe poder cargar el archivo donde se tienen definidas las tasas para la poliza")
    public void thenSeDebePoderCargarElArchivoDondeSeTienenDefinidasLasTasasParaLaPoliza() {
        // Manual
    }
}
