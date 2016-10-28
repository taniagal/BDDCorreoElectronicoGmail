package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.util.PageUtil;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidacionesCambioDePolizaVehiculosPage extends PageUtil{
    Actions act = new Actions(getDriver());
    @FindBy(xpath = ".//td/div/div/div/a[6]/span/span/span/span")
    private WebElementFacade botonEmitirPoliza;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade mensajesValidaciones;

    public ValidacionesCambioDePolizaVehiculosPage(WebDriver driver){
        super(driver);
    }

    public void emitirPoliza(){
        withTimeoutOf(22, TimeUnit.SECONDS).waitFor(botonEmitirPoliza).shouldBePresent();
        waitUntil(WAIT_TIME_3000);
        botonEmitirPoliza.click();
        waitForTextToAppear("¿Está seguro de que desea expedir este cambio de póliza?");
        waitUntil(WAIT_TIME_1000);
        act.sendKeys(Keys.ENTER).build().perform();
        waitUntil(WAIT_TIME_1500);
    }

    public void validarMensaje(String mensaje){
        MatcherAssert.assertThat(mensajesValidaciones.getText(), Matchers.containsString(mensaje));
    }
}
