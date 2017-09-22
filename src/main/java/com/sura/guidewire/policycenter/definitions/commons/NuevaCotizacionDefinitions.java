package com.sura.guidewire.policycenter.definitions.commons;


import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.cuenta.CuentaNuevaSteps;
import com.sura.guidewire.policycenter.steps.poliza.CotizacionPADetalleSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class NuevaCotizacionDefinitions {

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    @Steps
    CuentaNuevaSteps cuentaNuevaSteps;

    @Steps
    CotizacionPADetalleSteps cotizacionPADetalleSteps;

    @Given("estoy cotizando una poliza: $datosCotizacion")
    public void nuevaPoliza(ExamplesTable datosCotizacion) {
        nuevaCotizacionSteps.irANuevaCotizacion();
        nuevaCotizacionSteps.seleccionarProducto(datosCotizacion);
    }
    @Given("tengo los siguientes parametros para poliza individual de autos: $datosParametros")
    public void parametros(ExamplesTable datosParametros){
        nuevaCotizacionSteps.capturarParametros(datosParametros);
    }

    @Given("estoy cotizando una poliza de mrc: $datosCotizacion")
    @Alias("estoy cotizando una poliza de autos: $datosCotizacion")
    public void nuevaPolizaMrcConCuenta(ExamplesTable datosCotizacion) {
        cuentaNuevaSteps.crearCuentaNueva(datosCotizacion);
        nuevaCotizacionSteps.nuevaCotizacionenCuenta();
        nuevaCotizacionSteps.seleccionarProductoDesdeCuenta(datosCotizacion);
    }

    @Given("estoy cotizando una poliza de mrc con documento: $datosCotizacion")
    public void nuevaPolizaMrcConCuentaYDocumento(ExamplesTable datosCotizacion) {
        cuentaNuevaSteps.crearCuentaNuevaConDocumento(datosCotizacion);
        nuevaCotizacionSteps.nuevaCotizacionenCuenta();
        nuevaCotizacionSteps.seleccionarProductoDesdeCuenta(datosCotizacion);
    }

    @Given("estoy cotizando una poliza basado en otro envio <envio>")
    public void copiarEnvio(@Named("envio") String envio) {
        nuevaCotizacionSteps.irABuscarCotizacion(envio);
        nuevaCotizacionSteps.copiarEnvio();
    }

    @Given("ingrese los datos de la cotizacion PA $datosCtotizacion")
    public void copiarEnvio(ExamplesTable datosCtotizacion) {
        nuevaCotizacionSteps.cotizarEnvioCopiadoPa(datosCtotizacion);
    }

    @When("ingrese los datos de la cotizacion PA $datosCtotizacion")
    public void cotizarEnviocopiado(ExamplesTable datosCtotizacion) {
        nuevaCotizacionSteps.cotizarEnvioCopiadoPa(datosCtotizacion);
    }

    @Given("seleccione reaseguro especial No")
    public void seleccionarReaseguroEspecialNo() {
        nuevaCotizacionSteps.seleccionarReaseguroEspecialNo();
    }

    @Then("vaya a la poliza riesgo <riesgo>")
    public void irAConsultarLaCotizacionRiesgo(@Named("riesgo") String riesgo) {
        cotizacionPADetalleSteps.ir_A_Buscar_Cotizacion_Poliza(riesgo);
    }

    @Then("cotice la poliza riesgo con el asegurado, el auto y las coberturas necesarias $datos")
    public void cotizarLaPolizaRiesgoConTasaUnica(ExamplesTable datos) {
        nuevaCotizacionSteps.cotizarLaPolizaRiesgoConTasaUnica(datos);
    }
}
