package com.sura.guidewire.policycenter.util;

import com.google.common.base.Function;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


public class Commons extends PageObject {
    private final Actions actions = new Actions(getDriver());
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    protected static final int WAIT_TIME_2000 = 2000;
    protected static final int TIEMPO_ESPERA_2S = 2000;

    public Commons(WebDriver driver) {
        super(driver);
    }

    public Actions deployMenu(WebElementFacade menu) {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(menu).click();
        waitUntil(3000);
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(ExpectedConditions.elementToBeClickable(menu));
        menu.click();
        waitUntil(500);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        return actions;
    }

    public void selectItem(WebElementFacade element, String option){
        waitFor(ExpectedConditions.elementToBeClickable(element)).shouldBeDisplayed();
        element.click();
        waitUntil(200);
        element.sendKeys(option);
        element.sendKeys(Keys.ENTER);
    }


    public static void waitUntil(int millis) {
        Integer i = 0;
        Wait<Integer> wait = new FluentWait<Integer>(i).withTimeout(millis,
                TimeUnit.MILLISECONDS).pollingEvery(millis,
                TimeUnit.MILLISECONDS);
        try {
            wait.until(new Function<Integer, Boolean>() {
                public Boolean apply(Integer i) {
                    return false;
                }
            });
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException in "+e);
        }
    }


    public void verificarMensaje(WebElementFacade divMensaje, String mensaje){
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(divMensaje).shouldContainText(mensaje);
        MatcherAssert.assertThat("Falló el mensaje de validacion '"+mensaje+"'", divMensaje.containsText(mensaje));
    }


    public void verificarMensajes(WebElementFacade divMensaje,ExamplesTable mensajes) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(divMensaje).shouldBePresent();
        for (Map<String, String> mensaje : mensajes.getRows()) {
            MatcherAssert.assertThat("Error: en la validacion del mensaje " + mensaje.get("mensaje"), divMensaje.containsText(mensaje.get("mensaje")));
        }
    }


    public List<WebElementFacade> getLista(String locator) {
        return withTimeoutOf(28,TimeUnit.SECONDS).findAll(locator);
    }


    public WebElementFacade esperarElemento(final String xpath) {
        Wait<WebDriver> espera = new FluentWait<WebDriver>(getDriver())
                .withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        return espera.until(new Function<WebDriver, WebElementFacade>() {
            public WebElementFacade apply(WebDriver driver) {
                return findBy(xpath);
            }
        });
    }


    public void ingresarDato(WebElementFacade elemento, String dato){
        do {
            waitFor(elemento).waitUntilPresent();
            elemento.clear();
            waitUntil(500);
            waitFor(elemento).shouldContainText("");
            elemento.sendKeys(dato);
        }while (!elemento.getValue().equals(dato));
    }

    public void waitForComboValue(WebElementFacade element, String value ){
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElementValue(element,value));
        waitUntil(2000);
    }

    /**
     * Crea numero de cedula
     * @return numero de cedula de 8 digitos
     */
    public String cedulaRandom() {
        int cedula = (int) Math.floor(Math.random() * (10000000 - 99999999) + 99999999);
        return Integer.toString(cedula);
    }

    /**
     * Crea un numero de nit
     * @return numero de nit de 9 digitos
     */
    public String nitRandom() {
        int nit = (int) Math.floor(Math.random() * (900000000 - 999999999) + 999999999);
        return Integer.toString(nit);
    }
}
