package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SeleccionDeOfertasPage extends PageUtil {

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
        waitUntil(WAIT_TIME_1000);
    }

    public void validarVisibilidadMenu() {
        MatcherAssert.assertThat(mnuOfertas.isVisible(), Is.is(Matchers.equalTo(false)));
    }
}
