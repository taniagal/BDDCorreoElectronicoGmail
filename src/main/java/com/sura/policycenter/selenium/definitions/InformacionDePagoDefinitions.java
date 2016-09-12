package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ExpedicionDePolizaSteps;
import com.sura.policycenter.selenium.steps.InformacionDePagoSteps;
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
        expedicionDePolizaSteps.navegar_barra_superior(cotizacion);
    }

    @When("visualice la pantalla de pagos")
    public void whenVisualiceLaPantallaDePagos() {
        informacionDePagoSteps.ingresar_a_pantalla_pagos();
    }

    @Then("se deben mostrar los datos correspondientes a formas de pago")
    public void thenSeDebenMostrarLosDatosCorrespondientesAFormasDePago() {
        informacionDePagoSteps.valida_ingreso_a_pantalla_pago();
    }

    @Then("se debe mostrar el <nombreMetodoPago>")
    public void thenSeDebeMostrarElnombreMetodoPago(@Named("nombreMetodoPago") String nombreMetodoPago) {
        informacionDePagoSteps.valida_metodo_de_pago(nombreMetodoPago);
    }

    @Then("se debe mostrar el plan de pago que retorna billing <programa>")
    public void thenSeDebeMostrarElPlanDePagoQueRetornaBilling(@Named("programa") String programa) {
        informacionDePagoSteps.valida_programa(programa);
    }

}
