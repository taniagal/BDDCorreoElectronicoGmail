package com.sura.policycenter.selenium.definitions;


import com.google.inject.name.Named;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.steps.CotizacionDePolizaSteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.HashMap;
import java.util.Map;

public class CotizacionDePolizaDefinitions {

    private InicioPage inicioPage() {
        return ThucydidesWebDriverSupport.getPages().currentPageAt(InicioPage.class);
    }

    private final Map<String, String> infoCotizacionPoliza = new HashMap<>();

    public CotizacionDePolizaDefinitions(){
        infoCotizacionPoliza.put("numeroCotizacion", "Número de cotización");
        infoCotizacionPoliza.put("vigenciaPoliza", "Vigencia de la póliza");
        infoCotizacionPoliza.put("tomador", "Tomador");
        infoCotizacionPoliza.put("direccion", "Dirección");
        infoCotizacionPoliza.put("tipoDireccion", "Tipo de dirección");
        infoCotizacionPoliza.put("descripcionDireccion", "Descripción de dirección");
        infoCotizacionPoliza.put("empresaAseguradora", "Empresa aseguradora");
        infoCotizacionPoliza.put("primaTotal", "Prima total");
        infoCotizacionPoliza.put("impuestos", "Impuestos y cargos extra");
        infoCotizacionPoliza.put("costoTotal", "Costo total");
    }

    @Steps
    CotizacionDePolizaSteps cotizacionDePolizaSteps;

    @Given("he realizado la cotizacion <cotizacion>")
    public void irALaCotizacion(@Named("cotizacion") String cotizacion) {
        inicioPage().irABuscarSubPoliza(cotizacion);
    }

    @When("ingrese al detalle de la cotizacion")
    public void verDetalleCotizacion() {
       cotizacionDePolizaSteps.verDetalleCotizacion();
    }

    @When("ingrese a la revision de la poliza")
    public void ingresarARevisionPoliza(){
        cotizacionDePolizaSteps.ingresarARevisionPoliza();
    }

    @When("el tipo de causal es TECNICA, el tipo de riesgo CHASIS, MOTOR Y/O PLACA")
    public void validarTipoRiesgoCausalTecnica(){
        cotizacionDePolizaSteps.validarTipoRiesgoCausal();
    }

    @When("el tipo de causal es MORAL, el tipo de riesgo CHASIS, MOTOR Y/O PLACA")
    public void validarTipoRiesgoCausalMoral(){
        cotizacionDePolizaSteps.validarTipoRiesgoCausal();
    }

    @SuppressWarnings("EmptyMethod")
    @When("las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable")
    @Manual
    public void validarFigurasCotizacion(){
        //Se ejecuta manualmente
    }

    @Then("debo ver la siguiente informacion $informacionCotizacion")
    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion) {
        cotizacionDePolizaSteps.validarInformacionCotizacion(infoCotizacionPoliza, informacionCotizacion);
    }

    @Then("debo ver la siguiente direccion <direccion>")
    public void validarInformacionCotizacion(@Named("direccion") String direccion) {
        cotizacionDePolizaSteps.validarDireccion(direccion);
    }

    @Then("no se debe permitir continuar con la cotizacion <mensaje>, no se debe mostrar ningun valor de cotizacion al cliente")
    public void validarBloqueoCotizacion(@Named("mensaje") String mensaje){
        cotizacionDePolizaSteps.validarBloqueoCotizacion(mensaje);
    }

    @SuppressWarnings("EmptyMethod")
    @Then("no se debe permitir continuar con la cotizacion, no se debe mostrar ningun valor de cotizacion al cliente")
    @Manual
    public void thenValidarBloqueo(){
        //Se ejecuta manualmente
    }
}
