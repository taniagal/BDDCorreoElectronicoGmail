package com.sura.gw.policy.administracion.consulta.cuenta.steps;

import com.sura.gw.navegacion.pages.BuscarNavBarPages;
import com.sura.gw.navegacion.steps.GuidewireLoginSteps;
import com.sura.gw.policy.administracion.consulta.cuenta.pages.BusquedaDeCuentasPage;
import com.sura.gw.policy.administracion.consulta.contactos.pages.ContactosAsociadosACuentaWidgetPage;
import com.sura.gw.policy.administracion.consulta.cuenta.pages.CuentaPages;
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
    BuscarNavBarPages navegacion;

    private String numCuenta;

    @Steps
    GuidewireLoginSteps login;


    public void login(WebDriver driver, String rolUsuario) {
        SerenityWebdriverManager.inThisTestThread().resetCurrentDriver();

        login.abrir_navegador(driver);
        login.loguearse_a_policycenter_con_rol(rolUsuario);

        LOGGER.info("CuentaSteps.login");
    }


    private BusquedaDeCuentasPage irAPaginaBusquedaDeCuentas(){
        busquedaDeCuentas = navegacion.seleccionarBuscar().enMenuContextual().seleccionarOpcion(BuscarNavBarPages.Opciones.CUENTAS.nombre());
        return busquedaDeCuentas;
    }

    public void consultarCuentaPorNumeroDeCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
        this.cuenta = irAPaginaBusquedaDeCuentas().luego().ingresar().numeroDeCuenta(numCuenta).luego().buscar().seleccionarCuenta(numCuenta);
    }

    public void verContactosAsociados() {
        contactosAsociados = this.cuenta.enContactos();
    }

    public ContactosAsociadosACuentaWidgetPage obtenerContactosAsociadosWO() {
        return contactosAsociados;
    }

}
