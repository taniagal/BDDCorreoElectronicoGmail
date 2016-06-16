package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.steps.CoberturaGlobalSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;


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
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:locations3LV_header']")
    private WebElementFacade labelUbicacionPoliza;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='CPBlanketSura_ExtPopup:locations3LV:0:location']")
    private WebElementFacade linkUbicacionDisponible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBlanketScreen:CPBlanketPanelSet:CPSuraBlanket:BlanketCovLV:0:Description']")
    private WebElementFacade linkCobertura1;


    public CoberturaGlobalPage(WebDriver driver){
        super(driver);
    }

    public void irACoberturasGlobales(){
        menuItemCoberturaGlobal.click();
    }

    public void agregarCoberturasGlobales(String descripcion, String tipoCobertura, String valor){
        botonAgregarCoberturaGeneral.waitUntilPresent().click();
        campoTxtDescripcion.sendKeys(descripcion);
        selectItem(comboBoxTipoCobertura,tipoCobertura);
        waitABit(1000);
        linkCoberturas.click();
        checkBoxDanosMateriales.click();
        campoTxtValorAseguradoDanosMateriales.sendKeys(valor);
        linkDetalles.click();
        if(tipoCobertura.equals("Multiples ubicaciones"))
            linkUbicacionDisponible.waitUntilPresent().click();
        waitABit(1000);
        botonAceptar.click();
    }

    public void verificarCoberturasIncluidas() {
        assertThat("Error al Agregar la cobertura",linkCobertura1.isPresent());
    }

    public void verificarUbicacionesCubiertas() {
        List<WebElementFacade> tablaUbicaciones = withTimeoutOf(5, TimeUnit.SECONDS).findAll(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBlanketScreen:CPBlanketPanelSet:CPSuraBlanket:BlanketLocationLV-body']/*/table/tbody");
        assertThat("Error al Agregar la ubicacion",tablaUbicaciones.size() > 0 );
    }
}

