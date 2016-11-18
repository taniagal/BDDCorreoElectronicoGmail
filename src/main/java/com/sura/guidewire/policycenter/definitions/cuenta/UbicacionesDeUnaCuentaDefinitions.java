package com.sura.guidewire.policycenter.definitions.cuenta;


import com.sura.guidewire.policycenter.steps.commons.SeusLoginSteps;
import com.sura.guidewire.policycenter.steps.cuenta.UbicacionesDeUnaCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class UbicacionesDeUnaCuentaDefinitions {
    @Steps
    SeusLoginSteps seusLoginSteps;

    @Steps
    UbicacionesDeUnaCuentaSteps ubicacionesDeUnaCuentaSteps;

    @Given("que tengo una cuenta <cuenta>")
    public void givenQueTengoUnaCuenta(@Named("cuenta") String cuenta) {
        seusLoginSteps.login();
        ubicacionesDeUnaCuentaSteps.irAUbicacionesDeUnaCuenta(cuenta);
    }

    @When("cuando agregue una nueva ubicacion nombre <nombre>, direccion <direccion>")
    public void whenCuandoAgregueUnaNuevaUbicacion(@Named("nombre") String nombre,@Named("direccion") String direccion) {
        ubicacionesDeUnaCuentaSteps.agregarUbicacion(nombre,direccion);
    }

    @When("departamento <departamento>, ciudad <ciudad>, tipo de direccion <tipo_direccion>")
    public void andCuandoAgregueDireccion(@Named("departamento") String departamento,@Named("ciudad") String ciudad,@Named("tipo_direccion") String tipoDireccion) {
        ubicacionesDeUnaCuentaSteps.agregarDireccion(departamento,ciudad,tipoDireccion);
    }

    @Then("debo poder ver el tipo de vivienda en el detalle de la ubicacion")
    public void thenDeboPoderVerElTipoDeVivienda() {
        ubicacionesDeUnaCuentaSteps.verificarTipoDeDireccion();
    }

}
