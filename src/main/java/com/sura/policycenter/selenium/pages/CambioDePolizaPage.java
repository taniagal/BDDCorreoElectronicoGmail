package com.sura.policycenter.selenium.pages;


import com.sura.commons.selenium.Commons;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;




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




    public CambioDePolizaPage(WebDriver driver) {
        super(driver);
    }


    public void irAMenuAcciones() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(menuAcciones).waitUntilPresent();
        menuAcciones.click();
    }

    public void cambiarPoliza() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(opcionCambiarPoliza).waitUntilPresent();
        opcionCambiarPoliza.click();
    }

    public void esReaseguroEspecial(String reaseguro) {
        MatcherAssert.assertThat(reaseguroEspecial.getText(), Is.is(Matchers.equalTo(reaseguro)));
    }

    public void validarMensaje(String mensaje) {
        boolean validacionMensaje =  ("").equals(mensaje)?true: mensajeAdvertencia.getText().contains(mensaje);
        MatcherAssert.assertThat(validacionMensaje,Is.is(Matchers.equalTo(true)));
    }

    public void seleccionarInformacionPoliza() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(informacionpoliza).waitUntilPresent();
        informacionpoliza.click();
    }
}
