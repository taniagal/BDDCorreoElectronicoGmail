package com.sura.policycenter.selenium.definitions;


import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.ContactAssociatedAccountSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

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

    @When("consulte las cuentas asociadas al contacto <nombre> <apellido> y este no tenga alguna")
    public void whenConsulteLasCuentasAsociadasAlContactonombreapellidoYEsteNoTengaAlguna(
        @Named("nombre") String nombre,
        @Named("apellido") String apellido) {
        contactSteps.searchContact(nombre, apellido);
    }

    @Then("se muestra el mensaje informativo <mensaje>")
    public void thenSeMuestraElMensajeInformativomensaje(
            @Named("mensaje") String mensaje) {
        contactSteps.validarMensajeCuenta(mensaje);
    }
}
