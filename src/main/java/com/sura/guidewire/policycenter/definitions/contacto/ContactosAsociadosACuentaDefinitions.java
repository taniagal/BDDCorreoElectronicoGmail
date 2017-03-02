package com.sura.guidewire.policycenter.definitions.contacto;

import com.sura.guidewire.policycenter.pages.poliza.NuevoAseguradoNombradoPage;
import com.sura.guidewire.policycenter.steps.contacto.ContactosAsociadosACuentasSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")
public class ContactosAsociadosACuentaDefinitions {

    private static final String ENCABEZADO = "encabezados";

    @Managed
    WebDriver driver;

    @Steps
    private ContactosAsociadosACuentasSteps contactosAsociadosACuentaSteps;

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
    public void thenDeboVerLasOpcionesDeMenuParaLosRoles(ExamplesTable opcionesPorRoles, Boolean darClick){
        contactosAsociadosACuentaSteps.verOpcionesDeCreacionDeContactoPorRoleDeContactos(opcionesPorRoles, darClick);

    }

    @When("debo oprimirClick <oprimirClick> para ver las opciones del menu crear contacto $contactosPorRoles")
    public void thenDeboVerLasOpcionesMenuContactos(ExamplesTable contactosPorRoles, Boolean oprimirClick){
        contactosAsociadosACuentaSteps.verOpcionesDeContactoPorRoles(contactosPorRoles, oprimirClick);
    }

    @Given("asocie un nuevo contacto a la cuenta con el rol seleccionado")
    public void andAsocieUnNuevoContactoALaCuenta(){
        NuevoAseguradoNombradoPage nuevoAseguradoNombradoPage = new NuevoAseguradoNombradoPage(contactosAsociadosACuentaSteps.getDriver());
        nuevoAseguradoNombradoPage.asociarNuevoAseguradoNombradoACuenta();

    }

    @Then("debo poder visualizar el contacto recien asociado con su rol seleccionado <contacto>")
    public void thenVisualizarContactoAsociado(@Named("contacto") String contacto){
        contactosAsociadosACuentaSteps.esContactoAsociado(contacto);
    }
    @Then("debo poder visualizar direccion del contacto $opcionesPorRoles")
    public void thenVisualizarDireccionContactoAsociado(ExamplesTable opcionesPorRoles) {
        contactosAsociadosACuentaSteps.verificarDireccionContacto(opcionesPorRoles);
    }

    @Given("busco un contacto del directorio  que no exista en la cuenta con un rol existente")
    public void thenBuscUnContactoDelDirectorioQueNoExistaEnLaCuentaConUnRolExistente(){
        contactosAsociadosACuentaSteps.buscarContactoDelDirectorio();
    }


    @Given("y deseo eliminar el contacto <contactoEliminado>")
    public void givenYDeseoEliminarElContactocontactoEliminado(String contactoEliminado){
        contactosAsociadosACuentaSteps.eliminarContactoAsociando(contactoEliminado);
    }


    @Then("el contacto <contactoEliminado> ya no debe estar asociado a la cuenta")
    public void thenContatctoEliminado(String contactoEliminado){
        contactosAsociadosACuentaSteps.contactoEliminado(contactoEliminado);
    }


}
