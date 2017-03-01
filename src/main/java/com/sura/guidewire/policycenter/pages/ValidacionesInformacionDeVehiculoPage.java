package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ValidacionesInformacionDeVehiculoPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:Next-btnInnerEl')]")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl')]")
    private WebElementFacade campoTxtPlaca;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl')]")
    private WebElementFacade comboBoxModelo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']")
    private WebElementFacade campoTxtCodigoFasecolda;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl')]")
    private WebElementFacade comboBoxVehiculoServicio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade comboBoxCiudadCirculacion;
    @FindBy(xpath = ".//*[contains(@id,'Wizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-inputEl')]")
    private WebElementFacade campoTxtMotor;
    @FindBy(xpath = ".//*[contains(@id,'Wizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-inputEl')]")
    private WebElementFacade campoTxtchasis;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl')]")
    private WebElementFacade campoTxtValorAsegurado;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:3:RateModifier-inputEl')]")
    private WebElementFacade campoTxtDescuento;
    @FindBy(xpath = ".//*[contains(@id,'Wizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:4:RateModifier-inputEl')]")
    private WebElementFacade campoTxtRecargo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:VehiculeZone-bodyEl']")
    private WebElementFacade campoTxtzona;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl']")
    private WebElementFacade botonAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_false-inputEl']")
    private WebElementFacade campoVehiculoCeroKm;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:plan_DV-inputEl']")
    private WebElementFacade comboBoxPlan;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV:0:tipoDocument']")
    private WebElementFacade nitAsegurado;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesLV-body')]")
    private WebElementFacade tablaVehiculo;
    @FindBy(xpath = ".//a[contains(.,'Descartar cambios no guardados')]")
    private WebElementFacade linkDescartarCambios;
    @FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_true-inputEl']")
    private WebElementFacade radioBotonSiCeroKilometros;
    @FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:0:BooleanModifier_true-inputEl']")
    private WebElementFacade comboBoxSiVehiculoBLindado;
    @FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:transportFuel_true-inputEl']")
    private WebElementFacade comboBoxSiTransporteCombustible;
    @FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:transportFuel_false-inputEl']")
    private WebElementFacade comboBoxNoTransporteCombustible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:SaleMethod_DV-inputEl']")
    private WebElementFacade comboMedioDeVenta;


    protected static final int TIEMPO_28000 = 28000;
    private String opcion = "Si";
    private static final String VALOR_ASEGURADO = "valor_asegurado";

    public ValidacionesInformacionDeVehiculoPage(WebDriver driver) {
        super(driver);
    }

    public void irAVehiculos() {
        waitFor(menuItemVehiculos).waitUntilPresent();
        esperarHasta(TIEMPO_2000);
        clickearElemento(menuItemVehiculos);
    }

    public void crearVehiculo() {
        botonCrearVehiculo.waitUntilPresent();
        clickearElemento(botonCrearVehiculo);
        campoTxtPlaca.waitUntilPresent();
    }

    public void agregarPlaca(String placa) {
        campoTxtPlaca.sendKeys(placa);
        campoTxtchasis.click();
        waitForTextToAppear(placa, TIEMPO_28000);
    }

    public void clickSiguienteConMensaje() {
        clickSiguiente();
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if ($(".message").isPresent()) {
            clickSiguiente();
        }
        resetImplicitTimeout();
    }

    public void clickSiguiente() {
        try {
            withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonSiguiente).waitUntilPresent();
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
        }
        clickearElemento(botonSiguiente);
    }

    public void clickLinkDescartarCambios() {
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (linkDescartarCambios.isPresent()) {
            linkDescartarCambios.click();
            esperarHasta(TIEMPO_1000);
            botonSiguiente.click();
        }
        resetImplicitTimeout();
    }


    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        Map<String, String> vehiculo = datosVehiculo.getRow(0);
        seleccionarItem(comboMedioDeVenta, vehiculo.get("medioVenta"));
        campoVehiculoCeroKm.click();
        esperarHasta(TIEMPO_3000);
        seleccionarItem(comboBoxPlan, vehiculo.get("plan"));
        ingresarPlaca(vehiculo);
        clickVehiculoServicio();
        seleccionarComboBoxModelo(vehiculo);
        if (!"".equals(vehiculo.get("codigo_fasecolda"))) {
            ingresarDato(campoTxtCodigoFasecolda, vehiculo.get("codigo_fasecolda"));
            campoTxtPlaca.click();
        }
        waitForCampoTxtValorAsegurado(vehiculo);
        esperarHasta(TIEMPO_2000);
        seleccionarCiudadDeCirculacion(vehiculo);
        esperarHasta(TIEMPO_1000);
        try {
            waitFor(ExpectedConditions.textToBePresentInElement(campoTxtzona, vehiculo.get("zona")));
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException" + e);
        }
        seleccionarItem(comboBoxVehiculoServicio, vehiculo.get("vehiculo_servicio"));
        agregarDescuento(vehiculo);
        if (opcion.equals(vehiculo.get("cero_kilometros"))) {
            seleccionarVehiculoCeroKilometros();
        }
        if (opcion.equals(vehiculo.get("vehiculo_blindado"))) {
            seleccionarVehiculoBlindado();
        }
        if (opcion.equals(vehiculo.get("transporte_combustible"))) {
            seleccionarTransporteDeCombustible(opcion);
        } else {
            opcion = "No";
            seleccionarTransporteDeCombustible(opcion);
        }
        try {
            MatcherAssert.assertThat("Error en el servicio de fasecolda, expected: " + vehiculo.get(VALOR_ASEGURADO) +
                    " but was: " + campoTxtValorAsegurado.getValue(), campoTxtValorAsegurado.getValue().contains(vehiculo.get(VALOR_ASEGURADO)));
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException" + e);

            esperarHasta(TIEMPO_2000);
            MatcherAssert.assertThat("Error en el servicio de fasecolda, expected: " + vehiculo.get(VALOR_ASEGURADO) +
                    " but was: " + campoTxtValorAsegurado.getValue(), campoTxtValorAsegurado.getValue().contains(vehiculo.get(VALOR_ASEGURADO)));
        }
    }

    public void seleccionarVehiculoCeroKilometros() {
        clickearElemento(radioBotonSiCeroKilometros);
    }

    public void seleccionarVehiculoBlindado() {
        esperarHasta(TIEMPO_2000);
        clickearElemento(comboBoxSiVehiculoBLindado);
    }

    public void seleccionarTransporteDeCombustible(String opcion) {
        esperarHasta(TIEMPO_2000);
        if ("Si".equals(opcion)) {
            clickearElemento(comboBoxSiTransporteCombustible);
        } else {
            clickearElemento(comboBoxNoTransporteCombustible);
            this.opcion = "Si";
        }
    }

    public void seleccionarCiudadDeCirculacion(Map<String, String> vehiculo) {
        seleccionarItem(comboBoxCiudadCirculacion, vehiculo.get("ciudad_circulacion"));
        esperarPorValor(comboBoxCiudadCirculacion, vehiculo.get("ciudad_circulacion"));
    }

    public void ingresarPlacaConModelo2011(Map<String, String> vehiculo) {
        seleccionarItem(comboMedioDeVenta, vehiculo.get("medioVenta"));
        campoVehiculoCeroKm.click();
        esperarHasta(TIEMPO_3000);
        ingresarPlaca(vehiculo);
        clickearElemento(tablaVehiculo);
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElement(tablaVehiculo, "2011"));
    }

    public void ingresarPlaca(Map<String, String> vehiculo) {
        esperarHasta(TIEMPO_1000);
        if (!"random".equals(vehiculo.get("placa"))) {
            ingresarDato(campoTxtPlaca, vehiculo.get("placa"));
        } else {
            String placa = "QWE" + (int) Math.floor(Math.random() * (1000 - 9999) + 9999);
            campoTxtPlaca.waitUntilVisible().clear();
            try {
                ingresarDato(campoTxtPlaca, placa);
            } catch (StaleElementReferenceException e) {
                esperarHasta(TIEMPO_2000);
                ingresarDato(campoTxtPlaca, placa);
                LOGGER.info("StaleElementReferenceException at ValidacionesInformacionDeVehiculo Page 129 " + e);
            }
        }
        esperarHasta(TIEMPO_1000);
    }

    public void waitForCampoTxtValorAsegurado(Map<String, String> vehiculo) {
        try {
            withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElementValue(campoTxtValorAsegurado, vehiculo.get(VALOR_ASEGURADO)));
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
            seleccionarItem(comboBoxModelo, "2010");
            waitFor(ExpectedConditions.textToBePresentInElement(tablaVehiculo, "2010"));
            seleccionarComboBoxModelo(vehiculo);
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisibleException" + e);
        }
    }

    public void seleccionarComboBoxModelo(Map<String, String> vehiculo) {
        try {
            seleccionarItem(comboBoxModelo, vehiculo.get("modelo"));
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException at ValidacionesInformacionDeVehiculo Page 131 " + e);
            seleccionarItem(comboBoxModelo, vehiculo.get("modelo"));
        }
        try {
            waitFor(ExpectedConditions.textToBePresentInElement(tablaVehiculo, vehiculo.get("modelo")));
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
        }
        esperarHasta(TIEMPO_2000);
    }

    public void agregarDescuento(Map<String, String> vehiculo) {
        if (!"null".equals(vehiculo.get("descuento"))) {
            campoTxtDescuento.sendKeys(vehiculo.get("descuento"));
            campoTxtRecargo.sendKeys(vehiculo.get("recargo"));
        }
        if (!"null".equals(vehiculo.get("motor"))) {
            campoTxtMotor.clear();
            campoTxtMotor.sendKeys(vehiculo.get("motor"));
            campoTxtchasis.clear();
            campoTxtchasis.sendKeys(vehiculo.get("chasis"));
        }
    }

    public void clickVehiculoServicio() {
        comboBoxVehiculoServicio.click();
        try {
            waitFor(ExpectedConditions.textToBePresentInElement(tablaVehiculo, campoTxtPlaca.getText()));
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
        } catch (NoSuchElementException f) {
            LOGGER.info("NoSuchElementException " + f);
        }
        esperarHasta(TIEMPO_2000);
    }

    public void agregarCodigoFasecolda(String codigo) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonCrearVehiculo).click();
        comboBoxModelo.waitUntilPresent();
        seleccionarItem(comboBoxModelo, "2015");
        waitForTextToAppear("2015");
        campoTxtCodigoFasecolda.sendKeys(codigo);
        campoTxtPlaca.click();
        esperarHasta(TIEMPO_2000);
    }

    public void verificarMensajes(ExamplesTable mensajes) {
        verificarMensajes(divMensaje, mensajes);
    }

    public void verificarEstadoDelCampoCodigo() {
        MatcherAssert.assertThat("Error, no se validó el codigo fasecolda.", "".equals(campoTxtCodigoFasecolda.getValue()));
    }

    public void relacionarAseguradoDelVehiculo(String asegurado) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonRelacionarAsegurado).waitUntilClickable();
        botonRelacionarAsegurado.click();
        waitFor(botonAsegurado);
        botonAsegurado.click();
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(nitAsegurado).shouldBePresent();
        esperarHasta(TIEMPO_3000);
    }

    public void validarAvanceSiguientePagina() {
        esperarHasta(TIEMPO_1000);
        WebElementFacade labelTituloCoberturasAuto = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:ttlBar']");
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(labelTituloCoberturasAuto).shouldBePresent();
        MatcherAssert.assertThat(labelTituloCoberturasAuto.getText(), Is.is(Matchers.equalTo("Coberturas de auto personal")));
        esperarHasta(TIEMPO_1000);
    }

    public void agregarCiudadDeCirculacion(ExamplesTable datosCotizacion) {
        Map<String, String> vehiculo = datosCotizacion.getRow(0);
        try {
            campoVehiculoCeroKm.waitUntilPresent();
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
        }
        clickearElemento(campoVehiculoCeroKm);
        esperarHasta(TIEMPO_3000);
        seleccionarCiudadDeCirculacion(vehiculo);
    }

    public void agregarValorAsegurado(String valorAsegurado) {
        campoTxtValorAsegurado.waitUntilPresent().clear();
        campoTxtValorAsegurado.sendKeys(valorAsegurado);
    }

    public void validarQueNoPermiteAgregarMasDeUnAuto() {
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        MatcherAssert.assertThat("El botón de crear vehículo debe estar oculto cuando ya hay un vehículo creado ", botonCrearVehiculo.isVisible(), Is.is(Matchers.equalTo(false)));
        resetImplicitTimeout();
    }
}
