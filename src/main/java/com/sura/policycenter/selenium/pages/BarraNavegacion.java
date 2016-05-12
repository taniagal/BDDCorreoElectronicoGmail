package com.sura.policycenter.selenium.pages;
import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.menu.acciones.*;
import com.sura.policycenter.selenium.pages.menu.tabbar.*;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jonamele on 06/05/2016.
 */
public class BarraNavegacion extends Guidewire {

    public BarraNavegacion(WebDriver driver) {
        super(driver);
    }

    Guidewire gw = new Guidewire(getDriver());
    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnWrap']")
    WebElementFacade menuEscritorio;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopActivities-itemEl']")
    WebElementFacade itemMisActividades;
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
    @FindBy(xpath = ".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuCuenta;
    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-itemEl']")
    WebElementFacade mnuItemNuevaCuenta;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    WebElementFacade mnuPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_NewSubmission-itemEl']")
    WebElementFacade mnuItemNuevoEnvio;
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
    @FindBy(xpath = ".//*[@id='TabBar:TeamTab-btnInnerEl']")
    WebElementFacade mnuEquipo;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab-btnWrap']")
    WebElementFacade mnuAdministracion;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity-arrowEl']")
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
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions']")
    WebElementFacade mnuAccionesEscritorio;
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission']")
    WebElementFacade mnuAccionNuevoEnvio;
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount']")
    WebElementFacade mnuAccionNuevaCuenta;

























































































































































































































































































































































































































































































































    @FindBy (xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_PolicyRetrievalItem-inputEl']")
    WebElementFacade mnuNumPoliza;
    @FindBy (xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions']")
    WebElementFacade mnuAccionesPoliza;
    @FindBy (xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:WizardMenuActions_Goto:WizardMenuActions_ToAccountFile-itemEl']")
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
    @FindBy (xpath = ".//*[@id='ContactFile:ContactFileMenuActions-btnInnerEl']")
    WebElementFacade mnuAccionesContacto;
    @FindBy (xpath = ".//*[@id='ContactFile:ContactFileMenuActions:ContactFileMenuActions_Create:ContactFileMenuActions_NewAccount-itemEl']")
    WebElementFacade mnuAccionNuevaCuentaC;
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

    public MisActividadesPage irAMisActividades() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemMisActividades).release(itemMisActividades).click().build().perform();
        return new MisActividadesPage(getDriver());
    }

    public MisCuentasPage irAMisCuentas() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisCuentas).release(mnuItemMisCuentas).click().build().perform();
        return new MisCuentasPage(getDriver());
    }

