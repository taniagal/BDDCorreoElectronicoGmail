package com.sura.billing.selenium.steps;

import com.sura.billing.selenium.pages.AbrirAppPage;
import com.sura.billing.selenium.pages.InicioPage;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BillingSteps extends ScenarioSteps {

    private final Guidewire gw = new Guidewire(getDriver());
    private final AbrirAppPage abrirAppPage = new AbrirAppPage(getDriver());

    public BillingSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void open() {
        abrirAppPage.open();
    }

    @Step
    public void login(String usuario, String contrasenia) {
        gw.login(usuario, contrasenia);
    }

    @Step
    public void assertion(String element) {
        inicioPage().assertion(element);
    }

    @Step
    @Manual
    public void navegarItemDiasFestivos() {
        inicioPage().irAAdminDiasFestivos();
        waitABit(3000);
    }

    @Step
    public void assertionFestivo(String msj2){
        inicioPage().asercionFestivo(msj2);
    }

    @Step
    public void navegarTabBar() {
        inicioPage().irAMisActividades();
        waitABit(3000);
        inicioPage().irAEstadosAprobacion();
        waitABit(3000);
    }

    @Step
    public void logout() {
        gw.logout();
    }

    public void buscarMenu(String numCuenta, String numPoliza, String numAgente) {
        inicioPage().irACuentaBuscar(numCuenta);
        waitABit(3000);
    }

}
