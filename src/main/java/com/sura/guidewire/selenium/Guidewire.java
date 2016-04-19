package com.sura.guidewire.selenium;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jorghome on 15/04/2016.
 */
public class Guidewire extends PageObject {

    public Guidewire(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    WebElementFacade usuario;

    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    WebElementFacade contrasena;

    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    WebElementFacade submit;

    @FindBy(xpath=".//*[@id=':TabLinkMenuButton-btnIconEl']")
    WebElementFacade btnConfig;

    @FindBy(xpath=".//*[@id='TabBar:LogoutTabBarLink-itemEl']")
    WebElementFacade btnLogout;

    @FindBy(xpath=".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnLogout2;

    // TODO: 19/04/2016 Revision escritura de excepciones en log 
    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        getDriver().manage().window().maximize();
        try {
            element(usuario).waitUntilVisible();
            element(contrasena).waitUntilVisible();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void login(String user, String pass) {
        usuario.clear();
        contrasena.clear();
        usuario.type(user);
        contrasena.type(pass);
        submit.click();
    }

    public void logout() {
        btnConfig.click();
        btnLogout.click();
        // Si termina el proceso de crear contacto quitar la siguiente linea
        btnLogout2.click();
    }
}
