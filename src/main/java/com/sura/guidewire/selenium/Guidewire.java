package com.sura.guidewire.selenium;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.Matcher;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by jorghome on 15/04/2016.
 */
public class Guidewire extends PageObject {

    public Guidewire(WebDriver driver) {
        super(driver);

    }

    @FindBy(id=":TabLinkMenuButton-btnIconEl")
    WebElementFacade configuracion;
    @FindBy(id=":TabBar:LanguageTabBarLink-textEl")
    WebElementFacade internacional;
    @FindBy(id=":TabBar:LanguageTabBarLink:languageSwitcher-itemEl")
    WebElementFacade idioma;
    @FindBy(xpath=".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher:1:langs-textEl']")
    WebElementFacade espaniol;

    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    WebElementFacade usuario;

    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    WebElementFacade contrasena;

    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    WebElementFacade submit;

    @FindBy(xpath =".//*[@id=':TabLinkMenuButton-btnIconEl']")
    WebElementFacade btnConfig;

    @FindBy(xpath = ".//*[@id='TabBar:LogoutTabBarLink-itemEl']")
    WebElementFacade btnLogout;

    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnLogout2;

    // Initialize Log4j logs
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Guidewire.class);

    // TODO: 19/04/2016 Revision escritura de excepciones en log
    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        getDriver().manage().window().maximize();
        try {
            usuario.waitUntilVisible();
            contrasena.waitUntilVisible();
        } catch (Exception e) {
            LOGGER.error("This is error : " + e);
        }
    }

    Actions act = new Actions(getDriver());


    // TODO: 26/04/2016 Revision escritura de excepciones en log
    public void asercion(String element, String mensaje) {
        try {
            assertThat(element, containsString(mensaje));
        } catch (Exception e) {
            LOGGER.error("This is error : " + e);
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

    public void close() {
        getDriver().quit();
    }

    public Actions deployMenu(WebElementFacade menu) {
        Actions act = new Actions(getDriver());
        menu.waitUntilClickable().click();
        waitABit(1500);
        menu.waitUntilClickable().click();
        waitABit(500);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        return act;
    }

    public void selectItem(WebElementFacade element, String option){
        element.click();
        threadWait(200);
        element.sendKeys(option);
        element.sendKeys(Keys.ENTER);
    }

    public void threadWait(int milisegundos) {
        try {
            TimeUnit.MILLISECONDS.sleep(milisegundos);
        } catch (InterruptedException e) {
            LOGGER.error("This is error : " + e);
        }
    }

    public String nitRandom() {
        StringBuilder result=new StringBuilder("");
        int primero = (int) Math.floor(Math.random() * (90 - 99) + 99);
        int segundo = (int) Math.floor(Math.random() * (10000000 - 99999999) + 99999999);
        result.append(primero);
        result.append(segundo);
        return result.toString();
    }


    public String cedulaRandom() {
        StringBuilder result=new StringBuilder("");
        int primero = (int) Math.floor(Math.random() * (10000000 - 99999999) + 99999999);
        result.append(primero);
        return result.toString();
    }

    public void elegirLenguaje(){
        configuracion.click();
        waitABit(800);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(800);
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(800);
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(800);
        espaniol.click();
    }


    protected void espera(final WebElementFacade element, final int timeoutInSeconds) {
        final WebDriverWait wait = new WebDriverWait(getDriver(), timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
