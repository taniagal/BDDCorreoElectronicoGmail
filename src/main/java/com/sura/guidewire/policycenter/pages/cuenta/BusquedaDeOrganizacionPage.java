package com.sura.guidewire.policycenter.pages.cuenta;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class BusquedaDeOrganizacionPage extends PageObject {

    @FindBy(xpath = ".//*[@id='OrganizationSearchPage:OrganizationSearchScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade txtRazonSocial;
    @FindBy(xpath = ".//*[@id='OrganizationSearchPage:OrganizationSearchScreen:OrganizationSearchResultsLV:0:Name']")
    private WebElementFacade linkRazonSocial;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtBuscar;

    public BusquedaDeOrganizacionPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarRazonSocial(String razonSocial) {
        txtRazonSocial.clear();
        txtRazonSocial.sendKeys(razonSocial);
        txtRazonSocial.sendKeys(Keys.ENTER);
    }

    public void validarOrganizacion(String nomOrganizacion) {
        linkRazonSocial.waitUntilClickable();
        MatcherAssert.assertThat(linkRazonSocial.getText(), Matchers.containsString(nomOrganizacion));
    }

    public void irABuscarOrganizaciones() {
        campoTxtBuscar.sendKeys("Admin");
        campoTxtBuscar.sendKeys(Keys.ENTER);
        findBy(".//*[@id='Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_OrganizationSearchPage']/div").waitUntilPresent().click();
        waitForTextToAppear("Razón social");
    }
}
