package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.pages.cuenta.BusquedaDeCuentaPage;
import com.sura.guidewire.policycenter.pages.cuenta.ContactosAsociadosACuentaWidgetPage;
import com.sura.guidewire.policycenter.pages.cuenta.CuentaPages;
import com.sura.guidewire.policycenter.pages.poliza.TransaccionesDePolizaWidgetObject;
import com.sura.guidewire.policycenter.utils.navegacion.steps.MenuBuscarSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;


public class CuentaSteps extends ScenarioSteps {
    @Page
    CuentaPages cuenta;
    @Page
    ContactosAsociadosACuentaWidgetPage contactosAsociados;
    @Page
    BusquedaDeCuentaPage busquedaDeCuentas ;

    @Steps
    MenuBuscarSteps buscarSteps;


    private BusquedaDeCuentaPage irAPaginaBusquedaDeCuentas() {
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
