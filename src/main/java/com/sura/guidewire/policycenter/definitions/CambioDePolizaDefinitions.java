package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CambioDePolizaSteps;
import com.sura.guidewire.policycenter.steps.colectivas.PolizaPrincipalPaSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class CambioDePolizaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    CambioDePolizaSteps cambioDePolizaSteps;

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    @Steps
    PolizaPrincipalPaSteps polizaPrincipalPaSteps;

    @Given("que voy a buscar una poliza  <buscarNumeroPoliza>")
    public void irABuscarPoliza(String buscarNumeroPoliza){
        cambioDePolizaSteps.irABuscarPoliza(buscarNumeroPoliza);
    }

    @When("que tiene marcado el campo reaseguro especial en <reaseguro>")
    public void esReaseguroEspecial(@Named("reaseguro") String reaseguro) {
        cambioDePolizaSteps.seleccionarInformacionPoliza();
        cambioDePolizaSteps.esReaseguroEspecial(reaseguro);
    }

    @When("quiero relizar el cambio de una poliza")
    public void cambiarPoliza() {
        polizaPrincipalPaSteps.validarMenuOpcionFormulariosNoEsVisible();
        cambioDePolizaSteps.irAMenuAcciones();
        cambioDePolizaSteps.cambiarPoliza();
    }

    @When("cambie la fecha de inicio de vigencia <dias> de pa poliza")
    public void cambiarFechaDeVigencia(@Named("dias") String dias) {
        cambioDePolizaSteps.cambiarFechaDeVigencia(dias);
    }

    @When("ingrese la informacion de poliza")
    public void cambiarIngresarAInformacionDePoliza() {
        cambioDePolizaSteps.llenarInformacionDePoliza();
    }

    @Given("le ingreso el reaseguro especial")
    public void ingresarReaseguroEspecial() {
        cambioDePolizaSteps.ingresarReaseguroEspecial();
    }

    @Then("debo visualizar la advertencia con el <mensaje>")
    public void validarMensaje(String mensaje) {
        cambioDePolizaSteps.validarMensaje(mensaje);
    }

    @Then("NO debo visualizar la advertencia")
    public void validarMensajeNoReasegur() {
        cambioDePolizaSteps.validarMensajeNoReaseguro();
    }

}
