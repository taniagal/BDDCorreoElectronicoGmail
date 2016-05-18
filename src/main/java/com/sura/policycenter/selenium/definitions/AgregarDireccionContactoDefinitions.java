package com.sura.policycenter.selenium.definitions;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
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

    @When("valide la informaci\u00F3n en los campos")
    public void whenValideLaInformaciónEnLosCampos() {
        //dcs.validarCampos();
    }
}
