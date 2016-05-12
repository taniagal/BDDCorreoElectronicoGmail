package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.menu.Navegacion;
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
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class InicioPage extends Guidewire {

    Guidewire gw = new Guidewire(getDriver());
    Navegacion navegacion;

    public InicioPage(WebDriver driver) {
        super(driver);
        navegacion = new Navegacion(driver);
    }

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")
    WebElementFacade labelIngreso;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    WebElementFacade mnuContact;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact-arrowEl']")
    WebElementFacade mnuNewContact;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewPerson-itemEl']")
    WebElementFacade mnuNewPerson;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewCompany-textEl']")
    WebElementFacade mnuNewCompany;



    // TODO: 18/04/2016 Revision escritura de excepciones en log
    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        try {
            element(labelIngreso).waitUntilVisible();
            element(mnuContact).waitUntilVisible();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: 18/04/2016 Revision escritura de excepciones en log
    public void assertion(String element) {
        try {
            assertThat(labelIngreso.getText().toString(), containsString(element));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: 18/04/2016 Revision escritura de excepciones en log
    public void nuevoContactoPersona() {

        try {
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuNewContact).click().build().perform();
            act.moveToElement(mnuNewPerson).click().build().perform();

            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

    }

    public void nuevoContactoPersonaJuridica() {

        try {
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuNewContact).click().build().perform();
            act.moveToElement(mnuNewCompany).click().build().perform();

            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

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

    public NuevaCuentaPage irANuevaCuenta() {
        return navegacion.irANuevaCuenta();
    }

    public PolizaBuscarPage irABuscarPoliza(String numPoliza) {
        return navegacion.irABuscarPoliza(numPoliza);
    }

    public NuevoEnvioPage irANuevoEnvio() {
        return navegacion.irANuevoEnvio();
    }

    public NuevaCompaniaPage irANuevaCompania() {
        return navegacion.irANuevaCompania();
    }

    public NuevaPersonaPage irANuevaPersona() {
        return navegacion.irANuevaPersona();
    }

    public BuscarContactoPage irABuscarContacto() {
        return navegacion.irABuscarContacto();
    }

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

    public EquipoPage irAEquipo() {
        return navegacion.irAEquipo();
    }

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

    public EscritorioNuevoEnvioPage irAEscritorioNuevoEnvio() {
        return navegacion.irAEscritorioNuevoEnvio();
    }

    public EscritorioNuevaCuentaPage irAEscritorioNuevaCuenta() {
        return navegacion.irAEscritorioNuevaCuenta();
    }

    public CuentaNuevaNotaPage irAEscritorioNuevaNota() {
        return navegacion.irAEscritorioNuevaNota();
    }

    public CuentaLigaDocExistePage irAEscritorioLigaDocExiste() {
        return navegacion.irAEscritorioLigaDocExiste();
    }

    public CuentaCreaDocNuevaPlantPage irACreaDocNuevaPlantPage() {
        return navegacion.irACreaDocNuevaPlantPage();
    }

    public CuentaNuevoCorreoElecPage irAEscritorioNuevoCorreoElect(){
        return navegacion.irAEscritorioNuevoCorreoElect();
    }

    public CuentaNuevoEnvioPage irAEscritorioNuevoEnvioCuentaPage(){
        return navegacion.irAEscritorioNuevoEnvioCuentaPage();
    }

    public CuentaRevisaNuevoCorreoPage irAEscritorioRevisaNuevoCorreoPage(){
        return navegacion.irAEscritorioRevisaNuevoCorreoPage();
    }

    public CuentaReuneAgentePage irAEscritorioReuneAgentePage(){
        return navegacion.irAEscritorioReuneAgentePage();
    }

    public CuentaReuneAseguradoPage irAEscritorioReuneAseguradoPage(){
        return navegacion.irAEscritorioReuneAseguradoPage();
    }

    public CuentaCancelaPolizDividPage irAEscritorioCancelaPolizDividPage(){
        return navegacion.irAEscritorioCancelaPolizDividPage();
    }

    public CuentaCotizaRequeridaPage irAEscritorioCotizaRequeridaPage(){
        return navegacion.irAEscritorioCotizaRequeridaPage();
    }

    public CuentaDiarioX30Page irAEscritorioDiarioX30Page(){
        return navegacion.irAEscritorioDiarioX30Page();
    }

    public CuentaDiarioX60Page irAEscritorioDiarioX60Page(){
        return navegacion.irAEscritorioDiarioX60Page();
    }

    public CuentaDiarioX90Page irAEscritorioDiarioX90Page(){
        return navegacion.irAEscritorioDiarioX90Page();
    }

    public CuentaNotificaPolizaPage irAEscritorioNotificaPolizaPage(){
        return navegacion.irAEscritorioNotificaPolizaPage();
    }

    public CuentaRevisaAgentePage irAEscritorioRevisaAgentePage(){
        return navegacion.irAEscritorioRevisaAgentePage();
    }

    public CuentaRevPer30DiaAseguraPage irAEscritorioRevPer30DiaAseguraPage(){
        return navegacion.irAEscritorioRevPer30DiaAseguraPage();
    }

    public CuentaRevPer45DiaAseguraPage irAEscritorioRevPer45DiaAseguraPage(){
        return navegacion.irAEscritorioRevPer45DiaAseguraPage();
    }

    public CuentaRevPer60DiaAseguraPage irAEscritorioRevPer60DiaAseguraPage(){
        return navegacion.irAEscritorioRevPer60DiaAseguraPage();
    }

    public CuentaRevisaRendimPage irAEscritorioRevisaRendimPage(){
        return navegacion.irAEscritorioRevisaRendimPage();
    }

    public CuentaVerificaCoberPage irAEscritorioVerificaCoberPage(){
        return navegacion.irAEscritorioVerificaCoberPage();
    }

    public CuentaTransPoliACuentaPage irAEscritorioTransPoliACuentaPage(){
        return navegacion.irAEscritorioTransPoliACuentaPage();
    }

    public CuentaReescrPoliACuentaPage irAEscritorioReescrPoliACuentaPage(){
        return navegacion.irAEscritorioReescrPoliACuentaPage();
    }

    public CuentaConvPoliACuentaPage irAEscritorioConvPoliACuentaPage(){
        return navegacion.irAEscritorioConvPoliACuentaPage();
    }

    public ContactoNuevaCuentaPage irAContactoNuevaCuenta() {
        return navegacion.irAContactoNuevaCuenta();
    }

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

}
