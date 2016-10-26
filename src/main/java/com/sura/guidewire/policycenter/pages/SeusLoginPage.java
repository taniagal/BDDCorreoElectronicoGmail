package com.sura.guidewire.policycenter.pages;

import java.util.concurrent.TimeUnit;

import com.sura.guidewire.policycenter.util.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
//@DefaultUrl("http://dllocoreseguros.suramericana.com:7003/pc/PolicyCenter.do")
//@DefaultUrl("https://qacoreseguros.suramericana.com/pc/PolicyCenter.do")
public class SeusLoginPage extends Commons {

    @FindBy(xpath = ".//*[@id='country']")
    private WebElementFacade pais;
    @FindBy(id = "username")
    private WebElementFacade usuario;
    @FindBy(xpath = ".//*[@id='password']")
    private WebElementFacade contrasenia;
    @FindBy(xpath = ".//*[@id='lower']/input")
    private WebElementFacade btnSubmit;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    private WebElementFacade mnuContact;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    private WebElementFacade usuario1;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    private WebElementFacade contrasenia1;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    private WebElementFacade btnSubmit1;

    public SeusLoginPage(WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        getDriver().manage().window().maximize();
    }

    public void login(String pais, String usuario, String contrasenia) {
        setImplicitTimeout(0, TimeUnit.SECONDS);
        if (!mnuContact.isPresent()) {
            if (usuario1.isPresent()) {
                usuario1.sendKeys("su");
                contrasenia1.sendKeys("gw");
                btnSubmit1.click();
            } else {
                this.usuario.waitUntilPresent();
                this.usuario.clear();
                this.contrasenia.clear();
                this.pais.click();
                this.pais.selectByVisibleText(pais);
                this.usuario.type(usuario);
                this.contrasenia.type(contrasenia);
                btnSubmit.click();
            }
        }
        resetImplicitTimeout();
    }
}