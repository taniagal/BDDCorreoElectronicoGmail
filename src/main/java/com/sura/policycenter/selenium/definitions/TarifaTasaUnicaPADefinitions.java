package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.pages.ValidacionesInformacionDeVehiculoPage;
import com.sura.policycenter.selenium.steps.CotizacionPADetalleSteps;
import com.sura.policycenter.selenium.steps.TarifaTasaUnicaSteps;
import com.sura.policycenter.selenium.steps.ValidacionesInformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class TarifaTasaUnicaPADefinitions {
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;

    @Steps
    CotizacionPADetalleSteps cotizacionPADetalleSteps;

    @Steps
    ValidacionesInformacionDeVehiculoSteps vehiculoSteps;

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


    @Given("que tengo una cotizacion <cotizacion>")
    public void givenIrALaCotizacion(@Named("cotizacion") String cotizacion) {
        cotizacionPADetalleSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @When("vaya a agregar el vehiculo con los datos: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        vehiculoSteps.ir_a_vehiculos();
        tasaUnicaSteps.agregar_vehiculo(datosVehiculo);
    }
}
