package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionRenovacionPaValidacionesSteps;
import com.sura.policycenter.selenium.steps.ExpedicionRenovacionPaValidacionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionRenovacionPaValidacionesDefinitions {

    @Steps
    ExpedicionRenovacionPaValidacionesSteps expedicionRenovacionPaValidacionesSteps;

    @Steps
    CotizacionRenovacionPaValidacionesSteps cotizacionRenovacionPaValidacionesSteps;

    @When("no se tenga chasis ni motor ingresados")
    public void validarMotorYChasis(){
        expedicionRenovacionPaValidacionesSteps.validar_Que_No_Se_Tenga_Motor_Ni_Chasis_Ingresados();
    }

    @When("el valor de los accesorios y accesorios especiales superen el monto permitido")
    public void validarAccesorios(){
        expedicionRenovacionPaValidacionesSteps.validar_Valor_Accesorios_Y_Accesorios_Especiales();
    }

    @When("el valor asegurado es superior al 50% del valor de la vigencia anterior")
    public void validarValorAseguradoSuperior(){
        expedicionRenovacionPaValidacionesSteps.validar_Valor_Asegurado_Superior_A_Vigencia_Anterior();
    }

    @When("el valor asegurado es inferior al 20% del valor de la vigencia anterior")
    public void validarValorAseguradoInferior(){
        expedicionRenovacionPaValidacionesSteps.validar_Valor_Asegurado_Inferior_A_Vigencia_Anterior();
    }

    @Then("se debe mostrar el siguiente mensaje $mensaje")
    public void validarMensajeMotorYChasis(ExamplesTable mensaje){
        cotizacionRenovacionPaValidacionesSteps.validar_Que_Se_Bloquee_Cotizacion_Y_Muestre_Mensaje(mensaje);
    }
}
