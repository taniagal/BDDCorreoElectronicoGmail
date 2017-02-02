package com.sura.guidewire.policycenter.resources;

import com.google.common.base.Function;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class PageUtil extends PageObject {
    protected static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    protected static final int TIEMPO_30000 = 30000;
    protected static final int TIEMPO_5000 = 5000;
    protected static final int TIEMPO_3500 = 3500;
    protected static final int TIEMPO_3000 = 3000;
    protected static final int TIEMPO_2500 = 2500;
    protected static final int TIEMPO_2000 = 2000;
    protected static final int TIEMPO_1500 = 1500;
    protected static final int TIEMPO_1000 = 1000;
    protected static final int TIEMPO_800 = 800;
    protected static final int TIEMPO_500 = 500;
    protected static final int TIEMPO_300 = 300;
    protected static final int TIEMPO_200 = 200;
    protected static final int TIEMPO_28 = 28;
    protected static final int TIEMPO_30 = 30;
    protected static final int TIEMPO_20 = 20;
    protected static final int TIEMPO_15 = 15;
    protected static final int TIEMPO_10 = 10;
    protected static final int TIEMPO_7 = 7;
    protected static final int TIEMPO_5 = 5;
    protected static final int TIEMPO_4 = 4;
    protected static final int TIEMPO_3 = 3;
    protected static final int TIEMPO_2 = 2;
    protected static final int TIEMPO_1 = 1;
    protected static final int CONSTANTE_MAXIMO_EJECUCIONES = 120;
    protected static final int CONSTANTE_CUENTA_EJECUCIONES = 0;
    protected static final int CONSTANTE_12 = 12;
    protected static String numeroCotizacionNoTomar;
    protected static String numeroCotizacionDeclinar;
    protected Actions actions = new Actions(getDriver());


    public PageUtil(WebDriver driver) {
        super(driver);
    }

    public Actions desplegarMenu(WebElementFacade menu) {
        actions = new Actions(getDriver());
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(menu).waitUntilPresent();
        clickearElemento(menu);
        esperarHasta(TIEMPO_3000);
        clickearElemento(menu);
        esperarHasta(TIEMPO_800);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        return actions;
    }

    public void seleccionarItem(WebElementFacade element, String option) {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(element)).shouldBeDisplayed();
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisibleException " + e);
            esperarHasta(TIEMPO_2000);
            waitFor(ExpectedConditions.elementToBeClickable(element)).shouldBeDisplayed();
        } catch (StaleElementReferenceException f) {
            LOGGER.info("StaleElementReferenceException " + f);
            esperarHasta(TIEMPO_2000);
        }
        clickearElemento(element);
        esperarHasta(TIEMPO_300);
        try {
            element.clear();
        } catch (StaleElementReferenceException g) {
            LOGGER.info("StaleElementReferenceException " + g);
            esperarHasta(TIEMPO_2000);
            element.clear();
        }
        element.sendKeys(option);
        element.sendKeys(Keys.ENTER);
    }

    public static void esperarHasta(int millis) {
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
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(divMensaje).shouldContainText(mensaje);
        MatcherAssert.assertThat("Falló el mensaje de validacion, expected: " + mensaje + " but was: "
                + divMensaje.getText(), divMensaje.containsText(mensaje));
    }

    public void verificarMensajes(WebElementFacade divMensaje, ExamplesTable mensajes) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(divMensaje).shouldBePresent();
        for (Map<String, String> mensaje : mensajes.getRows()) {
            MatcherAssert.assertThat("Error: en la validacion del mensaje, expected: " + mensaje.get("mensaje")
                    + " but was: " + divMensaje.getText(), divMensaje.containsText(mensaje.get("mensaje")));
        }
    }

    public List<WebElementFacade> getLista(String locator) {
        return withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).findAll(locator);
    }

    public WebElementFacade esperarElemento(final String xpath) {
        Wait<WebDriver> espera = new FluentWait<WebDriver>(getDriver())
                .withTimeout(TIEMPO_20, TimeUnit.SECONDS)
                .pollingEvery(TIEMPO_5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        return espera.until(new Function<WebDriver, WebElementFacade>() {
            public WebElementFacade apply(WebDriver driver) {
                return findBy(xpath);
            }
        });
    }

    public void ingresarDato(WebElementFacade elemento, String dato) {
        do {
            try {
                waitFor(elemento).waitUntilPresent();
            } catch (StaleElementReferenceException e) {
                LOGGER.info("StaleElementReferenceException " + e);
                esperarHasta(TIEMPO_2000);
                waitFor(elemento).waitUntilPresent();
            }
            try {
                elemento.clear();
            } catch (ElementNotVisibleException e) {
                LOGGER.info("ElementNotVisibleException " + e);
                esperarHasta(TIEMPO_2000);
                elemento.clear();
            } catch (StaleElementReferenceException f) {
                LOGGER.info("StaleElementReferenceException " + f);
                esperarHasta(TIEMPO_2000);
                elemento.clear();
            }
            esperarHasta(TIEMPO_500);
            waitFor(elemento).shouldContainText("");
            elemento.sendKeys(dato);
        } while (!elemento.getValue().equals(dato));
    }

    public void esperarPorValor(WebElementFacade element, String value) {
        try {
            withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElementValue(element, value));
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisible at PageUtil 129 " + e);
        }
        esperarHasta(TIEMPO_1000);
    }

    public void desplegarElementoDeLista(WebElementFacade elementoDeLaLista) {
        esperarHasta(TIEMPO_3000);
        elementoDeLaLista.waitUntilPresent().click();
    }

    /*
    * Implementacion espera de click, el numero de intentos se configura en la variable CONSTANTE_MAXIMO_EJECUCIONES
    */
    public void esperarYClickearBoton(WebElementFacade elemento) {
        boolean ejecuto = false;
        int maximoEjecuciones = CONSTANTE_MAXIMO_EJECUCIONES;
        int ejecuciones = CONSTANTE_CUENTA_EJECUCIONES;
        while (ejecuciones < maximoEjecuciones && !ejecuto) {
            esperarHasta(TIEMPO_1000);
            try {
                clickearElemento(elemento);
                ejecuto = true;
            } catch (Exception ex) {
                LOGGER.info("Exception " + ex);
            }
            ejecuciones = ejecuciones + 1;
        }
        if (!ejecuto) {
            MatcherAssert.assertThat("No se pudo dar click a botón", false);
        }
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

    public void clickearElemento(WebElementFacade element) {
        for (int i = 0; i < CONSTANTE_12; i++) {
            try {
                withTimeoutOf(TIEMPO_2,TimeUnit.SECONDS).waitFor(element).click();
                break;
            } catch (WebDriverException e) {
                esperarHasta(TIEMPO_500);
                LOGGER.info("WebDriverException " + e);
                LOGGER.info("--- click " + i);
            }
        }
    }

    public void clickearElemento(WebElementFacade elemento, int veces) {
        for (int i = 0; i < veces; i++) {
            try {
                elemento.click();
                break;
            } catch (WebDriverException e) {
                esperarHasta(TIEMPO_1000);
                LOGGER.info("WebDriverException " + e);
                LOGGER.info("--- click " + i);
            }
        }
    }

    public boolean esEditable(WebElementFacade element) {
        return element.getAttribute("class").contains("x-form-text");
    }
}
