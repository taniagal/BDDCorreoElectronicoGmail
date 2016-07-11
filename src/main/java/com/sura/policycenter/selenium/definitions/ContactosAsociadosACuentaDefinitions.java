package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.pages.NuevoAseguradoNombradoPage;
import com.sura.policycenter.selenium.steps.ContactosAsociadosACuentasSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")
public class ContactosAsociadosACuentaDefinitions {

    private static final String ENCABEZADO = "encabezados";

    @Managed
    WebDriver driver;

    @Steps
    SeusLoginSteps seusSteps;

    @Steps
    private ContactosAsociadosACuentasSteps contactosAsociadosACuentaSteps;

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
    public void thenDeboVerLosRolesDeContactoDeTipoPersonaJuridica(ExamplesTable encabezados) {
        contactosAsociadosACuentaSteps.verificarRolesFuncionesNoEsNulo();
        contactosAsociadosACuentaSteps.verificarEncabezados(encabezados, ENCABEZADO, "//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactRolesDV:ContactRolesLV']/div/div/div/div");
    }

    @Then("debo ver las direcciones asociadas al contacto y sus $encabezados")
    public void thenDeboVerLasDireccionesAsociadasAUnContacto(ExamplesTable encabezados) {
        contactosAsociadosACuentaSteps.verificarDireccionesEsNulo();
        contactosAsociadosACuentaSteps.verificarEncabezados(encabezados, ENCABEZADO,".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressesLV']/div/div/div/div");
    }


    @Then("debo ver las transacciones asociadas al contacto y sus $encabezados")
    public void thenDeboVerLasTransaccionesAsociadasAUnContacto(ExamplesTable encabezados) {
        contactosAsociadosACuentaSteps.verificarEncabezados(encabezados, ENCABEZADO,".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountFile_Contacts_WorkOrdersLV']/div/div/div/div");
    }

    @Then("debo ver las polizas asociadas al contacto y sus $encabezados")
    public void thenDeboVerLasPolizasAsociadasAUnContacto(ExamplesTable encabezados) {
        contactosAsociadosACuentaSteps.verificarEncabezados(encabezados, ENCABEZADO,".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountFile_Contacts_PoliciesLV']/div/div/div/div");
    }



    @Given("y desee crear un nuevo contacto")
    public void andDeseeCrearUnNuevoContacto() {
        contactosAsociadosACuentaSteps.clicCrearNuevoContacto();
    }

    @Given("debo darClick <darClick>  y ver las opciones de menú para los roles $opcionesPorRoles")
    public void thenDeboVerLasOpcionesDeMenuParaLosRoles(ExamplesTable opcionesPorRoles, Boolean darClick) throws Exception {
        contactosAsociadosACuentaSteps.verOpcionesDeCreacionDeContactoPorRoleDeContactos(opcionesPorRoles, darClick);

    }

    @Given("asocie un nuevo contacto a la cuenta con el rol seleccionado")
    public void andAsocieUnNuevoContactoALaCuenta() throws Exception {
        NuevoAseguradoNombradoPage nuevoAseguradoNombradoPage = new NuevoAseguradoNombradoPage(contactosAsociadosACuentaSteps.getDriver());
        nuevoAseguradoNombradoPage.asociarNuevoAseguradoNombradoACuenta();

    }

    @Then("debo poder visualizar el contacto recien asociado con su rol seleccionado")
    public void thenVisualizarContactoAsociado() throws Exception {
        contactosAsociadosACuentaSteps.esContactoAsociado("DORIAN STIWAR EASTMOND PULGARIN");
    }

    @Given("busco un contacto del directorio  que no exista en la cuenta con un rol existente")
    public void thenBuscUnContactoDelDirectorioQueNoExistaEnLaCuentaConUnRolExistente() throws Exception {
        contactosAsociadosACuentaSteps.buscarContactoDelDirectorio();
    }


    @Given("y deseo eliminar el contacto <contactoEliminado>")
    public void givenYDeseoEliminarElContactocontactoEliminado(String contactoEliminado) throws Exception {
        contactosAsociadosACuentaSteps.eliminarContactoAsociando(contactoEliminado);
    }


    @Then("el contacto <contactoEliminado> ya no debe estar asociado a la cuenta")
    public void thenContatctoEliminado(String contactoEliminado) throws Exception {
        contactosAsociadosACuentaSteps.contactoEliminado(contactoEliminado);
    }


}
