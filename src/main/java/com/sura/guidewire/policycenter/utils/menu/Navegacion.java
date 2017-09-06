package com.sura.guidewire.policycenter.utils.menu;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.menu.acciones.administracion.*;
import com.sura.guidewire.policycenter.utils.menu.acciones.contacto.ContactoNuevaCuentaPage;
import com.sura.guidewire.policycenter.utils.menu.acciones.cuenta.*;
import com.sura.guidewire.policycenter.utils.menu.acciones.escritorio.EscritorioNuevaCuentaPage;
import com.sura.guidewire.policycenter.utils.menu.acciones.escritorio.EscritorioNuevoEnvioPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesCrearPartcCuentaPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesResumenCuentaPage;
import com.sura.guidewire.policycenter.utils.menu.superior.administracion.*;
import com.sura.guidewire.policycenter.utils.menu.superior.buscar.*;
import com.sura.guidewire.policycenter.utils.menu.superior.contacto.BuscarContactoPage;
import com.sura.guidewire.policycenter.utils.menu.superior.contacto.NuevaCompaniaPage;
import com.sura.guidewire.policycenter.utils.menu.superior.contacto.NuevaPersonaPage;
import com.sura.guidewire.policycenter.utils.menu.superior.cuenta.CuentaBuscarPage;
import com.sura.guidewire.policycenter.utils.menu.superior.cuenta.NuevaCuentaPage;
import com.sura.guidewire.policycenter.utils.menu.superior.equipo.EquipoPage;

import com.sura.guidewire.policycenter.utils.menu.superior.escritorio.*;
import com.sura.guidewire.policycenter.utils.menu.superior.poliza.NuevoEnvioPage;
import com.sura.guidewire.policycenter.utils.menu.superior.poliza.PolizaBuscarPage;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;




public class Navegacion extends PageUtil {


    // Objetos menu Escritorio
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnWrap']")
    private WebElementFacade menuEscritorio;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopActivities-itemEl']")
    private WebElementFacade itemMisActividades;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopAccounts-itemEl']")
    private WebElementFacade mnuItemMisCuentas;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopSubmissions-itemEl']")
    private WebElementFacade mnuItemMisEnvios;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopRenewals-itemEl']")
    private WebElementFacade mnuItemMisRenovaciones;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopOtherWorkOrders-itemEl']")
    private WebElementFacade mnuItemMisOtrasTrans;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopAssignableQueues-itemEl']")
    private WebElementFacade mnuItemMisColas;
    @FindBy(xpath = ".//*[@id='TabBar:AccountTab-btnWrap']")
    private WebElementFacade mnuCuenta;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtIrA;

