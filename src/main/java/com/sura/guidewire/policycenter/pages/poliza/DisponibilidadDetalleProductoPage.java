package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DisponibilidadDetalleProductoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions']")
    private WebElementFacade btnAccionesCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission']")
    private WebElementFacade opcionNuevoEnvio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']")
    private WebElementFacade opcionVerInformacionPoliza;

    public DisponibilidadDetalleProductoPage(WebDriver driver) {
        super(driver);
    }

    public void accionarNuevoEnvio() {
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(btnAccionesCuenta).waitUntilPresent().click();
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(opcionNuevoEnvio).waitUntilPresent().click();
    }

    public void verInformacionDePoliza() {
        esperarYClickearBoton(opcionVerInformacionPoliza);
        esperarHasta(TIEMPO_5000);
    }
}
