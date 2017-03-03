package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class CoberturaGlobalPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:CPBlanket']/div")
    private WebElementFacade menuItemCoberturaGlobal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBlanketScreen:CPBlanketPanelSet:CPSuraBlanket_tb:AddBlanket-btnInnerEl']")
    private WebElementFacade botonAgregarCoberturaGeneral;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:Description-inputEl']")
    private WebElementFacade campoTxtDescripcion;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:BlanketType-inputEl']")
    private WebElementFacade comboBoxTipoCobertura;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:suraBlanketCoveragesTab-btnInnerEl']")
    private WebElementFacade linkCoberturas;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:suraBlanketDetailsTab-btnInnerEl']")
    private WebElementFacade linkDetalles;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:1:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxDanosMateriales;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']")
    private WebElementFacade campoTxtValorAseguradoDanosMateriales;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:locations3LV:0:location']")
    private WebElementFacade linkUbicacionDisponible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBlanketScreen:CPBlanketPanelSet:CPSuraBlanket:CPBlanketLV:0:GroupType']")
    private WebElementFacade linkCobertura1;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:coverageSelect-inputEl']")
    private WebElementFacade comboBoxCoberturas;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxGenerico;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']")
    private WebElementFacade campoTxtGenerico;
    @FindBy(id = "WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:_msgs']")
    private WebElementFacade labelMensajeValorComercial;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:locationsBlanLV:0:locationBlanket']")
    private WebElementFacade labelDescripcion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBlanketScreen:CPBlanketPanelSet:CPSuraBlanket:BlanketLocationLV-body']/*/table/tbody/tr[1]/td[2]")
    private WebElementFacade tablaUbicaciones;
    @FindBy(xpath = ".//a[contains(.,'Aceptar')]")
    private WebElementFacade bttonAceptar;
    @FindBy(xpath = ".//*[contains(@id,'CPBlanketSura_ExtPopup:DescriptionMasterPolicy-inputEl')]")
    private WebElementFacade labelDescripcionCoberturaGlobal;
    @FindBy(xpath = ".//a[contains(.,'Descartar cambios no guardados')]")
    private WebElementFacade linkDescartarCambios;

    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage = new OpcionesInformacionPolizaMrcPage(getDriver());
    private static String LBL_OPCIONES_AGREGAR_COBERTURA_GLOBAL_INICIAL = ".//div[contains(@id,'CPBlanketSura_ExtPopup') and contains(@id,'CoverageInputSet:CovPatternInputGroup-legendTitle') and contains(.,'";
    private static String LBL_OPCIONES_AGREGAR_COBERTURA_GLOBAL_FINAL = "')]";
    private static String LBL_PESTAÑA_COBERTURAS_INICIAL = "//label[contains(.,'";
    private static String LBL_PESTAÑA_COBERTURAS_FINAL = "')]";
    private static String LBL_OPCION_COBERTURA_GLOBAL_INICIAL = "//span[contains(.,'";
    private static String LBL_OPCION_COBERTURA_GLOBAL_FINAL = "')]";


    public CoberturaGlobalPage(WebDriver driver) {
        super(driver);
    }

    public void irACoberturasGlobales() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(menuItemCoberturaGlobal).waitUntilPresent();
        clickearElemento(menuItemCoberturaGlobal);
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor($(".message")).waitUntilPresent();
        clickearElemento(menuItemCoberturaGlobal);
    }

    public void navegarPorCobertura(String descripcion, String tipoCobertura) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonAgregarCoberturaGeneral).waitUntilPresent();
        botonAgregarCoberturaGeneral.click();
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (linkDescartarCambios.isPresent()) {
            linkDescartarCambios.click();
            esperarHasta(TIEMPO_1000);
            botonAgregarCoberturaGeneral.waitUntilPresent().click();
        }
        resetImplicitTimeout();
        waitFor(campoTxtDescripcion).sendKeys(descripcion);
        seleccionarItem(comboBoxTipoCobertura, tipoCobertura);
        esperarHasta(TIEMPO_1000);
    }

    public void ingresarAgregarCoberturaGlobal() {
        botonAgregarCoberturaGeneral.waitUntilPresent().click();
    }

    public void validarCamposAgregarCobertura(String estadouno, String estadodos, ExamplesTable menusesperados) {
        opcionesInformacionPolizaMrcPage.validarCampos(estadouno, estadodos, menusesperados, LBL_OPCIONES_AGREGAR_COBERTURA_GLOBAL_INICIAL, LBL_OPCIONES_AGREGAR_COBERTURA_GLOBAL_FINAL);
    }

    public void validarCamposPestañaCoberturas(String estadouno, String estadodos, ExamplesTable menusesperados) {
        opcionesInformacionPolizaMrcPage.validarCampos(estadouno, estadodos, menusesperados, LBL_PESTAÑA_COBERTURAS_INICIAL, LBL_PESTAÑA_COBERTURAS_FINAL);
    }

    public void validarCamposCoberturasGlobales(String estadouno,ExamplesTable menusesperados) {
        opcionesInformacionPolizaMrcPage.validarCampos(estadouno,menusesperados, LBL_OPCION_COBERTURA_GLOBAL_INICIAL, LBL_OPCION_COBERTURA_GLOBAL_FINAL);
    }

    public void cargarCoberturaUnica(String nombreCobertura, String valor) {
        comboBoxCoberturas.waitUntilPresent();
        seleccionarItem(comboBoxCoberturas, nombreCobertura);
        esperarHasta(TIEMPO_2500);
        linkCoberturas.click();
        checkBoxGenerico.waitUntilPresent().click();
        campoTxtGenerico.sendKeys(valor);
        linkDetalles.click();
        comboBoxCoberturas.waitUntilPresent();
    }

    public void cargarMultiplesUbicaciones(String valor) {
        clickearElemento(linkCoberturas);
        checkBoxDanosMateriales.click();
        campoTxtValorAseguradoDanosMateriales.sendKeys(valor);
        linkDetalles.click();
        linkUbicacionDisponible.waitUntilPresent().click();
        waitFor(labelDescripcion).shouldContainText("CR 44 A # 45 - 00");
    }

    public void seleccionarBotonAceptar() {
        bttonAceptar.waitUntilClickable().click();
    }

    public void ingresarDescripcionDetalleCoberturaGlobal(String descripcion) {
        esperarHasta(TIEMPO_2000);
        try {
            labelDescripcionCoberturaGlobal.sendKeys(descripcion);
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisibleException " + e);
            esperarHasta(TIEMPO_2000);
            labelDescripcionCoberturaGlobal.sendKeys(descripcion);
        } catch (StaleElementReferenceException f) {
            LOGGER.info("StaleElementReferenceException " + f);
            esperarHasta(TIEMPO_2000);
            labelDescripcionCoberturaGlobal.sendKeys(descripcion);
        }
    }

    public void verificarMensajeErrorValorComercial(String mensaje) {
        verificarMensaje(labelMensajeValorComercial,mensaje);
    }
}
