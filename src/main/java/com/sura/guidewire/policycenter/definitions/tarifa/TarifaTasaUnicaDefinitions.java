package com.sura.guidewire.policycenter.definitions.tarifa;

import com.sura.guidewire.policycenter.steps.CotizacionPADetalleSteps;
import com.sura.guidewire.policycenter.steps.tarifa.TarifaTasaUnicaSteps;
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




    @Given("que tengo una poliza expedida")
    public void estadoDePoliza(){
        //Metodo vacio para efectos del reporte
    }


    @When("vaya a cargar el archivo con las tasas")
    public void irAInformacionDePoliza(){
        tasaUnicaSteps.ir_a_informacion_de_poliza();
    }

    @When("realize una modificacion en el valor asegurado <valor_asegurado>")
    public void cambiarInformacionDePolizaValorAsegurado(@Named("valor_asegurado") String valorAsegurado){
        tasaUnicaSteps.cambiar_infromacion_de_poliza(valorAsegurado);
    }

    @When("realize una modificacion en los de datos del aseguradocon los datos nombre <primer_nombre> <segundo_nombre>, estado civil <estado_civil>")
    public void cambiarInformacionDePolizaBeneficiario(@Named("primer_nombre") String primerNombre,
                                                       @Named("segundo_nombre") String segundoNombre,@Named("estado_civil") String estadoCivil){
        tasaUnicaSteps.cambiar_infromacion_del_asegurado(primerNombre,segundoNombre,estadoCivil);
    }

    @Then("se debe tarifar con el esquema de tasa unica, generando cobro o devolucion de prima")
    public void verificarTarifacion(){
        tasaUnicaSteps.verificar_cambio_de_tarifa();
    }

    @Then("se debe tarifar con el esquema de tasa unica, sin generar cobro o devolucion de prima")
    public void verificarTarifacionSinCambioEnCobro(){
        tasaUnicaSteps.verificar_no_cambio_de_tarifa();
    }

    @Then("me deben aparecer las opciones de exportar el archivo")
    public void verificarelementosExportacion(){
        tasaUnicaSteps.verificar_elementos_exportacion();
    }

    @Then("debo poder verificar los datos de la poliza")
    public void verificarDatosDePoliza(){
        tasaUnicaSteps.ir_a_informacion_de_poliza_expedida();
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
        tasaUnicaSteps.ingreso_a_policyCenter();
        cotizacionPADetalleSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
        tasaUnicaSteps.verificar_estado_del_envio(cotizacion);

    }

    @When("vaya a agregar el vehiculo con los datos: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        tasaUnicaSteps.agregar_vehiculo(datosVehiculo);
    }

    @When("expido la poliza")
    public void expedirPoliza() {
        tasaUnicaSteps.expedir_poliza();
    }

    @When("seleccione algunas coberturas: $coberturas")
    public void agregarCoberturas(ExamplesTable coberturas) {
        tasaUnicaSteps.seleciconar_coberturas(coberturas);
    }

    @When("realize la renovacion de una poliza")
    public void renovarPoliza() {
        tasaUnicaSteps.renovar_poliza();
    }

    @Then("se debe tarifar con el esquema de tasa unica, generando el valor de la prima")
    public void verificarTarifaRenovacion(){
        tasaUnicaSteps.verificar_renovacion_tarifa();
    }

}
