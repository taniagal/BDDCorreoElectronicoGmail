package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class InformacionDePolizaMrcSteps extends ScenarioSteps {

    public InformacionDePolizaMrcSteps (Pages pages) {
        super(pages);
    }
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }
    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage = new OpcionesInformacionPolizaMrcPage (getDriver());

    @Step
    public void navegar_barra_superior(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
    }

    @Step
    public void navegar_por_las_opciones_de_acciones (){
        inicioPage().irACuentaNuevoEnvioCuenta();
    }

    @Step
    public void selecciona_cotizacion_para_propiedad_comercial (String nomProducto){
        opcionesInformacionPolizaMrcPage.ingresaAgente();
        opcionesInformacionPolizaMrcPage.seleccionarProducto(nomProducto);
    }

    @Step
    public void validacion_de_datos_del_tomador (String tomador){

    }


}
