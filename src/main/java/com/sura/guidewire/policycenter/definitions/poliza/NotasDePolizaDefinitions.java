package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.NotasDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class NotasDePolizaDefinitions {

    @Steps
    NotasDePolizaSteps notasDePolizaSteps;

    @When("vaya a la opcion de Notas de la transaccion")
    public void irANotasDePoliza() {
        notasDePolizaSteps.irANotasDePoliza();
    }

    @When("seleccione la opcion de fecha $rangoFechas")
    public void seleccionarFechas(ExamplesTable rangoFechas) {
        notasDePolizaSteps.seleccionarRangoDeFechas(rangoFechas);
    }

    @Then("debo poder visualizar las notas asociadas a la cuenta que se encuentran en este rango de fechas")
    public void validarNotasPorFecha() {
        notasDePolizaSteps.validarNotasPorRangoDeFecha();
    }
}
