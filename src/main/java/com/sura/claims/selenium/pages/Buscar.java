package com.sura.claims.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Buscar extends Guidewire {

    private final Guidewire gw = new Guidewire(getDriver());

    public Buscar(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = ".//*[@id='ClaimSearch:ClaimSearchScreen:ClaimSearchDV:ClaimSearchRequiredInputSet:PolicyNumber-inputEl']")
    private WebElementFacade txtNpoliza;

    @FindBy (xpath = ".//*[@id='ClaimSearch:ClaimSearchScreen:ClaimSearchDV:ClaimSearchAndResetInputSet:Search']")
    private WebElementFacade rdobuttonBuscarPoliza;

    @FindBy (xpath = ".//td[6]/div")
    private WebElementFacade msnPoliza;

    public void buscaAvanzada (String nPoliza){
        txtNpoliza.sendKeys(nPoliza);
        rdobuttonBuscarPoliza.click();
    }

    public void asersionPoliza (String polizaNum){
        gw.asercion(msnPoliza.getText() , polizaNum);

    }
}