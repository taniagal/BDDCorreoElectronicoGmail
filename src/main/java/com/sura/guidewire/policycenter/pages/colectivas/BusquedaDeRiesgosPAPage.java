package com.sura.guidewire.policycenter.pages.colectivas;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BusquedaDeRiesgosPAPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_RiskSearch_Ext']/div/span")
    private WebElementFacade opcionRiesgos;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:policyLine-inputEl']")
    private WebElementFacade comboProducto;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:searchPolicy-inputEl']")
    private WebElementFacade campoPlaca;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    private WebElementFacade botonRestablecer;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']")
    private WebElementFacade tablaDeResultados;


    public BusquedaDeRiesgosPAPage(WebDriver driver) {
        super(driver);
    }

    public void clicEnLaOpcionBuscar() {
        campoTxtBuscar.sendKeys("Search");
        campoTxtBuscar.sendKeys(Keys.ENTER);
        waitForTextToAppear("Buscar pólizas");
    }

    public void seleccionarLaOpcionRiesgos() {
        opcionRiesgos.waitUntilPresent();
        clickearElemento(opcionRiesgos);
        waitForTextToAppear("Buscar riesgos");
    }

    public void seleccionarProducto(ExamplesTable filtros) {
        Map<String, String> datos = filtros.getRows().get(0);
        seleccionarItem(comboProducto, datos.get("producto"));
    }

    public void ingresarPlaca(ExamplesTable filtros) {
        Map<String, String> datos = filtros.getRows().get(0);
        campoPlaca.sendKeys(datos.get("placa"));
    }

    public void validarDatosDeTabla() {
        final String xpath1 = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[";
        final String xpath2 = "]/div";
        String dato;
        for (int i = 1; i == 7; i++) {
            dato = findBy(xpath1 + i + xpath2).getText();
            MatcherAssert.assertThat(dato, Is.is(Matchers.notNullValue()));
        }
    }

    public String obtenerPlaca() {
        WebElementFacade placa = findBy(".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[3]/div");
        return placa.getText();
    }

    public String obtenerTipoDePoliza() {
        WebElementFacade placa = findBy(".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[1]/div");
        return placa.getText();
    }

    public void clicEnBuscar() {
        clickearElemento(botonBuscar);
        tablaDeResultados.waitUntilPresent();
    }

    public void clicEnElBotonRestablecer() {
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        if (botonRestablecer.isVisible()) {
            clickearElemento(botonRestablecer);
            waitFor(ExpectedConditions.attributeContains(campoPlaca, "value", ""));
        }
        resetImplicitTimeout();
    }

    public void clickEnElLinkPlaca() {
        WebElementFacade linkPlaca = findBy(".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV:0:LicensePlate']");
        linkPlaca.click();
    }

    public String validarConsultaDePolizaDesdeLaConsultaDeRiesgos() {
        waitForTextToAppear("Resumen");
        findBy(".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_Vehicles']/div").click();
        WebElementFacade campoPlaca = findBy(".//*[@id='PolicyFile_PersonalAuto_Vehicles:PolicyFile_PersonalAuto_VehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']");
        return campoPlaca.getText();
    }

    public void clickEnElLinkPoliza() {
        WebElementFacade linkPoliza = findBy(".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV:0:PolicyNumber']");
        linkPoliza.click();
        waitForTextToAppear("Resumen");
    }
}
