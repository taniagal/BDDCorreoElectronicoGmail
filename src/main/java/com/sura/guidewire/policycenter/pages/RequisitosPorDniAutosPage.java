package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.pages.poliza.NuevaPolizaPage;
import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RequisitosPorDniAutosPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestCardTab-btnInnerEl']")
    private WebElementFacade botonInteresAdicionalSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton-btnWrap']")
    private WebElementFacade botonAgregarInteresAdicionalSubmission;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddFromSearch-textEl']")
    private WebElementFacade botonAgregarDelDirectorio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy-btnInnerEl']")
    private WebElementFacade botonExpedir;
    @FindBy(xpath = "//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarExpedicion;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade campoTiposDocumento;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//li[contains(.,'CEDULA DE CIUDADANIA')]")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscarBeneficiario;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    private WebElementFacade botonSeleccionarBeneficiario;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']")
    private WebElementFacade botonEditarTransacionDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade botonVehiculos;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarTransaccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV-body']/div/table/tbody/tr/td[5]")
    private WebElementFacade txtTipoBeneficiario;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CancelDate_date-inputEl']")
    private WebElementFacade txtFechaVigencia;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:NewCancellation-btnInnerEl']")
    private WebElementFacade botonIniciarCancelacion;
    @FindBy(xpath = ".//*[@id='centerPanel']")
    private WebElementFacade panelCancelacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Requirements']/div")
    private WebElementFacade botonRequisitosExpedicion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:RiskAnalysis']/div")
    private WebElementFacade botonRequisitosModificacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Requirements']/div/span")
    private WebElementFacade tablaRequisitos;
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitosModificacion;
    @FindBy(xpath = "//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitosExpedicion;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:MainOffice-inputEl']")
    private WebElementFacade txtOficina;
    @FindBy(xpath = "//li[contains(.,'1059 > ASESORES EN DESARROLLO CALI')]")
    private WebElementFacade botonOficinaSeleccionada;

    public RequisitosPorDniAutosPage(WebDriver driver) {
        super(driver);
    }

    public void agregarBeneficiarioAutos(String tipoDocumento, String numeroDocumento, String tipoBeneficiario) {
        esperarHasta(TIEMPO_2000);
        esperarYClickearBoton(botonEditarTransacionDePoliza);
        esperarYClickearBoton(botonAceptarTransaccion);
        esperarYClickearBoton(botonVehiculos);
        esperarYClickearBoton(botonInteresAdicionalSubmission);
        clickearElemento(botonAgregarInteresAdicionalSubmission);
        clickearElemento(botonAgregarDelDirectorio);
        ingresarDato(campoTiposDocumento, tipoDocumento);
        clickearElemento(campoTipoDocumento);
        esperarHasta(TIEMPO_3000);
        ingresarDato(campoNumeroDocumento, numeroDocumento);
        clickearElemento(botonBuscarBeneficiario);
        clickearElemento(botonSeleccionarBeneficiario);
        txtTipoBeneficiario.waitUntilPresent().click();
        NuevaPolizaPage nuevaPolizaPage = new NuevaPolizaPage(getDriver());
        nuevaPolizaPage.seleccionarElementoDeLaLista(tipoBeneficiario);
    }

    public void cambiarFechaCancelacion(String fecha) {
        txtFechaVigencia.clear();
        ingresarDato(txtFechaVigencia, fecha);
        esperarHasta(TIEMPO_3000);
        clickearElemento(panelCancelacion);
        clickearElemento(botonIniciarCancelacion);
    }

    public void irARequisitos() {
        if (botonRequisitosExpedicion.isPresent()) {
            botonRequisitosExpedicion.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
        } else {
            botonRequisitosModificacion.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
        }

    }

    public void nombresDni(ExamplesTable mensajes) {
        esperarHasta(TIEMPO_2000);
        if (tablaRequisitos.isPresent()) {
            esperarYClickearBoton(tablaRequisitos);
            esperarHasta(3000);
            verificarMensajes(tablaRequisitos, mensajes);
        } else {
            if (tablaRequisitosModificacion.isPresent()) {
                esperarYClickearBoton(tablaRequisitosModificacion);
                esperarHasta(3000);
                verificarMensajes(tablaRequisitosModificacion, mensajes);
            }
        }
    }

    public String validarMensajeRequisitosPendientes() {
        tablaRequisitosExpedicion.waitUntilPresent();
        return tablaRequisitosExpedicion.getText();
    }

    public void cotizarYExpedirPoliza() {
        esperarYClickearBoton(botonAceptarExpedicion);
    }

    public void agregarOficina() {
        txtOficina.click();
        botonOficinaSeleccionada.click();
    }
}


