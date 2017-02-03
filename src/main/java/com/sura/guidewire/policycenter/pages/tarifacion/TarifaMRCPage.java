package com.sura.guidewire.policycenter.pages.tarifacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TarifaMRCPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:Update-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Taxes-inputEl']")
    private WebElementFacade campoIva;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:AmountSubjectReconstruction_Input-inputEl']")
    private WebElementFacade campoTxtValorReconstruccion;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:ComercialValue_Input-inputEl']")
    private WebElementFacade campoTxtValorComercial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:0:RateModifier-inputEl']")
    private WebElementFacade campoTxtBasico;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:1:RateModifier-inputEl']")
    private WebElementFacade campoTxtRotura;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:2:RateModifier-inputEl']")
    private WebElementFacade campoTxtDanioInterno;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:3:RateModifier-inputEl']")
    private WebElementFacade campoTxtSustraccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:4:RateModifier-inputEl']")
    private WebElementFacade campoTxtTasaGlobal;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:VariableRate_Input-inputEl']")
    private WebElementFacade campoTxtIndiceVariable;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:HasEdificio-inputEl']")
    private WebElementFacade checkBoxEdificios;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:checkCommercialValue-inputEl']")
    private WebElementFacade checkBoxChecBoxAseguradoAValorComercial;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxCobertura;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxDaniosMateriales;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageMachine:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxDaniosMaterialesMaquinaria;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageMachine:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxRoturaMaquinaria;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageMachine:ArticleTypeDetailDV:2:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxAmitMaquinaria;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageMachine:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxTeremotoMaquinaria;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotal;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup-legendTitle']")
    private WebElementFacade labelcobertura;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:5:CovTermInputSet:BooleanTermInput_true-inputEl']")
    private WebElementFacade radioBotonDeducibleSi;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:5:CovTermInputSet:BooleanTermInput_false-inputEl']")
    private WebElementFacade radioBotonDeducibleNo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:Modifiers']")
    private WebElementFacade menuItemModificadores;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:1-body']/*/table/tbody/tr[3]/td[3]")
    private WebElementFacade montoCobertura;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:1-body']/*/table/tbody/tr[5]/td[3]")
    private WebElementFacade montoCobertura2;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:1-body']/*/table/tbody/tr[3]/td[1]")
    private WebElementFacade labelDescripcionCobertura;
    @FindBy(xpath = ".//a[contains(.,'Descartar cambios no guardados')]")
    private WebElementFacade linkDescartarCambios;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV_tb:AddContactsButton-btnWrap']")
    private WebElementFacade botonAgregarContacto;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV_tb:AddContactsButton:AddFromSearch-textEl']")
    private WebElementFacade botonAgregarContactoDelDirectorio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:1-body']")
    private WebElementFacade tablaPrimas;

    public static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    public static final String XPATH_TABLA_PRIMA_DE_POLIZA_TR = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:1-body']/*/table/tbody/tr";
    public static final String ARTICULO = "articulo";
    public static final int CONSTANTE_0 = 0;
    public static final int CONSTANTE_7 = 7;
    public static final int CONSTANTE_8 = 8;
    public static final double CONSTANTE_019 = 0.19;
    double valorAsegurado = 0;
    double primaTotal = 0;
    String cobertura = "";

    public TarifaMRCPage(WebDriver driver) {
        super(driver);
    }

    public void verificarTarifacion(String prima) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(labelPrimaTotal);
        MatcherAssert.assertThat("Error en el valor de la prima. Esperaba: " + prima + " pero fue: " +
                labelPrimaTotal.getText(), labelPrimaTotal.containsText(prima));
    }

    public void irAArticulo() {
        botonAgregarArticulos.waitUntilPresent();
        clickearElemento(botonAgregarArticulos);
    }

    public void seleccionarCobertura(ExamplesTable datos) {
        cobertura = datos.getRow(0).get("cobertura");
        for (Map<String, String> dato : datos.getRows()) {
            labelcobertura.waitUntilPresent();
            if (labelcobertura.containsText(dato.get("cobertura"))) {
                checkBoxCobertura = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:_checkbox']");
            } else {
                checkBoxCobertura = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:_checkbox']");
                esperarHasta(TIEMPO_1000);
            }
            try {
                clickearElemento(checkBoxCobertura);
            } catch (StaleElementReferenceException e) {
                LOGGER.info("StaleElementReferenceException " + e);
                clickearElemento(checkBoxCobertura);
            }
            valorAsegurado = Double.parseDouble(dato.get("valorAsegurado"));
        }
    }

    public void ingresarValorReconstruccion(ExamplesTable datos) {
        Map<String, String> dato = datos.getRow(0);
        checkBoxEdificios.waitUntilPresent().click();
        campoTxtValorReconstruccion.waitUntilPresent().sendKeys(dato.get("valorReconstruccion"));
        if (!"null".equals(dato.get("valorComercial"))) {
            campoTxtValorComercial.sendKeys(dato.get("valorComercial"));
        }
    }

    public void seleccionarDeducibleSi() {
        if (labelcobertura.containsText("Terremoto")) {
            radioBotonDeducibleSi = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:5:CovTermInputSet:BooleanTermInput_true-inputEl']");
        }
        radioBotonDeducibleSi.click();
    }

    public void seleccionarDeducibleNo() {
        if (labelcobertura.containsText("Terremoto")) {
            radioBotonDeducibleNo = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:5:CovTermInputSet:BooleanTermInput_false-inputEl']");
        }
        radioBotonDeducibleNo.click();
    }

    /**
     * la variable numeroCotizacion se usa en la prueba de declinar cotizacion para obtener el numero de cotizacion
     * generado al crear una nueva cotizacion y luego poderla consultar y declinar.
     * numeroCotizacion es un static String y fue creada en la clase padre.
     */

    public void agregarArticulo() {
        try {
            botonActualizar.waitUntilPresent();
            clickearElemento(botonActualizar);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            clickearElemento(botonActualizar);
        }
        botonCotizar.waitUntilPresent();
        clickearElemento(botonCotizar);
        descartarCambios();
        waitForAnyTextToAppear("Cotizado", "Cotización");
    }

    public void descartarCambios() {
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (linkDescartarCambios.isPresent()) {
            clickearElemento(linkDescartarCambios);
            clickearElemento(botonCotizar);
        }
        resetImplicitTimeout();
    }

    public void cotizarArticuloBloqueado() {
        botonActualizar.click();
        botonCotizar.waitUntilPresent().click();
        waitFor(find(By.cssSelector(".message")));
        botonCotizar.click();
    }

    public void irAModificadores() {
        menuItemModificadores.waitUntilPresent().click();
    }

    public void verificarModificadores() {
        StringBuilder noPresente = new StringBuilder(MSJVALIDARELEMENTOS);
        campoTxtBasico.waitUntilPresent();
        noPresente = concatenarElementoNoPresente(campoTxtBasico, " modificador basico,", noPresente);
        noPresente = concatenarElementoNoPresente(campoTxtDanioInterno, " modificador daño interno,", noPresente);
        noPresente = concatenarElementoNoPresente(campoTxtRotura, " modificador rotura,", noPresente);
        noPresente = concatenarElementoNoPresente(campoTxtSustraccion, " modificador sustraccion,", noPresente);
        String res = noPresente.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = noPresente.toString().substring(0, noPresente.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }

    public void verificarTarifacionEnCobertura(String prima) {
        if (!labelDescripcionCobertura.containsText(cobertura)) {
            montoCobertura = montoCobertura2;
        }
        montoCobertura.waitUntilPresent();
        MatcherAssert.assertThat("Error en el valor de la cobertura Expected: " + prima + " But was: " +
                montoCobertura.getText(), montoCobertura.containsText(prima));
    }

    public void verificarImpuestos() {
        MatcherAssert.assertThat("Error en el valor del IVA Expected: 0,00 But was: " +
                campoIva.getText(), campoIva.containsText("0,00"));
    }

    public void verificarValorIva() {
        primaTotal = Double.parseDouble(labelPrimaTotal.getText().substring(1, CONSTANTE_8).replace(".", ""));
        int iva = (int) (primaTotal * CONSTANTE_019);
        MatcherAssert.assertThat("Error en el calculo del valor del IVA expected:" + iva + ", was: " + campoIva.getText(),
                campoIva.getText().substring(1, CONSTANTE_7).replace(".", "").equals(Integer.toString(iva)));
    }

    public void seleccionarCoberturaDanios(String valor, String valorIndice) {
        ingresarDato(campoTxtIndiceVariable, valorIndice);
        clickearElemento(checkBoxDaniosMateriales);
    }

    public void agregarContactoDelDirectorio() {
        botonAgregarContacto.waitUntilPresent().click();
        botonAgregarContactoDelDirectorio.click();
    }

    public void verificarTarifacionEnCoberturasTerremotoYSustraccion(ExamplesTable primasPoliza) {
        verificarValorIva();
        Integer fila;
        for (int i = 0; i < primasPoliza.getRowCount(); i++) {
            fila = encontrarCobertura(primasPoliza.getRows().get(i).get("cobertura"));
            String xpath = XPATH_TABLA_PRIMA_DE_POLIZA_TR + "[" + fila.toString() + "]/td[3]";
            MatcherAssert.assertThat(findBy(xpath).getText(), containsText(primasPoliza.getRows().get(i).get("prima")));
        }
    }

    public Integer encontrarCobertura(String cobertura) {
        waitFor(tablaPrimas).waitUntilPresent();
        Integer filaActividad = 1;
        List<WebElement> filas = tablaPrimas.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (cobertura.equalsIgnoreCase(columna.get(CONSTANTE_0).getText())) {
                return filaActividad;
            }
            filaActividad++;
        }
        return filaActividad;
    }

    public void seleccionarArticulosYTodadsSusCoberturas(ExamplesTable datos) {
        for (Map<String, String> dato : datos.getRows()) {
            WebElementFacade campoTxtValorAsegurable = $(".//*[@id='CPBuildingSuraPopup:InputCoverage" + dato.get(ARTICULO) + ":ArticleTypeDetailDV:AmountSubject_Input-inputEl']");
            WebElementFacade checkBoxArticulo = $(".//*[@id='CPBuildingSuraPopup:Has" + dato.get(ARTICULO) + "-inputEl']");
            if ("Furniture".equals(dato.get(ARTICULO))) {
                checkBoxArticulo = $(".//*[@id='CPBuildingSuraPopup:HasFixture-inputEl']");
            } else if ("Building".equals(dato.get(ARTICULO))) {
                campoTxtValorAsegurable = $(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:AmountSubjectReconstruction_Input-inputEl']");
                checkBoxArticulo = $(".//*[@id='CPBuildingSuraPopup:HasEdificio-inputEl']");
            }
            clickearElemento(checkBoxArticulo);
            campoTxtValorAsegurable.waitUntilPresent().sendKeys(dato.get("valor_asegurable"));
            llenarCoberturas(dato);
        }
    }

    public void llenarCoberturas(Map<String, String> dato) {
        String[] coberturas = dato.get("coberturas").split(",");
        for (String cobertura2 : coberturas) {
            List<WebElementFacade> checkBoxesCoberturas = findAll(".//*[contains(@id,'CPBuildingSuraPopup:InputCoverage" + dato.get(ARTICULO) + ":ArticleTypeDetailDV:') and contains(@id,':CoverageInputSet:CovPatternInputGroup:_checkbox')]");
            for (int j = 0; j < checkBoxesCoberturas.size(); j++) {
                WebElementFacade labelNombreCobertura = $(".//*[@id='CPBuildingSuraPopup:InputCoverage" + dato.get(ARTICULO) + ":ArticleTypeDetailDV:" + j + ":CoverageInputSet:CovPatternInputGroup-legendTitle']");
                if (labelNombreCobertura.containsText(cobertura2)) {
                    WebElementFacade checkBoxCobertura2 = $(".//*[@id='CPBuildingSuraPopup:InputCoverage" + dato.get(ARTICULO) + ":ArticleTypeDetailDV:" + j + ":CoverageInputSet:CovPatternInputGroup:_checkbox']");
                    clickearElemento(checkBoxCobertura2);
                    break;
                }
            }
            esperarHasta(TIEMPO_1000);
        }
    }

    public void verificarTarifacion(ExamplesTable datos) {
        int i = 1;
        int k = 1;
        String articulo = "";
        for (Map<String, String> dato : datos.getRows()) {
            List<WebElementFacade> tablaPrimaDePoliza = findAll(XPATH_TABLA_PRIMA_DE_POLIZA_TR);
            if (!articulo.equals(dato.get(ARTICULO))) {
                articulo = dato.get(ARTICULO);
                for (int j = 1; j <= tablaPrimaDePoliza.size(); j++) {
                    WebElementFacade descripcionCobertura = $(XPATH_TABLA_PRIMA_DE_POLIZA_TR + "[" + j + "]/td[1]");
                    if (descripcionCobertura.containsText(dato.get(ARTICULO))) {
                        k = j;
                        break;
                    }
                }
            }
            i = k;
            verificarValorDeCobertura(i, dato, tablaPrimaDePoliza);
        }
    }

    public void verificarValorDeCobertura(int i, Map<String, String> dato, List<WebElementFacade> tablaPrimaDePoliza) {
        int indice = i;
        while (indice <= tablaPrimaDePoliza.size()) {
            WebElementFacade descripcionCobertura = $(XPATH_TABLA_PRIMA_DE_POLIZA_TR + "[" + indice + "]/td[1]");
            if (descripcionCobertura.containsText(dato.get("descripcion"))) {
                WebElementFacade montoPrima = $(XPATH_TABLA_PRIMA_DE_POLIZA_TR + "[" + indice + "]/td[3]");
                MatcherAssert.assertThat("Error en el valor de la tarifa, en la cobertura " + descripcionCobertura.getText() +
                        " del articulo " + dato.get(ARTICULO) + " . Expected: " + dato.get("valor") +
                        " but was: " + montoPrima.getText(), montoPrima.containsText(dato.get("valor")));
                break;
            }
            indice++;
        }
    }

    public void ingrasarValorComercial(String valor, String valorIndice) {
        clickearElemento(checkBoxChecBoxAseguradoAValorComercial);
        esperarHasta(TIEMPO_1500);
        campoTxtValorComercial.sendKeys(valor);
        ingresarDato(campoTxtIndiceVariable, valorIndice);
    }
}