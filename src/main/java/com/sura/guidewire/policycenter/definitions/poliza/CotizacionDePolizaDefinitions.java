package com.sura.guidewire.policycenter.definitions.poliza;


import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.steps.poliza.CotizacionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.InformacionPolizaPASteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.HashMap;
import java.util.Map;


public class CotizacionDePolizaDefinitions {
    @Steps
    CotizacionDePolizaSteps cotizacionDePolizaSteps;

    @Steps
    InformacionPolizaPASteps informacionPolizaPASteps;

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    private final Map<String, String> infoCotizacionPoliza = new HashMap<>();

    public CotizacionDePolizaDefinitions() {
        infoCotizacionPoliza.put("numeroCotizacion", "Número de cotización");
        infoCotizacionPoliza.put("vigenciaPoliza", "Vigencia de la póliza");
        infoCotizacionPoliza.put("tomador", "Tomador");
        infoCotizacionPoliza.put("tipoDocumento", "Tipo documento");
        infoCotizacionPoliza.put("numeroDocumento", "Número documento");
        infoCotizacionPoliza.put("direccion", "Dirección");
        infoCotizacionPoliza.put("tipoDireccion", "Tipo de dirección");
        infoCotizacionPoliza.put("descripcionDireccion", "Descripción de la dirección");
        infoCotizacionPoliza.put("empresaAseguradora", "Empresa aseguradora");
        infoCotizacionPoliza.put("primaTotal", "Prima total");
        infoCotizacionPoliza.put("impuestos", "Impuestos y cargos extra");
        infoCotizacionPoliza.put("costoTotal", "Costo total");
    }

    private InicioPage inicioPage() {
        return ThucydidesWebDriverSupport.getPages().currentPageAt(InicioPage.class);
    }

    @Given("he realizado la cotizacion <cotizacion>")
    public void irALaCotizacion(@Named("cotizacion") String cotizacion) {
        inicioPage().irABuscarSubPoliza(cotizacion);
    }

    @When("ingrese al detalle de la cotizacion $datosCotizacion")
    public void verDetalleCotizacion(ExamplesTable datosCotizacion) {
        nuevaCotizacionSteps.cotizarEnvioCopiadoPa(datosCotizacion);
    }

    @When("ingrese a la revision de la poliza")
    public void ingresarARevisionPoliza() {
        cotizacionDePolizaSteps.ingresarARevisionPoliza();
    }

    @When("ingrese a la cotizacion")
    public void ingresarACotizacion() {
        cotizacionDePolizaSteps.ingresarACotizacion();
    }

    @When("el tipo de riesgo es CHASIS")
    public void validarTipoRiesgoChasis() {
        cotizacionDePolizaSteps.validarTipoRiesgo();
    }

    @When("las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable")
    public void validarFigurasCotizacion() {
        cotizacionDePolizaSteps.validarFigurasCotizacion();
    }

    @When("las figuras asegurado, beneficiario y/o tomador, fueron identificadas como PEP")
    public void validarFigurasPEP() {
        cotizacionDePolizaSteps.validarFigurasCotizacion();
    }

    @When("ya existe una cotizacion para el mismo Asegurado <asegurado>, diferente asesor y mismo numero de placa <placa>")
    public void validarCotizacionDuplicada(@Named("asegurado") String asegurado,
                                           @Named("placa") String placa) {
        cotizacionDePolizaSteps.validarDatosCotizacionPEP(asegurado, placa);
    }

    @When("ya existe una cotizacion para el mismo Asegurado (Numero de identificacion, Tipo de identificacion, diferente asesor\n" +
            "y mismo numero de placa)")
    public void validarExclusividad() {
        cotizacionDePolizaSteps.validarTipoRiesgo();
    }

    @When("se haya definido la cotizacion con intencion de financiacion")
    public void validarFinanciacion() {
        cotizacionDePolizaSteps.validarTipoRiesgo();
    }

    @When("la cotizacion tenga intencion de financiacion")
    public void ingresarACotizacionFinanciada() {
        cotizacionDePolizaSteps.validarCargueCotizacion();
    }

    @When("se muestre el mensaje <mensaje> de advertencia de financiacion")
    public void validarMensajeIntencionFinanciacion(@Named("mensaje") String mensaje) {
        informacionPolizaPASteps.mostrar_Mensaje_Advertencia_Financiacion(mensaje);
    }

