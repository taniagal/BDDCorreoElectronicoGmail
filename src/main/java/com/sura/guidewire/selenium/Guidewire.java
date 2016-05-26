package com.sura.guidewire.selenium;

import com.google.common.base.Function;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class Guidewire extends PageObject {

    private final Actions act = new Actions(getDriver());
    @FindBy(id=":TabLinkMenuButton-btnIconEl")
    WebElementFacade configuracion;
    @FindBy(id=":TabBar:LanguageTabBarLink-textEl")
    WebElementFacade internacional;
    @FindBy(id=":TabBar:LanguageTabBarLink:languageSwitcher-itemEl")
    WebElementFacade idioma;
    @FindBy(xpath=".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher:1:langs-textEl']")
    private WebElementFacade espaniol;
    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    private WebElementFacade usuario;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    private WebElementFacade contrasena;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    private WebElementFacade submit;
    @FindBy(xpath =".//*[@id=':TabLinkMenuButton-btnIconEl']")
    private WebElementFacade btnConfig;
    @FindBy(xpath = ".//*[@id='TabBar:LogoutTabBarLink-itemEl']")
    private WebElementFacade btnLogout;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    private WebElementFacade btnLogout2;
    @FindBy(xpath = ".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")
    private WebElementFacade lblMisActividades;

    public Guidewire(WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        getDriver().manage().window().maximize();
        usuario.waitUntilVisible();
        contrasena.waitUntilVisible();
    }

    public void asercion(String element, String mensaje) {
        assertThat(element, containsString(mensaje));
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
        menu.waitUntilClickable().click();
        waitABit(1000);
        menu.waitUntilClickable().click();
        waitABit(300);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        return act;
    }


    public void selectItem(WebElementFacade element, String option){
        element.click();
        waitABit(200);
        element.sendKeys(option);
        element.sendKeys(Keys.ENTER);
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

    public void elegirLenguaje(){
        if(!("Mis actividades").equals(lblMisActividades.getText())){
        configuracion.click();
        waitABit(300);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        espaniol.click();
        waitABit(850);
        }
    }

    protected void espera(final WebElementFacade element, final int timeoutInSeconds) {
        final WebDriverWait wait = new WebDriverWait(getDriver(), timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntil(int millis) {
        Integer i = 0;
        Wait<Integer> waitUtil = new FluentWait<Integer>(i).withTimeout(millis,
                TimeUnit.MILLISECONDS).pollingEvery(millis,
                TimeUnit.MILLISECONDS);
        waitUtil.until(new Function<Integer, Boolean>() {
            public Boolean apply(Integer i) {
                return false;
            }
        });
    }
}
