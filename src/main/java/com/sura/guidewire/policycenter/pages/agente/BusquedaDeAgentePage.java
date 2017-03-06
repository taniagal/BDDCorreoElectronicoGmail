package com.sura.guidewire.policycenter.pages.agente;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BusquedaDeAgentePage extends PageUtil{

    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade menuCampoIrA;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade menuCodigosDeAgente;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:Description-inputEl']")
    private WebElementFacade campoDescripcion;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoCodigoAgentePrimario;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoEstado;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoCodigoSucursal;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoOrganizacion;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoDisponibleParaElUsuario;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade linkSeleccionarUsuario1;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade checkDeseaBuscarAsegurador;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoAseguradorPreferido;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade linkSeleccionarUsuario2;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoMoneda;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoPais;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoDepartamento;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade campoCiudad;

    public BusquedaDeAgentePage(WebDriver driver){
        super(driver);
    }

    public void irALaVentanaBusquedaDeAgente() {
        menuCampoIrA.sendKeys("Search");
        menuCampoIrA.sendKeys(Keys.ENTER);
        waitForTextToAppear("Buscar pólizas");
        menuCodigosDeAgente.waitUntilPresent().click();
        waitForTextToAppear("Búsqueda de códigos de agente");
    }

    public void validarElementosNoVisiblesDeLaPantalla(){

    }

}
