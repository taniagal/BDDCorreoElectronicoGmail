package com.sura.claims.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

/**
 * Created by jonamele on 22/04/2016.
 */
public class Buscar extends Guidewire {

    Guidewire gw = new Guidewire(getDriver());

    public Buscar(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = ".//*[@id='ClaimSearch:ClaimSearchScreen:ClaimSearchDV:ClaimSearchRequiredInputSet:PolicyNumber-inputEl']")
    WebElementFacade txtNpoliza;

    @FindBy (xpath = ".//*[@id='ClaimSearch:ClaimSearchScreen:ClaimSearchDV:ClaimSearchAndResetInputSet:Search']")
    WebElementFacade rdobuttonBuscarPoliza;

    @FindBy (xpath = ".//td[6]/div")
    WebElementFacade msnPoliza;

    public void buscaAvanzada (String Npoliza){
        txtNpoliza.sendKeys(Npoliza);
        rdobuttonBuscarPoliza.click();
    }

    public void asersionPoliza (String polizaNum){
        gw.asercion(msnPoliza.getText() , polizaNum);

    }
}