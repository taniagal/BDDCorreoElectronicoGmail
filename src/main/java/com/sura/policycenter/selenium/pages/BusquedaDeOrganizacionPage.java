package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class BusquedaDeOrganizacionPage extends PageObject {

    @FindBy(xpath=".//*[@id='OrganizationSearchPage:OrganizationSearchScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade txtRazonSocial;
    @FindBy(xpath=".//*[@id='OrganizationSearchPage:OrganizationSearchScreen:OrganizationSearchResultsLV:0:Name']")
    private WebElementFacade linkRazonSocial;

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
}
