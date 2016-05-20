package com.sura.claims.selenium.pages;

import com.sura.claims.selenium.pages.menu.PaginaMiCalendario;
import com.sura.claims.selenium.pages.menu.PaginaPanel;
import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jonamele on 06/05/2016.
 */
@SuppressWarnings("WeakerAccess")
public class BarraNavegacion extends Guidewire {

    public BarraNavegacion(WebDriver driver) {
        super(driver);
    }
    private Actions act = new Actions(getDriver());

    @SuppressWarnings("WeakerAccess")
    @FindBy(xpath = ".//*[@id='TabBar:DashboardTab']")
    private WebElementFacade menuPanel;
    @SuppressWarnings("WeakerAccess")
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnWrap']")
    private WebElementFacade menuEscritorio;
    @SuppressWarnings("WeakerAccess")
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopCalendarGroup-itemEl']")
    private WebElementFacade itemCalendario;
    @SuppressWarnings("WeakerAccess")
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopCalendarGroup:DesktopCalendarGroup_Calendar-itemEl']")
    private WebElementFacade itemMiCalendario;

    public PaginaPanel irAPanel()  {
        menuPanel.click();
        return new PaginaPanel(getDriver());
    }

    public PaginaMiCalendario irAMiCalendario()  {
        menuEscritorio.click();
        menuEscritorio.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemCalendario).release(itemCalendario).build().perform();
        act.moveToElement(itemMiCalendario).click().build().perform();
        return new PaginaMiCalendario(getDriver());
    }

}
