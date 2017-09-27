package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class RequisitosPorDniAutosPage extends PageUtil {
    @Page
    NuevaPolizaPage nuevaPolizaPage;
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
    @FindBy(xpath = "//td[@id='SubmissionWizard:Requirements']/div/span")
    private WebElementFacade botonRequisitosExpedicion;
    @FindBy(xpath = ".//span[contains(.,'Requisitos') and contains(@class,'x-tree-node-text ')]")
    private WebElementFacade botonRequisitosRehabilitacion;
    @FindBy(id = "ReinstatementWizard:RequirementsScreen:ContactsWithRequirmentsLV:0:addConinsuranceLink")
    private WebElementFacade botonDiligenciarRequisitosuno;
    @FindBy(id = "RequirementsByContact_ExtPopup:RequestRequirement-btnInnerEl")
    private WebElementFacade botonDiligenciarRequisitosdos;
    @FindBy(xpath = ".//tr[4]/td/div/table/tbody/tr[3]/td")
    private WebElementFacade tablaRequisitos;
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitosModificacion;
    @FindBy(xpath = "//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitosExpedicion;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:MainOffice-inputEl']")
    private WebElementFacade txtOficina;
    @FindBy(xpath = "//li[contains(.,'1059 > ASESORES EN DESARROLLO CALI')]")
    private WebElementFacade botonOficinaSeleccionada;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']")
    private WebElementFacade txtTipoPoliza;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton']")
    private WebElementFacade botonBorrar;
    @FindBy(id = "p1")
    private WebElementFacade chckRequisitos;
    @FindBy(id = "rbEstadoFisico6")
    private WebElementFacade opcionRecibido;
    @FindBy(name = "rbEstadoFisico")
    private WebElementFacade comboEstadoFisico;
    @FindBy(xpath = "//*[@id=\"frmRequisitos\"]/table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr[8]/td/table/tbody/tr/td[1]/a/img")
    private WebElementFacade botonActualizarEstados;
    @FindBy(xpath=".//table/tbody/tr[1]/td[2]//table//")
    private WebElementFacade tblRequisitos;
    public String tblColumnas=".//table/tbody/tr[1]/td[2]//table//div[contains(.,'Requisitos')]";
    @FindBy(xpath=".//*[@id='SubmissionWizard:RequirementsScreen:ContactsWithRequirmentsLV:0:addConinsuranceLink']")
    private WebElementFacade btnRequisitos;
    @FindBy(xpath=".//*[@id='RequirementsByContact_ExtPopup:RequestRequirement']")
    private WebElementFacade btnRequisitos2;
    public String tblPubVisualRequisitos=".//*[@id='frmRequisitos']/table/tbody/tr[4]/td//td[1]";
    public String tblColumnasItem=".//*[@id='reqCliente']//tr//td[1]";


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
        botonRequisitosExpedicion.waitUntilPresent();
        clickearElemento(botonRequisitosExpedicion);
    }

    public void irARequisitosEnRehabilitacion() {
        botonRequisitosRehabilitacion.waitUntilPresent();
        clickearElemento(botonRequisitosRehabilitacion);
    }

    public void diligenciarRequisitos() {
        botonDiligenciarRequisitosuno.waitUntilVisible();
        botonDiligenciarRequisitosuno.click();
        botonDiligenciarRequisitosdos.waitUntilVisible();
        botonDiligenciarRequisitosdos.click();
        seleccionarPestanaDelNavegador(CONSTANTE_1);
        llenarFormularioDeRequisitos();
        cerrarPestanaDelNavegador();
        seleccionarPestanaDelNavegador(CONSTANTE_0);
    }

    public void llenarFormularioDeRequisitos() {
        chckRequisitos.click();
        desplegarElementoDeLista(comboEstadoFisico);
        opcionRecibido.click();
        botonActualizarEstados.click();
    }

    public void seleccionarPestanaDelNavegador(int numeroTab) {
        ArrayList<String> newTab = new ArrayList(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTab.get(numeroTab));
    }

    public void cerrarPestanaDelNavegador() {
        getDriver().close();
    }

    public void cotizarYExpedirPoliza() {
        esperarYClickearBoton(botonAceptarExpedicion);
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        if (botonBorrar.isPresent() && !$(".message").containsText("2011 AUDI AVEO FAMILY")) {
            clickearElemento(botonBorrar);
            waitForTextToDisappear("2011 AUDI AVEO FAMILY");
        }
        resetImplicitTimeout();
    }

    public String validarItems() {
        return withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(tablaRequisitos).getText();
    }

    public void expedirPoliza() {
        esperarObjetoClikeableServidorWe(botonAceptarExpedicion);
    }

    public void diligenciarTodosLosRequisitos() {
        if(btnRequisitos.isPresent()&& btnRequisitos.isVisible()){
            clickearElemento(btnRequisitos);
        }
        if(btnRequisitos2.isPresent()&& btnRequisitos2.isVisible()){
            clickearElemento(btnRequisitos2);
        }
        seleccionarPestanaDelNavegador(CONSTANTE_1);
        aprobarRequisitos(tblPubVisualRequisitos,tblColumnasItem);
        desplegarElementoDeLista(comboEstadoFisico);
        opcionRecibido.click();
        botonActualizarEstados.click();
        cerrarPestanaDelNavegador();

    }
}


