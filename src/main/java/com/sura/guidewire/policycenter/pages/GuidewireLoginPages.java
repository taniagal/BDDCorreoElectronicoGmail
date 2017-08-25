package com.sura.guidewire.policycenter.pages;

import com.google.common.base.Function;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;


@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
//@DefaultUrl("http://dllocoreseguros.suramericana.com:7003/pc/PolicyCenter.do")
public class GuidewireLoginPages extends PageObject implements Serializable{

    private static final long serialVersionUID = 1L;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    public static final String TITULO_PAGINA_PPL_DE_ACCESO = ".//span[@id='DesktopActivities:DesktopActivitiesScreen:0']";
    public static final String TXT_USUARIO_SEUS = "//input[@placeholder='Usuario']";
    public static final String TXT_USUARIO = "//input[@id='Login:LoginScreen:LoginDV:username-inputEl']";
    public static final String TXT_CONTRASENIA_SEUS = "//input[@placeholder='Contraseña']";
    public static final String TXT_CONTRASENIA = "//input[@id='Login:LoginScreen:LoginDV:password-inputEl']";
    public static final String CBO_PAIS = ".//*[@id='country']";
    public static final String BTN_LOGIN_SEUS = "//input[@type='submit']";
    public static final String BTN_LOGIN = "//span[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']";



    @WhenPageOpens
    public void accionesPreviasEnLaCargaDeLaPagina() {
        getDriver().manage().window().maximize();

    }

    public void clicBotonLogIn(){
        findBy(BTN_LOGIN).then().click();
    }

    public void digitar(String elemento, String valor){
        enter(valor).into($(elemento ));
        esperarAQueDigite(elemento, valor);
    }

    public WebElementFacade elemento(String xpath) {
        WebElementFacade elemento = null;

        try {
            waitFor((WebElementFacade) $(xpath)).shouldBeVisible();
            elemento = element((WebElementFacade) $(xpath));

        } catch (NoSuchElementException e) {
            LOGGER.error(" \nERROR050: Elemento de NuevaCotizacionPage no encontrado \nElemento: " + xpath + "\nTRACE: \n" + e);
        } catch (StaleElementReferenceException sere){
            LOGGER.error(" \nERROR051: Elemento de NuevaCotizacionPage no existe en el DOM \nElemento: " + xpath + "\nTRACE: \n" + sere);
        } catch (Exception e) {
            LOGGER.error("\nERROR: Error desconocido en: NuevaCotizacionPage.elemento \nElemento: " + xpath + "\nTRACE: \n" + e);
        }

        return elemento;
    }

    public String obtenerTituloPaginaPplAcceso(){
        return $(TITULO_PAGINA_PPL_DE_ACCESO).getText();
    }

    private void esperarAQueDigite(String elemento, String valor) {
        waitForCondition()
                .withTimeout(5, TimeUnit.SECONDS)
                .pollingEvery(250,TimeUnit.MILLISECONDS)
                .until(valorDeEntradaActualizadoA(elemento, valor));
    }

    private Function<? super WebDriver, Boolean> valorDeEntradaActualizadoA(final String elemento, final String valor) {
        return new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return $(elemento).getValue().equalsIgnoreCase(valor);
            }
        };
    }

}