package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SeleccionDeOfertasPage extends PageObject {

    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']")
    private WebElementFacade txtNumeroCuenta;

    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:Producer-inputEl']")
    private WebElementFacade txtOrganizacion;

    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl']")
    private WebElementFacade txtCodigoAgente;

    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission']")
    private WebElementFacade btnLineaAutosPersonal;

    @FindBy(xpath=".//*[@id='SubmissionWizard:Offering']/div")
    private WebElementFacade mnuOfertas;

    public SeleccionDeOfertasPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarDatosInicialesCotizacion(String cuenta, String organizacion, String agente) {
        waitABit(1000);
        txtNumeroCuenta.sendKeys(cuenta);
        txtNumeroCuenta.sendKeys(Keys.TAB);
        waitABit(1000);
        txtOrganizacion.sendKeys(organizacion);
        txtOrganizacion.sendKeys(Keys.TAB);
        waitABit(1000);
        txtCodigoAgente.clear();
        txtCodigoAgente.sendKeys(agente);
        txtCodigoAgente.sendKeys(Keys.TAB);
        waitABit(1000);
    }

    public void seleccionarLineaPA() {
        btnLineaAutosPersonal.click();
        waitABit(1000);
    }

    public void validarVisibilidadMenu(String menu) {
        mnuOfertas.shouldNotBeVisible();
    }
}
