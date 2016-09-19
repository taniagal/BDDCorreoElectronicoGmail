package com.sura.policycenter.selenium.pages.renovacion;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ModificacionRenovacionCoberturasPAPage extends Commons{


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
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup-legendTitle']")
    private WebElementFacade labelResponsabilidadCivil;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup-legendTitle']")
    private WebElementFacade labelDanos;
    @FindBy(xpath = "//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup-legendTitle']")
    private WebElementFacade labelHurto;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup-innerCt']")
    private WebElementFacade coberturaResponsabilidadCivil;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup-innerCt']")
    private WebElementFacade coberturaDanos;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup-innerCt']")
    private WebElementFacade coberturaHurto;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:EditPolicy']")
    private WebElementFacade botonEditarTransaccionPoliza;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoLimiteRC;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoDeducibleRC;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoPerdidaTotalDanos;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoPerdidaParcialDanos;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:2:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoPerdidaFranquiciaDanos;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:3:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoGastosTransporteDanos;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoAbogado;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoPerdidaTotalHurto;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoPerdidaParcialHurto;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:2:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoPerdidaFranquiciaHurto;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:3:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoGastosTransporteHurto;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxHurto;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAccidentesDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxAccidentes;

    public ModificacionRenovacionCoberturasPAPage (WebDriver driver){
        super(driver);
    }

    public void irAPantallaCoberturas() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(itemCoberturasAuto).click();
    }

    public void validarCoberturasPoliza(ExamplesTable coberturas) {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(labelCoberturasAutoPersonal).shouldBeVisible();
        Map<String, String> coberturasAuto = coberturas.getRows().get(0);
        MatcherAssert.assertThat(labelDanosTerceros.getText(), Is.is(Matchers.equalTo(coberturasAuto.get("danosTerceros"))));
        MatcherAssert.assertThat(labelResponsabilidadCivil.getText(), Is.is(Matchers.equalTo(coberturasAuto.get("responsabilidadCivil"))));
        MatcherAssert.assertThat(coberturaResponsabilidadCivil.getText(), Matchers.containsString(coberturasAuto.get("limite")));
        MatcherAssert.assertThat(coberturaResponsabilidadCivil.getText(), Matchers.containsString(coberturasAuto.get("deducible")));
        MatcherAssert.assertThat(labelDanosCarro.getText(), Is.is(Matchers.equalTo(coberturasAuto.get("danosCarro"))));
        MatcherAssert.assertThat(labelDanos.getText(), Is.is(Matchers.equalTo(coberturasAuto.get("danos"))));
        MatcherAssert.assertThat(coberturaDanos.getText(), Matchers.containsString(coberturasAuto.get("perdidaTotalDanos")));
        MatcherAssert.assertThat(coberturaDanos.getText(), Matchers.containsString(coberturasAuto.get("perdidaParcialDanos")));
        MatcherAssert.assertThat(coberturaDanos.getText(), Matchers.containsString(coberturasAuto.get("gastosTransporteD")));
        MatcherAssert.assertThat(labelHurtoCarro.getText(), Is.is(Matchers.equalTo(coberturasAuto.get("hurtoCarro"))));
        MatcherAssert.assertThat(labelHurto.getText(), Is.is(Matchers.equalTo(coberturasAuto.get("hurto"))));
        MatcherAssert.assertThat(coberturaHurto.getText(), Matchers.containsString(coberturasAuto.get("perdidaTotalHurto")));
        MatcherAssert.assertThat(coberturaHurto.getText(), Matchers.containsString(coberturasAuto.get("gastosTransporteH")));
    }

    public void retirarCoberturaObligatoria(ExamplesTable cobertura) {
        Map<String, String> coberturasObligatoria = cobertura.getRows().get(0);
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(labelResponsabilidadCivil).shouldBeVisible();
        MatcherAssert.assertThat(labelResponsabilidadCivil.getText(), Is.is(Matchers.equalTo(coberturasObligatoria.get("cobertura"))));
    }

    public void validarCoberturasObligatorias() {
        String xpathFieldsetRCSinCheckbox = ".//fieldset[(child::legend[contains(.,'Responsabilidad Civil')]) and not(descendant::input[contains(@role,'checkbox')])]";
        WebElementFacade grupoCoberturaRC = null;
        setImplicitTimeout(1,TimeUnit.SECONDS);
        grupoCoberturaRC = withTimeoutOf(1,TimeUnit.SECONDS).find(By.xpath(xpathFieldsetRCSinCheckbox));
        resetImplicitTimeout();
        MatcherAssert.assertThat(grupoCoberturaRC, Matchers.notNullValue());
    }

    public void modificarDeduciblesYLimites() {
        String editable = "input";
        MatcherAssert.assertThat(campoLimiteRC.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoDeducibleRC.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoPerdidaTotalDanos.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoPerdidaParcialDanos.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoPerdidaFranquiciaDanos.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoGastosTransporteDanos.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoAbogado.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoPerdidaTotalHurto.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoPerdidaParcialHurto.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoPerdidaFranquiciaHurto.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoGastosTransporteHurto.getTagName(), Matchers.is(Matchers.equalTo(editable)));
    }

    public void retirarCoberturasOpcionales() {
        String xpathFieldsetHurto = ".//fieldset[(child::legend[contains(.,'Hurto')]) and (descendant::input[contains(@role,'checkbox')])]";
        WebElementFacade grupoCoberturaHurto = null;
        setImplicitTimeout(1,TimeUnit.SECONDS);
        grupoCoberturaHurto = withTimeoutOf(1,TimeUnit.SECONDS).find(By.xpath(xpathFieldsetHurto));
        resetImplicitTimeout();
        MatcherAssert.assertThat(grupoCoberturaHurto, Matchers.notNullValue());
        checkBoxHurto.click();
    }

    public void adicionarNuevaCobertura() {
        String xpathFieldsetAccidentes = ".//fieldset[(child::legend[contains(.,'Accidentes al Conductor')]) and (descendant::input[contains(@role,'checkbox')])]";
        WebElementFacade grupoCoberturaAccidentes = null;
        setImplicitTimeout(1,TimeUnit.SECONDS);
        grupoCoberturaAccidentes = withTimeoutOf(1,TimeUnit.SECONDS).find(By.xpath(xpathFieldsetAccidentes));
        resetImplicitTimeout();
        MatcherAssert.assertThat(grupoCoberturaAccidentes, Matchers.notNullValue());
        checkBoxAccidentes.click();
    }
}