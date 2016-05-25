package com.sura.billing.selenium.pages;

import com.sura.billing.selenium.pages.menu.Navegacion;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevaAgenciaCobroPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevaFuncionPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoGrupoPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPatronCargoInmediatoPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPatronCargoProrrataPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPatronCargoRecapturaPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPatronCargoTransfDirectaPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPerfilLimiteAutPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPlanAsignaPagosPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPlanComisionPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPlanDevolPrimaPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPlanFactAgenciaPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPlanFactPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPlanMoraPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoPlanPagoPage;
import com.sura.billing.selenium.pages.menu.acciones.administracion.NuevoUsuarioPage;
import com.sura.billing.selenium.pages.menu.acciones.agente.AgenteNuevoPage;
import com.sura.billing.selenium.pages.menu.acciones.cuenta.CuentaNuevaPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.AnulacionNegativaPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.AnulacionPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.DesembolsoPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.EntradaPagosMultiplesPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.NotificacionAsignadaPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.NotificacionCompartidaPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.PagoEsperaPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.PreferenciasPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.ReversionAnulacionNegativaPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.ReversionAnulacionPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.ReversionCargoPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.ReversionTransfFondosPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.SolicitudPagoPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.SubrogacionPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.TransaccionGeneralPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.TransferenciaPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.WriteOffAttemptedAboveThresholdAsignadaPage;
import com.sura.billing.selenium.pages.menu.acciones.escritorio.WriteOffAttemptedAboveThresholdCompartidaPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminAgenciasCobroPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminCambioDatosPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminColasMensajesPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminDiasFestivosPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminEstadistFlujosTrabajoPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminExpotarDatosPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminFlujosTrabajoPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminFuncionesPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminGruposPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminImpotarDatosPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminParamSecuenciaPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPatronesActPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPatronesCargoPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPerfilLimiteAutoridadPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPlanesAsignaPagoPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPlanesComisionPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPlanesDevolPrimaPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPlanesFactAgenciaPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPlanesFacturacionPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPlanesMoraPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminPlanesPagosPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminUsuariosPage;
import com.sura.billing.selenium.pages.menu.principal.administracion.AdminZonasSeguridadPage;
import com.sura.billing.selenium.pages.menu.principal.agente.AgenteBuscarPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarActividadesPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarAgentesPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarContactosPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarCuentasPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarDesembolsosPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarElementosEsperaFactDirectaPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarFacturasPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarPagoSalAgentePage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarPagosPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarPolizasPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarProcesosMoraPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarSolicitudesPagoPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarTicketsProblemasPage;
import com.sura.billing.selenium.pages.menu.principal.buscar.BuscarTransacPage;
import com.sura.billing.selenium.pages.menu.principal.cuenta.CuentaBuscarPage;
import com.sura.billing.selenium.pages.menu.principal.escritorio.CargosRetenidosPage;
import com.sura.billing.selenium.pages.menu.principal.escritorio.DesembolsosPage;
import com.sura.billing.selenium.pages.menu.principal.escritorio.EstadosAprobacionPage;
import com.sura.billing.selenium.pages.menu.principal.escritorio.MisActividadesPage;
import com.sura.billing.selenium.pages.menu.principal.escritorio.MisElementosAgenciaPage;
import com.sura.billing.selenium.pages.menu.principal.escritorio.MisIncidentesPage;
import com.sura.billing.selenium.pages.menu.principal.escritorio.MisMorasPage;
import com.sura.billing.selenium.pages.menu.principal.escritorio.PagosEnEsperaPage;
import com.sura.billing.selenium.pages.menu.principal.poliza.PolizaBuscarPage;
import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

public class InicioPage extends Guidewire {
    @FindBy(xpath = ".//*[@id='UserSearch:UserSearchScreen:ttlBar']")
    private WebElementFacade labelIngreso;
    @FindBy(xpath = ".//*[@id='HolidaysPage:HolidaysScreen:0']")
    private WebElementFacade labelIngreso2;
    @FindBy(xpath=".//*[@id='TabBar:AdministrationTab-btnWrap']")
    private WebElementFacade mnuAdministracion;
    private final Guidewire gw = new Guidewire(getDriver());
    private final Navegacion navegacion;

