package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Created by criscaor on 2016/04/25.
 */
public class CuentaPage extends Guidewire{


    Guidewire gw = new Guidewire(getDriver());

    public CuentaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuCuenta;

    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-textEl']")
    WebElementFacade mnuNuevaCuenta;

    public void navNuevaCuenta(){
        Actions act = new Actions(getDriver());
        mnuCuenta.click();
        dormilon();
        mnuCuenta.click();
        dormilon();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        dormilon();
        act.moveToElement(mnuNuevaCuenta).click().build().perform();

    }

    private void dormilon() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }


}
