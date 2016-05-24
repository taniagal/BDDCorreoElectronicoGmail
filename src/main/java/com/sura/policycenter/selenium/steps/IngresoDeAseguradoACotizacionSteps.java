package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.IngresoDeAseguradoACotizacionPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class IngresoDeAseguradoACotizacionSteps extends ScenarioSteps{

    private IngresoDeAseguradoACotizacionPage ingresoDeAseguradoACotizacionPage = new IngresoDeAseguradoACotizacionPage(getDriver());

    public void irAIngresarAsegurado() {
        ingresoDeAseguradoACotizacionPage.irAIngresarAsegurado();
    }

    public void agregarAsegurado() {
        ingresoDeAseguradoACotizacionPage.agregarAsegurado();
    }

    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar) {
        ingresoDeAseguradoACotizacionPage.validarOpcionesDeAgregar(listaAgregar);
    }
}
