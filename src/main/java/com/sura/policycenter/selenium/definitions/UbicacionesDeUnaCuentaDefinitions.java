package com.sura.policycenter.selenium.definitions;


import com.sura.commons.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.UbicacionesDeUnaCuentaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class UbicacionesDeUnaCuentaDefinitions {
    @Steps
    SeusLoginSteps seusLoginSteps;

    @Steps
    UbicacionesDeUnaCuentaSteps ubicacionesDeUnaCuentaSteps;

    @Given("que tengo una cuenta <cuenta>")
    public void givenQueTengoUnaCuenta(@Named("cuenta") String cuenta) {
        seusLoginSteps.login();
        ubicacionesDeUnaCuentaSteps.ir_a_ubicaciones_de_una_cuenta(cuenta);
    }

    @When("cuando agregue una nueva ubicacion nombre <nombre>, direccion <direccion>")
    public void whenCuandoAgregueUnaNuevaUbicacion(@Named("nombre") String nombre,@Named("direccion") String direccion) {
        ubicacionesDeUnaCuentaSteps.agregar_ubicacion(nombre,direccion);
    }

    @When("departamento <departamento>, ciudad <ciudad>, tipo de direccion <tipo_direccion>")
    public void andCuandoAgregueDireccion(@Named("departamento") String departamento,@Named("ciudad") String ciudad,@Named("tipo_direccion") String tipoDireccion) {
        ubicacionesDeUnaCuentaSteps.agregar_direccion(departamento,ciudad,tipoDireccion);
    }

    @Then("debo poder ver el tipo de vivienda en el detalle de la ubicacion")
    public void thenDeboPoderVerElTipoDeVivienda() {
        ubicacionesDeUnaCuentaSteps.verificar_tipo_de_direccion();
    }

}
