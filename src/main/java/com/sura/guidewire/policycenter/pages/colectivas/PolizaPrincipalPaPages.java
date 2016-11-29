package com.sura.guidewire.policycenter.pages.colectivas;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class PolizaPrincipalPaPages extends PageUtil {

    public static final String TITULO_COTIZACION = "Cotización";

    public PolizaPrincipalPaPages(WebDriver driver) {
        super(driver);
    }

    public boolean validarElementosDeshabilitadosDelMenu() {
        final String CONTRATO_DE_POLIZA = "Contrato de póliza";
        List<WebElementFacade> elementosDelMenuDeshabilitados = findAll(By.xpath(".//td[contains(@class, 'x-grid-cell-treecolumn x-grid-cell-first x-grid-cell-last x-grid-cell-treecolumn g-accordion-item g-accordion-depth-1 x-tree-node-depth-1 g-disabled')]/div/span"));
        boolean deshabilitado = false;
        if (!elementosDelMenuDeshabilitados.isEmpty()) {
            for (int i = 0; i < elementosDelMenuDeshabilitados.size(); i++) {
                if (CONTRATO_DE_POLIZA.equals(elementosDelMenuDeshabilitados.get(0).getText())) {
                    deshabilitado = true;
                    break;
                }
            }
        }
        return deshabilitado;
    }

    public boolean validarBotonMenuAseguradosNoVisiblesDelMenu() {
        WebElementFacade botonMenuAsegurados = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']");
        return esElElementoWebVisible(botonMenuAsegurados);
    }

    public boolean validarBotonMenuVehiculosNoVisiblesDelMenu() {
        WebElementFacade botonMenuVehiculos = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']");
        return esElElementoWebVisible(botonMenuVehiculos);
    }

    public boolean validarBotonMenuCoberturasNoVisiblesDelMenu() {
        WebElementFacade botonMenuCoberturas = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:PALine']");
        return esElElementoWebVisible(botonMenuCoberturas);
    }

    public boolean validarTablasDeDetalleDelRiesgoNoVisibles(){
        WebElementFacade tablasDeRiesgos = findBy("//div[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:ReviewSummaryCV-body']");
        return esElElementoWebVisible(tablasDeRiesgos);
    }

    public boolean validarMenuLateralNotasVisible(){
        WebElementFacade menuNotas = findBy(".//*[@id='SubmissionWizard:Notes']/div");
        return esElElementoWebVisible(menuNotas);
    }

    public boolean validarMenuLateralDocumentosVisible(){
        WebElementFacade menuDocumentos = findBy(".//*[@id='SubmissionWizard:Documents']/div");
        return esElElementoWebVisible(menuDocumentos);
    }

    public boolean validarMenuLateralParticipantesVisible(){
        WebElementFacade menuParticipantes = findBy(".//*[@id='SubmissionWizard:Participants']/div");
        return esElElementoWebVisible(menuParticipantes);
    }

    public boolean validarMenuLateralPlanDeTrabajoVisible(){
        WebElementFacade menuPlanDeTrabajo = findBy(".//*[@id='SubmissionWizard:Workplan']/div");
        return esElElementoWebVisible(menuPlanDeTrabajo);
    }

    public boolean validarMenuLateralHistorialVisible(){
        WebElementFacade menuHistorial = findBy(".//*[@id='SubmissionWizard:History']/div");
        return esElElementoWebVisible(menuHistorial);
    }

    public void clicEnElBotonCotizar(){
        WebElementFacade botonCotizar = find(By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl"));
        botonCotizar.waitUntilPresent();
        botonCotizar.click();
        waitForTextToAppear(TITULO_COTIZACION);
    }

    public void clicEnElMenuLateralCotizacion(){
        WebElementFacade menuLateralCotizacion = findBy(".//*[@id='SubmissionWizard:ViewQuote']/div");
        menuLateralCotizacion.waitUntilPresent();
        menuLateralCotizacion.click();
        waitForTextToAppear(TITULO_COTIZACION);
    }

    public boolean validarTablaTituloVehiculosEnCotizacion(){
        WebElementFacade tablaTitulo = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:SubmissionWizard_Quote_CumulativeCardTab']");
        return esElElementoWebVisible(tablaTitulo);
    }

    public boolean validarBotonVerTablaDeTrabajoEnCotizacion(){
        WebElementFacade botonVerTablaDeTrabajo = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:RatingOverrideButtonDV:RatingOverrideButtonDV:ViewWorksheet']");
        return esElElementoWebVisible(botonVerTablaDeTrabajo);
    }

    public boolean validarPanelDeDetalleEnCotizacion(){
        WebElementFacade panelDeDetalle = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:1']");
        return esElElementoWebVisible(panelDeDetalle);
    }

    public boolean validarTablaDeVehiculosEnCotizacion(){
        List<WebElementFacade> tablasDeVehiculos = findAll(".//td[@class='x-table-layout-cell']");
        int visibles = 0;
        for(int i = 0; i < tablasDeVehiculos.size(); i++){
            if(tablasDeVehiculos.get(i).isPresent()){
                visibles++;
            }
        }
        if(visibles==tablasDeVehiculos.size()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarQueTodosLosCamposDeLaCotizacionNoSonEditables(){
        List<WebElementFacade> camposDeCotizacion = findAll("//div[contains(@id, 'SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:')]");
        int editables = 0;
        for(int i = 0; i < camposDeCotizacion.size(); i++){
            if(!camposDeCotizacion.get(i).getText().equals(null)){
                editables++;
            }
        }
        if(editables==camposDeCotizacion.size()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarQueTodosLosCamposDeLaPolizaNoSonEditables(){
        List<WebElementFacade> camposDePoliza = findAll("//div[contains(@id, 'PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_')]");
        boolean NoEditables = false;
        for(int i = 0; i < camposDePoliza.size(); i++){
            if(camposDePoliza.get(i).getAttribute("role").equals("textbox") && !camposDePoliza.get(i).getText().equals(null)){
                NoEditables = true;
            }
            else{
                return false;
            }
        }
        return NoEditables;
    }


    private boolean esElElementoWebVisible(WebElementFacade elemento) {
        boolean visible;
        if (!elemento.isPresent()) {
            visible = false;
        }
        else {
            visible = true;
        }
        return visible;
    }
}
