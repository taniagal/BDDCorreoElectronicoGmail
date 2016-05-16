package com.sura.policycenter.selenium.steps;

import com.beust.jcommander.internal.Lists;
import com.sura.policycenter.selenium.pages.AbrirAppPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.model.TestTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepEventBus;

import java.util.List;
import java.util.Map;

/**
 * Created by jorghome on 04/05/2016.
 */
public class PruebaMenuSteps extends ScenarioSteps {

    //Guidewire gw = new Guidewire(getDriver());
    //AbrirAppPage abrirAppPage = new AbrirAppPage(getDriver());
    //InicioPage inicioPage = new InicioPage(getDriver());
    //InicioPage inicioPage;

    public PruebaMenuSteps(Pages pages) {
        super(pages);
    }

    private Guidewire gw() {
        return getPages().currentPageAt(Guidewire.class);
    }

    private AbrirAppPage abrirAppPage() {
        return getPages().currentPageAt(AbrirAppPage.class);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void should_run_just_for_end_to_end_tests () {

        Map<String, String> metadata = Serenity.getCurrentSession().getMetaData();

        if (!metadata.get("level").equalsIgnoreCase("system")) {
            StepEventBus.getEventBus().testIgnored();
        }
        else {
            add_tags();
        }
    }

    public void add_tags() {
        List<TestTag> myTags = Lists.newArrayList(TestTag.withName("menu").andType("prueba"));
        StepEventBus.getEventBus().addTagsToCurrentStory(myTags);
    }

    @WithTag("prueba:menu")

    @Step
    public void open() {
        abrirAppPage().open();
    }

    @Step
    public void login(String usuario, String contrasenia) {
        gw().login(usuario, contrasenia);
    }

    @Step
    public void assertion(String element) {
        inicioPage().assertion(element);
    }

    @Step
    public void pruebaNavegacion (){
        //Menu Escritorio
        inicioPage().irAMisActividades();
        gw().waitUntil(3000);
        /*inicioPage().irAMisCuentas();
        gw().waitUntil(3000);
        inicioPage().irAMisEnvios();
        gw().waitUntil(3000);
        inicioPage().irAMisRenovaciones();
        gw().waitUntil(3000);
        inicioPage().irAMisOtrasTransacciones();
        gw().waitUntil(3000);
        inicioPage().irAMisColas();
        gw().waitUntil(3000);*/

        //Acciones Escritorio
        /*inicioPage().irAEscritorioNuevoEnvio();
        gw().waitUntil(3000);
        inicioPage().irAEscritorioNuevaCuenta();
        gw().waitUntil(3000);*/

        //Menu Cuenta
        /*inicioPage().irANuevaCuenta();
        gw().waitUntil(3000);*/

        //Acciones Cuenta
        /*inicioPage().irACuentaNuevaNota();
        gw().waitUntil(1000);
        inicioPage().irACuentaLigaDocExiste();
        gw().waitUntil(1000);
        inicioPage().irACuentaCreaDocNuevaPlant();
        gw().waitUntil(1000);
        inicioPage().irACuentaNuevoCorreoElect();
        gw().waitUntil(1000);
        inicioPage().irACuentaNuevoEnvioCuenta();
        gw().waitUntil(1000);
        inicioPage().irACuentaRevisaNuevoCorreo();
        gw().waitUntil(1000);
        inicioPage().irACuentaReuneAgente();
        gw().waitUntil(1000);
        inicioPage().irACuentaReuneAsegurado();
        gw().waitUntil(1000);
        inicioPage().irACuentaCancelaPolizDivid();
        gw().waitUntil(1000);
        inicioPage().irACuentaCotizaRequerida();
        gw().waitUntil(1000);
        inicioPage().irACuentaDiarioX30();
        gw().waitUntil(1000);
        inicioPage().irACuentaDiarioX60();
        gw().waitUntil(1000);
        inicioPage().irACuentaCancelaPolizDivid();
        gw().waitUntil(1000);
        inicioPage().irACuentaDiarioX90();
        gw().waitUntil(1000);
        inicioPage().irACuentaNotificaPoliza();
        gw().waitUntil(1000);
        inicioPage().irACuentaRevisaAgente();
        gw().waitUntil(1000);
        inicioPage().irACuentaRevPer30DiaAsegura();
        gw().waitUntil(1000);
        inicioPage().irACuentaRevPer45DiaAsegura();
        gw().waitUntil(1000);
        inicioPage().irACuentaRevPer60DiaAsegura();
        gw().waitUntil(2000);
        inicioPage().irACuentaRevisaRendim();
        gw().waitUntil(2000);
        inicioPage().irACuentaVerificaCober();
        gw().waitUntil(2000);
        inicioPage().irACuentaTransPoliACuenta();
        gw().waitUntil(2000);
        inicioPage().irACuentaReescrPoliACuenta();
        gw().waitUntil(2000);
        inicioPage().irACuentaCombPoliACuenta();
        gw().waitUntil(1000);
        inicioPage().irCuentaTazaCotPoliManu();
        gw().waitUntil(2000);*/

        //Menu Poliza
        /*inicioPage().irANuevoEnvio();
        gw().waitUntil(3000);
        inicioPage().irABuscarPoliza("4215989563");
        gw().waitUntil(3000);*/

        //Menu Contacto
        /*inicioPage().irANuevaCompania();
        gw().waitUntil(3000);
        inicioPage().irANuevaPersona();
        gw().waitUntil(3000);
        inicioPage().irABuscarContacto();
        gw().waitUntil(3000);*/

        //Acciones Contacto
        /*inicioPage().irAContactoNuevaCuenta();
        gw().waitUntil(3000);*/

        //Menu Buscar
        /*inicioPage().irABuscarPolizas();
        gw().waitUntil(3000);
        inicioPage().irABuscarCuentas();
        gw().waitUntil(3000);
        inicioPage().irABuscarCodAgente();
        gw().waitUntil(3000);
        inicioPage().irABuscarActividades();
        gw().waitUntil(3000);
        inicioPage().irABuscarContactos();
        gw().waitUntil(3000);*/

        //Menu Equipo
        /*inicioPage().irAEquipo();
        gw().waitUntil(3000);*/

        //Menu Adiministracion
        /*inicioPage().irAAdminUsuarios();
        gw().waitUntil(3000);
        inicioPage().irAAdminGrupos();
        gw().waitUntil(3000);
        inicioPage().irAAdminRoles();
        gw().waitUntil(3000);
        inicioPage().irAAdminRegiones();
        gw().waitUntil(3000);
        inicioPage().irAAdminOrganizaciones();
        gw().waitUntil(3000);
        inicioPage().irAAdminCodAgentes();
        gw().waitUntil(3000);
        inicioPage().irAAdminPerfilAutoridad();
        gw().waitUntil(3000);
        inicioPage().irAAdminAtributos();
        gw().waitUntil(3000);
        inicioPage().irAAdminGruposAfinidad();
        gw().waitUntil(3000);
        inicioPage().irAAdminPatronesActividad();
        gw().waitUntil(3000);
        inicioPage().irAAdminDiasFestivos();
        gw().waitUntil(3000);
        inicioPage().irAAdminPatronesFormPoliza();
        gw().waitUntil(3000);
        inicioPage().irAAdminRetencionPolizas();
        gw().waitUntil(3000);
        inicioPage().irAAdminMensajes();
        gw().waitUntil(3000);
        inicioPage().irAAdminColasMensajes();
        gw().waitUntil(3000);
        inicioPage().irAAdminFlujosTrabajo();
        gw().waitUntil(3000);
        inicioPage().irAAdminEstadistFlujoTrabajo();
        gw().waitUntil(3000);
        inicioPage().irAAdminImportarDatos();
        gw().waitUntil(3000);
        inicioPage().irAAdminExportarDatos();
        gw().waitUntil(3000);
        inicioPage().irAAdminParamSecuencia();
        gw().waitUntil(3000);
        inicioPage().irAAdminFormatoExporta();
        gw().waitUntil(3000);
        inicioPage().irAAdminCambioDatos();
        gw().waitUntil(3000);*/

        //Acciones Adiministracion
        /*inicioPage().irAAdminUsuarioNuevo();
        gw().waitUntil(3000);
        inicioPage().irAAdminGrupoNuevo();
        gw().waitUntil(3000);
        inicioPage().irAAdminOrganizacionNueva();
        gw().waitUntil(3000);
        inicioPage().irAAdminCodAgenteNuevo();
        gw().waitUntil(3000);
        inicioPage().irAAdminNuevoGrupoAfinidad();
        gw().waitUntil(3000);
        inicioPage().irAAdminVerificarErrorPatron();
        gw().waitUntil(3000);*/
    }

    @Step
    public void logout() {
        gw().logout();
    }
}
