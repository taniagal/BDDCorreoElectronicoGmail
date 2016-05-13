package com.sura.policycenter.selenium.pages.menu;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.menu.acciones.administracion.*;
import com.sura.policycenter.selenium.pages.menu.acciones.contacto.ContactoNuevaCuentaPage;
import com.sura.policycenter.selenium.pages.menu.acciones.cuenta.*;
import com.sura.policycenter.selenium.pages.menu.acciones.escritorio.EscritorioNuevaCuentaPage;
import com.sura.policycenter.selenium.pages.menu.acciones.escritorio.EscritorioNuevoEnvioPage;
import com.sura.policycenter.selenium.pages.menu.superior.administracion.*;
import com.sura.policycenter.selenium.pages.menu.superior.buscar.*;
import com.sura.policycenter.selenium.pages.menu.superior.contacto.BuscarContactoPage;
import com.sura.policycenter.selenium.pages.menu.superior.cuenta.NuevaCuentaPage;
import com.sura.policycenter.selenium.pages.menu.superior.contacto.NuevaCompaniaPage;
import com.sura.policycenter.selenium.pages.menu.superior.contacto.NuevaPersonaPage;
import com.sura.policycenter.selenium.pages.menu.superior.equipo.EquipoPage;
import com.sura.policycenter.selenium.pages.menu.superior.escritorio.*;
import com.sura.policycenter.selenium.pages.menu.superior.poliza.NuevoEnvioPage;
import com.sura.policycenter.selenium.pages.menu.superior.poliza.PolizaBuscarPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jonamele on 06/05/2016.
 */
public class Navegacion extends Guidewire {

    public Navegacion(WebDriver driver) {
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
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions-btnInnerEl']")
    WebElementFacade mnuAccionesCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewNote-itemEl']")
    WebElementFacade mnuAccionNuevaNota;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument-arrowEl']")
    WebElementFacade mnuAccionDocNuevos;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument:AccountNewDocumentMenuItemSet:AccountNewDocumentMenuItemSet_Linked-itemEl']")
    WebElementFacade mnuAccionLigarDocExistente;
    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument:AccountNewDocumentMenuItemSet:AccountNewDocumentMenuItemSet_Template-textEl']")
    WebElementFacade mnuAccionCrearDocPlantilla;
    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewEmail-itemEl']")
    WebElementFacade mnuAccionNuevoCorreo;
    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-itemEl']")
    WebElementFacade mnuAccionNuevoEnvio2;
    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category:0:item-textEl']")
    WebElementFacade mnuAccionRevisarNuevoCorreo;
    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity-arrowEl']")
    WebElementFacade mnuAccionActNueva;
    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category-arrowEl']")
    WebElementFacade mnuAccionCorreoNuevo;
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
    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_MovePolicies-itemEl']")
    WebElementFacade mnuAccionTransferirPolizas;
    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_RewritePolicies-itemEl']")
    WebElementFacade mnuAccionReescribirPolizas;
    @FindBy (xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_MergeAccounts-textEl']")
    WebElementFacade mnuAccionCombinarCuentas;
    @FindBy (xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_PolicyRetrievalItem-inputEl']")
    WebElementFacade mnuNumPoliza;
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

    public PolizaBuscarPage irABuscarPoliza(String numPoliza) {
        gw.deployMenu(mnuPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        mnuNumPoliza.typeAndEnter(numPoliza);
        return new PolizaBuscarPage(getDriver());
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

    public CuentaNuevaNotaPage irACuentaNuevaNota() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevaNota).release(mnuAccionNuevaNota).click().build().perform();
        return new CuentaNuevaNotaPage(getDriver());
    }

    public CuentaLigaDocExistePage irACuentaLigaDocExiste() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionDocNuevos).release(mnuAccionDocNuevos).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionLigarDocExistente).release(mnuAccionLigarDocExistente).click().build().perform();
        return new CuentaLigaDocExistePage(getDriver());
    }


