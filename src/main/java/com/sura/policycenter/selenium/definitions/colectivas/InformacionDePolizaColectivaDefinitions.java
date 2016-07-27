package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.InformacionDePolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class InformacionDePolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    InformacionDePolizaColectivaSteps informacionDePolizaColectivaSteps;

    @When("seleccione el producto <producto> de poliza colectiva para expedirla")
    public void seleccionarProductoDePolizaColectiva(@Named("producto") String producto){
        informacionDePolizaColectivaSteps.seleccionarProductoDePolizaColectiva(producto);
    }

    @Then("debo ver los siguiente campos en la pantalla con su respectiva informacion: $informacionPolizaColectiva")
    public void validarInformacionDePolizaColectiva(ExamplesTable informacionPolizaColectiva){
        informacionDePolizaColectivaSteps.validarInformacionDePolizaColectiva(informacionPolizaColectiva);
    }

    @Then("debo ver el anio de fin de vigencia <cantidadAniosVigencia> calculado de acuerdo al producto seleccionado")
    public void validarFechaFinVigencia(@Named("cantidadAniosVigencia") int cantidadAniosVigencia){
        informacionDePolizaColectivaSteps.validarFechaFinVigencia(cantidadAniosVigencia);
    }
}
