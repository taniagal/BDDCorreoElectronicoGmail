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
 * Created by jorghome on 30/03/2016.
 */
public class Escritorio extends Guidewire {

    BarraNavegacion barraNavegacion;
    Guidewire gw = new Guidewire(getDriver());

    public Escritorio(WebDriver driver) {
        super(driver);
        barraNavegacion = new BarraNavegacion(driver);
    }

    @FindBy(xpath = ".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")
    WebElementFacade lblIngreso;
    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade mnuReclamacion;
    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab:ClaimTab_FNOLWizard-textEl']")
    WebElementFacade cboNuevaReclamacion;
    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab:ClaimTab_FindClaim-inputEl']")
    WebElementFacade txtBuscarNumReclamancion;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnWrap']")
    WebElementFacade mnuBusqueda;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_ClaimSearchesGroup:ClaimSearchesGroup_ClaimSearch-textEl']")
    WebElementFacade mnubuscaAvanzada;

    public PaginaPanel irAPanel() {
        return barraNavegacion.irAPanel();
    }

    public PaginaMiCalendario irAMiCalendario() {
        return barraNavegacion.irAMiCalendario();
    }

    public void assertion(String mensaje) {
        gw.asercion(lblIngreso.getText(), mensaje);
    }

    public void navegacionNuevaReclamacion() {

        Actions act = new Actions(getDriver());
        mnuReclamacion.click();
        gw.waitUntil(3000);
        mnuReclamacion.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(cboNuevaReclamacion).click().build().perform();
        gw.waitUntil(3000);
    }

    public void navegacionBuscaAvanzada() {

        mnuBusqueda.waitUntilClickable();
        Actions act = gw.deployMenu(mnuBusqueda);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnubuscaAvanzada).click().build().perform();
    }

}


