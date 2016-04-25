package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Created by criscaor on 2016/04/25.
 */
public class CuentaPage extends Guidewire{


    Guidewire gw = new Guidewire(getDriver());

    public CuentaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuCuenta;

    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-textEl']")
    WebElementFacade mnuNuevaCuenta;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtNombreCompania;


    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton']")
    WebElementFacade btnCrearCuentaNueva;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl']")
    WebElementFacade btnNuevaCuentaPersonal;

    public void navNuevaCuenta(){
        Actions act = gw.deployMenu(mnuCuenta);
        act.moveToElement(mnuNuevaCuenta).click().build().perform();
    }

    public void buscarPersona(String nombre){
        txtNombreCompania.sendKeys(nombre);
        btnBuscar.click();
        dormilon();
    }

    public void crearCuentaNuevaPersona(){
        btnCrearCuentaNueva.click();
        btnNuevaCuentaPersonal.click();
    }

    private void dormilon() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }
}
