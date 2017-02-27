package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CapturaMedioDeVentasPage extends PageUtil {
    @FindBy(xpath = ".//*[@id=':tabs-menu-trigger-btnIconEl']")
    private WebElementFacade menuAdministracion;
    @FindBy(xpath = "//div[5]/div/div[2]/div/div/a/span")
    private WebElementFacade itemAdministracion;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext']/div/span")
    private WebElementFacade itemConfiguracionRedComercial;
    @FindBy(xpath = "//div[contains(.,'CanalesMedios de ventaOficinas por canal')]")
    private WebElementFacade tablaMediosVenta;
    @FindBy(xpath = "html/body/div[1]/div[2]/div/span/div/div[3]/div[2]/div/table/tbody/tr[16]/td/div/span")
    private WebElementFacade menuItemCanales;
    @FindBy(xpath = ".//*[@id='AdminSaleMethodSearchPage_Ext:0']")
    private WebElementFacade tablaCanalMedioDeVenta;
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
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div")
    private WebElementFacade tablaCanal;
    @FindBy(xpath = "//span[@id='Admin:AdminMenuActions-btnInnerEl']")
    private WebElementFacade mnuAcciones;
    @FindBy(xpath = "//span[contains(.,'Canal nuevo')]")
    private WebElementFacade itemCanalNuevo;
    @FindBy(xpath = "//td[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext:CommercialNetwork_Ext_AdminSuraChannelSaleMethodSearchPage_Ext']/div/span")
    private WebElementFacade itemMedioDeVentaPorCanal;
    @FindBy(xpath = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:suraChannel-inputEl']")
    private WebElementFacade txtCanalComercial;
    @FindBy(xpath = "//li[contains(.,'CC001 - Bancaseguros bancolombia')]")
    private WebElementFacade itemCanalComercial;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/div[4]/div")
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
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[4]/td/div/div[2]/div/table/tbody/tr[2]/td/div/table/tbody/tr/td/div")
    private WebElementFacade tablaCanalNuevo;
    @FindBy(xpath = ".//*[@id='AdminSuraChannelSaleMethodSearchPage_Ext:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;

    public CapturaMedioDeVentasPage(WebDriver driver) {
        super(driver);
    }

    public void irAlMenuAdminsitracion() {
        menuAdministracion.click();
        itemAdministracion.click();
    }

    public void irARedComercial() {
        itemConfiguracionRedComercial.click();
    }

    public String validarOpcionesRedComercial() {
        String listaObtenida = null;
        if (tablaMediosVenta.isCurrentlyVisible()) {
            listaObtenida = tablaMediosVenta.getText();
        }
        return listaObtenida;
    }

    public void irACanales() {
        menuItemCanales.click();
        esperarHasta(TIEMPO_5000);
    }

    public void irAMediosDeVenta() {
        menuItemMedioDeVenta.click();
    }

    public String validarOpcionesMediosDeVenta() {
        String listaObtenida = null;
        if (tablaCanalMedioDeVenta.isCurrentlyVisible()) {
            listaObtenida = tablaCanalMedioDeVenta.getText();
        }
        return listaObtenida;
    }

    public void irAOficinasPorCanal() {
        menuItemOficinasPorCanal.click();
    }

    public String validarOpcionesCanalOficina() {
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
        if (tablaCanal.isCurrentlyVisible()) {
            listaObtenida = tablaCanal.getText();
        } else if(tablaCanalNuevo.isCurrentlyVisible()){
            listaObtenida = tablaCanalNuevo.getText();
        }
        return listaObtenida;
    }

    public void crearNuevoCanal() {
        mnuAcciones.click();
        esperarYClickearBoton(itemCanalNuevo);
    }

    public void irAMediosDeVentaPorCanal() {
        itemMedioDeVentaPorCanal.click();
    }

    public void buscarCanalComercial(String canalComercial) {
        ingresarDato(txtCanalComercial, canalComercial);
        itemCanalComercial.click();
        botonBuscarMediosDeVenta.click();

    }

    public String validarMediosDeVentaAsociados() {
        String listaObtenida = null;
        if (tablaMediosDeVentaAsociados.isCurrentlyVisible()) {
            listaObtenida = tablaMediosDeVentaAsociados.getText();
        }
        return listaObtenida;
    }

    public void irMenuMedioDeVentaPorCanalNuevo() {
        mnuAcciones.click();
        esperarYClickearBoton(itemMedioDeVentaPorCanalNuevo);
    }

    public void asociarMedioDeVentaAlCanal(String canalComercial, String medioDeVenta) {
        ingresarDato(txtCanal,canalComercial);
        itemCanalComercial.click();
        ingresarDato(txtMedioDeVenta,medioDeVenta);
        itemMedioDeVenta.click();
        esperarYClickearBoton(botonActualizar);
    }

    public void verificarAdiccionMedioDeVentaACanal() {
        withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(labelDatosBasicosMedioDeVenta);
    }
}


