package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.PagoPolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.AjustePantallaPagosYValidacionesSteps;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class AjustePantallaPagosYValidacionesDefinitions {

    @Steps
    AjustePantallaPagosYValidacionesSteps ajustePantallaPagosYValidacionesSteps;
    @Steps
    PagoPolizaSteps pagoPolizaSteps;

    @When("en la pantalla \"Edificios y ubicaciones\" debe permitir seleccionar el tipo de flotante:$opciones")
    public void seleccionarArticuloFlotante(ExamplesTable opciones){

        ajustePantallaPagosYValidacionesSteps.seleccionarArticuloFlotante(new Parametros(opciones));
        pagoPolizaSteps.ingresar_a_la_opcion_de_pago();
    }
    @Then("en la pantalla de payment en el item schedule debe asignar por default plan type \"Installment plan\" no editable.\n" +
            "El item \"audits\" debe aparecer por default \"SI\" y tampoco es editable:$opciones")
    @Aliases(values ={"en la pantalla de payment en el item schedule debe asignar por default plan type \"Reporting Plan\" no editable.\n" +
            " El item \"audits\" debe aparecer por default \"No\"  editable:$opciones"})
    public void validarDatosDePantallaPagoPoliza(ExamplesTable opciones) {
        ajustePantallaPagosYValidacionesSteps.validacionDatosDePantallaPago(new Parametros(opciones));
    }
}
