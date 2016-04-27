package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class HistorialCuentaPage extends Guidewire {
    public HistorialCuentaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuCuenta;

    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem-inputEl']")
    WebElementFacade txtNumCuenta;

    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem_Button']")
    WebElementFacade btnBuscarCuenta;

    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_History']/div")
    WebElementFacade mnuHistorial;

    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:relatedto-inputEl']")
    WebElementFacade btnMostrarRelacionadoCon;

    @FindBy(xpath=".//*[@id='boundlist-1074-listEl']/ul/li[3]")
    WebElementFacade itmPoliza;

    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarItem;

    public void buscarCuenta(String numCuenta) {
        Actions act = new Actions(getDriver());
        mnuCuenta.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(numCuenta);
        btnBuscarCuenta.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void seleccionarHistorial() {
        mnuHistorial.waitUntilEnabled();
        mnuHistorial.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaRelacionadoCon(){

        btnMostrarRelacionadoCon.waitUntilEnabled();
        btnMostrarRelacionadoCon.click();
        //itmPoliza.click();
        //BtnBuscarItem.click();
        System.out.println(btnMostrarRelacionadoCon.getSelectOptions());


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaFecha(String fecha){
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(fecha);
        btnBuscarItem.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaFechaRango(String desde, String hasta){
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(desde);
        txtNumCuenta.type(hasta);
        btnBuscarItem.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaUsuario(String usuario) {
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(usuario);
        btnBuscarItem.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }
}
