package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.AbrirAppPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


/**
 * Created by jorghome on 04/05/2016.
 */
public class PruebaMenuSteps extends ScenarioSteps {

    //Guidewire gw = new Guidewire(getDriver());
    //AbrirAppPage abrirAppPage = new AbrirAppPage(getDriver());
    //InicioPage escritorioPage = new InicioPage(getDriver());
    //InicioPage escritorioPage;

    public PruebaMenuSteps(Pages pages) {
        super(pages);
    }

    private Guidewire gw() {
        return getPages().currentPageAt(Guidewire.class);
    }

    private AbrirAppPage abrirAppPage() {
        return getPages().currentPageAt(AbrirAppPage.class);
    }

    private InicioPage escritorioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

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
        escritorioPage().assertion(element);
    }

    @Step
    public void pruebaNavegacion (){
        //Menu Escritorio
        /*escritorioPage.irAMisActividades();
        gw.waitUntil(3000);
        escritorioPage.irAMisCuentas();
        gw.waitUntil(3000);
        escritorioPage.irAMisEnvios();
        gw.waitUntil(3000);
        escritorioPage.irAMisRenovaciones();
        gw.waitUntil(3000);
        escritorioPage.irAMisOtrasTransacciones();
        gw.waitUntil(3000);
        escritorioPage.irAMisColas();
        gw.waitUntil(3000);*/

        //Menu Cuenta
        /*escritorioPage().irANuevaCuenta();
        gw().waitUntil(3000);*/

        //Acciones Cuenta
        /*escritorioPage().irAEscritorioNuevaNota();
        gw().waitUntil(1000);
        escritorioPage().irAEscritorioLigaDocExiste();
        gw().waitUntil(1000);
        escritorioPage().irACreaDocNuevaPlantPage();
        gw().waitUntil(1000);
        escritorioPage().irAEscritorioNuevoCorreoElect();
        gw().waitUntil(1000);
        escritorioPage().irAEscritorioNuevoEnvioCuentaPage();
        gw().waitUntil(1000);
        escritorioPage().irAEscritorioRevisaNuevoCorreoPage();
        gw().waitUntil(1000);
        escritorioPage().irAEscritorioReuneAgentePage();
        gw().waitUntil(1000);
        escritorioPage().irAEscritorioRevPer30DiaAseguraPage();
        gw().waitUntil(1000);
        escritorioPage().irAEscritorioRevPer45DiaAseguraPage();
        gw().waitUntil(1000);
        escritorioPage().irAEscritorioRevPer60DiaAseguraPage();
        gw().waitUntil(2000);*/
        /*escritorioPage().irAEscritorioConvPoliACuentaPage();
        gw().waitUntil(1000);*/


        //Menu Poliza
        /*escritorioPage().irANuevoEnvio();
        gw().waitUntil(3000);*/
        escritorioPage().irABuscarPoliza("4215989563");
        gw().waitUntil(3000);

        //Menu Contacto
        /*escritorioPage().irANuevaCompania();
        gw().waitUntil(3000);
        escritorioPage().irANuevaPersona();
        gw().waitUntil(3000);
        escritorioPage().irABuscarContacto();
        gw().waitUntil(3000);*/

        //Menu Buscar
        /*escritorioPage().irABuscarPolizas();
        gw().waitUntil(3000);
        escritorioPage().irABuscarCuentas();
        gw().waitUntil(3000);
        escritorioPage().irABuscarCodAgente();
        gw().waitUntil(3000);
        escritorioPage().irABuscarActividades();
        gw().waitUntil(3000);
        escritorioPage().irABuscarContactos();
        gw().waitUntil(3000);*/

        //Menu Equipo
        /*escritorioPage().irAEquipo();
        gw().waitUntil(3000);*/

        //Menu Adiministracion
        /*escritorioPage().irAAdminUsuarios();
        gw().waitUntil(3000);
        escritorioPage().irAAdminGrupos();
        gw().waitUntil(3000);
        escritorioPage().irAAdminRoles();
        gw().waitUntil(3000);
        escritorioPage().irAAdminRegiones();
        gw().waitUntil(3000);
        escritorioPage().irAAdminOrganizaciones();
        gw().waitUntil(3000);
        escritorioPage().irAAdminCodAgentes();
        gw().waitUntil(3000);
        escritorioPage().irAAdminPerfilAutoridad();
        gw().waitUntil(3000);
        escritorioPage().irAAdminAtributos();
        gw().waitUntil(3000);
        escritorioPage().irAAdminGruposAfinidad();
        gw().waitUntil(3000);*/
        /*escritorioPage().irAAdminPatronesActividad();
        gw().waitUntil(3000);
        escritorioPage().irAAdminDiasFestivos();
        gw().waitUntil(3000);
        escritorioPage().irAAdminPatronesFormPoliza();
        gw().waitUntil(3000);
        escritorioPage().irAAdminRetencionPolizas();
        gw().waitUntil(3000);*/
        /*escritorioPage().irAAdminMensajes();
        gw().waitUntil(3000);
        escritorioPage().irAAdminColasMensajes();
        gw().waitUntil(3000);
        escritorioPage().irAAdminFlujosTrabajo();
        gw().waitUntil(3000);
        escritorioPage().irAAdminEstadistFlujoTrabajo();
        gw().waitUntil(3000);*/
        /*escritorioPage().irAAdminImportarDatos();
        gw().waitUntil(3000);
        escritorioPage().irAAdminExportarDatos();
        gw().waitUntil(3000);
        escritorioPage().irAAdminParamSecuencia();
        gw().waitUntil(3000);
        escritorioPage().irAAdminFormatoExporta();
        gw().waitUntil(3000);
        escritorioPage().irAAdminCambioDatos();
        gw().waitUntil(3000);*/
        /*escritorioPage().irAEscritorioNuevoEnvio();
        gw().waitUntil(3000);*/
        /*escritorioPage().irAEscritorioNuevaCuenta();
        gw().waitUntil(3000);*/

        //Acciones Contacto
        /*escritorioPage().irAContactoNuevaCuenta();
        gw().waitUntil(3000);*/

        //Acciones Adiministracion
        /*escritorioPage().irAAdminUsuarioNuevo();
        gw().waitUntil(3000);
        escritorioPage().irAAdminGrupoNuevo();
        gw().waitUntil(3000);
        escritorioPage().irAAdminOrganizacionNueva();
        gw().waitUntil(3000);
        escritorioPage().irAAdminCodAgenteNuevo();
        gw().waitUntil(3000);
        escritorioPage().irAAdminNuevoGrupoAfinidad();
        gw().waitUntil(3000);
        escritorioPage().irAAdminVerificarErrorPatron();
        gw().waitUntil(3000);*/

    }

    @Step
    public void logout() {
        gw().logout();
    }
}
