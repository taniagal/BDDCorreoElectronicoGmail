package com.sura.guidewire.policycenter.pages.poliza;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class AdministracionTraspasoDeCarteraPage extends PageUtil {

    private static final String PATHLABELGENERARBATCH = ".//*[@id='BPCCreatePoliciesBatchPopup:ttlBar']";
    private static final String PATHLABELCODIGOAGENTEBUSQUEDA = ".//*[@id='ProducerCodeSearchPopup:ProducerCodeSearchScreen:ttlBar']";
    private static final String PATHLABELBUSCARPOLIZA = ".//*[@id='PolicySearchPopup:PolicySearchScreen:ttlBar']";
    private static final String PATHLABELPOLIZA = ".//*[@id='BPCPoliciesMainPage:ttlBar']";

    @FindBy(xpath = ".//*[@id='BPCPoliciesMainPage:create']")
    private WebElementFacade botonCrearNuevoProceso;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:batchSource-inputEl']")
    private WebElementFacade comboFuenteDelProceso;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:OldOffice-inputEl']")
    private WebElementFacade comboAnteriorOficina;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:NewOffice-inputEl']")
    private WebElementFacade comboNuevaOficina;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:oldProducerCode:SelectoldProducerCode']")
    private WebElementFacade selectorOldProducerCode;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:newProducerCode:SelectnewProducerCode']")
    private WebElementFacade selectorNewProducerCode;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:policy:Selectpolicy']")
    private WebElementFacade selectorNumeroPoliza;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:Update']")
    private WebElementFacade botonSubmitBatch;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:ProducerCodeInformationDV:ProducerInformationLV-body']/*/table/tbody/tr[1]/td[1]")
    private WebElementFacade check;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Add']")
    private WebElementFacade botonAgregarAsesor;
    @FindBy(xpath = ".//*[@id='BPCCreatePoliciesBatchPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Remove']")
    private WebElementFacade botonQuitarAsesor;
    @FindBy(className = "x-grid-cell-inner ")
    private List<WebElementFacade> tsds;

    public AdministracionTraspasoDeCarteraPage(WebDriver driver) {
        super(driver);
    }

    public void clicBotonCrearNuevoProceso() {
        clicObjeto(botonCrearNuevoProceso);
        esperarObjetoClikeableServidor(PATHLABELGENERARBATCH);
    }

    public void clicBotonSubmitBatch() {
        clicObjeto(botonSubmitBatch);
        esperarObjetoClikeableServidor(PATHLABELPOLIZA);
    }

    public void seleccionarFuenteDelTraspaso(String fuenteDelProceso) {
        seleccionarItem(comboFuenteDelProceso, fuenteDelProceso);
        esperarObjetoClikeableServidor(PATHLABELGENERARBATCH);
    }

    public void clicBuscarOldProducerCode() {
        clicObjeto(selectorOldProducerCode);
        esperarObjetoClikeableServidor(PATHLABELCODIGOAGENTEBUSQUEDA);
    }

    public void clicBuscarNumeroPoliza() {
        clicObjeto(selectorNumeroPoliza);
        esperarObjetoClikeableServidor(PATHLABELBUSCARPOLIZA);
    }

    public void clicBuscarNewProducerCode() {
        clicObjeto(selectorNewProducerCode);
        esperarObjetoClikeableServidor(PATHLABELCODIGOAGENTEBUSQUEDA);
    }

    public void seleccionarAnteriorOficinaDeRadicacion(String anteriorOficina) {
        seleccionarItem(comboAnteriorOficina, anteriorOficina);
        esperarObjetoClikeableServidor(PATHLABELGENERARBATCH);
    }

    public void seleccionarNuevaOficinaDeRadicacion(String nuevaOficina) {
        seleccionarItem(comboNuevaOficina, nuevaOficina);
        esperarObjetoClikeableServidor(PATHLABELGENERARBATCH);
    }

    public void esperarPantalla() {
        esperarObjetoClikeableServidor(PATHLABELGENERARBATCH);
    }

    public void modificarCodigoAsesor(String nuevoAsesor) {
        clicObjeto(check);
        clicObjeto(botonQuitarAsesor);
        esperarObjetoClikeableServidor(PATHLABELGENERARBATCH);
        clicObjeto(botonAgregarAsesor);
        esperarObjetoClikeableServidor(PATHLABELGENERARBATCH);
        WebElementFacade celdaRol = $(".//*[@class='x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus']");
        clicObjeto(check);
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        esperarHasta(TIEMPO_300);
        actions.sendKeys(nuevoAsesor).build().perform();
        esperarHasta(TIEMPO_200);
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.sendKeys(Keys.TAB).build().perform();
        esperarHasta(TIEMPO_300);
        actions.sendKeys("100").build().perform();
        actions.sendKeys(Keys.TAB).build().perform();
        esperarHasta(TIEMPO_300);
        celdaRol.clear();
        actions.sendKeys("Lider").build().perform();
        esperarHasta(TIEMPO_500);
        actions.sendKeys(Keys.TAB).build().perform();
        clicObjeto(botonSubmitBatch);
        esperarObjetoClikeableServidor(PATHLABELPOLIZA);
    }

    public String consultarCodigoAsesorActual() {
        WebElementFacade codigoAsesor = getElemento(".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV-body']/*/table/tbody/tr[1]/td[2]");
        return codigoAsesor.getText();
    }

    public void agregarDiaReloj() {
        WebElementFacade textoBuscar = getElemento(".//*[@id='QuickJump-inputEl']");
        textoBuscar.sendKeys(Keys.ALT, Keys.SHIFT, "t");
        esperarObjetoClikeableServidor(".//*[@id='BatchProcessInfo:BatchProcessScreen:ttlBar']");
        WebElementFacade opcionHerramientasInternas = getElemento(".//*[@id='InternalToolsTabBar:UnsupportedToolsTab-btnInnerEl']");
        clicObjeto(opcionHerramientasInternas);
        esperarObjetoClikeableServidor(".//*[@id='Reload:ReloadScreen:ttlBar']");
        WebElementFacade opcionPruebaReloj = getElemento(".//*[@id='UnsupportedTools:MenuLinks:UnsupportedTools_SystemClock']/div");
        clicObjeto(opcionPruebaReloj);
        esperarObjetoClikeableServidor(".//*[@id='SystemClock:SystemClockScreen:ttlBar']");
        WebElementFacade botonAgregarDia = getElemento(".//*[@id='SystemClock:SystemClockScreen:SystemClock_AddDayButton-btnInnerEl']");
        clicObjeto(botonAgregarDia);
        esperarObjetoClikeableServidor(".//*[@id='SystemClock:SystemClockScreen:ttlBar']");
        WebElementFacade botonCambiarFecha = getElemento(".//*[@id='SystemClock:SystemClockScreen:ChangeDate']");
        clicObjeto(botonCambiarFecha);
        esperarObjetoClikeableServidor(".//*[@id='SystemClock:SystemClockScreen:ttlBar']");
    }

    public void ejecutarProceso(String nombreProceso){
        WebElementFacade opcionHerramientasDelServidor = getElemento(".//*[@id='InternalToolsTabBar:ServerToolsTab-btnInnerEl']");
        clicObjeto(opcionHerramientasDelServidor);
        esperarObjetoClikeableServidor(".//*[@id='BatchProcessInfo:BatchProcessScreen:ttlBar']");
        String nombreProcesoEncontrado = "";
        List<WebElementFacade> listaProceso =  getLista(".//*[@id='BatchProcessInfo:BatchProcessScreen:BatchProcessesLV-body']/*/table/tbody/tr");
        for(int i = 0; i < listaProceso.size(); i++) {
            nombreProcesoEncontrado = getElemento(".//*[@id='BatchProcessInfo:BatchProcessScreen:BatchProcessesLV-body']/*/table/tbody/tr["+String.valueOf(i + 1)+"]/td[1]").getText();
            if(nombreProcesoEncontrado.equals(nombreProceso)) {
                WebElementFacade botonEjecutar = getElemento(".//*[@id='BatchProcessInfo:BatchProcessScreen:BatchProcessesLV:"+i+":RunBatchWithoutNotify']");
                clicObjeto(botonEjecutar);
                esperarObjetoClikeableServidor(".//*[@id='BatchProcessInfo:BatchProcessScreen:ttlBar']");
                break;
            }
        }

        WebElementFacade botonAccion = getElemento(".//*[@id='ServerTools:InternalToolsMenuActions-btnIconEl']");
        clicObjeto(botonAccion);
        WebElementFacade botnVolverAPolicyCenter = getElemento(".//*[@id='ServerTools:InternalToolsMenuActions:ReturnToApp-itemEl']");
        actions.moveToElement(botnVolverAPolicyCenter).click().build().perform();
        esperarObjetoClikeableServidor(".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']");
    }
}
