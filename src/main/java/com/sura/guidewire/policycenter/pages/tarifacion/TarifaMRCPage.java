package com.sura.guidewire.policycenter.pages.tarifacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.*;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TarifaMRCPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:Update-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:removeLocation']")
    private WebElementFacade botonBorrarArticulo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:JobWizardToolbarButtonSet:EditPolicy']")
    private WebElementFacade botonEditarTransaccionDePoliza;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarPopup;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Taxes-inputEl']")
    private WebElementFacade campoIva;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:AmountSubjectReconstruction_Input-inputEl']")
    private WebElementFacade campoTxtValorReconstruccion;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']")
    private WebElementFacade campoTxtValorAsegurado;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:ComercialValue_Input-inputEl']")
    private WebElementFacade campoTxtValorComercial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:1:RateModifier-inputEl']")
    private WebElementFacade campoTxtBasico;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:2:RateModifier-inputEl']")
    private WebElementFacade campoTxtRotura;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:3:RateModifier-inputEl']")
    private WebElementFacade campoTxtDanioInterno;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:4:RateModifier-inputEl']")
    private WebElementFacade campoTxtSustraccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:5:RateModifier-inputEl']")
    private WebElementFacade campoTxtTasaGlobal;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:HasEdificio-inputEl']")
    private WebElementFacade checkBoxEdificios;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxCobertura;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxAMIT;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV-body']/*/table/tbody/tr[1]/td[1]")
    private WebElementFacade checkBoxArticulo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:_msgs']")
    private WebElementFacade divMensaje;
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

    public static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    double valorAsegurado = 0;
    double primaTotal = 0;
    String cobertura = "";

    public TarifaMRCPage(WebDriver driver) {
        super(driver);
    }

    public void verificarTarifacion(String prima) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(labelPrimaTotal);
        MatcherAssert.assertThat("Error en el valor de la prima. Esperaba: " + prima + " pero fue: " +
                labelPrimaTotal.getText(), labelPrimaTotal.containsText(prima));
    }

    public void irAArticulo() {
        clickElement(botonAgregarArticulos);
    }

    public void seleccionarCobertura(ExamplesTable datos) {
        cobertura = datos.getRow(0).get("cobertura");
        for (Map<String, String> dato : datos.getRows()) {
            if (labelcobertura.containsText(dato.get("cobertura"))) {
                checkBoxCobertura = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:_checkbox']");
                campoTxtValorAsegurado = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']");
            } else {
                checkBoxCobertura = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:_checkbox']");
                campoTxtValorAsegurado = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']");
            }
            checkBoxCobertura.click();
            campoTxtValorAsegurado.waitUntilPresent().sendKeys(dato.get("valorAsegurado"));
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
        botonActualizar.click();
        botonCotizar.waitUntilPresent().click();
        descartarCambios();
        waitForTextToAppear("Cotizado");
    }

    public void descartarCambios() {
        setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
        if (linkDescartarCambios.isPresent()) {
            clickElement(linkDescartarCambios);
            clickElement(botonCotizar);
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

    public void verificarTasaGlobal() {
        double tasaGlobal = 0;
        try {
            labelPrimaTotal.waitUntilPresent();
            primaTotal = Double.parseDouble(labelPrimaTotal.getText().substring(1, 10).replace(".", ""));
        } catch (UnhandledAlertException f) {
            LOGGER.info("UnhandledAlertException " + f);
            try {
                Alert alert = getDriver().switchTo().alert();
                String alertText = alert.getText();
                LOGGER.info("Alert data: " + alertText);
                alert.accept();
            } catch (NoAlertPresentException e) {
                LOGGER.info("NoAlertPresentException " + e);
            }
            waitUntil(WAIT_TIME_2000);
            labelPrimaTotal.waitUntilPresent();
            primaTotal = Double.parseDouble(labelPrimaTotal.getText().substring(1, 10).replace(".", ""));
        }
        menuItemModificadores.click();
        campoTxtTasaGlobal.waitUntilPresent();
        tasaGlobal = ((primaTotal / valorAsegurado) * 1000) + 0.00003;
        MatcherAssert.assertThat("Error: el valor de la tasa global es incorrecto, was: " + campoTxtTasaGlobal.getText(),
                campoTxtTasaGlobal.getText().equals(Double.toString(tasaGlobal).substring(0, 7).replace(".", ",")));
    }


    public void ingresarTasaGlobal(String valor) {
        labelPrimaTotal.waitUntilPresent();
        verificarValorIva();
        menuItemModificadores.click();
        campoTxtTasaGlobal.waitUntilPresent();
        botonEditarTransaccionDePoliza.click();
        botonAceptarPopup.waitUntilPresent().click();
        botonAceptarPopup.waitUntilNotVisible();
        waitUntil(WAIT_TIME_500);
        campoTxtTasaGlobal.clear();
        campoTxtTasaGlobal.sendKeys(valor);
        botonSiguiente.click();
    }

    public void verificarMensaje(String mensaje) {
        verificarMensaje(divMensaje, mensaje);
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
        primaTotal = Double.parseDouble(labelPrimaTotal.getText().substring(1, 8).replace(".", ""));
        int iva = (int) (primaTotal * 0.16 + 1);
        MatcherAssert.assertThat("Error en el calculo del valor del IVA , was: " + campoIva.getText(),
                campoIva.getText().substring(1, 7).replace(".", "").equals(Integer.toString(iva)));
    }
}
