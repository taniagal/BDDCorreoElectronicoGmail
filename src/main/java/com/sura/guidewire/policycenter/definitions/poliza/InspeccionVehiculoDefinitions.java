package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.CotizacionMRCSteps;
import com.sura.guidewire.policycenter.steps.poliza.ExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.InspeccionVehiculoSteps;
import com.sura.guidewire.policycenter.steps.poliza.ValidacionesInformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class InspeccionVehiculoDefinitions {

    @Steps
    ValidacionesInformacionDeVehiculoSteps vehiculoSteps;

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    InspeccionVehiculoSteps inspeccionVehiculoSteps;

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Given("se ha realizado la cotizacion <cotizacion>")
    public void buscarCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.irABuscarCotizacionPoliza(cotizacion);
    }

    @Given("se tiene la informacion de la placa <placa> del vehiculo ingresada")
    public void validarInformacionPlaca(@Named("placa") String placa){
        inspeccionVehiculoSteps.validarInformacionDeLaPlaca(placa);
    }

    @When("el vehiculo tenga inspeccion no valida")
    public void validarInspeccionVehiculo() {
        inspeccionVehiculoSteps.crearVehiculo();
    }

    @When("el vehiculo tenga inspeccion")
    public void validarInspeccion() {
        inspeccionVehiculoSteps.crearVehiculo();
    }

    @When("la placa <placa> estuvo vigente en la compañia")
    public void validarVigenciaPlaca(@Named("placa") String placa){
        inspeccionVehiculoSteps.validarVigenciaDeLaPlaca(placa);
    }

    @When("la placa <placa> estuvo vigente pero ahora esta cancelada")
    public void validarPlacaCancelada(@Named("placa") String placa){
        inspeccionVehiculoSteps.validarVigenciaDeLaPlaca(placa);
    }

    @When("la inspeccion es valida en SIA")
    public void validarInspeccionSIA(){
        inspeccionVehiculoSteps.permitirExpedirPoliza();
    }

    @When("se identifique que el vehiculo <placa> no cumple con el requisito de inspeccion")
    public void validarVehiculoSinInspeccion(@Named("placa") String placa){
        inspeccionVehiculoSteps.validarInformacionDeLaPlaca(placa);
    }

    @When("llegue a la expedicion de la poliza")
    public void expedirPoliza(){
        inspeccionVehiculoSteps.permitirExpedirPoliza();
    }

    @Then("se debe recuperar los siguientes datos: $datosVehiculo")
    public void validarDatosVehiculo(ExamplesTable datosVehiculo){
        inspeccionVehiculoSteps.validarInformacionDelVehiculo(datosVehiculo);
    }

    @Then("el valor asegurado <valorAsegurado> se debe consultar y traer de la tabla fasecolda")
    public void validarValorAsegurado(@Named("valorAsegurado") String valorAsegurado){
        inspeccionVehiculoSteps.validarValorAseguradoDelVehiculo(valorAsegurado);
    }

    @Then("se debe permitir expedir la poliza")
    public void permitirExpedirPoliza(){
        inspeccionVehiculoSteps.validarCotizacionExpedida();
    }

    @Then("validar la solicitud de requisitos <requisitos>")
    public void validarSolicitudRequisitos(@Named("requisitos") String requisitos){
        expedicionDePolizaSteps.validarMensajeRequisitos(requisitos);
        }

    @SuppressWarnings("EmptyMethod")
    @Then("la fecha de inspeccion debe ser la fecha de inicio de vigencia de la poliza")
    @Manual
    public void validarFechaInspeccion(){
        //Se ejecuta manualmente este paso
    }

    @Then("se debe mostrar en la pantalla un mensaje <mensaje> indicando que el vehiculo no tiene inspeccion")
    public void validarMensajeBloqueo(@Named("mensaje") String mensaje){
        inspeccionVehiculoSteps.mostrarMensajeDeBloqueoDeExpedicion(mensaje);
    }

    @Then("generar el UW Issue <mensaje> y no permitir expedir")
    public void generarUW(@Named("mensaje") String mensaje){
        inspeccionVehiculoSteps.generarUW(mensaje);
    }
}
