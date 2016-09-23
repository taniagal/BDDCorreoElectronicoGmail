package com.sura.gw.policy.cuenta.steps;

import com.sura.gw.navegacion.steps.GuidewireLoginSteps;
import com.sura.gw.policy.cuenta.pages.BusquedaDeCuentasPage;
import com.sura.gw.policy.cuenta.pages.ContactosAsociadosACuentaWidgetPage;
import com.sura.gw.policy.cuenta.pages.CuentaPages;
import com.sura.gw.policy.cuenta.pages.TransaccionesDePolizaWidgetObject;
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
    BusquedaDeCuentasPage busquedaDeCuentas = null;

    @Steps
    GuidewireLoginSteps loginSteps;


    public void login(WebDriver driver, String rolUsuario) {
        SerenityWebdriverManager.inThisTestThread().resetCurrentDriver();

        loginSteps.abrir_navegador(driver);
        loginSteps.loguearse_a_policycenter_con_rol(rolUsuario);

        LOGGER.info("CuentaSteps.loginSteps");
    }


    private BusquedaDeCuentasPage irAPaginaBusquedaDeCuentas(){
        //busquedaDeCuentas = navegacion.seleccionarOpcion().enMenuContextual().seleccionarOpcion(BuscarNavBarPages.Opciones.CUENTAS.nombre());
        return busquedaDeCuentas;
    }

    public void consultarCuentaPorNumeroDeCuenta(String numCuenta) {
        String numeroCuenta = numCuenta;
        this.cuenta = irAPaginaBusquedaDeCuentas().luego().ingresar().numeroDeCuenta(numCuenta).luego().buscar().seleccionarCuenta(numCuenta);
    }

    public void verContactosAsociados() {
        contactosAsociados = this.cuenta.enContactos();
    }

    public ContactosAsociadosACuentaWidgetPage obtenerContactosAsociadosWO() {
        return contactosAsociados;
    }

    @Step
    public TransaccionesDePolizaWidgetObject consultar_transacciones_de_poliza() {
        return cuenta.enTransaccionesDePoliza();
    }

}
