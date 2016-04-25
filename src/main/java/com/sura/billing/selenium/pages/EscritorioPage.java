package com.sura.billing.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

/**
 * Created by jorghome on 22/04/2016.
 */
public class EscritorioPage extends Guidewire {

    Guidewire gw = new Guidewire(getDriver());

    public EscritorioPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='UserSearch:UserSearchScreen:ttlBar']")
    WebElementFacade labelIngreso;

    @FindBy(xpath=".//*[@id='HolidaysPage:HolidaysScreen:0']")
    WebElementFacade labelIngreso2;

    @FindBy(xpath=".//*[@id='TabBar:AdministrationTab-btnWrap']")
    WebElementFacade mnuAdministracion;

    @FindBy(xpath=".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_Holidays-itemEl']")
    WebElementFacade mnuItemsFestivos;

    // TODO: 22/04/2016 Revision escritura de excepciones en log
    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        try {
            element(labelIngreso).waitUntilVisible();
            element(mnuAdministracion).waitUntilVisible();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void assertion(String mensaje){
        gw.asercion(labelIngreso.getText(),mensaje);
    }

    public void asercionFestivo(String msj2){
        gw.asercion(labelIngreso2.getText(),msj2);
    }

    // TODO: 22/04/2016 Revision escritura de excepciones en log
    public void admDiasFestivos() {
        Actions act = new Actions(getDriver());
        mnuAdministracion.click();
        mnuAdministracion.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        act.moveToElement(mnuItemsFestivos).click().build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
