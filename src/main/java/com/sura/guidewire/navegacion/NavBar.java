package com.sura.guidewire.navegacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class NavBar extends PageObject{

    @FindBy(xpath = ".//*[@id='TabBar:AccountTab-btnWrap']")
    private WebElementFacade desplegadorCuenta;

    @FindBy(xpath = ".//a[@id='TabBar:AccountTab']")
    private WebElementFacade linkmenu;

    public NavBar desplegarMenu(){
        desplegadorCuenta.setWindowFocus();
        desplegadorCuenta.sendKeys(Keys.ARROW_DOWN);
        desplegadorCuenta.sendKeys(Keys.ARROW_DOWN);
        return switchToPage(NavBar.class);
    }
}
