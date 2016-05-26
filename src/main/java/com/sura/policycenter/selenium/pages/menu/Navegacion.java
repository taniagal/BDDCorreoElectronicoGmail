package com.sura.policycenter.selenium.pages.menu;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.menu.acciones.administracion.*;
import com.sura.policycenter.selenium.pages.menu.acciones.contacto.ContactoNuevaCuentaPage;
import com.sura.policycenter.selenium.pages.menu.acciones.cuenta.*;
import com.sura.policycenter.selenium.pages.menu.acciones.escritorio.EscritorioNuevaCuentaPage;
import com.sura.policycenter.selenium.pages.menu.acciones.escritorio.EscritorioNuevoEnvioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesCrearPartcCuentaPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesResumenCuentaPage;
import com.sura.policycenter.selenium.pages.menu.superior.administracion.*;
import com.sura.policycenter.selenium.pages.menu.superior.buscar.*;
import com.sura.policycenter.selenium.pages.menu.superior.contacto.BuscarContactoPage;
import com.sura.policycenter.selenium.pages.menu.superior.contacto.NuevaCompaniaPage;
import com.sura.policycenter.selenium.pages.menu.superior.contacto.NuevaPersonaPage;
import com.sura.policycenter.selenium.pages.menu.superior.cuenta.CuentaBuscarPage;
import com.sura.policycenter.selenium.pages.menu.superior.cuenta.NuevaCuentaPage;
import com.sura.policycenter.selenium.pages.menu.superior.equipo.EquipoPage;
import com.sura.policycenter.selenium.pages.menu.superior.escritorio.*;
import com.sura.policycenter.selenium.pages.menu.superior.poliza.NuevoEnvioPage;
import com.sura.policycenter.selenium.pages.menu.superior.poliza.PolizaBuscarPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Navegacion extends Guidewire {

    private final Guidewire gw = new Guidewire(getDriver());
    private final Actions act = new Actions(getDriver());

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

    // Objetos menu Cuenta
    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-itemEl']")
    private WebElementFacade mnuItemNuevaCuenta;
    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem-inputEl']")
    private WebElementFacade txtNumCuenta;
    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem_Button']")
    private WebElementFacade btnBuscarCuenta;

    // Objetos menu Poliza
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElementFacade mnuPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_PolicyRetrievalItem-inputEl']")
    private WebElementFacade mnuNumPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_NewSubmission-itemEl']")
    private WebElementFacade mnuItemNuevoEnvio;

    // Objetos menu Contacto
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    private WebElementFacade mnuContact;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact-arrowEl']")
    private WebElementFacade mnuItemNuevoContacto;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewCompany']")
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

    public Navegacion(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Summary']/div/span")
    WebElementFacade mnuResumenCuenta;

    // Navegacion menu Escritorio
    public MisActividadesPage irAMisActividades() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(itemMisActividades).release(itemMisActividades).click().build().perform();
        return new MisActividadesPage(getDriver());
    }

    public MisCuentasPage irAMisCuentas() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemMisCuentas).release(mnuItemMisCuentas).click().build().perform();
        return new MisCuentasPage(getDriver());
    }

    public PolizaBuscarPage irABuscarPoliza(String numPoliza) {
        gw.deployMenu(mnuPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        mnuNumPoliza.typeAndEnter(numPoliza);
        return new PolizaBuscarPage(getDriver());
    }

    public MisEnviosPage irAMisEnvios() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemMisEnvios).release(mnuItemMisEnvios).click().build().perform();
        return new MisEnviosPage(getDriver());
    }

    public MisRenovacionesPage irAMisRenovaciones() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemMisRenovaciones).release(mnuItemMisRenovaciones).click().build().perform();
        return new MisRenovacionesPage(getDriver());
    }

    public MisOtrasTransacPage irAMisOtrasTransacciones() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemMisOtrasTrans).release(mnuItemMisOtrasTrans).click().build().perform();
        return new MisOtrasTransacPage(getDriver());
    }

    public MisColasPage irAMisColas() {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemMisColas).release(mnuItemMisColas).click().build().perform();
        return new MisColasPage(getDriver());
    }

    // Navegacion menu Cuenta
    public NuevaCuentaPage irANuevaCuenta() {
        gw.deployMenu(mnuCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemNuevaCuenta).release(mnuItemNuevaCuenta).click().build().perform();
        return new NuevaCuentaPage(getDriver());
    }

    public CuentaBuscarPage irACuentaBuscar(String numCuenta) {
        waitFor(mnuCuenta);
        gw.deployMenu(mnuCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(txtNumCuenta).release(txtNumCuenta).click().build().perform();
        waitABit(2000);
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(numCuenta);
        waitABit(2000);
        btnBuscarCuenta.waitUntilEnabled();
        btnBuscarCuenta.click();
        waitABit(2000);
        return new CuentaBuscarPage(getDriver());
    }

    // Navegacion menu Poliza
    public NuevoEnvioPage irANuevoEnvio() {
        gw.deployMenu(mnuPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemNuevoEnvio).release(mnuItemNuevoEnvio).click().build().perform();
        return new NuevoEnvioPage(getDriver());
    }

    // Navegacion menu Poliza


    // Navegacion menu Contacto
    public NuevaCompaniaPage irANuevaCompania() {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(500);
        act.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemNuevaCompania).release(mnuItemNuevaCompania).click().build().perform();
        return new NuevaCompaniaPage(getDriver());
    }

    public NuevaPersonaPage irANuevaPersona() {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        waitABit(500);
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemNuevaPersona).release(mnuItemNuevaPersona).click().build().perform();
        return new NuevaPersonaPage(getDriver());
    }

    public BuscarContactoPage irABuscarContacto() {
        gw.deployMenu(mnuContact);
        waitABit(1000);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemContactoBusqueda).release(mnuItemContactoBusqueda).click().build().perform();
        return new BuscarContactoPage(getDriver());
    }

    public BuscarPolizasPage irABuscarPolizas() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemBuscarPoliza).release(mnuItemBuscarPoliza).click().build().perform();
        return new BuscarPolizasPage(getDriver());
    }

    public BuscarCuentasPage irABuscarCuentas() {
        gw.deployMenu(mnuBuscar);
        waitABit(1000);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemBuscarCuenta).release(mnuItemBuscarCuenta).click().build().perform();
        return new BuscarCuentasPage(getDriver());
    }

    public BuscarCodAgentePage irABuscarCodAgente() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemBuscarCodAgente).release(mnuItemBuscarCodAgente).click().build().perform();
        return new BuscarCodAgentePage(getDriver());
    }

    public BuscarActividadesPage irABuscarActividades() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemBuscarAct).release(mnuItemBuscarAct).click().build().perform();
        return new BuscarActividadesPage(getDriver());
    }

    public BuscarContactosPage irABuscarContactos() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemBusquedaContacto).release(mnuItemBusquedaContacto).click().build().perform();
        return new BuscarContactosPage(getDriver());
    }

    // Navegacion menu Equipo
    public EquipoPage irAEquipo() {
        gw.deployMenu(mnuEquipo);
        act.moveToElement(mnuEquipo).release(mnuEquipo).click().build().perform();
        return new EquipoPage(getDriver());
    }

    // Navegacion menu Administracion
    public AdminUsuariosPage irAAdminUsuarios() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemUsuario).release(mnuItemUsuario).click().build().perform();
        return new AdminUsuariosPage(getDriver());
    }

    public AdminGruposPage irAAdminGrupos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemGrupos).release(mnuItemGrupos).click().build().perform();
        return new AdminGruposPage(getDriver());
    }

    public AdminRolesPage irAAdminRoles() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRoles).release(mnuItemRoles).click().build().perform();
        return new AdminRolesPage(getDriver());
    }

    public AdminRegionesPage irAAdminRegiones() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRegiones).release(mnuItemRegiones).click().build().perform();
        return new AdminRegionesPage(getDriver());
    }

    public AdminOrganizacionesPage irAAdminOrganizaciones() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemOrganizaciones).release(mnuItemOrganizaciones).click().build().perform();
        return new AdminOrganizacionesPage(getDriver());
    }

    public AdminCodAgentesPage irAAdminCodAgentes() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemCodAgente).release(mnuItemCodAgente).click().build().perform();
        return new AdminCodAgentesPage(getDriver());
    }

    public AdminPerfilAutoridadPage irAAdminPerfilAutoridad() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPerAutoridad).release(mnuItemPerAutoridad).click().build().perform();
        return new AdminPerfilAutoridadPage(getDriver());
    }

    public AdminAtributosPage irAAdminAtributos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemAtributos).release(mnuItemAtributos).click().build().perform();
        return new AdminAtributosPage(getDriver());
    }

    public AdminGruposAfinidadPage irAAdminGruposAfinidad() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemGruposAfinidad).release(mnuItemGruposAfinidad).click().build().perform();
        return new AdminGruposAfinidadPage(getDriver());
    }

    public AdminPatronesActividadPage irAAdminPatronesActividad() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPatronesActividad).release(mnuItemPatronesActividad).click().build().perform();
        return new AdminPatronesActividadPage(getDriver());
    }

    public AdminDiasFestivosPage irAAdminDiasFestivos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemDiasFestivos).release(mnuItemDiasFestivos).click().build().perform();
        return new AdminDiasFestivosPage(getDriver());
    }

    public AdminPatronesFormPolizaPage irAAdminPatronesFormPoliza() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPatronesFormularioPoliza).release(mnuItemPatronesFormularioPoliza).click().build().perform();
        return new AdminPatronesFormPolizaPage(getDriver());
    }

    public AdminRetencionPolizasPage irAAdminRetencionPolizas() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRetenciionesPolizas).release(mnuItemRetenciionesPolizas).click().build().perform();
        return new AdminRetencionPolizasPage(getDriver());
    }

    public AdminMensajesPage irAAdminMensajes() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemMensajes).release(mnuItemMensajes).click().build().perform();
        return new AdminMensajesPage(getDriver());
    }

    public AdminColasMensajesPage irAAdminColasMensajes() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemColasMensajes).release(mnuItemColasMensajes).click().build().perform();
        return new AdminColasMensajesPage(getDriver());
    }

    public AdminFlujosTrabajoPage irAAdminFlujosTrabajo() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemFlujosTrabajo).release(mnuItemFlujosTrabajo).click().build().perform();
        return new AdminFlujosTrabajoPage(getDriver());
    }

    public AdminEstadistFlujoTrabajoPage irAAdminEstadistFlujoTrabajo() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemEstadisticaFlujos).release(mnuItemEstadisticaFlujos).click().build().perform();
        return new AdminEstadistFlujoTrabajoPage(getDriver());
    }

    public AdminImportarDatosPage irAAdminImportarDatos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemImportDatos).release(mnuItemImportDatos).click().build().perform();
        return new AdminImportarDatosPage(getDriver());
    }

    public AdminExportarDatosPage irAAdminExportarDatos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemExportDatos).release(mnuItemExportDatos).click().build().perform();
        return new AdminExportarDatosPage(getDriver());
    }

    public AdminParamSecuenciaPage irAAdminParamSecuencia() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemParametrosSecuencia).release(mnuItemParametrosSecuencia).click().build().perform();
        return new AdminParamSecuenciaPage(getDriver());
    }

    public AdminFormatoExportaPage irAAdminFormatoExporta() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemFormatoExpHojasCalculo).release(mnuItemFormatoExpHojasCalculo).click().build().perform();
        return new AdminFormatoExportaPage(getDriver());
    }

    public AdminCambioDatosPage irAAdminCambioDatos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemCambioDatos).release(mnuItemCambioDatos).click().build().perform();
        return new AdminCambioDatosPage(getDriver());
    }

    // Navegacion menu Acciones Escritorio
    public EscritorioNuevoEnvioPage irAEscritorioNuevoEnvio() {
        menuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionNuevoEnvio).release(mnuAccionNuevoEnvio).click().build().perform();
        return new EscritorioNuevoEnvioPage(getDriver());
    }

    public EscritorioNuevaCuentaPage irAEscritorioNuevaCuenta() {
        menuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionNuevaCuenta).release(mnuAccionNuevaCuenta).click().build().perform();
        return new EscritorioNuevaCuentaPage(getDriver());
    }

    // Navegacion menu Acciones Cuenta
    public CuentaNuevaNotaPage irACuentaNuevaNota() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionNuevaNota).release(mnuAccionNuevaNota).click().build().perform();
        return new CuentaNuevaNotaPage(getDriver());
    }

    public CuentaLigaDocExistePage irACuentaLigaDocExiste() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionDocNuevos).release(mnuAccionDocNuevos).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionLigarDocExistente).release(mnuAccionLigarDocExistente).click().build().perform();
        return new CuentaLigaDocExistePage(getDriver());
    }

    public CuentaCreaDocNuevaPlantPage irACuentaCreaDocNuevaPlant() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionDocNuevos).release(mnuAccionDocNuevos).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCrearDocPlantilla).release(mnuAccionCrearDocPlantilla).click().build().perform();
        return new CuentaCreaDocNuevaPlantPage(getDriver());
    }

    public CuentaNuevoCorreoElecPage irACuentaNuevoCorreoElect() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionNuevoCorreo).release(mnuAccionNuevoCorreo).click().build().perform();
        return new CuentaNuevoCorreoElecPage(getDriver());
    }

    public CuentaNuevoEnvioPage irACuentaNuevoEnvioCuenta() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionNuevoEnvio2).release(mnuAccionNuevoEnvio2).click().build().perform();
        return new CuentaNuevoEnvioPage(getDriver());
    }

    public CuentaRevisaNuevoCorreoPage irACuentaRevisaNuevoCorreo() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionCorreoNuevo).release(mnuAccionCorreoNuevo).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarNuevoCorreo).release(mnuAccionRevisarNuevoCorreo).click().build().perform();
        return new CuentaRevisaNuevoCorreoPage(getDriver());
    }

    public CuentaReuneAgentePage irACuentaReuneAgente() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionEntrevista).release(mnuAccionEntrevista).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReunirseAgenteAgencia).release(mnuAccionReunirseAgenteAgencia).click().build().perform();
        return new CuentaReuneAgentePage(getDriver());
    }

    public CuentaReuneAseguradoPage irACuentaReuneAsegurado() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionEntrevista).release(mnuAccionEntrevista).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReunirseAsegurado).release(mnuAccionReunirseAsegurado).click().build().perform();
        return new CuentaReuneAseguradoPage(getDriver());
    }

    public CuentaCancelaPolizDividPage irACuentaCancelaPolizDivid() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCancelPolizaDividida).release(mnuAccionCancelPolizaDividida).click().build().perform();
        return new CuentaCancelaPolizDividPage(getDriver());
    }

    public CuentaCotizaRequeridaPage irACuentaCotizaRequerida() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizacionReq).release(mnuAccionCotizacionReq).click().build().perform();
        return new CuentaCotizaRequeridaPage(getDriver());
    }

    public CuentaDiarioX30Page irACuentaDiarioX30() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX30).release(mnuAccionDiarioX30).click().build().perform();
        return new CuentaDiarioX30Page(getDriver());
    }

    public CuentaDiarioX60Page irACuentaDiarioX60() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX60).release(mnuAccionDiarioX60).click().build().perform();
        return new CuentaDiarioX60Page(getDriver());
    }

    public CuentaDiarioX90Page irACuentaDiarioX90() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX90).release(mnuAccionDiarioX90).click().build().perform();
        return new CuentaDiarioX90Page(getDriver());
    }

    public CuentaNotificaPolizaPage irACuentaNotificaPoliza() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionNotificacionPoliza).release(mnuAccionNotificacionPoliza).click().build().perform();
        return new CuentaNotificaPolizaPage(getDriver());
    }

    public CuentaRecuerdaGeneralPage irAEscritorioRecuerdaGeneral() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioGeneral).release(mnuAccionRecordatorioGeneral).click().build().perform();
        return new CuentaRecuerdaGeneralPage(getDriver());
    }

    public CuentaRevisaAgentePage irACuentaRevisaAgente() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarAgente).release(mnuAccionRevisarAgente).click().build().perform();
        return new CuentaRevisaAgentePage(getDriver());
    }

    public CuentaRevPer30DiaAseguraPage irACuentaRevPer30DiaAsegura() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX30).release(mnuAccionRevisarX30).click().build().perform();
        return new CuentaRevPer30DiaAseguraPage(getDriver());
    }

    public CuentaRevPer45DiaAseguraPage irACuentaRevPer45DiaAsegura() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX45).release(mnuAccionRevisarX45).click().build().perform();
        return new CuentaRevPer45DiaAseguraPage(getDriver());
    }

    public CuentaRevPer60DiaAseguraPage irACuentaRevPer60DiaAsegura() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX60).release(mnuAccionRevisarX60).click().build().perform();
        return new CuentaRevPer60DiaAseguraPage(getDriver());
    }

    public CuentaRevisaRendimPage irACuentaRevisaRendim() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarRendimiento).release(mnuAccionRevisarRendimiento).click().build().perform();
        return new CuentaRevisaRendimPage(getDriver());
    }

    public CuentaVerificaCoberPage irACuentaVerificaCober() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionVerificarCobertura).release(mnuAccionVerificarCobertura).click().build().perform();
        return new CuentaVerificaCoberPage(getDriver());
    }

    public CuentaTransPoliACuentaPage irACuentaTransPoliACuenta() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionTransferirPolizas).release(mnuAccionTransferirPolizas).click().build().perform();
        return new CuentaTransPoliACuentaPage(getDriver());
    }

    public CuentaReescrPoliACuentaPage irACuentaReescrPoliACuenta() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionReescribirPolizas).release(mnuAccionReescribirPolizas).click().build().perform();
        return new CuentaReescrPoliACuentaPage(getDriver());
    }

    public CuentaCombPoliACuentaPage irACuentaCombPoliACuenta() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionCombinarCuentas).release(mnuAccionCombinarCuentas).click().build().perform();
        return new CuentaCombPoliACuentaPage(getDriver());
    }

    public CuentaCreaAgenteNuevPage irACuentaCreaAgenteNuev() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAgenteNuevo).release(mnuAccionAgenteNuevo).click().build().perform();
        return new CuentaCreaAgenteNuevPage(getDriver());
    }

    public CuentaObtAudPersoInterPage irACuentaObtAudPersoInter() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAuditoriaInterno).release(mnuAccionAuditoriaInterno).click().build().perform();
        return new CuentaObtAudPersoInterPage(getDriver());
    }

    public CuentaObtAudServExterPage irACuentaObtAudServExter() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAuditoriaExterna).release(mnuAccionAuditoriaExterna).click().build().perform();
        return new CuentaObtAudServExterPage(getDriver());
    }

    public CuentaObtCotizReaseguroPage irACuentaObtCotizReaseguro() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizacionReaseguro).release(mnuAccionCotizacionReaseguro).click().build().perform();
        return new CuentaObtCotizReaseguroPage(getDriver());
    }

    public CuentaObtDatoOficPage irACuentaObtDatoOfic() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDatosOf).release(mnuAccionDatosOf).click().build().perform();
        return new CuentaObtDatoOficPage(getDriver());
    }

    public CuentaObtInfoVehiMotoPage irACuentaObtInfoVehiMoto() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInformesMotorizado).release(mnuAccionInformesMotorizado).click().build().perform();
        return new CuentaObtInfoVehiMotoPage(getDriver());
    }

    public CuentaObtInspContSiniesPage irACuentaObtInspContSinies() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInspeccionSiniestro).release(mnuAccionInspeccionSiniestro).click().build().perform();
        return new CuentaObtInspContSiniesPage(getDriver());
    }

    public CuentaObtInspServExterPage irACuentaObtInspServExter() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInspeccionExterno).release(mnuAccionInspeccionExterno).click().build().perform();
        return new CuentaObtInspServExterPage(getDriver());
    }

    public CuentaObtReporCredPage irACuentaObtReporCred() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReportesCredito).release(mnuAccionReportesCredito).click().build().perform();
        return new CuentaObtReporCredPage(getDriver());
    }

    public CuentaRevisionLegalPage irACuentaRevisionLegal() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisionLegal).release(mnuAccionRevisionLegal).click().build().perform();
        return new CuentaRevisionLegalPage(getDriver());
    }

    public CuentaObtInfRiesAgenPage irACuentaObtInfRiesAgen() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInfoAgente).release(mnuAccionInfoAgente).click().build().perform();
        return new CuentaObtInfRiesAgenPage(getDriver());
    }

    public CuentaTazaCotPoliManuPage irCuentaTazaCotPoliManu() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizarManual).release(mnuAccionCotizarManual).click().build().perform();
        return new CuentaTazaCotPoliManuPage(getDriver());
    }

    // Navegacion menu Acciones Contacto
    public ContactoNuevaCuentaPage irAContactoNuevaCuenta() {
        mnuContact.click();
        gw.deployMenu(mnuAccionesContacto);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionNuevaCuentaC).release(mnuAccionNuevaCuentaC).click().build().perform();
        return new ContactoNuevaCuentaPage(getDriver());
    }

    // Navegacion menu Acciones Administracion
    public AdminUsuarioNuevoPage irAAdminUsuarioNuevo() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionUsuarioNuevo).release(mnuAccionUsuarioNuevo).click().build().perform();
        return new AdminUsuarioNuevoPage(getDriver());
    }

    public AdminGrupoNuevoPage irAAdminGrupoNuevo() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionGrupoNuevo).release(mnuAccionGrupoNuevo).click().build().perform();
        return new AdminGrupoNuevoPage(getDriver());
    }

    public AdminOrganizacionNuevaPage irAAdminOrganizacionNueva() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionOrganizacionNueva).release(mnuAccionOrganizacionNueva).click().build().perform();
        return new AdminOrganizacionNuevaPage(getDriver());
    }

    public AdminCodAgenteNuevoPage irAAdminCodAgenteNuevo() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionCodAgenteNuevo).release(mnuAccionCodAgenteNuevo).click().build().perform();
        return new AdminCodAgenteNuevoPage(getDriver());
    }

    public AdminNuevoGrupoAfinidadPage irAAdminNuevoGrupoAfinidad() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionNuevoGrupoAfiinidad).release(mnuAccionNuevoGrupoAfiinidad).click().build().perform();
        return new AdminNuevoGrupoAfinidadPage(getDriver());
    }

    public AdminVerificarErrorPatronPage irAAdminVerificarErrorPatron() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        act.moveToElement(mnuAccionVerificarErroresPatron).release(mnuAccionVerificarErroresPatron).click().build().perform();
        return new AdminVerificarErrorPatronPage(getDriver());
    }

    public OpcionesCrearPartcCuentaPage irAOpcionesCrearPartcCuenta() {
        mnuCuenta.click();
        waitABit(800);
        mnuOpcionesCuenta.click();
        return new OpcionesCrearPartcCuentaPage(getDriver());
    }

    public OpcionesResumenCuentaPage irAOpcionesResumenCuenta() {
        mnuResumenCuenta.click();
        waitABit(800);
        return new OpcionesResumenCuentaPage(getDriver());
    }
}
