package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SeleccionDeOfertasPage extends PageObject {

    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']")
    private WebElementFacade txtNumeroCuenta;

    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission']")
    private WebElementFacade btnLineaAutosPersonal;

    @FindBy(xpath=".//*[@id='SubmissionWizard:Offering']/div")
    private WebElementFacade mnuOfertas;

    public SeleccionDeOfertasPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarDatosInicialesCotizacion(String cuenta) {
        waitFor(txtNumeroCuenta);
        txtNumeroCuenta.sendKeys(cuenta);
        txtNumeroCuenta.sendKeys(Keys.TAB);
        waitForTextToAppear("YURLEDYS");
    }

    public void seleccionarLineaPA() {
        btnLineaAutosPersonal.click();
        waitABit(1000);
    }

    public void validarVisibilidadMenu(String menu) {
        MatcherAssert.assertThat(mnuOfertas.isVisible(), Is.is(Matchers.equalTo(false)));
    }
}
