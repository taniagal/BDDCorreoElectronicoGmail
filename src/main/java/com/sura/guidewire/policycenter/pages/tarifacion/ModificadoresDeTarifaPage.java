package com.sura.guidewire.policycenter.pages.tarifacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
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
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV']")
    public WebElementFacade labelUW;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//a[contains(.,'DANIEL MEJIA CUARTAS') and contains(@id,'PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV')]")
    private WebElementFacade menuItemAsegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_false-inputEl']")
    private WebElementFacade radioBotonCehiculo0KmNo;

    public static final String XPATH_TABLA_PRIMA_DE_POLIZA_TR = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:costLV-body']/*/table/tbody/tr";
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
        seleccionarItem(comboBoxDescuentoDipositivo, valor.get("descientoD"));
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
        withTimeoutOf(TIEMPO_30, TimeUnit.SECONDS).waitFor(menuItemVehiculos).waitUntilPresent();
        clickearElemento(menuItemVehiculos);
        clickearElemento(menuItemVehiculos);
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
        clickearElemento(checkBoxTablaVehiculo);
        botonEliminarVehiculo.click();
        botonCrearVehiculo.waitUntilPresent().waitUntilClickable();
        clickearElemento(botonCrearVehiculo);
        for (Map<String, String> plan : planes.getRows()) {
            seleccionarItem(comboBoxPlan, plan.get("plan"));
            esperarPorValor(comboBoxPlan, plan.get("plan"));
            MatcherAssert.assertThat("Error, la bonificacion comercial es diferente a la del vehiculo anterior",
                    campoTxtBonificacionComercialCambio.containsText(bonoC));
        }
    }

    public void verificarRecalculoDeBonificacion(String plan, String placa, String bonoC) {
        seleccionarItem(comboBoxPlan, plan);
        esperarPorValor(comboBoxPlan, plan);
        campoTxtPlaca.sendKeys(placa);
        clickearElemento(radioBotonCehiculo0KmNo);
        clickearElemento(radioBotonCehiculo0KmNo);
        try {
            waitFor(ExpectedConditions.textToBePresentInElement(campoTxtBonificacionComercialCambio, bonoC));
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
        }
        try {
            esperarHasta(TIEMPO_2000);
            MatcherAssert.assertThat("Error, la bonificacion comercial no se recalculó, espected: " + bonoC + " but was: " +
                    campoTxtBonificacionComercialCambio.getText(), campoTxtBonificacionComercialCambio.containsText(bonoC));
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisibleException " + e);
            MatcherAssert.assertThat("Error, la bonificacion comercial no se recalculó, espected: " + bonoC + " but was: " +
                    campoTxtBonificacionComercialCambio.getText(), campoTxtBonificacionComercialCambio.containsText(bonoC));
        }
    }

    public void verificarBonificacionDeNuevoAsegurado(Map<String, String> dato) {
        campoTxtBonificacionComercialCambio.waitUntilPresent();
        clickearElemento(checkBoxTablaAsegurado);
        clickearElemento(botonQuitarAsegurado);
        clickearElemento(botonAgregarAsegurado);
        menuItemAsegurado.waitUntilPresent();
        clickearElemento(menuItemAsegurado);
        checkBoxTablaAsegurado.waitUntilPresent();
        esperarHasta(TIEMPO_2000);
        MatcherAssert.assertThat("Error en el valor de la bonificación comercial, was " +
                campoTxtBonificacionComercialCambio.getValue(), campoTxtBonificacionComercialCambio.getValue()
                .contains(dato.get("bonoC")));
        MatcherAssert.assertThat("Error en el valor de la bonificación técnica, was " +
                campoTxtBonificacionTecnicaCambio.getValue(), campoTxtBonificacionTecnicaCambio.getValue()
                .contains(dato.get("bonoT")));
    }

    public void verificarTarifacionPorCoberturas(ExamplesTable datos) {
        for (Map<String, String> dato : datos.getRows()) {
            int i = 1;
            List<WebElementFacade> tablaPrimaDePoliza = findAll(XPATH_TABLA_PRIMA_DE_POLIZA_TR);
            while (i <= tablaPrimaDePoliza.size()) {
                WebElementFacade descripcionCobertura = $(XPATH_TABLA_PRIMA_DE_POLIZA_TR + "[" + i + "]/td[1]");
                if (descripcionCobertura.equals(dato.get("descripcion"))) {
                    WebElementFacade montoPrima = $(XPATH_TABLA_PRIMA_DE_POLIZA_TR + "[" + i + "]/td[3]");
                    MatcherAssert.assertThat("Error en el valor de la tarifa, en la cobertura " + descripcionCobertura.getText()+ ". Esperaba: " + dato.get("valor") +
                            " pero fue: " + montoPrima.getText(), montoPrima.containsText(dato.get("valor")));
                    break;
                }
                i++;
            }
        }
    }
}
