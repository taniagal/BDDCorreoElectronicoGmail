package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.InspeccionVehiculoSteps;
import com.sura.policycenter.selenium.steps.ValidacionesInformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;

public class InspeccionVehiculoDefinitions {

    @Steps
    ValidacionesInformacionDeVehiculoSteps vehiculoSteps;

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    InspeccionVehiculoSteps inspeccionVehiculoSteps;

    @Given("se ha realizado la cotizacion <cotizacion>")
    public void buscarCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @Given("se tiene la informacion de la placa <placa> del vehiculo ingresada")
    public void validarInformacionPlaca(@Named("placa") String placa){
        inspeccionVehiculoSteps.validar_Informacion_De_La_Placa(placa);
    }

    @When("el vehiculo tenga inspeccion no valida")
    public void validarInspeccionVehiculo() {
        vehiculoSteps.ir_a_vehiculos();
        inspeccionVehiculoSteps.crear_vehiculo();
    }

    @When("el vehiculo tenga inspeccion")
    public void validarInspeccion() {
        vehiculoSteps.ir_a_vehiculos();
        inspeccionVehiculoSteps.crear_vehiculo();
    }

    @When("la placa <placa> estuvo vigente en la compañia")
    public void validarVigenciaPlaca(@Named("placa") String placa){
        inspeccionVehiculoSteps.validar_Vigencia_De_La_Placa(placa);
    }

    @When("la placa <placa> estuvo vigente pero ahora esta cancelada")
    public void validarPlacaCancelada(@Named("placa") String placa){
        inspeccionVehiculoSteps.validar_Vigencia_De_La_Placa(placa);
    }

    @When("la inspeccion es valida en SIA")
    public void validarInspeccionSIA(){
        inspeccionVehiculoSteps.permitir_Expedir_Poliza();
    }

    @When("se identifique que el vehiculo <placa> no cumple con el requisito de inspeccion")
    public void validarVehiculoSinInspeccion(@Named("placa") String placa){
        inspeccionVehiculoSteps.validar_Informacion_De_La_Placa(placa);
    }

    @When("llegue a la expedicion de la poliza")
    public void expedirPoliza(){
        inspeccionVehiculoSteps.permitir_Expedir_Poliza();
    }

    @Then("se debe recuperar los siguientes datos: $datosVehiculo")
    public void validarDatosVehiculo(ExamplesTable datosVehiculo){
        inspeccionVehiculoSteps.validar_Informacion_Del_Vehiculo(datosVehiculo);
    }

    @Then("el valor asegurado <valorAsegurado> se debe consultar y traer de la tabla fasecolda")
    public void validarValorAsegurado(@Named("valorAsegurado") String valorAsegurado){
        inspeccionVehiculoSteps.validar_Valor_Asegurado_Del_Vehiculo(valorAsegurado);
    }

    @Then("se debe permitir expedir la poliza")
    public void permitirExpedirPoliza(){
        inspeccionVehiculoSteps.validar_Cotizacion_Expedida();
    }

    @SuppressWarnings("EmptyMethod")
    @Then("la fecha de inspeccion debe ser la fecha de inicio de vigencia de la poliza")
    @Manual
    public void validarFechaInspeccion(){
        //Se ejecuta manualmente este paso
    }

    @Then("se debe mostrar en la pantalla un mensaje <mensaje> indicando que el vehiculo no tiene inspeccion")
    public void validarMensajeBloqueo(@Named("mensaje") String mensaje){
        inspeccionVehiculoSteps.mostrar_Mensaje_De_Bloqueo_De_Expedicion(mensaje);
    }

    @Then("generar el UW Issue <mensaje> y no permitir expedir")
    public void generarUW(@Named("mensaje") String mensaje){
        inspeccionVehiculoSteps.generarUW(mensaje);
    }
}
