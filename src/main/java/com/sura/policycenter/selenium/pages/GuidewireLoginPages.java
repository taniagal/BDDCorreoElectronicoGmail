package com.sura.policycenter.selenium.pages;

import com.google.common.base.Function;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
public class GuidewireLoginPages extends PageObject {
    public static final String TITULO_PAGINA_PPL_DE_ACCESO = ".//span[@id='DesktopActivities:DesktopActivitiesScreen:0']";
    public static final String TXT_USUARIO = ".//input[@name='Login:LoginScreen:LoginDV:username']";
    public static final String TXT_CONTRASENIA = ".//input[@name='Login:LoginScreen:LoginDV:password']";
    public static final String BTN_LOGIN = ".//span[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']";



    @WhenPageOpens
    public void accionesPreviasEnLaCargaDeLaPagina() {
        getDriver().manage().window().maximize();

    }

    public void clicBoton(){
        findBy(BTN_LOGIN).then().click();
    }

    public void digitar(String elemento, String valor){
        enter(valor).into($(elemento ));
        esperarAQueDigite(elemento, valor);
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

