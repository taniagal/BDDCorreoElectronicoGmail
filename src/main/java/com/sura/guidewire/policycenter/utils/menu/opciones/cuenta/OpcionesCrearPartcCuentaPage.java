package com.sura.guidewire.policycenter.utils.menu.opciones.cuenta;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OpcionesCrearPartcCuentaPage extends PageUtil {

    private final Actions act = new Actions(getDriver());
    @FindBy(xpath = ".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:Edit-btnInnerEl']")
    private WebElementFacade btnEditCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:Add-btnInnerEl']")
    private WebElementFacade btnAgregaCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:AccountRolesLV-body']/*/table/tbody/tr[2]/td[1]")
    private WebElementFacade listRol;
    @FindBy(xpath = ".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:AccountRolesLV-body']/*/table/tbody")
    private WebElementFacade rol;
    @FindBy(xpath = ".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:AccountRolesLV:1:AssignedUser:UserBrowseMenuItem']")
    private WebElementFacade btnSelecUsuar;
    @FindBy(xpath = ".//*[@id='UserSearchPopup:UserSearchPopupScreen:UserSearchDV:Username-inputEl']")
    private WebElementFacade lblNombreUsuario;
    @FindBy(xpath = ".//*[@id='UserSearchPopup:UserSearchPopupScreen:UserSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarUsuario;
    @FindBy(xpath = ".//*[@id='centerPanel']")
    private WebElementFacade lblPartArc;
    @FindBy(xpath = ".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:Update-btnInnerEl']")
    private WebElementFacade btnActualiza;
    @FindBy(xpath = ".//*[@id='UserSearchPopup:UserSearchPopupScreen:UserSearchResultsLV:0:_Select']")
    private WebElementFacade botonSeleccionar;
    @FindBy(xpath = ".//td[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Roles']/div")
    private WebElementFacade mnuOpcionesCuenta;


    public OpcionesCrearPartcCuentaPage(WebDriver driver) {
        super(driver);
    }

    public void navegacionCreaParticipante() {
            mnuOpcionesCuenta.waitUntilPresent().click();
            btnEditCuenta.waitUntilPresent().click();
            btnAgregaCuenta.waitUntilPresent().click();
            waitUntil(WAIT_TIME_1000);
            listRol.click();
            act.sendKeys(Keys.TAB).build().perform();
            act.sendKeys(Keys.ENTER).build().perform();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.sendKeys(Keys.ENTER).build().perform();
            btnSelecUsuar.click();
            lblNombreUsuario.sendKeys("su");
            btnBuscarUsuario.click();
            botonSeleccionar.waitUntilPresent().click();
            lblPartArc.waitUntilPresent();
            waitUntil(WAIT_TIME_1000);
            act.sendKeys(Keys.TAB).build().perform();
            act.sendKeys(Keys.TAB).build().perform();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.sendKeys(Keys.ENTER).build().perform();
            btnActualiza.click();
    }

    public void verificarCamposParticipantes() {
        waitUntil(WAIT_TIME_1000);
        MatcherAssert.assertThat("Error al agregar el rol del participante de la cuenta", rol.containsText("Asegurador"));
    }
}
