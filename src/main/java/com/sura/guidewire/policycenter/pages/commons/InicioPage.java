package com.sura.guidewire.policycenter.pages.commons;

 import com.sura.guidewire.policycenter.resources.PageUtil;
 import com.sura.guidewire.policycenter.utils.menu.Navegacion;
import com.sura.guidewire.policycenter.utils.menu.acciones.administracion.AdminCodAgenteNuevoPage;
import com.sura.guidewire.policycenter.utils.menu.acciones.administracion.AdminGrupoNuevoPage;
import com.sura.guidewire.policycenter.utils.menu.acciones.administracion.AdminNuevoGrupoAfinidadPage;
import com.sura.guidewire.policycenter.utils.menu.acciones.administracion.AdminOrganizacionNuevaPage;
import com.sura.guidewire.policycenter.utils.menu.acciones.administracion.AdminUsuarioNuevoPage;
import com.sura.guidewire.policycenter.utils.menu.acciones.administracion.AdminVerificarErrorPatronPage;
import com.sura.guidewire.policycenter.utils.menu.acciones.contacto.ContactoNuevaCuentaPage;
 import com.sura.guidewire.policycenter.utils.menu.acciones.escritorio.EscritorioNuevaCuentaPage;
import com.sura.guidewire.policycenter.utils.menu.acciones.escritorio.EscritorioNuevoEnvioPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesCrearPartcCuentaPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesResumenCuentaPage;
 import com.sura.guidewire.policycenter.utils.menu.superior.contacto.BuscarContactoPage;
import com.sura.guidewire.policycenter.utils.menu.superior.contacto.NuevaCompaniaPage;
import com.sura.guidewire.policycenter.utils.menu.superior.contacto.NuevaPersonaPage;
import com.sura.guidewire.policycenter.utils.menu.superior.cuenta.CuentaBuscarPage;
import com.sura.guidewire.policycenter.utils.menu.superior.cuenta.NuevaCuentaPage;
import com.sura.guidewire.policycenter.utils.menu.superior.equipo.EquipoPage;
 import com.sura.guidewire.policycenter.utils.menu.superior.poliza.NuevoEnvioPage;
import com.sura.guidewire.policycenter.utils.menu.superior.poliza.PolizaBuscarPage;
 import com.sura.guidewire.policycenter.utils.menu.acciones.cuenta.*;
 import com.sura.guidewire.policycenter.utils.menu.superior.administracion.*;
 import com.sura.guidewire.policycenter.utils.menu.superior.buscar.*;
 import com.sura.guidewire.policycenter.utils.menu.superior.escritorio.*;
 import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("UnusedReturnValue")
public class InicioPage extends PageUtil {

    private final Navegacion navegacion;
    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")
    private WebElementFacade labelIngreso;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    private WebElementFacade mnuContact;

