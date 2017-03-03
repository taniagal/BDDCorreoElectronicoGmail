package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

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
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV_tb:Add-btnInnerEl']")
    WebElementFacade btnAgregaInformacionReaseguro;


    public static final String XPATH_TABLA_REASEGURADORES_INICIO = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr";
    public static final String XPATH_TABLA_REASEGURADORES_CIERRE = "/td";
    private static final String CELDA_VALOR = "//input[@class='x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus']";
    private static final String PAIS_ALEMANIA = "Alemania";
    private static final String PAIS_ESTADOS_UNIDOS = "Estados Unidos";
    private static final String ASEGURADORA_ALLIANZ = "ALLIANZ RE";
    private static final String ASEGURADORA_MAIDEN_RE = "MAIDEN RE";
    private static final int COLUMNA_NOMBRE_TABLA_PORCENTAJE_PARTICIPACION = 3;
    private static final int COLUMNA_NOMBRE_TABLA_FORMA_DE_COTIZACION = 5;
    private static final int COLUMNA_NOMBRE_TABLA_VALOR = 6;
    private static final int COLUMNA_NOMBRE_COMISION_REASEGURO_CEDIDO = 7;
    private static final int COLUMNA_NOMBRE_COMISION_INTERMEDIARIO = 8;
    private static final int COLUMNA_NOMBRE_COMISION_PROMOTORA = 9;
    private static final int COLUMNA_NOMBRE_PORCENTAJE_DEPOSITO_RETENIDO = 15;

    CrearYEditarCumulosPage crearYEditarCumulosPage;

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

    public void agregarReaseguradoresATabla(ExamplesTable infoReasegurador) {
        int i = 1;
        for (Map<String, String> dato : infoReasegurador.getRows()) {
            if (dato.get("reasegurador").equals(ASEGURADORA_ALLIANZ)) {
                esperarYClickearBoton(btnAgregaInformacionReaseguro);
                ingresoInformacionDePrimerAsegurado();
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_PORCENTAJE_PARTICIPACION + "]"), dato.get("porcentajeParticipacion"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_VALOR + "]"), dato.get("valorReaseguro"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_REASEGURO_CEDIDO + "]"), dato.get("comisionReasegurador"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_INTERMEDIARIO + "]"), dato.get("comisionIntermediario"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_FORMA_DE_COTIZACION + "]"), dato.get("modalidad"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_PROMOTORA + "]"), dato.get("comisionPromotora"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_PORCENTAJE_DEPOSITO_RETENIDO + "]"), dato.get("porRetenido"));
                i++;
            } else if (dato.get("reasegurador").equals(ASEGURADORA_MAIDEN_RE)) {
                esperarYClickearBoton(btnAgregaInformacionReaseguro);
                ingresoInformacionDeSegundoAsegurado();
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_PORCENTAJE_PARTICIPACION + "]"), dato.get("porcentajeParticipacion"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_VALOR + "]"), dato.get("valorReaseguro"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_REASEGURO_CEDIDO + "]"), dato.get("comisionReasegurador"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_INTERMEDIARIO + "]"), dato.get("comisionIntermediario"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_FORMA_DE_COTIZACION + "]"), dato.get("modalidad"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_PROMOTORA + "]"), dato.get("comisionPromotora"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_PORCENTAJE_DEPOSITO_RETENIDO + "]"), dato.get("porRetenido"));
            }
        }
    }
}


