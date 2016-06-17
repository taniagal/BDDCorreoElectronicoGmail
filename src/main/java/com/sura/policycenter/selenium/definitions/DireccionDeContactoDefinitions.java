package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class DireccionDeContactoDefinitions {
    @Steps
    DetallesContactoSteps detallesContactoSteps;

    @Steps
    SeusLoginSteps seusLoginSteps;

    @When("se vaya a ingresar la nueva direccion y valide los campos en pantalla")
    public void whenSeVayaAIngresarLaNuevaDireccionYValideLosCamposEnPantalla() {
        detallesContactoSteps.ir_a_direcciones();
        detallesContactoSteps.validar_datos_patalla();
    }

    @When("valide la informacion en los campos")
    public void whenValideLaInformacionEnLosCampos() {
        detallesContactoSteps.validar_campos();
    }

    @When("se actualiza el contacto")
    public void actualizarContacto(){
        detallesContactoSteps.actualizar_contacto();
    }

    @When("agrego fila de direccion")
    public void direccionNueva(){
        detallesContactoSteps.agregar_nueva_direccion();
    }

    @Then("en la lista de direcciones agregadas se debe ver la nueva direccion <tipoDireccion>")
    public void assertDireccion(@Named("tipoDireccion") String tipoDireccion){
        detallesContactoSteps.validar_direccion(tipoDireccion);
        seusLoginSteps.close();
    }

    @Then("el sistema me debe impedir la repeticion del tipo de direccion y mostrar el mensaje <mensaje>")
    public void assertRepeticionTipoDirreccion (@Named("mensaje") String mensaje){
        detallesContactoSteps.validar_mensaje(mensaje);
        seusLoginSteps.close();
    }

}
