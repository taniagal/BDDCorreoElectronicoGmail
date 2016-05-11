package com.sura.policycenter.selenium.pages;
import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.menu.acciones.EscritorioNuevaCuentaPage;
import com.sura.policycenter.selenium.pages.menu.acciones.EscritorioNuevoEnvioPage;
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

    public MisActividadesPage irAMisActividades()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemMisActividades).release(itemMisActividades).click().build().perform();
        return new MisActividadesPage(getDriver());
    }

    public MisCuentasPage irAMisCuentas()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisCuentas).release(mnuItemMisCuentas).click().build().perform();
        return new MisCuentasPage(getDriver());
    }

    public MisEnviosPage irAMisEnvios()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisEnvios).release(mnuItemMisEnvios).click().build().perform();
        return new MisEnviosPage(getDriver());
    }

    public MisRenovacionesPage irAMisRenovaciones()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisRenovaciones).release(mnuItemMisRenovaciones).click().build().perform();
        return new MisRenovacionesPage(getDriver());
    }

    public MisOtrasTransacPage irAMisOtrasTransacciones()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisOtrasTrans).release(mnuItemMisOtrasTrans).click().build().perform();
        return new MisOtrasTransacPage(getDriver());
    }

    public MisColasPage irAMisColas()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisColas).release(mnuItemMisColas).click().build().perform();
        return new MisColasPage(getDriver());
    }

    public NuevaCuentaPage irANuevaCuenta()  {
        gw.deployMenu(mnuCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevaCuenta).release(mnuItemNuevaCuenta).click().build().perform();
        return new NuevaCuentaPage(getDriver());
    }

    public NuevoEnvioPage irANuevoEnvio()  {
        gw.deployMenu(mnuPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoEnvio).release(mnuItemNuevoEnvio).click().build().perform();
        return new NuevoEnvioPage(getDriver());
    }

    public NuevaCompaniaPage irANuevaCompania()  {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemNuevaCompania).release(mnuItemNuevaCompania).click().build().perform();
        return new NuevaCompaniaPage(getDriver());
    }

    public NuevaPersonaPage irANuevaPersona()  {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemNuevaPersona).release(mnuItemNuevaPersona).click().build().perform();
        return new NuevaPersonaPage(getDriver());
    }

    public BuscarContactoPage irABuscarContacto()  {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemContactoBusqueda).release(mnuItemContactoBusqueda).click().build().perform();
        return new BuscarContactoPage(getDriver());
    }

    public BuscarPolizasPage irABuscarPolizas()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarPoliza).release(mnuItemBuscarPoliza).click().build().perform();
        return new BuscarPolizasPage(getDriver());
    }

    public BuscarCuentasPage irABuscarCuentas()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarCuenta).release(mnuItemBuscarCuenta).click().build().perform();
        return new BuscarCuentasPage(getDriver());
    }

    public BuscarCodAgentePage irABuscarCodAgente()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarCodAgente).release(mnuItemBuscarCodAgente).click().build().perform();
        return new BuscarCodAgentePage(getDriver());
    }

    public BuscarActividadesPage irABuscarActividades()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarAct).release(mnuItemBuscarAct).click().build().perform();
        return new BuscarActividadesPage(getDriver());
    }

    public BuscarContactosPage irABuscarContactos()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBusquedaContacto).release(mnuItemBusquedaContacto).click().build().perform();
        return new BuscarContactosPage(getDriver());
    }

    public EquipoPage irAEquipo()  {
        gw.deployMenu(mnuEquipo);
        act.moveToElement(mnuEquipo).release(mnuEquipo).click().build().perform();
        return new EquipoPage(getDriver());
    }

    public AdminUsuariosPage irAAdminUsuarios()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemUsuario).release(mnuItemUsuario).click().build().perform();
        return new AdminUsuariosPage(getDriver());
    }

    public AdminGruposPage irAAdminGrupos()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemGrupos).release(mnuItemGrupos).click().build().perform();
        return new AdminGruposPage(getDriver());
    }

    public AdminRolesPage irAAdminRoles()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRoles).release(mnuItemRoles).click().build().perform();
        return new AdminRolesPage(getDriver());
    }

    public AdminRegionesPage irAAdminRegiones()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRegiones).release(mnuItemRegiones).click().build().perform();
        return new AdminRegionesPage(getDriver());
    }

    public AdminOrganizacionesPage irAAdminOrganizaciones()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemOrganizaciones).release(mnuItemOrganizaciones).click().build().perform();
        return new AdminOrganizacionesPage(getDriver());
    }

    public AdminCodAgentesPage irAAdminCodAgentes()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemCodAgente).release(mnuItemCodAgente).click().build().perform();
        return new AdminCodAgentesPage(getDriver());
    }

    public AdminPerfilAutoridadPage irAAdminPerfilAutoridad()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPerAutoridad).release(mnuItemPerAutoridad).click().build().perform();
        return new AdminPerfilAutoridadPage(getDriver());
    }

    public AdminAtributosPage irAAdminAtributos()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemAtributos).release(mnuItemAtributos).click().build().perform();
        return new AdminAtributosPage(getDriver());
    }

    public AdminGruposAfinidadPage irAAdminGruposAfinidad()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuarioSeguridad).release(mnuItemUsuarioSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemGruposAfinidad).release(mnuItemGruposAfinidad).click().build().perform();
        return new AdminGruposAfinidadPage(getDriver());
    }

    public AdminPatronesActividadPage irAAdminPatronesActividad()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPatronesActividad).release(mnuItemPatronesActividad).click().build().perform();
        return new AdminPatronesActividadPage(getDriver());
    }

    public AdminDiasFestivosPage irAAdminDiasFestivos()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemDiasFestivos).release(mnuItemDiasFestivos).click().build().perform();
        return new AdminDiasFestivosPage(getDriver());
    }

    public AdminPatronesFormPolizaPage irAAdminPatronesFormPoliza()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPatronesFormularioPoliza).release(mnuItemPatronesFormularioPoliza).click().build().perform();
        return new AdminPatronesFormPolizaPage(getDriver());
    }

    public AdminRetencionPolizasPage irAAdminRetencionPolizas()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRetenciionesPolizas).release(mnuItemRetenciionesPolizas).click().build().perform();
        return new AdminRetencionPolizasPage(getDriver());
    }

    public AdminMensajesPage irAAdminMensajes()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemMensajes).release(mnuItemMensajes).click().build().perform();
        return new AdminMensajesPage(getDriver());
    }

    public AdminColasMensajesPage irAAdminColasMensajes()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemColasMensajes).release(mnuItemColasMensajes).click().build().perform();
        return new AdminColasMensajesPage(getDriver());
    }

    public AdminFlujosTrabajoPage irAAdminFlujosTrabajo()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemFlujosTrabajo).release(mnuItemFlujosTrabajo).click().build().perform();
        return new AdminFlujosTrabajoPage(getDriver());
    }

    public AdminEstadistFlujoTrabajoPage irAAdminEstadistFlujoTrabajo()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemEstadisticaFlujos).release(mnuItemEstadisticaFlujos).click().build().perform();
        return new AdminEstadistFlujoTrabajoPage(getDriver());
    }

    public AdminImportarDatosPage irAAdminImportarDatos()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemImportDatos).release(mnuItemImportDatos).click().build().perform();
        return new AdminImportarDatosPage(getDriver());
    }

    public AdminExportarDatosPage irAAdminExportarDatos()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemExportDatos).release(mnuItemExportDatos).click().build().perform();
        return new AdminExportarDatosPage(getDriver());
    }

    public AdminParamSecuenciaPage irAAdminParamSecuencia()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemParametrosSecuencia).release(mnuItemParametrosSecuencia).click().build().perform();
        return new AdminParamSecuenciaPage(getDriver());
    }

    public AdminFormatoExportaPage irAAdminFormatoExporta()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemFormatoExpHojasCalculo).release(mnuItemFormatoExpHojasCalculo).click().build().perform();
        return new AdminFormatoExportaPage(getDriver());
    }

    public AdminCambioDatosPage irAAdminCambioDatos()  {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemCambioDatos).release(mnuItemCambioDatos).click().build().perform();
        return new AdminCambioDatosPage(getDriver());
    }

    public EscritorioNuevoEnvioPage irAEscritorioNuevoEnvio()  {
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevoEnvio).release(mnuAccionNuevoEnvio).click().build().perform();
        return new EscritorioNuevoEnvioPage(getDriver());
    }

    public EscritorioNuevaCuentaPage irAEscritorioNuevaCuenta()  {
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuAccionNuevaCuenta).release(mnuAccionNuevaCuenta).click().build().perform();
        return new EscritorioNuevaCuentaPage(getDriver());
    }


}
