package com.sura.policycenter.selenium.definitions;


import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.ContactAssociatedAccountSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import javax.swing.*;

public class ContactAssociatedAccountDefinitions {

    @Steps
    SeusLoginSteps seusSteps;

    @Steps
    ContactAssociatedAccountSteps contactSteps;



    @Given("que me encuentro autenticado con pais <pais>, username <usr> y password <pass>")
    public void login(@Named("pais") String pais,
                      @Named("usr") String usuario,
                      @Named("pass") String password) {
        seusSteps.login(pais, usuario, password);
    }

    @Given("existe una cuenta asociada a un contacto")
    public void givenExisteUnaCuentaAsociadaAUnContacto() {
        // PENDING
    }

    @When("consulte las cuentas asociadas a un contacto")
    public void whenConsulteLasCuentasAsociadasAUnContacto() {
        contactSteps.searchContact();
    }

    @Then("se muestra la lista de cuentas asociadas con nombre: <nombre>, direccion: <direccion>, tel: <telefono>, email: <email> y rol: <rol>")
    public void searchAssociatedAccounts(@Named("nombre") String nombre,
                                         @Named("direccion") String direccion,
                                         @Named("telefono") String telefono,
                                         @Named("email") String email,
                                         @Named("rol") String rol) {
        contactSteps.searchAssociatedAccounts(nombre, direccion, telefono, email, rol);
    }
}
