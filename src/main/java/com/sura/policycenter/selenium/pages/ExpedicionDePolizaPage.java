package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ExpedicionDePolizaPage extends PageObject{

    public ExpedicionDePolizaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab']")
    WebElementFacade menuPoliza;

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_SubmissionNumberSearchItem-inputEl']")
    WebElementFacade menuNumeroCotizacion;

    public void irABuscarCotizacion(String cotizacion){
        menuPoliza.click();
        waitForAnyTextToAppear("Cotización", "Buscar pólizas");
        menuPoliza.click();
        menuPoliza.sendKeys(Keys.ARROW_DOWN);
        menuNumeroCotizacion.type(cotizacion);
        menuNumeroCotizacion.sendKeys(Keys.ENTER);
    }
}