    public InicioPage(WebDriver driver) {
        super(driver);
        navegacion = new Navegacion(getDriver());
    }

    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        element(labelIngreso).waitUntilVisible();
        element(mnuAdministracion).waitUntilVisible();
    }

    public void assertion(String mensaje){
        gw.asercion(labelIngreso.getText(),mensaje);
    }

    public void asercionFestivo(String msj2){
        gw.asercion(labelIngreso2.getText(),msj2);
    }

    // Metodos navegacion Escritorio
    public MisActividadesPage irAMisActividades() {
        return navegacion.irAMisActividades();
    }
    public EstadosAprobacionPage irAEstadosAprobacion() {
        return navegacion.irAEstadosAprobacion();
    }
    public MisIncidentesPage irAMisIncidentes() {
        return navegacion.irAMisIncidentes();
    }
    public MisMorasPage irAMisMoras() {
        return navegacion.irAMisMoras();
    }
    public DesembolsosPage irADesembolsos() {
        return navegacion.irADesembolsos();
    }
    public PagosEnEsperaPage irAPagosEnEspera() {
        return navegacion.irAPagosEnEspera();
    }
    public MisElementosAgenciaPage irAMisElementosAgencia() {
        return navegacion.irAMisElementosAgencia();
    }
    public CargosRetenidosPage irACargosRetenidos() {
        return navegacion.irACargosRetenidos();
    }

    // Metodos navegacion Cuenta
    public CuentaBuscarPage irACuentaBuscar(String numCuenta) {
        return navegacion.irACuentaBuscar(numCuenta);
    }

    // Metodos navegacion Poliza
    public PolizaBuscarPage irAPolizaBuscar(String numPoliza) {
        return navegacion.irAPolizaBuscar(numPoliza);
    }

    // Metodos navegacion Agente
    public AgenteBuscarPage irAAgenteBuscar(String numAgente) {
        return navegacion.irAAgenteBuscar(numAgente);
    }

    // Metodos navegacion Buscar
    public BuscarCuentasPage irABuscarCuentas() {
        return navegacion.irABuscarCuentas();
    }
    public BuscarPolizasPage irABuscarPolizas() {
        return navegacion.irABuscarPolizas();
    }
    public BuscarContactosPage irABuscarContactos() {
        return navegacion.irABuscarContactos();
    }
    public BuscarFacturasPage irABuscarFacturas() {
        return navegacion.irABuscarFacturas();
    }
    public BuscarPagosPage irABuscarPagos() {
        return navegacion.irABuscarPagos();
    }
    public BuscarAgentesPage irABuscarAgentes() {
        return navegacion.irABuscarAgentes();
    }
    public BuscarTransacPage irABuscarTransacciones() {
        return navegacion.irABuscarTransacciones();
    }
    public BuscarActividadesPage irABuscarActividades() {
        return navegacion.irABuscarActividades();
    }
    public BuscarTicketsProblemasPage irABuscarTicketsProblemas() {
        return navegacion.irABuscarTicketsProblemas();
    }
    public BuscarProcesosMoraPage irABuscarProcesosMora() {
        return navegacion.irABuscarProcesosMora();
    }
    public BuscarDesembolsosPage irABuscarDesembolsos() {
        return navegacion.irABuscarDesembolsos();
    }
    public BuscarPagoSalAgentePage irABuscarPagoSalAgente() {
        return navegacion.irABuscarPagoSalAgente();
    }
    public BuscarSolicitudesPagoPage irABuscarSolicitudesPago() {
        return navegacion.irABuscarSolicitudesPago();
    }
    public BuscarElementosEsperaFactDirectaPage irABuscarElementosEsperaFactDirecta() {
        return navegacion.irABuscarElementosEsperaFactDirecta();
    }

    // Metodos navegacion Administracion
    // Admin Usuarios y Seguridad
    public AdminUsuariosPage irAAdminUsuarios() {
        return navegacion.irAAdminUsuarios();
    }
    public AdminGruposPage irAAdminGrupos() {
        return navegacion.irAAdminGrupos();
    }
    public AdminFuncionesPage irAAdminFunciones() {
        return navegacion.irAAdminFunciones();
    }
    public AdminZonasSeguridadPage irAAdminZonasSeguridad() {
        return navegacion.irAAdminZonasSeguridad();
    }
    public AdminPerfilLimiteAutoridadPage irAAdminPerfilLimiteAutoridad() {
        return navegacion.irAAdminPerfilLimiteAutoridad();
    }

    // Admin Configuracion Comercial
    public AdminPatronesActPage irAAdminPatronesAct() {
        return navegacion.irAAdminPatronesAct();
    }
    public AdminPlanesFactAgenciaPage irAAdminPlanesFactAgencia() {
        return navegacion.irAAdminPlanesFactAgencia();
    }
    public AdminPlanesFacturacionPage irAAdminPlanesFacturacion() {
        return navegacion.irAAdminPlanesFacturacion();
    }
    public AdminPatronesCargoPage irAAdminPatronesCargo() {
        return navegacion.irAAdminPatronesCargo();
    }
    public AdminAgenciasCobroPage irAAdminAgenciasCobro() {
        return navegacion.irAAdminAgenciasCobro();
    }
    public AdminPlanesComisionPage irAAdminPlanesComision() {
        return navegacion.irAAdminPlanesComision();
    }
    public AdminPlanesMoraPage irAAdminPlanesMora() {
        return navegacion.irAAdminPlanesMora();
    }
    public AdminDiasFestivosPage irAAdminDiasFestivos() {
        return navegacion.irAAdminDiasFestivos();
    }
    public AdminPlanesAsignaPagoPage irAAdminPlanesAsignaPago() {
        return navegacion.irAAdminPlanesAsignaPago();
    }
    public AdminPlanesPagosPage irAAdminPlanesPagos() {
        return navegacion.irAAdminPlanesPagos();
    }
    public AdminPlanesDevolPrimaPage irAAdminPlanesDevolPrima() {
        return navegacion.irAAdminPlanesDevolPrima();
    }

    //Admin Supervision
    public AdminColasMensajesPage irAAdminColasMensajes() {
        return navegacion.irAAdminColasMensajes();
    }
    public AdminFlujosTrabajoPage irAAdminFlujosTrabajo() {
        return navegacion.irAAdminFlujosTrabajo();
    }
    public AdminEstadistFlujosTrabajoPage irAAdminEstadistFlujosTrabajo() {
        return navegacion.irAAdminEstadistFlujosTrabajo();
    }

    //Admin Utilidades
    public AdminImpotarDatosPage irAAdminImpotarDatos() {
        return navegacion.irAAdminImpotarDatos();
    }
    public AdminExpotarDatosPage irAAdminExpotarDatos() {
        return navegacion.irAAdminExpotarDatos();
    }
    public AdminParamSecuenciaPage irAAdminParamSecuencia() {
        return navegacion.irAAdminParamSecuencia();
    }
    public AdminCambioDatosPage irAAdminCambioDatos() {
        return navegacion.irAAdminCambioDatos();
    }

    // Metodos navegacion Acciones Escritorio
    public PagoEsperaPage irAAccionEPagoEspera() {
        return navegacion.irAAccionEPagoEspera();
    }
    public EntradaPagosMultiplesPage irAAccionEEntradaPagosMultiples() {
        return navegacion.irAAccionEEntradaPagosMultiples();
    }
    public SolicitudPagoPage irAAccionESolicitudPago() {
        return navegacion.irAAccionESolicitudPago();
    }
    public DesembolsoPage irAAccionEDesembolso() {
        return navegacion.irAAccionEDesembolso();
    }
    public TransferenciaPage irAAccionETransferencia() {
        return navegacion.irAAccionETransferencia();
    }
    public AnulacionPage irAAccionEAnulacion() {
        return navegacion.irAAccionEAnulacion();
    }
    public AnulacionNegativaPage irAAccionEAnulacionNegativa() {
        return navegacion.irAAccionEAnulacionNegativa();
    }
    public SubrogacionPage irAAccionESubrogacion() {
        return navegacion.irAAccionESubrogacion();
    }
    public ReversionCargoPage irAAccionEReversionCargo() {
        return navegacion.irAAccionEReversionCargo();
    }
    public ReversionAnulacionPage irAAccionEReversionAnulacion() {
        return navegacion.irAAccionEReversionAnulacion();
    }
    public ReversionAnulacionNegativaPage irAAccionEReversionAnulacionNegativa() {
        return navegacion.irAAccionEReversionAnulacionNegativa();
    }
    public ReversionTransfFondosPage irAAccionEReversionTransfFondos() {
        return navegacion.irAAccionEReversionTransfFondos();
    }
    public TransaccionGeneralPage irAAccionETransaccionGeneral() {
        return navegacion.irAAccionETransaccionGeneral();
    }
    public NotificacionAsignadaPage irAAccionENotificacionAsignada() {
        return navegacion.irAAccionENotificacionAsignada();
    }
    public WriteOffAttemptedAboveThresholdAsignadaPage irAAccionEWriteOffAttemptedAboveThresholdAsignada() {
        return navegacion.irAAccionEWriteOffAttemptedAboveThresholdAsignada();
    }
    public NotificacionCompartidaPage irAAccionENotificacionCompartida() {
        return navegacion.irAAccionENotificacionCompartida();
    }
    public WriteOffAttemptedAboveThresholdCompartidaPage irAAccionEWriteOffAttemptedAboveThresholdCompartida() {
        return navegacion.irAAccionEWriteOffAttemptedAboveThresholdCompartida();
    }
    public PreferenciasPage irAAccionEPreferencias() {
        return navegacion.irAAccionEPreferencias();
    }

    // Metodos navegacion Acciones Cuenta
    public CuentaNuevaPage irAAccionCCuentaNueva() {
        return navegacion.irAAccionCCuentaNueva();
    }

    // Metodos navegacion Acciones Agente
    public AgenteNuevoPage irAAccionAAgenteNuevo() {
        return navegacion.irAAccionAAgenteNuevo();
    }

    // Metodos navegacion Acciones Administracion
    public NuevoPlanFactPage irAAccionANuevoPlanFact() {
        return navegacion.irAAccionANuevoPlanFact();
    }
    public NuevoPlanPagoPage irAAccionANuevoPlanPago() {
        return navegacion.irAAccionANuevoPlanPago();
    }
    public NuevoPlanComisionPage irAAccionANuevoPlanComision() {
        return navegacion.irAAccionANuevoPlanComision();
    }
    public NuevoPlanMoraPage irAAccionANuevoPlanMora() {
        return navegacion.irAAccionANuevoPlanMora();
    }
    public NuevoPlanFactAgenciaPage irAAccionANuevoPlanFactAgencia() {
        return navegacion.irAAccionANuevoPlanFactAgencia();
    }
    public NuevoPlanDevolPrimaPage irAAccionANuevoPlanDevolPrima() {
        return navegacion.irAAccionANuevoPlanDevolPrima();
    }
    public NuevoPlanAsignaPagosPage irAAccionANuevoPlanAsignaPagos() {
        return navegacion.irAAccionANuevoPlanAsignaPagos();
    }
    public NuevaAgenciaCobroPage irAAccionANuevaAgenciaCobro() {
        return navegacion.irAAccionANuevaAgenciaCobro();
    }
    public NuevoPatronCargoInmediatoPage irAAccionANuevoPatronCargoInmediato() {
        return navegacion.irAAccionANuevoPatronCargoInmediato();
    }
    public NuevoPatronCargoTransfDirectaPage irAAccionANuevoPatronCargoTransfDirecta() {
        return navegacion.irAAccionANuevoPatronCargoTransfDirecta();
    }
    public NuevoPatronCargoProrrataPage irAAccionANuevoPatronCargoProrrata() {
        return navegacion.irAAccionANuevoPatronCargoProrrata();
    }
    public NuevoPatronCargoRecapturaPage irAAccionANuevoPatronCargoRecaptura() {
        return navegacion.irAAccionANuevoPatronCargoRecaptura();
    }
    public NuevoUsuarioPage irAAccionANuevoUsuario() {
        return navegacion.irAAccionANuevoUsuario();
    }
    public NuevaFuncionPage irAAccionANuevaFuncion() {
        return navegacion.irAAccionANuevaFuncion();
    }
    public NuevoGrupoPage irAAccionANuevoGrupo() {
        return navegacion.irAAccionANuevoGrupo();
    }
    public NuevoPerfilLimiteAutPage irAAccionANuevoPerfilLimiteAut() {
        return navegacion.irAAccionANuevoPerfilLimiteAut();
    }

}
