package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.poliza.MultiplesAsesoresSteps;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        //Se saca el numero de asesor
        Parametros parametros = new Parametros(opciones);
        String[] arrayAgentes= parametros.getCodigoAsesor().split(",");
        List<String> listaAgentes= new ArrayList<>();
        Collections.addAll(listaAgentes, arrayAgentes);
        String[] arrayPorcentaje= parametros.getPorcentaje().split(",");
        List<String> listaPorcentaje= new ArrayList<>();
        Collections.addAll(listaPorcentaje, arrayPorcentaje);

        String[] arrayRol= parametros.getRol().split(",");
        List<String> listaRol= new ArrayList<>();
        Collections.addAll(listaRol, arrayRol);
        multiplesAsesoresSteps.verDetallesMultipleAsesores();
        multiplesAsesoresSteps.ingresarAsesores(listaAgentes,listaPorcentaje,listaRol);
    }
}
