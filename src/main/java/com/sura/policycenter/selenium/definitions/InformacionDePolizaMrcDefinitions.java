package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.InformacionDePolizaMrcSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class InformacionDePolizaMrcDefinitions {

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @Given("se inicio una nueva suscripcion <numeroCuenta>")
    public void iniciaNuevaSuscripcionCuenta(@Named("numeroCuenta")String numeroCuenta) {
        informacionDePolizaMrcSteps.navegar_barra_superior(numeroCuenta);
        
    }

    @When("este expidiendo una poliza de propiedad comercial")
    public void expidePolizaPropiedadComercial() {
        // PENDING
    }

    @Then("se debe visualizar los datos del tomador y tomador adicional completos")
    public void datosDelTomadorYAdicional() {
        // PENDING
    }

    /*
    * 2 Historia
    */

    @When("modifique la fecha de inicio de vigencia de la poliza <fechaInicioVigencia>")
    public void modificaFechaInicioFechaFin(@Named("fechaInicioVigencia")String fechaInicioVigencia) {
        // PENDING
    }

    @Then("se debe mostrar un mensaje <mensaje> de error")
    public void mostarMensaError(@Named("mensaje")String mensaje) {
        // PENDING
    }

    @Then("bloquear la operacion")
    public void bloqueoDeAplicacion() {
        // PENDING
    }

    /*
    * 3 Historia
    */

    @When("quiera agregar un tomador adicional que es riesgo consultable <cedula>")
    public void tomadorAdicionalRiesgoConsultabale(@Named("cedula")String cedula) {

    }

    @Then("se debe mostrar un mensaje de error <mensaje> <mensaje2>")
    public void mensajesDeErrorRiesgosYPeps(@Named("mensaje")String mensaje,
                                            @Named("mensaje2")String mensaje2) {

    }


}
