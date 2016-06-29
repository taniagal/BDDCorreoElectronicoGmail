package com.sura.policycenter.selenium.definitions;


import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.DetallesDeUbicacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;

public class ValidacionesInformacionDeVehiculoDefinitions {
    @Steps
    SeusLoginSteps loginSteps;

    @Steps
    DetallesDeUbicacionSteps detallesDeUbicacionSteps;

    @Given("estoy cotizando una poliza de PA en cuenta <cuenta> y producto <producto>")
    public void agregarPoliza(@Named("cuenta")String cuenta, @Named("producto")String producto) {
        loginSteps.login();
        detallesDeUbicacionSteps.ir_a_nueva_poliza(cuenta,producto);
    }

}
