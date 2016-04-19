package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class Escritorio extends Guidewire {

    public Escritorio(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")
    WebElementFacade labelIngreso;

    @FindBy(xpath=".//*[@id='TabBar:ContactTab-btnWrap']")
    WebElementFacade mnuContact;

    @FindBy(xpath=".//*[@id='TabBar:ContactTab:NewContact-arrowEl']")
    WebElementFacade mnuNewContact;

    @FindBy(xpath=".//*[@id='TabBar:ContactTab:NewContact:NewPerson-itemEl']")
    WebElementFacade mnuNewPerson;

    // TODO: 18/04/2016 Revision escritura de excepciones en log 
    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        try {
            element(labelIngreso).waitUntilVisible();
            element(mnuContact).waitUntilVisible();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    // TODO: 18/04/2016 Revision escritura de excepciones en log 
    public void assertion(String element){
        try {
            assertThat(labelIngreso.getText().toString(), containsString(element));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: 18/04/2016 Revision escritura de excepciones en log 
    public void nuevoContactoPersona() {
        Actions act = new Actions(getDriver());
        mnuContact.click();
        mnuContact.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuNewContact).click().build().perform();
        act.moveToElement(mnuNewPerson).click().build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }
}
