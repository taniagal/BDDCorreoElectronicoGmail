package com.sura.gw.policy.cuenta.steps;

import com.sura.gw.navegacion.pages.BuscarNavBarPages;
import com.sura.gw.policy.cuenta.pages.BusquedaDeCuentasPage;
import com.sura.gw.policy.cuenta.pages.CuentaPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.LoggerFactory;


public class ConsultaDeCuentaSteps extends ScenarioSteps {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    CuentaPages cuenta = null;
    BusquedaDeCuentasPage busquedaDeCuentas = null;
    BuscarNavBarPages navegacion;

    private String numCuenta;

    private BusquedaDeCuentasPage irAPaginaBusquedaDeCuentas(){
        busquedaDeCuentas = navegacion.seleccionarOpcion().enMenuContextual().seleccionarOpcion(BuscarNavBarPages.Opciones.CUENTAS.nombre());
        return busquedaDeCuentas;
    }

    @Step
    public void consultar_cuenta_por_numero_de_cuenta(String numCuenta) {
        this.numCuenta = numCuenta;
        this.cuenta = irAPaginaBusquedaDeCuentas().luego().ingresar().numeroDeCuenta(numCuenta).luego().buscar().seleccionarCuenta(numCuenta);
    }

}
