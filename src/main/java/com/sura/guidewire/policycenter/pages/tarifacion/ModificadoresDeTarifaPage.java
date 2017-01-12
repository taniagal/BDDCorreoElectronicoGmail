package com.sura.guidewire.policycenter.pages.tarifacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ModificadoresDeTarifaPage extends PageUtil {
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:1:TypeKeyModifier-inputEl']")
    public WebElementFacade comboBoxDescuentoDipositivo;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:0:ShortDescriptionAndSize']")
    public WebElementFacade labelUW;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;

    int bonoComercial = 0;
    int bonoTecnico = 0;

    public ModificadoresDeTarifaPage(WebDriver driver) {
        super(driver);
    }

    public void verificarBonoTecnico(String bono) {
        MatcherAssert.assertThat("Error en el valor de la bonificación técnica, was " + campoTxtBonificacionTecnica.getValue(), campoTxtBonificacionTecnica.getValue().contains(bono));
    }

    public void verificarBonoComercial(String bono) {
        MatcherAssert.assertThat("Error en el valor de la bonificación comercial, was " + campoTxtBonificacionComercial.getValue(), campoTxtBonificacionComercial.getValue().contains(bono));
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
        String tablaxpth = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:costLV-body']/*/table/tbody/tr[";
        for (Map<String, String> valor : valores.getRows()) {
            WebElementFacade tablaDescripcion = findBy(tablaxpth + valor.get("fila") + "]/td[3]");
            LOGGER.info(valor.get("valor") + " | " + tablaDescripcion.getText());
        }

        for (Map<String, String> valor : valores.getRows()) {
            WebElementFacade tablaDescripcion = findBy(tablaxpth + valor.get("fila") + "]/td[3]");
            WebElementFacade cobertura = findBy(tablaxpth + valor.get("fila") + "]/td[1]");
            MatcherAssert.assertThat("Error en el valor de la cobertura '" + valor.get("fila") + " - " +
                    cobertura.getText() + "' de la tarifacion Expected: " + valor + " But was: " + tablaDescripcion.getText(), tablaDescripcion.containsText(valor.get("valor")));
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
        withTimeoutOf(WAIT_TIME_30, TimeUnit.SECONDS).waitFor(menuItemVehiculos).waitUntilPresent();
        clickElement(menuItemVehiculos);
        campoTxtBonificacionTecnicaCambio.waitUntilPresent().sendKeys(bonoT);
    }
}
