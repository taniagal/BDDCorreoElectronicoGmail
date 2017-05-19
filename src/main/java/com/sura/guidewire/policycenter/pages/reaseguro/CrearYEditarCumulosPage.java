package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CrearYEditarCumulosPage extends PageUtil {
    @FindBy(xpath = ".//td[@id='SubmissionWizard:Reinsurance']/div/span")
    WebElementFacade btnReaseguro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV_tb:ReinsuranceWorksheet-btnInnerEl']")
    WebElementFacade btnCrearAcuerdoFacultativo;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:0-body']/div/table/tbody/tr/td[2]/div")
    WebElementFacade txtIngresaDescripcionAcuerdo;
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
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[5]/div")
    WebElementFacade listFormaCotizacionModalidad;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[3]")
    WebElementFacade listPorcParticipacion;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[7]")
    WebElementFacade listcomisionReaseguroCedido;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[8]")
    WebElementFacade listcomisionIntermediario;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[9]")
    WebElementFacade listcomisionPromotora;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[13]")
    WebElementFacade listTasaBrutaDeCesion;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:0-body']/div/table/tbody/tr/td[5]")
    WebElementFacade listValorExpuestoRiesgo;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:_msgs']")
    WebElementFacade lblMensajeAdvertencia;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:Add-btnWrap']")
    WebElementFacade btnAgreagarRiesgos;
    @FindBy(xpath = ".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Reinsurance']/div")
    WebElementFacade menuReaseguro;

    private static final String PAIS_ALEMANIA = "Alemania";
    private static final String ASEGURADORA_MUNCHENER = "Munchener Ruckversicherungs-Gesellschaft";
    private static final String VALOR = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr/td[6]";
    private static final String CELDA_VALOR = "//input[@class='x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus']";
    private static final double CONSTANTE_UNO = 1;
    private static final double CONSTANTE_CIEN = 100.0;
    private static final int CONSTANTE_MIL = 1000;
    private double valorTasa = 0;


    public CrearYEditarCumulosPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarReaseguroOpciones() {
        btnReaseguro.waitUntilPresent();
        esperarObjetoClikeableServidorWe(btnReaseguro);
    }

    public void clicMenuReaseguro() {
        menuReaseguro.waitUntilPresent();
        esperarObjetoClikeableServidorWe(menuReaseguro);
    }

    public void ingresarAcuerdosFacultativos() {
        btnCrearAcuerdoFacultativo.waitUntilPresent();
        btnCrearAcuerdoFacultativo.click();
    }

    public void ingresarDescripcionDeAcuerdoYDireccion(String descripcionDeAcuerdo) {
        withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(txtIngresaDescripcionAcuerdo).waitUntilClickable();
        actions.doubleClick(txtIngresaDescripcionAcuerdo).build().perform();
        actions.sendKeys(descripcionDeAcuerdo).build().perform();
        ingresaCantidadDeCoberturas();
    }

    public void ingresaCantidadDeCoberturas() {
        String riesgosConDireccion = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:Add:0:riskbutton']";
        setImplicitTimeout(0, TimeUnit.SECONDS);
        while (btnAgreagarRiesgos.isVisible()) {
            clickearElemento(btnAgreagarRiesgos, TIEMPO_4);
            clickearElemento($(riesgosConDireccion), TIEMPO_4);

        }
        resetImplicitTimeout();
    }

    public void ingresoInformacionDeReaseguroEnTabla() {
        try {
            $(CELDA_VALOR).sendKeys(Keys.SHIFT, Keys.TAB);
            esperarHasta(TIEMPO_2000);
            linkNombreReasegurador.click();
        } catch (StaleElementReferenceException e) {
            LOGGER.error("StaleElementReferenceException " + e);
            esperarHasta(TIEMPO_1000);
            linkNombreReasegurador.click();
        }
        listPaisSeleccionar.waitUntilPresent();
        seleccionarItem(listPaisSeleccionar, PAIS_ALEMANIA);
        seleccionarItem(listNombreReaseugurador, ASEGURADORA_MUNCHENER);
        clickearElemento(btnAceptarReasegurador);
    }

    public void ingresaParticipacion(ExamplesTable datosReaseguradores) {
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        datoReaseguradores.get("porcentajeParticipacion");
        esperarYClickearBoton(btnAgregaInformacionReaseguro);
        esperarYClickearBoton(listPorcParticipacion);
        $(CELDA_VALOR).sendKeys(datoReaseguradores.get("porcentajeParticipacion"));
    }

    public void ingresarComisionYValorReaseguro(ExamplesTable datosReaseguradores) {
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        ingresaValorEntabla(listcomisionReaseguroCedido, datoReaseguradores.get("comisionReasegurador"));
        ingresaValorEntabla(listcomisionIntermediario, datoReaseguradores.get("comisionIntermediario"));
    }

    public void seleccionaModalidadPrima(ExamplesTable datosReaseguradores) {
        Map<String, String> datoReaseguradores = datosReaseguradores.getRow(0);
        ingresaValorEntabla(listFormaCotizacionModalidad, datoReaseguradores.get("modalidad"));
        ingresaValorEntabla($(VALOR), datoReaseguradores.get("valorReaseguro"));
        ingresaValorEntabla(listcomisionPromotora, datoReaseguradores.get("comisionPromotora"));
    }

    public void ingresaValorEntabla(WebElementFacade xpathCampo, String textoAEscribir) {
        boolean clickEnTabla = false;
        int maximoEjecuciones = CONSTANTE_2;
        int ejecuciones = 0;
        while (ejecuciones < maximoEjecuciones && !clickEnTabla) {
            esperarYClickearBoton(xpathCampo);
            if ($(CELDA_VALOR).isPresent()) {
                $(CELDA_VALOR).clear();
                $(CELDA_VALOR).sendKeys(textoAEscribir);
                esperarHasta(TIEMPO_500);
                actions.sendKeys(Keys.SHIFT, Keys.TAB).build().perform();
                clickEnTabla = true;
            }
            ejecuciones = ejecuciones + 1;
        }
    }

    public String calculaTasaNetaDeCesionRegla() {
        listcomisionReaseguroCedido.waitUntilPresent();
        double valorComisionReaseguroCedido = Double.parseDouble(listcomisionReaseguroCedido.getText()) / CONSTANTE_CIEN;
        valorTasa = Double.parseDouble($(VALOR).getText().replace(",", "."));
        double valorTasaBrutaDeCesion = valorTasa / (CONSTANTE_UNO - valorComisionReaseguroCedido);
        return Double.toString(valorTasaBrutaDeCesion).replace(".", ",");
    }

    public String calculaPrimaBrutaDeCesionRegla() {
        try {
            listValorExpuestoRiesgo.click();
        } catch (StaleElementReferenceException e) {
            LOGGER.error("StaleElementReferenceException " + e);
        }
        String valorExpuestoCadena = listValorExpuestoRiesgo.getText().substring(CONSTANTE_1, listValorExpuestoRiesgo.getText().length() - CONSTANTE_6);
        double valorExpuesto = Integer.parseInt(valorExpuestoCadena.replaceAll("\\.", ""));
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
            esperarHasta(TIEMPO_2000);
            listTasaBrutaDeCesion.waitUntilPresent();
            MatcherAssert.assertThat("Error no coincide el valor de tasa bruta: ", listTasaBrutaDeCesion.getText().equals($(VALOR).getText()));
        } catch (StaleElementReferenceException f) {
            LOGGER.info("StaleElementReferenceException " + f);
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
