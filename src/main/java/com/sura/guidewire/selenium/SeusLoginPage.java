package com.sura.guidewire.selenium;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


//@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
@DefaultUrl("http://dllocoreseguros.suramericana.com:7003/pc/PolicyCenter.do")
public class SeusLoginPage extends Guidewire {
    public SeusLoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath=".//*[@id='country']")
    WebElementFacade pais;

    @FindBy(id="username")
    WebElementFacade usuario;

    @FindBy(xpath=".//*[@id='password']")
    WebElementFacade contrasenia;

    @FindBy(xpath=".//*[@id='lower']/input")
    WebElementFacade btnSubmit;

    @WhenPageOpens
    public void waitUntilMainElementsAppears() {

        getDriver().manage().window().maximize();
        try {
            pais.waitUntilVisible();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void login(String pais, String usuario, String contrasenia) {
        this.usuario.clear();
        this.contrasenia.clear();
        this.pais.click();
        this.pais.selectByVisibleText(pais);
        this.usuario.type(usuario);
        this.contrasenia.type(contrasenia);
        this.btnSubmit.click();

    }

}
