package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ExpedicionDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class ExpedicionDePolizaSteps extends ScenarioSteps {

    ExpedicionDePolizaPage expedicionDePolizaPage;

    @Step
    public void navegar_barra_superior(String cotizacion) {
        expedicionDePolizaPage.irABuscarCotizacion(cotizacion);
    }

    @Step
    public void navega_barra_acciones (){
    }

   @Step
    public void navega_page_tipo_propiedad(String nomProducto){
   }

    @Step
    public void inicia_cotizacion_de_poliza_propiedad_comercial(){
    }
}
