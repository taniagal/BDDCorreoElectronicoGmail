package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevoContactoSteps;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class DetallesContactoDefinitions {

    @Steps
    private SeusLoginSteps seusLogin;

    @Steps
    private DetallesContactoSteps dcs;

    @Steps
    private CrearNuevoContactoSteps ncs;

    /**
     * Escenario 1
     */

    @Given("Se tiene y se ha consultado la informacion detallada de un contacto tipo persona natural")
    public void guivenPersonaNatural(){}

    @When("quiera ver informacion detallada del contacto  con nombre <primer_nombre> y con apellido <primer_apellido>")
    public void whenConsultarDetallePersonaNatural(@Named("primer_nombre") String primerNombre, @Named("primer_apellido") String primerApellido) {
        dcs.abrirDetallesContactoPersona(primerNombre,primerApellido);
    }

    @Then("se debe ver minimo la siguiente informacion: Primer nombre, Segundo nombre, Primer apellido, Segundo apellido,\r\nTipo de documento, Numero de documento, Sexo,Fecha de nacimiento, Fecha de fallecimiento, Causa de fallecimiento,\r\nProfesion, Estado civil, Tipo familia,  Telefono primario, Telefono celular y Correo electronico primario")
    public void assertConsultarDetallePersonaNatural() {
        dcs.verificarCamposPersonaNatural();
        seusLogin.close();
    }



    //------------- Escenario 2
    @Given("Se ha consultado la informacion detallada de un contacto tipo persona juridica")
    public void guivenPersonaJuridica(){}

    @When("quiera ver informacion detallada del contacto con nombre empresa <nombre_empresa>")
    public void whenConsultarDetallePersonaJuridica(@Named("nombre_empresa")String nombre_empresa) {
        dcs.abrirDetallesContactoEmpresa(nombre_empresa);
    }

    @Then("se debe ver minimo la siguiente informacion: Razon social, Nombre comercial, Tipo de documento, Numero de\n" +
            "documento, Actividad economica, Numero de empleados, Valor de activos, ventas anuales, Telefono de la oficina, Fax,\n" +
            "Correo electronico primario")
    public void assertConsultarDetallePersonaJuridica(){
        dcs.verificarCamposPersonaJuridica();
    }

}
