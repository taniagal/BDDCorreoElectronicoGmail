package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.menu.acciones.*;
import com.sura.policycenter.selenium.pages.menu.tabbar.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class EscritorioPage extends Guidewire {

    Guidewire gw = new Guidewire(getDriver());
    BarraNavegacion barraNavegacion;

    public EscritorioPage(WebDriver driver) {
        super(driver);
        barraNavegacion = new BarraNavegacion(driver);
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
        return barraNavegacion.irAMisActividades();
    }

    public MisCuentasPage irAMisCuentas() {
        return barraNavegacion.irAMisCuentas();
    }

    public MisEnviosPage irAMisEnvios() {
        return barraNavegacion.irAMisEnvios();
    }

    public MisRenovacionesPage irAMisRenovaciones() {
        return barraNavegacion.irAMisRenovaciones();
    }

    public MisOtrasTransacPage irAMisOtrasTransacciones() {
        return barraNavegacion.irAMisOtrasTransacciones();
    }

    public MisColasPage irAMisColas() {
        return barraNavegacion.irAMisColas();
    }

    public NuevaCuentaPage irANuevaCuenta() {
        return barraNavegacion.irANuevaCuenta();
    }

    public NuevoEnvioPage irANuevoEnvio() {
        return barraNavegacion.irANuevoEnvio();
    }

    public NuevaCompaniaPage irANuevaCompania() {
        return barraNavegacion.irANuevaCompania();
    }

    public NuevaPersonaPage irANuevaPersona() {
        return barraNavegacion.irANuevaPersona();
    }

    public BuscarContactoPage irABuscarContacto() {
        return barraNavegacion.irABuscarContacto();
    }

    public BuscarPolizasPage irABuscarPolizas() {
        return barraNavegacion.irABuscarPolizas();
    }

    public BuscarCuentasPage irABuscarCuentas() {
        return barraNavegacion.irABuscarCuentas();
    }

    public BuscarCodAgentePage irABuscarCodAgente() {
        return barraNavegacion.irABuscarCodAgente();
    }

    public BuscarActividadesPage irABuscarActividades() {
        return barraNavegacion.irABuscarActividades();
    }

    public BuscarContactosPage irABuscarContactos() {
        return barraNavegacion.irABuscarContactos();
    }

    public EquipoPage irAEquipo() {
        return barraNavegacion.irAEquipo();
    }

    public AdminUsuariosPage irAAdminUsuarios() {
        return barraNavegacion.irAAdminUsuarios();
    }

    public AdminGruposPage irAAdminGrupos() {
        return barraNavegacion.irAAdminGrupos();
    }

    public AdminRolesPage irAAdminRoles() {
        return barraNavegacion.irAAdminRoles();
    }

    public AdminRegionesPage irAAdminRegiones() {
        return barraNavegacion.irAAdminRegiones();
    }

    public AdminOrganizacionesPage irAAdminOrganizaciones() {
        return barraNavegacion.irAAdminOrganizaciones();
    }

    public AdminCodAgentesPage irAAdminCodAgentes() {
        return barraNavegacion.irAAdminCodAgentes();
    }

    public AdminPerfilAutoridadPage irAAdminPerfilAutoridad() {
        return barraNavegacion.irAAdminPerfilAutoridad();
    }

    public AdminAtributosPage irAAdminAtributos() {
        return barraNavegacion.irAAdminAtributos();
    }

    public AdminGruposAfinidadPage irAAdminGruposAfinidad() {
        return barraNavegacion.irAAdminGruposAfinidad();
    }

    public AdminPatronesActividadPage irAAdminPatronesActividad() {
        return barraNavegacion.irAAdminPatronesActividad();
    }

    public AdminDiasFestivosPage irAAdminDiasFestivos() {
        return barraNavegacion.irAAdminDiasFestivos();
    }

    public AdminPatronesFormPolizaPage irAAdminPatronesFormPoliza() {
        return barraNavegacion.irAAdminPatronesFormPoliza();
    }

    public AdminRetencionPolizasPage irAAdminRetencionPolizas() {
        return barraNavegacion.irAAdminRetencionPolizas();
    }

    public AdminMensajesPage irAAdminMensajes() {
        return barraNavegacion.irAAdminMensajes();
    }

    public AdminColasMensajesPage irAAdminColasMensajes() {
        return barraNavegacion.irAAdminColasMensajes();
    }

    public AdminFlujosTrabajoPage irAAdminFlujosTrabajo() {
        return barraNavegacion.irAAdminFlujosTrabajo();
    }

    public AdminEstadistFlujoTrabajoPage irAAdminEstadistFlujoTrabajo() {
        return barraNavegacion.irAAdminEstadistFlujoTrabajo();
    }

    public AdminImportarDatosPage irAAdminImportarDatos() {
        return barraNavegacion.irAAdminImportarDatos();
    }

    public AdminExportarDatosPage irAAdminExportarDatos() {
        return barraNavegacion.irAAdminExportarDatos();
    }

    public AdminParamSecuenciaPage irAAdminParamSecuencia() {
        return barraNavegacion.irAAdminParamSecuencia();
    }

    public AdminFormatoExportaPage irAAdminFormatoExporta() {
        return barraNavegacion.irAAdminFormatoExporta();
    }

    public AdminCambioDatosPage irAAdminCambioDatos() {
        return barraNavegacion.irAAdminCambioDatos();
    }

    public EscritorioNuevoEnvioPage irAEscritorioNuevoEnvio() {
        return barraNavegacion.irAEscritorioNuevoEnvio();
    }

    public EscritorioNuevaCuentaPage irAEscritorioNuevaCuenta() {
        return barraNavegacion.irAEscritorioNuevaCuenta();
    }

    public EscritorioNuevaNotaPage irAEscritorioNuevaNota() {
        return barraNavegacion.irAEscritorioNuevaNota();
    }

    public EscritorioLigaDocExistePage irAEscritorioLigaDocExiste() {
        return barraNavegacion.irAEscritorioLigaDocExiste();
    }

    public EscritorioCreaDocNuevaPlantPage irACreaDocNuevaPlantPage() {
        return barraNavegacion.irACreaDocNuevaPlantPage();
    }

    public EscritorioNuevoCorreoElecPage irAEscritorioNuevoCorreoElect(){
        return barraNavegacion.irAEscritorioNuevoCorreoElect();
    }

    public EscritorioNuevoEnvioCuentaPage irAEscritorioNuevoEnvioCuentaPage(){
        return barraNavegacion.irAEscritorioNuevoEnvioCuentaPage();
    }

    public EscritorioRevisaNuevoCorreoPage irAEscritorioRevisaNuevoCorreoPage(){
        return barraNavegacion.irAEscritorioRevisaNuevoCorreoPage();
    }

    public EscritorioReuneAgentePage irAEscritorioReuneAgentePage(){
        return barraNavegacion.irAEscritorioReuneAgentePage();
    }

    public EscritorioReuneAseguradoPage irAEscritorioReuneAseguradoPage(){
        return barraNavegacion.irAEscritorioReuneAseguradoPage();
    }

    public EscritorioCancelaPolizDividPage irAEscritorioCancelaPolizDividPage(){
        return barraNavegacion.irAEscritorioCancelaPolizDividPage();
    }

    public EscritorioCotizaRequeridaPage irAEscritorioCotizaRequeridaPage(){
        return barraNavegacion.irAEscritorioCotizaRequeridaPage();
    }

    public EscritorioDiarioX30Page irAEscritorioDiarioX30Page(){
        return barraNavegacion.irAEscritorioDiarioX30Page();
    }

    public EscritorioDiarioX60Page irAEscritorioDiarioX60Page(){
        return barraNavegacion.irAEscritorioDiarioX60Page();
    }

    public EscritorioDiarioX90Page irAEscritorioDiarioX90Page(){
        return barraNavegacion.irAEscritorioDiarioX90Page();
    }

    public EscritorioNotificaPolizaPage irAEscritorioNotificaPolizaPage(){
        return barraNavegacion.irAEscritorioNotificaPolizaPage();
    }

    public EscritorioRevisaAgentePage irAEscritorioRevisaAgentePage(){
        return barraNavegacion.irAEscritorioRevisaAgentePage();
    }

    public EscritorioRevPer30DiaAseguraPage irAEscritorioRevPer30DiaAseguraPage(){
        return barraNavegacion.irAEscritorioRevPer30DiaAseguraPage();
    }

    public EscritorioRevPer45DiaAseguraPage irAEscritorioRevPer45DiaAseguraPage(){
        return barraNavegacion.irAEscritorioRevPer45DiaAseguraPage();
    }

    public EscritorioRevPer60DiaAseguraPage irAEscritorioRevPer60DiaAseguraPage(){
        return barraNavegacion.irAEscritorioRevPer60DiaAseguraPage();
    }

    public EscritorioRevisaRendimPage irAEscritorioRevisaRendimPage(){
        return barraNavegacion.irAEscritorioRevisaRendimPage();
    }

    public EscritorioVerificaCoberPage irAEscritorioVerificaCoberPage(){
        return barraNavegacion.irAEscritorioVerificaCoberPage();
    }

    public EscritorioTransPoliACuentaPage irAEscritorioTransPoliACuentaPage(){
        return barraNavegacion.irAEscritorioTransPoliACuentaPage();
    }

    public EscritorioReescrPoliACuentaPage irAEscritorioReescrPoliACuentaPage(){
        return barraNavegacion.irAEscritorioReescrPoliACuentaPage();
    }

    public EscritorioConvPoliACuentaPage irAEscritorioConvPoliACuentaPage(){
        return barraNavegacion.irAEscritorioConvPoliACuentaPage();
    }

}