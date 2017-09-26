package com.sura.guidewire.policycenter.definitions.reaseguro;


import com.sura.guidewire.policycenter.definitions.poliza.InformacionDePolizaMrcDefinitions;
import com.sura.guidewire.policycenter.steps.poliza.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.CrearYEditarCumulosSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.GrupoDeDireccionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class GrupoDeDireccionDefinitions {

    @Steps
    InformacionDePolizaMrcDefinitions informacionDePolizaMrcDefinitions;

    @Steps
    CrearYEditarCumulosSteps crearYEditarCumulosSteps;

    @Steps
    GrupoDeDireccionSteps grupoDeDireccionSteps;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @Given("ingrese la Fecha Inicio Vigencia: $fechaInicioVigencia")
    public void givenModifiqueLasFechasParaQueSeanCreadasEnDosPeriodos(String fechaInicioVigencia) {
        informacionDePolizaMrcDefinitions.modificaFechaInicioFechaFin(fechaInicioVigencia);
    }

    @When("quiera reasegurar la poliza cotizada")
    public void whenIngreseALaOpcionDeReaseguro() {
        crearYEditarCumulosSteps.ingresar_a_opcion_reaseguro();
    }

    @Then("debo ver el resultado del reaseguro aplicable por cada riesgo para un contrato cuota parte y excedente segun porcentajes de retencion y cesion")
    public void thenSeDebeValidarLosValoresDelCP() {
        grupoDeDireccionSteps.validaInformacionDeCotaparte();
        grupoDeDireccionSteps.validainformaciondeExcedente();
    }

    @Then("se debe validar los valores del EX, el monto retenido debe ser igual a 0")
    @Alias("se debe validar los valores del Exedidos en el contrato")
    public void thenSeDebeValidarLosValoresDelEX() {
        grupoDeDireccionSteps.validainformaciondeExcedente();
    }

    @Then("se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente: $examplesTable")
    public void verificarValoresContratosReasegurables(ExamplesTable examplesTable) {
        grupoDeDireccionSteps.verificarValoresContratosReasegurables(examplesTable);
    }

    @Then("se debe verificar la base reasegurable del riesgo y la base del contrato automatico: $examplesTable")
    public void verificarBasesReasegurablesRiesgos(ExamplesTable examplesTable) {
        grupoDeDireccionSteps.verificarBasesReasegurablesRiesgos(examplesTable);
    }

    @Then("se valida el valor retenido y el riesgo cedido del contrato cuota parte")
    public void validarValorRetenidoRiesgoCedidoCuotaParte() {
        grupoDeDireccionSteps.validarValorRetenidoRiesgoCedidoCuotaParte();
    }

    @Then("se valida el porcentaje de retencion y el riesgo cedido del operativo de exceso")
    public void validarPorcentajeRetencionRiesgoCedido() {
        grupoDeDireccionSteps.validarPorcentajeRetencionRiesgoCedido();
    }

    @When("de clic en el registro de autos: $gruposAutos")
    public void cliquearRegistroAutosPD(String gruposAutos) {
        grupoDeDireccionSteps.cliquearRegistroAutosPD(gruposAutos);
    }

    @When("ingrese la Fecha Inicio Vigencia: $fechaInicioVigencia")
    public void modificarFechaInicioVigencia(String fechaInicioVigencia) {
        informacionDePolizaMrcSteps.ingresarFechaDeVigencia(fechaInicioVigencia);
    }

    @When("de clic al menu reaseguro")
    public void clicMenuReaseguro() {
        crearYEditarCumulosSteps.clicMenuReaseguro();
    }

    @When("seleccione opcion Ver A Partir De: $verApartirDe")
    public void seleccionarOpcionVerApartirDe(String verApartirDe) {
        grupoDeDireccionSteps.seleccionarOpcionVerApartirDe(verApartirDe);
    }

    @When("ingrese un reasegurador de tipo programa")
    public void ingresarSegundoReasegurador() {
        grupoDeDireccionSteps.ingresarSegundoReasegurador();
    }

    @When("acepte el acuerdo facultativo")
    public void aceptarAcuerdoFacultativo() {
        grupoDeDireccionSteps.aceptarAcuerdoFacultativo();
    }

    @Given("ingrese la fecha fin de vigencia de la poliza")
    public void ingresarFechaFinVigencia() {
        grupoDeDireccionSteps.ingresarFechaFinVigencia();
    }
}
