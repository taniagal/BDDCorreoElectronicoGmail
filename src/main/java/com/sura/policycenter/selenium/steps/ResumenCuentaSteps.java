package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesResumenCuentaPage;
import java.util.Map;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ResumenCuentaSteps extends ScenarioSteps {

    OpcionesResumenCuentaPage opcionesResumenCuentaPage = new OpcionesResumenCuentaPage(getDriver());

    public ResumenCuentaSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void consultarResumenCuenta(){
        inicioPage().irAOpcionesResumenCuenta();
    }

    @Step
    public void verInfoResumenCuenta(Map<String, String> infoResumenCuenta) {
        opcionesResumenCuentaPage.verInfoResumenCuenta(infoResumenCuenta);
    }

    @Step
    public void editarResumenCuenta() {
        opcionesResumenCuentaPage.editarResumenCuenta();
    }

    @Step
    public void validarCamposEditablesPersona() {
        opcionesResumenCuentaPage.validarCamposEditablesPersona();
    }

    @Step
    public void validarCamposEditablesCompania() {
        opcionesResumenCuentaPage.validarCamposEditablesCompania();
    }

    @Step
    public void actualizarCuenta(){
        opcionesResumenCuentaPage.actualizarCuenta();
    }

    @Step
    public void editarPais(String pais) {
        opcionesResumenCuentaPage.editarPais(pais);
    }

    @Step
    public void validarDepartamento(String departamento) {
        opcionesResumenCuentaPage.validarDepartamento(departamento);
    }

    @Step
    public void editarDepto(String departamento) {
        opcionesResumenCuentaPage.editarDepto(departamento);
    }

    @Step
    public void validarCiudad(String ciudad) {
        opcionesResumenCuentaPage.validarCiudad(ciudad);
    }
}
