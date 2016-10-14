package com.sura.policycenter.selenium.pages.renovacion;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ModificacionRenovacionCoberturasPAPage extends Commons {

    private final Actions act = new Actions(getDriver());

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
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:_msgs']")
    private WebElementFacade lblMensaje;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade lstLimite;
    @FindBy(xpath = ".//li[contains(.,'32.000.000')]")
    private WebElementFacade vlrLimite;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade lstDeducible;
    @FindBy(xpath = "//li[contains(.,'0')]")
    private WebElementFacade vlrDeducible;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    private WebElementFacade btnBorrar;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    private WebElementFacade btnInicio;


    public ModificacionRenovacionCoberturasPAPage(WebDriver driver) {
        super(driver);
    }


    public void irAPantallaCoberturasSinValidacionFecha() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(itemCoberturasAuto).click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(lblMensaje).waitUntilVisible();
        itemCoberturasAuto.click();
    }

    public void irAPantallaCoberturas() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(itemCoberturasAuto).click();
    }


    public void validarCoberturasPoliza(ExamplesTable coberturas) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(labelCoberturasAutoPersonal).shouldBeVisible();
        Map<String, String> coberturasAuto = coberturas.getRows().get(0);
        MatcherAssert.assertThat(labelDanosTerceros.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("danosTerceros"))));
        MatcherAssert.assertThat(labelResponsabilidadCivil.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("responsabilidadCivil"))));
        MatcherAssert.assertThat(labelDanosCarro.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("danosCarro"))));
        MatcherAssert.assertThat(labelDanos.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("danos"))));
        MatcherAssert.assertThat(labelHurtoCarro.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("hurtoCarro"))));
        MatcherAssert.assertThat(labelHurto.getText(), Matchers.is(Matchers.equalTo(coberturasAuto.get("hurto"))));
    }

    public void editarTransaccionPoliza() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(botonEditarTransaccionPoliza).click();
        waitForTextToAppear("Si se edita esta transacción de la póliza, se invalida la cotización actual");
        act.sendKeys(Keys.ENTER).build().perform();
        waitUntil(1500);
    }

    public void retirarCoberturaObligatoria(ExamplesTable cobertura) {
        Map<String, String> coberturasObligatoria = cobertura.getRows().get(0);
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(labelResponsabilidadCivil).shouldBeVisible();
        MatcherAssert.assertThat(labelResponsabilidadCivil.getText(), Matchers.is(Matchers.equalTo(coberturasObligatoria.get("cobertura"))));
    }

    public void validarCoberturasObligatorias() {
        String xpathFieldsetRCSinCheckbox = ".//fieldset[(child::legend[contains(.,'Responsabilidad Civil')]) and not(descendant::input[contains(@role,'checkbox')])]";
        WebElementFacade grupoCoberturaRC = withTimeoutOf(1, TimeUnit.SECONDS).find(By.xpath(xpathFieldsetRCSinCheckbox));
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
        WebElementFacade grupoCoberturaHurto = withTimeoutOf(1, TimeUnit.SECONDS).find(By.xpath(xpathFieldsetHurto));
        MatcherAssert.assertThat(grupoCoberturaHurto, Matchers.notNullValue());
        checkBoxHurto.click();
    }

    public void adicionarNuevaCobertura() {
        String xpathFieldsetAccidentes = ".//fieldset[(child::legend[contains(.,'Accidentes al Conductor')]) and (descendant::input[contains(@role,'checkbox')])]";
        WebElementFacade grupoCoberturaAccidentes = withTimeoutOf(1, TimeUnit.SECONDS).find(By.xpath(xpathFieldsetAccidentes));
        MatcherAssert.assertThat(grupoCoberturaAccidentes, Matchers.notNullValue());
        checkBoxAccidentes.click();
    }

    public void borrarEspacioTrabajo() {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(btnBorrar).click();
    }
}
