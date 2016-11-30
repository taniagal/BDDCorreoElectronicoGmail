package com.sura.guidewire.policycenter.definitions.colectivas;

import com.sura.guidewire.policycenter.steps.colectivas.PolizaPrincipalPaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class PolizaPrincipalPaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private PolizaPrincipalPaSteps polizaPrincipalPaSteps;

    @When("cotice y vaya a la ventana de cotizacion")
    public void cotizarEIrALaSeccionDeCotizacion(){
        polizaPrincipalPaSteps.cotizarEIrALaSeccionDeCotizacion();
    }

    @Then("no debe estar visible la sección de contrato de poliza: asegurados, vehiculos, coberturas")
    public void validarElementosNoVisiblesDelMenu(){
        polizaPrincipalPaSteps.validarElementosNoVisiblesDelMenu();
    }

    @Then("la  ventana de revision de poliza solo debe mostrar la informacion general sin las tablas del detalle de riesgo")
    public void validarElementosNoVisiblesDeRevisionDePoliza(){
        polizaPrincipalPaSteps.validarElementosNoVisiblesDeRevisionDePoliza();
    }

    @Then("debe estar visible la seccion del menu herramientas con las opciones: Resumen, facturacion, Contactos, Participantes y Notas")
    public void validarLaVisibilidadDeLaSeccionHerramientasDelMenuLateral(){
        polizaPrincipalPaSteps.validarLaVisibilidadDeLaSeccionHerramientasDelMenuLateral();
    }

    @Then("solo se debe visualizar la informacion general, sin el detalle de vehiculos")
    public void validarQueElDetalleDeVehiculosNoEsVisibleEnLaCotizacion(){
        polizaPrincipalPaSteps.validarQueElDetalleDeVehiculosNoEsVisibleEnLaCotizacion();
    }

    @Then("los campos de la cotizacion no sean editables")
    public void validarQueLosCamposDeLaCotizacioNoSonEditables(){
        polizaPrincipalPaSteps.validarQueLosCamposDeLaCotizacioNoSonEditables();
    }
}
