package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.IngresoDeAseguradoACotizacionPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class IngresoDeAseguradoACotizacionSteps extends ScenarioSteps{

    private IngresoDeAseguradoACotizacionPage ingresoDeAseguradoACotizacionPage = new IngresoDeAseguradoACotizacionPage(getDriver());

    public IngresoDeAseguradoACotizacionSteps (Pages pages){
        super(pages);
    }

    public void irAIngresarAsegurado() {
        ingresoDeAseguradoACotizacionPage.irAIngresarAsegurado();
    }

    public void agregarAsegurado() {
        ingresoDeAseguradoACotizacionPage.agregarAsegurado();
    }

    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar) {
        assertThat(ingresoDeAseguradoACotizacionPage.validarOpcionesDeAgregar(listaAgregar), is(equalTo("Elementos de la opción Agregar correctos")));
    }

    public void agregarAseguradoContactoDeLaCuenta() {
        ingresoDeAseguradoACotizacionPage.agregarAseguradoContactoDeLaCuenta();
    }

    public void validarAseguradoAgregado(String nombre) {
        assertThat(ingresoDeAseguradoACotizacionPage.validarAseguradoAgregado(), containsString(nombre));
    }
}
