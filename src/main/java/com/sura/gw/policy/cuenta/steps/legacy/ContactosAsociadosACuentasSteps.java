package com.sura.gw.policy.cuenta.steps.legacy;

import com.sura.guidewire.acciones.navegacion.AccionBuscarNavBar;
import com.sura.gw.policy.cuenta.pages.ContactosAsociadosACuentaWidgetPage;
import com.sura.policycenter.selenium.pages.ContactosAsociadosACuentasPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.superior.cuenta.panel.contactos.BusquedaContactoDelDirectorioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ContactosAsociadosACuentasSteps extends ScenarioSteps {

    private static final String DETALLE_CONTACTO = "DETALLE_CONTACTO";
    private static final String FUNCIONES = "FUNCIONES";
    private static final String DIRECCIONES = "DIRECCIONES";
    private static final String TRANSACCIONES_ASOCIADAS = "TRANSACCIONES_ASOCIADAS";
    private static final String POLIZAS_ASOCIADAS = "POLIZAS_ASOCIADAS";
    private final ContactosAsociadosACuentasPage contactosAsociadosACuentasPage = new ContactosAsociadosACuentasPage(getDriver());
    private final BusquedaContactoDelDirectorioPage busquedaDelDirectorioPage = new BusquedaContactoDelDirectorioPage(getDriver());

    public ContactosAsociadosACuentasSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void consultarCuentaPorNum(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
    }

    @Step
    public void consultarContactos() {
        contactosAsociadosACuentasPage.consultarContactos();

        // WHEN
        //navegacionSuperior.buscar().en().cuenta().por().numeroDeCuenta("CUENTA").entonces().buscar().luego().seleccionarDichaCuenta();
        // AND
        //contactosDeCuenta.deseoVerLosContactosAsociados();
        //THEN
        //contactosDeCuenta.deberiaVerLosContactosAsociados();

    }


    @Step
    public void selecionarContacto(String posicion, String opcion) {
        contactosAsociadosACuentasPage.verificarListaContactoNoEsNulo();
        contactosAsociadosACuentasPage.selecionarContacto(posicion);
        switch (opcion) {
            case DETALLE_CONTACTO:
                contactosAsociadosACuentasPage.seleccionarTabDetalleContacto();
                break;
            case FUNCIONES:
                contactosAsociadosACuentasPage.seleccionarTabRolesFunciones();
                break;
            case DIRECCIONES:
                contactosAsociadosACuentasPage.seleccionarTabDirecciones();
                break;
            case TRANSACCIONES_ASOCIADAS:
                contactosAsociadosACuentasPage.seleccionarTabTransaccionesAsociadas();
                break;
            case POLIZAS_ASOCIADAS:
                contactosAsociadosACuentasPage.seleccionarTabPolizasAsociadas();
                break;
            default:
                break;
        }

    }

    @Step
    public void verificarDetalleContactoNoEsNulo() {
        contactosAsociadosACuentasPage.verificarDetalleContactoNoEsNulo();
    }

    @SuppressWarnings("SameParameterValue")
    @Step
    public void verificarEncabezados(ExamplesTable encabezados, String encabezado, String xPathElementos) {
        contactosAsociadosACuentasPage.existeEncabezadoDeTabla(encabezados, encabezado, xPathElementos);
    }

    @Step
    public void verificarRolesFuncionesNoEsNulo() {
        contactosAsociadosACuentasPage.verificarRolesFuncionesNoEsNulo();
    }

    @Step
    public void verificarDireccionesEsNulo() {
        contactosAsociadosACuentasPage.verificarDireccioneNoEsNulo();
    }

    @Step
    public void verOpcionesDeCreacionDeContactoPorRoleDeContactos(ExamplesTable opcionesPorRol, Boolean darClick) throws Exception {
        contactosAsociadosACuentasPage.existeOpcionesPorSubMenu(opcionesPorRol, darClick);
    }

    @Step
    public void clicCrearNuevoContacto() {
        contactosAsociadosACuentasPage.clicCrearNuevoContacto();
    }

    @Step
    public Boolean esContactoAsociado(String nombre) throws Exception {
        return contactosAsociadosACuentasPage.esContactoAsociado(nombre);
    }

    @Step
    public void buscarContactoDelDirectorio() throws Exception {
        Boolean esContactoAsociadoDesdeDirectorio = busquedaDelDirectorioPage.buscarContacto("CEDULA DE CIUDADANIA", "DORIAN", "EASTMOND");
        if (esContactoAsociadoDesdeDirectorio && esContactoAsociado("DORIAN STIWAR EASTMOND PULGARIN")) {
            contactosAsociadosACuentasPage.validarOcurrenciaDeMensajeDeAplicacion(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:_msgs']/div", "porque ya tiene ese rol");
        }
    }

    @Step
    public void eliminarContactoAsociando(String nombreContacto) throws Exception {
        contactosAsociadosACuentasPage.ElimnarContactoAsociado(nombreContacto);
    }

    @Step
    public void contactoEliminado(String contactoEliminado) throws Exception {
        contactosAsociadosACuentasPage.contactoEliminado(contactoEliminado);
    }

}