    public InicioPage(WebDriver driver) {
        super(driver);
        navegacion = new Navegacion(driver);
    }

    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        element(labelIngreso).waitUntilVisible();
        element(mnuContact).waitUntilVisible();
    }

    public void assertion(String element) {
        MatcherAssert.assertThat(labelIngreso.getText().toString(), CoreMatchers.containsString(element));
        waitUntil(WAIT_TIME_3000);
    }

    // Metodos navegacion Escritorio
    public MisActividadesPage irAMisActividades() {
        return navegacion.irAMisActividades();
    }

    public MisCuentasPage irAMisCuentas() {
        return navegacion.irAMisCuentas();
    }

    public MisEnviosPage irAMisEnvios() {
        return navegacion.irAMisEnvios();
    }

    public MisRenovacionesPage irAMisRenovaciones() {
        return navegacion.irAMisRenovaciones();
    }

    public MisOtrasTransacPage irAMisOtrasTransacciones() {
        return navegacion.irAMisOtrasTransacciones();
    }

    public MisColasPage irAMisColas() {
        return navegacion.irAMisColas();
    }

    // Metodos navegacion Cuenta
    public NuevaCuentaPage irANuevaCuenta() {
        return navegacion.irANuevaCuenta();
    }

    public CuentaBuscarPage irACuentaBuscar(String numCuenta) {
        return navegacion.irACuentaBuscar(numCuenta);
    }

    // Metodos navegacion Poliza
    public NuevoEnvioPage irANuevoEnvio() {
        return navegacion.irANuevoEnvio();
    }

    public PolizaBuscarPage irABuscarPoliza(String numPoliza) {
        return navegacion.irABuscarPoliza(numPoliza);
    }

    public PolizaBuscarPage irABuscarSubPoliza(String numSubPoliza) {
        return navegacion.irABuscarSubPoliza(numSubPoliza);
    }

    // Metodos navegacion Contacto
    public NuevaCompaniaPage irANuevaCompania() {
        return navegacion.irANuevaCompania();
    }

    public NuevaPersonaPage irANuevaPersona() {
        return navegacion.irANuevaPersona();
    }

    public BuscarContactoPage irABuscarContacto() {
        return navegacion.irABuscarContacto();
    }

    // Metodos navegacion Buscar
    public BuscarPolizasPage irABuscarPolizas() {
        return navegacion.irABuscarPolizas();
    }

    public BuscarCuentasPage irABuscarCuentas() {
        return navegacion.irABuscarCuentas();
    }

    public BuscarCodAgentePage irABuscarCodAgente() {
        return navegacion.irABuscarCodAgente();
    }

    public BuscarActividadesPage irABuscarActividades() {
        return navegacion.irABuscarActividades();
    }

    public BuscarContactosPage irABuscarContactos() {
        return navegacion.irABuscarContactos();
    }

    // Metodos navegacion Equipo
    public EquipoPage irAEquipo() {
        return navegacion.irAEquipo();
    }

    // Metodos navegacion Administracion
    public AdminUsuariosPage irAAdminUsuarios() {
        return navegacion.irAAdminUsuarios();
    }

    public AdminGruposPage irAAdminGrupos() {
        return navegacion.irAAdminGrupos();
    }

    public AdminRolesPage irAAdminRoles() {
        return navegacion.irAAdminRoles();
    }

    public AdminRegionesPage irAAdminRegiones() {
        return navegacion.irAAdminRegiones();
    }

    public AdminOrganizacionesPage irAAdminOrganizaciones() {
        return navegacion.irAAdminOrganizaciones();
    }

    public AdminCodAgentesPage irAAdminCodAgentes() {
        return navegacion.irAAdminCodAgentes();
    }

    public AdminPerfilAutoridadPage irAAdminPerfilAutoridad() {
        return navegacion.irAAdminPerfilAutoridad();
    }

    public AdminAtributosPage irAAdminAtributos() {
        return navegacion.irAAdminAtributos();
    }

    public AdminGruposAfinidadPage irAAdminGruposAfinidad() {
        return navegacion.irAAdminGruposAfinidad();
    }

    public AdminPatronesActividadPage irAAdminPatronesActividad() {
        return navegacion.irAAdminPatronesActividad();
    }

    public AdminDiasFestivosPage irAAdminDiasFestivos() {
        return navegacion.irAAdminDiasFestivos();
    }

    public AdminPatronesFormPolizaPage irAAdminPatronesFormPoliza() {
        return navegacion.irAAdminPatronesFormPoliza();
    }

    public AdminRetencionPolizasPage irAAdminRetencionPolizas() {
        return navegacion.irAAdminRetencionPolizas();
    }

    public AdminMensajesPage irAAdminMensajes() {
        return navegacion.irAAdminMensajes();
    }

    public AdminColasMensajesPage irAAdminColasMensajes() {
        return navegacion.irAAdminColasMensajes();
    }

    public AdminFlujosTrabajoPage irAAdminFlujosTrabajo() {
        return navegacion.irAAdminFlujosTrabajo();
    }

    public AdminEstadistFlujoTrabajoPage irAAdminEstadistFlujoTrabajo() {
        return navegacion.irAAdminEstadistFlujoTrabajo();
    }

    public AdminImportarDatosPage irAAdminImportarDatos() {
        return navegacion.irAAdminImportarDatos();
    }

    public AdminExportarDatosPage irAAdminExportarDatos() {
        return navegacion.irAAdminExportarDatos();
    }

    public AdminParamSecuenciaPage irAAdminParamSecuencia() {
        return navegacion.irAAdminParamSecuencia();
    }

    public AdminFormatoExportaPage irAAdminFormatoExporta() {
        return navegacion.irAAdminFormatoExporta();
    }

    public AdminCambioDatosPage irAAdminCambioDatos() {
        return navegacion.irAAdminCambioDatos();
    }

    // Metodos Acciones navegacion Escritorio
    public EscritorioNuevoEnvioPage irAEscritorioNuevoEnvio() {
        return navegacion.irAEscritorioNuevoEnvio();
    }

    public EscritorioNuevaCuentaPage irAEscritorioNuevaCuenta() {
        return navegacion.irAEscritorioNuevaCuenta();
    }

    // Metodos Acciones navegacion Cuenta
    public CuentaNuevaNotaPage irACuentaNuevaNota() {
        return navegacion.irACuentaNuevaNota();
    }

    public CuentaLigaDocExistePage irACuentaLigaDocExiste() {
        return navegacion.irACuentaLigaDocExiste();
    }

    public CuentaCreaDocNuevaPlantPage irACuentaCreaDocNuevaPlant() {
        return navegacion.irACuentaCreaDocNuevaPlant();
    }

    public CuentaNuevoCorreoElecPage irACuentaNuevoCorreoElect() {
        return navegacion.irACuentaNuevoCorreoElect();
    }

    public CuentaNuevoEnvioPage irACuentaNuevoEnvioCuenta() {
        return navegacion.irACuentaNuevoEnvioCuenta();
    }

    public CuentaNuevoEnvioPage irANuevoEnvioDeCuenta() {
        return navegacion.irANuevoEnvioDeCuenta();
    }

    public CuentaRevisaNuevoCorreoPage irACuentaRevisaNuevoCorreo() {
        return navegacion.irACuentaRevisaNuevoCorreo();
    }

    public CuentaReuneAgentePage irACuentaReuneAgente() {
        return navegacion.irACuentaReuneAgente();
    }

    public CuentaReuneAseguradoPage irACuentaReuneAsegurado() {
        return navegacion.irACuentaReuneAsegurado();
    }

    public CuentaCancelaPolizDividPage irACuentaCancelaPolizDivid() {
        return navegacion.irACuentaCancelaPolizDivid();
    }

    public CuentaCotizaRequeridaPage irACuentaCotizaRequerida() {
        return navegacion.irACuentaCotizaRequerida();
    }

    public CuentaDiarioX30Page irACuentaDiarioX30() {
        return navegacion.irACuentaDiarioX30();
    }

    public CuentaDiarioX60Page irACuentaDiarioX60() {
        return navegacion.irACuentaDiarioX60();
    }

    public CuentaDiarioX90Page irACuentaDiarioX90() {
        return navegacion.irACuentaDiarioX90();
    }

    public CuentaNotificaPolizaPage irACuentaNotificaPoliza() {
        return navegacion.irACuentaNotificaPoliza();
    }

    public CuentaRecuerdaGeneralPage irACuentaRecuerdaGeneral() {
        return navegacion.irAEscritorioRecuerdaGeneral();
    }

    public CuentaRevisaAgentePage irACuentaRevisaAgente() {
        return navegacion.irACuentaRevisaAgente();
    }

    public CuentaRevPer30DiaAseguraPage irACuentaRevPer30DiaAsegura() {
        return navegacion.irACuentaRevPer30DiaAsegura();
    }

    public CuentaRevPer45DiaAseguraPage irACuentaRevPer45DiaAsegura() {
        return navegacion.irACuentaRevPer45DiaAsegura();
    }

    public CuentaRevPer60DiaAseguraPage irACuentaRevPer60DiaAsegura() {
        return navegacion.irACuentaRevPer60DiaAsegura();
    }

    public CuentaRevisaRendimPage irACuentaRevisaRendim() {
        return navegacion.irACuentaRevisaRendim();
    }

    public CuentaVerificaCoberPage irACuentaVerificaCober() {
        return navegacion.irACuentaVerificaCober();
    }

    public CuentaCreaAgenteNuevPage irACuentaCreaAgenteNuev() {
        return navegacion.irACuentaCreaAgenteNuev();
    }

    public CuentaObtAudPersoInterPage irACuentaObtAudPersoInter() {
        return navegacion.irACuentaObtAudPersoInter();
    }

    public CuentaObtAudServExterPage irACuentaObtAudServExter() {
        return navegacion.irACuentaObtAudServExter();
    }

    public CuentaObtCotizReaseguroPage irACuentaObtCotizReaseguro() {
        return navegacion.irACuentaObtCotizReaseguro();
    }

    public CuentaObtDatoOficPage irACuentaObtDatoOfic() {
        return navegacion.irACuentaObtDatoOfic();
    }

    public CuentaObtInfRiesAgenPage irACuentaObtInfRies() {
        return navegacion.irACuentaObtInfRiesAgen();
    }

    public CuentaObtInfoVehiMotoPage irACuentaObtInfoVehiMoto() {
        return navegacion.irACuentaObtInfoVehiMoto();
    }

    public CuentaObtInspContSiniesPage irACuentaObtInspContSinies() {
        return navegacion.irACuentaObtInspContSinies();
    }

    public CuentaObtInspServExterPage irACuentaObtInspServExter() {
        return navegacion.irACuentaObtInspServExter();
    }

    public CuentaObtReporCredPage irACuentaObtReporCred() {
        return navegacion.irACuentaObtReporCred();
    }

    public CuentaRevisionLegalPage irACuentaRevisionLegal() {
        return navegacion.irACuentaRevisionLegal();
    }

    public CuentaTazaCotPoliManuPage irCuentaTazaCotPoliManu() {
        return navegacion.irCuentaTazaCotPoliManu();
    }

    public CuentaTransPoliACuentaPage irACuentaTransPoliACuenta() {
        return navegacion.irACuentaTransPoliACuenta();
    }

    public CuentaReescrPoliACuentaPage irACuentaReescrPoliACuenta() {
        return navegacion.irACuentaReescrPoliACuenta();
    }

    public CuentaCombPoliACuentaPage irACuentaCombPoliACuenta() {
        return navegacion.irACuentaCombPoliACuenta();
    }

    public CuentaNuevaCotizacionPage irANuevaCotizacion() {
        return navegacion.irANuevaCotizacion();
    }
    // Metodos Acciones navegacion Contacto
    public ContactoNuevaCuentaPage irAContactoNuevaCuenta() {
        return navegacion.irAContactoNuevaCuenta();
    }

    // Metodos Acciones navegacion Administracion
    public AdminUsuarioNuevoPage irAAdminUsuarioNuevo() {
        return navegacion.irAAdminUsuarioNuevo();
    }

    public AdminGrupoNuevoPage irAAdminGrupoNuevo() {
        return navegacion.irAAdminGrupoNuevo();
    }

    public AdminOrganizacionNuevaPage irAAdminOrganizacionNueva() {
        return navegacion.irAAdminOrganizacionNueva();
    }

    public AdminCodAgenteNuevoPage irAAdminCodAgenteNuevo() {
        return navegacion.irAAdminCodAgenteNuevo();
    }

    public AdminNuevoGrupoAfinidadPage irAAdminNuevoGrupoAfinidad() {
        return navegacion.irAAdminNuevoGrupoAfinidad();
    }

    public AdminVerificarErrorPatronPage irAAdminVerificarErrorPatron() {
        return navegacion.irAAdminVerificarErrorPatron();
    }

    //Metodos Opciones Cuentas
    public OpcionesCrearPartcCuentaPage irAOpcionesCrearPartcCuenta() {
        return navegacion.irAOpcionesCrearPartcCuenta();
    }

    public OpcionesResumenCuentaPage irAOpcionesResumenCuenta() {
        return navegacion.irAOpcionesResumenCuenta();
    }

    public OpcionesAdminitradorCotizaciones irAOpcionesAdministradorCotizaciones() {
        return navegacion.irAOpcionesAdministradorCotizaciones();
    }

    public OpcionesInformacionPolizaPage irAInformacionDePoliza() {
        return navegacion.irAInformacionDePoliza();
    }
}