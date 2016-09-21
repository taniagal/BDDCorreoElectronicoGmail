package com.sura.gw.policy.cuenta.steps;


import com.sura.gw.navegacion.steps.GuidewireSteps;
import com.sura.gw.policy.cuenta.pages.BusquedaDeCuentasPage;
import com.sura.gw.policy.cuenta.pages.CuentaPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;


public class ConsultaDeCuentaSteps extends ScenarioSteps {
    CuentaPages cuenta = null;
    BusquedaDeCuentasPage busquedaDeCuentas = null;

    @Steps
    GuidewireSteps guidewire;

    private BusquedaDeCuentasPage irAPaginaBusquedaDeCuentas(){
        //busquedaDeCuentas = navegacion.seleccionarOpcion().enMenuContextual().seleccionarOpcion(BuscarNavBarPages.Opciones.CUENTAS.nombre());

        //guidewire.ir_a_navegacion_superior()
        return busquedaDeCuentas;
    }

    @Step
    public void consultar_cuenta_por_numero_de_cuenta(String numeroCuenta) {
        String numCuenta = numeroCuenta;
        cuenta = irAPaginaBusquedaDeCuentas().luego().ingresar().numeroDeCuenta(numeroCuenta).luego().buscar().seleccionarCuenta(numeroCuenta);
    }

}