    public CuentaCreaDocNuevaPlantPage irACuentaCreaDocNuevaPlant() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionDocNuevos).release(mnuAccionDocNuevos).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCrearDocPlantilla).release(mnuAccionCrearDocPlantilla).click().build().perform();
        return new CuentaCreaDocNuevaPlantPage(getDriver());
    }

    public CuentaNuevoCorreoElecPage irACuentaNuevoCorreoElect() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevoCorreo).release(mnuAccionNuevoCorreo).click().build().perform();
        return new CuentaNuevoCorreoElecPage(getDriver());
    }

    public CuentaNuevoEnvioPage irACuentaNuevoEnvioCuenta() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevoEnvio2).release(mnuAccionNuevoEnvio2).click().build().perform();
        return new CuentaNuevoEnvioPage(getDriver());

    }

    public CuentaRevisaNuevoCorreoPage irACuentaRevisaNuevoCorreo() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCorreoNuevo).release(mnuAccionCorreoNuevo).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarNuevoCorreo).release(mnuAccionRevisarNuevoCorreo).click().build().perform();
        return new CuentaRevisaNuevoCorreoPage(getDriver());
    }

    public CuentaReuneAgentePage irACuentaReuneAgente() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionEntrevista).release(mnuAccionEntrevista).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReunirseAgenteAgencia).release(mnuAccionReunirseAgenteAgencia).click().build().perform();
        return new CuentaReuneAgentePage(getDriver());
    }

    public CuentaReuneAseguradoPage irACuentaReuneAsegurado() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionEntrevista).release(mnuAccionEntrevista).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReunirseAsegurado).release(mnuAccionReunirseAsegurado).click().build().perform();
        return new CuentaReuneAseguradoPage(getDriver());

    }

    public CuentaCancelaPolizDividPage irACuentaCancelaPolizDivid() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCancelPolizaDividida).release(mnuAccionCancelPolizaDividida).click().build().perform();
        return new CuentaCancelaPolizDividPage(getDriver());
    }

    public CuentaCotizaRequeridaPage irACuentaCotizaRequerida() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizacionReq).release(mnuAccionCotizacionReq).click().build().perform();
        return new CuentaCotizaRequeridaPage(getDriver());
    }

    public CuentaDiarioX30Page irACuentaDiarioX30() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX30).release(mnuAccionDiarioX30).click().build().perform();
        return new CuentaDiarioX30Page(getDriver());
    }

    public CuentaDiarioX60Page irACuentaDiarioX60() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX60).release(mnuAccionDiarioX60).click().build().perform();
        return new CuentaDiarioX60Page(getDriver());
    }

    public CuentaDiarioX90Page irACuentaDiarioX90() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX90).release(mnuAccionDiarioX90).click().build().perform();
        return new CuentaDiarioX90Page(getDriver());
    }

    public CuentaNotificaPolizaPage irACuentaNotificaPoliza() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionNotificacionPoliza).release(mnuAccionNotificacionPoliza).click().build().perform();
        return new CuentaNotificaPolizaPage(getDriver());
    }

    public CuentaRecuerdaGeneralPage irAEscritorioRecuerdaGeneralPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioGeneral).release(mnuAccionRecordatorioGeneral).click().build().perform();
        return new CuentaRecuerdaGeneralPage(getDriver());
    }

    public CuentaRevisaAgentePage irACuentaRevisaAgente() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarAgente).release(mnuAccionRevisarAgente).click().build().perform();
        return new CuentaRevisaAgentePage(getDriver());
    }

    public CuentaRevPer30DiaAseguraPage irACuentaRevPer30DiaAsegura() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX30).release(mnuAccionRevisarX30).click().build().perform();
        return new CuentaRevPer30DiaAseguraPage(getDriver());
    }

    public CuentaRevPer45DiaAseguraPage irACuentaRevPer45DiaAsegura() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX45).release(mnuAccionRevisarX45).click().build().perform();
        return new CuentaRevPer45DiaAseguraPage(getDriver());
    }

    public CuentaRevPer60DiaAseguraPage irACuentaRevPer60DiaAsegura() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX60).release(mnuAccionRevisarX60).click().build().perform();
        return new CuentaRevPer60DiaAseguraPage(getDriver());
    }

    public CuentaRevisaRendimPage irACuentaRevisaRendim() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarRendimiento).release(mnuAccionRevisarRendimiento).click().build().perform();
        return new CuentaRevisaRendimPage(getDriver());
    }

    public CuentaVerificaCoberPage irACuentaVerificaCober() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionVerificarCobertura).release(mnuAccionVerificarCobertura).click().build().perform();
        return new CuentaVerificaCoberPage(getDriver());
    }

    public CuentaTransPoliACuentaPage irACuentaTransPoliACuenta() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionTransferirPolizas).release(mnuAccionTransferirPolizas).click().build().perform();
        return new CuentaTransPoliACuentaPage(getDriver());
    }

    public CuentaReescrPoliACuentaPage irACuentaReescrPoliACuenta() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionReescribirPolizas).release(mnuAccionReescribirPolizas).click().build().perform();
        return new CuentaReescrPoliACuentaPage(getDriver());
    }

    public CuentaConvPoliACuentaPage irACuentaConvPoliACuenta() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionCombinarCuentas).release(mnuAccionCombinarCuentas).click().build().perform();
        return new CuentaConvPoliACuentaPage(getDriver());
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

    public CuentaCreaAgenteNuevPage irACuentaCreaAgenteNuevPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAgenteNuevo).release(mnuAccionAgenteNuevo).click().build().perform();
        return new CuentaCreaAgenteNuevPage(getDriver());
    }

    public CuentaObtAudPersoInterPage irACuentaObtAudPersoInterPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAuditoriaInterno).release(mnuAccionAuditoriaInterno).click().build().perform();
        return new CuentaObtAudPersoInterPage(getDriver());
    }

    public CuentaObtAudServExterPage irACuentaObtAudServExterPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionAuditoriaExterna).release(mnuAccionAuditoriaExterna).click().build().perform();
        return new CuentaObtAudServExterPage(getDriver());
    }

    public CuentaObtCotizReaseguroPage irACuentaObtCotizReaseguroPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizacionReaseguro).release(mnuAccionCotizacionReaseguro).click().build().perform();
        return new CuentaObtCotizReaseguroPage(getDriver());
    }

    public CuentaObtDatoOficPage irACuentaObtDatoOficPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDatosOf).release(mnuAccionDatosOf).click().build().perform();
        return new CuentaObtDatoOficPage(getDriver());
    }

    public CuentaObtInfoVehiMotoPage irACuentaObtInfoVehiMotoPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInformesMotorizado).release(mnuAccionInformesMotorizado).click().build().perform();
        return new CuentaObtInfoVehiMotoPage(getDriver());
    }

    public CuentaObtInspContSiniesPage irACuentaObtInspContSiniesPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInspeccionSiniestro).release(mnuAccionInspeccionSiniestro).click().build().perform();
        return new CuentaObtInspContSiniesPage(getDriver());
    }

    public CuentaObtInspServExterPage irACuentaObtInspServExterPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInspeccionExterno).release(mnuAccionInspeccionExterno).click().build().perform();
        return new CuentaObtInspServExterPage(getDriver());
    }

    public CuentaObtReporCredPage irACuentaObtReporCredPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReportesCredito).release(mnuAccionReportesCredito).click().build().perform();
        return new CuentaObtReporCredPage(getDriver());
    }

    public CuentaRevisionLegalPage irACuentaRevisionLegalPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisionLegal).release(mnuAccionRevisionLegal).click().build().perform();
        return new CuentaRevisionLegalPage(getDriver());
    }

    public CuentaObtInfRiesAgenPage irACuentaObtInfRiesAgenPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionInfoAgente).release(mnuAccionInfoAgente).click().build().perform();
        return new CuentaObtInfRiesAgenPage(getDriver());
    }

    public CuentaTazaCotPoliManuPage irCuentaTazaCotPoliManuPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionSolicitud).release(mnuAccionSolicitud).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizarManual).release(mnuAccionCotizarManual).click().build().perform();
        return new CuentaTazaCotPoliManuPage(getDriver());
    }
}
