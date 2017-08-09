package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ModificacionRenovacionCoberturasPAPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='RenewalWizard:Next-btnEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='RenewalWizard:Prev-btnEl']")
    private WebElementFacade botonVolver;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:EditPolicy']")
    private WebElementFacade botonEditarTransaccionPoliza;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:PALine']/div")
    private WebElementFacade itemCoberturasAuto;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:ttlBar']")
    private WebElementFacade labelCoberturasAutoPersonal;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0']")
    private WebElementFacade labelDanosTerceros;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0']")
    private WebElementFacade labelDanosCarro;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0']")
    private WebElementFacade labelHurtoCarro;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup-legendTitle']")
    private WebElementFacade labelResponsabilidadCivil;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0']")
    private WebElementFacade labelAsistencia;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup-legendTitle']")
    private WebElementFacade labelDanos;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup-legendTitle']")
    private WebElementFacade labelHurto;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoLimiteRC;
    @FindBy(xpath = ".//*[contains(@id, 'LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:1:SuraPACovTermInputSet:DirectTermInput-inputEl')]")
    private WebElementFacade campoDeducibleRC;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:SubmitDirectTermInput-inputEl')]")
    private WebElementFacade campoPerdidaTotalDanos;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:1:SuraPACovTermInputSet:SubmitDirectTermInput-inputEl')]")
    private WebElementFacade campoPerdidaParcialDanos;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:2:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl')]")
    private WebElementFacade campoPerdidaFranquiciaDanos;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:1:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoAbogado;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:SubmitDirectTermInput-inputEl')]")
    private WebElementFacade campoPerdidaTotalHurto;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:1:SuraPACovTermInputSet:SubmitDirectTermInput-inputEl')]")
    private WebElementFacade campoPerdidaParcialHurto;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:2:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl')]")
    private WebElementFacade campoPerdidaFranquiciaHurto;
    @FindBy(xpath = ".//*[contains(@id, 'VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:_checkbox')]")
    private WebElementFacade checkBoxHurto;
    @FindBy(xpath = ".//*[contains(@id, 'VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:_checkbox')]")
    private WebElementFacade checkBoxDanios;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:_msgs']")
    private WebElementFacade lblMensaje;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    private WebElementFacade btnBorrar;


    public ModificacionRenovacionCoberturasPAPage(WebDriver driver) {
        super(driver);
    }

    public void irAPantallaCoberturasSinValidacionFecha() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(itemCoberturasAuto).click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(lblMensaje).waitUntilVisible();
        itemCoberturasAuto.click();
    }

    public void irAPantallaCoberturas() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(itemCoberturasAuto);
        clickearElemento(itemCoberturasAuto);
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (lblMensaje.isPresent()) {
            clickearElemento(itemCoberturasAuto);
        }
        resetImplicitTimeout();
    }


    public void validarCoberturasPoliza(ExamplesTable coberturas) {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(labelCoberturasAutoPersonal).shouldBeVisible();
        Map<String, String> coberturasAuto = coberturas.getRows().get(0);
        MatcherAssert.assertThat(labelDanosTerceros.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("danosTerceros"))));
        MatcherAssert.assertThat(labelResponsabilidadCivil.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("responsabilidadCivil"))));
        MatcherAssert.assertThat(labelDanosCarro.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("danosCarro"))));
        MatcherAssert.assertThat(labelHurtoCarro.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("hurtoCarro"))));
        MatcherAssert.assertThat(labelAsistencia.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("asistencia"))));
    }

    public void editarTransaccionPoliza() {
        try {
            withTimeoutOf(TIEMPO_7, TimeUnit.SECONDS).waitFor(botonEditarTransaccionPoliza).click();
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
            esperarHasta(TIEMPO_3000);
            botonSiguiente.click();
            clickearElemento(botonVolver);
        }

        try {
            waitForTextToAppear("Si se edita esta transacción de la póliza, se invalida la cotización actual", TIEMPO_3000);
            actions.sendKeys(Keys.ENTER).build().perform();
            esperarHasta(TIEMPO_1500);
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
        }
    }

    public void retirarCoberturaObligatoria(ExamplesTable cobertura) {
        Map<String, String> coberturasObligatoria = cobertura.getRows().get(0);
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(labelResponsabilidadCivil).shouldBeVisible();
        MatcherAssert.assertThat(labelResponsabilidadCivil.getText(), Matchers.is(Matchers.equalTo(coberturasObligatoria.get("cobertura"))));
    }

    public void validarCoberturasObligatorias() {
        String xpathFieldsetRCSinCheckbox = ".//fieldset[(child::legend[contains(.,'Responsabilidad Civil')]) and not(descendant::input[contains(@role,'checkbox')])]";
        WebElementFacade grupoCoberturaRC = withTimeoutOf(TIEMPO_3, TimeUnit.SECONDS).find(By.xpath(xpathFieldsetRCSinCheckbox));
        MatcherAssert.assertThat(grupoCoberturaRC, Matchers.notNullValue());
    }

    public void modificarDeduciblesYLimites() {
        String editable = "input";
        try {
            esperarHasta(TIEMPO_2000);
            campoLimiteRC.waitUntilPresent();
            MatcherAssert.assertThat(campoLimiteRC.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        } catch (ElementNotVisibleException g) {
            LOGGER.info("ElementNotVisibleException " + g);
            esperarHasta(TIEMPO_2000);
            MatcherAssert.assertThat(campoLimiteRC.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        }
        try {
            MatcherAssert.assertThat(campoDeducibleRC.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            esperarHasta(TIEMPO_2000);
            MatcherAssert.assertThat(campoDeducibleRC.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        }
        clickearElemento(checkBoxDanios);
        MatcherAssert.assertThat(campoPerdidaTotalDanos.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        seleccionarItem(campoPerdidaTotalDanos, String.valueOf(CONSTANTE_0));
        try {
            MatcherAssert.assertThat(campoPerdidaParcialDanos.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        } catch (ElementNotVisibleException f) {
            LOGGER.info("ElementNotVisibleException " + f);
            esperarHasta(TIEMPO_2000);
            MatcherAssert.assertThat(campoPerdidaParcialDanos.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        }
        clickearElemento(checkBoxHurto);
        MatcherAssert.assertThat(campoPerdidaTotalHurto.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        seleccionarItem(campoPerdidaTotalHurto, String.valueOf(CONSTANTE_0));
        MatcherAssert.assertThat(campoPerdidaParcialHurto.getTagName(), Matchers.is(Matchers.equalTo(editable)));
    }

    public void retirarCoberturasOpcionales() {
        MatcherAssert.assertThat(checkBoxHurto.isPresent(), Is.is(Matchers.equalTo(true)));
    }

    public void adicionarNuevaCobertura() {
       MatcherAssert.assertThat(checkBoxDanios.isPresent(), Is.is(Matchers.equalTo(true)));
    }

    public void borrarEspacioTrabajo() {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(btnBorrar).click();
        esperarHasta(TIEMPO_2000);
    }
}
