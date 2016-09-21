package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.DireccionesDeContactoVinculadasSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class DireccionesDeContactoVinculadasDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private DireccionesDeContactoVinculadasSteps direccionesDeContactoVinculadasSteps;

    @Given("que me encuentro en los contactos de la cuenta")
    public void irALosContactosDeLaCuenta() {
        direccionesDeContactoVinculadasSteps.irALosContactosDeLaCuenta();
    }

    @Given("quiera crear un contacto secundario persona natural")
    public void seleccionarCrearContactoSecundarioPersonaNatural(){
        direccionesDeContactoVinculadasSteps.seleccionarCrearContactoSecundarioPersonaNatural();
    }

    @When("cuando vincule las direcciones del contacto <nombreContactoUno> y contacto <nombreContactoDos> y la desee editar")
    public void filtrarPorNumeroCuenta(@Named("nombreContactoUno") String nombreContactoUno,
                                       @Named("nombreContactoDos") String nombreContactoDos) {
        direccionesDeContactoVinculadasSteps.vincularDirecciones(nombreContactoUno, nombreContactoDos);
    }

    @Then("me debe mostrar la siguiente informacion: $resultadoModificacionDireccion")
    public void validarInformacion(ExamplesTable resultadoModificacionDireccion){
        direccionesDeContactoVinculadasSteps.validarInformacion(resultadoModificacionDireccion);
    }

    @When("ingrese solo informacion obligatoria")
    public void filtrarPorInfoObligatoria() {
        direccionesDeContactoVinculadasSteps.filtrarPorInfoObligatoria();
    }

    @When("quiera actualizar la direccion de un contacto que tiene otros contactos que la usan")
    public void seleccionarContacto() {
        direccionesDeContactoVinculadasSteps.seleccionarContacto();
    }

    @When("ingrese a editar la direccion por <direccion>")
    public void editarDireccion(@Named("direccion") String direccion){
        direccionesDeContactoVinculadasSteps.editarDireccion(direccion);
    }

    @When("ingrese a editar la direccion por <direccionSinEstandarizar>")
    public void editarDireccionSinEstandarizar(@Named("direccionSinEstandarizar") String direccionSinEstandarizar){
        direccionesDeContactoVinculadasSteps.editarDireccionSinEstandarizar(direccionSinEstandarizar);
    }

    @When("ingrese a editar la direccion por <direccion> en detalle contacto pestaña direcciones")
    public void editarDireccionEnPestañaDirecciones(@Named("direccion") String direccion){
        direccionesDeContactoVinculadasSteps.editarDireccionEnPestaniaDirecciones(direccion);
    }

    @When("ingrese a editar la direccion e ingrese el pais <pais>")
    public void editarCampoPais(@Named("pais") String pais){
        direccionesDeContactoVinculadasSteps.editarDireccionCampoPais(pais);
    }

    @When("seleccione el contacto a editar <nombreContacto>")
    public void seleccionarContactoAEditar(@Named("nombreContacto") String nombreContacto){
        direccionesDeContactoVinculadasSteps.seleccionarContactoAEditar(nombreContacto);
    }

    @When("seleccione la opcion para editar la direccion")
    public void seleccionarEditarDireccionVinculada(){
        direccionesDeContactoVinculadasSteps.seleccionarEditarDireccionVinculada();
    }

    @When("ingrese a editar la direccion por <direccion> en la ventana de contactos vinculados")
    public void editarDireccionVinculadaDelContacto(@Named("direccion") String direccion){
        direccionesDeContactoVinculadasSteps.editarDireccionVinculadaDelContacto(direccion);
    }

    @When("ingrese a editar la direccion por <direccion> en la ventana de contactos vinculados y desligue la direccion")
    public void editarDireccionYDesligar(@Named("direccion") String direccion){
        direccionesDeContactoVinculadasSteps.editarDireccionYDesligar(direccion);
    }

    @When("despliegue la lista de contactos")
    public void desplegarListaDeContactosParaAsignarLaDireccion(){
        direccionesDeContactoVinculadasSteps.desplegarListaDeContactosParaAsignarLaDireccion();
    }

    @Then("me debe mostrar esta informacion: $resultadoModificacionDireccion")
    public void validarInformacionContacto(ExamplesTable resultadoModificacionDireccion){
        direccionesDeContactoVinculadasSteps.validarInformacionContacto(resultadoModificacionDireccion);
    }

    @Then("me debe validar la informacion de los contactos que usan esa direccion: $contactosDireccionVinculada")
    public void validarInfoContactosAsociadosADireccion(ExamplesTable contactosDireccionVinculada){
        direccionesDeContactoVinculadasSteps.validarInfoContactosAsociadosADireccion(contactosDireccionVinculada);
    }

    @Then("el campo direccion no debe permitir ingresar mas de 200 caracteres <direccionOk>")
    public void validarLongitudDelCampoDireccion(@Named("direccionOk") String direccionOk){
        direccionesDeContactoVinculadasSteps.validarLongitudDelCampoDireccion(direccionOk);
    }

    @Then("el campo departamento debe tener el valor <departamento>")
    public void validarElCampoDepartamento(@Named("departamento")String departamento){
        direccionesDeContactoVinculadasSteps.validarElCampoDepartamento(departamento);
    }

    @Then("el campo ciudad debe tener el valor <ciudad>")
    public void validarElCampoCiudad(@Named("ciudad")String ciudad){
        direccionesDeContactoVinculadasSteps.validarElCampoCiudad(ciudad);
    }

    @Then("la direccion debe quedar estandarizada <direccionEstandarizada> del contacto <nombreContacto>")
    public void validarDireccionEstandarizada(@Named("direccionEstandarizada") String direccionEstandarizada,
                                              @Named("nombreContacto") String nombreContacto){
        direccionesDeContactoVinculadasSteps.validarDireccionEstandarizada(direccionEstandarizada, nombreContacto);
    }

    @Then("la direccion debe quedar como la ingreso el usuario <direccionUsuario> del contacto <nombreContacto>")
    public void validarDireccionNoEstandarizada(@Named("direccionUsuario") String direccionUsuario,
                                                @Named("nombreContacto") String nombreContacto){
        direccionesDeContactoVinculadasSteps.validarDireccionVinculada(direccionUsuario, nombreContacto);
    }

    @Then("la direccion <direccionVinculada> fue actualizada <nombreContacto>")
    public void validarDireccionVinculada(@Named("direccionVinculada") String direccionVinculada,
                                          @Named("nombreContacto") String nombreContacto){
        direccionesDeContactoVinculadasSteps.validarDireccionVinculada(direccionVinculada, nombreContacto);
    }

    @Then("las direcciones fueron desvinculas de los contactos: $contactosDireccionDesvinculada")
    public void validarDireccionDesvinculada(ExamplesTable contactosDireccionDesvinculada){
        direccionesDeContactoVinculadasSteps.validarDireccionDesvinculada(contactosDireccionDesvinculada);
    }

    @Then("la lista de contactos debe ser la siguiente: $contactosAsociados")
    public void validarContactosAsociados(ExamplesTable contactosAsociados){
        direccionesDeContactoVinculadasSteps.validarContactosAsociados(contactosAsociados);
    }

    @Then("debo poder asociar una direccion de otro contacto y se debe asociar la dirección seleccionada al nuevo contacto  y mostrar los datos de la dirección $direccionAsociada")
    public void asociarDireccionAContactoSecundario(ExamplesTable direccionAsociada){
        direccionesDeContactoVinculadasSteps.validarAsociacionDeDireccionAContactoSecundario(direccionAsociada);
    }

    @Then("los nombres de las etiquetas de la ventana son correctos para el titulo <titulo> y los botones <botonLigagas> y <botonDesligar>")
    public void validarEtiquetasDeLaVentana(@Named("titulo") String titulo,
                                            @Named("botonLigagas") String botonLigagas,
                                            @Named("botonDesligar") String botonDesligar){
        direccionesDeContactoVinculadasSteps.validarEtiquetasDeLaVentana(titulo, botonLigagas, botonDesligar);
    }

    @AfterStory
    public void despuesDeLaHistoria(){
        driver.close();
    }

}
