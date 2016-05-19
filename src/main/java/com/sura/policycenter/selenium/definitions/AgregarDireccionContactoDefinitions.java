package com.sura.policycenter.selenium.definitions;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AgregarDireccionContactoDefinitions {
    @Steps
    DetallesContactoSteps dcs;

    @Given("que ya tengo un contacto creado")
    public void givenQueYaTengoUnContactoCreado() {
        dcs.agregarDireccion();
    }

    @When("se vaya a ingresar la nueva direccion y valide los campos en pantalla")
    public void whenSeVayaAIngresarLaNuevaDirecciónYValideLosCamposEnPantalla() {
        dcs.validarDatosPatalla();
    }

    @When("valide la informacion en los campos")
    public void whenValideLaInformaciónEnLosCampos() {
        dcs.validarCampos();
    }

    @When("se actualiza el contacto")
    public void actualizarContacto(){
        dcs.actualizarContacto();
    }

    @Then("en la lista de direcciones agregadas se debe ver la nueva direccion <tipoDireccion>")
    public void assertDireccion(@Named("tipoDireccion") String tipoDireccion){
        dcs.validarDireccion(tipoDireccion);
    }
}
