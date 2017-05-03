package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BusquedaDeTransaccionesPage extends PageUtil{

    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_IdTransactionSearch']/div/span")
    WebElementFacade menuItemTransacciones;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:IdTransaction-inputEl']")
    WebElementFacade campoIdTransaccion;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:originMethod-inputEl']")
    WebElementFacade comboAplicacionDeOrigen;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:selectedProduct-inputEl']")
    WebElementFacade comboProducto;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    WebElementFacade botonRestablecer;
    @FindBy(xpath = ".//*[@id='IdTransactionSearch:IdTransactionSearchScreen:IdTransactionSearchPanelSet:resultsLV-body']")
    WebElementFacade tablaResultadosDeBusqueda;

    public BusquedaDeTransaccionesPage(WebDriver driver){
        super(driver);
    }

    public void seleccionarLaOpcionTransacciones() {
        menuItemTransacciones.waitUntilPresent();
        super.clickearElemento(menuItemTransacciones);
        waitForTextToAppear("Búsqueda de transacciones");
    }
}
