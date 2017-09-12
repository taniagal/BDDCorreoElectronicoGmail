package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class CancelarPolizaPage  extends PageUtil{
    public CancelarPolizaPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnInnerEl']")
    private WebElementFacade btnBuscarPolizaInicial;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_PolicySearch-textEl']")
    private WebElementFacade btnPoliza;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:PolicyNumberCriterion-inputEl']")
    private WebElementFacade txtPoliza;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV:0:PolicyNumber']")
    private WebElementFacade btnSeleccionarPoliza;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions-btnIconEl']")
    private WebElementFacade mnuAcciones;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_Create:PolicyFileMenuActions_PreRenewalDirection-textEl']")
    private WebElementFacade btnInstruccionesPrevias;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Edit-btnInnerEl']")
    private WebElementFacade btnEditar;
    @FindBy(xpath = ".//*[@id='RiskApprovalDetailsPopup:Update-btnInnerEl']/span")
    private WebElementFacade btnActualizar;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_CancelPolicy-textEl']")
    private WebElementFacade btnCancelar;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:Reason-inputEl']")
    private WebElementFacade conboMotivo;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CancelDate_date-inputEl']")
    private WebElementFacade txtFecha;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:NewCancellation-btnInnerEl']")
    private WebElementFacade btnIniciarCancelacion;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnWrap']")
    private WebElementFacade btnOpcionesDeCompromiso;
    @FindBy(xpath = ".//*[@id='CancellationWizard:Job_RiskAnalysisScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl']")
    private WebElementFacade btnOpcionesDeCompromisoAnalisis;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:CancelNow-textEl']")
    private WebElementFacade btnCancelarAhora;
    @FindBy(xpath = ".//*[@id='CancellationWizard:Job_RiskAnalysisScreen:JobWizardToolbarButtonSet:BindOptions:CancelNow-itemEl']")
    private WebElementFacade btnCancelarAhoraAnalisis;
    @FindBy(xpath = "//span[contains(.,'Aceptar')]")
    private WebElementFacade btnAceptarCancelacion;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:DetailsButton-btnInnerEl']")
    private WebElementFacade btnDetalles;
    @FindBy(xpath = ".//*[@id='CancellationWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:1:UWIssueRowSet:SpecialApprove']")
    private WebElementFacade btnAprobacionEspecial;
    @FindBy(xpath = "//span[contains(.,'Actualizar')]")
    private WebElementFacade btnActualizarCancelacion;


    ArrayList<String> listaPolizas=new ArrayList<>();



    public void consultarParaCancelar() {
        File archivoExcel=new File("C:\\Users\\tanigral\\Desktop\\poliza\\InstruccionesPrevias.xlsx");
        Workbook libro=null;
        try {
            libro = WorkbookFactory.create(new FileInputStream(archivoExcel));
            XSSFSheet hoja = (XSSFSheet) libro.getSheetAt(0);
            Iterator<Row> filas = hoja.iterator();
            Row filasRecorrer;
            Cell celda;
            while(filas.hasNext()){
                filasRecorrer=filas.next();
                Iterator<Cell> celdas=filasRecorrer.cellIterator();
                while(celdas.hasNext()){
                    celda=celdas.next();
                    listaPolizas.add(celda.getStringCellValue());
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
        finally{
            try{
                libro.close();
            }
            catch(Exception e){
                e.printStackTrace();

            }
        }
    }
    public void cancelarPoliza() throws InterruptedException {
        for(int i=0;i<listaPolizas.size();i++){
            btnBuscarPolizaInicial.click();
            ingresarDato(txtPoliza,listaPolizas.get(i));
            btnBuscar.click();
            btnSeleccionarPoliza.click();
            mnuAcciones.click();
            btnCancelar.click();
            seleccionarItem(conboMotivo,"Por petición del cliente");
            ingresarDato(txtFecha,"08/09/2017");
            btnIniciarCancelacion.click();
            btnOpcionesDeCompromiso.click();
            btnCancelarAhora.click();
            btnAceptarCancelacion.click();
            if(btnDetalles.isPresent()){
                btnDetalles.click();
                btnAprobacionEspecial.click();
                btnAceptarCancelacion.click();
                btnActualizar.click();
                btnOpcionesDeCompromisoAnalisis.click();
                btnCancelarAhoraAnalisis.click();
                btnAceptarCancelacion.click();
                Thread.sleep(100000);

            }
        }
    }
}
