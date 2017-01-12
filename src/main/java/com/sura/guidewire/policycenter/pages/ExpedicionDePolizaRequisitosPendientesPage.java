package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.pages.poliza.NuevaPolizaPage;
import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExpedicionDePolizaRequisitosPendientesPage extends PageUtil {
    public ExpedicionDePolizaRequisitosPendientesPage(WebDriver driver) {
        super(driver);
    }
    NuevaPolizaPage nuevaPolizaPage = new NuevaPolizaPage(getDriver());


    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    private WebElementFacade botonBorrar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    private WebElementFacade campoTxtAccesorios;
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnWrap']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl']")
    private WebElementFacade clikAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Imported_true-inputEl']")
    private WebElementFacade itemImportado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:showImported_false-inputEl']")
    private WebElementFacade itemImportadoPorTerceros;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestCardTab-btnInnerEl']")
    private WebElementFacade botonInteresAdicional;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton-btnWrap']")
    private WebElementFacade botonAgregarInteresAdicional;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddOtherContact']")
    private WebElementFacade botonOtrosContactos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddOtherContact:0:acctContact-textEl']")
    private WebElementFacade botonContacto;
    @FindBy(xpath = ".//div[3]/div/table/tbody/tr/td[5]/div")
    private WebElementFacade txtTipoBeneficiario;
    @FindBy(xpath = ".//li[3]")
    private WebElementFacade txtTipoBeneficiarioOneroso;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade botonVehiculos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    private WebElementFacade txtAccesoriosModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizarModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade txtciudadPolizaModificacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_true-inputEl']")
    private WebElementFacade itemVehiculoCeroKilometros;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_false-inputEl']")
    private WebElementFacade itemNoCeroKilometros;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div/span")
    private WebElementFacade botonVehiculosModificacion;
    @FindBy(xpath = ".//li")
    private WebElementFacade botonCiudadModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade txtCiudadModificacion;
    @FindBy(xpath = "..//*[@id='SubmissionWizard:SubmissionWizard_PreQualificationScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizarSubmission;
    @FindBy(xpath = ".//*[@id=\"JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl\"]")
    private WebElementFacade clickArchivoDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Imported_false-inputEl']")
    private WebElementFacade itemNoImportadoPorTerceros;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div/span")
    private WebElementFacade itemVehiculos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    private WebElementFacade comboBoxModeloSubmission;
    @FindBy(xpath = ".//li[30]")
    private WebElementFacade comboBoxModeloSubmissionClick;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']")
    private WebElementFacade txtCodigoFasecoldaSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Make_DV-inputEl']")
    private WebElementFacade comboBoxMarcaSubmission;
    @FindBy(xpath = ".//li[3]")
    private WebElementFacade comboBoxMarcaSubmissionClick;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade comboBoxCiudadCirculacionSubmission;
    @FindBy(xpath = ".//li")
    private WebElementFacade comboBoxCiudadCirculacionSubmissionClick;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-inputEl']")
    private WebElementFacade txtMotorSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-inputEl']")
    private WebElementFacade txtChasisSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    private WebElementFacade txtValorAseguradoSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade txtPlacaSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:plan_DV-inputEl']")
    private WebElementFacade comboBoxPlanSubmission;
    @FindBy(xpath = ".//li[7]")
    private WebElementFacade comboBoxPlanSubmissionClick;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl']")
    private WebElementFacade comboBoxClaseVehiculoSubmission;
    @FindBy(xpath = ".//li[2]")
    private WebElementFacade comboBoxClaseVehiculoSubmissionClick;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Model_DV-inputEl']")
    private WebElementFacade comboBoxLinea;
    @FindBy(xpath = ".//li[2]")
    private WebElementFacade comboBoxLineaClick;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']")
    private WebElementFacade comboBoxTipoServicio;
    @FindBy(xpath = ".//li[2]")
    private WebElementFacade comboBoxTipoServicioClick;
    @FindBy(xpath = "//div[contains(.,'<ninguno>') and contains(@class,'x-grid-cell-inner')]")
    private WebElementFacade txtBeneficiarioOnerosoModificacion;
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitosModificacion;
    @FindBy(xpath = ".//td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade txtCancelarPoliza;
    @FindBy(xpath = ".//li[8]")
    private WebElementFacade txtMotivoCancelarPoliza;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:NewCancellation-btnInnerEl']")
    private WebElementFacade botonIniciarTransaccion;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl']")
    private WebElementFacade botonOpcionesDeCompromiso;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:CancelNow-textEl']")
    private WebElementFacade botonCancelarAhora;
    @FindBy(xpath = ".//div[5]/div[3]/div/div/a/span/span/span")
    private WebElementFacade botonAceptarCancelacion;
    @FindBy(xpath = ".//div[5]/div[3]/div/div/a/span/span/span")
    private WebElementFacade tablaRequisitosCancelacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguienteModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade txtLimiteCobertura;
    @FindBy(xpath = ".//li[2]")
    private WebElementFacade botonLimiteCobertura;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:1:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxDeducible;
    @FindBy(xpath = ".//div[12]/div/ul/li")
    private WebElementFacade botonDeducibleModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PALlavesDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade txtPerdidaDeLLaves;
    @FindBy(xpath = ".//div[8]/div/ul/li[2]")
    private WebElementFacade botonPerdidaDeLlaves;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestCardTab-btnInnerEl']")
    private WebElementFacade botonInteresAdicionalModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton-btnWrap']")
    private WebElementFacade botonAgregarBeneficiarioModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddOtherContact-itemEl']")
    private WebElementFacade botonContactoModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddOtherContact:0:acctContact-textEl']")
    private WebElementFacade botonContactoExistente;
    @FindBy(xpath = "//div[contains(.,'<ninguno>') and contains(@class,'x-grid-cell-inner')]")
    private WebElementFacade txtBeneficiarioOnerosoModificacionBeneficiario;

    public void valorAccesorios(String accesorios) {
        waitUntil(WAIT_TIME_3000);
        itemNoImportadoPorTerceros.click();
        waitUntil(WAIT_TIME_3000);
        campoTxtAccesorios.sendKeys(accesorios);
    }

    public void verMensajeBloqueante(ExamplesTable mensajesBloqueo) {
        Map<String, String> bloqueoUW;
        tablaRequisitos.waitUntilPresent().waitUntilVisible();
        for (int i = 0; i < mensajesBloqueo.getRowCount(); i++) {
            bloqueoUW = mensajesBloqueo.getRows().get(i);
            MatcherAssert.assertThat(tablaRequisitos.getText(), Matchers.containsString(bloqueoUW.get("mensaje")));
        }
    }

    public void clickRequisitosPendientes() {
        findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:RequestRequirement-btnInnerEl']").click();
        for (String winHandle : getDriver().getWindowHandles()) {
            System.out.println("paginas " + getDriver().switchTo().window(winHandle));
        }
    }

    public void clickAgregarVehiculo() {
        waitFor(botonCrearVehiculo).waitUntilPresent();
        waitUntil(WAIT_TIME_2000);
        clickElement(botonCrearVehiculo);
        waitUntil(WAIT_TIME_3000);
    }

    public void relacionarAsegurado() {
        waitFor(botonRelacionarAsegurado).waitUntilPresent();
        waitUntil(WAIT_TIME_2000);
        clickElement(botonRelacionarAsegurado);
        clickElement(clikAsegurado);
    }

    public void vehiculoImportadoTerceros() {
        clickElement(itemImportado);
        clickElement(itemImportadoPorTerceros);
        waitUntil(WAIT_TIME_2000);
    }

    public void ingresarBeneficiarioOneroso() {
        itemNoImportadoPorTerceros.click();
        waitUntil(WAIT_TIME_3000);
        clickElement(botonInteresAdicional);
        botonAgregarInteresAdicional.click();
        botonOtrosContactos.click();
        botonContacto.click();
        txtTipoBeneficiario.click();
        txtTipoBeneficiarioOneroso.click();
    }

    public void clickVehiculosModificacion() {
        clickElement(botonVehiculosModificacion);
        clickElement(botonVehiculosModificacion);
    }

    public void agregarAccesorios(String accesorios) {
        waitUntil(WAIT_TIME_3000);
        txtAccesoriosModificacion.clear();
        waitUntil(WAIT_TIME_2000);
        txtAccesoriosModificacion.sendKeys(accesorios);
        waitUntil(WAIT_TIME_3000);
    }

    public void cotizarModificacionPoliza() {
        clickElement(botonCotizarModificacion);
        waitUntil(WAIT_TIME_3000);
    }

    public void ingresarCiudadModificacion(String ciudad) {
        waitUntil(WAIT_TIME_3000);
        txtciudadPolizaModificacion.clear();
        txtciudadPolizaModificacion.sendKeys(ciudad);
        clickElement(botonCiudadModificacion);
        waitUntil(WAIT_TIME_1000);
    }

    public void clickVehiculoCeroKilometros() {
        waitUntil(WAIT_TIME_3000);
        clickElement(itemVehiculoCeroKilometros);
    }

    public void valirdarPresenciaCotizar() {
        waitUntil(WAIT_TIME_3000);
        if (botonCotizarSubmission.isPresent()) {
            clickElement(botonCotizarSubmission);
        }
        waitUntil(WAIT_TIME_3000);
    }

    public void clickArchivoDePoliza() {
       clickElement(clickArchivoDePoliza);
    }

    public void seleccionarOpcionCeroKilometros() {
        clickElement(itemVehiculoCeroKilometros);
    }

    public void irAVehiculos() {
        clickElement(itemVehiculos);
        waitUntil(WAIT_TIME_2000);
    }

    public void verMensajeOpcional(ExamplesTable mensaje) {
        Map<String, String> bloqueoUW;
        tablaRequisitos.waitUntilPresent().waitUntilVisible();
        for (int i = 0; i < mensaje.getRowCount(); i++) {
            bloqueoUW = mensaje.getRows().get(i);
            MatcherAssert.assertThat(tablaRequisitos.getText(), Matchers.containsString(bloqueoUW.get("mensaje")));
        }
    }

    public void cotizarPoliza() {
       clickElement(botonCotizar);
    }

    public void agregarVehiculo(ExamplesTable datos) {
        Map<String, String> vehiculo = datos.getRow(0);
        comboBoxPlanSubmission.clear();
        selectItem(comboBoxPlanSubmission, vehiculo.get("plan"));
        waitUntil(WAIT_TIME_3000);
        selectItem(txtPlacaSubmission, vehiculo.get("placa"));
        comboBoxModeloSubmission.clear();
        waitUntil(WAIT_TIME_3000);
        selectItem(comboBoxModeloSubmission, vehiculo.get("modelo"));
        waitUntil(WAIT_TIME_3000);
        selectItem(txtCodigoFasecoldaSubmission, vehiculo.get("codigo_fasecolda"));
        waitUntil(WAIT_TIME_3000);
        selectItem(comboBoxClaseVehiculoSubmission, vehiculo.get("clase_vehiculo"));
        waitUntil(WAIT_TIME_3000);
        selectItem(comboBoxMarcaSubmission, vehiculo.get("marca"));
        waitUntil(WAIT_TIME_3000);
        selectItem(comboBoxLinea, vehiculo.get("linea"));
        waitUntil(WAIT_TIME_3000);
        selectItem(comboBoxCiudadCirculacionSubmission, vehiculo.get("ciudad_circulacion"));
        waitUntil(WAIT_TIME_3000);
        selectItem(comboBoxTipoServicio, vehiculo.get("vehiculo_servicio"));
        waitUntil(WAIT_TIME_3000);
        selectItem(txtMotorSubmission, vehiculo.get("motor"));
        waitUntil(WAIT_TIME_3000);
        selectItem(txtChasisSubmission, vehiculo.get("chasis"));
        waitUntil(WAIT_TIME_3000);
        txtValorAseguradoSubmission.clear();
        selectItem(txtValorAseguradoSubmission, vehiculo.get("valor_asegurado"));
        waitUntil(WAIT_TIME_2000);
        itemVehiculoCeroKilometros.click();
        waitUntil(WAIT_TIME_2000);
    }

    public void cambiarValorAccesorios() {
        campoTxtAccesorios.clear();
    }

    public void verMensajeBloqueanteModificacion(ExamplesTable mensaje) {
        Map<String, String> bloqueoUW;
        tablaRequisitosModificacion.waitUntilPresent().waitUntilVisible();
        for (int i = 0; i < mensaje.getRowCount(); i++) {
            bloqueoUW = mensaje.getRows().get(i);
            MatcherAssert.assertThat(tablaRequisitosModificacion.getText(), Matchers.containsString(bloqueoUW.get("mensaje")));
        }
    }

    public void beneficiarioOnerosoModificacion(String beneficiario) {
        clickElement(botonInteresAdicionalModificacion);
        waitUntil(WAIT_TIME_3000);
        withTimeoutOf(WAIT_TIME_5, TimeUnit.SECONDS).waitFor(botonAgregarBeneficiarioModificacion).click();
        //waitUntil(WAIT_TIME_5000);
        withTimeoutOf(WAIT_TIME_5, TimeUnit.SECONDS).waitFor(botonContactoModificacion).click();
        waitUntil(WAIT_TIME_2000);
        clickElement(botonContactoExistente);
        waitUntil(WAIT_TIME_3000);
        clickElement(txtBeneficiarioOnerosoModificacion);
        waitUntil(WAIT_TIME_3000);
        nuevaPolizaPage.seleccionarElementoDeLaLista(beneficiario);
        waitUntil(WAIT_TIME_3000);
    }

    public void cancelarPoliza() {
        clickElement(txtCancelarPoliza);
        clickElement(txtMotivoCancelarPoliza);
        clickElement(botonIniciarTransaccion);
        clickElement(botonOpcionesDeCompromiso);
        clickElement(botonAceptarCancelacion);
    }

    public void verMensajeCancelacion(ExamplesTable mensaje) {
        Map<String, String> bloqueoUW;
        tablaRequisitosCancelacion.waitUntilPresent().waitUntilVisible();
        for (int i = 0; i < mensaje.getRowCount(); i++) {
            bloqueoUW = mensaje.getRows().get(i);
            MatcherAssert.assertThat(tablaRequisitosCancelacion.getText(), Matchers.containsString(bloqueoUW.get("mensaje")));
        }
    }

    public void agregarCiudadCirculacion(String ciudad) {
        waitUntil(WAIT_TIME_3000);
        txtCiudadModificacion.clear();
        waitUntil(WAIT_TIME_3000);
        txtCiudadModificacion.waitUntilPresent().sendKeys(ciudad);
        clickElement(botonCiudadModificacion);
        waitUntil(WAIT_TIME_3000);
    }

    public void ingresarCoberturas(String deducible, String perdida_llaves) {
        waitUntil(WAIT_TIME_3000);
        clickElement(botonSiguienteModificacion);
        clickElement(botonSiguienteModificacion);
        waitUntil(WAIT_TIME_3000);
        botonBorrar.waitUntilPresent().click();
        botonBorrar.waitUntilNotVisible();
        waitUntil(WAIT_TIME_3000);
        selectItem(txtLimiteCobertura, "1.440");
        selectItem(comboBoxDeducible, deducible);
        selectItem(txtPerdidaDeLLaves, perdida_llaves);
    }
}

