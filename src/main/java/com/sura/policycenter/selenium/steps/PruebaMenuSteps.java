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
        waitABit(3000);
        /*inicioPage().irAMisCuentas();
        waitABit(3000);
        inicioPage().irAMisEnvios();
        waitABit(3000);
        inicioPage().irAMisRenovaciones();
        waitABit(3000);
        inicioPage().irAMisOtrasTransacciones();
        waitABit(3000);
        inicioPage().irAMisColas();
        waitABit(3000);*/

        //Acciones Escritorio
        /*inicioPage().irAEscritorioNuevoEnvio();
        waitABit(3000);
        inicioPage().irAEscritorioNuevaCuenta();
        waitABit(3000);*/

        //Menu Cuenta
        /*inicioPage().irANuevaCuenta();
        waitABit(3000);*/

        //Acciones Cuenta
        /*inicioPage().irACuentaNuevaNota();
        waitABit(1000);
        inicioPage().irACuentaLigaDocExiste();
        waitABit(1000);
        inicioPage().irACuentaCreaDocNuevaPlant();
        waitABit(1000);
        inicioPage().irACuentaNuevoCorreoElect();
        waitABit(1000);
        inicioPage().irACuentaNuevoEnvioCuenta();
        waitABit(1000);
        inicioPage().irACuentaRevisaNuevoCorreo();
        waitABit(1000);
        inicioPage().irACuentaReuneAgente();
        waitABit(1000);
        inicioPage().irACuentaReuneAsegurado();
        waitABit(1000);
        inicioPage().irACuentaCancelaPolizDivid();
        waitABit(1000);
        inicioPage().irACuentaCotizaRequerida();
        waitABit(1000);
        inicioPage().irACuentaDiarioX30();
        waitABit(1000);
        inicioPage().irACuentaDiarioX60();
        waitABit(1000);
        inicioPage().irACuentaCancelaPolizDivid();
        waitABit(1000);
        inicioPage().irACuentaDiarioX90();
        waitABit(1000);
        inicioPage().irACuentaNotificaPoliza();
        waitABit(1000);
        inicioPage().irACuentaRevisaAgente();
        waitABit(1000);
        inicioPage().irACuentaRevPer30DiaAsegura();
        waitABit(1000);
        inicioPage().irACuentaRevPer45DiaAsegura();
        waitABit(1000);
        inicioPage().irACuentaRevPer60DiaAsegura();
        waitABit(2000);
        inicioPage().irACuentaRevisaRendim();
        waitABit(2000);
        inicioPage().irACuentaVerificaCober();
        waitABit(2000);
        inicioPage().irACuentaTransPoliACuenta();
        waitABit(2000);
        inicioPage().irACuentaReescrPoliACuenta();
        waitABit(2000);
        inicioPage().irACuentaCombPoliACuenta();
        waitABit(1000);
        inicioPage().irCuentaTazaCotPoliManu();
        waitABit(2000);*/

        //Menu Poliza
        /*inicioPage().irANuevoEnvio();
        waitABit(3000);
        inicioPage().irABuscarPoliza("4215989563");
        waitABit(3000);*/

        //Menu Contacto
        /*inicioPage().irANuevaCompania();
        waitABit(3000);
        inicioPage().irANuevaPersona();
        waitABit(3000);
        inicioPage().irABuscarContacto();
        waitABit(3000);*/

        //Acciones Contacto
        /*inicioPage().irAContactoNuevaCuenta();
        waitABit(3000);*/

        //Menu Buscar
        /*inicioPage().irABuscarPolizas();
        waitABit(3000);
        inicioPage().irABuscarCuentas();
        waitABit(3000);
        inicioPage().irABuscarCodAgente();
        waitABit(3000);
        inicioPage().irABuscarActividades();
        waitABit(3000);
        inicioPage().irABuscarContactos();
        waitABit(3000);*/

        //Menu Equipo
        /*inicioPage().irAEquipo();
        waitABit(3000);*/

        //Menu Adiministracion
        /*inicioPage().irAAdminUsuarios();
        waitABit(3000);
        inicioPage().irAAdminGrupos();
        waitABit(3000);
        inicioPage().irAAdminRoles();
        waitABit(3000);
        inicioPage().irAAdminRegiones();
        waitABit(3000);
        inicioPage().irAAdminOrganizaciones();
        waitABit(3000);
        inicioPage().irAAdminCodAgentes();
        waitABit(3000);
        inicioPage().irAAdminPerfilAutoridad();
        waitABit(3000);
        inicioPage().irAAdminAtributos();
        waitABit(3000);
        inicioPage().irAAdminGruposAfinidad();
        waitABit(3000);
        inicioPage().irAAdminPatronesActividad();
        waitABit(3000);
        inicioPage().irAAdminDiasFestivos();
        waitABit(3000);
        inicioPage().irAAdminPatronesFormPoliza();
        waitABit(3000);
        inicioPage().irAAdminRetencionPolizas();
        waitABit(3000);
        inicioPage().irAAdminMensajes();
        waitABit(3000);
        inicioPage().irAAdminColasMensajes();
        waitABit(3000);
        inicioPage().irAAdminFlujosTrabajo();
        waitABit(3000);
        inicioPage().irAAdminEstadistFlujoTrabajo();
        waitABit(3000);
        inicioPage().irAAdminImportarDatos();
        waitABit(3000);
        inicioPage().irAAdminExportarDatos();
        waitABit(3000);
        inicioPage().irAAdminParamSecuencia();
        waitABit(3000);
        inicioPage().irAAdminFormatoExporta();
        waitABit(3000);
        inicioPage().irAAdminCambioDatos();
        waitABit(3000);*/

        //Acciones Adiministracion
        /*inicioPage().irAAdminUsuarioNuevo();
        waitABit(3000);
        inicioPage().irAAdminGrupoNuevo();
        waitABit(3000);
        inicioPage().irAAdminOrganizacionNueva();
        waitABit(3000);
        inicioPage().irAAdminCodAgenteNuevo();
        waitABit(3000);
        inicioPage().irAAdminNuevoGrupoAfinidad();
        waitABit(3000);
        inicioPage().irAAdminVerificarErrorPatron();
        waitABit(3000);*/
    }

    @Step
    public void logout() {
        gw().logout();
    }
}
