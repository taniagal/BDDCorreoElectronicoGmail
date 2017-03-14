package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.definitions.modificaciones.ModificacionInformacionPolizaPADefinitions;
import com.sura.guidewire.policycenter.steps.poliza.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.poliza.TipoDeOnerosoPaSteps;
import com.sura.guidewire.policycenter.steps.poliza.ValidacionesInformacionDeVehiculoSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
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

    @Steps
    TarifaAutosSteps tarifaAutosSteps;



    @When("vaya agregar el interes adicional" )
    public void agregarInteresAdicional() {
        vehiculoSteps.irAVehiculos();
        onerosoPaSteps.agregarInteresAdicional();
    }

    @When("ingrese un interes adicional con tipo de beneficiario <tipoBeneficiario>" )
    public void agregarInteresAdicionalYTipoDeBeneficiario(@Named("tipoBeneficiario") String tipoBeneficiario) {
        vehiculoSteps.irAVehiculos();
        onerosoPaSteps.agregarInteresAdicional();
        edificiosUbicacionesSteps.ingresarTipoBeneficiario(tipoBeneficiario);
    }

    @When("ingrese beneficiario oneroso en los intereses <tipoBeneficiarioOneroso>")
    public void agregarInteresAdicionalConOneroso(String tipoBeneficiarioOneroso){
        onerosoPaSteps.agregarInteresAdicionalOneroso();
        edificiosUbicacionesSteps.ingresarTipoBeneficiario(tipoBeneficiarioOneroso);
        tarifaAutosSteps.agregarCoberturasOneroso();
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
        vehiculoSteps.irAVehiculos();
        vehiculoSteps.agregarVehiculo(datosVehiculo);
    }
}