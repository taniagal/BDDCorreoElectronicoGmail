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

    @SuppressWarnings("EmptyMethod")
    @When("el tipo de causal es TECNICA, el tipo de riesgo CHASIS, MOTOR Y/O PLACA")
    @Manual
    public void validarTipoRiesgoCausalTecnica(){
        //Se ejecuta manualmente
    }

    @SuppressWarnings("EmptyMethod")
    @When("el tipo de causal es MORAL, el tipo de riesgo CHASIS, MOTOR Y/O PLACA")
    @Manual
    public void validarTipoRiesgoCausalMoral(){
        //Se ejecuta manualmente
    }

    @When("las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable")
    public void validarFigurasCotizacion(){
        cotizacionDePolizaSteps.validarFigurasCotizacion();
    }

    @When("las figuras asegurado, beneficiario y/o tomador, fueron identificadas como PEP")
    public void validarFigurasPEP() {
        cotizacionDePolizaSteps.validarFigurasCotizacion();
    }

    @When("ya existe una cotizacion para el mismo Asegurado <asegurado>, diferente asesor y mismo numero de placa <placa>")
    public void validarCotizacionDuplicada(@Named("asegurado") String asegurado,
                                           @Named("placa") String placa){
        cotizacionDePolizaSteps.validarDatosCotizacionPEP(asegurado, placa);
    }

    @Then("debo ver la siguiente informacion $informacionCotizacion")
    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion) {
        cotizacionDePolizaSteps.validarInformacionCotizacion(infoCotizacionPoliza, informacionCotizacion);
    }

    /*@Then("debo poder ver la direccion del tomador <direccionTomador> de la poliza la cual indico como principal")
    public void validarDireccionTomador(@Named("direccionTomador") String direccion){
        cotizacionDePolizaSteps.validarDireccionTomador(direccion);
    }*/

    @Then("debo poder ver la direccion del tomador de la poliza <direccion>, la cual se indico como principal")
    public void validarDireccion(@Named("direccion") String direccion){
        cotizacionDePolizaSteps.validarDireccionTomador(direccion);
    }

    @Then("debo ver la siguiente direccion <direccion>")
    public void validarInformacionCotizacion(@Named("direccion") String direccion) {
        cotizacionDePolizaSteps.validarDireccion(direccion);
    }

    @Then("no se debe permitir continuar con la cotizacion y mostrar un mensaje <mensaje>; no se debe mostrar ningun valor de cotizacion al cliente")
    public void validarBloqueoCotizacion(@Named("mensaje") String mensaje){
        cotizacionDePolizaSteps.validarBloqueoCotizacion(mensaje);
    }

    @Then("se debe mostrar un mensaje <mensaje> que indique \"El cliente (nombre del Aegurado) ya tiene una cotizacion en curso\n" +
            "para el producto seleccionado para la oficina (nombre de la oficina que se ingreso en la primera cotizacion)”,\n" +
            "con dos opciones : Solicitar Aprobacion y cancelar")
    public void validarBloqueoPEP(@Named("mensaje") String mensaje){
        cotizacionDePolizaSteps.validarBloqueoCotizacion(mensaje);
    }

    @SuppressWarnings("EmptyMethod")
    @Then("no se debe permitir continuar con la cotizacion, no se debe mostrar ningun valor de cotizacion al cliente")
    @Manual
    public void thenValidarBloqueo(){
        //Se ejecuta manualmente
    }
}
