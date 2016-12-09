package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;




public class CambioDePolizaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:RIPolicyFieldsInputSet:Fronting-inputEl']")
    WebElementFacade checkBoxFronting;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']")
    WebElementFacade panelMensaje;
    @FindBy(xpath = ".//span[@id='PolicyFile:PolicyFileMenuActions-btnInnerEl']")
    WebElementFacade menuAcciones;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']/div")
    WebElementFacade menuItemInformacionDePoliza;
    @FindBy(xpath = ".//label[@class='x-component g-msg-warning x-component-default']")
    WebElementFacade mensajeAdvertencia;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_PolicyInfo']")
    WebElementFacade menuItemInformacionDePolizaExp;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:ttlBar']")
    WebElementFacade lblinicioCambioPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    WebElementFacade btnInicio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:RIPolicyFieldsInputSet:reaseguroEspecial_true-inputEl']")
    WebElementFacade radioBotonReaseguroEspeciaSi;
    @FindBy(xpath = ".//*[@id='PolicyFile_PolicyInfo:PolicyFile_PolicyInfoScreen:PolicyFile_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:RIPolicyFieldsInputSet:reaseguroEspecial-inputEl']")
    WebElementFacade campoReaseguroEspecial;
    @FindBy(xpath = ".//span[contains(@id,'PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-textEl')]")
    WebElementFacade opcionCambiarPoliza;


    public CambioDePolizaPage(WebDriver driver) {
        super(driver);
    }


    public void irAMenuAcciones() {
        waitUntil(WAIT_TIME_1000);
        menuAcciones.click();
    }

    public void cambiarPoliza() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(opcionCambiarPoliza).waitUntilPresent();
        opcionCambiarPoliza.click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(lblinicioCambioPoliza).waitUntilPresent();
    }

    public void  esReaseguroEspecial(String reaseguro) {
        campoReaseguroEspecial.waitUntilPresent();
        MatcherAssert.assertThat(campoReaseguroEspecial.getText(), Is.is(Matchers.equalTo(reaseguro)));
    }

    public void validarMensaje(String mensaje) {verificarMensaje(mensajeAdvertencia,mensaje);
    }

    public void seleccionarInformacionPoliza() {
        waitFor(menuItemInformacionDePolizaExp).waitUntilPresent().click();
    }

    public void validarMensajeNoHayReaseguro() {
        MatcherAssert.assertThat("Mensaje en reaseguro NO debe ser visible", !mensajeAdvertencia.isVisible());
    }

    public void ingresarReaseguroEspecial() {
        menuItemInformacionDePoliza.waitUntilPresent();
        clickElement(menuItemInformacionDePoliza);
        radioBotonReaseguroEspeciaSi.waitUntilPresent().click();
        checkBoxFronting.waitUntilPresent().click();
        clickElement(botonSiguiente);
    }
}