    public MisEnviosPage irAMisEnvios() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisEnvios).release(mnuItemMisEnvios).click().build().perform();
        return new MisEnviosPage(getDriver());
    }

    public MisRenovacionesPage irAMisRenovaciones() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisRenovaciones).release(mnuItemMisRenovaciones).click().build().perform();
        return new MisRenovacionesPage(getDriver());
    }

    public MisOtrasTransacPage irAMisOtrasTransacciones() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisOtrasTrans).release(mnuItemMisOtrasTrans).click().build().perform();
        return new MisOtrasTransacPage(getDriver());
    }

    public MisColasPage irAMisColas() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisColas).release(mnuItemMisColas).click().build().perform();
        return new MisColasPage(getDriver());
    }

    public NuevaCuentaPage irANuevaCuenta() {
        gw.deployMenu(mnuCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevaCuenta).release(mnuItemNuevaCuenta).click().build().perform();
        return new NuevaCuentaPage(getDriver());
    }

    public NuevoEnvioPage irANuevoEnvio() {
        gw.deployMenu(mnuPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoEnvio).release(mnuItemNuevoEnvio).click().build().perform();
        return new NuevoEnvioPage(getDriver());
    }

    public NuevaCompaniaPage irANuevaCompania() {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemNuevaCompania).release(mnuItemNuevaCompania).click().build().perform();
        return new NuevaCompaniaPage(getDriver());
    }

    public NuevaPersonaPage irANuevaPersona() {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemNuevaPersona).release(mnuItemNuevaPersona).click().build().perform();
        return new NuevaPersonaPage(getDriver());
    }

    public BuscarContactoPage irABuscarContacto() {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemContactoBusqueda).release(mnuItemContactoBusqueda).click().build().perform();
        return new BuscarContactoPage(getDriver());
    }

    public BuscarPolizasPage irABuscarPolizas() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarPoliza).release(mnuItemBuscarPoliza).click().build().perform();
        return new BuscarPolizasPage(getDriver());
    }

    public BuscarCuentasPage irABuscarCuentas() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarCuenta).release(mnuItemBuscarCuenta).click().build().perform();
        return new BuscarCuentasPage(getDriver());
    }

    public BuscarCodAgentePage irABuscarCodAgente() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarCodAgente).release(mnuItemBuscarCodAgente).click().build().perform();
        return new BuscarCodAgentePage(getDriver());
    }

    public BuscarActividadesPage irABuscarActividades() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarAct).release(mnuItemBuscarAct).click().build().perform();
        return new BuscarActividadesPage(getDriver());
    }

    public BuscarContactosPage irABuscarContactos() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBusquedaContacto).release(mnuItemBusquedaContacto).click().build().perform();
        return new BuscarContactosPage(getDriver());
    }

    public EquipoPage irAEquipo() {
        gw.deployMenu(mnuEquipo);
        act.moveToElement(mnuEquipo).release(mnuEquipo).click().build().perform();
        return new EquipoPage(getDriver());
    }

    public AdminUsuariosPage irAAdminUsuarios() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemUsuario).release(mnuItemUsuario).click().build().perform();
        return new AdminUsuariosPage(getDriver());
    }

    public AdminGruposPage irAAdminGrupos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemGrupos).release(mnuItemGrupos).click().build().perform();
        return new AdminGruposPage(getDriver());
    }

    public AdminRolesPage irAAdminRoles() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRoles).release(mnuItemRoles).click().build().perform();
        return new AdminRolesPage(getDriver());
    }

    public AdminRegionesPage irAAdminRegiones() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRegiones).release(mnuItemRegiones).click().build().perform();
        return new AdminRegionesPage(getDriver());
    }

    public AdminOrganizacionesPage irAAdminOrganizaciones() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemOrganizaciones).release(mnuItemOrganizaciones).click().build().perform();
        return new AdminOrganizacionesPage(getDriver());
    }

    public AdminCodAgentesPage irAAdminCodAgentes() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemCodAgente).release(mnuItemCodAgente).click().build().perform();
        return new AdminCodAgentesPage(getDriver());
    }

    public AdminPerfilAutoridadPage irAAdminPerfilAutoridad() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPerAutoridad).release(mnuItemPerAutoridad).click().build().perform();
        return new AdminPerfilAutoridadPage(getDriver());
    }

    public AdminAtributosPage irAAdminAtributos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemAtributos).release(mnuItemAtributos).click().build().perform();
        return new AdminAtributosPage(getDriver());
    }

    public AdminGruposAfinidadPage irAAdminGruposAfinidad() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemGruposAfinidad).release(mnuItemGruposAfinidad).click().build().perform();
        return new AdminGruposAfinidadPage(getDriver());
    }

    public AdminPatronesActividadPage irAAdminPatronesActividad() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPatronesActividad).release(mnuItemPatronesActividad).click().build().perform();
        return new AdminPatronesActividadPage(getDriver());
    }

    public AdminDiasFestivosPage irAAdminDiasFestivos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemDiasFestivos).release(mnuItemDiasFestivos).click().build().perform();
        return new AdminDiasFestivosPage(getDriver());
    }

    public AdminPatronesFormPolizaPage irAAdminPatronesFormPoliza() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPatronesFormularioPoliza).release(mnuItemPatronesFormularioPoliza).click().build().perform();
        return new AdminPatronesFormPolizaPage(getDriver());
    }

    public AdminRetencionPolizasPage irAAdminRetencionPolizas() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRetenciionesPolizas).release(mnuItemRetenciionesPolizas).click().build().perform();
        return new AdminRetencionPolizasPage(getDriver());
    }

    public AdminMensajesPage irAAdminMensajes() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemMensajes).release(mnuItemMensajes).click().build().perform();
        return new AdminMensajesPage(getDriver());
    }

    public AdminColasMensajesPage irAAdminColasMensajes() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemColasMensajes).release(mnuItemColasMensajes).click().build().perform();
        return new AdminColasMensajesPage(getDriver());
    }

    public AdminFlujosTrabajoPage irAAdminFlujosTrabajo() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemFlujosTrabajo).release(mnuItemFlujosTrabajo).click().build().perform();
        return new AdminFlujosTrabajoPage(getDriver());
    }

    public AdminEstadistFlujoTrabajoPage irAAdminEstadistFlujoTrabajo() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemEstadisticaFlujos).release(mnuItemEstadisticaFlujos).click().build().perform();
        return new AdminEstadistFlujoTrabajoPage(getDriver());
    }

    public AdminImportarDatosPage irAAdminImportarDatos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemImportDatos).release(mnuItemImportDatos).click().build().perform();
        return new AdminImportarDatosPage(getDriver());
    }

    public AdminExportarDatosPage irAAdminExportarDatos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemExportDatos).release(mnuItemExportDatos).click().build().perform();
        return new AdminExportarDatosPage(getDriver());
    }

    public AdminParamSecuenciaPage irAAdminParamSecuencia() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemParametrosSecuencia).release(mnuItemParametrosSecuencia).click().build().perform();
        return new AdminParamSecuenciaPage(getDriver());
    }

    public AdminFormatoExportaPage irAAdminFormatoExporta() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemFormatoExpHojasCalculo).release(mnuItemFormatoExpHojasCalculo).click().build().perform();
        return new AdminFormatoExportaPage(getDriver());
    }

    public AdminCambioDatosPage irAAdminCambioDatos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemCambioDatos).release(mnuItemCambioDatos).click().build().perform();
        return new AdminCambioDatosPage(getDriver());
    }

    public EscritorioNuevoEnvioPage irAEscritorioNuevoEnvio() {
        menuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevoEnvio).release(mnuAccionNuevoEnvio).click().build().perform();
        return new EscritorioNuevoEnvioPage(getDriver());
    }

    public EscritorioNuevaCuentaPage irAEscritorioNuevaCuenta() {
        menuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevaCuenta).release(mnuAccionNuevaCuenta).click().build().perform();
        return new EscritorioNuevaCuentaPage(getDriver());
    }





















































































































































































































































































































































































































    public PolizaBuscarPage irABuscarPoliza(String numPoliza) {
        gw.deployMenu(mnuPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        mnuNumPoliza.typeAndEnter(numPoliza);
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionArchivoCuenta).release(mnuAccionArchivoCuenta).click().build().perform();
        return new PolizaArchivoCuentaPage(getDriver());
    }

    public PolizaSubgerentePage irAPolizaSubgerente() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionSubgerente).release(mnuAccionSubgerente).click().build().perform();
        return new PolizaSubgerentePage(getDriver());
    }

    public PolizaGrupoPage irAPolizaGrupo() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionGrupo).release(mnuAccionGrupo).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionItemGrupo).release(mnuAccionItemGrupo).click().build().perform();
        return new PolizaGrupoPage(getDriver());
    }

    public PolizaNuevaNotaPage irAPolizaNuevaNota() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevaNotaP).release(mnuAccionNuevaNotaP).click().build().perform();
        return new PolizaNuevaNotaPage(getDriver());
    }

    public PolizaLigarDocExistentePage irAPolizaLigarDocExistente() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionDocNuevosP).release(mnuAccionDocNuevosP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionLigarDocExistenteP).release(mnuAccionLigarDocExistenteP).click().build().perform();
        return new PolizaLigarDocExistentePage(getDriver());
    }

    public PolizaCrearDocPlantillaPage irAPolizaCrearDocPlantilla() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionDocNuevosP).release(mnuAccionDocNuevosP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCrearDocPlantillaP).release(mnuAccionCrearDocPlantillaP).click().build().perform();
        return new PolizaCrearDocPlantillaPage(getDriver());
    }

    public PolizaRevisarNuevoCorreoPage irAPolizaRevisarNuevoCorreo() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCorreoNuevoP).release(mnuAccionCorreoNuevoP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarNuevoCorreoP).release(mnuAccionRevisarNuevoCorreoP).click().build().perform();
        return new PolizaRevisarNuevoCorreoPage(getDriver());
    }

    public PolizaReunirseAgenteAgenciaPage irAPolizaReunirseAgenteAgencia() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionEntrevistaP).release(mnuAccionEntrevistaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReunirseAgenteAgenciaP).release(mnuAccionReunirseAgenteAgenciaP).click().build().perform();
        return new PolizaReunirseAgenteAgenciaPage(getDriver());
    }

    public PolizaReunirseAseguradoPage irAPolizaReunirseAsegurado() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionEntrevistaP).release(mnuAccionEntrevistaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReunirseAseguradoP).release(mnuAccionReunirseAseguradoP).click().build().perform();
        return new PolizaReunirseAseguradoPage(getDriver());
    }

    public PolizaCancelPolizaDivididaPage irAPolizaCancelPolizaDividida() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCancelPolizaDivididaP).release(mnuAccionCancelPolizaDivididaP).click().build().perform();
        return new PolizaCancelPolizaDivididaPage(getDriver());
    }

    public PolizaCotizacionRequeridaPage irAPolizaCotizacionRequerida() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizacionReqP).release(mnuAccionCotizacionReqP).click().build().perform();
        return new PolizaCotizacionRequeridaPage(getDriver());
    }

    public PolizaDiarioX30diasPage irAPolizaDiarioX30dias() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX30P).release(mnuAccionDiarioX30P).click().build().perform();
        return new PolizaDiarioX30diasPage(getDriver());
    }

    public PolizaDiarioX60diasPage irAPolizaDiarioX60dias() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX60P).release(mnuAccionDiarioX60P).click().build().perform();
        return new PolizaDiarioX60diasPage(getDriver());
    }

    public PolizaDiarioX90diasPage irAPolizaDiarioX90dias() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX90P).release(mnuAccionDiarioX90P).click().build().perform();
        return new PolizaDiarioX90diasPage(getDriver());
    }

    public PolizaNotificacionPolizaPage irAPolizaNotificacionPoliza() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionNotificacionPolizaP).release(mnuAccionNotificacionPolizaP).click().build().perform();
        return new PolizaNotificacionPolizaPage(getDriver());
    }

    public PolizaAsignaAuditoriaPage irAPolizaAsignaAuditoria() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAsignaAuditoriaP).release(mnuAccionAsignaAuditoriaP).click().build().perform();
        return new PolizaAsignaAuditoriaPage(getDriver());
    }

    public PolizaRevisionMitadPlazoPage irAPolizaRevisionMitadPlazo() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisionMitadPlazoP).release(mnuAccionRevisionMitadPlazoP).click().build().perform();
        return new PolizaRevisionMitadPlazoPage(getDriver());
    }

    public PolizaRecordatorioGeneralPage irAPolizaRecordatorioGeneral() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioGeneralP).release(mnuAccionRecordatorioGeneralP).click().build().perform();
        return new PolizaRecordatorioGeneralPage(getDriver());
    }

    public PolizaReescribirCuentaNuevaPage irAPolizaReescribirCuentaNueva() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReescribirCtaNuevaP).release(mnuAccionReescribirCtaNuevaP).click().build().perform();
        return new PolizaReescribirCuentaNuevaPage(getDriver());
    }

    public PolizaRenovacionRevisionPage irAPolizaRenovacionRevision() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRenovaRevisionPolizaP).release(mnuAccionRenovaRevisionPolizaP).click().build().perform();
        return new PolizaRenovacionRevisionPage(getDriver());
    }

    public PolizaRevisarAgentePage irAPolizaRevisarAgente() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarAgenteP).release(mnuAccionRevisarAgenteP).click().build().perform();
        return new PolizaRevisarAgentePage(getDriver());
    }

    public PolizaRevisarX30Page irAPolizaRevisarX30() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX30P).release(mnuAccionRevisarX30P).click().build().perform();
        return new PolizaRevisarX30Page(getDriver());
    }

    public PolizaRevisarX45Page irAPolizaRevisarX45() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX45P).release(mnuAccionRevisarX45P).click().build().perform();
        return new PolizaRevisarX45Page(getDriver());
    }

    public PolizaRevisarX60Page irAPolizaRevisarX60() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX60P).release(mnuAccionRevisarX60P).click().build().perform();
        return new PolizaRevisarX60Page(getDriver());
    }

    public PolizaRevisionRendimientoPage irAPolizaRevisionRendimiento() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarRendimientoP).release(mnuAccionRevisarRendimientoP).click().build().perform();
        return new PolizaRevisionRendimientoPage(getDriver());
    }

    public PolizaVerificarCoberturaPage irAPolizaVerificarCobertura() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionVerificarCoberturaP).release(mnuAccionVerificarCoberturaP).click().build().perform();
        return new PolizaVerificarCoberturaPage(getDriver());
    }

    public PolizaIndiceFueraRangoPage irAPolizaIndiceFueraRango() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioP).release(mnuAccionRecordatorioP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionIndiceFueraRangoP).release(mnuAccionIndiceFueraRangoP).click().build().perform();
        return new PolizaIndiceFueraRangoPage(getDriver());
    }

    public PolizaRevisarAprobarPage irAPolizaRevisarAprobar() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisionAseguradorP).release(mnuAccionRevisionAseguradorP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarAprobarP).release(mnuAccionRevisarAprobarP).click().build().perform();
        return new PolizaRevisarAprobarPage(getDriver());
    }

    public PolizaCrearAgenteNuevoPage irAPolizaCrearAgenteNuevo() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAgenteNuevoP).release(mnuAccionAgenteNuevoP).click().build().perform();
        return new PolizaCrearAgenteNuevoPage(getDriver());
    }

    public PolizaObtenerAuditPersonalInternoPage irAPolizaObtenerAuditPersonalInterno() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAuditoriaInternoP).release(mnuAccionAuditoriaInternoP).click().build().perform();
        return new PolizaObtenerAuditPersonalInternoPage(getDriver());
    }

    public PolizaObtenerAuditServicioExternoPage irAPolizaObtenerAuditServicioExternoPage() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAuditoriaExternaP).release(mnuAccionAuditoriaExternaP).click().build().perform();
        return new PolizaObtenerAuditServicioExternoPage(getDriver());
    }

    public PolizaObtenerCotizacionReaseguroPage irAPolizaObtenerCotizacionReaseguro() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizacionReaseguroP).release(mnuAccionCotizacionReaseguroP).click().build().perform();
        return new PolizaObtenerCotizacionReaseguroPage(getDriver());
    }

    public PolizaObtenerDatosOfPage irAPolizaObtenerDatosOf() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDatosOfP).release(mnuAccionDatosOfP).click().build().perform();
        return new PolizaObtenerDatosOfPage(getDriver());
    }

    public PolizaObtenerInfoRiesgosAgentePage irAPolizaObtenerInfoRiesgosAgente() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInfoAgenteP).release(mnuAccionInfoAgenteP).click().build().perform();
        return new PolizaObtenerInfoRiesgosAgentePage(getDriver());
    }

    public PolizaObtenerInformesVehiculoPage irAPolizaObtenerInformesVehiculo() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInformesMotorizadoP).release(mnuAccionInformesMotorizadoP).click().build().perform();
        return new PolizaObtenerInformesVehiculoPage(getDriver());
    }

    public PolizaObtenerInspeccionSiniestroPage irAPolizaObtenerInspeccionSiniestro() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInspeccionSiniestroP).release(mnuAccionInspeccionSiniestroP).click().build().perform();
        return new PolizaObtenerInspeccionSiniestroPage(getDriver());
    }

    public PolizaObtenerInspeccionExternoPage irAPolizaObtenerInspeccionExterno() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInspeccionExternoP).release(mnuAccionInspeccionExternoP).click().build().perform();
        return new PolizaObtenerInspeccionExternoPage(getDriver());
    }

    public PolizaObtenerReportesCreditoPage irAPolizaObtenerReportesCredito() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReportesCreditoP).release(mnuAccionReportesCreditoP).click().build().perform();
        return new PolizaObtenerReportesCreditoPage(getDriver());
    }

    public PolizaRevisionLegalPage irAPolizaRevisionLegal() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisionLegalP).release(mnuAccionRevisionLegalP).click().build().perform();
        return new PolizaRevisionLegalPage(getDriver());
    }

    public PolizaTasarCotizarManualPage irAPolizaTasarCotizarManual() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNuevaP).release(mnuAccionActNuevaP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitudP).release(mnuAccionSolicitudP).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizarManualP).release(mnuAccionCotizarManualP).click().build().perform();
        return new PolizaTasarCotizarManualPage(getDriver());
    }

    public PolizaCopiarEnvioPage irAPolizaCopiarEnvio() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionCopiarEnvioP).release(mnuAccionCopiarEnvioP).click().build().perform();
        return new PolizaCopiarEnvioPage(getDriver());
    }

    public PolizaActivarDesactivarPage irAPolizaActivarDesactivar() {
        mnuPoliza.click();
        gw.deployMenu(mnuAccionesPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionArchivarDesactivarP).release(mnuAccionArchivarDesactivarP).click().build().perform();
        return new PolizaActivarDesactivarPage(getDriver());
    }

    public ContactoNuevaCuentaPage irAContactoNuevaCuenta() {
        mnuContact.click();
        gw.deployMenu(mnuAccionesContacto);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevaCuentaC).release(mnuAccionNuevaCuentaC).click().build().perform();
        return new ContactoNuevaCuentaPage(getDriver());
    }

    public AdminUsuarioNuevoPage irAAdminUsuarioNuevo() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionUsuarioNuevo).release(mnuAccionUsuarioNuevo).click().build().perform();
        return new AdminUsuarioNuevoPage(getDriver());
    }

    public AdminGrupoNuevoPage irAAdminGrupoNuevo() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionGrupoNuevo).release(mnuAccionGrupoNuevo).click().build().perform();
        return new AdminGrupoNuevoPage(getDriver());
    }

    public AdminOrganizacionNuevaPage irAAdminOrganizacionNueva() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionOrganizacionNueva).release(mnuAccionOrganizacionNueva).click().build().perform();
        return new AdminOrganizacionNuevaPage(getDriver());
    }

    public AdminCodAgenteNuevoPage irAAdminCodAgenteNuevo() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionCodAgenteNuevo).release(mnuAccionCodAgenteNuevo).click().build().perform();
        return new AdminCodAgenteNuevoPage(getDriver());
    }

    public AdminNuevoGrupoAfinidadPage irAAdminNuevoGrupoAfinidad() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevoGrupoAfiinidad).release(mnuAccionNuevoGrupoAfiinidad).click().build().perform();
        return new AdminNuevoGrupoAfinidadPage(getDriver());
    }

    public AdminVerificarErrorPatronPage irAAdminVerificarErrorPatron() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionVerificarErroresPatron).release(mnuAccionVerificarErroresPatron).click().build().perform();
        return new AdminVerificarErrorPatronPage(getDriver());
    }

}
