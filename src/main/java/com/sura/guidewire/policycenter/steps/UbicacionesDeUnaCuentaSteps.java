package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.UbicacionesDeUnaCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class UbicacionesDeUnaCuentaSteps extends ScenarioSteps {
    UbicacionesDeUnaCuentaPage ubicacionesDeUnaCuentaPage = new UbicacionesDeUnaCuentaPage(getDriver());

    public UbicacionesDeUnaCuentaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ir_a_ubicaciones_de_una_cuenta(String cuenta){
        ubicacionesDeUnaCuentaPage.irAUbicacionesDeUnaCuenta(cuenta);
    }

    @Step
    public void agregar_ubicacion(String nombreUbicacion,String direccion){
        ubicacionesDeUnaCuentaPage.agregarUbicacion(nombreUbicacion,direccion);
    }

    @Step
    public void agregar_direccion(String departamento, String ciudad, String tipoDireccion) {
        ubicacionesDeUnaCuentaPage.agregaDireccion(departamento,ciudad,tipoDireccion);
    }

    @Step
    public void verificar_tipo_de_direccion(){
        ubicacionesDeUnaCuentaPage.verificarTipoDeDireccion();
    }
}
