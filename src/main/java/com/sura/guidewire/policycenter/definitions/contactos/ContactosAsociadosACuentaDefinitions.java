package com.sura.guidewire.policycenter.definitions.contactos;

import com.sura.guidewire.policycenter.pages.NuevoAseguradoNombradoPage;
import com.sura.guidewire.policycenter.steps.contactos.ContactosAsociadosACuentasSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")
public class ContactosAsociadosACuentaDefinitions {

    private static final String ENCABEZADO = "encabezados";

    @Managed
    WebDriver driver;

    @Steps
    private ContactosAsociadosACuentasSteps contactosAsociadosACuentaSteps;

    @Given("quiera ver el detalle de los contactos de la cuentas <numCuenta>")
    public void givenQuieraVerElDetalleDeLosContactosDeLaCuentanumCuenta() {
        contactosAsociadosACuentaSteps.consultarContactos();
    }

    @Then("debo ver el detalle del contactos de tipo persona")
    public void thenDeboVerElDetalleDelContactoDeTipoPersona() {
        contactosAsociadosACuentaSteps.verificarDetalleContactoNoEsNulo();
    }

    @Given("selecciono un contactos de la lista de contactos <posicion>  y aplico la opcion <opcion>")
    public void givenSeleccionoUnContactoDeLaListaDeContactosposicion(String posicion, String opcion) {
        contactosAsociadosACuentaSteps.selecionarContacto(posicion, opcion);
    }

    @Then("debo ver los roles de contactos de tipo persona y sus $encabezados")
    public void thenDeboVerLosRolesDeContactoDeTipoPersonaJuridica(ExamplesTable encabezados) {
        contactosAsociadosACuentaSteps.verificarRolesFuncionesNoEsNulo();
        contactosAsociadosACuentaSteps.verificarEncabezados(encabezados, ENCABEZADO, "//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactRolesDV:ContactRolesLV']/div/div/div/div");
    }

    @Then("debo ver las direcciones asociadas al contactos y sus $encabezados")
    public void thenDeboVerLasDireccionesAsociadasAUnContacto(ExamplesTable encabezados) {
        contactosAsociadosACuentaSteps.verificarDireccionesEsNulo();
        contactosAsociadosACuentaSteps.verificarEncabezados(encabezados, ENCABEZADO,".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressesLV']/div/div/div/div");
    }


    @Then("debo ver las transacciones asociadas al contactos y sus $encabezados")
    public void thenDeboVerLasTransaccionesAsociadasAUnContacto(ExamplesTable encabezados) {
        contactosAsociadosACuentaSteps.verificarEncabezados(encabezados, ENCABEZADO,".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountFile_Contacts_WorkOrdersLV']/div/div/div/div");
    }

    @Then("debo ver las polizas asociadas al contactos y sus $encabezados")
    public void thenDeboVerLasPolizasAsociadasAUnContacto(ExamplesTable encabezados) {
        contactosAsociadosACuentaSteps.verificarEncabezados(encabezados, ENCABEZADO,".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountFile_Contacts_PoliciesLV']/div/div/div/div");
    }



    @Given("y desee crear un nuevo contactos")
    public void andDeseeCrearUnNuevoContacto() {
        contactosAsociadosACuentaSteps.clicCrearNuevoContacto();
    }

    @Given("debo darClick <darClick>  y ver las opciones de menú para los roles $opcionesPorRoles")
    public void thenDeboVerLasOpcionesDeMenuParaLosRoles(ExamplesTable opcionesPorRoles, Boolean darClick) throws Exception {
        contactosAsociadosACuentaSteps.verOpcionesDeCreacionDeContactoPorRoleDeContactos(opcionesPorRoles, darClick);

    }

    @Given("asocie un nuevo contactos a la cuentas con el rol seleccionado")
    public void andAsocieUnNuevoContactoALaCuenta() throws Exception {
        NuevoAseguradoNombradoPage nuevoAseguradoNombradoPage = new NuevoAseguradoNombradoPage(contactosAsociadosACuentaSteps.getDriver());
        nuevoAseguradoNombradoPage.asociarNuevoAseguradoNombradoACuenta();

    }

    @Then("debo poder visualizar el contactos recien asociado con su rol seleccionado <contactos>")
    public void thenVisualizarContactoAsociado(@Named("contactos") String contacto) throws Exception {
        contactosAsociadosACuentaSteps.esContactoAsociado(contacto);
    }

    @Given("busco un contactos del directorio  que no exista en la cuentas con un rol existente")
    public void thenBuscUnContactoDelDirectorioQueNoExistaEnLaCuentaConUnRolExistente() throws Exception {
        contactosAsociadosACuentaSteps.buscarContactoDelDirectorio();
    }


    @Given("y deseo eliminar el contactos <contactoEliminado>")
    public void givenYDeseoEliminarElContactocontactoEliminado(String contactoEliminado) throws Exception {
        contactosAsociadosACuentaSteps.eliminarContactoAsociando(contactoEliminado);
    }


    @Then("el contactos <contactoEliminado> ya no debe estar asociado a la cuentas")
    public void thenContatctoEliminado(String contactoEliminado) throws Exception {
        contactosAsociadosACuentaSteps.contactoEliminado(contactoEliminado);
    }


}
