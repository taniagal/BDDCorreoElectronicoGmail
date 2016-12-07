package com.sura.guidewire.policycenter.definitions.commons;


import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.model.ExamplesTable;

public class NuevaCotizacionDefinitions {

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    @Given("estoy cotizando una poliza: $datosCotizacion")
    public void nuevaPoliza(ExamplesTable datosCotizacion) {
        nuevaCotizacionSteps.irANuevaCotizacion();
        nuevaCotizacionSteps.seleccionarProducto(datosCotizacion);
    }

    @Given("estoy cotizando una poliza basado en otro envio <envio>")
    public void copiarEnvio(@Named("envio") String envio) {
        nuevaCotizacionSteps.irABuscarCotizacion(envio);
        nuevaCotizacionSteps.copiarEnvio();
    }
}
