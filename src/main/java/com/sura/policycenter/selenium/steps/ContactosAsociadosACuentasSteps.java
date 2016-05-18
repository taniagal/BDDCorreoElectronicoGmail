package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.ContactosAsociadosACuentasPage;
import com.sura.policycenter.selenium.pages.CuentasOrdenesDeTrabajoPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.superior.cuenta.panel.contactos.BusquedaContactoDelDirectorioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

/**
 * Created by jorgsape on 2016/05/04.
 */
public class ContactosAsociadosACuentasSteps extends ScenarioSteps {

    public static final String DETALLE_CONTACTO = "DETALLE_CONTACTO";

    public static final String FUNCIONES = "FUNCIONES";

    public static final String DIRECCIONES = "DIRECCIONES";

    public static final String TRANSACCIONES_ASOCIADAS = "TRANSACCIONES_ASOCIADAS";

    public static final String POLIZAS_ASOCIADAS = "POLIZAS_ASOCIADAS";


    private final ContactosAsociadosACuentasPage contactosAsociadosACuentasPage = new ContactosAsociadosACuentasPage(getDriver());
    private BusquedaContactoDelDirectorioPage busquedaDelDirectorioPage = new BusquedaContactoDelDirectorioPage(getDriver());
    CuentasOrdenesDeTrabajoPage cuentasOrdenesTrabajoPage = new CuentasOrdenesDeTrabajoPage(getDriver());

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    public ContactosAsociadosACuentasSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void consultarCuentaPorNum(String numCuenta) {
        //cuentasOrdenesTrabajoPage.buscarCuenta(numCuenta);
        inicioPage().irACuentaBuscar(numCuenta);
    }

    @Step
    public void consultarContactos() {
        contactosAsociadosACuentasPage.consultarContactos();
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
        }

    }


    @Step
    public void verificarDetalleContactoNoEsNulo() {
        contactosAsociadosACuentasPage.verificarDetalleContactoNoEsNulo();
    }

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
        Boolean esContactoAsociadoDesdeDirectorio = busquedaDelDirectorioPage.buscarContacto("Personal", "DORIAN", "EASTMOND");
        if (esContactoAsociadoDesdeDirectorio) {
            if(esContactoAsociado("DORIAN STIWAR EASTMOND PULGARIN")){
                contactosAsociadosACuentasPage.validarOcurrenciaDeMensajeDeAplicacion(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:_msgs']/div","porque ya tiene ese rol");
            }
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
