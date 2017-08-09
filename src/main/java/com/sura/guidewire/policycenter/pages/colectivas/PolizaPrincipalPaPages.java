package com.sura.guidewire.policycenter.pages.colectivas;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

public class PolizaPrincipalPaPages extends PageUtil {

    @FindBy(xpath = ".//*[contains(@id, ':Forms') and contains(., 'Formularios')]/div/span")
    WebElementFacade menuOpcionFormularios;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_Vehicles']/div")
    WebElementFacade menuOpcionVehiculo;

    public static final String TITULO_COTIZACION = "Cotización";

    public PolizaPrincipalPaPages(WebDriver driver) {
        super(driver);
    }

    public boolean validarBotonMenuAseguradosNoVisible() {
        WebElementFacade botonMenuAsegurados = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']");
        return esElElementoWebVisible(botonMenuAsegurados);
    }

    public boolean validarBotonMenuVehiculosNoVisible() {
        WebElementFacade botonMenuVehiculos = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']");
        return esElElementoWebVisible(botonMenuVehiculos);
    }

    public boolean validarBotonMenuCoberturasNoVisible() {
        WebElementFacade botonMenuCoberturas = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:PALine']");
        return esElElementoWebVisible(botonMenuCoberturas);
    }

    public boolean validarTablasDeDetalleDelRiesgoNoVisibles() {
        WebElementFacade tablasDeRiesgos = findBy("//div[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:ReviewSummaryCV-body']");
        return esElElementoWebVisible(tablasDeRiesgos);
    }

    public boolean validarMenuLateralNotasVisible() {
        WebElementFacade menuNotas = findBy(".//*[@id='SubmissionWizard:Notes']/div");
        return esElElementoWebVisible(menuNotas);
    }

    public boolean validarMenuLateralDocumentosVisible() {
        WebElementFacade menuDocumentos = findBy(".//*[@id='SubmissionWizard:Documents']/div");
        return esElElementoWebVisible(menuDocumentos);
    }

    public boolean validarMenuLateralParticipantesVisible() {
        WebElementFacade menuParticipantes = findBy(".//*[@id='SubmissionWizard:Participants']/div");
        return esElElementoWebVisible(menuParticipantes);
    }

    public boolean validarMenuLateralPlanDeTrabajoVisible() {
        WebElementFacade menuPlanDeTrabajo = findBy(".//*[@id='SubmissionWizard:Workplan']/div");
        return esElElementoWebVisible(menuPlanDeTrabajo);
    }

    public boolean validarMenuLateralHistorialVisible() {
        WebElementFacade menuHistorial = findBy(".//*[@id='SubmissionWizard:History']/div");
        return esElElementoWebVisible(menuHistorial);
    }

    public void clicEnElBotonCotizar() {
        WebElementFacade botonCotizar = findBy(".//*[contains(@id, 'JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl')]");
        botonCotizar.waitUntilPresent();
        botonCotizar.click();
        waitForTextToAppear(TITULO_COTIZACION);
    }

    public boolean validarTablaTituloVehiculosEnCotizacion() {
        WebElementFacade tablaTitulo = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:SubmissionWizard_Quote_CumulativeCardTab']");
        return esElElementoWebVisible(tablaTitulo);
    }

    public boolean validarBotonVerTablaDeTrabajoEnCotizacion() {
        WebElementFacade botonVerTablaDeTrabajo = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:RatingOverrideButtonDV:RatingOverrideButtonDV:ViewWorksheet']");
        return esElElementoWebVisible(botonVerTablaDeTrabajo);
    }

    public boolean validarMenuLateralEnPolizaAseguradosNoVisible() {
        WebElementFacade menuLateralAsegurados = findBy(".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_Drivers']/div");
        return esElElementoWebVisible(menuLateralAsegurados);
    }

    public boolean validarMenuLateralEnPolizaVehiculosNoVisible() {
        WebElementFacade menuLateralVehiculos = findBy(".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_Vehicles']/div");
        return esElElementoWebVisible(menuLateralVehiculos);
    }

