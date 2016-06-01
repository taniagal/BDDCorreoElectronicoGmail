package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizarDesdeMisActividadesSteps;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class CotizarDesdeMisActividadesDefinitions {

    @Steps
    CotizarDesdeMisActividadesSteps cotizador;


    @Given("deseo crear nueva cotización desde la página $tituloPagina")
    @Alias("deseo jurica nueva cotización desde la página $tituloPagina")
    @Composite()
    public void cotizarDesdeMisActividades(String tituloPagina){
        cotizador.ir_al_menu_escritorio_del_panel_superior();
    }

    @When("seleccione $opcion de la opción $btnAccion")
    public void seleccionarOpcion(String opcion, String btnAccion){
        cotizador.clic_en_la_opcion_acciones_del_panel_izquierdo(btnAccion);
        Serenity.takeScreenshot();
        cotizador.clic_en_la_opcion_nueva_cotizacion(opcion);
    }

    @Then("espero ver la página $tituloPagina")
    public void validarSiEstoyEnNuevaCotizacion(String tituloPagina){
        assertEquals(tituloPagina, cotizador.validar_que_el_titulo_de_la_pagina_sea_nueva_cotizacion());
    }
}
