package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.acciones.cuenta.CuentaNuevaCotizacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class ExpedicionDePolizaSteps extends ScenarioSteps {

    private InicioPage inicioPage() {return getPages().currentPageAt(InicioPage.class);}
    private CuentaNuevaCotizacionPage cuentaNuevaCotizacionPage = new CuentaNuevaCotizacionPage(getDriver());
    public ExpedicionDePolizaSteps(Pages pages) {super(pages);}


    @Step
    public void navegar_barra_superior(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
    }

    @Step
    public void navega_barra_acciones (){
        inicioPage().irACuentaNuevaCotizacion();
    }

   @Step
    public void navega_page_tipo_propiedad(String nomProducto){
       cuentaNuevaCotizacionPage.cuentaComercial(nomProducto);
   }

    @Step
    public void inicia_cotizacion_de_poliza_propiedad_comercial(){
        cuentaNuevaCotizacionPage.creaCotizacion();
    }
}
