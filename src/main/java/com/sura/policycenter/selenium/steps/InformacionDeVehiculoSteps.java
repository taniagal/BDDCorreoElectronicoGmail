package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesInformacionDelVehiculoPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class InformacionDeVehiculoSteps extends ScenarioSteps {

    public InformacionDeVehiculoSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    OpcionesInformacionDelVehiculoPage opcionesInformacionDelVehiculoPage = new OpcionesInformacionDelVehiculoPage(getDriver());

    @Step
    public void validar_campos_del_vehiculo() {
        opcionesInformacionDelVehiculoPage.validaCamposInformacionVehiculo();
    }

    @Step
    public void ingresar_a_cotizacion_de_vehiculo() {
        opcionesInformacionDelVehiculoPage.ingresarOpcionVehiculo();
    }

    @Step
    public void ingresar_informacion_del_vehiculo (){
        opcionesInformacionDelVehiculoPage.llenarFormularioDetalleVehiculo();
    }
}
