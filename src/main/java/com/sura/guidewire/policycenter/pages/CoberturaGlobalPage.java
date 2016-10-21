package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.Commons;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;


public class CoberturaGlobalPage extends Commons {
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


    public CoberturaGlobalPage(WebDriver driver) {
        super(driver);
    }

    public void irACoberturasGlobales() {
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(menuItemCoberturaGlobal).waitUntilPresent().click();
    }

    public void navegarPorCobertura(String descripcion, String tipoCobertura){
        botonAgregarCoberturaGeneral.waitUntilPresent().click();
        waitFor(campoTxtDescripcion).sendKeys(descripcion);
        selectItem(comboBoxTipoCobertura, tipoCobertura);
        waitUntil(1000);
    }
    public void agregarCoberturasGlobales(ExamplesTable datosCobertura) {
        Map<String, String> dato = datosCobertura.getRow(0);
        navegarPorCobertura(dato.get("descripcion"), dato.get("tipo_cobertura"));
        if("Multiples ubicaciones".equals(dato.get("tipo_cobertura"))) {
            cargarMultiplesUbicaciones(dato.get("valor"));
        }
        else if ("Una cobertura".equals(dato.get("tipo_cobertura"))) {
            cargarCoberturaUnica(dato.get("nombre_cobertura"), dato.get("valor"));
        }
        botonAceptar.click();
    }

    public void cargarCoberturaUnica(String nombreCobertura, String valor) {
        comboBoxCoberturas.waitUntilPresent();
        selectItem(comboBoxCoberturas, nombreCobertura);
        waitUntil(2500);
        linkCoberturas.click();
        checkBoxGenerico.waitUntilPresent().click();
        campoTxtGenerico.sendKeys(valor);
        linkDetalles.click();
        comboBoxCoberturas.waitUntilPresent();
    }

    public void cargarMultiplesUbicaciones(String valor) {
        linkCoberturas.click();
        checkBoxDanosMateriales.click();
        campoTxtValorAseguradoDanosMateriales.sendKeys(valor);
        linkDetalles.click();
        linkUbicacionDisponible.waitUntilPresent().click();
        waitFor(labelDescripcion).shouldContainText("CRA 65");
    }

    public void verificarCoberturasIncluidas() {
        linkCobertura1.waitUntilPresent();
        MatcherAssert.assertThat("Error al Agregar la cobertura", linkCobertura1.isPresent());
    }

    public void verificarUbicacionesCubiertas() {
        waitFor(ExpectedConditions.textToBePresentInElement(tablaUbicaciones,"CRA 65 # 48-162"));
        MatcherAssert.assertThat("Error al Agregar la ubicacion, la tabla de ubicaciones agregadas está vacía", tablaUbicaciones.containsText("CRA 65 # 48-162"));
    }

    public void seleccionarCoberturaUnica(ExamplesTable datosCobertura) {
        Map<String, String> dato = datosCobertura.getRow(0);
        navegarPorCobertura(dato.get("descripcion"), dato.get("tipo_cobertura"));
        comboBoxCoberturas.waitUntilPresent();
        selectItem(comboBoxCoberturas, dato.get("nombre_cobertura"));
        waitUntil(2500);
        botonAceptar.click();
        waitUntil(1000);
    }

    public void verificarMensajeError(String mensaje) {
        verificarMensaje(divMensaje,mensaje);
    }
}
