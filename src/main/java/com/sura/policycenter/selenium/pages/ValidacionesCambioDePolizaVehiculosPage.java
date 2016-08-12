package com.sura.policycenter.selenium.pages;


import com.sura.commons.selenium.Commons;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;



public class ValidacionesCambioDePolizaVehiculosPage extends PageObject{
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
        withTimeoutOf(22, TimeUnit.SECONDS).waitFor(botonEmitirPoliza).shouldBePresent();
        Commons commons = new Commons(getDriver());
        commons.waitUntil(3000);
        botonEmitirPoliza.click();
        waitForTextToAppear("¿Está seguro de que desea emitir esta póliza?");
        withTimeoutOf(21, TimeUnit.SECONDS).waitFor(botonAceptarEmitirPoliza).shouldBePresent();
        botonAceptarEmitirPoliza.click();
        withTimeoutOf(28,TimeUnit.SECONDS).waitFor(botonAceptarEmitirPoliza).waitUntilNotVisible();
    }

    public void validarMensaje(String mensaje){
        MatcherAssert.assertThat(mensajesValidaciones.getText(), Matchers.containsString(mensaje));
    }
}
