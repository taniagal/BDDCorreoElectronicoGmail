package com.sura.policycenter.selenium.definitions.colectivas;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.colectivas.NuevaPolizaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class NuevaPolizaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    NuevaPolizaSteps nuevaPolizaSteps;

    @When("despliegue la lista de organizacion")
    public void dar_clic_en_la_lista_organizacion(){
        nuevaPolizaSteps.desplegarListaDeOrganizaciones();
    }

    @When("seleccione la organizacion <organizacion>")
    public void seleccionar_la_organizacion(@Named("organizacion") String organizacion){
        nuevaPolizaSteps.seleccionarOrganizacion(organizacion);
    }

    @When("despliegue la lista canal")
    public void dar_clic_en_la_lista_canal(){
        nuevaPolizaSteps.seleccionarCanal();
    }

    @Then("me debe mostrar las organizaciones: $listaOrganizaciones")
    public void validar_lista_de_organizaciones(ExamplesTable listaOrganizaciones){
        nuevaPolizaSteps.validarListaDeOrganizaciones(listaOrganizaciones);
    }

    @Then("la lista de canal debe mostrar los siguientes datos <datosListaCanal>")
    public void validar_lista_canal_de_acuerdo_a_la_organizacion(@Named("datosListaCanal") String datosListaCanal){
        nuevaPolizaSteps.validaListaCanalDeAcuerdoALaOrganizacion(datosListaCanal);
    }

}
