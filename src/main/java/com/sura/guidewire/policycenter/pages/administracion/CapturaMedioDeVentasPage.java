package com.sura.guidewire.policycenter.pages.administracion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CapturaMedioDeVentasPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext']/div/span")
    private WebElementFacade itemConfiguracionRedComercial;
    @FindBy(xpath = "//div[contains(.,'CanalesMedios de ventaOficinas por canal')]")
    private WebElementFacade tablaMediosVenta;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:0']")
    private WebElementFacade tablaNuevaAutorizacion;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext']/div/span")
    private WebElementFacade menuItemCanales;
    @FindBy(xpath = ".//*[@id='AdminSaleMethodSearchPage_Ext:0']")
    private WebElementFacade tablaCanalMedioDeVenta;
    @FindBy(xpath = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:0']")
    private WebElementFacade tablaCanalMedioDeVentaPorCanal;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext:CommercialNetwork_Ext_AdminSaleMethodSearchPage_Ext']/div")
    private WebElementFacade menuItemMedioDeVenta;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext:CommercialNetwork_Ext_AdminOfficeSalesNetworkSearchPage_Ext']/div")
    private WebElementFacade menuItemOficinasPorCanal;
    @FindBy(xpath = ".//*[@id='AdminOfficeSalesNetworkSearchPage_Ext:0']")
    private WebElementFacade tablaCanalOficina;
    @FindBy(xpath = "//td/a")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscarMediosDeVenta;
    @FindBy(xpath = "//a[contains(.,'Restablecer')]")
    private WebElementFacade botonRestablecer;
    @FindBy(xpath = ".//*[contains(@id, 'SaleChannelSearchScreen:0')]")
    private WebElementFacade tablaCanal;
    @FindBy(xpath = "//span[@id='Admin:AdminMenuActions-btnInnerEl']")
    private WebElementFacade mnuAcciones;
    @FindBy(xpath = "//span[contains(.,'Canal nuevo')]")
    private WebElementFacade itemCanalNuevo;
    @FindBy(xpath = "//td[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext:CommercialNetwork_Ext_AdminSuraChannelSaleMethodSearchPage_Ext']/div/span")
    private WebElementFacade itemMedioDeVentaPorCanal;
    @FindBy(xpath = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:suraChannel-inputEl']")
    private WebElementFacade listaCanalComercial;
    @FindBy(xpath = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:codeSura-inputEl']")
    private WebElementFacade listMedioDeVenta;
    @FindBy(xpath = "//li[contains(.,'CC001 - Bancaseguros bancolombia')]")
    private WebElementFacade itemCanalComercial;
    @FindBy(xpath = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:OfficesSearchResultsLV-body']")
    private WebElementFacade tablaMediosDeVentaAsociados;
    @FindBy(xpath = "//span[contains(@id,'Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuAction_SuraChannelSaleMethod_Ext-textEl')]")
    private WebElementFacade itemMedioDeVentaPorCanalNuevo;
    @FindBy(xpath = ".//*[@id='NewSuraChannelSaleMethod_Ext:SuraChannelSaleMethodDetailScreen:suraChannel-inputEl']")
    private WebElementFacade txtCanal;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[4]/td/div/div[2]/div/table/tbody/tr[2]/td/div/table/tbody/tr/td/div/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td[1]/input")
    private WebElementFacade txtMedioDeVenta;
    @FindBy(xpath = "//li[contains(.,'9 - Puntos delegados')]")
    private WebElementFacade itemMedioDeVenta;
    @FindBy(xpath = ".//*[@id='NewSuraChannelSaleMethod_Ext:SuraChannelSaleMethodDetailScreen:Update-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='NewSuraChannelSaleMethod_Ext:SuraChannelSaleMethodDetailScreen:OfficeDetail_BasicCardTab-btnInnerEl']")
    private WebElementFacade labelDatosBasicosMedioDeVenta;
    @FindBy(xpath = ".//*[contains(@id, 'SuraSaleChannelDetailScreen:2')]")
    private WebElementFacade tablaCanalNuevo;
    @FindBy(xpath = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoIrA;

    protected static final String PATHMEDIOVENTAPORCANAL = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:ttlBar']";
    protected static final String TABLAMEDIOVENTAPORCANAL = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:OfficesSearchResultsLV-body']/*/table/tbody/tr";

    public CapturaMedioDeVentasPage(WebDriver driver) {
        super(driver);
    }

    public void irAlMenuAdminsitracion() {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(campoIrA).shouldBePresent();
        campoIrA.sendKeys("Admin");
        campoIrA.sendKeys(Keys.ENTER);
    }

    public void irARedComercial() {
        esperarObjetoClikeableServidorWe(itemConfiguracionRedComercial);
    }

    public String validarOpcionesRedComercial() {
        String listaObtenida = null;
        if (tablaMediosVenta.isCurrentlyVisible()) {
            listaObtenida = tablaMediosVenta.getText();
        }
        return listaObtenida;
    }

    public void irACanales() {
        clickearElemento(menuItemCanales);
        waitForTextToAppear("Código canal");
    }

    public void irAMediosDeVenta() {
        clickearElemento(menuItemMedioDeVenta);
        waitForTextToAppear("Código medio de venta");
    }

    public String validarOpcionesMediosDeVenta() {
        String listaObtenida = null;
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        if (tablaCanalMedioDeVenta.isVisible()) {
            listaObtenida = tablaCanalMedioDeVenta.getText();
        } else if (tablaNuevaAutorizacion.isVisible()) {
            listaObtenida = tablaNuevaAutorizacion.getText();
        }
        resetImplicitTimeout();
        return listaObtenida;
    }

    public void irAOficinasPorCanal() {
        clickearElemento(menuItemOficinasPorCanal);
        waitForTextToAppear("Canal comercial");
    }

    public String validarOpcionesCanalOficina() {
        waitForTextToAppear("Oficinas por canal");
        String listaObtenida = null;
        if (tablaCanalOficina.isCurrentlyVisible()) {
            listaObtenida = tablaCanalOficina.getText();
        }
        return listaObtenida;
    }

    public void verificarPresenciaBotones() {
        waitFor(botonBuscar);
        waitFor(botonRestablecer);
    }

    public String validarOpcionesCanal() {
        String listaObtenida = null;
        setImplicitTimeout(TIEMPO_10, TimeUnit.SECONDS);
        if (tablaCanal.isVisible()) {
            listaObtenida = waitFor(tablaCanal).getText();
        } else if (tablaCanalNuevo.isVisible()) {
            listaObtenida = tablaCanalNuevo.getText();
        } else if (tablaCanalMedioDeVentaPorCanal.isVisible()) {
            listaObtenida = tablaCanalMedioDeVentaPorCanal.getText();
        }
        resetImplicitTimeout();
        return listaObtenida;
    }

    public void crearNuevoCanal() {
        mnuAcciones.click();
        esperarYClickearBoton(itemCanalNuevo);
    }

    public void irAMediosDeVentaPorCanal() {
        clickearElemento(itemMedioDeVentaPorCanal);
        waitForTextToAppear("Medio de venta");
    }

    public void buscarCanalComercial(ExamplesTable canalComercial) {
        listMedioDeVenta.clear();
        seleccionarItem(listMedioDeVenta, canalComercial.getRow(0).get("medioDeVenta"));
        esperarObjetoClikeableServidor(PATHMEDIOVENTAPORCANAL);
        listaCanalComercial.clear();
        seleccionarItem(listaCanalComercial, canalComercial.getRow(0).get("canalComercial"));
        esperarObjetoClikeableServidor(PATHMEDIOVENTAPORCANAL);
        botonBuscarMediosDeVenta.click();
    }

    public void irMenuMedioDeVentaPorCanalNuevo() {
        mnuAcciones.click();
        esperarYClickearBoton(itemMedioDeVentaPorCanalNuevo);
    }

    public void asociarMedioDeVentaAlCanal(String canalComercial, String medioDeVenta) {
        ingresarDato(txtCanal, canalComercial);
        itemCanalComercial.click();
        ingresarDato(txtMedioDeVenta, medioDeVenta);
        itemMedioDeVenta.click();
        esperarYClickearBoton(botonActualizar);
    }

    public void verificarAdiccionMedioDeVentaACanal() {
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(labelDatosBasicosMedioDeVenta);
    }

    public void validarDatosMedioDeVentaPorCanal(ExamplesTable verificarDatoMediosVenta) {
        for (Map<String, String> verificarDato : verificarDatoMediosVenta.getRows()) {
            MatcherAssert.assertThat("No se encontro el medio de venta" + " venta esperada: " + verificarDato.get("mediosDeVentaAsociados"), validarResultadoTabla(TABLAMEDIOVENTAPORCANAL, verificarDato.get("mediosDeVentaAsociados"), CONSTANTE_2));
            MatcherAssert.assertThat("No se encontro el medio de venta por defecto" + " venta esperada: " + verificarDato.get("medioDeVentaPorDefecto"), validarResultadoTabla(TABLAMEDIOVENTAPORCANAL, verificarDato.get("medioDeVentaPorDefecto"), CONSTANTE_5));
        }
    }

}