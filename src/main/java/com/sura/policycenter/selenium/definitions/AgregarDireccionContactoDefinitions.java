package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class AgregarDireccionContactoDefinitions {
    @Steps
    private DetallesContactoSteps detallesContactoSteps;

    @Given("que ya tengo un contacto creado")
    public void givenQueYaTengoUnContactoCreado() {
        detallesContactoSteps.agregarDireccion();
    }

    @When("se vaya a ingresar la nueva direccion y valide los campos en pantalla")
    public void whenSeVayaAIngresarLaNuevaDireccionYValideLosCamposEnPantalla() {
        detallesContactoSteps.validarDatosPatalla();
    }

    @When("valide la informacion en los campos")
    public void whenValideLaInformacionEnLosCampos() {
        detallesContactoSteps.validarCampos();
    }

    @When("se actualiza el contacto")
    public void actualizarContacto(){
        detallesContactoSteps.actualizarContacto();
    }

    @When("agrego fila de direccion")
    public void direccionNueva(){
        detallesContactoSteps.agregarNuevaDireccion();
    }

    @Then("en la lista de direcciones agregadas se debe ver la nueva direccion <tipoDireccion>")
    public void assertDireccion(@Named("tipoDireccion") String tipoDireccion){
        detallesContactoSteps.validarDireccion(tipoDireccion);
    }

    @Then("el sistema me debe impedir la repeticion del tipo de direccion y mostrar el mensaje <mensaje>")
    public void assertRepeticionTipoDirreccion (@Named("mensaje") String mensaje){
        detallesContactoSteps.validarMensaje(mensaje);
    }

}
