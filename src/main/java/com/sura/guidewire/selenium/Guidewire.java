package com.sura.guidewire.selenium;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.Matcher;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.Matchers.containsString;

/**
 * Created by jorghome on 15/04/2016.
 */
public class Guidewire extends PageObject {

    public Guidewire(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    WebElementFacade usuario;

    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    WebElementFacade contrasena;

    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    WebElementFacade submit;

    @FindBy(xpath = "//span[@id=':TabLinkMenuButton-btnEl']/span[2]")
    WebElementFacade btnConfig;

    @FindBy(id = "TabBar:LogoutTabBarLink-textEl")
    WebElementFacade btnLogout;

    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnLogout2;

    // TODO: 19/04/2016 Revision escritura de excepciones en log 
    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        getDriver().manage().window().maximize();
        try {
            usuario.waitUntilVisible();
            contrasena.waitUntilVisible();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void asercion(String element, String mensaje) {
        try {
            assertThat(element, containsString(mensaje));
        } catch (Exception e) {
        }
    }

    private void assertThat(String element, Matcher<String> stringMatcher) {
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
        if (btnLogout2.isCurrentlyVisible()) {
            btnLogout2.click();
        }
    }

    public Actions deployMenu(WebElementFacade menu){
        Actions act = new Actions(getDriver());
        menu.click();
        menu.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        return act;
    }

}
