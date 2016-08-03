package com.sura.gw.policy.cuenta.steps;

import com.sura.gw.navegacion.pages.BuscarNavBarPages;
import com.sura.gw.policy.cuenta.pages.BusquedaDeCuentasPage;
import com.sura.gw.policy.cuenta.pages.CuentaPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class ConsultaDeCuentaSteps extends ScenarioSteps {
    CuentaPages cuenta = null;
    BusquedaDeCuentasPage busquedaDeCuentas = null;
    BuscarNavBarPages navegacion;

    private BusquedaDeCuentasPage irAPaginaBusquedaDeCuentas(){
        busquedaDeCuentas = navegacion.seleccionarOpcion().enMenuContextual().seleccionarOpcion(BuscarNavBarPages.Opciones.CUENTAS.nombre());
        return busquedaDeCuentas;
    }

    @Step
    public void consultar_cuenta_por_numero_de_cuenta(String numeroCuenta) {
        String numCuenta = numeroCuenta;
        cuenta = irAPaginaBusquedaDeCuentas().luego().ingresar().numeroDeCuenta(numeroCuenta).luego().buscar().seleccionarCuenta(numeroCuenta);
    }

}