    // Objetos menu Cuenta
    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-itemEl']")
    private WebElementFacade mnuItemNuevaCuenta;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='DesktopSubmissions:DesktopSubmissionsScreen:SubmissionSearch-inputEl']")
    private WebElementFacade campoTxtSubN;

    // Objetos menu Poliza
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElementFacade mnuPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_NewSubmission-itemEl']")
    private WebElementFacade mnuItemNuevoEnvio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Prev-btnInnerEl']")
    public WebElementFacade botonVolver;

    // Objetos menu Contacto
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    private WebElementFacade mnuContact;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact-arrowEl']")
    private WebElementFacade mnuItemNuevoContacto;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewCompany-textEl']")
    private WebElementFacade mnuItemNuevaCompania;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewPerson']")
    private WebElementFacade mnuItemNuevaPersona;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:Search-itemEl']")
    private WebElementFacade mnuItemContactoBusqueda;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnWrap']")
    private WebElementFacade mnuBuscar;

    // Objetos menu Buscar
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_PolicySearch']")
    private WebElementFacade mnuItemBuscarPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_AccountSearch']")
    private WebElementFacade mnuItemBuscarCuenta;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_ProducerCodeSearch']")
    private WebElementFacade mnuItemBuscarCodAgente;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_ActivitySearch']")
    private WebElementFacade mnuItemBuscarAct;
    @FindBy(xpath = "//*[@id='TabBar:SearchTab:Search_ContactSearch']")
    private WebElementFacade mnuItemBusquedaContacto;

    // Objetos menu Equipo
    @FindBy(xpath = ".//*[@id='TabBar:TeamTab-btnInnerEl']")
    private WebElementFacade mnuEquipo;

    // Objetos menu Administracion
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab-btnWrap']")
    private WebElementFacade mnuAdministracion;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity-arrowEl']")
    private WebElementFacade mnuItemUsuarioSeguridad;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_AdminUserSearchPage-itemEl']")
    private WebElementFacade mnuItemUsuario;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_AdminGroupSearchPage-itemEl']")
    private WebElementFacade mnuItemGrupos;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_Roles-itemEl']")
    private WebElementFacade mnuItemRoles;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_Regions-itemEl']")
    private WebElementFacade mnuItemRegiones;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_OrganizationSearchPage-itemEl']")
    private WebElementFacade mnuItemOrganizaciones;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_AdminProducerCodeSearch-itemEl']")
    private WebElementFacade mnuItemCodAgente;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_UWAuthorityProfiles-textEl']")
    private WebElementFacade mnuItemPerAutoridad;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_Attributes-itemEl']")
    private WebElementFacade mnuItemAtributos;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_UsersAndSecurity:UsersAndSecurity_SearchAffinityGroup-itemEl']")
    private WebElementFacade mnuItemGruposAfinidad;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings']")
    private WebElementFacade mnuItemConfigComercial;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings:BusinessSettings_ActivityPatterns-itemEl']")
    private WebElementFacade mnuItemPatronesActividad;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings:BusinessSettings_Holidays-itemEl']")
    private WebElementFacade mnuItemDiasFestivos;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings:BusinessSettings_FormPatterns-itemEl']")
    private WebElementFacade mnuItemPatronesFormularioPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_BusinessSettings:BusinessSettings_PolicyHolds-itemEl']")
    private WebElementFacade mnuItemRetenciionesPolizas;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring']")
    private WebElementFacade mnuItemSupervision;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring:Monitoring_MessageSearch-itemEl']")
    private WebElementFacade mnuItemMensajes;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring:Monitoring_MessagingDestinationControlList-itemEl']")
    private WebElementFacade mnuItemColasMensajes;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring:Monitoring_WorkflowSearch-itemEl']")
    private WebElementFacade mnuItemFlujosTrabajo;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Monitoring:Monitoring_WorkflowStats-itemEl']")
    private WebElementFacade mnuItemEstadisticaFlujos;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities']")
    private WebElementFacade mnuItemUtilidades;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_ImportWizard-itemEl']")
    private WebElementFacade mnuItemImportDatos;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_ExportData-itemEl']")
    private WebElementFacade mnuItemExportDatos;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_ScriptParametersPage-itemEl']")
    private WebElementFacade mnuItemParametrosSecuencia;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_DataFlowMasks-itemEl']")
    private WebElementFacade mnuItemFormatoExpHojasCalculo;
    @FindBy(xpath = ".//*[@id='TabBar:AdminTab:Admin_Utilities:Utilities_DataChangePage-itemEl']")
    private WebElementFacade mnuItemCambioDatos;

    // Objetos menu Acciones Escritorio
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions']")
    private WebElementFacade mnuAccionesEscritorio;
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission']")
    private WebElementFacade mnuAccionNuevoEnvio;
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount']")
    private WebElementFacade mnuAccionNuevaCuenta;

    // Objetos menu Acciones Cuenta
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions-btnInnerEl']")
    private WebElementFacade mnuAccionesCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewNote-itemEl']")
    private WebElementFacade mnuAccionNuevaNota;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument-arrowEl']")
    private WebElementFacade mnuAccionDocNuevos;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument:AccountNewDocumentMenuItemSet:AccountNewDocumentMenuItemSet_Linked-itemEl']")
    private WebElementFacade mnuAccionLigarDocExistente;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument:AccountNewDocumentMenuItemSet:AccountNewDocumentMenuItemSet_Template-textEl']")
    private WebElementFacade mnuAccionCrearDocPlantilla;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewEmail-itemEl']")
    private WebElementFacade mnuAccionNuevoCorreo;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-itemEl']")
    private WebElementFacade mnuAccionNuevoEnvio2;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category:0:item-textEl']")
    private WebElementFacade mnuAccionRevisarNuevoCorreo;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity-arrowEl']")
    private WebElementFacade mnuAccionActNueva;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category-arrowEl']")
    private WebElementFacade mnuAccionCorreoNuevo;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category-arrowEl']")
    private WebElementFacade mnuAccionEntrevista;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:0:item-textEl']")
    private WebElementFacade mnuAccionReunirseAgenteAgencia;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:1:item-itemEl']")
    private WebElementFacade mnuAccionReunirseAsegurado;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category-arrowEl']")
    private WebElementFacade mnuAccionRecordatorio;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:0:item-itemEl']")
    private WebElementFacade mnuAccionCancelPolizaDividida;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:1:item-itemEl']")
    private WebElementFacade mnuAccionCotizacionReq;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:2:item-itemEl']")
    private WebElementFacade mnuAccionDiarioX30;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:3:item-itemEl']")
    private WebElementFacade mnuAccionDiarioX60;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:4:item-itemEl']")
    private WebElementFacade mnuAccionDiarioX90;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:5:item-itemEl']")
    private WebElementFacade mnuAccionNotificacionPoliza;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:6:item-itemEl']")
    private WebElementFacade mnuAccionRecordatorioGeneral;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:7:item-itemEl']")
    private WebElementFacade mnuAccionRevisarAgente;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:8:item-textEl']")
    private WebElementFacade mnuAccionRevisarX30;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:9:item-textEl']")
    private WebElementFacade mnuAccionRevisarX45;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:10:item-textEl']")
    private WebElementFacade mnuAccionRevisarX60;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:11:item-itemEl']")
    private WebElementFacade mnuAccionRevisarRendimiento;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:2:NewActivityMenuItemSet_Category:12:item-itemEl']")
    private WebElementFacade mnuAccionVerificarCobertura;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_MovePolicies-itemEl']")
    private WebElementFacade mnuAccionTransferirPolizas;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_RewritePolicies-itemEl']")
    private WebElementFacade mnuAccionReescribirPolizas;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_MergeAccounts-textEl']")
    private WebElementFacade mnuAccionCombinarCuentas;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-itemEl']")
    private WebElementFacade mnuNuevaCotizacion;

    // Objetos menu Acciones Contacto
    @FindBy(xpath = ".//*[@id='ContactFile:ContactFileMenuActions-btnInnerEl']")
    private WebElementFacade mnuAccionesContacto;
    @FindBy(xpath = ".//*[@id='ContactFile:ContactFileMenuActions:ContactFileMenuActions_Create:ContactFileMenuActions_NewAccount-itemEl']")
    private WebElementFacade mnuAccionNuevaCuentaC;

    // Objetos menu Acciones Administracion
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions-btnInnerEl']")
    private WebElementFacade mnuAccionesAdministracion;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewUser-itemEl']")
    private WebElementFacade mnuAccionUsuarioNuevo;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewGroup-itemEl']")
    private WebElementFacade mnuAccionGrupoNuevo;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewOrganization-itemEl']")
    private WebElementFacade mnuAccionOrganizacionNueva;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewProducerCode-itemEl']")
    private WebElementFacade mnuAccionCodAgenteNuevo;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewAffinityGroup-itemEl']")
    private WebElementFacade mnuAccionNuevoGrupoAfiinidad;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_Validate:AdminMenuActions_ValidateFormPatterns-itemEl']")
    private WebElementFacade mnuAccionVerificarErroresPatron;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category-arrowEl']")
    private WebElementFacade mnuAccionSolicitud;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:0:item-itemEl']")
    private WebElementFacade mnuAccionAgenteNuevo;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:1:item-itemEl']")
    private WebElementFacade mnuAccionAuditoriaInterno;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:2:item-itemEl']")
    private WebElementFacade mnuAccionAuditoriaExterna;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:3:item-itemEl']")
    private WebElementFacade mnuAccionCotizacionReaseguro;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:4:item-itemEl']")
    private WebElementFacade mnuAccionDatosOf;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:5:item-itemEl']")
    private WebElementFacade mnuAccionInfoAgente;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:6:item-textEl']")
    private WebElementFacade mnuAccionInformesMotorizado;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:7:item-itemEl']")
    private WebElementFacade mnuAccionInspeccionSiniestro;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:8:item-itemEl']")
    private WebElementFacade mnuAccionInspeccionExterno;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:9:item-itemEl']")
    private WebElementFacade mnuAccionReportesCredito;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:10:item-itemEl']")
    private WebElementFacade mnuAccionRevisionLegal;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:11:item-itemEl']")
    private WebElementFacade mnuAccionCotizarManual;

    // Objetos menu Opciones Cuenta
    @FindBy(xpath = ".//td[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Roles']/div")
    private WebElementFacade mnuOpcionesCuenta;

    @FindBy(xpath = "//td[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Summary']/div/span")
    WebElementFacade mnuResumenCuenta;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']")
    private WebElementFacade mnuInformacionDePoliza;

    @FindBy(xpath = ".//*[@id='AccountFile:MenuLinks:AccountFile_SubmissionManager']/div/span")
    private WebElementFacade mnuAdmCotizaciones;

    public Navegacion(WebDriver driver) {
        super(driver);
    }

    // Navegacion menu Escritorio
    public MisActividadesPage irAMisActividades() {
        desplegarMenu(menuEscritorio);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(itemMisActividades).release(itemMisActividades).click().build().perform();
        return new MisActividadesPage(getDriver());
    }

    public MisCuentasPage irAMisCuentas() {
        desplegarMenu(menuEscritorio);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuItemMisCuentas).release(mnuItemMisCuentas).click().build().perform();
        return new MisCuentasPage(getDriver());
    }

    public PolizaBuscarPage irABuscarPoliza(String numPoliza) {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(campoTxtBuscar).waitUntilPresent().sendKeys("Policy " + numPoliza);
        campoTxtBuscar.sendKeys(Keys.ENTER);
        return new PolizaBuscarPage(getDriver());
    }

    public PolizaBuscarPage irABuscarSubPoliza(String numSubPoliza) {
        esperarObjetoClikeableServidorWe(campoTxtBuscar.waitUntilVisible());
        campoTxtBuscar.waitUntilVisible().sendKeys("MySubmissions");
        campoTxtBuscar.sendKeys(Keys.ENTER);
        campoTxtSubN.waitUntilPresent().sendKeys(numSubPoliza);
        campoTxtSubN.sendKeys(Keys.ENTER);
        return new PolizaBuscarPage(getDriver());
    }

    public MisEnviosPage irAMisEnvios() {
        desplegarMenu(menuEscritorio);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuItemMisEnvios).release(mnuItemMisEnvios).click().build().perform();
        return new MisEnviosPage(getDriver());
    }

    public MisRenovacionesPage irAMisRenovaciones() {
        desplegarMenu(menuEscritorio);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuItemMisRenovaciones).release(mnuItemMisRenovaciones).click().build().perform();
        return new MisRenovacionesPage(getDriver());
    }

    public MisOtrasTransacPage irAMisOtrasTransacciones() {
        desplegarMenu(menuEscritorio);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuItemMisOtrasTrans).release(mnuItemMisOtrasTrans).click().build().perform();
        return new MisOtrasTransacPage(getDriver());
    }

    public MisColasPage irAMisColas() {
        desplegarMenu(menuEscritorio);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuItemMisColas).release(mnuItemMisColas).click().build().perform();
        return new MisColasPage(getDriver());
    }

    // Navegacion menu Cuenta
    public NuevaCuentaPage irANuevaCuenta() {
        withTimeoutOf(TIEMPO_30, TimeUnit.SECONDS).waitFor(mnuCuenta).waitUntilPresent();
        clickearElemento(mnuCuenta);
        waitForAnyTextToAppear("Resumen de la cuenta", "Búsqueda de cuentas");
        esperarHasta(TIEMPO_2500);
        clickearElemento(mnuCuenta);
        esperarHasta(TIEMPO_500);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.moveToElement(mnuItemNuevaCuenta).release(mnuItemNuevaCuenta).click().build().perform();
        return new NuevaCuentaPage(getDriver());
    }

    public CuentaBuscarPage irACuentaBuscar(String numCuenta) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(campoTxtBuscar).waitUntilPresent();
        campoTxtBuscar.sendKeys("Account " + numCuenta);
        campoTxtBuscar.sendKeys(Keys.ENTER);
        return new CuentaBuscarPage(getDriver());
    }

    // Navegacion menu Poliza
    public NuevoEnvioPage irANuevoEnvio() {
        desplegarMenu(mnuPoliza);
        actions.moveToElement(mnuItemNuevoEnvio).release(mnuItemNuevoEnvio).click().build().perform();
        return new NuevoEnvioPage(getDriver());
    }

    // Navegacion menu Contacto
    public NuevaCompaniaPage irANuevaCompania() {
        desplegarMenu(mnuContact);
        actions.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemNuevaCompania).release(mnuItemNuevaCompania).click().build().perform();
        waitForTextToAppear("Nuevo Contacto");
        return new NuevaCompaniaPage(getDriver());
    }

    public NuevaPersonaPage irANuevaPersona() {
        desplegarMenu(mnuContact);
        actions.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemNuevaPersona).release(mnuItemNuevaPersona).click().build().perform();
        waitForTextToAppear("Nuevo Contacto");
        return new NuevaPersonaPage(getDriver());
    }

    public BuscarContactoPage irABuscarContacto() {
        desplegarMenu(mnuContact);
        actions.moveToElement(mnuItemContactoBusqueda).release(mnuItemContactoBusqueda).click().build().perform();
        return new BuscarContactoPage(getDriver());
    }

    public BuscarPolizasPage irABuscarPolizas() {
        desplegarMenu(mnuBuscar);
        actions.moveToElement(mnuItemBuscarPoliza).release(mnuItemBuscarPoliza).click().build().perform();
        return new BuscarPolizasPage(getDriver());
    }

    public BuscarCuentasPage irABuscarCuentas() {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(campoTxtIrA).shouldBePresent();
        campoTxtIrA.sendKeys("Search");
        campoTxtIrA.sendKeys(Keys.ENTER);
        waitForTextToAppear("Buscar pólizas");
        return new BuscarCuentasPage(getDriver());
    }

    public BuscarCodAgentePage irABuscarCodAgente() {
        desplegarMenu(mnuBuscar);
        actions.moveToElement(mnuItemBuscarCodAgente).release(mnuItemBuscarCodAgente).click().build().perform();
        return new BuscarCodAgentePage(getDriver());
    }

    public BuscarActividadesPage irABuscarActividades() {
        desplegarMenu(mnuBuscar);
        actions.moveToElement(mnuItemBuscarAct).release(mnuItemBuscarAct).click().build().perform();
        return new BuscarActividadesPage(getDriver());
    }

    public BuscarContactosPage irABuscarContactos() {
        esperarHasta(TIEMPO_2500);
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(mnuBuscar).waitUntilVisible();
        desplegarMenu(mnuBuscar);
        actions.moveToElement(mnuItemBusquedaContacto).release(mnuItemBusquedaContacto).click().build().perform();
        return new BuscarContactosPage(getDriver());
    }

    // Navegacion menu Equipo
    public EquipoPage irAEquipo() {
        desplegarMenu(mnuEquipo);
        actions.moveToElement(mnuEquipo).release(mnuEquipo).click().build().perform();
        return new EquipoPage(getDriver());
    }

    // Navegacion menu Administracion
    public AdminUsuariosPage irAAdminUsuarios() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemUsuario).release(mnuItemUsuario).click().build().perform();
        return new AdminUsuariosPage(getDriver());
    }

    public AdminGruposPage irAAdminGrupos() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemGrupos).release(mnuItemGrupos).click().build().perform();
        return new AdminGruposPage(getDriver());
    }

    public AdminRolesPage irAAdminRoles() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemRoles).release(mnuItemRoles).click().build().perform();
        return new AdminRolesPage(getDriver());
    }

    public AdminRegionesPage irAAdminRegiones() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemRegiones).release(mnuItemRegiones).click().build().perform();
        return new AdminRegionesPage(getDriver());
    }

    public AdminOrganizacionesPage irAAdminOrganizaciones() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemOrganizaciones).release(mnuItemOrganizaciones).click().build().perform();
        return new AdminOrganizacionesPage(getDriver());
    }

    public AdminCodAgentesPage irAAdminCodAgentes() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemCodAgente).release(mnuItemCodAgente).click().build().perform();
        return new AdminCodAgentesPage(getDriver());
    }

    public AdminPerfilAutoridadPage irAAdminPerfilAutoridad() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemPerAutoridad).release(mnuItemPerAutoridad).click().build().perform();
        return new AdminPerfilAutoridadPage(getDriver());
    }

    public AdminAtributosPage irAAdminAtributos() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemAtributos).release(mnuItemAtributos).click().build().perform();
        return new AdminAtributosPage(getDriver());
    }

    public AdminGruposAfinidadPage irAAdminGruposAfinidad() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemGruposAfinidad).release(mnuItemGruposAfinidad).click().build().perform();
        return new AdminGruposAfinidadPage(getDriver());
    }

    public AdminPatronesActividadPage irAAdminPatronesActividad() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemPatronesActividad).release(mnuItemPatronesActividad).click().build().perform();
        return new AdminPatronesActividadPage(getDriver());
    }

    public AdminDiasFestivosPage irAAdminDiasFestivos() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemDiasFestivos).release(mnuItemDiasFestivos).click().build().perform();
        return new AdminDiasFestivosPage(getDriver());
    }

    public AdminPatronesFormPolizaPage irAAdminPatronesFormPoliza() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemPatronesFormularioPoliza).release(mnuItemPatronesFormularioPoliza).click().build().perform();
        return new AdminPatronesFormPolizaPage(getDriver());
    }

    public AdminRetencionPolizasPage irAAdminRetencionPolizas() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemRetenciionesPolizas).release(mnuItemRetenciionesPolizas).click().build().perform();
        return new AdminRetencionPolizasPage(getDriver());
    }

    public AdminMensajesPage irAAdminMensajes() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemMensajes).release(mnuItemMensajes).click().build().perform();
        return new AdminMensajesPage(getDriver());
    }

    public AdminColasMensajesPage irAAdminColasMensajes() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemColasMensajes).release(mnuItemColasMensajes).click().build().perform();
        return new AdminColasMensajesPage(getDriver());
    }

    public AdminFlujosTrabajoPage irAAdminFlujosTrabajo() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemFlujosTrabajo).release(mnuItemFlujosTrabajo).click().build().perform();
        return new AdminFlujosTrabajoPage(getDriver());
    }

    public AdminEstadistFlujoTrabajoPage irAAdminEstadistFlujoTrabajo() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemEstadisticaFlujos).release(mnuItemEstadisticaFlujos).click().build().perform();
        return new AdminEstadistFlujoTrabajoPage(getDriver());
    }

    public AdminImportarDatosPage irAAdminImportarDatos() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemImportDatos).release(mnuItemImportDatos).click().build().perform();
        return new AdminImportarDatosPage(getDriver());
    }

    public AdminExportarDatosPage irAAdminExportarDatos() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemExportDatos).release(mnuItemExportDatos).click().build().perform();
        return new AdminExportarDatosPage(getDriver());
    }

    public AdminParamSecuenciaPage irAAdminParamSecuencia() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemParametrosSecuencia).release(mnuItemParametrosSecuencia).click().build().perform();
        return new AdminParamSecuenciaPage(getDriver());
    }

    public AdminFormatoExportaPage irAAdminFormatoExporta() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemFormatoExpHojasCalculo).release(mnuItemFormatoExpHojasCalculo).click().build().perform();
        return new AdminFormatoExportaPage(getDriver());
    }

    public AdminCambioDatosPage irAAdminCambioDatos() {
        desplegarMenu(mnuAdministracion);
        actions.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuItemCambioDatos).release(mnuItemCambioDatos).click().build().perform();
        return new AdminCambioDatosPage(getDriver());
    }

    // Navegacion menu Acciones Escritorio
    public EscritorioNuevoEnvioPage irAEscritorioNuevoEnvio() {
        menuEscritorio.click();
        desplegarMenu(mnuAccionesEscritorio);
        actions.moveToElement(mnuAccionNuevoEnvio).release(mnuAccionNuevoEnvio).click().build().perform();
        return new EscritorioNuevoEnvioPage(getDriver());
    }

    public EscritorioNuevaCuentaPage irAEscritorioNuevaCuenta() {
        menuEscritorio.click();
        desplegarMenu(mnuAccionesEscritorio);
        actions.moveToElement(mnuAccionNuevaCuenta).release(mnuAccionNuevaCuenta).click().build().perform();
        return new EscritorioNuevaCuentaPage(getDriver());
    }

    // Navegacion menu Acciones Cuenta
    public CuentaNuevaNotaPage irACuentaNuevaNota() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionNuevaNota).release(mnuAccionNuevaNota).click().build().perform();
        return new CuentaNuevaNotaPage(getDriver());
    }

    public CuentaLigaDocExistePage irACuentaLigaDocExiste() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionDocNuevos).release(mnuAccionDocNuevos).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionLigarDocExistente).release(mnuAccionLigarDocExistente).click().build().perform();
        return new CuentaLigaDocExistePage(getDriver());
    }

    public CuentaCreaDocNuevaPlantPage irACuentaCreaDocNuevaPlant() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionDocNuevos).release(mnuAccionDocNuevos).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionCrearDocPlantilla).release(mnuAccionCrearDocPlantilla).click().build().perform();
        return new CuentaCreaDocNuevaPlantPage(getDriver());
    }

    public CuentaNuevoCorreoElecPage irACuentaNuevoCorreoElect() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionNuevoCorreo).release(mnuAccionNuevoCorreo).click().build().perform();
        return new CuentaNuevoCorreoElecPage(getDriver());
    }

    public CuentaNuevoEnvioPage irACuentaNuevoEnvioCuenta() {
        waitFor(mnuAccionesCuenta).waitUntilPresent();
        desplegarMenu(mnuAccionesCuenta);
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionNuevoEnvio2).release(mnuAccionNuevoEnvio2).click().build().perform();
        return new CuentaNuevoEnvioPage(getDriver());
    }

    public CuentaNuevoEnvioPage irANuevoEnvioDeCuenta() {
        waitFor(mnuAccionesCuenta);
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionNuevoEnvio2).release(mnuAccionNuevoEnvio2).click().build().perform();
        return new CuentaNuevoEnvioPage(getDriver());
    }

    public CuentaRevisaNuevoCorreoPage irACuentaRevisaNuevoCorreo() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionCorreoNuevo).release(mnuAccionCorreoNuevo).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionRevisarNuevoCorreo).release(mnuAccionRevisarNuevoCorreo).click().build().perform();
        return new CuentaRevisaNuevoCorreoPage(getDriver());
    }

    public CuentaReuneAgentePage irACuentaReuneAgente() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionEntrevista).release(mnuAccionEntrevista).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionReunirseAgenteAgencia).release(mnuAccionReunirseAgenteAgencia).click().build().perform();
        return new CuentaReuneAgentePage(getDriver());
    }

    public CuentaReuneAseguradoPage irACuentaReuneAsegurado() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionEntrevista).release(mnuAccionEntrevista).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionReunirseAsegurado).release(mnuAccionReunirseAsegurado).click().build().perform();
        return new CuentaReuneAseguradoPage(getDriver());
    }

    public CuentaCancelaPolizDividPage irACuentaCancelaPolizDivid() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionCancelPolizaDividida).release(mnuAccionCancelPolizaDividida).click().build().perform();
        return new CuentaCancelaPolizDividPage(getDriver());
    }

    public CuentaCotizaRequeridaPage irACuentaCotizaRequerida() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionCotizacionReq).release(mnuAccionCotizacionReq).click().build().perform();
        return new CuentaCotizaRequeridaPage(getDriver());
    }

    public CuentaDiarioX30Page irACuentaDiarioX30() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionDiarioX30).release(mnuAccionDiarioX30).click().build().perform();
        return new CuentaDiarioX30Page(getDriver());
    }

    public CuentaDiarioX60Page irACuentaDiarioX60() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionDiarioX60).release(mnuAccionDiarioX60).click().build().perform();
        return new CuentaDiarioX60Page(getDriver());
    }

    public CuentaDiarioX90Page irACuentaDiarioX90() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionDiarioX90).release(mnuAccionDiarioX90).click().build().perform();
        return new CuentaDiarioX90Page(getDriver());
    }

    public CuentaNotificaPolizaPage irACuentaNotificaPoliza() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionNotificacionPoliza).release(mnuAccionNotificacionPoliza).click().build().perform();
        return new CuentaNotificaPolizaPage(getDriver());
    }

    public CuentaRecuerdaGeneralPage irAEscritorioRecuerdaGeneral() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionRecordatorioGeneral).release(mnuAccionRecordatorioGeneral).click().build().perform();
        return new CuentaRecuerdaGeneralPage(getDriver());
    }

    public CuentaRevisaAgentePage irACuentaRevisaAgente() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionRevisarAgente).release(mnuAccionRevisarAgente).click().build().perform();
        return new CuentaRevisaAgentePage(getDriver());
    }

    public CuentaRevPer30DiaAseguraPage irACuentaRevPer30DiaAsegura() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionRevisarX30).release(mnuAccionRevisarX30).click().build().perform();
        return new CuentaRevPer30DiaAseguraPage(getDriver());
    }

    public CuentaRevPer45DiaAseguraPage irACuentaRevPer45DiaAsegura() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionRevisarX45).release(mnuAccionRevisarX45).click().build().perform();
        return new CuentaRevPer45DiaAseguraPage(getDriver());
    }

    public CuentaRevPer60DiaAseguraPage irACuentaRevPer60DiaAsegura() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionRevisarX60).release(mnuAccionRevisarX60).click().build().perform();
        return new CuentaRevPer60DiaAseguraPage(getDriver());
    }

    public CuentaRevisaRendimPage irACuentaRevisaRendim() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionRevisarRendimiento).release(mnuAccionRevisarRendimiento).click().build().perform();
        return new CuentaRevisaRendimPage(getDriver());
    }

    public CuentaVerificaCoberPage irACuentaVerificaCober() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionVerificarCobertura).release(mnuAccionVerificarCobertura).click().build().perform();
        return new CuentaVerificaCoberPage(getDriver());
    }

    public CuentaTransPoliACuentaPage irACuentaTransPoliACuenta() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.moveToElement(mnuAccionTransferirPolizas).release(mnuAccionTransferirPolizas).click().build().perform();
        return new CuentaTransPoliACuentaPage(getDriver());
    }

    public CuentaReescrPoliACuentaPage irACuentaReescrPoliACuenta() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionReescribirPolizas).release(mnuAccionReescribirPolizas).click().build().perform();
        return new CuentaReescrPoliACuentaPage(getDriver());
    }

    public CuentaCombPoliACuentaPage irACuentaCombPoliACuenta() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionCombinarCuentas).release(mnuAccionCombinarCuentas).click().build().perform();
        return new CuentaCombPoliACuentaPage(getDriver());
    }

    public CuentaCreaAgenteNuevPage irACuentaCreaAgenteNuev() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionAgenteNuevo).release(mnuAccionAgenteNuevo).click().build().perform();
        return new CuentaCreaAgenteNuevPage(getDriver());
    }

    public CuentaObtAudPersoInterPage irACuentaObtAudPersoInter() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionAuditoriaInterno).release(mnuAccionAuditoriaInterno).click().build().perform();
        return new CuentaObtAudPersoInterPage(getDriver());
    }

    public CuentaObtAudServExterPage irACuentaObtAudServExter() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionAuditoriaExterna).release(mnuAccionAuditoriaExterna).click().build().perform();
        return new CuentaObtAudServExterPage(getDriver());
    }

    public CuentaObtCotizReaseguroPage irACuentaObtCotizReaseguro() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionCotizacionReaseguro).release(mnuAccionCotizacionReaseguro).click().build().perform();
        return new CuentaObtCotizReaseguroPage(getDriver());
    }

    public CuentaObtDatoOficPage irACuentaObtDatoOfic() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionDatosOf).release(mnuAccionDatosOf).click().build().perform();
        return new CuentaObtDatoOficPage(getDriver());
    }

    public CuentaObtInfoVehiMotoPage irACuentaObtInfoVehiMoto() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionInformesMotorizado).release(mnuAccionInformesMotorizado).click().build().perform();
        return new CuentaObtInfoVehiMotoPage(getDriver());
    }

    public CuentaObtInspContSiniesPage irACuentaObtInspContSinies() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionInspeccionSiniestro).release(mnuAccionInspeccionSiniestro).click().build().perform();
        return new CuentaObtInspContSiniesPage(getDriver());
    }

    public CuentaObtInspServExterPage irACuentaObtInspServExter() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionInspeccionExterno).release(mnuAccionInspeccionExterno).click().build().perform();
        return new CuentaObtInspServExterPage(getDriver());
    }

    public CuentaObtReporCredPage irACuentaObtReporCred() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionReportesCredito).release(mnuAccionReportesCredito).click().build().perform();
        return new CuentaObtReporCredPage(getDriver());
    }

    public CuentaRevisionLegalPage irACuentaRevisionLegal() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionRevisionLegal).release(mnuAccionRevisionLegal).click().build().perform();
        return new CuentaRevisionLegalPage(getDriver());
    }

    public CuentaObtInfRiesAgenPage irACuentaObtInfRiesAgen() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionInfoAgente).release(mnuAccionInfoAgente).click().build().perform();
        return new CuentaObtInfRiesAgenPage(getDriver());
    }

    public CuentaTazaCotPoliManuPage irCuentaTazaCotPoliManu() {
        mnuCuenta.click();
        desplegarMenu(mnuAccionesCuenta);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        actions.moveToElement(mnuAccionCotizarManual).release(mnuAccionCotizarManual).click().build().perform();
        return new CuentaTazaCotPoliManuPage(getDriver());
    }

    public CuentaNuevaCotizacionPage irANuevaCotizacion() {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(mnuAccionesCuenta).shouldBePresent();
        waitFor(mnuAccionesCuenta).shouldBeVisible();
        mnuAccionesCuenta.click();
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(mnuNuevaCotizacion).shouldBePresent();
        mnuNuevaCotizacion.click();
        return new CuentaNuevaCotizacionPage(getDriver());
    }

    // Navegacion menu Acciones Contacto
    public ContactoNuevaCuentaPage irAContactoNuevaCuenta() {
        mnuContact.click();
        desplegarMenu(mnuAccionesContacto);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionNuevaCuentaC).release(mnuAccionNuevaCuentaC).click().build().perform();
        return new ContactoNuevaCuentaPage(getDriver());
    }

    // Navegacion menu Acciones Administracion
    public AdminUsuarioNuevoPage irAAdminUsuarioNuevo() {
        mnuAdministracion.click();
        desplegarMenu(mnuAccionesAdministracion);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionUsuarioNuevo).release(mnuAccionUsuarioNuevo).click().build().perform();
        return new AdminUsuarioNuevoPage(getDriver());
    }

    public AdminGrupoNuevoPage irAAdminGrupoNuevo() {
        mnuAdministracion.click();
        desplegarMenu(mnuAccionesAdministracion);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionGrupoNuevo).release(mnuAccionGrupoNuevo).click().build().perform();
        return new AdminGrupoNuevoPage(getDriver());
    }

    public AdminOrganizacionNuevaPage irAAdminOrganizacionNueva() {
        mnuAdministracion.click();
        desplegarMenu(mnuAccionesAdministracion);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionOrganizacionNueva).release(mnuAccionOrganizacionNueva).click().build().perform();
        return new AdminOrganizacionNuevaPage(getDriver());
    }

    public AdminCodAgenteNuevoPage irAAdminCodAgenteNuevo() {
        mnuAdministracion.click();
        desplegarMenu(mnuAccionesAdministracion);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionCodAgenteNuevo).release(mnuAccionCodAgenteNuevo).click().build().perform();
        return new AdminCodAgenteNuevoPage(getDriver());
    }

    public AdminNuevoGrupoAfinidadPage irAAdminNuevoGrupoAfinidad() {
        mnuAdministracion.click();
        desplegarMenu(mnuAccionesAdministracion);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionNuevoGrupoAfiinidad).release(mnuAccionNuevoGrupoAfiinidad).click().build().perform();
        return new AdminNuevoGrupoAfinidadPage(getDriver());
    }

    public AdminVerificarErrorPatronPage irAAdminVerificarErrorPatron() {
        mnuAdministracion.click();
        desplegarMenu(mnuAccionesAdministracion);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        esperarHasta(TIEMPO_300);
        actions.moveToElement(mnuAccionVerificarErroresPatron).release(mnuAccionVerificarErroresPatron).click().build().perform();
        return new AdminVerificarErrorPatronPage(getDriver());
    }

    public OpcionesCrearPartcCuentaPage irAOpcionesCrearPartcCuenta() {
        mnuCuenta.click();
        esperarHasta(TIEMPO_800);
        mnuOpcionesCuenta.waitUntilPresent().click();
        return new OpcionesCrearPartcCuentaPage(getDriver());
    }

    public OpcionesResumenCuentaPage irAOpcionesResumenCuenta() {
        clickearElemento(mnuResumenCuenta);
        esperarHasta(TIEMPO_800);
        return new OpcionesResumenCuentaPage(getDriver());
    }

    public OpcionesInformacionPolizaPage irAInformacionDePoliza() {
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(mnuInformacionDePoliza).shouldBePresent();
        mnuInformacionDePoliza.click();
        botonVolver.waitUntilPresent();
        esperarHasta(TIEMPO_1000);
        return new OpcionesInformacionPolizaPage(getDriver());
    }

    public OpcionesAdminitradorCotizaciones irAOpcionesAdministradorCotizaciones() {
        waitForTextToAppear("Cotizaciones de la cuenta");
        waitFor(mnuAdmCotizaciones).shouldBeEnabled();
        esperarHasta(TIEMPO_1000);
        mnuAdmCotizaciones.waitUntilVisible();
        clickearElemento(mnuAdmCotizaciones);
        esperarHasta(TIEMPO_800);
        return new OpcionesAdminitradorCotizaciones(getDriver());
    }
}