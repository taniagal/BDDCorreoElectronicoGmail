package com.sura.billing.selenium.pages.menu;

import com.sura.billing.selenium.pages.menu.acciones.administracion.*;
import com.sura.billing.selenium.pages.menu.acciones.agente.AgenteNuevoPage;
import com.sura.billing.selenium.pages.menu.acciones.cuenta.CuentaNuevaPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.*;
import com.sura.billing.selenium.pages.menu.principal.administracion.*;
import com.sura.billing.selenium.pages.menu.principal.agente.AgenteBuscarPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.*;
import com.sura.billing.selenium.pages.menu.principal.cuenta.CuentaBuscarPage;
import com.sura.billing.selenium.pages.menu.principal.escritorio.*;
import com.sura.billing.selenium.pages.menu.principal.poliza.PolizaBuscarPage;
import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jorghome on 18/05/2016.
 */
public class Navegacion extends Guidewire{
    public Navegacion(WebDriver driver) {
        super(driver);
    }

    private final Guidewire gw = new Guidewire(getDriver());
    private final Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='UserSearch:UserSearchScreen:ttlBar']")
    private WebElementFacade labelIngreso;
    @FindBy(xpath = ".//*[@id='HolidaysPage:HolidaysScreen:0']")
    private WebElementFacade labelIngreso2;

    // Objetos menu Escritorio
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnWrap']")
    private WebElementFacade mnuEscritorio;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopActivities-itemEl']")
    private WebElementFacade mnuItemMisActividades;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopApprovals-itemEl']")
    private WebElementFacade mnuItemEstadosAprobacion;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopTroubleTickets-itemEl']")
    private WebElementFacade mnuItemMisIncidentes;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopDelinquencies-itemEl']")
    private WebElementFacade mnuItemMisMoras;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopDisbursements-itemEl']")
    private WebElementFacade mnuItemDesembolsos;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopSuspensePayments-itemEl']")
    private WebElementFacade mnuItemPagosEnEspera;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopAgencyItems-itemEl']")
    private WebElementFacade mnuItemMisElementosAgencia;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:DesktopGroup_DesktopHeldCharges-itemEl']")
    private WebElementFacade mnuItemCargosRetenidos;

    // Objetos menu Cuenta
    @FindBy(xpath = ".//*[@id='TabBar:AccountsTab-btnWrap']")
    private WebElementFacade mnuCuenta;
    @FindBy(xpath = ".//*[@id='TabBar:AccountsTab:AccountNumberSearchItem-inputEl']")
    private WebElementFacade itemNumCuenta;

    // Objetos menu Poliza
    @FindBy(xpath = ".//*[@id='TabBar:PoliciesTab-btnWrap']")
    private WebElementFacade mnuPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PoliciesTab:PolicyNumberSearchItem-inputEl']")
    private WebElementFacade itemNumPoliza;

    // Objetos menu Agente
    @FindBy(xpath = ".//*[@id='TabBar:ProducersTab-btnWrap']")
    private WebElementFacade mnuAgente;
    @FindBy(xpath = ".//*[@id='TabBar:ProducersTab:ProducerNameSearchItem-inputEl']")
    private WebElementFacade itemNumAgente;

    // Objetos menu Buscar
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnWrap']")
    private WebElementFacade mnuBuscar;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_AccountSearch-itemEl']")
    private WebElementFacade mnuItemCuentas;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_PolicySearch-itemEl']")
    private WebElementFacade mnuItemPolizas;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_ContactSearch-itemEl']")
    private WebElementFacade mnuItemContactos;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_InvoiceSearch-itemEl']")
    private WebElementFacade mnuItemFacturas;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_PaymentSearch-itemEl']")
    private WebElementFacade mnuItemPagos;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_ProducerSearch-itemEl']")
    private WebElementFacade mnuItemAgentes;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_TransactionSearch-itemEl']")
    private WebElementFacade mnuItemTransacciones;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_ActivitySearch-itemEl']")
    private WebElementFacade mnuItemActividades;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_TroubleTicketSearch-itemEl']")
    private WebElementFacade mnuItemTicketsProblemas;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_DelinquencyProcessSearch-itemEl']")
    private WebElementFacade mnuItemProcesosMora;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_DisbursementSearch-itemEl']")
    private WebElementFacade mnuItemDesembolsosBuscar;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_OutgoingProducerPaymentSearch-itemEl']")
    private WebElementFacade mnuItemPagosSalientesAgente;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_PaymentRequestSearch-itemEl']")
    private WebElementFacade mnuItemSolicitudesPago;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:SearchGroup_DirectBillSuspenseItemSearch-itemEl']")
    private WebElementFacade mnuItemElementosEsperaFactDirecta;

    // Objetos menu Administracion
    @FindBy(xpath=".//*[@id='TabBar:AdministrationTab-btnWrap']")
    private WebElementFacade mnuAdministracion;
    // Usuarios y Seguridad
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity']")
    private WebElementFacade mnuItemUsuariosSeguridad;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_UserSearch-itemEl']")
    private WebElementFacade mnuItemUsuarios;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_Groups-itemEl']")
    private WebElementFacade mnuItemGrupos;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_Roles-itemEl']")
    private WebElementFacade mnuItemFunciones;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_SecurityZones-itemEl']")
    private WebElementFacade mnuItemZonasSeguridad;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_UsersAndSecurity:UsersAndSecurity_AuthorityLimitProfiles-itemEl']")
    private WebElementFacade mnuItemPerfilLimiteAut;
    // Configuracion comercial
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings']")
    private WebElementFacade mnuItemConfigComercial;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_ActivityPatterns-itemEl']")
    private WebElementFacade mnuItemPatronesActividad;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_AgencyBillPlans-itemEl']")
    private WebElementFacade mnuItemPlanesFactAgencia;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_BillingPlans-itemEl']")
    private WebElementFacade mnuItemPlanesFacturacion;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_ChargePatterns-itemEl']")
    private WebElementFacade mnuItemPatronesCargo;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_CollectionAgencies-itemEl']")
    private WebElementFacade mnuItemAgenciasCobro;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_CommissionPlans-itemEl']")
    private WebElementFacade mnuItemPlanesComision;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_DelinquencyPlans-itemEl']")
    private WebElementFacade mnuItemPlanesMora;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_Holidays-itemEl']")
    private WebElementFacade mnuItemDiasFestivos;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_PaymentAllocationPlans-itemEl']")
    private WebElementFacade mnuItemPlanesAsignaPago;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_PaymentPlans-itemEl']")
    private WebElementFacade mnuItemPlanesPagos;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_BusinessSettings:BusinessSettings_ReturnPremiumPlans-itemEl']")
    private WebElementFacade mnuItemPlanesDevolucionPrima;
    // Supervision
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Monitoring-arrowEl']")
    private WebElementFacade mnuItemSupervision;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Monitoring:Monitoring_MessagingDestinationControlList-itemEl']")
    private WebElementFacade mnuItemColasMensajes;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Monitoring:Monitoring_WorkflowSearch-itemEl']")
    private WebElementFacade mnuItemFlujosTrabajo;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Monitoring:Monitoring_WorkflowStats-itemEl']")
    private WebElementFacade mnuItemEstadisticaFlujos;
    // Utilidades
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities-arrowEl']")
    private WebElementFacade mnuItemUtilidades;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities:Utilities_ImportWizard-itemEl']")
    private WebElementFacade mnuItemImportDatos;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities:Utilities_ExportData-itemEl']")
    private WebElementFacade mnuItemExportDatos;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities:Utilities_ScriptParametersPage-itemEl']")
    private WebElementFacade mnuItemParametrosSecuencia;
    @FindBy(xpath = ".//*[@id='TabBar:AdministrationTab:Admin_Utilities:Utilities_DataChangePage-itemEl']")
    private WebElementFacade mnuItemCambioDatos;
    
    
    // Objetos menu acciones Escritorio
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions-btnIconEl']")
    private WebElementFacade mnuAccionesEscritorio;
    // Nuevo pago
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewPayment-arrowEl']")
    private WebElementFacade itemNuevoPago;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewPayment:DesktopMenuActions_NewSuspensePayment-itemEl']")
    private WebElementFacade accionPagoEnEspera;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewPayment:DesktopMenuActions_MultiPaymentEntryWizard-itemEl']")
    private WebElementFacade accionEntradaPagosMultiples;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewPayment:DesktopMenuActions_NewPaymentRequest-itemEl']")
    private WebElementFacade accionSolicitudPago;
    // Nueva Transaccion
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction-arrowEl']")
    private WebElementFacade accionNuevaTransac;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewDisbursementTransaction-itemEl']")
    private WebElementFacade accionDesembolso;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewTransactionTransfer-itemEl']")
    private WebElementFacade accionTransferencia;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewTransactionWriteoff-itemEl']")
    private WebElementFacade accionAnulacion;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewTransactionNegativeWriteoff-itemEl']")
    private WebElementFacade accionAnulacionNegativa;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewTransactionSubrogation-itemEl']")
    private WebElementFacade accionSubrogacion;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewChargeReversal-itemEl']")
    private WebElementFacade accionReversionCargo;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewWriteoffReversal-itemEl']")
    private WebElementFacade accionReversionAnulacion;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewNegativeWriteoffReversal-itemEl']")
    private WebElementFacade accionReversionAnulacionNegativa;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewFundsTransferReversal-itemEl']")
    private WebElementFacade accionReversionTransfFondos;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_NewTransaction:DesktopMenuActions_NewTransactionGeneral-itemEl']")
    private WebElementFacade accionTransacGeneral;
    // Nueva actividad asignada
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:NewAssignedActivity-arrowEl']")
    private WebElementFacade itemActAsignada;
    // Recordatorio actividad asignada
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:NewAssignedActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category-arrowEl']")
    private WebElementFacade itemRecordatorioAsignada;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:NewAssignedActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category:0:item-itemEl']")
    private WebElementFacade accionNotificacionAsignada;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:NewAssignedActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category:1:item-itemEl']")
    private WebElementFacade accionWriteOffAttemptedAboveThresholdAsignada;
    // Nueva actividad compartida
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:NewSharedActivity-arrowEl']")
    private WebElementFacade itemActCompartida;
    // Recordatorio actividad compartida
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:NewSharedActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category-arrowEl']")
    private WebElementFacade itemRecordatorioCompartida;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:NewSharedActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category:0:item-itemEl']")
    private WebElementFacade accionNotificacionCompartida;
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:NewSharedActivity:NewActivityMenuItemSet:0:NewActivityMenuItemSet_Category:1:item-itemEl']")
    private WebElementFacade accionWriteOffAttemptedAboveThresholdCompartida;
    // Preferencias
    @FindBy(xpath = ".//*[@id='DesktopGroup:DesktopMenuActions:DesktopMenuActions_UserPreferences-itemEl']")
    private WebElementFacade accionPreferencias;

    // Objetos menu acciones Cuenta
    @FindBy(xpath = ".//*[@id='AccountsGroup:AccountsMenuActions-btnIconEl']")
    private WebElementFacade mnuAccionesCuenta;
    @FindBy(xpath = ".//*[@id='AccountsGroup:AccountsMenuActions:AccountsMenuActions_NewAccount-itemEl']")
    private WebElementFacade accionNuevaCuenta;

    // Objetos menu acciones Agente
    @FindBy(xpath = ".//*[@id='ProducersGroup:ProducersMenuActions-btnIconEl']")
    private WebElementFacade mnuAccionesAgente;
    @FindBy(xpath = ".//*[@id='ProducersGroup:ProducersMenuActions:ProducersMenuActions_NewProducer-itemEl']")
    private WebElementFacade accionNuevoAgente;

    // Objetos menu acciones Administracion
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions-btnIconEl']")
    private WebElementFacade mnuAccionesAdmin;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewBillingPlan-itemEl']")
    private WebElementFacade mnuItemNuevoPlanFact;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewPaymentPlan-itemEl']")
    private WebElementFacade mnuItemNuevoPlanPago;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewCommissionPlan-itemEl']")
    private WebElementFacade mnuItemNuevoPlanComision;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewDelinquencyPlan-itemEl']")
    private WebElementFacade mnuItemNuevoPlanMora;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewAgencyBillPlan-itemEl']")
    private WebElementFacade mnuItemNuevoPlanFactAgencia;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewReturnPremiumPlan-itemEl']")
    private WebElementFacade mnuItemNuevoPlanDevolPrima;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewPaymentAllocationPlan-itemEl']")
    private WebElementFacade mnuItemNuevoPlanAsignaPagos;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewCollectionAgency-itemEl']")
    private WebElementFacade mnuItemNuevaAgenciaCobro;

    // Nuevo patron de cargo
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern-arrowEl']")
    private WebElementFacade mnuItemNuevoPatronCargo;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern:NewImmediateCharge-itemEl']")
    private WebElementFacade mnuItemInmediato;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern:NewPassThroughCharge-itemEl']")
    private WebElementFacade mnuItemTransferenciaDirecta;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern:NewProRataCharge-itemEl']")
    private WebElementFacade mnuItemProrrata;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewChargePattern:NewRecaptureCharge-itemEl']")
    private WebElementFacade mnuItemRecapturar;

    // Nuevo usuario
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewUser-itemEl']")
    private WebElementFacade mnuItemNuevoUsuario;
    @FindBy(xpath = ".//*[@id='NewUserWizard:Cancel-btnInnerEl']")
    private WebElementFacade cancelarNuevoUsuario;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewRole-itemEl']")
    private WebElementFacade mnuItemNuevaFuncion;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewGroup-itemEl']")
    private WebElementFacade mnuItemNuevoGrupo;
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions:AdminMenuActions_NewAuthorityLimitProfile-itemEl']")
    private WebElementFacade mnuItemNuevoPerfilLimiteAut;

    // Navegacion menu Escritorio
    public MisActividadesPage irAMisActividades() {
        gw.deployMenu(mnuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisActividades).release(mnuItemMisActividades).click().build().perform();
        return new MisActividadesPage(getDriver());
    }
    public EstadosAprobacionPage irAEstadosAprobacion() {
        gw.deployMenu(mnuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemEstadosAprobacion).release(mnuItemEstadosAprobacion).click().build().perform();
        return new EstadosAprobacionPage(getDriver());
    }
    public MisIncidentesPage irAMisIncidentes() {
        gw.deployMenu(mnuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisIncidentes).release(mnuItemMisIncidentes).click().build().perform();
        return new MisIncidentesPage(getDriver());
    }
    public MisMorasPage irAMisMoras() {
        gw.deployMenu(mnuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisMoras).release(mnuItemMisMoras).click().build().perform();
        return new MisMorasPage(getDriver());
    }
    public DesembolsosPage irADesembolsos() {
        gw.deployMenu(mnuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemDesembolsos).release(mnuItemDesembolsos).click().build().perform();
        return new DesembolsosPage(getDriver());
    }
    public PagosEnEsperaPage irAPagosEnEspera() {
        gw.deployMenu(mnuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemPagosEnEspera).release(mnuItemPagosEnEspera).click().build().perform();
        return new PagosEnEsperaPage(getDriver());
    }
    public MisElementosAgenciaPage irAMisElementosAgencia() {
        gw.deployMenu(mnuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisElementosAgencia).release(mnuItemMisElementosAgencia).click().build().perform();
        return new MisElementosAgenciaPage(getDriver());
    }
    public CargosRetenidosPage irACargosRetenidos() {
        gw.deployMenu(mnuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemCargosRetenidos).release(mnuItemCargosRetenidos).click().build().perform();
        return new CargosRetenidosPage(getDriver());
    }

    // Navegacion menu Cuenta
    public CuentaBuscarPage irACuentaBuscar(String numCuenta) {
        gw.deployMenu(mnuCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemNumCuenta).release(itemNumCuenta).click().build().perform();
        act.sendKeys(itemNumCuenta.type(numCuenta), Keys.ENTER).build().perform();
        return new CuentaBuscarPage(getDriver());
    }

    // Navegacion menu Poliza
    public PolizaBuscarPage irAPolizaBuscar(String numPoliza) {
        gw.deployMenu(mnuPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemNumPoliza).release(itemNumPoliza).click().build().perform();
        act.sendKeys(itemNumPoliza.type(numPoliza), Keys.ENTER).build().perform();
        return new PolizaBuscarPage(getDriver());
    }

    // Navegacion menu Agente
    public AgenteBuscarPage irAAgenteBuscar(String numAgente) {
        gw.deployMenu(mnuAgente);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemNumAgente).release(itemNumAgente).click().build().perform();
        act.sendKeys(itemNumAgente.type(numAgente), Keys.ENTER).build().perform();
        return new AgenteBuscarPage(getDriver());
    }

    // Navegacion menu Buscar
    public BuscarCuentasPage irABuscarCuentas() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemCuentas).release(mnuItemCuentas).click().build().perform();
        return new BuscarCuentasPage(getDriver());
    }
    public BuscarPolizasPage irABuscarPolizas() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemPolizas).release(mnuItemPolizas).click().build().perform();
        return new BuscarPolizasPage(getDriver());
    }
    public BuscarContactosPage irABuscarContactos() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemContactos).release(mnuItemContactos).click().build().perform();
        return new BuscarContactosPage(getDriver());
    }
    public BuscarFacturasPage irABuscarFacturas() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemFacturas).release(mnuItemFacturas).click().build().perform();
        return new BuscarFacturasPage(getDriver());
    }
    public BuscarPagosPage irABuscarPagos() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemFacturas).release(mnuItemFacturas).click().build().perform();
        return new BuscarPagosPage(getDriver());
    }
    public BuscarAgentesPage irABuscarAgentes() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemAgentes).release(mnuItemAgentes).click().build().perform();
        return new BuscarAgentesPage(getDriver());
    }
    public BuscarTransacPage irABuscarTransacciones() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemTransacciones).release(mnuItemTransacciones).click().build().perform();
        return new BuscarTransacPage(getDriver());
    }
    public BuscarActividadesPage irABuscarActividades() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemActividades).release(mnuItemActividades).click().build().perform();
        return new BuscarActividadesPage(getDriver());
    }
    public BuscarTicketsProblemasPage irABuscarTicketsProblemas() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemTicketsProblemas).release(mnuItemTicketsProblemas).click().build().perform();
        return new BuscarTicketsProblemasPage(getDriver());
    }
    public BuscarProcesosMoraPage irABuscarProcesosMora() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemProcesosMora).release(mnuItemProcesosMora).click().build().perform();
        return new BuscarProcesosMoraPage(getDriver());
    }
    public BuscarDesembolsosPage irABuscarDesembolsos() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemDesembolsosBuscar).release(mnuItemDesembolsosBuscar).click().build().perform();
        return new BuscarDesembolsosPage(getDriver());
    }
    public BuscarPagoSalAgentePage irABuscarPagoSalAgente() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemPagosSalientesAgente).release(mnuItemPagosSalientesAgente).click().build().perform();
        return new BuscarPagoSalAgentePage(getDriver());
    }
    public BuscarSolicitudesPagoPage irABuscarSolicitudesPago() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSolicitudesPago).release(mnuItemSolicitudesPago).click().build().perform();
        return new BuscarSolicitudesPagoPage(getDriver());
    }
    public BuscarElementosEsperaFactDirectaPage irABuscarElementosEsperaFactDirecta() {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemElementosEsperaFactDirecta).release(mnuItemElementosEsperaFactDirecta).click().build().perform();
        return new BuscarElementosEsperaFactDirectaPage(getDriver());
    }

    // Navegacion menu Administracion
    // Admin Usuarios y seguridad
    public AdminUsuariosPage irAAdminUsuarios() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuariosSeguridad).release(mnuItemUsuariosSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemUsuarios).release(mnuItemUsuarios).click().build().perform();
        return new AdminUsuariosPage(getDriver());
    }
    public AdminGruposPage irAAdminGrupos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuariosSeguridad).release(mnuItemUsuariosSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemGrupos).release(mnuItemGrupos).click().build().perform();
        return new AdminGruposPage(getDriver());
    }
    public AdminFuncionesPage irAAdminFunciones() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuariosSeguridad).release(mnuItemUsuariosSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemFunciones).release(mnuItemFunciones).click().build().perform();
        return new AdminFuncionesPage(getDriver());
    }
    public AdminZonasSeguridadPage irAAdminZonasSeguridad() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuariosSeguridad).release(mnuItemUsuariosSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemZonasSeguridad).release(mnuItemZonasSeguridad).click().build().perform();
        return new AdminZonasSeguridadPage(getDriver());
    }
    public AdminPerfilLimiteAutoridadPage irAAdminPerfilLimiteAutoridad() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUsuariosSeguridad).release(mnuItemUsuariosSeguridad).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPerfilLimiteAut).release(mnuItemPerfilLimiteAut).click().build().perform();
        return new AdminPerfilLimiteAutoridadPage(getDriver());
    }

    //Admin Configuracion comercial
    public AdminPatronesActPage irAAdminPatronesAct() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPatronesActividad).release(mnuItemPatronesActividad).click().build().perform();
        return new AdminPatronesActPage(getDriver());
    }
    public AdminPlanesFactAgenciaPage irAAdminPlanesFactAgencia() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPlanesFactAgencia).release(mnuItemPlanesFactAgencia).click().build().perform();
        return new AdminPlanesFactAgenciaPage(getDriver());
    }
    public AdminPlanesFacturacionPage irAAdminPlanesFacturacion() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPlanesFacturacion).release(mnuItemPlanesFacturacion).click().build().perform();
        return new AdminPlanesFacturacionPage(getDriver());
    }
    public AdminPatronesCargoPage irAAdminPatronesCargo() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPatronesCargo).release(mnuItemPatronesCargo).click().build().perform();
        return new AdminPatronesCargoPage(getDriver());
    }
    public AdminAgenciasCobroPage irAAdminAgenciasCobro() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemAgenciasCobro).release(mnuItemAgenciasCobro).click().build().perform();
        return new AdminAgenciasCobroPage(getDriver());
    }
    public AdminPlanesComisionPage irAAdminPlanesComision() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPlanesComision).release(mnuItemPlanesComision).click().build().perform();
        return new AdminPlanesComisionPage(getDriver());
    }
    public AdminPlanesMoraPage irAAdminPlanesMora() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPlanesMora).release(mnuItemPlanesMora).click().build().perform();
        return new AdminPlanesMoraPage(getDriver());
    }
    public AdminDiasFestivosPage irAAdminDiasFestivos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemDiasFestivos).release(mnuItemDiasFestivos).click().build().perform();
        return new AdminDiasFestivosPage(getDriver());
    }
    public AdminPlanesAsignaPagoPage irAAdminPlanesAsignaPago() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPlanesAsignaPago).release(mnuItemPlanesAsignaPago).click().build().perform();
        return new AdminPlanesAsignaPagoPage(getDriver());
    }
    public AdminPlanesPagosPage irAAdminPlanesPagos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPlanesPagos).release(mnuItemPlanesPagos).click().build().perform();
        return new AdminPlanesPagosPage(getDriver());
    }
    public AdminPlanesDevolPrimaPage irAAdminPlanesDevolPrima() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemConfigComercial).release(mnuItemConfigComercial).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemPlanesDevolucionPrima).release(mnuItemPlanesDevolucionPrima).click().build().perform();
        return new AdminPlanesDevolPrimaPage(getDriver());
    }

    //Admin Supervision
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
    public AdminEstadistFlujosTrabajoPage irAAdminEstadistFlujosTrabajo() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemSupervision).release(mnuItemSupervision).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemEstadisticaFlujos).release(mnuItemEstadisticaFlujos).click().build().perform();
        return new AdminEstadistFlujosTrabajoPage(getDriver());
    }

    //Admin Utilidades
    public AdminImpotarDatosPage irAAdminImpotarDatos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemImportDatos).release(mnuItemImportDatos).click().build().perform();
        return new AdminImpotarDatosPage(getDriver());
    }
    public AdminExpotarDatosPage irAAdminExpotarDatos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemImportDatos).release(mnuItemImportDatos).click().build().perform();
        return new AdminExpotarDatosPage(getDriver());
    }
    public AdminParamSecuenciaPage irAAdminParamSecuencia() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemParametrosSecuencia).release(mnuItemParametrosSecuencia).click().build().perform();
        return new AdminParamSecuenciaPage(getDriver());
    }
    public AdminCambioDatosPage irAAdminCambioDatos() {
        gw.deployMenu(mnuAdministracion);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemUtilidades).release(mnuItemUtilidades).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemCambioDatos).release(mnuItemCambioDatos).click().build().perform();
        return new AdminCambioDatosPage(getDriver());
    }

    public PagoEsperaPage irAAccionEPagoEspera() {
        mnuEscritorio.waitUntilClickable().click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemNuevoPago).release(itemNuevoPago).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionPagoEnEspera).release(accionPagoEnEspera).click().build().perform();
        return new PagoEsperaPage(getDriver());
    }

    public EntradaPagosMultiplesPage irAAccionEEntradaPagosMultiples() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemNuevoPago).release(itemNuevoPago).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionEntradaPagosMultiples).release(accionEntradaPagosMultiples).click().build().perform();
        return new EntradaPagosMultiplesPage(getDriver());
    }

    public SolicitudPagoPage irAAccionESolicitudPago() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemNuevoPago).release(itemNuevoPago).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionSolicitudPago).release(accionSolicitudPago).click().build().perform();
        return new SolicitudPagoPage(getDriver());
    }

    public DesembolsoPage irAAccionEDesembolso() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionDesembolso).release(accionDesembolso).click().build().perform();
        return new DesembolsoPage(getDriver());
    }

    public TransferenciaPage irAAccionETransferencia() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionTransferencia).release(accionTransferencia).click().build().perform();
        return new TransferenciaPage(getDriver());
    }

    public AnulacionPage irAAccionEAnulacion() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionAnulacion).release(accionAnulacion).click().build().perform();
        return new AnulacionPage(getDriver());
    }

    public AnulacionNegativaPage irAAccionEAnulacionNegativa() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionAnulacionNegativa).release(accionAnulacionNegativa).click().build().perform();
        return new AnulacionNegativaPage(getDriver());
    }

    public SubrogacionPage irAAccionESubrogacion() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionSubrogacion).release(accionSubrogacion).click().build().perform();
        return new SubrogacionPage(getDriver());
    }

    public ReversionCargoPage irAAccionEReversionCargo() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionReversionCargo).release(accionReversionCargo).click().build().perform();
        return new ReversionCargoPage(getDriver());
    }

    public ReversionAnulacionPage irAAccionEReversionAnulacion() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionReversionAnulacion).release(accionReversionAnulacion).click().build().perform();
        return new ReversionAnulacionPage(getDriver());
    }

    public ReversionAnulacionNegativaPage irAAccionEReversionAnulacionNegativa() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionReversionAnulacionNegativa).release(accionReversionAnulacionNegativa).click().build().perform();
        return new ReversionAnulacionNegativaPage(getDriver());
    }

    public ReversionTransfFondosPage irAAccionEReversionTransfFondos() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionReversionTransfFondos).release(accionReversionTransfFondos).click().build().perform();
        return new ReversionTransfFondosPage(getDriver());
    }

    public TransaccionGeneralPage irAAccionETransaccionGeneral() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaTransac).release(accionNuevaTransac).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionTransacGeneral).release(accionTransacGeneral).click().build().perform();
        return new TransaccionGeneralPage(getDriver());
    }

    public NotificacionAsignadaPage irAAccionENotificacionAsignada() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemActAsignada).release(itemActAsignada).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(itemRecordatorioAsignada).release(itemRecordatorioAsignada).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionNotificacionAsignada).release(accionNotificacionAsignada).click().build().perform();
        return new NotificacionAsignadaPage(getDriver());
    }

    public WriteOffAttemptedAboveThresholdAsignadaPage irAAccionEWriteOffAttemptedAboveThresholdAsignada() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemActAsignada).release(itemActAsignada).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(itemRecordatorioAsignada).release(itemRecordatorioAsignada).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionWriteOffAttemptedAboveThresholdAsignada).release(accionWriteOffAttemptedAboveThresholdAsignada).click().build().perform();
        return new WriteOffAttemptedAboveThresholdAsignadaPage(getDriver());
    }

    public NotificacionCompartidaPage irAAccionENotificacionCompartida() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemActCompartida).release(itemActCompartida).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(itemRecordatorioCompartida).release(itemRecordatorioCompartida).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionNotificacionCompartida).release(accionNotificacionCompartida).click().build().perform();
        return new NotificacionCompartidaPage(getDriver());
    }

    public WriteOffAttemptedAboveThresholdCompartidaPage irAAccionEWriteOffAttemptedAboveThresholdCompartida() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemActCompartida).release(itemActCompartida).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(itemRecordatorioCompartida).release(itemRecordatorioCompartida).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(accionWriteOffAttemptedAboveThresholdCompartida).release(accionWriteOffAttemptedAboveThresholdCompartida).click().build().perform();
        return new WriteOffAttemptedAboveThresholdCompartidaPage(getDriver());
    }

    public PreferenciasPage irAAccionEPreferencias() {
        mnuEscritorio.click();
        gw.deployMenu(mnuAccionesEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionPreferencias).release(accionPreferencias).click().build().perform();
        return new PreferenciasPage(getDriver());
    }

    public CuentaNuevaPage irAAccionCCuentaNueva() {
        mnuCuenta.click();
        gw.deployMenu(mnuAccionesCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevaCuenta).release(accionNuevaCuenta).click().build().perform();
        return new CuentaNuevaPage(getDriver());
    }

    public AgenteNuevoPage irAAccionAAgenteNuevo() {
        mnuAgente.click();
        gw.deployMenu(mnuAccionesAgente);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(accionNuevoAgente).release(accionNuevoAgente).click().build().perform();
        return new AgenteNuevoPage(getDriver());
    }

    public NuevoPlanFactPage irAAccionANuevoPlanFact() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPlanFact).release(mnuItemNuevoPlanFact).click().build().perform();
        return new NuevoPlanFactPage(getDriver());
    }

    public NuevoPlanPagoPage irAAccionANuevoPlanPago() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPlanPago).release(mnuItemNuevoPlanPago).click().build().perform();
        return new NuevoPlanPagoPage(getDriver());
    }

    public NuevoPlanComisionPage irAAccionANuevoPlanComision() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPlanComision).release(mnuItemNuevoPlanComision).click().build().perform();
        return new NuevoPlanComisionPage(getDriver());
    }

    public NuevoPlanMoraPage irAAccionANuevoPlanMora() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPlanMora).release(mnuItemNuevoPlanMora).click().build().perform();
        return new NuevoPlanMoraPage(getDriver());
    }

    public NuevoPlanFactAgenciaPage irAAccionANuevoPlanFactAgencia() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPlanFactAgencia).release(mnuItemNuevoPlanFactAgencia).click().build().perform();
        return new NuevoPlanFactAgenciaPage(getDriver());
    }

    public NuevoPlanDevolPrimaPage irAAccionANuevoPlanDevolPrima() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPlanDevolPrima).release(mnuItemNuevoPlanDevolPrima).click().build().perform();
        return new NuevoPlanDevolPrimaPage(getDriver());
    }

    public NuevoPlanAsignaPagosPage irAAccionANuevoPlanAsignaPagos() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPlanAsignaPagos).release(mnuItemNuevoPlanAsignaPagos).click().build().perform();
        return new NuevoPlanAsignaPagosPage(getDriver());
    }

    public NuevaAgenciaCobroPage irAAccionANuevaAgenciaCobro() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevaAgenciaCobro).release(mnuItemNuevaAgenciaCobro).click().build().perform();
        return new NuevaAgenciaCobroPage(getDriver());
    }

    public NuevoPatronCargoInmediatoPage irAAccionANuevoPatronCargoInmediato() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPatronCargo).release(mnuItemNuevoPatronCargo).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemInmediato).release(mnuItemInmediato).click().build().perform();
        return new NuevoPatronCargoInmediatoPage(getDriver());
    }

    public NuevoPatronCargoTransfDirectaPage irAAccionANuevoPatronCargoTransfDirecta() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPatronCargo).release(mnuItemNuevoPatronCargo).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemTransferenciaDirecta).release(mnuItemTransferenciaDirecta).click().build().perform();
        return new NuevoPatronCargoTransfDirectaPage(getDriver());
    }

    public NuevoPatronCargoProrrataPage irAAccionANuevoPatronCargoProrrata() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPatronCargo).release(mnuItemNuevoPatronCargo).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemProrrata).release(mnuItemProrrata).click().build().perform();
        return new NuevoPatronCargoProrrataPage(getDriver());
    }

    public NuevoPatronCargoRecapturaPage irAAccionANuevoPatronCargoRecaptura() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPatronCargo).release(mnuItemNuevoPatronCargo).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemRecapturar).release(mnuItemRecapturar).click().build().perform();
        return new NuevoPatronCargoRecapturaPage(getDriver());
    }

    public NuevoUsuarioPage irAAccionANuevoUsuario() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoUsuario).release(mnuItemNuevoUsuario).click().build().perform();
        return new NuevoUsuarioPage(getDriver());
    }

    public NuevaFuncionPage irAAccionANuevaFuncion() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevaFuncion).release(mnuItemNuevaFuncion).click().build().perform();
        return new NuevaFuncionPage(getDriver());
    }

    public NuevoGrupoPage irAAccionANuevoGrupo() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoGrupo).release(mnuItemNuevoGrupo).click().build().perform();
        return new NuevoGrupoPage(getDriver());
    }

    public NuevoPerfilLimiteAutPage irAAccionANuevoPerfilLimiteAut() {
        mnuAdministracion.click();
        gw.deployMenu(mnuAccionesAdmin);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoPerfilLimiteAut).release(mnuItemNuevoPerfilLimiteAut).click().build().perform();
        return new NuevoPerfilLimiteAutPage(getDriver());
    }



   /*

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
    }*/
}
