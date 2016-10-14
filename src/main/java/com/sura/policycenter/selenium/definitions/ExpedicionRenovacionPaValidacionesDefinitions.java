package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionRenovacionPaValidacionesSteps;
import com.sura.policycenter.selenium.steps.ExpedicionRenovacionPaValidacionesSteps;
import com.sura.policycenter.selenium.steps.ModificacionRenovacionCoberturasPASteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionRenovacionPaValidacionesDefinitions {

    @Steps
    ExpedicionRenovacionPaValidacionesSteps expedicionRenovacionPaValidacionesSteps;

    @Steps
    CotizacionRenovacionPaValidacionesSteps cotizacionRenovacionPaValidacionesSteps;

    @Steps
    ModificacionRenovacionCoberturasPASteps modificacionRenovacionCoberturasPASteps;

    @When("no se tenga motor ingresado")
    public void validarMotor(){
        expedicionRenovacionPaValidacionesSteps.validar_Que_No_Se_Tenga_Motor_Ni_Chasis_Ingresados();
    }

    @When("no se tenga chasis ingresado")
    public void validarChasis(){
        expedicionRenovacionPaValidacionesSteps.validar_Que_No_Se_Tenga_Motor_Ni_Chasis_Ingresados();
    }

    @When("el valor de los accesorios supere el monto permitido")
    public void validarAccesorios(){
        expedicionRenovacionPaValidacionesSteps.validar_Valor_Accesorios_Y_Accesorios_Especiales();
    }

    @When("el valor de los accesorios especiales supere el monto permitido")
    public void validarAccesoriosEspeciales(){
        expedicionRenovacionPaValidacionesSteps.validar_Valor_Accesorios_Y_Accesorios_Especiales();
    }

    @Then("mostrar el siguiente mensaje de bloqueo $mensaje")
    public void validarMensajeMotorYChasis(ExamplesTable mensaje){
        cotizacionRenovacionPaValidacionesSteps.validar_Que_Se_Bloquee_Cotizacion_Y_Muestre_Mensaje(mensaje);
        modificacionRenovacionCoberturasPASteps.borrar_espacio_trabajo();
    }
}
