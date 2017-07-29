package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class ExpedicionDePolizaRequisitosPendientesPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    private WebElementFacade botonBorrar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    private WebElementFacade campoTxtAccesorios;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade tablaRequisitos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnWrap']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl']")
    private WebElementFacade menuItemAsegurado;
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
    private WebElementFacade campoTxtTipoBeneficiario;
    @FindBy(xpath = ".//li[3]")
    private WebElementFacade campoTxtTipoBeneficiarioOneroso;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    private WebElementFacade campoTxtAccesoriosModificacion;
    @FindBy(xpath = ".//a[contains(.,'Cotizar')]")
    private WebElementFacade botonCotizarModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade txtciudadPolizaModificacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_true-inputEl']")
    private WebElementFacade radioBotonVehiculoCeroKilometros;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div/span")
    private WebElementFacade botonVehiculosModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade txtCiudadModificacion;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    private WebElementFacade menuItemArchivoDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Imported_false-inputEl']")
    private WebElementFacade itemNoImportadoPorTerceros;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div/span")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    private WebElementFacade comboBoxModeloSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']")
    private WebElementFacade txtCodigoFasecoldaSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Make_DV-inputEl']")
    private WebElementFacade comboBoxMarcaSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade comboBoxCiudadCirculacionSubmission;
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl']")
    private WebElementFacade comboBoxClaseVehiculoSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Model_DV-inputEl']")
    private WebElementFacade comboBoxLinea;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']")
    private WebElementFacade comboBoxTipoServicio;
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
    @FindBy(xpath = ".//*[contains(@id, 'LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:1:SuraPACovTermInputSet:DirectTermInput-inputEl')]")
    private WebElementFacade comboBoxDeducible;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade perdidaParcialReemplazoCambioPoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:1:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade perdidaTotalReemplazoCambioPoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade asistenciaGlobalCambioPoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PALlavesDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade txtPerdidaDeLLaves;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestCardTab-btnInnerEl']")
    private WebElementFacade linkInteresAdicional;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton']")
    private WebElementFacade botonAgregarBeneficiario;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddOtherContact']")
    private WebElementFacade menuItemOtrosContactos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddOtherContact:0:acctContact']")
    private WebElementFacade menuItemContacto1;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV-body']/div/table/tbody/tr/td[5]")
    private WebElementFacade comboBoxTipoBeneficiario;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div/div/a[2]/span/span/span[1]")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[contains(@id, 'LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:SaleMethod_DV-inputEl')]")
    private WebElementFacade comboMedioDeVenta;

    public ExpedicionDePolizaRequisitosPendientesPage(WebDriver driver) {
        super(driver);
    }

    public void valorAccesorios(String accesorios) {
        clickearElemento(itemNoImportadoPorTerceros);
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

    public void clickAgregarVehiculo() {
        waitFor(botonCrearVehiculo).waitUntilPresent();
        clickearElemento(botonCrearVehiculo);
    }

    public void relacionarAsegurado() {
        waitFor(botonRelacionarAsegurado).waitUntilPresent();
        clickearElemento(botonRelacionarAsegurado);
        clickearElemento(menuItemAsegurado);
    }

    public void vehiculoImportadoTerceros() {
        clickearElemento(itemImportado);
        clickearElemento(itemImportadoPorTerceros);
    }

    public void ingresarBeneficiarioOneroso() {
        itemNoImportadoPorTerceros.click();
        clickearElemento(botonInteresAdicional);
        botonAgregarInteresAdicional.click();
        botonOtrosContactos.click();
        botonContacto.click();
        campoTxtTipoBeneficiario.click();
        campoTxtTipoBeneficiarioOneroso.click();
    }

    public void clickVehiculosModificacion() {
        clickearElemento(botonVehiculosModificacion);
        clickearElemento(botonVehiculosModificacion);
    }

    public void agregarAccesorios(String accesorios) {
        campoTxtAccesoriosModificacion.clear();
        campoTxtAccesoriosModificacion.sendKeys(accesorios);
    }

    public void cotizarModificacionPoliza() {
        clickearElemento(botonCotizarModificacion);
    }

    public void clickVehiculoCeroKilometros() {
        clickearElemento(radioBotonVehiculoCeroKilometros);
    }

    public void clickArchivoDePoliza() {
        clickearElemento(menuItemArchivoDePoliza);
    }

    public void seleccionarOpcionCeroKilometros() {
        radioBotonVehiculoCeroKilometros.click();
        esperarYClickearBoton(botonSiguiente);
    }

    public void irAVehiculos() {
        clickearElemento(menuItemVehiculos);
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
        botonCotizar.click();
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
        linkInteresAdicional.waitUntilPresent();
        clickearElemento(linkInteresAdicional);
        botonAgregarBeneficiario.waitUntilPresent();
        clickearElemento(botonAgregarBeneficiario);
        menuItemOtrosContactos.waitUntilPresent();
        actions.moveToElement(menuItemOtrosContactos).release(menuItemOtrosContactos).build().perform();
        menuItemContacto1.waitUntilPresent();
        clickearElemento(menuItemContacto1);
        comboBoxTipoBeneficiario.waitUntilPresent().click();
        NuevaPolizaPage nuevaPolizaPage = new NuevaPolizaPage(getDriver());
        nuevaPolizaPage.seleccionarElementoDeLaLista(beneficiario);
    }

    public void cancelarPoliza() {
        txtCancelarPoliza.click();
        clickearElemento(txtMotivoCancelarPoliza);
        botonIniciarTransaccion.click();
        clickearElemento(botonOpcionesDeCompromiso);
        botonAceptarCancelacion.click();
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
        seleccionarItem(txtciudadPolizaModificacion, ciudad);
    }

    public void ingresarCoberturas(String deducible, String perdidaLlaves, String perdidaParcialReemplazo, String perdidaTotalReemplazo, String asistencia) {
        clickearElemento(botonSiguienteModificacion);
        botonBorrar.waitUntilPresent();
        clickearElemento(botonBorrar);
        botonBorrar.waitUntilNotVisible();
        seleccionarItem(txtLimiteCobertura, "640.");
        seleccionarItem(comboBoxDeducible, deducible);
        seleccionarItem(perdidaParcialReemplazoCambioPoliza, perdidaParcialReemplazo);
        seleccionarItem(perdidaTotalReemplazoCambioPoliza, perdidaTotalReemplazo);
        seleccionarItem(asistenciaGlobalCambioPoliza, asistencia);
        if (txtPerdidaDeLLaves.isVisible()) {
            seleccionarItem(txtPerdidaDeLLaves, perdidaLlaves);
        }
    }

    public void seleccionarMedioDeVenta(String medioVenta) {
        seleccionarItem(comboMedioDeVenta, medioVenta);
    }

}