    public boolean validarMenuLateralEnPolizaCoberturasNoVisible() {
        WebElementFacade menuLateralAsegurados = findBy(".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_PersonalAuto']/div");
        return esElElementoWebVisible(menuLateralAsegurados);
    }

    public boolean validarMenuLateralEnPolizaResumenVisible() {
        WebElementFacade menuLateralResumen = findBy(".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Summary']/div");
        return esElElementoWebVisible(menuLateralResumen);
    }

    public boolean validarMenuLateralEnPolizaFacturacionVisible() {
        WebElementFacade menuLateralFacturacion = findBy(".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Billing']/div");
        return esElElementoWebVisible(menuLateralFacturacion);
    }

    public boolean validarMenuLateralEnPolizaNotasVisible() {
        WebElementFacade menuLateralNotas = findBy(".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Notes']/div");
        return esElElementoWebVisible(menuLateralNotas);
    }

    public boolean validarMenuLateralEnPolizaParticipantesVisible() {
        WebElementFacade menuLateralParticipantes = findBy(".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Participants']/div");
        return esElElementoWebVisible(menuLateralParticipantes);
    }

    public boolean validarMenuLateralEnPolizaContactosVisible() {
        WebElementFacade menuLateralContactos = findBy(".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Contacts']/div");
        return esElElementoWebVisible(menuLateralContactos);
    }

    public boolean validarPanelDeDetalleEnCotizacion() {
        WebElementFacade panelDeDetalle = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:1']");
        return esElElementoWebVisible(panelDeDetalle);
    }

    public boolean validarTablaDeVehiculosEnCotizacion() {
        boolean vacio = false;
        List<WebElementFacade> tablasDeVehiculos = findAll(".//td[@class='x-table-layout-cell']");
        if (tablasDeVehiculos.isEmpty()) {
            vacio = true;
        }
        return vacio;
    }

    public boolean validarCamposEditables(List<WebElementFacade> camposEnPantalla) {
        boolean editables = false;
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        for (int i = 0; i < camposEnPantalla.size(); i++) {
            if ("textbox".equals(camposEnPantalla.get(i).getAttribute("role")) && camposEnPantalla.get(i).isVisible()) {
                if (camposEnPantalla.get(i).getText() != null) {
                    editables = true;
                } else {
                    resetImplicitTimeout();
                    return false;
                }
            }
        }
        resetImplicitTimeout();
        return editables;
    }

    public boolean validarQueTodosLosCamposDeLaCotizacionNoSonEditables() {
        List<WebElementFacade> camposDeCotizacion = findAll("//div[contains(@id, 'SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:')]");
        return this.validarCamposEditables(camposDeCotizacion);
    }

    public boolean validarQueTodosLosCamposDeLaCotizacionEnLaPolizaExpedidaNoSonEditables() {
        List<WebElementFacade> camposDePoliza = findAll("//div[contains(@id, 'PolicyFile_Pricing:PolicyFile_PricingScreen:PolicyFile_Quote_SummaryDV:')]");
        return this.validarCamposEditables(camposDePoliza);
    }

    public void clicMenuLateralCotizacion() {
        WebElementFacade botonMenuLateralCotizacion = findBy(".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_Pricing']/div");
        botonMenuLateralCotizacion.waitUntilPresent();
        botonMenuLateralCotizacion.click();
        waitForTextToAppear(TITULO_COTIZACION);
    }

    private boolean esElElementoWebVisible(WebElementFacade elemento) {
        boolean visible;
        setImplicitTimeout(TIEMPO_3000, TimeUnit.MILLISECONDS);
        if (!elemento.isVisible()) {
            visible = false;
        } else {
            visible = true;
        }
        resetImplicitTimeout();
        return visible;
    }

    public boolean validarMenuOpcionFormulariosNoEsVisible(){
        return this.esElElementoWebVisible(menuOpcionFormularios);
    }

    public void clicMenuVehiculo(){
        menuOpcionVehiculo.waitUntilVisible().click();
    }
}
