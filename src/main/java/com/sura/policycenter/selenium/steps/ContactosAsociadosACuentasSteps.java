package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ContactosAsociadosACuentasPage;
import com.sura.policycenter.selenium.pages.CuentasOrdenesDeTrabajoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

/**
 * Created by jorgsape on 2016/05/04.
 */
public class ContactosAsociadosACuentasSteps extends ScenarioSteps {

    public static final String DETALLE_CONTACTO = "DETALLE_CONTACTO";

    public static final String FUNCIONES = "FUNCIONES";

    public static final String DIRECCIONES = "DIRECCIONES";


    private final ContactosAsociadosACuentasPage contactosAsociadosACuentasPage = new ContactosAsociadosACuentasPage(getDriver());
    CuentasOrdenesDeTrabajoPage cuentasOrdenesTrabajoPage = new CuentasOrdenesDeTrabajoPage(getDriver());


    public ContactosAsociadosACuentasSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void consultarCuentaPorNum(String numCuenta) {
        cuentasOrdenesTrabajoPage.buscarCuenta(numCuenta);

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
        }

    }


    @Step
    public void verificarDetalleContactoNoEsNulo() {
        contactosAsociadosACuentasPage.verificarDetalleContactoNoEsNulo();
    }

    @Step
    public void verificarEncabezados(ExamplesTable encabezados) {
        contactosAsociadosACuentasPage.existeEncabezadoDeTablaRolesFunciones(encabezados, "encabezados", "\".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactRolesDV:ContactRolesLV']/div/div/div/div\"");
    }

    @Step
    public void verificarRolesFuncionesNoEsNulo() {
        contactosAsociadosACuentasPage.verificarRolesFuncionesNoEsNulo();
    }

    @Step
    public void verificarDireccionesEsNulo() {
        contactosAsociadosACuentasPage.verificarDireccioneNoEsNulo();
    }
}
