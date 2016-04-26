package com.sura.claims.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jorghome on 30/03/2016.
 */
public class Escritorio extends Guidewire {

    Guidewire gw = new Guidewire(getDriver());

    public Escritorio(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")
    WebElementFacade lblIngreso;
    @FindBy(xpath=".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade mnuReclamacion;
    @FindBy(xpath=".//*[@id='TabBar:ClaimTab:ClaimTab_FNOLWizard-textEl']")
    WebElementFacade cboNuevaReclamacion;
    @FindBy(xpath=".//*[@id='TabBar:ClaimTab:ClaimTab_FindClaim-inputEl']")
    WebElementFacade txtBuscarNumReclamancion;

    public void assertion(String mensaje){
    gw.asercion(lblIngreso.getText(),mensaje);
    }

    /*Navegación hasta nueva Reclamacion*/
    public void navegacion() throws InterruptedException {
    Actions act = new Actions(getDriver());
        mnuReclamacion.click();
        Thread.sleep(1000);
        mnuReclamacion.click();
    act.sendKeys(Keys.ARROW_DOWN).build().perform();
    act.moveToElement(cboNuevaReclamacion).click().build().perform();
    try {
        Thread.sleep(3000);
    }
    catch (Exception e) {
        throw new RuntimeException(e);
    }
    }

}


