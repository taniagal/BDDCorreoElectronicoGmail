package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.ExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.InformacionDePagoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class InformacionDePagoDefinitions {

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Steps
    InformacionDePagoSteps informacionDePagoSteps;

    @Given("que estoy en la pantalla de pago con la <cotizacion>")
    public void givenQueEstoyEnLaPantallaDePagoConLacotizacion(@Named("cotizacion") String cotizacion) {
        expedicionDePolizaSteps.navegarBarraSuperior(cotizacion);
    }

    @When("visualice la pantalla de pagos")
    public void whenVisualiceLaPantallaDePagos() {
        informacionDePagoSteps.ingresarAPantallaPagos();
    }

    @Then("se deben mostrar los datos correspondientes a formas de pago")
    public void thenSeDebenMostrarLosDatosCorrespondientesAFormasDePago() {
        informacionDePagoSteps.validaIngresoAPantallaPago();
    }

    @Then("se debe mostrar el <nombreMetodoPago>")
    public void thenSeDebeMostrarElnombreMetodoPago(@Named("nombreMetodoPago") String nombreMetodoPago) {
        informacionDePagoSteps.validaMetodoDePago(nombreMetodoPago);
    }

    @Then("se debe mostrar el plan de pago que retorna billing <programa>")
    public void thenSeDebeMostrarElPlanDePagoQueRetornaBilling(@Named("programa") String programa) {
        informacionDePagoSteps.validaPrograma(programa);
    }

}
