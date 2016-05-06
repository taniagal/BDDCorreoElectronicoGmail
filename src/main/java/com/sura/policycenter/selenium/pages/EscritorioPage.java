package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class EscritorioPage extends Guidewire {

    Guidewire gw = new Guidewire(getDriver());

    public EscritorioPage(WebDriver driver) {
        super(driver);
    }

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")
    WebElementFacade labelIngreso;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact-arrowEl']")
    WebElementFacade mnuNewContact;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewPerson-itemEl']")
    WebElementFacade mnuNewPerson;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewCompany-textEl']")
    WebElementFacade mnuNewCompany;

    /**
     * Objetos menu Escritorio
     */
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnWrap']")
    WebElementFacade mnuEscritorio;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopActivities-itemEl']")
    WebElementFacade mnuItemMisActividades;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopAccounts-itemEl']")
    WebElementFacade mnuItemMisCuentas;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopSubmissions-itemEl']")
    WebElementFacade mnuItemMisEnvios;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopRenewals-itemEl']")
    WebElementFacade mnuItemMisRenovaciones;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopOtherWorkOrders-itemEl']")
    WebElementFacade mnuItemMisOtrasTrans;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopAssignableQueues-itemEl']")
    WebElementFacade mnuItemMisColas;

    /**
     * Objetos menu Acciones Escritorio
     */
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions']")
    WebElementFacade mnuAccionesEscritorio;

    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission']")
    WebElementFacade mnuAccionNuevoEnvio;

    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount']")
    WebElementFacade mnuAccionNuevaCuenta;

    /**
     * Objetos menu Cuenta
     */
    @FindBy(xpath = ".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuCuenta;

    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-itemEl']")
    WebElementFacade mnuItemNuevaCuenta;

    /**
     * Objetos menu Acciones Cuenta
     */

    @FindBy(xpath = ".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuAccionesCuenta;

    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewNote-itemEl']")
    WebElementFacade mnuAccionNuevaNota;

    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument-itemEl']")
    WebElementFacade mnuAccionDocNuevos;

    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument:AccountNewDocumentMenuItemSet:AccountNewDocumentMenuItemSet_Linked-itemEl']")
    WebElementFacade mnuAccionLigarDocExistente;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument:AccountNewDocumentMenuItemSet:AccountNewDocumentMenuItemSet_Template-textEl']")
    WebElementFacade mnuAccionCrearDocPlantilla;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewEmail-itemEl']")
    WebElementFacade mnuAccionNuevoCorreo;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-itemEl']")
    WebElementFacade mnuAccionNuevoEnvio2;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity-arrowEl']")
    WebElementFacade mnuAccionActNueva;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category-arrowEl']")
    WebElementFacade mnuAccionCorreoNuevo;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category:0:item-textEl']")
    WebElementFacade mnuAccionRevisarNuevoCorreo;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category-arrowEl']")
    WebElementFacade mnuAccionEntrevista;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:0:item-textEl']")
    WebElementFacade mnuAccionReunirseAgenteAgencia;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:1:item-itemEl']")
    WebElementFacade mnuAccionReunirseAsegurado;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category-arrowEl']")
    WebElementFacade mnuAccionRecordatorio;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:0:item-itemEl']")
    WebElementFacade mnuAccionCancelPolizaDividida;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:1:item-itemEl']")
    WebElementFacade mnuAccionCotizacionReq;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:2:item-itemEl']")
    WebElementFacade mnuAccionDiarioX30;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:3:item-itemEl']")
    WebElementFacade mnuAccionDiarioX60;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:4:item-itemEl']")
    WebElementFacade mnuAccionDiarioX90;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:5:item-itemEl']")
    WebElementFacade mnuAccionNotificacionPoliza;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:6:item-itemEl']")
    WebElementFacade mnuAccionRecordatorioGeneral;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:7:item-itemEl']")
    WebElementFacade mnuAccionRevisarAgente;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:8:item-textEl']")
    WebElementFacade mnuAccionRevisarX30;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:9:item-textEl']")
    WebElementFacade mnuAccionRevisarX45;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:10:item-textEl']")
    WebElementFacade mnuAccionRevisarX60;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:11:item-itemEl']")
    WebElementFacade mnuAccionRevisarRendimiento;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:12:item-itemEl']")
    WebElementFacade mnuAccionVerificarCobertura;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category-arrowEl']")
    WebElementFacade mnuAccionSolicitud;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:0:item-itemEl']")
    WebElementFacade mnuAccionAgenteNuevo;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:1:item-itemEl']")
    WebElementFacade mnuAccionAuditoriaInterno;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:2:item-itemEl']")
    WebElementFacade mnuAccionAuditoriaExterna;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:3:item-itemEl']")
    WebElementFacade mnuAccionCotizacionReaseguro;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:4:item-itemEl']")
    WebElementFacade mnuAccionDatosOf;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:5:item-itemEl']")
    WebElementFacade mnuAccionInfoAgente;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:6:item-textEl']")
    WebElementFacade mnuAccionInformesMotorizado;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:7:item-itemEl']")
    WebElementFacade mnuAccionInspeccionSiniestro;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:8:item-itemEl']")
    WebElementFacade mnuAccionInspeccionExterno;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:9:item-itemEl']")
    WebElementFacade mnuAccionReportesCredito;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:10:item-itemEl']")
    WebElementFacade mnuAccionRevisionLegal;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:11:item-itemEl']")
    WebElementFacade mnuAccionCotizarManual;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_MovePolicies-itemEl']")
    WebElementFacade mnuAccionTransferirPolizas;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_RewritePolicies-itemEl']")
    WebElementFacade mnuAccionReescribirPolizas;

    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_MergeAccounts-textEl']")
    WebElementFacade mnuAccionCombinarCuentas;

    /**
     * Objetos menu Poliza
     */
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    WebElementFacade mnuPoliza;

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_NewSubmission-itemEl']")
    WebElementFacade mnuItemNuevoEnvio;

    /**
     * Objetos menu Acciones Poliza
     */

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions-btnInnerEl']")
    WebElementFacade mnuAccionesPoliza;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Goto:WizardMenuActions_ToAccountFile-itemEl']")
    WebElementFacade mnuAccionArchivoCuenta;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Goto:WizardActionsMenuItemSet:SubmissionInfo-itemEl']")
    WebElementFacade mnuAccionSubgerente;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Goto:WizardMenuActions_JobGroup-itemEl']")
    WebElementFacade mnuAccionGrupo;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Goto:WizardMenuActions_JobGroup:JobGroupItem']")
    WebElementFacade mnuAccionItemGrupo;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewNote-itemEl']")
    WebElementFacade mnuAccionNuevaNotaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewDocument-itemEl']")
    WebElementFacade mnuAccionDocNuevosP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewDocument:NewJobDocumentMenuItemSet:PolicyPeriodNewDocumentMenuItemSet_Linked-itemEl']")
    WebElementFacade mnuAccionLigarDocExistenteP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewDocument:NewJobDocumentMenuItemSet:PolicyPeriodNewDocumentMenuItemSet_Template-itemEl']")
    WebElementFacade mnuAccionCrearDocPlantillaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity-itemEl']")
    WebElementFacade mnuAccionActNuevaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category-itemEl']")
    WebElementFacade mnuAccionCorreoNuevoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category:0:item-itemEl']")
    WebElementFacade mnuAccionRevisarNuevoCorreoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category-itemEl']")
    WebElementFacade mnuAccionEntrevistaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:0:item-itemEl']")
    WebElementFacade mnuAccionReunirseAgenteAgenciaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:1:item-itemEl']")
    WebElementFacade mnuAccionReunirseAseguradoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category-itemEl']")
    WebElementFacade mnuAccionRecordatorioP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:0:item-itemEl']")
    WebElementFacade mnuAccionCancelPolizaDivididaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:1:item-itemEl']")
    WebElementFacade mnuAccionCotizacionReqP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:2:item-itemEl']")
    WebElementFacade mnuAccionDiarioX30P;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:3:item-itemEl']")
    WebElementFacade mnuAccionDiarioX60P;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:4:item-itemEl']")
    WebElementFacade mnuAccionDiarioX90P;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:5:item-itemEl']")
    WebElementFacade mnuAccionNotificacionPolizaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:6:item-itemEl']")
    WebElementFacade mnuAccionAsignaAuditoriaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:7:item-itemEl']")
    WebElementFacade mnuAccionRevisionMitadPlazoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:8:item-itemEl']")
    WebElementFacade mnuAccionRecordatorioGeneralP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:9:item-itemEl']")
    WebElementFacade mnuAccionReescribirCtaNuevaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:10:item-itemEl']")
    WebElementFacade mnuAccionRenovaRevisionPolizaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:11:item-itemEl']")
    WebElementFacade mnuAccionRevisarAgenteP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:12:item-itemEl']")
    WebElementFacade mnuAccionRevisarX30P;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:13:item-itemEl']")
    WebElementFacade mnuAccionRevisarX45P;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:14:item-itemEl']")
    WebElementFacade mnuAccionRevisarX60P;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:15:item-itemEl']")
    WebElementFacade mnuAccionRevisarRendimientoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:16:item-itemEl']")
    WebElementFacade mnuAccionVerificarCoberturaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:17:item-itemEl']")
    WebElementFacade mnuAccionIndiceFueraRangoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category-itemEl']")
    WebElementFacade mnuAccionRevisionAseguradorP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:0:item-itemEl']")
    WebElementFacade mnuAccionRevisarAprobarP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category-itemEl']")
    WebElementFacade mnuAccionSolicitudP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:0:item-itemEl']")
    WebElementFacade mnuAccionAgenteNuevoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:1:item-itemEl']")
    WebElementFacade mnuAccionAuditoriaInternoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:2:item-itemEl']")
    WebElementFacade mnuAccionAuditoriaExternaP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:3:item-itemEl']")
    WebElementFacade mnuAccionCotizacionReaseguroP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:4:item-itemEl']")
    WebElementFacade mnuAccionDatosOfP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:5:item-itemEl']")
    WebElementFacade mnuAccionInfoAgenteP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:6:item-itemEl']")
    WebElementFacade mnuAccionInformesMotorizadoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:7:item-itemEl']")
    WebElementFacade mnuAccionInspeccionSiniestroP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:8:item-itemEl']")
    WebElementFacade mnuAccionInspeccionExternoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:9:item-itemEl']")
    WebElementFacade mnuAccionReportesCreditoP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:10:item-itemEl']")
    WebElementFacade mnuAccionRevisionLegalP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_NewActivity:NewActivityMenuItemSet:4:NewActivityMenuItemSet_Category:11:item-itemEl']")
    WebElementFacade mnuAccionCotizarManualP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_CopySubmission-itemEl']")
    WebElementFacade mnuAccionCopiarEnvioP;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Archiving:WizardMenuActions_SuspendResumeArchiving-itemEl']")
    WebElementFacade mnuAccionArchivarDesactivarP;

    /**
     * Objetos menu Contacto
     */
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    WebElementFacade mnuContact;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact-arrowEl']")
    WebElementFacade mnuItemNuevoContacto;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewCompany']")
    WebElementFacade mnuItemNuevaCompania;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewPerson']")
    WebElementFacade mnuItemNuevaPersona;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:Search-itemEl']")
    WebElementFacade mnuItemContactoBusqueda;

    /**
     * Objetos menu Acciones Contacto
     */

    @FindBy (xpath = ".//*[@id='ContactFile:ContactFileMenuActions-btnInnerEl']")
    WebElementFacade mnuAccionesContacto;

    @FindBy (xpath = ".//*[@id='ContactFile:ContactFileMenuActions:ContactFileMenuActions_Create:ContactFileMenuActions_NewAccount-itemEl']")
    WebElementFacade mnuAccionNuevaCuentaC;


    /**
     * Objetos menu Buscar
     */
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnWrap']")
    WebElementFacade mnuBuscar;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_PolicySearch']")
    WebElementFacade mnuItemBuscarPoliza;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_AccountSearch']")
    WebElementFacade mnuItemBuscarCuenta;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_ProducerCodeSearch']")
    WebElementFacade mnuItemBuscarCodAgente;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_ActivitySearch']")
    WebElementFacade mnuItemBuscarAct;

    @FindBy(xpath = "//*[@id='TabBar:SearchTab:Search_ContactSearch']")
    WebElementFacade mnuItemBusquedaContacto;

    /**
     * Objetos menu Equipo
     */
    @FindBy(xpath = ".//*[@id='TabBar:TeamTab-btnInnerEl']")
    WebElementFacade mnuEquipo;

    /**
     * Objetos menu Admnistracion
     */
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab-btnWrap']")
    WebElementFacade mnuAdministracion;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity']")
    WebElementFacade mnuItemUsuarioSeguridad;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_AdminUserSearchPage-itemEl']")
    WebElementFacade mnuItemUsuario;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_AdminGroupSearchPage-itemEl']")
    WebElementFacade mnuItemGrupos;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_Roles-itemEl']")
    WebElementFacade mnuItemRoles;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_Regions-itemEl']")
    WebElementFacade mnuItemRegiones;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_OrganizationSearchPage-itemEl']")
    WebElementFacade mnuItemOrganizaciones;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_AdminProducerCodeSearch-itemEl']")
    WebElementFacade mnuItemCodAgente;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_UWAuthorityProfiles-textEl']")
    WebElementFacade mnuItemPerAutoridad;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_Attributes-itemEl']")
    WebElementFacade mnuItemAtributos;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_SearchAffinityGroup-itemEl']")
    WebElementFacade mnuItemGruposAfinidad;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings']")
    WebElementFacade mnuItemConfigComercial;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings:BusinessSettings_ActivityPatterns-itemEl']")
    WebElementFacade mnuItemPatronesActividad;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings:BusinessSettings_Holidays-itemEl']")
    WebElementFacade mnuItemDiasFestivos;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings:BusinessSettings_FormPatterns-itemEl']")
    WebElementFacade mnuItemPatronesFormularioPoliza;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings:BusinessSettings_PolicyHolds-itemEl']")
    WebElementFacade mnuItemRetenciionesPolizas;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring']")
    WebElementFacade mnuItemSupervision;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring:Monitoring_MessageSearch-itemEl']")
    WebElementFacade mnuItemMensajes;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring:Monitoring_MessagingDestinationControlList-itemEl']")
    WebElementFacade mnuItemColasMensajes;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring:Monitoring_WorkflowSearch-itemEl']")
    WebElementFacade mnuItemFlujosTrabajo;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring:Monitoring_WorkflowStats-itemEl']")
    WebElementFacade mnuItemEstadisticaFlujos;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities']")
    WebElementFacade mnuItemUtilidades;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_ImportWizard-itemEl']")
    WebElementFacade mnuItemImportDatos;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_ExportData-itemEl']")
    WebElementFacade mnuItemExportDatos;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_ScriptParametersPage-itemEl']")
    WebElementFacade mnuItemParametrosSecuencia;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_DataFlowMasks-itemEl']")
    WebElementFacade mnuItemFormatoExpHojasCalculo;

    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_DataChangePage-itemEl']")
    WebElementFacade mnuItemCambioDatos;


    /**
     * Objetos menu Acciones Administracion
     */

    @FindBy (xpath = ".//*[@id='Admin:AdminMenuActions-btnInnerEl']")
    WebElementFacade mnuAccionesAdministracion;

    @FindBy (xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewUser-itemEl']")
    WebElementFacade mnuAccionUsuarioNuevo;

    @FindBy (xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewGroup-itemEl']")
    WebElementFacade mnuAccionGrupoNuevo;

    @FindBy (xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewOrganization-itemEl']")
    WebElementFacade mnuAccionOrganizacionNueva;

    @FindBy (xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewProducerCode-itemEl']")
    WebElementFacade mnuAccionCodAgenteNuevo;

    @FindBy (xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewAffinityGroup-itemEl']")
    WebElementFacade mnuAccionNuevoGrupoAfiinidad;

    @FindBy (xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Validate:AdminMenuActions_ValidateFormPatterns-itemEl']")
    WebElementFacade mnuAccionVerificarErroresPatron;

    // TODO: 18/04/2016 Revision escritura de excepciones en log
    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        try {
            element(labelIngreso).waitUntilVisible();
            element(mnuContact).waitUntilVisible();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: 18/04/2016 Revision escritura de excepciones en log
    public void assertion(String element) {
        try {
            assertThat(labelIngreso.getText().toString(), containsString(element));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: 18/04/2016 Revision escritura de excepciones en log
    public void nuevoContactoPersona() {

        try {
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuNewContact).click().build().perform();
            act.moveToElement(mnuNewPerson).click().build().perform();

            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

    }

    public void nuevoContactoPersonaJuridica() {

        try {
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuNewContact).click().build().perform();
            act.moveToElement(mnuNewCompany).click().build().perform();

            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    /**
     * ------------------------------------------------------------------------------------------------------------------
     * MENU SUPERIOR
     * -----------------------------------------------------------------------------------------------------------------
     */

    public void navegarTabBar(String menu, String item1, String item2) {

        Actions act = new Actions(getDriver());

        switch (menu.toUpperCase()) {
            case "ESCRITORIO":
                mnuEscritorio.click();
                mnuEscritorio.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "MIS ACTIVIDADES":
                        act.moveToElement(mnuItemMisActividades).click().build().perform();
                        break;
                    case "MIS CUENTAS":
                        act.moveToElement(mnuItemMisCuentas).click().build().perform();
                        break;
                    case "MIS ENVIOS":
                        act.moveToElement(mnuItemMisEnvios).click().build().perform();
                        break;
                    case "MIS RENOVACIONES":
                        act.moveToElement(mnuItemMisRenovaciones).click().build().perform();
                        break;
                    case "MIS OTRAS TRANSACCIONES DE POLIZA":
                        act.moveToElement(mnuItemMisOtrasTrans).click().build().perform();
                        break;
                    case "MIS COLAS":
                        act.moveToElement(mnuItemMisColas).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "CUENTA":
                mnuCuenta.click();
                mnuCuenta.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "NUEVA CUENTA":
                        act.moveToElement(mnuItemNuevaCuenta).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "POLIZA":
                mnuPoliza.click();
                mnuPoliza.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "NUEVO ENVIO":
                        act.moveToElement(mnuItemNuevoEnvio).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "CONTACTO":
                mnuContact.click();
                gw.threadWait(1000);
                mnuContact.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "NUEVO CONTACTO":
                        act.moveToElement(mnuItemNuevoContacto.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "NUEVA COMPANIA":
                                act.moveToElement(mnuItemNuevaCompania.waitUntilClickable()).click().build().perform();
                                break;
                            case "NUEVA PERSONA":
                                act.moveToElement(mnuItemNuevaPersona.waitUntilClickable()).click().build().perform();
                                break;
                        }
                        break;
                    case "BUSCAR":
                        act.moveToElement(mnuItemContactoBusqueda).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "BUSCAR":
                mnuBuscar.click();
                mnuBuscar.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "POLIZAS":
                        act.moveToElement(mnuItemBuscarPoliza).click().build().perform();
                        break;
                    case "CUENTAS":
                        act.moveToElement(mnuItemBuscarCuenta).click().build().perform();
                        break;
                    case "CODIGOS DE AGENTE":
                        act.moveToElement(mnuItemBuscarCodAgente).click().build().perform();
                        break;
                    case "ACTIVIDADES":
                        act.moveToElement(mnuItemBuscarAct).click().build().perform();
                        break;
                    case "CONTACTOS":
                        act.moveToElement(mnuItemBusquedaContacto).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "EQUIPO":
                mnuEquipo.click();
                mnuEquipo.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                break;
            case "ADMINISTRACION":
                mnuAdministracion.click();
                mnuAdministracion.click();
                gw.threadWait(1000);
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "USUARIOS Y SEGURIDAD":
                        //mnuItemUsuarioSeguridad
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "USUARIOS":
                                act.moveToElement(mnuItemUsuario.waitUntilClickable()).click().build().perform();
                                break;
                            case "GRUPOS":
                                act.moveToElement(mnuItemGrupos.waitUntilClickable()).click().build().perform();
                                break;
                            case "ROLES":
                                act.moveToElement(mnuItemRoles.waitUntilClickable()).click().build().perform();
                                break;
                            case "REGIONES":
                                act.moveToElement(mnuItemRegiones.waitUntilClickable()).click().build().perform();
                                break;
                            case "ORGANIZACIONES":
                                act.moveToElement(mnuItemOrganizaciones.waitUntilClickable()).click().build().perform();
                                break;
                            case "CODIGOS DE AGENTE":
                                act.moveToElement(mnuItemCodAgente.waitUntilClickable()).click().build().perform();
                                break;
                            case "PERFILES DE AUTORIDAD":
                                act.moveToElement(mnuItemPerAutoridad.waitUntilClickable()).click().build().perform();
                                break;
                            case "ATRIBUTOS":
                                act.moveToElement(mnuItemAtributos.waitUntilClickable()).click().build().perform();
                                break;
                            case "GRUPOS DE AFINIDAD":
                                act.moveToElement(mnuItemGruposAfinidad.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "CONFIGURACION COMERCIAL":
                        act.moveToElement(mnuItemConfigComercial.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "PATRONES DE ACTIVIDAD":
                                act.moveToElement(mnuItemPatronesActividad.waitUntilClickable()).click().build().perform();
                                break;
                            case "DIAS FESTIVOS":
                                act.moveToElement(mnuItemDiasFestivos.waitUntilClickable()).click().build().perform();
                                break;
                            case "PATRONES DE FORMULARIO DE POLIZA":
                                act.moveToElement(mnuItemPatronesFormularioPoliza.waitUntilClickable()).click().build().perform();
                                break;
                            case "RETENCIONES DE POLIZAS":
                                act.moveToElement(mnuItemRetenciionesPolizas.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "SUPERVISION":
                        act.moveToElement(mnuItemSupervision.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "MENSAJES":
                                act.moveToElement(mnuItemMensajes.waitUntilClickable()).click().build().perform();
                                break;
                            case "COLAS DE MENSAJES":
                                act.moveToElement(mnuItemColasMensajes.waitUntilClickable()).click().build().perform();
                                break;
                            case "FLUJOS DE TRABAJO":
                                act.moveToElement(mnuItemFlujosTrabajo.waitUntilClickable()).click().build().perform();
                                break;
                            case "ESTADISTICAS DE FLUJO DE TRABAJO":
                                act.moveToElement(mnuItemEstadisticaFlujos.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "UTILIDADES":
                        act.moveToElement(mnuItemUtilidades.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "IMPORTAR DATOS":
                                act.moveToElement(mnuItemImportDatos.waitUntilClickable()).click().build().perform();
                                break;
                            case "EXPORTAR DATOS":
                                act.moveToElement(mnuItemExportDatos.waitUntilClickable()).click().build().perform();
                                break;
                            case "PARAMETROS DE SECUENCIA":
                                act.moveToElement(mnuItemParametrosSecuencia.waitUntilClickable()).click().build().perform();
                                break;
                            case "FORMATOS DE EXPORTACION DE HOJAS DE CALCULO":
                                act.moveToElement(mnuItemFormatoExpHojasCalculo.waitUntilClickable()).click().build().perform();
                                break;
                            case "CAMBIO DE DATOS":
                                act.moveToElement(mnuItemCambioDatos.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "":
                        break;
                }
                break;
            case "":
                break;
        }
    }

    /**
     * -----------------------------------------------------------------------------------------------------------------
     * MENU ACCIONES
     * ------------------------------------------------------------------------------------------------------------------
     */


    public void navegarAcciones(String menu, String item1, String item2, String item3) {
        switch (menu.toUpperCase()) {
            case "ACCIONES ESCRITORIO":
                mnuEscritorio.click();
                mnuAccionesEscritorio.click();
                mnuAccionesEscritorio.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "NUEVO ENVIO":
                        act.moveToElement(mnuAccionNuevoEnvio.waitUntilClickable()).click().build().perform();
                        break;
                    case "NUEVA CUENTA":
                        act.moveToElement(mnuAccionNuevaCuenta.waitUntilClickable()).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "ACCIONES CUENTA":
                mnuCuenta.click();
                mnuAccionesCuenta.click();
                mnuAccionesCuenta.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "NUEVA NOTA":
                        act.moveToElement(mnuAccionNuevaNota.waitUntilClickable()).click().build().perform();
                        break;
                    case "DOCUMENTOS NUEVOS":
                        act.moveToElement(mnuAccionDocNuevos.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "LIGAR CON UN DOCUMENTO EXISTENTE":
                                act.moveToElement(mnuAccionLigarDocExistente.waitUntilClickable()).click().build().perform();
                                break;
                            case "CREAR UN DOCUMENTO NUEVO DE UNA PLANTILLA":
                                act.moveToElement(mnuAccionCrearDocPlantilla.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "NUEVO CORREO ELECTRONICO":
                        act.moveToElement(mnuAccionNuevoCorreo.waitUntilClickable()).click().build().perform();
                        break;
                    case "NUEVO ENVIO":
                        act.moveToElement(mnuAccionNuevoEnvio2.waitUntilClickable()).click().build().perform();
                        break;
                    case "ACTIVIDAD NUEVA":
                        act.moveToElement(mnuAccionActNueva.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "CORREO NUEVO":
                                act.moveToElement(mnuAccionCorreoNuevo.waitUntilClickable()).build().perform();
                                act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                                switch (item3.toUpperCase()) {
                                    case "REVISAR NUEVO CORREO":
                                        act.moveToElement(mnuAccionRevisarNuevoCorreo.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "":
                                        break;
                                }
                                break;
                            case "ENTREVISTA":
                                act.moveToElement(mnuAccionEntrevista.waitUntilClickable()).build().perform();
                                act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                                switch (item3.toUpperCase()) {
                                    case "REUNIRSE CON EL AGENTE/AGENCIA":
                                        act.moveToElement(mnuAccionReunirseAgenteAgencia.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REUNIRSE CON EL ASEGURADO":
                                        act.moveToElement(mnuAccionReunirseAsegurado.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "":
                                        break;
                                }
                                break;
                            case "RECORDATORIO":
                                act.moveToElement(mnuAccionRecordatorio.waitUntilClickable()).build().perform();
                                act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                                switch (item3.toUpperCase()) {
                                    case "CANCELAR UNA POLIZA DIVIDAD":
                                        act.moveToElement(mnuAccionCancelPolizaDividida.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "COTIZACION REQUERIDA":
                                        act.moveToElement(mnuAccionCotizacionReq.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "DIARIO POR 30 DIAS":
                                        act.moveToElement(mnuAccionDiarioX30.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "DIARIO POR 60 DIAS":
                                        act.moveToElement(mnuAccionDiarioX60.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "DIARIO POR 90 DIAS":
                                        act.moveToElement(mnuAccionDiarioX90.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "NOTIFICACION DE POLIZA":
                                        act.moveToElement(mnuAccionNotificacionPoliza.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "RECORDATORIO GENERAL (DIARIO)":
                                        act.moveToElement(mnuAccionRecordatorioGeneral.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISAR AGENTE":
                                        act.moveToElement(mnuAccionRevisarAgente.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISAR PERIODO DE 30 DIAS DE ASEGURANZA":
                                        act.moveToElement(mnuAccionRevisarX30.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISAR PERIODO DE 45 DIAS DE ASEGURANZA":
                                        act.moveToElement(mnuAccionRevisarX45.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISAR PERIODO DE 60 DIAS DE ASEGURANZA":
                                        act.moveToElement(mnuAccionRevisarX60.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISION DE RENDIMIENTO":
                                        act.moveToElement(mnuAccionRevisarRendimiento.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "VERIFICAR COBERTURA":
                                        act.moveToElement(mnuAccionVerificarCobertura.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "":
                                        break;
                                }
                            case "SOLICITUD":
                                act.moveToElement(mnuAccionSolicitud.waitUntilClickable()).build().perform();
                                act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                                switch (item3.toUpperCase()) {
                                    case "CREAR AGENTE NUEVO":
                                        act.moveToElement(mnuAccionAgenteNuevo.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER AUDITORIA - PERSONAL INTETNO":
                                        act.moveToElement(mnuAccionAuditoriaInterno.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER AUDITORIA - SERVICIO EXTERNO":
                                        act.moveToElement(mnuAccionAuditoriaExterna.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER COTIZACION DE REASEGURO":
                                        act.moveToElement(mnuAccionCotizacionReaseguro.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER DATOS DE OFICINA":
                                        act.moveToElement(mnuAccionDatosOf.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER INFORMACION DE RIESGOS - AGENTE":
                                        act.moveToElement(mnuAccionInfoAgente.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER INFORMES DE VEHICULO MOTORIZADO":
                                        act.moveToElement(mnuAccionInformesMotorizado.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER INSPECCION - CONTROL DE SINIESTRO":
                                        act.moveToElement(mnuAccionInspeccionSiniestro.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "ONTENER INSPECCION - SERVICIO EXTERNO":
                                        act.moveToElement(mnuAccionInspeccionExterno.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER REPORTES DE CREDITO":
                                        act.moveToElement(mnuAccionReportesCredito.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISION LEGAL":
                                        act.moveToElement(mnuAccionRevisionLegal.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "TASAR Y COTIZAR LA POLIZA DE FORMA MANUAL":
                                        act.moveToElement(mnuAccionCotizarManual.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "":
                                        break;
                                }
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "TRANSFERIR POLIZAS A ESTA CUENTA":
                        act.moveToElement(mnuAccionTransferirPolizas.waitUntilClickable()).click().build().perform();
                        break;
                    case "REESCRIBIR POLIZAS EN ESTA CUENTA":
                        act.moveToElement(mnuAccionReescribirPolizas.waitUntilClickable()).click().build().perform();
                        break;
                    case "COMBINAR CUENTA CON ESTA CUENTA":
                        act.moveToElement(mnuAccionCombinarCuentas.waitUntilClickable()).click().build().perform();
                        break;
                    case "":
                        break;
                }
            case "ACCIONES POLIZA":
                mnuPoliza.click();
                mnuAccionesPoliza.click();
                mnuAccionesPoliza.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "ARCHIVO DE CUENTA":
                        act.moveToElement(mnuAccionArchivoCuenta.waitUntilClickable()).click().build().perform();
                        break;
                    case "SUBGERENTE":
                        act.moveToElement(mnuAccionSubgerente.waitUntilClickable()).click().build().perform();
                        break;
                    case "GRUPO":
                        act.moveToElement(mnuAccionGrupo.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "ITEM GRUPO 1":
                                act.moveToElement(mnuAccionItemGrupo.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                    case "NUEVA NOTA":
                        act.moveToElement(mnuAccionNuevaNotaP.waitUntilClickable()).click().build().perform();
                        break;
                    case "DOCUMENTOS NUEVOS":
                        act.moveToElement(mnuAccionDocNuevosP.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "LIGAR CON UN DOCUMENTO EXISTENTE":
                                act.moveToElement(mnuAccionLigarDocExistenteP.waitUntilClickable()).click().build().perform();
                                break;
                            case "CREAR UN DOCUMENTO NUEVO DE UNA PLANTILLA":
                                act.moveToElement(mnuAccionCrearDocPlantillaP.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "ACTIVIDAD NUEVA":
                        act.moveToElement(mnuAccionActNuevaP.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2.toUpperCase()) {
                            case "CORREO NUEVO":
                                act.moveToElement(mnuAccionCorreoNuevoP.waitUntilClickable()).build().perform();
                                act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                                switch (item3.toUpperCase()) {
                                    case "REVISAR NUEVO CORREO":
                                        act.moveToElement(mnuAccionRevisarNuevoCorreoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "":
                                        break;
                                }
                                break;
                            case "ENTREVISTA":
                                act.moveToElement(mnuAccionEntrevistaP.waitUntilClickable()).build().perform();
                                act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                                switch (item3.toUpperCase()) {
                                    case "REUNIRSE CON EL AGENTE/AGENCIA":
                                        act.moveToElement(mnuAccionReunirseAgenteAgenciaP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REUNIRSE CON EL ASEGURADO":
                                        act.moveToElement(mnuAccionReunirseAseguradoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "":
                                        break;
                                }
                                break;
                            case "RECORDATORIO":
                                act.moveToElement(mnuAccionRecordatorioP.waitUntilClickable()).build().perform();
                                act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                                switch (item3.toUpperCase()) {
                                    case "CANCELAR UNA POLIZA DIVIDAD":
                                        act.moveToElement(mnuAccionCancelPolizaDivididaP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "COTIZACION REQUERIDA":
                                        act.moveToElement(mnuAccionCotizacionReqP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "DIARIO POR 30 DIAS":
                                        act.moveToElement(mnuAccionDiarioX30P.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "DIARIO POR 60 DIAS":
                                        act.moveToElement(mnuAccionDiarioX60P.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "DIARIO POR 90 DIAS":
                                        act.moveToElement(mnuAccionDiarioX90P.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "NOTIFICACION DE POLIZA":
                                        act.moveToElement(mnuAccionNotificacionPolizaP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "NUEVA ASIGNACION DE AUDITORIA":
                                        act.moveToElement(mnuAccionAsignaAuditoriaP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "POLIZA REVISION MITAD DE PLAZO":
                                        act.moveToElement(mnuAccionRevisionMitadPlazoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "RECORDATORIO GENERAL (DIARIO)":
                                        act.moveToElement(mnuAccionRecordatorioGeneralP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REESCRIBIR A CUENTA NUEVA":
                                        act.moveToElement(mnuAccionReescribirCtaNuevaP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "RENOVACION DE REVISION DE POLIZA":
                                        act.moveToElement(mnuAccionRenovaRevisionPolizaP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISAR AGENTE":
                                        act.moveToElement(mnuAccionRevisarAgenteP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISAR PERIODO DE 30 DIAS DE ASEGURANZA":
                                        act.moveToElement(mnuAccionRevisarX30P.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISAR PERIODO DE 45 DIAS DE ASEGURANZA":
                                        act.moveToElement(mnuAccionRevisarX45P.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISAR PERIODO DE 60 DIAS DE ASEGURANZA":
                                        act.moveToElement(mnuAccionRevisarX60P.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISION DE RENDIMIENTO":
                                        act.moveToElement(mnuAccionRevisarRendimientoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "VERIFICAR COBERTURA":
                                        act.moveToElement(mnuAccionVerificarCoberturaP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "INDICE FUERA DE RANGO":
                                        act.moveToElement(mnuAccionIndiceFueraRangoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "":
                                        break;
                                }
                            case "REVISION DE ASEGURADOR":
                                act.moveToElement(mnuAccionRevisionAseguradorP.waitUntilClickable()).build().perform();
                                act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                                switch (item3.toUpperCase()) {
                                    case "REVISAR Y APROBAR":
                                        act.moveToElement(mnuAccionRevisarAprobarP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "":
                                        break;
                                }
                                break;
                            case "SOLICITUD":
                                act.moveToElement(mnuAccionSolicitudP.waitUntilClickable()).build().perform();
                                act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                                switch (item3.toUpperCase()) {
                                    case "CREAR AGENTE NUEVO":
                                        act.moveToElement(mnuAccionAgenteNuevoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER AUDITORIA - PERSONAL INTETNO":
                                        act.moveToElement(mnuAccionAuditoriaInternoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER AUDITORIA - SERVICIO EXTERNO":
                                        act.moveToElement(mnuAccionAuditoriaExternaP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER COTIZACION DE REASEGURO":
                                        act.moveToElement(mnuAccionCotizacionReaseguroP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER DATOS DE OFICINA":
                                        act.moveToElement(mnuAccionDatosOfP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER INFORMACION DE RIESGOS - AGENTE":
                                        act.moveToElement(mnuAccionInfoAgenteP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER INFORMES DE VEHICULO MOTORIZADO":
                                        act.moveToElement(mnuAccionInformesMotorizadoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER INSPECCION - CONTROL DE SINIESTRO":
                                        act.moveToElement(mnuAccionInspeccionSiniestroP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "ONTENER INSPECCION - SERVICIO EXTERNO":
                                        act.moveToElement(mnuAccionInspeccionExternoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "OBTENER REPORTES DE CREDITO":
                                        act.moveToElement(mnuAccionReportesCreditoP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "REVISION LEGAL":
                                        act.moveToElement(mnuAccionRevisionLegalP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "TASAR Y COTIZAR LA POLIZA DE FORMA MANUAL":
                                        act.moveToElement(mnuAccionCotizarManualP.waitUntilClickable()).click().build().perform();
                                        break;
                                    case "":
                                        break;
                                }
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "COPIAR ENVIO":
                        act.moveToElement(mnuAccionCopiarEnvioP.waitUntilClickable()).click().build().perform();
                        break;
                    case "ARCHIVAR/DESACTIVAR":
                        act.moveToElement(mnuAccionArchivarDesactivarP.waitUntilClickable()).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "ACCIONES CONTACTO":
                mnuContact.click();
                mnuAccionesContacto.click();
                mnuAccionesContacto.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "NUEVA CUENTA":
                        act.moveToElement(mnuAccionNuevaCuentaC.waitUntilClickable()).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "ADMINISTRACION":
                mnuAdministracion.click();
                mnuAccionesAdministracion.click();
                mnuAccionesAdministracion.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1.toUpperCase()) {
                    case "USUARIO NUEVO":
                        act.moveToElement(mnuAccionUsuarioNuevo.waitUntilClickable()).click().build().perform();
                        break;
                    case "GRUPO NUEVO":
                        act.moveToElement(mnuAccionGrupoNuevo.waitUntilClickable()).click().build().perform();
                        break;
                    case "ORGANIZACION NUEVA":
                        act.moveToElement(mnuAccionOrganizacionNueva.waitUntilClickable()).click().build().perform();
                        break;
                    case "CODIGO DE AGENTE NUEVO":
                        act.moveToElement(mnuAccionCodAgenteNuevo.waitUntilClickable()).click().build().perform();
                        break;
                    case "NUEVO GRUPO DE AFINIDAD":
                        act.moveToElement(mnuAccionNuevoGrupoAfiinidad.waitUntilClickable()).click().build().perform();
                        break;
                    case "VERIFICAR SI EL PATRON DE FORMULARIO DE POLIZA CONTIENE ERRORES":
                        act.moveToElement(mnuAccionVerificarErroresPatron.waitUntilClickable()).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "":
                break;
        }
    }
}