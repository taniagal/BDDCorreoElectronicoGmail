package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class CambioEnExpedicionDePolizaPage extends PageObject{


    public CambioEnExpedicionDePolizaPage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath=".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:JobWizardToolbarButtonSet:BindPolicyChange']")
    WebElementFacade botonExpedirPoliza;

    @FindBy(xpath = ".//a[contains(.,'Aceptar')]")
    WebElementFacade botonAceptarMensaje;

    @FindBy(xpath = ".//label[@id='JobComplete:JobCompleteScreen:Message']")
    WebElementFacade campoInformacionCambio;

    @FindBy(xpath = ".//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    WebElementFacade campoVerPoliza;

    @FindBy(xpath = ".//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ReturnToDesktop-inputEl']")
    WebElementFacade campoIrAlEscritorio;


    public void expedirPoliza() {
        waitFor(ExpectedConditions.visibilityOf(botonExpedirPoliza));
        waitFor(ExpectedConditions.elementToBeClickable(botonExpedirPoliza));
        botonExpedirPoliza.click();
    }

    public void aceptarExpedirPoliza() {
        waitFor(ExpectedConditions.visibilityOf(botonAceptarMensaje));
        waitFor(ExpectedConditions.elementToBeClickable(botonAceptarMensaje));
        botonAceptarMensaje.click();
    }

    public void validarResumenDeLaPolizaExpedida(String infoCambio, String infoPoliza, String escritorio) {
        withTimeoutOf(8, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOf(campoInformacionCambio));
        MatcherAssert.assertThat(campoInformacionCambio.getText(), Is.is(Matchers.equalTo(infoCambio)));
        MatcherAssert.assertThat(campoVerPoliza.getText(), Is.is(Matchers.containsString(infoPoliza)));
        MatcherAssert.assertThat(campoIrAlEscritorio.getText(), Is.is(Matchers.equalTo(escritorio)));
    }


}
