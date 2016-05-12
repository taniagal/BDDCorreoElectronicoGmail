package com.sura.policycenter.selenium.pages;
import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.menu.acciones.*;
import com.sura.policycenter.selenium.pages.menu.tabbar.*;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

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


















































































































































































































































































































































































































































































































    /*-----------------------------------------------------------------------------*/

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

    public EscritorioNuevaNotaPage irAEscritorioNuevaNota() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevaNota).release(mnuAccionNuevaNota).click().build().perform();
        return new EscritorioNuevaNotaPage(getDriver());
    }

    public EscritorioLigaDocExistePage irAEscritorioLigaDocExiste() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionDocNuevos).release(mnuAccionDocNuevos).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionLigarDocExistente).release(mnuAccionLigarDocExistente).click().build().perform();
        return new EscritorioLigaDocExistePage(getDriver());
    }


    public EscritorioCreaDocNuevaPlantPage irACreaDocNuevaPlantPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionDocNuevos).release(mnuAccionDocNuevos).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCrearDocPlantilla).release(mnuAccionCrearDocPlantilla).click().build().perform();
        return new EscritorioCreaDocNuevaPlantPage(getDriver());
    }

    public EscritorioNuevoCorreoElecPage irAEscritorioNuevoCorreoElect() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevoCorreo).release(mnuAccionNuevoCorreo).click().build().perform();
        return new EscritorioNuevoCorreoElecPage(getDriver());
    }

    public EscritorioNuevoEnvioCuentaPage irAEscritorioNuevoEnvioCuentaPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevoEnvio2).release(mnuAccionNuevoEnvio2).click().build().perform();
        return new EscritorioNuevoEnvioCuentaPage(getDriver());

    }

    public EscritorioRevisaNuevoCorreoPage irAEscritorioRevisaNuevoCorreoPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCorreoNuevo).release(mnuAccionCorreoNuevo).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarNuevoCorreo).release(mnuAccionRevisarNuevoCorreo).click().build().perform();
        return new EscritorioRevisaNuevoCorreoPage(getDriver());
    }

    public EscritorioReuneAgentePage irAEscritorioReuneAgentePage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionEntrevista).release(mnuAccionEntrevista).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReunirseAgenteAgencia).release(mnuAccionReunirseAgenteAgencia).click().build().perform();
        return new EscritorioReuneAgentePage(getDriver());
    }

    public EscritorioReuneAseguradoPage irAEscritorioReuneAseguradoPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionEntrevista).release(mnuAccionEntrevista).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionReunirseAsegurado).release(mnuAccionReunirseAsegurado).click().build().perform();
        return new EscritorioReuneAseguradoPage(getDriver());

    }

    public EscritorioCancelaPolizDividPage irAEscritorioCancelaPolizDividPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCancelPolizaDividida).release(mnuAccionCancelPolizaDividida).click().build().perform();
        return new EscritorioCancelaPolizDividPage(getDriver());
    }

    public EscritorioCotizaRequeridaPage irAEscritorioCotizaRequeridaPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionCotizacionReq).release(mnuAccionCotizacionReq).click().build().perform();
        return new EscritorioCotizaRequeridaPage(getDriver());
    }

    public EscritorioDiarioX30Page irAEscritorioDiarioX30Page() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX30).release(mnuAccionDiarioX30).click().build().perform();
        return new EscritorioDiarioX30Page(getDriver());
    }

    public EscritorioDiarioX60Page irAEscritorioDiarioX60Page() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX60).release(mnuAccionDiarioX60).click().build().perform();
        return new EscritorioDiarioX60Page(getDriver());
    }

    public EscritorioDiarioX90Page irAEscritorioDiarioX90Page() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionDiarioX90).release(mnuAccionDiarioX90).click().build().perform();
        return new EscritorioDiarioX90Page(getDriver());
    }

    public EscritorioNotificaPolizaPage irAEscritorioNotificaPolizaPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionNotificacionPoliza).release(mnuAccionNotificacionPoliza).click().build().perform();
        return new EscritorioNotificaPolizaPage(getDriver());
    }

    public EscritorioRecuerdaGeneralPage irAEscritorioRecuerdaGeneralPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorioGeneral).release(mnuAccionRecordatorioGeneral).click().build().perform();
        return new EscritorioRecuerdaGeneralPage(getDriver());
    }

    public EscritorioRevisaAgentePage irAEscritorioRevisaAgentePage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarAgente).release(mnuAccionRevisarAgente).click().build().perform();
        return new EscritorioRevisaAgentePage(getDriver());
    }

    public EscritorioRevPer30DiaAseguraPage irAEscritorioRevPer30DiaAseguraPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX30).release(mnuAccionRevisarX30).click().build().perform();
        return new EscritorioRevPer30DiaAseguraPage(getDriver());
    }

    public EscritorioRevPer45DiaAseguraPage irAEscritorioRevPer45DiaAseguraPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX45).release(mnuAccionRevisarX45).click().build().perform();
        return new EscritorioRevPer45DiaAseguraPage(getDriver());
    }

    public EscritorioRevPer60DiaAseguraPage irAEscritorioRevPer60DiaAseguraPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarX60).release(mnuAccionRevisarX60).click().build().perform();
        return new EscritorioRevPer60DiaAseguraPage(getDriver());
    }

    public EscritorioRevisaRendimPage irAEscritorioRevisaRendimPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRevisarRendimiento).release(mnuAccionRevisarRendimiento).click().build().perform();
        return new EscritorioRevisaRendimPage(getDriver());
    }

    public EscritorioVerificaCoberPage irAEscritorioVerificaCoberPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionActNueva).release(mnuAccionActNueva).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionRecordatorio).release(mnuAccionRecordatorio).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuAccionVerificarCobertura).release(mnuAccionVerificarCobertura).click().build().perform();
        return new EscritorioVerificaCoberPage(getDriver());
    }

    public EscritorioTransPoliACuentaPage irAEscritorioTransPoliACuentaPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionTransferirPolizas).release(mnuAccionTransferirPolizas).click().build().perform();
        return new EscritorioTransPoliACuentaPage(getDriver());
    }

    public EscritorioReescrPoliACuentaPage irAEscritorioReescrPoliACuentaPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionReescribirPolizas).release(mnuAccionReescribirPolizas).click().build().perform();
        return new EscritorioReescrPoliACuentaPage(getDriver());
    }

    public EscritorioConvPoliACuentaPage irAEscritorioConvPoliACuentaPage() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionCombinarCuentas).release(mnuAccionCombinarCuentas).click().build().perform();
        return new EscritorioConvPoliACuentaPage(getDriver());
    }
}
