package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.ContactAssociatedAccount;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactAssociatedAccountSteps extends ScenarioSteps {

    public ContactAssociatedAccountSteps(Pages pages) {
        super(pages);
    }
    BusquedaContactoPage busquedaPage = new BusquedaContactoPage(getDriver());
    ContactAssociatedAccount associatedAccountPage = new ContactAssociatedAccount(getDriver());

    @Step
    public void searchContact() {
        busquedaPage.buscarContacto();
        busquedaPage.buscarContactoPersona();
    }

    @Step
    public void searchAssociatedAccounts(String nombre, String direccion, String telefono, String email, String rol) {
        associatedAccountPage.assertCamposLista(nombre, direccion, telefono, email, rol);
    }
}
