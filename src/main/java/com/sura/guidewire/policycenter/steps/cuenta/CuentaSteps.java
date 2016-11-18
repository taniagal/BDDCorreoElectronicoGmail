package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireLoginSteps;
import com.sura.guidewire.policycenter.pages.cuenta.BusquedaDeCuentaPage;
import com.sura.guidewire.policycenter.pages.cuenta.ContactosAsociadosACuentaWidgetPage;
import com.sura.guidewire.policycenter.pages.cuenta.CuentaPages;
import com.sura.guidewire.policycenter.pages.TransaccionesDePolizaWidgetObject;
import com.sura.guidewire.policycenter.utils.navegacion.steps.MenuBuscarSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepInterceptor;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


public class CuentaSteps extends ScenarioSteps {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    CuentaPages cuenta = null;
    ContactosAsociadosACuentaWidgetPage contactosAsociados;
    BusquedaDeCuentaPage busquedaDeCuentas = null;


    @Steps
    GuidewireLoginSteps loginSteps;

    @Steps
    MenuBuscarSteps buscarSteps;




    public void login(WebDriver driver, String rolUsuario) {
        SerenityWebdriverManager.inThisTestThread().resetCurrentDriver();

        loginSteps.abrirNavegador(driver);
        loginSteps.loguearseAPolicycenterConRol(rolUsuario);

        LOGGER.info("CuentaSteps.loginSteps");
    }


    private BusquedaDeCuentaPage irAPaginaBusquedaDeCuentas(){
        return busquedaDeCuentas;
    }

    public void consultarCuentaPorNumeroDeCuenta(String numCuenta) {

        buscarSteps.ingresarALaOpcionBuscar();
        this.cuenta = irAPaginaBusquedaDeCuentas().luego().ingresar().numeroDeCuenta(numCuenta).luego().buscar().seleccionarCuenta(numCuenta);
    }

    public void verContactosAsociados() {
        contactosAsociados = this.cuenta.enContactos();
    }

    public ContactosAsociadosACuentaWidgetPage obtenerContactosAsociadosWO() {
        return contactosAsociados;
    }

    @Step
    public TransaccionesDePolizaWidgetObject consultarTransaccionesDePoliza() {
        return cuenta.enTransaccionesDePoliza();
    }

}
