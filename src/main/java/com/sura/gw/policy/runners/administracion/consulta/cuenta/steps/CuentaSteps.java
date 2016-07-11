package com.sura.gw.policy.runners.administracion.consulta.cuenta.steps;

import com.sura.gw.navegacion.pages.BuscarNavBarPages;
import com.sura.gw.policy.runners.administracion.consulta.cuenta.pages.BusquedaDeCuentasPage;
import com.sura.gw.policy.runners.administracion.consulta.cuenta.pages.ContactosCuentaWidgetPage;
import com.sura.gw.policy.runners.administracion.consulta.cuenta.pages.CuentaPages;
import net.thucydides.core.steps.ScenarioSteps;


public class CuentaSteps extends ScenarioSteps {
    CuentaPages cuenta = null;
    ContactosCuentaWidgetPage contactosAsociados;
    BusquedaDeCuentasPage busquedaDeCuentas = null;
    BuscarNavBarPages navegacion;

    private String numCuenta;


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

    public ContactosCuentaWidgetPage contactosAsociados() {
        return contactosAsociados;
    }
}
