package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.pages.cuenta.UbicacionesDeUnaCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class UbicacionesDeUnaCuentaSteps extends ScenarioSteps {
    UbicacionesDeUnaCuentaPage ubicacionesDeUnaCuentaPage = new UbicacionesDeUnaCuentaPage(getDriver());

    public UbicacionesDeUnaCuentaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void irAUbicacionesDeUnaCuenta(String cuenta){
        ubicacionesDeUnaCuentaPage.irAUbicacionesDeUnaCuenta(cuenta);
    }

    @Step
    public void agregarUbicacion(String nombreUbicacion, String direccion){
        ubicacionesDeUnaCuentaPage.agregarUbicacion(nombreUbicacion,direccion);
    }

    @Step
    public void agregarDireccion(String departamento, String ciudad, String tipoDireccion) {
        ubicacionesDeUnaCuentaPage.agregaDireccion(departamento,ciudad,tipoDireccion);
    }

    @Step
    public void verificarTipoDeDireccion(){
        ubicacionesDeUnaCuentaPage.verificarTipoDeDireccion();
    }
}
