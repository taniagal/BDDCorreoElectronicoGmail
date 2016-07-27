package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class CoberturaGlobalPage extends Guidewire {
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


    public CoberturaGlobalPage(WebDriver driver) {
        super(driver);
    }

    public void irACoberturasGlobales() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(menuItemCoberturaGlobal).waitUntilPresent().click();
    }

    public void navegarPorCobertura(String descripcion, String tipoCobertura){
        botonAgregarCoberturaGeneral.waitUntilPresent().click();
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(campoTxtDescripcion).sendKeys(descripcion);
        selectItem(comboBoxTipoCobertura, tipoCobertura);
        waitUntil(1000);
    }
    public void agregarCoberturasGlobales(String descripcion, String tipoCobertura, String valor, String nombreCobertura) {
        navegarPorCobertura(descripcion, tipoCobertura);
        if("Multiples ubicaciones".equals(tipoCobertura))
            cargarMultiplesUbicaciones(valor);
        else if ("Una cobertura".equals(tipoCobertura))
                cargarCoberturaUnica(nombreCobertura, valor);
        waitUntil(1500);
        botonAceptar.click();
    }

    public void cargarCoberturaUnica(String nombreCobertura, String valor) {
        comboBoxCoberturas.waitUntilPresent();
        selectItem(comboBoxCoberturas, nombreCobertura);
        waitUntil(1000);
        linkCoberturas.click();
        checkBoxGenerico.waitUntilPresent().click();
        campoTxtGenerico.sendKeys(valor);
        linkDetalles.click();
    }

    public void cargarMultiplesUbicaciones(String valor) {
    	waitUntil(1000);
        waitFor(linkCoberturas).click();
        checkBoxDanosMateriales.click();
        campoTxtValorAseguradoDanosMateriales.sendKeys(valor);
        linkDetalles.click();
        linkUbicacionDisponible.waitUntilPresent().click();
    }

    public void verificarCoberturasIncluidas() {
        //withTimeoutOf(10, TimeUnit.SECONDS).waitFor(linkCobertura1).waitUntilPresent().click();
        linkCobertura1.waitUntilVisible().waitUntilClickable().click();
        MatcherAssert.assertThat("Error al Agregar la cobertura", linkCobertura1.isPresent());
    }

    public void verificarUbicacionesCubiertas() {
        List<WebElementFacade> tablaUbicaciones = getLista(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBlanketScreen:CPBlanketPanelSet:CPSuraBlanket:BlanketLocationLV-body']/*/table/tbody/tr");
        MatcherAssert.assertThat("Error al Agregar la ubicacion", !tablaUbicaciones.isEmpty());
    }

    public void seleccionarCoberturaUnica(String descripcion, String tipoCobertura, String nombreCobertura) {
        navegarPorCobertura(descripcion, tipoCobertura);
        comboBoxCoberturas.waitUntilPresent();
        selectItem(comboBoxCoberturas, nombreCobertura);
        waitUntil(1000);
        botonAceptar.click();
        waitUntil(1000);
    }

    public void verificarMensajeError(String mensaje) {
        verificarMensaje(divMensaje,mensaje);
    }
}