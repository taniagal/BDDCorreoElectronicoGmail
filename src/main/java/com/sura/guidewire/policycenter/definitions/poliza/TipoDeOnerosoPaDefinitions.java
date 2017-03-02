package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.definitions.modificaciones.ModificacionInformacionPolizaPADefinitions;
import com.sura.guidewire.policycenter.steps.poliza.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.poliza.TipoDeOnerosoPaSteps;
import com.sura.guidewire.policycenter.steps.poliza.ValidacionesInformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
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

    @When("ingrese un interes adicional con tipo de beneficiario <tipoBeneficiario>" )
    public void agregarInteresAdicionalYTipoDeBeneficiario(@Named("tipoBeneficiario") String tipoBeneficiario) {
        vehiculoSteps.ir_a_vehiculos();
        onerosoPaSteps.agregarInteresAdicional();
        edificiosUbicacionesSteps.ingresarTipoBeneficiario(tipoBeneficiario);

    }

    @When("edite los datos del interes adicional <nombre>" )
    public void editarInteresAdicional(@Named("nombre") String nombre) {
        onerosoPaSteps.editarInteresAdicional(nombre);
    }

    @Then("debo poder ver y seleccionar los tipos de beneficiarios <tipoBeneficiario>")
    public void verificarTipoDeBeneficiarios(@Named("tipoBeneficiario") String tipoBeneficiario){
        edificiosUbicacionesSteps.ingresarTipoBeneficiario(tipoBeneficiario);
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
}