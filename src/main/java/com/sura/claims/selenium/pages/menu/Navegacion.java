package com.sura.claims.selenium.pages.menu;

import com.sura.claims.selenium.pages.menu.superior.reclamacion.NuevaReclamacionPage;
import com.sura.claims.selenium.pages.menu.superior.reclamacion.ReclamacionBuscarPage;
import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Navegacion extends Commons {

    Actions act = new Actions(getDriver());

    // Objetos menu Reclamacion
    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade mnuReclamacion;
    @FindBy (xpath = ".//*[@id='TabBar:ClaimTab:ClaimTab_FNOLWizard-textEl']")
    WebElementFacade mnuNuevaReclamacion;
    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab:ClaimTab_FindClaim-inputEl']")
    WebElementFacade mnuBuscarReclamacion;
    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab:ClaimTab_FindClaim_Button']")
    WebElementFacade btnBuscarReclamacion;

    // Objetos menu Equipo
    @FindBy(xpath = ".//*[@id='TabBar:TeamTab-btnInnerEl']")
    WebElementFacade mnuEquipo;

    // Objetos menu Acciones Escritorio
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions']")
    WebElementFacade mnuAccionesEscritorio;
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission']")
    WebElementFacade mnuAccionNuevoEnvio;
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount']")
    WebElementFacade mnuAccionNuevaCuenta;

    public Navegacion(WebDriver driver) {
        super(driver);
    }

    //    Navegacion menu Reclamacion
    public NuevaReclamacionPage irANuevaReclamacion() {
        deployMenu(mnuReclamacion);
        waitABit(300);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuNuevaReclamacion).release(mnuNuevaReclamacion).click().build().perform();
        return new NuevaReclamacionPage(getDriver());
    }

    public ReclamacionBuscarPage irABuscarReclamacion() {
        deployMenu(mnuReclamacion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        mnuBuscarReclamacion.sendKeys("000-00-000201");
        btnBuscarReclamacion.click();
        return new ReclamacionBuscarPage(getDriver());
    }

}
