package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;

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
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[6]/div")
    WebElementFacade listFormaCotizacionModalidad;
    @FindBy(xpath = "//input[contains(@class,'x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus')]")
    WebElementFacade txtFormaCotizacionModalidad;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[3]")
    WebElementFacade listPorcParticipacion;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[8]")
    WebElementFacade listcomisionReaseguroCedido;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[9]")
    WebElementFacade listcomisionIntermediario;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[14]")
    WebElementFacade listTasaBrutaDeCesion;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:_msgs']")
    WebElementFacade lblMensajeAdvertencia;

    private static final String PAIS_ALEMANIA = "Alemania";
    private static final String ASEGURA_ALLIANZ = "ALLIANZ RE";
    private static final String VALORENDECIMALES = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[7]";
    private static final String CELDA_VALOR = "//input[contains(@class,'x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus')]";
    private static final double CONSTANTE_UNO = 1;
    private static final double CONSTANTE_CIEN = 100.0;
    private static double valorTasa = 0;
    private static double valorComisionReaseguroCedido = 0;


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
        linkNombreReasegurador.waitUntilPresent();
        linkNombreReasegurador.click();
        listPaisSeleccionar.waitUntilClickable();
        selectItem(listPaisSeleccionar, PAIS_ALEMANIA);
        selectItem(listNombreReaseugurador, ASEGURA_ALLIANZ);
        btnAceptarReasegurador.click();
    }

    public void ingresaParticipacion(ExamplesTable datosReaseguradores) {
        waitAndClickOnButton(btnAgregaInformacionReaseguro);
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        waitAndClickOnButton(listPorcParticipacion);
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("porcentajeParticipacion"));
    }

    public void ingresarComisionYValorReaseguro(ExamplesTable datosReaseguradores) {
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        listcomisionReaseguroCedido.click();
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("comisionReasegurador"));
        waitAndClickOnButton($(VALORENDECIMALES));
        waitUntil(WAIT_TIME_500);
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("valorReaseguro"));
    }

    public void seleccionaModalidadPrima(ExamplesTable datosReaseguradores) {
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        listFormaCotizacionModalidad.click();
        waitUntil(WAIT_TIME_2000);
        $(CELDA_VALOR).clear();
        txtFormaCotizacionModalidad.sendKeys(datoReaseguradores.get("modalidad"));
        waitUntil(WAIT_TIME_2000);
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void ingresaComisionPromotoraEIntermediario(ExamplesTable datosReaseguradores) {
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        waitAndClickOnButton(listcomisionIntermediario);
        $(CELDA_VALOR).clear();
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("comisionIntermediario"));
        actions.sendKeys(Keys.TAB).build().perform();
        waitUntil(WAIT_TIME_500);
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("comisionPromotora"));
        actions.sendKeys(Keys.TAB).build().perform();
    }

    public void validaTasaBrutaDeCesion() {
        MatcherAssert.assertThat("No está el campo tipo de direccion", listTasaBrutaDeCesion.getText().equals($(VALORENDECIMALES).getText()));
    }

    public void validaTasaNetaDeCesion() {
        String tasaObtenida = calculaTasaNetaDeCesionRegla();
        MatcherAssert.assertThat("No está el campo tipo de direccion", listTasaBrutaDeCesion.getText().equals(tasaObtenida));
    }

    public void validaUtilidadesNegativas(String mensaje){
        MatcherAssert.assertThat("No está el campo tipo de direccion", lblMensajeAdvertencia.getText().contains(mensaje));
    }

    public String calculaTasaNetaDeCesionRegla() {
        valorComisionReaseguroCedido = Double.parseDouble(listcomisionReaseguroCedido.getText()) / CONSTANTE_CIEN;
        valorTasa = Double.parseDouble($(VALORENDECIMALES).getText().replace(",", "."));
        double valorTasaBVrutaDeCesion = valorTasa / (CONSTANTE_UNO - valorComisionReaseguroCedido);
        String tasaNetaCesion = Double.toString(valorTasaBVrutaDeCesion).replace(".", ",");
        return tasaNetaCesion;
    }

}
