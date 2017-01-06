package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.poliza.MultiplesAsesoresSteps;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class MultiplesAsesoresDefinitions {
    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;
    @Steps
    MultiplesAsesoresSteps multiplesAsesoresSteps;

    @Given("que existe una cuenta activa donde estoy cotizando una poliza: $datosCotizacion")
    public void cuentaActivaCotizandoNuevaPoliza(ExamplesTable datosCotizacion) {
        nuevaCotizacionSteps.irANuevaCotizacion();
        nuevaCotizacionSteps.seleccionarProducto(datosCotizacion);
    }
    @When("Debe permitir el ingreso de máximo 8 asesores en la poliza, validando la participacion\n" +
            " del 100% de los asesores que intervienen en la póliza:$asesores")
    public void ingresoDeAsesores(ExamplesTable opciones){
       Parametros parametros = new Parametros(opciones);
        multiplesAsesoresSteps.verDetallesMultipleAsesores();
        multiplesAsesoresSteps.ingresarAsesores(parametros);
    }
}
