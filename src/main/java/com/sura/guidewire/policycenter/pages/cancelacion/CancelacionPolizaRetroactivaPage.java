package com.sura.guidewire.policycenter.pages.cancelacion;


import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

public class CancelacionPolizaRetroactivaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id=':TabLinkMenuButton-btnIconEl']")
    private WebElementFacade icono;
    @FindBy(xpath = ".//*[@id='TabBar:LogoutTabBarLink-textEl']")
    private WebElementFacade iconocerrar;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    private WebElementFacade btnLogIn;

    public CancelacionPolizaRetroactivaPage(WebDriver driver) {
        super(driver);
    }

    public void accesoAplicativo(String contexto) {
        esperarHasta(TIEMPO_2000);
        getDriver().navigate().to(contexto);
        setImplicitTimeout(CONSTANTE_1, TimeUnit.SECONDS);
        if (btnLogIn.isPresent()) {
            btnLogIn.click();
        }
        resetImplicitTimeout();
    }

    public void cerrarSesionClaims(){
        waitFor(icono).isPresent();
        icono.click();
        waitFor(iconocerrar).isPresent();
        iconocerrar.click();
    }
}