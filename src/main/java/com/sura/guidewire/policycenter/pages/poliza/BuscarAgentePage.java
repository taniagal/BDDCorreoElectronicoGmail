package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BuscarAgentePage extends PageUtil {

    private static final String PATHLABELCODIGOAGENTE = ".//*[@id='ProducerCodeSearchPopup:ProducerCodeSearchScreen:ttlBar']";


    @FindBy(xpath = ".//*[@id='ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:Code-inputEl']")
    private WebElementFacade textoCodigoAgente;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchLV:0:_Select']")
    private WebElementFacade linkSeleccionar;

    public BuscarAgentePage(WebDriver driver) {
        super(driver);
    }

    public void buscarAgentePorCodigo(String codigo) {
        this.actions.sendKeys(textoCodigoAgente.type(codigo)).build().perform();
        clicObjeto(botonBuscar);
        esperarObjetoClikeableServidor(PATHLABELCODIGOAGENTE);
        clicObjeto(linkSeleccionar);
    }
}