    @When("intente cotizar")
    public void intentarCotizar() {
        nuevaCotizacionSteps.intentarCotizar();
    }

    @Then("intente cotizar")
    public void intentarCotizarDos() {
        nuevaCotizacionSteps.intentarCotizar();
    }

    @When("ingrese las coberturas basicas: $coberturas")
    public void agregarcoberturas(ExamplesTable coberturas) {
        nuevaCotizacionSteps.seleccionarCoberturaBasicas(coberturas);
    }

    @Then("debo ver la siguiente informacion $informacionCotizacion")
    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion) {
        cotizacionDePolizaSteps.validarInformacionCotizacion(infoCotizacionPoliza, informacionCotizacion);
    }

    @Then("debo poder ver la direccion del tomador de la poliza <direccion>, la cual se indico como principal")
    public void validarDireccion(@Named("direccion") String direccion) {
        cotizacionDePolizaSteps.validarDireccionTomador(direccion);
    }

    @Then("debo ver la siguiente direccion <direccion>")
    public void validarInformacionCotizacion(@Named("direccion") String direccion) {
        cotizacionDePolizaSteps.validarDireccion(direccion);
    }

    @Then("no se debe permitir continuar con la cotizacion y mostrar un mensaje <mensaje>; no se debe mostrar ningun valor de cotizacion al cliente")
    public void validarBloqueoCotizacion(@Named("mensaje") String mensaje) {
        cotizacionDePolizaSteps.validarBloqueoCotizacion(mensaje);
    }

    @Then("se debe mostrar un mensaje <mensaje> que indique \"El cliente (nombre del Aegurado) ya tiene una cotizacion en curso\n" +
            "para el producto seleccionado para la oficina (nombre de la oficina que se ingreso en la primera cotizacion)”,\n" +
            "con dos opciones : Solicitar Aprobacion y cancelar")
    public void validarBloqueoPEP(@Named("mensaje") String mensaje) {
        cotizacionDePolizaSteps.validarBloqueoCotizacion(mensaje);
    }

    @Then("no se debe permitir continuar con la cotizacion y mostrar un mensaje <mensaje> que indique el chasis es un riesgo")
    public void validarBloqueoChasis(@Named("mensaje") String mensaje) {
        cotizacionDePolizaSteps.validarBloqueoChasis(mensaje);
    }

    @Then("se debe mostrar un mensaje  <mensaje >que indique \"El cliente (nombre del Aegurado) ya tiene una cotizacion en curso para\n" +
            "el producto seleccionado para la oficina (nombre de la oficina que se ingreso en la primera cotizacion)”,\n" +
            "con dos opciones : Solicitar Aprobacion y cancelar")
    public void validarBloqueoPorExclusividad(@Named("mensaje") String mensaje) {
        cotizacionDePolizaSteps.validarBloqueoPorExclusividad(mensaje);
    }

    @Then("se debe mostrar un mensaje <mensaje> de advertencia sin bloquear la cotizacion")
    public void validarNoBloqueoCotizacion(@Named("mensaje") String mensaje) {
        cotizacionDePolizaSteps.validarBloqueoCotizacion(mensaje);
    }

    @Then("se debe mostrar un mensaje <mensaje> como advertencia")
    public void validarMensajeFinanciacion(@Named("mensaje") String mensaje) {
        cotizacionDePolizaSteps.validarBloqueoCotizacion(mensaje);
    }

    @Then("realizar la cotizacion")
    public void realizarCotizacion() {
        nuevaCotizacionSteps.intentarCotizar();
    }

    @Then("se debe mostrar en el detalle de la cotizacion el Valor por cuota a pagar <valorCuota> y\n" +
            "el numero de cotas <numeroCuotas> indicadas en la informacion de la poliza")
    public void mostrarValorYNumeroDeCuotas(@Named("valorCuota") String valorCuota,
                                            @Named("numeroCuotas") String numeroCuotas) {
        cotizacionDePolizaSteps.mostrar_Valor_A_Pagar_Por_Cuota_Y_Numero_De_Cuotas(valorCuota, numeroCuotas);
    }
}
