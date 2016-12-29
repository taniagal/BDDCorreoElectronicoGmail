package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.TipoDeOnerosoPaSteps;
import com.sura.guidewire.policycenter.steps.ValidacionesInformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class TipoDeOnerosoPaDefinitions {
    @Steps
    ValidacionesInformacionDeVehiculoSteps vehiculoSteps;

    @Steps
    TipoDeOnerosoPaSteps onerosoPaSteps;

    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;

    @Steps
    ModificacionInformacionPolizaPADefinitions informacionPolizaPADefinitions;


    @When("vaya agregar el interes adicional" )
    public void agregarInteresAdicional() {
        vehiculoSteps.ir_a_vehiculos();
        onerosoPaSteps.agregarInteresAdicional();
    }

    @Then("debo poder ver y seleccionar los tipos de beneficiarios $TipoBeneficiario")
    public void verificarTipoDeBeneficiarios(String TipoBeneficiario){
        edificiosUbicacionesSteps.ingresar_tipo_beneficiario(TipoBeneficiario);
    }

    @Then("se debe marcar el campo Requiere certificado por defecto en SI")
    public void verificarMarca(){
        onerosoPaSteps.verificarMarca();
    }

    @When("Se haya creado un vehículo: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        vehiculoSteps.ir_a_vehiculos();
        vehiculoSteps.agregarVehiculo(datosVehiculo);
    }

    @Then("Se debe marcar la opcion ¿Es una sustitucion? por defecto en NO")
    public void verificarMarcaSustitucion(){
        onerosoPaSteps.verificarMarcaSustitucion();
    }

    @Then("se debe seleccionar la opcion sustitucion")
    public void verificarSeleccionSustitucion(){
        onerosoPaSteps.verificarSeleccionSustitucion();
    }

}