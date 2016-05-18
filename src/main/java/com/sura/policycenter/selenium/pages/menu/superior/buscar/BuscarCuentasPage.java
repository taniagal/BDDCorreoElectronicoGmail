package com.sura.policycenter.selenium.pages.menu.superior.buscar;

import com.sura.guidewire.selenium.Guidewire;
import jnr.ffi.annotations.Clear;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

/**
 * Created by jorghome on 10/05/2016.
 */
public class BuscarCuentasPage extends Guidewire {

    public BuscarCuentasPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    WebElementFacade lblCuenta;

    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscaCuenta;

    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']")
    WebElementFacade linkCuenta;

    public void navegacionBuscarCuenta(String numCuenta) {
        lblCuenta.clear();
        lblCuenta.sendKeys(numCuenta);
        btnBuscaCuenta.click();
        waitABit(1000);
        linkCuenta.click();
    }

}


