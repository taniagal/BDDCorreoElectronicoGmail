package com.sura.guidewire.policycenter.pages.tarifacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ModificadoresDeTarifaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Remove-btnInnerEl']")
    public WebElementFacade botonEliminarVehiculo;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:Remove']")
    public WebElementFacade botonQuitarAsegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add']")
    public WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver']")
    public WebElementFacade botonAgregarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:6:RateModifier-inputEl']")
    public WebElementFacade campoTxtBonificacionTecnica;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:6:RateModifier-inputEl']")
    public WebElementFacade campoTxtBonificacionTecnicaCambio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:2:RateModifier-inputEl']")
    public WebElementFacade campoTxtBonificacionComercial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:3:RateModifier-inputEl']")
    public WebElementFacade campoTxtDescuento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:4:RateModifier-inputEl']")
    public WebElementFacade campoTxtRecargo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:5:RateModifier-inputEl']")
    public WebElementFacade campoTxtSuavizacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesLV-body']/*/table/tbody/tr/td[1]/div/img")
    public WebElementFacade checkBoxTablaVehiculo;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV-body']/*/table/tbody/tr[1]/td[1]/div/img")
    public WebElementFacade checkBoxTablaAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:1:TypeKeyModifier-inputEl']")
    public WebElementFacade comboBoxDescuentoDipositivo;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:2:RateModifier-inputEl']")
    public WebElementFacade campoTxtBonificacionComercialCambio;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:3:RateModifier-inputEl']")
    public WebElementFacade campoTxtDescuentoCambio;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:4:RateModifier-inputEl']")
    public WebElementFacade campoTxtRecargoCambio;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:5:RateModifier-inputEl']")
    public WebElementFacade campoTxtSuavizacionCambio;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:1:TypeKeyModifier-bodyEl']")
    public WebElementFacade comboBoxDescuentoDipositivoCambio;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:plan_DV-inputEl']")
    public WebElementFacade comboBoxPlan;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    public WebElementFacade campoTxtPlaca;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:0:ShortDescriptionAndSize']")
    public WebElementFacade labelUW;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver']")
    private WebElementFacade menuItemAsegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_false-inputEl']")
    private WebElementFacade radioBotonCehiculo0KmNo;

    int bonoComercial = 0;
    int bonoTecnico = 0;

    public ModificadoresDeTarifaPage(WebDriver driver) {
        super(driver);
    }

    public void verificarBonoTecnico(String bono) {
        MatcherAssert.assertThat("Error en el valor de la bonificación técnica, was " +
                campoTxtBonificacionTecnica.getValue(), campoTxtBonificacionTecnica.getValue().contains(bono));
    }

    public void verificarBonoComercial(String bono) {
        MatcherAssert.assertThat("Error en el valor de la bonificación comercial, was " +
                campoTxtBonificacionComercial.getValue(), campoTxtBonificacionComercial.getValue().contains(bono));
    }

    public void agregarModificadores(ExamplesTable valores) {
        Map<String, String> valor = valores.getRow(0);
        selectItem(comboBoxDescuentoDipositivo, valor.get("descientoD"));
        campoTxtBonificacionComercial.clear();
        campoTxtBonificacionComercial.sendKeys(valor.get("bonificacionC"));
        campoTxtDescuento.sendKeys(valor.get("descuento"));
        campoTxtRecargo.sendKeys(valor.get("recargo"));
        campoTxtSuavizacion.sendKeys(valor.get("suavizacion"));
        campoTxtBonificacionTecnica.clear();
        campoTxtBonificacionTecnica.sendKeys(valor.get("bonificacionT"));
        bonoComercial = Integer.parseInt(valor.get("bonificacionC"));
        bonoTecnico = Integer.parseInt(valor.get("bonificacionT"));
    }

    public void verificarTarifacionPorCoberturas(ExamplesTable valores) {
        String tablaxpth = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:" +
                "0:0:costLV-body']/*/table/tbody/tr[";
        for (Map<String, String> valor : valores.getRows()) {
            WebElementFacade tablaDescripcion = findBy(tablaxpth + valor.get("fila") + "]/td[3]");
            LOGGER.info(valor.get("valor") + " | " + tablaDescripcion.getText());
        }

        for (Map<String, String> valor : valores.getRows()) {
            WebElementFacade tablaDescripcion = findBy(tablaxpth + valor.get("fila") + "]/td[3]");
            WebElementFacade cobertura = findBy(tablaxpth + valor.get("fila") + "]/td[1]");
            MatcherAssert.assertThat("Error en el valor de la cobertura '" + valor.get("fila") + " - " +
                    cobertura.getText() + "' de la tarifacion Expected: " + valor + " But was: " +
                    tablaDescripcion.getText(), tablaDescripcion.containsText(valor.get("valor")));
        }
    }

    public void cambiarBonificacion(String bonoC, String bonoT) {
        campoTxtBonificacionComercial.clear();
        campoTxtBonificacionComercial.sendKeys(bonoC);
        campoTxtBonificacionTecnica.clear();
        campoTxtBonificacionTecnica.sendKeys(bonoT);
    }

    public void verificarUW(String mensaje) {
        verificarMensaje(labelUW, mensaje);
    }

    public void cambiarBonificacionTecnica(String bonoT) {
        irAVehiculos();
        campoTxtBonificacionTecnicaCambio.waitUntilPresent().sendKeys(bonoT);
    }

    public void irAVehiculos() {
        withTimeoutOf(WAIT_TIME_30, TimeUnit.SECONDS).waitFor(menuItemVehiculos).waitUntilPresent();
        clickElement(menuItemVehiculos);
    }

    public void verificarModificadoresHabilitados() {
        MatcherAssert.assertThat("Error, el campo bonificacion comercial no debe ser editable",
                !esEditable(campoTxtBonificacionComercialCambio));
        MatcherAssert.assertThat("Error, el campo descuento no debe ser editable",
                !esEditable(campoTxtDescuentoCambio));
        MatcherAssert.assertThat("Error, el campo descuento dispositivo no debe ser editable",
                !esEditable(comboBoxDescuentoDipositivoCambio));
        MatcherAssert.assertThat("Error, el campo recargo", !esEditable(campoTxtRecargoCambio));
        MatcherAssert.assertThat("Error, el campo suavizacion no debe ser editable",
                !esEditable(campoTxtSuavizacionCambio));
        MatcherAssert.assertThat("Error, el campo bonificacion tecnica debe ser editable",
                esEditable(campoTxtBonificacionTecnicaCambio));
    }

    public void verificarPermanenciaDeBonificacion(ExamplesTable planes, String bonoC) {
        irAVehiculos();
        checkBoxTablaVehiculo.waitUntilPresent();
        clickElement(checkBoxTablaVehiculo);
        botonEliminarVehiculo.click();
        botonCrearVehiculo.waitUntilPresent().waitUntilClickable();
        clickElement(botonCrearVehiculo);
        for (Map<String, String> plan : planes.getRows()) {
            selectItem(comboBoxPlan, plan.get("plan"));
            waitForComboValue(comboBoxPlan, plan.get("plan"));
            MatcherAssert.assertThat("Error, la bonificacion comercial es diferente a la del vehiculo anterior",
                    campoTxtBonificacionComercialCambio.containsText(bonoC));
        }
    }

    public void verificarRecalculoDeBonificacion(String plan, String placa, String bonoC) {
        selectItem(comboBoxPlan, plan);
        waitForComboValue(comboBoxPlan, plan);
        campoTxtPlaca.sendKeys(placa);
        clickElement(radioBotonCehiculo0KmNo);
        clickElement(radioBotonCehiculo0KmNo);
        waitFor(ExpectedConditions.textToBePresentInElement(campoTxtBonificacionComercialCambio, bonoC));
        MatcherAssert.assertThat("Error, la bonificacion comercial no se recalculó, espected: " + bonoC + " but was: " +
                campoTxtBonificacionComercialCambio.getText(), campoTxtBonificacionComercialCambio.containsText(bonoC));
    }

    public void verificarBonificacionDeNuevoAsegurado(Map<String, String> dato) {
        campoTxtBonificacionComercialCambio.waitUntilPresent();
        clickElement(checkBoxTablaAsegurado);
        clickElement(botonQuitarAsegurado);
        clickElement(botonAgregarAsegurado);
        menuItemAsegurado.waitUntilPresent();
        clickElement(menuItemAsegurado);
        checkBoxTablaAsegurado.waitUntilPresent();
        waitUntil(WAIT_TIME_1000);
        MatcherAssert.assertThat("Error en el valor de la bonificación comercial, was " +
                campoTxtBonificacionComercialCambio.getValue(), campoTxtBonificacionComercialCambio.getValue().contains(dato.get("bonoC")));
        MatcherAssert.assertThat("Error en el valor de la bonificación técnica, was " +
                campoTxtBonificacionTecnicaCambio.getValue(), campoTxtBonificacionTecnicaCambio.getValue().contains(dato.get("bonoT")));
    }
}
