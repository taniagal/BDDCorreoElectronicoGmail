package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.poliza.MultiplesAsesoresSteps;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
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
            " del 100% de los asesores que intervienen en la poliza:$opciones")
    @Aliases(values = {"se ingresa mas de 8 asesores:$opciones", "no debe permitir ingresar codigo asesor repetidos:$opciones",
            "se ingresa mas del 100% a los asesores:$opciones"})
    public void ingresoDeAsesores(ExamplesTable opciones) {

        multiplesAsesoresSteps.adicionarAsesoresDeComision();
        multiplesAsesoresSteps.ingresarInformacionDelAsesor(new Parametros(opciones));
    }

    @Then("Debe quedar un asesor con rol:$opciones")
    public void validarAsesorlider(ExamplesTable opciones) {

        multiplesAsesoresSteps.adicionarAsesoresDeComision();
        multiplesAsesoresSteps.validarDatosDelAsesor(new Parametros(opciones));
    }

    @Then("Debe quedar un codigo de asesor:$opciones")
    public void validarCodigoAsesor(ExamplesTable opciones) {

        multiplesAsesoresSteps.validarDatosDelAsesor( new Parametros(opciones));
    }

    @Then("validar el mensajes:$opciones")
    public void validarMensajes(ExamplesTable opciones) {

        multiplesAsesoresSteps.validarMensajes(new Parametros(opciones));
    }
}
