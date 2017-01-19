package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.*;

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
    WebElementFacade listDireccionRiesgoAplicable;
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
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[10]")
    WebElementFacade listcomisionPromotora;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[14]")
    WebElementFacade listTasaBrutaDeCesion;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:0-body']/div/table/tbody/tr/td[5]")
    WebElementFacade listValorExpuestoRiesgo;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:_msgs']")
    WebElementFacade lblMensajeAdvertencia;

    private static final String PAIS_ALEMANIA = "Alemania";
    private static final String ASEGURA_ALLIANZ = "ALLIANZ RE";
    private static final String VALOR = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[7]";
    private static final String CELDA_VALOR = "//input[contains(@class,'x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus')]";
    private static final double CONSTANTE_UNO = 1;
    private static final double CONSTANTE_CIEN = 100.0;
    private static final int CONSTANTE_MIL = 1000;
    private static double valorTasa = 0;
    private static double valorComisionReaseguroCedido = 0;
    private static double valorExpuesto = 0;


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
        listDireccionRiesgoAplicable.waitUntilPresent();
        listDireccionRiesgoAplicable.click();
    }

    public void ingresoInformacionDeReaseguroEnTabla() {
        linkNombreReasegurador.waitUntilPresent();
        linkNombreReasegurador.click();
        listPaisSeleccionar.waitUntilClickable();
        seleccionarItem(listPaisSeleccionar, PAIS_ALEMANIA);
        seleccionarItem(listNombreReaseugurador, ASEGURA_ALLIANZ);
        clickearElemento(btnAceptarReasegurador);
    }

    public void ingresaParticipacion(ExamplesTable datosReaseguradores) {
        esperarYClickearBoton(btnAgregaInformacionReaseguro);
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        esperarYClickearBoton(listPorcParticipacion);
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("porcentajeParticipacion"));
    }

    public void ingresarComisionYValorReaseguro(ExamplesTable datosReaseguradores) {
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        listcomisionReaseguroCedido.click();
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("comisionReasegurador"));
        actions.sendKeys(Keys.TAB).build().perform();
        esperarYClickearBoton($(VALOR));
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("valorReaseguro"));
        actions.sendKeys(Keys.TAB).build().perform();
    }

    public void seleccionaModalidadPrima(ExamplesTable datosReaseguradores) {
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        try {
            clickearElemento(listFormaCotizacionModalidad);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            esperarHasta(TIEMPO_2000);
            clickearElemento(listFormaCotizacionModalidad);
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisibleException " + e);
            esperarHasta(TIEMPO_2000);
            clickearElemento(listFormaCotizacionModalidad);
        }
        esperarHasta(TIEMPO_2000);
        $(CELDA_VALOR).clear();
        txtFormaCotizacionModalidad.sendKeys(datoReaseguradores.get("modalidad"));
        esperarHasta(TIEMPO_2000);
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void ingresaComisionPromotoraEIntermediario(ExamplesTable datosReaseguradores) {
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        esperarYClickearBoton(listcomisionIntermediario);
        $(CELDA_VALOR).clear();
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("comisionIntermediario"));
        actions.sendKeys(Keys.TAB).build().perform();
        esperarYClickearBoton(listcomisionPromotora);
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("comisionPromotora"));
        actions.sendKeys(Keys.TAB).build().perform();
    }

    public String calculaTasaNetaDeCesionRegla() {
        try {
            listcomisionReaseguroCedido.waitUntilPresent();
            valorComisionReaseguroCedido = Double.parseDouble(listcomisionReaseguroCedido.getText()) / CONSTANTE_CIEN;
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            listcomisionReaseguroCedido.waitUntilPresent();
            esperarHasta(TIEMPO_1000);
            valorComisionReaseguroCedido = Double.parseDouble(listcomisionReaseguroCedido.getText()) / CONSTANTE_CIEN;
        }
        valorTasa = Double.parseDouble($(VALOR).getText().replace(",", "."));
        double valorTasaBrutaDeCesion = valorTasa / (CONSTANTE_UNO - valorComisionReaseguroCedido);
        return Double.toString(valorTasaBrutaDeCesion).replace(".", ",");
    }

    public String calculaPrimaBrutaDeCesionRegla() {
        String[] valorExpuestoCadena = listValorExpuestoRiesgo.getText().split(",");
        valorExpuesto = Integer.parseInt(valorExpuestoCadena[0].substring(1).replaceAll("\\.", ""));
        valorTasa = Double.parseDouble($(VALOR).getText().replaceAll("\\.", ""));
        double valorPrimaBrutaDeCesion = (valorTasa / valorExpuesto) * CONSTANTE_MIL;
        return Double.toString(valorPrimaBrutaDeCesion).replace(".", ",");
    }

    public void validaTasaBrutaDeCesion() {
        try {
            listTasaBrutaDeCesion.waitUntilPresent();
            MatcherAssert.assertThat("Error no coincide el valor de tasa bruta: ", listTasaBrutaDeCesion.getText().equals($(VALOR).getText()));
        } catch (NoSuchElementException e) {
            LOGGER.info("NoSuchElementException " + e);
            WebElementFacade listTasaBrutaDeCesion = $(".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[14]");
            esperarHasta(TIEMPO_2000);
            listTasaBrutaDeCesion.waitUntilPresent();
            MatcherAssert.assertThat("Error no coincide el valor de tasa bruta: ", listTasaBrutaDeCesion.getText().equals($(VALOR).getText()));
        } catch (StaleElementReferenceException f) {
            LOGGER.info("StaleElementReferenceException " + f);
            WebElementFacade listTasaBrutaDeCesion = $(".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[14]");
            esperarHasta(TIEMPO_2000);
            listTasaBrutaDeCesion.waitUntilPresent();
            MatcherAssert.assertThat("Error no coincide el valor de tasa bruta: ", listTasaBrutaDeCesion.getText().equals($(VALOR).getText()));
        }
    }

    public void validaTasaNetaDeCesion() {
        MatcherAssert.assertThat("Error no coincide el valor de tasa neta", listTasaBrutaDeCesion.getText().equals(calculaTasaNetaDeCesionRegla()));
    }

    public void validaPrimaBrutaDeCesion() {
        try {
            MatcherAssert.assertThat("Error no coincide el valor de tasa neta", listTasaBrutaDeCesion.getText().equals(calculaPrimaBrutaDeCesionRegla()));
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            MatcherAssert.assertThat("Error no coincide el valor de tasa neta", listTasaBrutaDeCesion.getText().equals(calculaPrimaBrutaDeCesionRegla()));
        }
    }

    public void validaUtilidadesNegativas(String mensaje) {
        MatcherAssert.assertThat("error debe mostar un mensaje con utilidades negativa", lblMensajeAdvertencia.getText().contains(mensaje));
    }

}
