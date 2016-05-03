package com.sura.billing.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jorghome on 22/04/2016.
 */
public class EscritorioPage extends Guidewire {

    Guidewire gw = new Guidewire(getDriver());

    public EscritorioPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='UserSearch:UserSearchScreen:ttlBar']")
    WebElementFacade labelIngreso;

    @FindBy(xpath = ".//*[@id='HolidaysPage:HolidaysScreen:0']")
    WebElementFacade labelIngreso2;

    // Objetos menu tabBar Escritorio
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnWrap']")
    WebElementFacade mnuEscritorio;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopActivities-itemEl']")
    WebElementFacade mnuItemMisActividades;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopApprovals-itemEl']")
    WebElementFacade mnuItemEstadosAprobacion;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopTroubleTickets-itemEl']")
    WebElementFacade mnuItemMisIncidentes;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopDelinquencies-itemEl']")
    WebElementFacade mnuItemMisMoras;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopDisbursements-itemEl']")
    WebElementFacade mnuItemDesembolsos;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopSuspensePayments-itemEl']")
    WebElementFacade mnuItemPagosEnEspera;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopAgencyItems-itemEl']")
    WebElementFacade mnuItemMisElementosAgencia;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopHeldCharges-itemEl']")
    WebElementFacade mnuItemCargosRetenidos;

    // Objetos menu tabBar Cuenta
    @FindBy(xpath = ".//*[@id='TabBar:AccountsTab-btnWrap']")
    WebElementFacade mnuCuenta;

    // Objetos menu tabBar Poliza
    @FindBy(xpath = ".//*[@id='TabBar:PoliciesTab-btnWrap']")
    WebElementFacade mnuPoliza;

    // Objetos menu tabBar Agente
    @FindBy(xpath = ".//*[@id='TabBar:ProducersTab-btnWrap']")
    WebElementFacade mnuAgente;

    // Objetos menu tabBar Buscar
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnWrap']")
    WebElementFacade mnuBuscar;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_AccountSearch-itemEl']")
    WebElementFacade mnuItemCuentas;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_PolicySearch-itemEl']")
    WebElementFacade mnuItemPolizas;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_ContactSearch-itemEl']")
    WebElementFacade mnuItemContactos;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_InvoiceSearch-itemEl']")
    WebElementFacade mnuItemFacturas;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_PaymentSearch-itemEl']")
    WebElementFacade mnuItemPagos;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_ProducerSearch-itemEl']")
    WebElementFacade mnuItemAgentes;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_TransactionSearch-itemEl']")
    WebElementFacade mnuItemTransacciones;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_ActivitySearch-itemEl']")
    WebElementFacade mnuItemActividades;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_TroubleTicketSearch-itemEl']")
    WebElementFacade mnuItemTicketsProblemas;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_DelinquencyProcessSearch-itemEl']")
    WebElementFacade mnuItemProcesosMora;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_DisbursementSearch-itemEl']")
    WebElementFacade mnuItemDesembolsosBuscar;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_OutgoingProducerPaymentSearch-itemEl']")
    WebElementFacade mnuItemPagosSalientesAgente;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_PaymentRequestSearch-itemEl']")
    WebElementFacade mnuItemSolicitudesPago;

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_DirectBillSuspenseItemSearch-itemEl']")
    WebElementFacade mnuItemElementosEsperaFactDirecta;

    // Objetos menu tabBar Administracion
    @FindBy(xpath=".//*[@id='TabBar:AdministrationTab-btnWrap']")
    WebElementFacade mnuAdministracion;

    // Usuarios y Seguridad
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity']")
    WebElementFacade mnuItemUsuariosSeguridad;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_UserSearch-itemEl']")
    WebElementFacade mnuItemUsuarios;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_Groups-itemEl']")
    WebElementFacade mnuItemGrupos;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_Roles-itemEl']")
    WebElementFacade mnuItemFunciones;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_SecurityZones-itemEl']")
    WebElementFacade mnuItemZonasSeguridad;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_AuthorityLimitProfiles-itemEl']")
    WebElementFacade mnuItemPerfilLimiteAut;

    // Configuracion comercial
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings']")
    WebElementFacade mnuItemConfigComercial;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_ActivityPatterns-itemEl']")
    WebElementFacade mnuItemPatronesActividad;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_AgencyBillPlans-itemEl']")
    WebElementFacade mnuItemPlanesFactAgencia;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_BillingPlans-itemEl']")
    WebElementFacade mnuItemPlanesFacturacion;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_ChargePatterns-itemEl']")
    WebElementFacade mnuItemPatronesCargo;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_CollectionAgencies-itemEl']")
    WebElementFacade mnuItemAgenciasCobro;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_CommissionPlans-itemEl']")
    WebElementFacade mnuItemPlanesComision;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_DelinquencyPlans-itemEl']")
    WebElementFacade mnuItemPlanesMora;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_Holidays-itemEl']")
    WebElementFacade mnuItemDiasFestivos;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_PaymentAllocationPlans-itemEl']")
    WebElementFacade mnuItemPlanesAsignaPago;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_PaymentPlans-itemEl']")
    WebElementFacade mnuItemPlanesPagos;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_ReturnPremiumPlans-itemEl']")
    WebElementFacade mnuItemPlanesDevolucionPrima;

    // Supervision
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Monitoring-arrowEl']")
    WebElementFacade mnuItemSupervision;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Monitoring:Monitoring_MessagingDestinationControlList-itemEl']")
    WebElementFacade mnuItemColasMensajes;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Monitoring:Monitoring_WorkflowSearch-itemEl']")
    WebElementFacade mnuItemFlujosTrabajo;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Monitoring:Monitoring_WorkflowStats-itemEl']")
    WebElementFacade mnuItemEstadisticaFlujos;

    // Utilidades
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities-arrowEl']")
    WebElementFacade mnuItemUtilidades;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities:Utilities_ImportWizard-itemEl']")
    WebElementFacade mnuItemImportDatos;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities:Utilities_ExportData-itemEl']")
    WebElementFacade mnuItemExportDatos;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities:Utilities_ScriptParametersPage-itemEl']")
    WebElementFacade mnuItemParametrosSecuencia;

    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities:Utilities_DataChangePage-itemEl']")
    WebElementFacade mnuItemCambioDatos;

    // Objetos menu Acciones
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions-btnIconEl']")
    WebElementFacade mnuAcciones;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewBillingPlan-itemEl']")
    WebElementFacade mnuItemNuevoPlanFact;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewPaymentPlan-itemEl']")
    WebElementFacade mnuItemNuevoPlanPago;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewCommissionPlan-itemEl']")
    WebElementFacade mnuItemNuevoPlanComision;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewDelinquencyPlan-itemEl']")
    WebElementFacade mnuItemNuevoPlanMora;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewAgencyBillPlan-itemEl']")
    WebElementFacade mnuItemNuevoPlanFactAgencia;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewReturnPremiumPlan-itemEl']")
    WebElementFacade mnuItemNuevoPlanDevolPrima;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewPaymentAllocationPlan-itemEl']")
    WebElementFacade mnuItemNuevoPlanAsignaPagos;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewCollectionAgency-itemEl']")
    WebElementFacade mnuItemNuevaAgenciaCobro;

    // Nuevo patron de cargo
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern-arrowEl']")
    WebElementFacade mnuItemNuevoPatronCargo;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern:NewImmediateCharge-itemEl']")
    WebElementFacade mnuItemInmediato;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern:NewPassThroughCharge-itemEl']")
    WebElementFacade mnuItemTransferenciaDirecta;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern:NewProRataCharge-itemEl']")
    WebElementFacade mnuItemProrrata;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern:NewRecaptureCharge-itemEl']")
    WebElementFacade mnuItemRecapturar;

    // Nuevo usuario
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewUser-itemEl']")
    WebElementFacade mnuItemNuevoUsuario;

    @FindBy(xpath = ".//*[@id='NewUserWizard:Cancel-btnInnerEl']")
    WebElementFacade cancelarNuevoUsuario;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewRole-itemEl']")
    WebElementFacade mnuItemNuevaFuncion;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewGroup-itemEl']")
    WebElementFacade mnuItemNuevoGrupo;

    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewAuthorityLimitProfile-itemEl']")
    WebElementFacade mnuItemNuevoPerfilLimiteAut;

    // TODO: 22/04/2016 Revision escritura de excepciones en log
    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        try {
            element(labelIngreso).waitUntilVisible();
            element(mnuAdministracion).waitUntilVisible();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void assertion(String mensaje){
        gw.asercion(labelIngreso.getText(),mensaje);
    }

    public void asercionFestivo(String msj2){
        gw.asercion(labelIngreso2.getText(),msj2);
    }

    public void navegarTabBar(String menu, String item1, String item2) {

        Actions act = new Actions(getDriver());

        switch (menu){
            case "Escritorio":
                mnuEscritorio.click();
                mnuEscritorio.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1){
                    case "Mis actividades":
                        act.moveToElement(mnuItemMisActividades).click().build().perform();
                        break;
                    case "Estados de aprobacion":
                        act.moveToElement(mnuItemEstadosAprobacion).click().build().perform();
                        break;
                    case "Mis incidentes":
                        act.moveToElement(mnuItemMisIncidentes).click().build().perform();
                        break;
                    case "Mis moras":
                        act.moveToElement(mnuItemMisMoras).click().build().perform();
                        break;
                    case "Desembolsos":
                        act.moveToElement(mnuItemDesembolsos).click().build().perform();
                        break;
                    case "Pagos en espera":
                        act.moveToElement(mnuItemPagosEnEspera).click().build().perform();
                        break;
                    case "Mis elementos de agencia":
                        act.moveToElement(mnuItemMisElementosAgencia).click().build().perform();
                        break;
                    case "Cargos retenidos":
                        act.moveToElement(mnuItemCargosRetenidos).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "Cuenta":
                mnuCuenta.click();
                mnuCuenta.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                break;
            case "Poliza":
                mnuPoliza.click();
                mnuPoliza.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                break;
            case "Agente":
                mnuAgente.click();
                mnuAgente.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                break;
            case "Buscar":
                mnuBuscar.click();
                mnuBuscar.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1){
                    case "Cuentas":
                        act.moveToElement(mnuItemCuentas).click().build().perform();
                        break;
                    case "Polizas":
                        act.moveToElement(mnuItemPolizas).click().build().perform();
                        break;
                    case "Contactos":
                        act.moveToElement(mnuItemContactos).click().build().perform();
                        break;
                    case "Facturas":
                        act.moveToElement(mnuItemFacturas).click().build().perform();
                        break;
                    case "Pagos":
                        act.moveToElement(mnuItemPagos).click().build().perform();
                        break;
                    case "Agentes":
                        act.moveToElement(mnuItemAgentes).click().build().perform();
                        break;
                    case "Transacciones":
                        act.moveToElement(mnuItemTransacciones).click().build().perform();
                        break;
                    case "Actividades":
                        act.moveToElement(mnuItemActividades).click().build().perform();
                        break;
                    case "Tickets de problemas":
                        act.moveToElement(mnuItemTicketsProblemas).click().build().perform();
                        break;
                    case "Procesos de mora":
                        act.moveToElement(mnuItemProcesosMora).click().build().perform();
                        break;
                    case "Desembolsos":
                        act.moveToElement(mnuItemDesembolsosBuscar).click().build().perform();
                        break;
                    case "Pagos salientes de agente":
                        act.moveToElement(mnuItemPagosSalientesAgente).click().build().perform();
                        break;
                    case "Solicitudes de pago":
                        act.moveToElement(mnuItemSolicitudesPago).click().build().perform();
                        break;
                    case "Elementos en espera de factura directa":
                        act.moveToElement(mnuItemElementosEsperaFactDirecta).click().build().perform();
                        break;
                    case "":
                        break;
                }
                break;
            case "Administracion":
                mnuAdministracion.click();
                mnuAdministracion.click();
                gw.ThreadWait(1000);
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1){
                    case "Usuarios y seguridad":
                        //act.moveToElement(mnuItemUsuariosSeguridad.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2){
                            case "Usuarios":
                                act.moveToElement(mnuItemUsuarios.waitUntilClickable()).click().build().perform();
                                break;
                            case "Grupos":
                                act.moveToElement(mnuItemGrupos.waitUntilClickable()).click().build().perform();
                                break;
                            case "Funciones":
                                act.moveToElement(mnuItemFunciones.waitUntilClickable()).click().build().perform();
                                break;
                            case "Zonas de seguridad":
                                act.moveToElement(mnuItemZonasSeguridad.waitUntilClickable()).click().build().perform();
                                break;
                            case "Perfil de limite de autoridad":
                                act.moveToElement(mnuItemPerfilLimiteAut.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "Configuracion comercial":
                        act.moveToElement(mnuItemConfigComercial.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2){
                            case "Patrones de actividad":
                                act.moveToElement(mnuItemPatronesActividad.waitUntilClickable()).click().build().perform();
                                break;
                            case "Planes de factura a la agencia":
                                act.moveToElement(mnuItemPlanesFactAgencia.waitUntilClickable()).click().build().perform();
                                break;
                            case "Planes de facturacion":
                                act.moveToElement(mnuItemPlanesFacturacion.waitUntilClickable()).click().build().perform();
                                break;
                            case "Patrones de cargo":
                                act.moveToElement(mnuItemPatronesCargo.waitUntilClickable()).click().build().perform();
                                break;
                            case "Agencias de cobro":
                                act.moveToElement(mnuItemAgenciasCobro.waitUntilClickable()).click().build().perform();
                                break;
                            case "Planes de comision":
                                act.moveToElement(mnuItemPlanesComision.waitUntilClickable()).click().build().perform();
                                break;
                            case "Planes de mora":
                                act.moveToElement(mnuItemPlanesMora.waitUntilClickable()).click().build().perform();
                                break;
                            case "Dias festivos":
                                act.moveToElement(mnuItemDiasFestivos.waitUntilClickable()).click().build().perform();
                                break;
                            case "Planes de asignacion de pago":
                                act.moveToElement(mnuItemPlanesAsignaPago.waitUntilClickable()).click().build().perform();
                                break;
                            case "Planes de pagos":
                                act.moveToElement(mnuItemPlanesPagos.waitUntilClickable()).click().build().perform();
                                break;
                            case "Planes de devolucion de prima":
                                act.moveToElement(mnuItemPlanesDevolucionPrima.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "Supervision":
                        act.moveToElement(mnuItemSupervision.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2) {
                            case "Colas de mensajes":
                                act.moveToElement(mnuItemColasMensajes.waitUntilClickable()).click().build().perform();
                                break;
                            case "Flujos de trabajo":
                                act.moveToElement(mnuItemFlujosTrabajo.waitUntilClickable()).click().build().perform();
                                break;
                            case "Estadisticas de flujo de trabajo":
                                act.moveToElement(mnuItemEstadisticaFlujos.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                    case "Utilidades":
                        act.moveToElement(mnuItemUtilidades.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2) {
                            case "Importar datos":
                                act.moveToElement(mnuItemImportDatos.waitUntilClickable()).click().build().perform();
                                break;
                            case "Exportar datos":
                                act.moveToElement(mnuItemExportDatos.waitUntilClickable()).click().build().perform();
                                break;
                            case "Parametros de secuencia":
                                act.moveToElement(mnuItemParametrosSecuencia.waitUntilClickable()).click().build().perform();
                                break;
                            case "Cambio de datos":
                                act.moveToElement(mnuItemCambioDatos.waitUntilClickable()).click().build().perform();
                                break;
                            case "":
                                break;
                        }
                        break;
                }
                break;
            case "Acciones":
                mnuAcciones.click();
                mnuAcciones.click();
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                switch (item1){
                    case "Nuevo plan de facturacion":
                        act.moveToElement(mnuItemNuevoPlanFact.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nuevo plan de pago":
                        act.moveToElement(mnuItemNuevoPlanPago.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nuevo plan de comision":
                        act.moveToElement(mnuItemNuevoPlanComision.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nuevo plan de mora":
                        act.moveToElement(mnuItemNuevoPlanMora.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nuevo plan de factura a la agencia":
                        act.moveToElement(mnuItemNuevoPlanFactAgencia.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nuevo plan de devolucion de prima":
                        act.moveToElement(mnuItemNuevoPlanDevolPrima.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nuevo plan de asignacion de pagos":
                        act.moveToElement(mnuItemNuevoPlanAsignaPagos.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nueva agencia de cobro":
                        act.moveToElement(mnuItemNuevaAgenciaCobro.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nuevo patron de cargo":
                        act.moveToElement(mnuItemNuevoPatronCargo.waitUntilClickable()).build().perform();
                        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
                        switch (item2){
                            case "Inmediato":
                                act.moveToElement(mnuItemInmediato.waitUntilClickable()).click().build().perform();
                                break;
                            case "Transferencia directa":
                                act.moveToElement(mnuItemTransferenciaDirecta.waitUntilClickable()).click().build().perform();
                                break;
                            case "Prorrata":
                                act.moveToElement(mnuItemProrrata.waitUntilClickable()).click().build().perform();
                                break;
                            case "Recapturar":
                                act.moveToElement(mnuItemRecapturar.waitUntilClickable()).click().build().perform();
                                break;
                        }
                        break;
                    case "Nuevo usuario":
                        act.moveToElement(mnuItemNuevoUsuario.waitUntilClickable()).click().build().perform();
                        cancelarNuevoUsuario.click();
                        break;
                    case "Nueva funcion":
                        act.moveToElement(mnuItemNuevaFuncion.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nuevo grupo":
                        act.moveToElement(mnuItemNuevoGrupo.waitUntilClickable()).click().build().perform();
                        break;
                    case "Nuevo perfil de limite de autoridad":
                        act.moveToElement(mnuItemNuevoPerfilLimiteAut.waitUntilClickable()).click().build().perform();
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
