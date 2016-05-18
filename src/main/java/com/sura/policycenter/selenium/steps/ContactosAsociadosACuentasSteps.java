package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ContactosAsociadosACuentasPage;
import com.sura.policycenter.selenium.pages.CuentasOrdenesDeTrabajoPage;
import com.sura.policycenter.selenium.pages.InicioPage;
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
    public void consultarContactos(){
        contactosAsociadosACuentasPage.consultarContactos();
    }

    @Step
    public void selecionarContacto(String posicion, String opcion) {
        contactosAsociadosACuentasPage.verificarListaContactoNoEsNulo();
        contactosAsociadosACuentasPage.selecionarContacto(posicion);
        switch (opcion){
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
    public void esContactoAsociado() throws Exception {
        contactosAsociadosACuentasPage.esContactoAsociado();
    }

}
