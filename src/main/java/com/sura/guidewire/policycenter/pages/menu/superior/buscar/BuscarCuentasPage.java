package com.sura.guidewire.policycenter.pages.menu.superior.buscar;

import com.sura.guidewire.policycenter.util.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BuscarCuentasPage extends Commons {

    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    private WebElementFacade lblCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscaCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']")
    private WebElementFacade linkCuenta;

    public BuscarCuentasPage(WebDriver driver) {
        super(driver);
    }

    public void navegacionBuscarCuenta(String numCuenta) {
        lblCuenta.clear();
        lblCuenta.sendKeys(numCuenta);
        btnBuscaCuenta.click();
        waitABit(1000);
        linkCuenta.click();
    }

}


