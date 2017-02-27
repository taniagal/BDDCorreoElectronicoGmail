package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MenuAministracionPage extends PageUtil {

    private static final String PATHLINKMENUADMINISTRACIONTRAPASOCARTERA = ".//*[@id='Admin:MenuLinks:Admin_BPCMenu']/div";
    private static final String PATHLABELPOLIZATRASPASOCARTERA = ".//*[@id='BPCPoliciesMainPage:ttlBar']";
    private static final String TEXTOBSUQUEDAAMIND = "Admin";

    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade textoBusquedaRegistro;
    @FindBy(xpath = PATHLINKMENUADMINISTRACIONTRAPASOCARTERA)
    private WebElementFacade menuAdmnistracionTrapasoCartera;

    public MenuAministracionPage(WebDriver driver) {
        super(driver);
    }

    public void irATraspasoDeCartera() {
        actions.moveToElement(textoBusquedaRegistro).click().sendKeys(TEXTOBSUQUEDAAMIND).sendKeys(Keys.ENTER).build().perform();
        esperarObjetoClikeableServidor(".//*[@id='AdminUserSearchPage:UserSearchScreen:ttlBar']");
        clicObjeto(menuAdmnistracionTrapasoCartera);
        esperarObjetoClikeableServidor(PATHLABELPOLIZATRASPASOCARTERA);
    }
}
