package com.sura.policycenter.selenium.definitions;

import com.sura.commons.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

@SuppressWarnings("WeakerAccess")
public class DireccionPrincipalDeUnContactoDefinitions {
    @Steps
    DetallesContactoSteps detallesContactoSteps;

    @Steps
    SeusLoginSteps seusLoginSteps;

    @When("se vaya a ingresar la nueva direccion y valide los campos en pantalla")
    public void irADirecciones() {
        detallesContactoSteps.ir_a_direcciones();
        detallesContactoSteps.validar_datos_patalla();
    }

    @When("valide la informacion en los campos")
    public void validarCampos() {
        detallesContactoSteps.validar_campos();
    }

    @When("ingrese los datos de la direccion: $datos")
    public void agregarDireccion(ExamplesTable datos){
        detallesContactoSteps.agregar_direccion(datos);
    }

    @When("se actualiza el contacto")
    public void actualizarContacto(){
        detallesContactoSteps.actualizar_contacto();
    }

    @When("agrego fila de direccion")
    public void direccionNueva(){
        detallesContactoSteps.agregar_nueva_direccion();
    }

    @Then("en la lista de direcciones agregadas se debe ver la nueva direccion estandarizada")
    public void verificarDireccion(){
        detallesContactoSteps.validar_direccion();
    }

    @Then("el sistema me debe impedir la repeticion del tipo de direccion y mostrar el mensaje <mensaje>")
    public void verificarRepeticionTipoDirreccion (@Named("mensaje") String mensaje){
        detallesContactoSteps.validar_mensaje(mensaje);
        seusLoginSteps.close();
    }

}
