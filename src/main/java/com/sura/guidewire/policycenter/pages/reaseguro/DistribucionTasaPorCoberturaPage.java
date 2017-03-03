package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.Map;

public class DistribucionTasaPorCoberturaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV:0:reName']")
    WebElementFacade linkNombreReaseguradorUno;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV:1:reName']")
    WebElementFacade linkNombreReaseguradorDos;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:EditCountry-inputEl']")
    WebElementFacade listPaisSeleccionar;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:Reinsurer-inputEl']")
    WebElementFacade listNombreReaseugurador;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:Update']")
    WebElementFacade btnAceptarReasegurador;


    public static final String XPATH_TABLA_INFORMACION_REASEGURADORES = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr";
    private static final String PAIS_ALEMANIA = "Alemania";
    private static final String PAIS_ESTADOS_UNIDOS = "Estados Unidos";
    private static final String ASEGURADORA_ALLIANZ = "ALLIANZ RE";
    private static final String ASEGURADORA_MAIDEN_RE = "MAIDEN RE";


    public DistribucionTasaPorCoberturaPage(WebDriver driver) {
        super(driver);
    }


    public void ingresoInformacionDePrimerAsegurado() {
        linkNombreReaseguradorUno.click();
        listPaisSeleccionar.waitUntilClickable();
        seleccionarItem(listPaisSeleccionar, PAIS_ALEMANIA);
        seleccionarItem(listNombreReaseugurador, ASEGURADORA_ALLIANZ);
        clickearElemento(btnAceptarReasegurador);
    }

    public void ingresoInformacionDeSegundoAsegurado() {
        linkNombreReaseguradorDos.click();
        listPaisSeleccionar.waitUntilClickable();
        seleccionarItem(listPaisSeleccionar, PAIS_ESTADOS_UNIDOS);
        seleccionarItem(listNombreReaseugurador, ASEGURADORA_MAIDEN_RE);
        clickearElemento(btnAceptarReasegurador);
    }

    public void AgregarReaseguradoresATabla(ExamplesTable infoReasegurador) {
        for (Map<String, String> dato : infoReasegurador.getRows()) {
            JOptionPane.showMessageDialog(null, dato.get("modalidad"));
            JOptionPane.showMessageDialog(null, dato.get("porcentajeParticipacion"));
            JOptionPane.showMessageDialog(null, dato.get("valorReaseguro"));
            JOptionPane.showMessageDialog(null, dato.get("comisionReasegurador"));
            JOptionPane.showMessageDialog(null, dato.get("comisionIntermediario"));
            JOptionPane.showMessageDialog(null, dato.get("comisionPromotora"));
            JOptionPane.showMessageDialog(null, dato.get("comisionIntermediario"));
        }
    }
}

