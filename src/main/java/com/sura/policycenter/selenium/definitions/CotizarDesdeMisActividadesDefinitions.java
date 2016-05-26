package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.pages.policy_estados_de_poliza.cotizacion.NuevaCotizacionPage;
import com.sura.policycenter.selenium.steps.CotizarDesdeMisActividadesSteps;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CotizarDesdeMisActividadesDefinitions {

    @Steps
    CotizarDesdeMisActividadesSteps cotizador;


    NuevaCotizacionPage nuevaCotizacionPage;

    @Given("deseo crear nueva cotización desde 'Mis actividades'")
    public void cotizarDesdeMisActividades(){
        cotizador.ir_al_menu_escritorio_del_panel_superior();

    }

    @When("seleccione 'Nueva cotización' de la opción 'Acciones'")
    public void seleccionarOpcion(){
        cotizador.clic_en_la_opcion_acciones_del_panel_izquierdo();
        Serenity.takeScreenshot();
        cotizador.clic_en_la_opcion_nueva_cotizacion();
    }

    @Then("espero ver la página 'Nueva cotización'")
    public void validarSiEstoyEnNuevaCotizacion(){

    }
}
