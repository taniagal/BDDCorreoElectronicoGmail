package com.sura.guidewire.policycenter.pages.modificaciones;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class VisualizarCambiosEnPolizaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyReview']/div/span")
    private WebElementFacade botonRevisionPoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_DifferencesScreen:DifferencesPanelSet:DiffTreePanelSet:ComparisonDiffTreeTab']")
    private WebElementFacade pestaniaComparacion;
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
    private WebElementFacade botonDanios;
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
        boolean comparacion = false;
        int intentos = 0;
        clickearElemento(botonRevisionPoliza);
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        while (intentos < CONSTANTE_3) {
            if (pestaniaComparacion.isVisible()) {
                comparacion = true;
                intentos = CONSTANTE_3;
            } else {
                clickearElemento(botonRevisionPoliza);
                intentos++;
            }
        }
        resetImplicitTimeout();
        MatcherAssert.assertThat("No se encontró la pestaña de comparación de la modificación de la póliza ", comparacion, Matchers.equalTo(true));
    }

    public void cambiarCobertura(String cobertura) {
        esperarYClickearBoton(botonCoberturasAutoPersonal);
        ingresarDato(txtLimite, cobertura);
    }

    public void opcionAsegurados() {
        esperarYClickearBoton(botonAsegurados);
    }

    public void cambiarCiudadCirculacion(String ciudad) {
        ingresarDato(txtCiudad, ciudad);
    }
}
