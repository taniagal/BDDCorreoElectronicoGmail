package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.steps.IngresoDeAseguradoACotizacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class IngresoDeAseguradoACotizacionDefinitions {

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Steps
    private IngresoDeAseguradoACotizacionSteps ingresoDeAseguradoACotizacionSteps;

    @Given("voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>")
    public void irAIngresarAsegurado(@Named("cuenta") String cuenta){
        inicioPage().irACuentaBuscar(cuenta);
        inicioPage().irACuentaNuevoEnvioCuenta();
        ingresoDeAseguradoACotizacionSteps.irAIngresarAsegurado();
    }

    @When("quiera agregar un asegurado")
    public void agregarAsegurado(){
        ingresoDeAseguradoACotizacionSteps.agregarAsegurado();
    }

    @Then("Se debe mostrar las opciones: $listaAgregar")
    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar){
        ingresoDeAseguradoACotizacionSteps.validarOpcionesDeAgregar(listaAgregar);
    }

}


