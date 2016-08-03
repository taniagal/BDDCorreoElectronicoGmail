package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;


public class ValidacionesCambioDePolizaVehiculosPage extends PageObject{

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ValidacionesCambioDePolizaVehiculosPage.class);
    @FindBy(xpath = ".//td/div/div/div/a[6]/span/span/span/span")
    private WebElementFacade botonEmitirPoliza;
    @FindBy(xpath = ".//div[5]/div[3]/div/div/a/span/span/span")
    private WebElementFacade botonAceptarEmitirPoliza;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade mensajesValidaciones;

    public ValidacionesCambioDePolizaVehiculosPage(WebDriver driver){
        super(driver);
    }

    public void emitirPoliza(){
        //waitFor(botonEmitirPoliza).shouldBeVisible();
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonEmitirPoliza).shouldBePresent();
        botonEmitirPoliza.click();
        waitForTextToAppear("¿Está seguro de que desea emitir esta póliza?");
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonAceptarEmitirPoliza).shouldBePresent();
        botonAceptarEmitirPoliza.click();
    }

    public void validarMensaje(String mensaje){
        String validacion = null;
        try{
            MatcherAssert.assertThat(mensajesValidaciones.getText(), Matchers.containsString(mensaje));
        }catch(Exception e){
            LOGGER.error(validacion, e);
        }
    }
}
