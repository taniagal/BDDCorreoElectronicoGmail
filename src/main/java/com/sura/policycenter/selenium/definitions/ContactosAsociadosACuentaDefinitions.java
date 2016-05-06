package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.ContactosAsociadosACuentasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

/**
 * Created by jorgsape on 2016/05/04.
 */
public class ContactosAsociadosACuentaDefinitions {

    @Steps
    SeusLoginSteps seusSteps;

    @Steps
    ContactosAsociadosACuentasSteps contactosAsociadosACuentaSteps;

    @Given("estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados")
    public void givenEstoyEnLaPantallaDeCuentaYExisteUnaCuentanumCuentaConContactosDeTipoPersonaJuridicaAsociados(String numCuenta) {
        contactosAsociadosACuentaSteps.consultarCuentaPorNum(numCuenta);
    }

    @Given("quiera ver el detalle de los contactos de la cuenta <numCuenta>")
    public void givenQuieraVerElDetalleDeLosContactosDeLaCuentanumCuenta() {
        contactosAsociadosACuentaSteps.consultarContactos();
    }

    @Then("debo ver el detalle del contacto de tipo persona")
    public void thenDeboVerElDetalleDelContactoDeTipoPersona() {
        contactosAsociadosACuentaSteps.verificarDetalleContactoNoEsNulo();
    }

    @Given("selecciono un contacto de la lista de contactos <posicion>  y aplico la opcion <opcion>")
    public void givenSeleccionoUnContactoDeLaListaDeContactosposicion(String posicion, String opcion) {
        contactosAsociadosACuentaSteps.selecionarContacto(posicion, opcion);
    }

    @Then("debo ver los roles de contacto de tipo persona y sus $encabezados")
    public void thenDeboVerLosRolesDeContactoDeTipoPersonaJurídica(ExamplesTable encabezados) {
        contactosAsociadosACuentaSteps.verificarRolesFuncionesNoEsNulo();
        contactosAsociadosACuentaSteps.verificarEncabezados(encabezados);
    }

    @Then("debo ver las direcciones asociadas al contacto")
    public void thenDeboVerLasDireccionesAsociadasAUnContacto() {
        contactosAsociadosACuentaSteps.verificarDireccionesEsNulo();
    }

    @Given("el contacto tiene mínimo una dirección")
    @Pending
    public void givenElContactoTieneMinimoUnaDireccion() {

    }


    @When("quiera ver las direcciones del contacto seleccionado")
    @Pending
    public void cuandoQuieraVerLasDireccionesDelContactoSeleccionado() {

    }

    @Then("debo ver las direcciones del contacto")
    @Pending
    public void entoncesDeboVerLasDireccionesDelContacto() {

    }

}
