package com.sura.guidewire.policycenter.definitions.commons;


import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.cuenta.CuentaNuevaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class NuevaCotizacionDefinitions {

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    @Steps
    CuentaNuevaSteps cuentaNuevaSteps;

    @Given("estoy cotizando una poliza: $datosCotizacion")
    public void nuevaPoliza(ExamplesTable datosCotizacion) {
        nuevaCotizacionSteps.irANuevaCotizacion();
        nuevaCotizacionSteps.seleccionarProducto(datosCotizacion);
    }

    @Given("estoy cotizando una poliza de mrc: $datosCotizacion")
    public void nuevaPolizaMrcConCuenta(ExamplesTable datosCotizacion) {
        cuentaNuevaSteps.crearCuentaNueva(datosCotizacion);
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
}
