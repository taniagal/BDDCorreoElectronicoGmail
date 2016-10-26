package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.util.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;



public class CambioDePolizaPage extends PageObject {

    Commons commons = new Commons(getDriver());


    @FindBy(xpath = ".//span[@id='PolicyFile:PolicyFileMenuActions-btnInnerEl']")
    WebElementFacade menuAcciones;

    @FindBy(xpath = ".//span[contains(@id,'PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-textEl')]")
    WebElementFacade opcionCambiarPoliza;

    @FindBy(xpath = ".//*[@id='PolicyFile_PolicyInfo:PolicyFile_PolicyInfoScreen:PolicyFile_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:reaseguroEspecial-inputEl']")
    WebElementFacade reaseguroEspecial;

    @FindBy(xpath = ".//label[@class='x-component g-msg-warning x-component-default']")
    WebElementFacade mensajeAdvertencia;

    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_PolicyInfo']")
    WebElementFacade informacionpoliza;

    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:ttlBar']")
    WebElementFacade lblinicioCambioPoliza;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    WebElementFacade btnInicio;


    public CambioDePolizaPage(WebDriver driver) {
        super(driver);
    }


    public void irAMenuAcciones() {
        Commons.waitUntil(1000);
        menuAcciones.click();
    }

    public void cambiarPoliza() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(opcionCambiarPoliza).waitUntilPresent();
        opcionCambiarPoliza.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(lblinicioCambioPoliza).waitUntilPresent();
    }

    public void esReaseguroEspecial(String reaseguro) {
        MatcherAssert.assertThat(reaseguroEspecial.getText(), Is.is(Matchers.equalTo(reaseguro)));
    }

    public void validarMensaje(String mensaje) {
        commons.verificarMensaje(mensajeAdvertencia,mensaje);
    }

    public void seleccionarInformacionPoliza() {
        waitFor(informacionpoliza).waitUntilPresent();
        informacionpoliza.click();
    }

    public void validarMensajeNoHayReaseguro() {
        MatcherAssert.assertThat("Mensaje en reaseguro NO debe ser visible", !mensajeAdvertencia.isVisible());
    }
}