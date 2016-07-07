package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class CotizacionMRCPage extends PageObject {

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElementFacade tituloDePagina;

    public CotizacionMRCPage(WebDriver driver){
        super(driver);
    }

    public void irABuscarCotizacion(String cotizacion) {

    }
}
