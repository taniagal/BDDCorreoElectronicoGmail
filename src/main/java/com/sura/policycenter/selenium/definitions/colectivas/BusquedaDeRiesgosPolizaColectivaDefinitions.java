package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.BusquedaDeRiesgosPolizaColectivaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDeRiesgosPolizaColectivaDefinitions {

    @Steps
    BusquedaDeRiesgosPolizaColectivaSteps busquedaDeRiesgosPolizaColectivaSteps;

    @When("de clic en el numero de <poliza> de transacciones poliza colectiva")
    public void whenClicEnPolizaColectiva(@Named("poliza")String polizaColectiva) {
        busquedaDeRiesgosPolizaColectivaSteps.busca_por_numero_de_poliza_colectiva(polizaColectiva);
    }
    @When("de clic en riesgos")
    public void whenDeClicEnRiesgos() {
        busquedaDeRiesgosPolizaColectivaSteps.clic_en_riesgos();
    }

    @When("realice la busqueda por la placa <placa>")
    public void whenRealiceLaBusquedaPorLaPlacaplaca(@Named("placa")String placa) {
        busquedaDeRiesgosPolizaColectivaSteps.ingresar_la_placa(placa);
    }

    @Then("debe listar la informacion del riesgo $infoRiesgo")
    public void thenDebeListarLaInformacionDelRiesgo(ExamplesTable infoRiesgo) {
        busquedaDeRiesgosPolizaColectivaSteps.valida_resultado_de_riesgos(infoRiesgo);
    }
}
