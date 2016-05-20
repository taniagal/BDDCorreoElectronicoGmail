package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OpcionesCrearPartcCuentaPage extends Guidewire {
    public OpcionesCrearPartcCuentaPage(WebDriver driver) {
        super(driver);
    }

    private Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:Edit-btnInnerEl']")
    private WebElementFacade btnEditCuenta;

    @FindBy(xpath = ".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:Add-btnInnerEl']")
    private WebElementFacade btnAgregaCuenta;

    @FindBy(xpath = ".//tr[2]/td[2]/div")
    private WebElementFacade listRol;

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

    @FindBy(xpath = ".//div[contains(.,'Director Sucursal')]")
    private WebElementFacade lblvalidaRol;

    // TODO: 17/05/2016 Se deben parametrizar datos quemados de los contains en las listas
    public void navegacionCreaParticipante() {
        btnEditCuenta.click();
        act.moveToElement(btnAgregaCuenta).release(btnAgregaCuenta).click().build().perform();
        listRol.click();
        WebElementFacade element = findBy(".//li[contains(.,'Director Sucursal')]");
        element.click();
        btnSelecUsuar.click();
        lblNombreUsuario.sendKeys("a");
        btnBuscarUsuario.click();
        WebElementFacade elemntSelecUsuario = findBy(".//a[contains(.,'Seleccionar')]");
        elemntSelecUsuario.click();
        waitABit(1000);
        lblPartArc.click();
        waitABit(200);
        act.sendKeys(Keys.RIGHT).build().perform();
        waitABit(200);
        act.sendKeys(Keys.RIGHT).build().perform();
        waitABit(200);
        act.sendKeys(Keys.ENTER).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        WebElementFacade elementGrupoAsign = findBy(".//li[contains(.,'Los Angeles Branch UW')]");
        elementGrupoAsign.click();
        btnActualiza.click();
    }

    public void verificarCamposParticipantes() {
        asercion(lblvalidaRol.getText(), "Director Sucursal");
    }
}
