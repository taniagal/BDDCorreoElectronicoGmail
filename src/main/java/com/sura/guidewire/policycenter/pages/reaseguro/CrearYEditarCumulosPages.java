package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class CrearYEditarCumulosPages extends PageUtil {

    @FindBy(xpath = ".//td[@id='SubmissionWizard:Reinsurance']/div/span")
    WebElementFacade btnReaseguro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV_tb:ReinsuranceWorksheet-btnInnerEl']")
    WebElementFacade btnCrearAcuerdoFacultativo;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:0-body']/div/table/tbody/tr/td[2]/div")
    WebElementFacade txtIngresaDescripcionAcuerdo;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:Add-btnWrap']")
    WebElementFacade btnAgregarDireccionRiesgoAplicable;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:Add:0:riskbutton']")
    WebElementFacade ListDireccionRiesgoAplicable;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV_tb:Add-btnInnerEl']")
    WebElementFacade btnAgregaInformacionReaseguro;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV:0:reName']")
    WebElementFacade linkNombreReasegurador;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:EditCountry-inputEl']")
    WebElementFacade listPaisSeleccionar;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:Reinsurer-inputEl']")
    WebElementFacade listNombreReaseugurador;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:Update']")
    WebElementFacade btnAceptarReasegurador;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[3]")
    WebElementFacade txtParticipacion;


    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[7]")
    WebElementFacade txtValorDeReaseguro;

    private static final String ALEMANIA = "Alemania";
    private static final String ALLIANZ = "ALLIANZ RE";

    public CrearYEditarCumulosPages(WebDriver driver) {
        super(driver);
    }

    public void ingresarReaseguroOpciones() {
        btnReaseguro.waitUntilPresent();
        btnReaseguro.click();
    }

    public void ingresarAcuerdosFacultativos() {
        btnCrearAcuerdoFacultativo.waitUntilPresent();
        btnCrearAcuerdoFacultativo.click();
    }

    public void ingresarDescripcionDeAcuerdoYDireccion(String descripcionDeAcuerdo) {
        actions.doubleClick(txtIngresaDescripcionAcuerdo).build().perform();
        actions.sendKeys(descripcionDeAcuerdo).build().perform();
        btnAgregarDireccionRiesgoAplicable.click();
        ListDireccionRiesgoAplicable.waitUntilPresent();
        ListDireccionRiesgoAplicable.click();
    }

    public void ingresoInformacionDeReaseguroEnTabla() {
        waitClickInButton(btnAgregaInformacionReaseguro);
        linkNombreReasegurador.waitUntilPresent();
        linkNombreReasegurador.click();
        listPaisSeleccionar.waitUntilClickable();
        selectItem(listPaisSeleccionar, ALEMANIA);
        selectItem(listNombreReaseugurador, ALLIANZ);
        btnAceptarReasegurador.click();

    }

    public void ingresarModalidadDePrima(ExamplesTable datosReaseguradores) {
        

    }
}
