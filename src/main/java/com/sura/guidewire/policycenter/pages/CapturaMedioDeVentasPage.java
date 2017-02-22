package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CapturaMedioDeVentasPage extends PageUtil {
    @FindBy(xpath = ".//*[@id=':tabs-menu-trigger-btnIconEl']")
    private WebElementFacade menuAdministracion;
    @FindBy(xpath = "//div[5]/div/div[2]/div/div/a/span")
    private WebElementFacade itemAdministracion;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext']/div/span")
    private WebElementFacade itemConfiguracionRedComercial;
    @FindBy(xpath = "//div[contains(.,'CanalesMedios de ventaOficinas por canal')]")
    private WebElementFacade tablaMediosVenta;
    @FindBy(xpath = "html/body/div[1]/div[2]/div/span/div/div[3]/div[2]/div/table/tbody/tr[7]/td/div/span")
    private WebElementFacade menuItemCanales;
    @FindBy(xpath = ".//*[@id='AdminSaleMethodSearchPage_Ext:0']")
    private WebElementFacade tablaCanalMedioDeVenta;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext:CommercialNetwork_Ext_AdminSaleMethodSearchPage_Ext']/div")
    private WebElementFacade menuItemMedioDeVenta;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_CommercialNetwork_Ext:CommercialNetwork_Ext_AdminOfficeSalesNetworkSearchPage_Ext']/div")
    private WebElementFacade menuItemOficinasPorCanal;
    @FindBy(xpath = ".//*[@id='AdminOfficeSalesNetworkSearchPage_Ext:0']")
    private WebElementFacade tablaCanalOficina;
    @FindBy(xpath = "//a[contains(.,'Buscar')]")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = "//a[contains(.,'Restablecer')]")
    private WebElementFacade botonRestablecer;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div")
    private WebElementFacade tablaCanal;

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
        }
        return listaObtenida;
    }
}


