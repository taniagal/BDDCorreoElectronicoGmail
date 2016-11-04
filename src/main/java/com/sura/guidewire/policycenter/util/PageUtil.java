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
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


public class PageUtil extends PageObject {
    protected final Actions actions = new Actions(getDriver());
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    protected static final int WAIT_TIME_5000 = 5000;
    protected static final int WAIT_TIME_3500 = 3500;
    protected static final int WAIT_TIME_3000 = 3000;
    protected static final int WAIT_TIME_2500 = 2500;
    protected static final int WAIT_TIME_2000 = 2000;
    protected static final int WAIT_TIME_1500 = 1500;
    protected static final int WAIT_TIME_1000 = 1000;
    protected static final int WAIT_TIME_800 = 800;
    protected static final int WAIT_TIME_500 = 500;
    protected static final int WAIT_TIME_300 = 300;
    protected static final int WAIT_TIME_200 = 200;
    protected static final int WAIT_TIME_28 = 28;
    protected static final int WAIT_TIME_20 = 20;
    protected static final int WAIT_TIME_15 = 15;
    protected static final int WAIT_TIME_10 = 10;
    protected static final int WAIT_TIME_7 = 7;
    protected static final int WAIT_TIME_5 = 5;
    protected static final int WAIT_TIME_4 = 4;
    protected static final int WAIT_TIME_3 = 3;
    protected static final int WAIT_TIME_2 = 2;
    protected static final int WAIT_TIME_1 = 1;


    public PageUtil(WebDriver driver) {
        super(driver);
    }

    public Actions deployMenu(WebElementFacade menu) {
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(menu).click();
        waitUntil(WAIT_TIME_3000);
        withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS).waitFor(ExpectedConditions.elementToBeClickable(menu));
        menu.click();
        waitUntil(WAIT_TIME_500);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        return actions;
    }

    public void selectItem(WebElementFacade element, String option) {
        waitFor(ExpectedConditions.elementToBeClickable(element)).shouldBeDisplayed();
        element.click();
        waitUntil(WAIT_TIME_200);
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
            LOGGER.info("TimeoutException in " + e);
        }
    }


    public void verificarMensaje(WebElementFacade divMensaje, String mensaje) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(divMensaje).shouldContainText(mensaje);
        MatcherAssert.assertThat("Falló el mensaje de validacion '" + mensaje + "'", divMensaje.containsText(mensaje));
    }


    public void verificarMensajes(WebElementFacade divMensaje, ExamplesTable mensajes) {
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(divMensaje).shouldBePresent();
        for (Map<String, String> mensaje : mensajes.getRows()) {
            MatcherAssert.assertThat("Error: en la validacion del mensaje " + mensaje.get("mensaje"), divMensaje.containsText(mensaje.get("mensaje")));
        }
    }


    public List<WebElementFacade> getLista(String locator) {
        return withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).findAll(locator);
    }


    public WebElementFacade esperarElemento(final String xpath) {
        Wait<WebDriver> espera = new FluentWait<WebDriver>(getDriver())
                .withTimeout(WAIT_TIME_20, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        return espera.until(new Function<WebDriver, WebElementFacade>() {
            public WebElementFacade apply(WebDriver driver) {
                return findBy(xpath);
            }
        });
    }


    public void ingresarDato(WebElementFacade elemento, String dato) {
        do {
            waitFor(elemento).waitUntilPresent();
            elemento.clear();
            waitUntil(WAIT_TIME_500);
            waitFor(elemento).shouldContainText("");
            elemento.sendKeys(dato);
        } while (!elemento.getValue().equals(dato));
    }

    public void waitForComboValue(WebElementFacade element, String value) {
        try {
            withTimeoutOf(WAIT_TIME_5, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElementValue(element, value));
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisible at PageUtil 129 " + e);
        }
        waitUntil(WAIT_TIME_2000);
    }

    /**
     * Crea numero de cedula
     *
     * @return numero de cedula de 8 digitos
     */
    public String cedulaRandom() {
        int cedula = (int) Math.floor(Math.random() * (10000000 - 99999999) + 99999999);
        return Integer.toString(cedula);
    }

    /**
     * Crea un numero de nit
     *
     * @return numero de nit de 9 digitos
     */
    public String nitRandom() {
        int nit = (int) Math.floor(Math.random() * (900000000 - 999999999) + 999999999);
        return Integer.toString(nit);
    }


    public StringBuilder concatenarElementoDiferente(String valorElemento, String campo, String elemento, StringBuilder valor) {
        if (!valorElemento.equals(campo)) {
            valor.append(elemento);
        }
        return valor;
    }


    public StringBuilder concatenarElementoNoPresente(WebElementFacade campo, String elemento, StringBuilder notPresent) {
        if (!campo.isPresent()) {
            notPresent.append(elemento);
        }
        return notPresent;
    }
}
