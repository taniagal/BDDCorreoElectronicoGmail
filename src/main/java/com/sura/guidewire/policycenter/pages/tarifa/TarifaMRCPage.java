package com.sura.guidewire.policycenter.pages.tarifa;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
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
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:AmountSubjectReconstruction_Input-inputEl']")
    private WebElementFacade campoTxtValorReconstruccion;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']")
    private WebElementFacade campoTxtValorAsegurado;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:ComercialValue_Input-inputEl']")
    private WebElementFacade campoTxtValorComercial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:1:RateModifier-inputEl']")
    private WebElementFacade campoTxtCalificacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:2:RateModifier-inputEl']")
    private WebElementFacade campoTxtBasico;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:3:RateModifier-inputEl']")
    private WebElementFacade campoTxtRotura;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:4:RateModifier-inputEl']")
    private WebElementFacade campoTxtDañioInterno;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:5:RateModifier-inputEl']")
    private WebElementFacade campoTxtSustraccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:CPComercialPropertyModifiersDV:7:RateModifier-inputEl']")
    private WebElementFacade campoTxtTasaGlobal;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:HasEdificio-inputEl']")
    private WebElementFacade checkBoxEdificios;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxTerremoto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV-body']/*/table/tbody/tr[1]/td[1]")
    private WebElementFacade checkBoxArticulo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:ModifiersScreen:_msgs']")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotal;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup-legendTitle']")
    private WebElementFacade labelTerremoto;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:5:CovTermInputSet:BooleanTermInput_true-inputEl']")
    private WebElementFacade radioBotonDeducibleSi;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:3:CoverageInputSet:CovPatternInputGroup:5:CovTermInputSet:BooleanTermInput_false-inputEl']")
    private WebElementFacade radioBotonDeducibleNo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:Modifiers']")
    private WebElementFacade menuItemModificadores;

    public static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    double valorAsegurado = 0;
    double primaTotal = 0;

    public TarifaMRCPage(WebDriver driver) {
        super(driver);
    }

    public void verificarTarifacion(String prima) {
        labelPrimaTotal.waitUntilPresent();
        MatcherAssert.assertThat("Error en el valor de la prima. Esperaba: " + prima + " pero fue: " + labelPrimaTotal.getText(),
                labelPrimaTotal.containsText(prima));
    }

    public void irAArticulo() {
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(botonBorrarArticulo).waitUntilPresent();
        checkBoxArticulo.click();
        botonBorrarArticulo.click();
        waitUntil(WAIT_TIME_1000);
        botonAgregarArticulos.click();
    }

    public void seleccionarCoberturaTerremoto(ExamplesTable datos) {
        Map<String, String> dato = datos.getRow(0);
        checkBoxEdificios.waitUntilPresent().click();
        campoTxtValorReconstruccion.waitUntilPresent().sendKeys(dato.get("valorReconstruccion"));
        if (!"null".equals(dato.get("valorComercial"))) {
            campoTxtValorComercial.sendKeys(dato.get("valorComercial"));
        }
        if (labelTerremoto.containsText("Terremoto")) {
            checkBoxTerremoto = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:_checkbox']");
            campoTxtValorAsegurado = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']");
        }
        checkBoxTerremoto.click();
        campoTxtValorAsegurado.waitUntilPresent().sendKeys(dato.get("valorAsegurado"));
        valorAsegurado = Double.parseDouble(dato.get("valorAsegurado"));
    }

    public void seleccionarDeducibleSi() {
        if (labelTerremoto.containsText("Terremoto")) {
            radioBotonDeducibleSi = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:5:CovTermInputSet:BooleanTermInput_true-inputEl']");
        }
        radioBotonDeducibleSi.click();
    }

    public void seleccionarDeducibleNo() {
        if (labelTerremoto.containsText("Terremoto")) {
            radioBotonDeducibleNo = findBy(".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:1:CoverageInputSet:CovPatternInputGroup:5:CovTermInputSet:BooleanTermInput_false-inputEl']");
        }
        radioBotonDeducibleNo.click();
    }

    public void agregarArticulo() {
        botonActualizar.click();
        botonCotizar.waitUntilPresent().click();
    }

    public void irAModificadores() {
        menuItemModificadores.waitUntilPresent().click();
    }

    public void verificarModificadores() {
        StringBuilder noPresente = new StringBuilder(MSJVALIDARELEMENTOS);
        campoTxtBasico.waitUntilPresent();
        noPresente = concatenarElementoNoPresente(campoTxtBasico, " modificador basico,", noPresente);
        noPresente = concatenarElementoNoPresente(campoTxtCalificacion, " modificador calificacion,", noPresente);
        noPresente = concatenarElementoNoPresente(campoTxtDañioInterno, " modificador daño interno,", noPresente);
        noPresente = concatenarElementoNoPresente(campoTxtRotura, " modificador rotura,", noPresente);
        noPresente = concatenarElementoNoPresente(campoTxtSustraccion, " modificador sustraccion,", noPresente);
        String res = noPresente.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = noPresente.toString().substring(0, noPresente.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }

    public void verificarTasaGlobal() {
        labelPrimaTotal.waitUntilPresent();
        primaTotal = Integer.parseInt(labelPrimaTotal.getText().substring(1, 10).replace(".", ""));
        menuItemModificadores.click();
        double tasaGlobal = primaTotal / valorAsegurado;
        MatcherAssert.assertThat("El calculo de la tasa global es incorrecto", campoTxtTasaGlobal.getText().equals(Double.toString(tasaGlobal).substring(0, 4).replace(".", ",")));
    }


    public void ingresarTasaGlobal(String valor) {
        labelPrimaTotal.waitUntilPresent();
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
}
