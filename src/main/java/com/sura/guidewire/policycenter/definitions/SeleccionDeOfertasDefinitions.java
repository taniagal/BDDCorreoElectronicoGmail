package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.SeleccionDeOfertasSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class SeleccionDeOfertasDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    SeleccionDeOfertasSteps seleccionDeOfertasSteps;

    @Given("inicio una nueva cotizacion")
    public void iniciarCotizacion() {
        seleccionDeOfertasSteps.iniciarCotizacion();
    }

    @When("ingrese la cuenta <cuenta>")
    public void ingresarDatosInicialesCotizacion(@Named("cuenta") String cuenta) {
        seleccionDeOfertasSteps.ingresarDatosInicialesCotizacion(cuenta);
    }

    @When("seleccione la linea de negocio de autos")
    public void seleccionarLineaPA() {
        seleccionDeOfertasSteps.seleccionarLineaPA();
    }

    @Then("no debe mostrar el menu vertical")
    public void validarVisibilidadMenu() {
        seleccionDeOfertasSteps.validarVisibilidadMenu();
    }
}
