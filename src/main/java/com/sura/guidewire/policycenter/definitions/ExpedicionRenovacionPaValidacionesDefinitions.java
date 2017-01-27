package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CotizacionRenovacionPaValidacionesSteps;
import com.sura.guidewire.policycenter.steps.ExpedicionRenovacionPASteps;
import com.sura.guidewire.policycenter.steps.ExpedicionRenovacionPaValidacionesSteps;
import com.sura.guidewire.policycenter.steps.ModificacionRenovacionCoberturasPASteps;
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

    @Steps
    ExpedicionRenovacionPASteps expedicionRenovacionPASteps;

    @When("no se tenga motor ingresado")
    public void validarMotor(){
        expedicionRenovacionPaValidacionesSteps.validar_Que_No_Se_Tenga_Motor_Ni_Chasis_Ingresados();
    }

    @When("no se tenga chasis ingresado")
    public void validarChasis(){
        expedicionRenovacionPaValidacionesSteps.validar_Que_No_Se_Tenga_Motor_Ni_Chasis_Ingresados();
    }

    @When("no se tenga motor ni chasis ingresados")
    public void validarMotorYChasis(){
        expedicionRenovacionPaValidacionesSteps.validar_Que_No_Se_Tenga_Motor_Ni_Chasis_Ingresados();
    }

    @When("el valor de los accesorios y accesorios especiales supere el monto permitido")
    public void validarAccesorios(){
        expedicionRenovacionPaValidacionesSteps.validar_Valor_Accesorios_Y_Accesorios_Especiales();
    }

    @When("el valor de los accesorios especiales supere el monto permitido")
    public void validarAccesoriosEspeciales(){
        expedicionRenovacionPaValidacionesSteps.validar_Valor_Accesorios_Y_Accesorios_Especiales();
    }

    @When("edite la informacion del vehiculo en la renovacion $infoVehiculo")
    public void editarInformacionVehiculoRenovacion(ExamplesTable infoVehiculo){
        expedicionRenovacionPaValidacionesSteps.editarInformacionVehiculoRenovacion(infoVehiculo);
    }

    @Then("mostrar el siguiente mensaje de bloqueo $mensaje")
    public void validarMensajeMotorYChasis(ExamplesTable mensaje){
        cotizacionRenovacionPaValidacionesSteps.validarQueSeBloqueeCotizacionYMuestreMensaje(mensaje);
        modificacionRenovacionCoberturasPASteps.borrar_espacio_trabajo();
    }

    @Then("mostrar mensaje en los asuntos que bloquean la expedicion $mensaje")
    public void validarAsuntosQueBloqueanExpedicion(ExamplesTable mensaje){
        expedicionRenovacionPaValidacionesSteps.validarAsuntosQueBloqueanExpedicion(mensaje);
    }
}
