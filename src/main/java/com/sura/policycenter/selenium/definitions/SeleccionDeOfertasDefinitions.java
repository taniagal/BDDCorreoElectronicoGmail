package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.SeleccionDeOfertasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SeleccionDeOfertasDefinitions {

    @Steps
    SeleccionDeOfertasSteps seleccionDeOfertasSteps;

    @Given("inicio una nueva cotizacion")
    public void iniciarCotizacion() {
        seleccionDeOfertasSteps.iniciarCotizacion();
    }

    @When("ingrese la cuenta <cuenta>, organizacion <organizacion> y agente <agente>")
    public void ingresarDatosInicialesCotizacion(@Named("cuenta") String cuenta,
                                                 @Named("organizacion") String organizacion,
                                                 @Named("agente") String agente) {
        seleccionDeOfertasSteps.ingresarDatosInicialesCotizacion(cuenta, organizacion, agente);
    }

    @When("seleccione la linea de negocio de autos")
    public void seleccionarLineaPA() {
        seleccionDeOfertasSteps.seleccionarLineaPA();
    }

    @Then("no debe mostrar el menu vertical <menu>")
    public void validarVisibilidadMenu(@Named("menu") String menu) {
        seleccionDeOfertasSteps.validarVisibilidadMenu(menu);
    }
}
