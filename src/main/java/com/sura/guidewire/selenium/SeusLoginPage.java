package com.sura.guidewire.selenium;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
//@DefaultUrl("http://dllocoreseguros.suramericana.com:7003/pc/PolicyCenter.do")
public class SeusLoginPage extends Guidewire {

    @FindBy(xpath = "./[@id='country']")
    private WebElementFacade pais;
    @FindBy(id = "username")
    private WebElementFacade usuario;
    @FindBy(xpath = "./[@id='password']")
    private WebElementFacade contrasenia;
    @FindBy(xpath = "./[@id='lower']/input")
    private WebElementFacade btnSubmit;
    @FindBy(xpath = "./[@id='TabBar:ContactTab-btnWrap']")
    private WebElementFacade mnuContact;

    public SeusLoginPage(WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        getDriver().manage().window().maximize();
    }

    public void login(String pais, String usuario, String contrasenia) {
        if (!mnuContact.isPresent()) {
            this.usuario.waitUntilPresent();
            this.usuario.clear();
            this.contrasenia.clear();
            this.pais.click();
            this.pais.selectByVisibleText(pais);
            this.usuario.type(usuario);
            this.contrasenia.type(contrasenia);
            this.btnSubmit.click();
        }
    }
}
