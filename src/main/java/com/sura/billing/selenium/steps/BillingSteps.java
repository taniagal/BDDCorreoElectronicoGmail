package com.sura.billing.selenium.steps;

import com.sura.billing.selenium.pages.AbrirAppPage;
import com.sura.billing.selenium.pages.InicioPage;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jorghome on 22/04/2016.
 */
public class BillingSteps extends ScenarioSteps {

    Guidewire gw = new Guidewire(getDriver());
    AbrirAppPage abrirAppPage = new AbrirAppPage(getDriver());
    InicioPage inicioPage = new InicioPage(getDriver());
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    public BillingSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open() {
        abrirAppPage.open();
    }

    @Step
    public void login(String usuario, String contrasenia) {
        gw.login(usuario, contrasenia);
    }

    @Step
    public void assertion(String element) {
        inicioPage.assertion(element);
    }

    @Step
    @Manual
    public void navegarItemDiasFestivos() {
        //inicioPage.navegarTabBar("Administracion", "Configuracion comercial", "Dias festivos");
    }

    @Step
    public void assertionFestivo(String msj2){
        inicioPage.asercionFestivo(msj2);
    }

    @Step
    public void navegarTabBar() {
        //Menu Escritorio
        /*inicioPage().irAMisActividades();
        waitABit(3000);
        inicioPage().irAEstadosAprobacion();
        waitABit(3000);
        inicioPage().irAMisIncidentes();
        waitABit(3000);
        inicioPage().irAMisMoras();
        waitABit(3000);
        inicioPage().irADesembolsos();
        waitABit(3000);
        inicioPage().irAPagosEnEspera();
        waitABit(3000);
        inicioPage().irAMisElementosAgencia();
        waitABit(3000);
        inicioPage().irACargosRetenidos();
        waitABit(3000);*/

        //Menu Buscar
        /*inicioPage().irABuscarCuentas();
        waitABit(3000);
        inicioPage().irABuscarPolizas();
        waitABit(3000);
        inicioPage().irABuscarContactos();
        waitABit(3000);
        inicioPage().irABuscarFacturas();
        waitABit(3000);
        inicioPage().irABuscarPagos();
        waitABit(3000);
        inicioPage().irABuscarAgentes();
        waitABit(3000);
        inicioPage().irABuscarTransacciones();
        waitABit(3000);
        inicioPage().irABuscarActividades();
        waitABit(3000);
        inicioPage().irABuscarTicketsProblemas();
        waitABit(3000);
        inicioPage().irABuscarProcesosMora();
        waitABit(3000);
        inicioPage().irABuscarDesembolsos();
        waitABit(3000);
        inicioPage().irABuscarPagoSalAgente();
        waitABit(3000);
        inicioPage().irABuscarSolicitudesPago();
        waitABit(3000);
        inicioPage().irABuscarElementosEsperaFactDirecta();
        waitABit(3000);*/

        //Menu Administracion
        //Admin Usuarios y seguridad
        /*inicioPage().irAAdminUsuarios();
        waitABit(3000);
        inicioPage().irAAdminGrupos();
        waitABit(3000);
        inicioPage().irAAdminFunciones();
        waitABit(3000);
        inicioPage().irAAdminZonasSeguridad();
        waitABit(3000);
        inicioPage().irAAdminPerfilLimiteAutoridad();
        waitABit(3000);*/

        //Admin Configuracion comercial
        /*inicioPage().irAAdminPatronesAct();
        waitABit(3000);
        inicioPage().irAAdminPlanesFactAgencia();
        waitABit(3000);
        inicioPage().irAAdminPlanesFacturacion();
        waitABit(3000);
        inicioPage().irAAdminPatronesCargo();
        waitABit(3000);
        inicioPage().irAAdminAgenciasCobro();
        waitABit(3000);
        inicioPage().irAAdminPlanesComision();
        waitABit(3000);
        inicioPage().irAAdminPlanesMora();
        waitABit(3000);
        inicioPage().irAAdminDiasFestivos();
        waitABit(3000);
        inicioPage().irAAdminPlanesAsignaPago();
        waitABit(3000);
        inicioPage().irAAdminPlanesPagos();
        waitABit(3000);
        inicioPage().irAAdminPlanesDevolPrima();
        waitABit(3000);*/

        //Admin Supervision
        /*inicioPage().irAAdminColasMensajes();
        waitABit(3000);
        inicioPage().irAAdminFlujosTrabajo();
        waitABit(3000);
        inicioPage().irAAdminEstadistFlujosTrabajo();
        waitABit(3000);*/

        //Admin Utilidades
        /*inicioPage().irAAdminImpotarDatos();
        waitABit(3000);
        inicioPage().irAAdminExpotarDatos();
        waitABit(3000);
        inicioPage().irAAdminParamSecuencia();
        waitABit(3000);
        inicioPage().irAAdminCambioDatos();
        waitABit(3000);*/

        //Acciones Escritorio
        /*inicioPage().irAAccionEPagoEspera();
        waitABit(3000);
        inicioPage().irAAccionEEntradaPagosMultiples();
        waitABit(3000);
        inicioPage().irAAccionESolicitudPago();
        waitABit(3000);
        inicioPage().irAAccionEDesembolso();
        waitABit(3000);
        inicioPage().irAAccionETransferencia();
        waitABit(3000);
        inicioPage().irAAccionEAnulacion();
        waitABit(3000);
        inicioPage().irAAccionEAnulacionNegativa();
        waitABit(3000);
        inicioPage().irAAccionESubrogacion();
        waitABit(3000);
        inicioPage().irAAccionEReversionCargo();
        waitABit(3000);
        inicioPage().irAAccionEReversionAnulacion();
        waitABit(3000);
        inicioPage().irAAccionEReversionAnulacionNegativa();
        waitABit(3000);
        inicioPage().irAAccionEReversionTransfFondos();
        waitABit(3000);
        inicioPage().irAAccionETransaccionGeneral();
        waitABit(3000);
        inicioPage().irAAccionENotificacionAsignada();
        waitABit(3000);
        inicioPage().irAAccionEWriteOffAttemptedAboveThresholdAsignada();
        waitABit(3000);
        inicioPage().irAAccionENotificacionCompartida();
        waitABit(3000);
        inicioPage().irAAccionEWriteOffAttemptedAboveThresholdCompartida();
        waitABit(3000);
        inicioPage().irAAccionEPreferencias();
        waitABit(3000);*/

        //Acciones Cuenta
        /*inicioPage().irAAccionCCuentaNueva();
        waitABit(3000);*/

        //Acciones Agente
        /*inicioPage().irAAccionAAgenteNuevo();
        waitABit(3000);*/

        //Acciones Administracion
        /*inicioPage().irAAccionANuevoPlanFact();
        waitABit(3000);
        inicioPage().irAAccionANuevoPlanPago();
        waitABit(3000);
        inicioPage().irAAccionANuevoPlanComision();
        waitABit(3000);
        inicioPage().irAAccionANuevoPlanMora();
        waitABit(3000);
        inicioPage().irAAccionANuevoPlanFactAgencia();
        waitABit(3000);
        inicioPage().irAAccionANuevoPlanDevolPrima();
        waitABit(3000);
        inicioPage().irAAccionANuevoPlanAsignaPagos();
        waitABit(3000);
        inicioPage().irAAccionANuevaAgenciaCobro();
        waitABit(3000);
        inicioPage().irAAccionANuevoPatronCargoInmediato();
        waitABit(3000);
        inicioPage().irAAccionANuevoPatronCargoTransfDirecta();
        waitABit(3000);
        inicioPage().irAAccionANuevoPatronCargoProrrata();
        waitABit(3000);
        inicioPage().irAAccionANuevoPatronCargoRecaptura();
        waitABit(3000);
        inicioPage().irAAccionANuevoUsuario();
        waitABit(3000);
        inicioPage().irAAccionANuevaFuncion();
        waitABit(3000);
        inicioPage().irAAccionANuevoGrupo();
        waitABit(3000);
        inicioPage().irAAccionANuevoPerfilLimiteAut();
        waitABit(3000);*/


    }

    @Step
    public void logout() {
        gw.logout();
    }

    public void buscarMenu(String numCuenta, String numPoliza, String numAgente) {
        /*inicioPage().irACuentaBuscar(numCuenta);
        waitABit(3000);
        inicioPage().irAPolizaBuscar(numPoliza);
        waitABit(3000);
        inicioPage().irAAgenteBuscar(numAgente);
        waitABit(3000);*/
    }
}
