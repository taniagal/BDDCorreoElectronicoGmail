package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

public class VisualizarCambiosEnPolizaPage extends PageUtil {
    @FindBy(xpath = "//span[contains(.,'Revisión de póliza')]")
    private WebElementFacade botonRevisionPoliza;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/div[2]/div/table/tbody/tr/td/div/div[2]/div/table/tbody/tr/td/div/div[2]/div/table/tbody/tr[2]/td[1]/div/span")
    private WebElementFacade botonDesplegarComparacion;
    @FindBy(xpath = "//div[contains(.,'ASD432')]")
    private WebElementFacade labelPlacaExistente;
    @FindBy(xpath = "//div[contains(.,'ASD439')]")
    private WebElementFacade labelPlacaNueva;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PALine']/div/span")
    private WebElementFacade botonCoberturasAutoPersonal;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade txtLimite;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PADrivers']/div")
    private WebElementFacade botonAsegurados;
    @FindBy(xpath = ".//div[2]/div/table/tbody/tr[2]/td/div/span")
    private WebElementFacade botonDesplegarComparacionCoberturas;
    @FindBy(xpath = ".//div[2]/div/table/tbody/tr[3]/td/div/span")
    private WebElementFacade botonCoberturas;
    @FindBy(xpath = ".//div[2]/div/table/tbody/tr[4]/td/div")
    private WebElementFacade botonDaños;
    @FindBy(xpath = ".//tr[6]/td[3]/div")
    private WebElementFacade labelDedudiblesNuevo;
    @FindBy(xpath = ".//tr[6]/td[2]/div")
    private WebElementFacade labelDedudiblesExistente;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade txtCiudad;

    public VisualizarCambiosEnPolizaPage(WebDriver driver) {
        super(driver);
    }

    public void comparacionDePolizas() {
        esperarYClickearBoton(botonRevisionPoliza);
        if (botonDesplegarComparacion.isPresent()) {
            esperarYClickearBoton(botonDesplegarComparacion);
            esperarYClickearBoton(botonDesplegarComparacion);
        }
    }

    public void cambiarCobertura(String cobertura) {
        esperarYClickearBoton(botonCoberturasAutoPersonal);
        ingresarDato(txtLimite, cobertura);
    }

    public void comparacionCoberturas(String coberturaExistente, String coberturaNueva) {
        ingresarDato(txtLimite, coberturaNueva);
        esperarYClickearBoton(botonRevisionPoliza);
        esperarYClickearBoton(botonDesplegarComparacionCoberturas);
        esperarYClickearBoton(botonDesplegarComparacionCoberturas);
        esperarYClickearBoton(botonCoberturas);
        esperarYClickearBoton(botonDaños);
        esperarYClickearBoton(botonDaños);
        MatcherAssert.assertThat("Error no aparece la cobertura", labelDedudiblesExistente.getValue().equals(("coberturaNueva")));
        MatcherAssert.assertThat("Error no aparece la cobertura", labelDedudiblesNuevo.getValue().equals(("coberturaExistente")));
    }

    public void opcionAsegurados() {
        esperarYClickearBoton(botonAsegurados);
    }

    public void cambiarCiudadCirculacion(String ciudad) {
        ingresarDato(txtCiudad, ciudad);
    }
}
