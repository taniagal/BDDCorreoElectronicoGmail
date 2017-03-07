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

public class BusquedaDeRiesgosPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_RiskSearch_Ext']/div/span")
    private WebElementFacade opcionRiesgos;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:policyLine-inputEl']")
    private WebElementFacade comboProducto;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:searchPolicy-inputEl']")
    private WebElementFacade comboPais;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:state-inputEl']")
    private WebElementFacade comboDepartamento;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:city-inputEl']")
    private WebElementFacade comboCiudad;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:lisencePlate-inputEl']")
    private WebElementFacade campoPlaca;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:contractNumber-inputEl']")
    private WebElementFacade campoContrato;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:address-inputEl']")
    private WebElementFacade campoDireccion;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    private WebElementFacade botonRestablecer;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']")
    private WebElementFacade tablaDeResultados;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[1]/div")
    private WebElementFacade tablaCampoTipoPoliza;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[2]/div")
    private WebElementFacade tablaCampoNumeroPoliza;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[3]/div")
    private WebElementFacade tablaCampoPlaca;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[3]/div")
    private WebElementFacade tablaCampoDireccion;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[4]/div")
    private WebElementFacade tablaCampoAsegurado;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[6]/div")
    private WebElementFacade tablaCampoFechaVigencia;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[5]/div")
    private WebElementFacade tablaCampoFechaVigenciaMrc;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[6]/div")
    private WebElementFacade tablaCampoFechaVencimiento;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[5]/div")
    private WebElementFacade tablaCampoEstado;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[4]/div")
    private WebElementFacade tablaCampoEstadoMrc;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[8]/div")
    private WebElementFacade tablaCampoContratoAutos;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV-body']/*/table/tbody/tr[1]/td[7]/div")
    private WebElementFacade tablaCampoContratoMrc;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV:0:LicensePlate']")
    private WebElementFacade linkPlaca;
    @FindBy(xpath = ".//*[@id='RiskSearch_Ext:RiskSearch_ExtScreen:RiskSearch_ExtPanelSet:resultsLV:0:PolicyNumber']")
    private WebElementFacade linkPoliza;
    @FindBy(xpath = "//span[contains(text(), 'Vehículos')]")
    private WebElementFacade menuBotonVehiculo;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Vehicles:PolicyFile_PersonalAuto_VehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade campoPlacaVehiculos;


    public BusquedaDeRiesgosPage(WebDriver driver) {
        super(driver);
    }

    public void clicEnLaOpcionBuscar() {
        campoTxtBuscar.sendKeys("Search");
        campoTxtBuscar.sendKeys(Keys.ENTER);
        waitForTextToAppear("Buscar pólizas");
    }

    public void seleccionarLaOpcionRiesgos() {
        opcionRiesgos.waitUntilPresent();
        super.clickearElemento(opcionRiesgos);
        waitForTextToAppear("Buscar riesgos");
    }

    public void seleccionarCampo(ExamplesTable filtros, WebElementFacade campo, String tag) {
        Map<String, String> datos = filtros.getRows().get(0);
        campo.waitUntilPresent();
        super.seleccionarItem(campo, datos.get(tag));
    }

    public void ingresarBusqueda(ExamplesTable filtros, WebElementFacade campo, String tag) {
        Map<String, String> datos = filtros.getRows().get(0);
        campo.waitUntilPresent();
        super.ingresarDato(campo, datos.get(tag));
    }

    public void ingresarPlaca(ExamplesTable filtros) {
        ingresarBusqueda(filtros, campoPlaca, "placa");
    }


    public void ingresarContrato(ExamplesTable filtros) {
        ingresarBusqueda(filtros, campoContrato, "contrato");
    }

    public void ingresarDireccion(ExamplesTable filtros) {
        ingresarBusqueda(filtros, campoDireccion, "direccion");
    }

    public void seleccionarProducto(ExamplesTable filtros) {
        seleccionarCampo(filtros, comboProducto, "producto");
    }

    public void seleccionarPais(ExamplesTable filtros) {
        seleccionarCampo(filtros, comboPais, "pais");
    }

    public void seleccionarDepartamento(ExamplesTable filtros) {
        seleccionarCampo(filtros, comboDepartamento, "departamento");
    }

    public void seleccionarCiudad(ExamplesTable filtros) {
        seleccionarCampo(filtros, comboCiudad, "ciudad");
    }


    public void validarDatosDeTabla() {
        waitForTextToDisappear("No hay datos para mostrar");
        tablaDeResultados.waitUntilPresent();
        MatcherAssert.assertThat(tablaCampoNumeroPoliza.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(tablaCampoAsegurado.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(tablaCampoFechaVigencia.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(tablaCampoFechaVencimiento.getText(), Is.is(Matchers.notNullValue()));
    }

    public void validarDatosDeTablaMrc() {
        waitForTextToDisappear("No hay datos para mostrar");
        tablaDeResultados.waitUntilPresent();
        MatcherAssert.assertThat(tablaCampoNumeroPoliza.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(tablaCampoFechaVigenciaMrc.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(tablaCampoFechaVencimiento.getText(), Is.is(Matchers.notNullValue()));
    }

    public String obtenerPlaca() {
        tablaCampoPlaca.waitUntilPresent();
        return tablaCampoPlaca.getText();
    }

    public String obtenerTipoDePoliza() {
        tablaCampoTipoPoliza.waitUntilPresent();
        return tablaCampoTipoPoliza.getText();
    }

    public String obtenerEstado() {
        tablaCampoEstado.waitUntilPresent();
        return tablaCampoEstado.getText();
    }

    public String obtenerEstadoMrc() {
        tablaCampoEstadoMrc.waitUntilPresent();
        return tablaCampoEstadoMrc.getText();
    }

    public String obtenerDireccion() {
        tablaCampoDireccion.waitUntilPresent();
        return tablaCampoDireccion.getText();
    }

    public void clicEnBuscar() {
        botonBuscar.waitUntilPresent();
        super.clickearElemento(botonBuscar);
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
        linkPlaca.waitUntilPresent();
        linkPlaca.click();
    }

    public String validarConsultaDePolizaDesdeLaConsultaDeRiesgos() {
        waitForTextToAppear("Resumen");
        menuBotonVehiculo.waitUntilPresent().click();
        campoPlacaVehiculos.waitUntilPresent();
        return campoPlacaVehiculos.getText();
    }

    public void clickEnElLinkPoliza() {
        linkPoliza.waitUntilPresent();
        linkPoliza.click();
        waitForTextToAppear("Resumen");
    }

    public String obtenerContratoAutos() {
        tablaCampoContratoAutos.waitUntilPresent();
        return tablaCampoContratoAutos.getText();
    }

    public String obtenerContratoMrc() {
        tablaCampoContratoMrc.waitUntilPresent();
        return tablaCampoContratoMrc.getText();
    }
}
