package com.sura.claims.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by jorghome on 30/03/2016.
 */
public class Escritorio extends Guidewire {

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



    public void assertion(String element){
        try {
            assertThat(lblIngreso.getText().toString(), containsString(element));
        }catch (Exception e){
        }
    }

    /*Navegación hasta nueva Reclamacion*/
    public void navegacion(){
    Actions act = new Actions(getDriver());
    mnuReclamacion.click();
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


