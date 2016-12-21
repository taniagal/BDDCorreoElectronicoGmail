package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
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
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(menuItemCoberturaGlobal).waitUntilPresent();
        clickElement(menuItemCoberturaGlobal);
        clickElement(menuItemCoberturaGlobal);
    }

    public void navegarPorCobertura(String descripcion, String tipoCobertura) {
        setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
        botonAgregarCoberturaGeneral.waitUntilPresent().click();
        if (linkDescartarCambios.isPresent()) {
            linkDescartarCambios.click();
            waitUntil(WAIT_TIME_1000);
            botonAgregarCoberturaGeneral.waitUntilPresent().click();
        }
        resetImplicitTimeout();
        waitFor(campoTxtDescripcion).sendKeys(descripcion);
        selectItem(comboBoxTipoCobertura, tipoCobertura);
        waitUntil(WAIT_TIME_1000);
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

    public void validarCamposCoberturasGlobales(String estadouno, String estadodos, ExamplesTable menusesperados) {
        opcionesInformacionPolizaMrcPage.validarCampos(estadouno, estadodos, menusesperados, LBL_OPCION_COBERTURA_GLOBAL_INICIAL, LBL_OPCION_COBERTURA_GLOBAL_FINAL);
    }

    public void agregarCoberturasGlobales(ExamplesTable datosCobertura) {
        Map<String, String> dato = datosCobertura.getRow(0);
        navegarPorCobertura(dato.get("descripcion"), dato.get("tipo_cobertura"));
        if ("Multiples ubicaciones".equals(dato.get("tipo_cobertura"))) {
            cargarMultiplesUbicaciones(dato.get("valor"));
        } else if ("Una cobertura".equals(dato.get("tipo_cobertura"))) {
            cargarCoberturaUnica(dato.get("nombre_cobertura"), dato.get("valor"));
        }
        botonAceptar.click();
    }

    public void cargarCoberturaUnica(String nombreCobertura, String valor) {
        comboBoxCoberturas.waitUntilPresent();
        selectItem(comboBoxCoberturas, nombreCobertura);
        waitUntil(WAIT_TIME_2500);
        linkCoberturas.click();
        checkBoxGenerico.waitUntilPresent().click();
        campoTxtGenerico.sendKeys(valor);
        linkDetalles.click();
        comboBoxCoberturas.waitUntilPresent();
    }

    public void cargarMultiplesUbicaciones(String valor) {
        clickElement(linkCoberturas);
        checkBoxDanosMateriales.click();
        campoTxtValorAseguradoDanosMateriales.sendKeys(valor);
        linkDetalles.click();
        linkUbicacionDisponible.waitUntilPresent().click();
        waitFor(labelDescripcion).shouldContainText("CR 44 A # 45 - 00");
    }

    public void verificarCoberturasIncluidas() {
        linkCobertura1.waitUntilPresent();
        MatcherAssert.assertThat("Error al Agregar la cobertura", linkCobertura1.isPresent());
    }

    public void verificarUbicacionesCubiertas() {
        waitFor(ExpectedConditions.textToBePresentInElement(tablaUbicaciones, "CR 44 A # 45 - 00"));
        MatcherAssert.assertThat("Error al Agregar la ubicacion, la tabla de ubicaciones agregadas está vacía", tablaUbicaciones.containsText("CR 44 A # 45 - 00"));
    }

    public void seleccionarCoberturaUnica(ExamplesTable datosCobertura) {
        Map<String, String> dato = datosCobertura.getRow(0);
        navegarPorCobertura(dato.get("descripcion"), dato.get("tipo_cobertura"));
        comboBoxCoberturas.waitUntilPresent();
        selectItem(comboBoxCoberturas, dato.get("nombre_cobertura"));
        waitUntil(WAIT_TIME_2500);
        botonAceptar.click();
        waitUntil(WAIT_TIME_1000);
    }

    public void seleccionarBotonAceptar() {
        bttonAceptar.waitUntilClickable().click();
    }

    public void ingresarDescripcionDetalleCoberturaGlobal(String descripcion) {
        waitFor(WAIT_TIME_2);
        labelDescripcionCoberturaGlobal.sendKeys(descripcion);
    }

    public void verificarMensajeError(String mensaje) {
        verificarMensaje(divMensaje, mensaje);
    }
}
