package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class AgregarDireccionContactoDefinitions {
    @Steps
    private DetallesContactoSteps dcs;

    @Given("que ya tengo un contacto creado")
    public void givenQueYaTengoUnContactoCreado() {
        dcs.agregarDireccion();
    }

    @When("se vaya a ingresar la nueva direccion y valide los campos en pantalla")
    public void whenSeVayaAIngresarLaNuevaDireccionYValideLosCamposEnPantalla() {
        dcs.validarDatosPatalla();
    }

    @SuppressWarnings("EmptyMethod")
    @When("valide la informaci\u00F3n en los campos")
    public void whenValideLaInformacionEnLosCampos() {
        //dcs.validarCampos();
    }
}
