package com.sura.guidewire.policycenter.definitions.tarifacion;

import com.sura.guidewire.policycenter.steps.CotizacionPADetalleSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import com.sura.guidewire.policycenter.steps.ValidacionesInformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class TarifaTasaUnicaDefinitions {
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;

    @Steps
    CotizacionPADetalleSteps cotizacionPADetalleSteps;

    @Steps
    ValidacionesInformacionDeVehiculoSteps vehiculoSteps;

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    @When("vaya a cargar el archivo con las tasas")
    public void irAInformacionDePoliza() {
        //Empty Method
    }

    @When("realize una modificacion en el valor asegurado <valor_asegurado>")
    public void cambiarInformacionDePolizaValorAsegurado(@Named("valor_asegurado") String valorAsegurado) {
        tasaUnicaSteps.cambiarInfromacionDePoliza(valorAsegurado);
    }

    @When("realize una modificacion en los de datos del aseguradocon los datos nombre <primer_nombre> <segundo_nombre>, estado civil <estado_civil>")
    public void cambiarInformacionDePolizaBeneficiario(@Named("primer_nombre") String primerNombre,
                                                       @Named("segundo_nombre") String segundoNombre, @Named("estado_civil") String estadoCivil) {
        tasaUnicaSteps.cambiarInfromacionDelAsegurado(primerNombre, segundoNombre, estadoCivil);
    }

    @Then("se debe tarifar con el esquema de tasa unica, generando cobro o devolucion de prima")
    public void verificarTarifacion() {
        tasaUnicaSteps.verificarCambioDeTarifa();
    }

    @Then("se debe tarifar con el esquema de tasa unica, sin generar cobro o devolucion de prima")
    public void verificarTarifacionSinCambioEnCobro() {
        tasaUnicaSteps.verificarNoCambioDeTarifa();
    }

    @Then("me deben aparecer las opciones de exportar el archivo")
    public void verificarelementosExportacion() {
        tasaUnicaSteps.verificarElementosExportacion();
    }

    @Then("debo poder verificar los datos de la poliza")
    public void verificarDatosDePoliza() {
        tasaUnicaSteps.irAInformacionDePolizaExpedida();
    }

    @Then("las de importar el archivo")
    public void verificarelementosImportacion() {
        tasaUnicaSteps.verificarElementosImportacion();
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
        nuevaCotizacionSteps.copiarEnvio();
    }

    @Given("vaya a agregar el vehiculo con los datos: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        tasaUnicaSteps.agregarVehiculo(datosVehiculo);
    }

    @Given("expido la poliza")
    public void expedirPoliza() {
        tasaUnicaSteps.expedirPoliza();
        tasaUnicaSteps.irAInformacionDePolizaExpedida();
    }

    @Given("seleccione algunas coberturas: $coberturas")
    public void agregarCoberturas(ExamplesTable coberturas) {
        tasaUnicaSteps.seleciconarCoberturas(coberturas);
    }

    @When("realize la renovacion de una poliza")
    public void renovarPoliza() {
        tasaUnicaSteps.renovarPoliza();
    }

    @Then("se debe tarifar con el esquema de tasa unica, generando el valor de la prima")
    public void verificarTarifaRenovacion() {
        tasaUnicaSteps.verificarRenovacionTarifa();
    }

}
