package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.MultiplesAsesoresSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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
    public void ingresoDeAsesores(ExamplesTable asesores){
        //Se saca el numero de asesor
        String numeroAgente = "";
        String porcentaje ="";
        for (Map<String, String> asesor : asesores.getRows()) {
            numeroAgente = asesor.get("codigoAsesor");
            porcentaje = asesor.get("porcentaje");
        }
        String[] arrayAgentes= numeroAgente.split(",");
        List<String> listaAgentes= new ArrayList<>();
        Collections.addAll(listaAgentes, arrayAgentes);
        String[] arrayPorcentaje= porcentaje.split(",");
        List<String> listaPorcentaje= new ArrayList<>();
        Collections.addAll(listaPorcentaje, arrayPorcentaje);

        multiplesAsesoresSteps.verDetallesMultipleAsesores();
        multiplesAsesoresSteps.ingresarAsesores(listaAgentes,listaPorcentaje);
    }
}
