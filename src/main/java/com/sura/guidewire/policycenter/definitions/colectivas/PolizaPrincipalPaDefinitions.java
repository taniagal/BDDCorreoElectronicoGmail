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

    @When("voy a la opcion de cotizacion")
    public void clicMenuLateralCotizacion(){
        polizaPrincipalPaSteps.clicMenuLateralCotizacion();
    }

    @Then("no debe estar visible la seccion de contrato de poliza: asegurados, vehiculos, coberturas")
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
    public void validarQueLosCamposDeLaCotizacionNoSonEditables(){
        polizaPrincipalPaSteps.validarQueLosCamposDeLaCotizacionNoSonEditables();
    }

    @Then("no debe estar visible en el menu lateral las opciones: asegurados, vehiculos, coberturas")
    public void validarQueLasOpcionesDeAseguradosVehiculosCoberturasNoSonVisibles(){
        polizaPrincipalPaSteps.validarQueLasOpcionesDeAseguradosVehiculosCoberturasNoSonVisibles();
    }

    @Then("debe estar visible en el menu lateral con las opciones: Resumen, facturacion, Contactos, Participantes y Notas")
    public void validarQueLasOpcionesDelMenuLateralEnHerramientasEnPolizaExpedidaSonVisibles(){
        polizaPrincipalPaSteps.validarQueLasOpcionesDelMenuLateralEnHerramientasEnPolizaExpedidaSonVisibles();
    }

    @Then("los campos de la ventana cotizacion de la poliza expedida no son editables")
    public void validarQueLosCamposDeLaCotizacionEnLaPolizaExpedidaNoSonEditables(){
        polizaPrincipalPaSteps.validarQueLosCamposDeLaCotizacionEnLaPolizaExpedidaNoSonEditables();
    }

}
