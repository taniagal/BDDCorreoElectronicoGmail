package com.sura.guidewire.policycenter.pages.agente;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;

public class BusquedaDeAsesorPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade menuCampoIrA;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ProducerCodeSearch']/div/span")
    private WebElementFacade menuCodigosDeAgente;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:Code-inputEl']")
    private WebElementFacade campoCodigoAgente;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:Description-inputEl']")
    private WebElementFacade campoNombreAsesor;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:ParentCode-inputEl']")
    private WebElementFacade campoCodigoAgentePrimario;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:Status-inputEl']")
    private WebElementFacade campoEstado;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:BranchCode-inputEl']")
    private WebElementFacade campoCodigoSucursal;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:Organization-inputEl']")
    private WebElementFacade campoOrganizacion;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:User-inputEl']")
    private WebElementFacade campoDisponibleParaElUsuario;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:User:UserBrowseMenuItem']/span")
    private WebElementFacade linkSeleccionarUsuario1;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:MissingPrefUW-inputEl']")
    private WebElementFacade checkDeseaBuscarAsegurador;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:PrefUW-inputEl']")
    private WebElementFacade campoAseguradorPreferido;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:PrefUW:UserBrowseMenuItem']/span")
    private WebElementFacade linkSeleccionarUsuario2;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:Currency-inputEl']")
    private WebElementFacade campoMoneda;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade campoPais;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade campoDepartamento;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl']")
    private WebElementFacade campoCiudad;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City:AutoFillIcon']/img")
    private WebElementFacade iconoAutorellenarCiudad;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    private WebElementFacade botonRestablecer;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchLV-body']/*/table/tbody/tr/td[2]")
    private WebElementFacade tablaCampoCodigoAgente;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchLV-body']/*/table/tbody/tr/td[3]")
    private WebElementFacade tablaCampoDescripcion;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchLV-body']/*/table/tbody/tr/td[4]")
    private WebElementFacade tablaCampoEstado;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchLV-body']/*/table/tbody/tr/td[5]")
    private WebElementFacade tablaCampoOrganizacion;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchLV-body']/*/table/tbody/tr/td[6]")
    private WebElementFacade tablaCampoCodigoSucursal;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:ProducerCodeSearchLV-body']/*/table/tbody/tr/td[7]")
    private WebElementFacade tablaCampoSucursal;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearch:ProducerCodeSearchScreen:_msgs']/div")
    private WebElementFacade mensaje;

    public BusquedaDeAsesorPage(WebDriver driver) {
        super(driver);
    }

    public void irALaVentanaBusquedaDeAgente() {
        menuCampoIrA.sendKeys("Search");
        menuCampoIrA.sendKeys(Keys.ENTER);
        waitForTextToAppear("Buscar pólizas");
        menuCodigosDeAgente.waitUntilPresent().click();
        waitForTextToAppear("Búsqueda de asesores");
    }

    public Map<String, Boolean> validarElementosNoVisiblesDeLaPantalla() {
        Map<String, Boolean> elementos = new HashMap<>();
        elementos.put("codigoAgentePrimario", Boolean.valueOf(super.validarElementoWebVisible(campoCodigoAgentePrimario, TIEMPO_500)));
        elementos.put("estado", Boolean.valueOf(super.validarElementoWebVisible(campoEstado, TIEMPO_500)));
        elementos.put("codigoSucursal", Boolean.valueOf(super.validarElementoWebVisible(campoCodigoSucursal, TIEMPO_500)));
        elementos.put("organizacion", Boolean.valueOf(super.validarElementoWebVisible(campoOrganizacion, TIEMPO_500)));
        elementos.put("linkUsuario1", Boolean.valueOf(super.validarElementoWebVisible(linkSeleccionarUsuario1, TIEMPO_500)));
        elementos.put("checkDeseaBuscarAsegurador", Boolean.valueOf(super.validarElementoWebVisible(checkDeseaBuscarAsegurador, TIEMPO_500)));
        elementos.put("linkUsuario2", Boolean.valueOf(super.validarElementoWebVisible(linkSeleccionarUsuario2, TIEMPO_500)));
        elementos.put("moneda", Boolean.valueOf(super.validarElementoWebVisible(campoMoneda, TIEMPO_500)));
        elementos.put("pais", Boolean.valueOf(super.validarElementoWebVisible(campoPais, TIEMPO_500)));
        elementos.put("departamento", Boolean.valueOf(super.validarElementoWebVisible(campoDepartamento, TIEMPO_500)));
        elementos.put("ciudad", Boolean.valueOf(super.validarElementoWebVisible(campoCiudad, TIEMPO_500)));
        elementos.put("iconoAutorellenarCiudad", Boolean.valueOf(super.validarElementoWebVisible(iconoAutorellenarCiudad, TIEMPO_500)));
        return elementos;
    }

    public void ingresarCodigoAgente(String codigoAsesor) {
        campoCodigoAgente.waitUntilPresent();
        campoCodigoAgente.type(codigoAsesor);
    }

    public void ingresarNombreDeAgente(String nombreAsesor) {
        campoNombreAsesor.waitUntilPresent();
        campoNombreAsesor.type(nombreAsesor);
    }

    public void clicEnElBotonBuscar() {
        botonBuscar.waitUntilPresent().click();
    }

    public void clicEnElBotonRestablecer() {
        botonRestablecer.waitUntilPresent().click();
        waitForTextToAppear("No hay datos para mostrar");
        waitFor(ExpectedConditions.attributeContains(campoCodigoAgente, "text", ""));
        waitFor(ExpectedConditions.attributeContains(campoNombreAsesor, "text", ""));
    }

    public Map<String, String> obtenerResultadosDeBusqueda() {
        waitForTextToDisappear("No hay datos para mostrar");
        Map<String, String> resultadosDeConsulta = new HashMap<>();
        resultadosDeConsulta.put("codigoAsesor", tablaCampoCodigoAgente.getText());
        resultadosDeConsulta.put("nombreAsesor", tablaCampoDescripcion.getText());
        resultadosDeConsulta.put("estado", tablaCampoEstado.getText());
        resultadosDeConsulta.put("organizacion", tablaCampoOrganizacion.getText());
        resultadosDeConsulta.put("codigoSucursal", tablaCampoCodigoSucursal.getText());
        resultadosDeConsulta.put("sucursal", tablaCampoSucursal.getText());
        return resultadosDeConsulta;
    }

    public void validarMensajeDeBusquedaDeAsesores(String mensajeEsperado) {
        super.verificarMensaje(mensaje, mensajeEsperado);
    }
}
