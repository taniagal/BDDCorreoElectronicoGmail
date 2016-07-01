package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import com.sura.policycenter.selenium.steps.ResumenCuentaSteps;
import java.util.HashMap;
import java.util.Map;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ResumenCuentaDefinitions {

    @Steps
    ResumenCuentaSteps resumenCuentaSteps;

    @Steps
    HistorialCuentaSteps historialCuentaSteps;

    private final Map<String, String> infoResumenCuenta = new HashMap<>();

    public ResumenCuentaDefinitions(){
        infoResumenCuenta.put("lblResumenCuenta", "Resumen de la cuenta");
        infoResumenCuenta.put("tipoDocumento", "Tipo documento");
        infoResumenCuenta.put("numDocumento", "Número documento");
        infoResumenCuenta.put("codigoAgente", "Código de agente");
        infoResumenCuenta.put("descAgente", "Descripción");
        infoResumenCuenta.put("numCuenta", "Cuenta número");
        infoResumenCuenta.put("estadoCuenta", "Estado de la cuenta");
        infoResumenCuenta.put("lblPersonaJuridica", "Compañía");
        infoResumenCuenta.put("razonSocial", "Razón social");
        infoResumenCuenta.put("nombreComercial", "Nombre comercial");
        infoResumenCuenta.put("actComercial", "Actividad económica");
        infoResumenCuenta.put("numEmpleados", "Número de empleados"); //Número de empleados
        infoResumenCuenta.put("telOficina", "Teléfono de la oficina");
        infoResumenCuenta.put("emailPersona", "Correo electrónico primario");
        infoResumenCuenta.put("emailSecundarioPersona", "Correo electrónico primario");
        infoResumenCuenta.put("emailEmpresa", "Correo electrónico primario");
        infoResumenCuenta.put("segmentacion", "Segmentación");
        infoResumenCuenta.put("comportamiento", "Comportamiento");
        infoResumenCuenta.put("pais", "País");
        infoResumenCuenta.put("departamento", "Departamento");
        infoResumenCuenta.put("ciudad", "Ciudad");
        infoResumenCuenta.put("direccion", "Dirección");
        infoResumenCuenta.put("codigoPostal", "Código postal");
        infoResumenCuenta.put("tipoDireccion", "Tipo de dirección");
        infoResumenCuenta.put("descripcionDireccion", "Descripción");
        infoResumenCuenta.put("lblActividades", "Actividades actuales");
        infoResumenCuenta.put("fechaVencimiento", "Fecha de vencimiento");
        infoResumenCuenta.put("prioridadAct", "Prioridad");
        infoResumenCuenta.put("temaAct", "Tema");
        infoResumenCuenta.put("asignadoAct", "Asignado a");
        infoResumenCuenta.put("lblTerminosPol", "Términos de la póliza");
        infoResumenCuenta.put("numPoliza", "N° de póliza");
        infoResumenCuenta.put("producto", "Producto");
        infoResumenCuenta.put("estadoPol", "Estado");
        infoResumenCuenta.put("fechaVigPol", "Fecha de vigencia");
        infoResumenCuenta.put("fechaExpPol", "Fecha de expiración");
        infoResumenCuenta.put("lblTransPolPendientes", "Transacciones de póliza pendientes");
        infoResumenCuenta.put("numTrans", "N.º de transacción");
        infoResumenCuenta.put("estadoTrans", "Estado");
        infoResumenCuenta.put("numPolTrans", "N° de póliza");
        infoResumenCuenta.put("productoTrans", "Producto");
        infoResumenCuenta.put("tipoTrans", "Tipo");
        infoResumenCuenta.put("aseguradorTrans", "Asegurador");
        infoResumenCuenta.put("lblPersonaNatural", "Personal");
        infoResumenCuenta.put("primerNombre", "Primer nombre");
        infoResumenCuenta.put("segundoNombre", "Segundo nombre");
        infoResumenCuenta.put("primerApellido", "Primer apellido");
        infoResumenCuenta.put("segundoApellido", "Segundo apellido");
        infoResumenCuenta.put("fechaNac", "Fecha de nacimiento");
        infoResumenCuenta.put("estadoCivil", "Estado civil");
        infoResumenCuenta.put("profesion", "Profesión");
        infoResumenCuenta.put("sexo", "Sexo");
        infoResumenCuenta.put("causaMuerte", "Causa de fallecimiento");
        infoResumenCuenta.put("fechaFallecimiento", "Fecha de fallecimiento");
        infoResumenCuenta.put("tipoTel", "Tipo de teléfono");
        infoResumenCuenta.put("telResidencial", "Teléfono residencial");
        infoResumenCuenta.put("telTrabajo", "Teléfono del trabajo");
        infoResumenCuenta.put("telCelular", "Teléfono celular");
        infoResumenCuenta.put("tipoFamilia", "Tipo familia");
        infoResumenCuenta.put("dependientesEconomicos", "Dependientes económicos");
        infoResumenCuenta.put("telCelular", "Teléfono celular");
    }

    @Given("estoy en el resumen de una cuenta <numCuenta> de tipo persona natural <tipoCuenta>")
    public void consultarResumenCtaPersonaNatural(@Named("numCuenta") String numCuenta){
        historialCuentaSteps.seleccionarCuenta(numCuenta);
        resumenCuentaSteps.consultarResumenCuenta();
    }

    @Given("estoy en el resumen de una cuenta <numCuenta> de tipo persona juridica <tipoCuenta>")
    public void consultarResumenCtaPersonaJuridica(@Named("numCuenta") String numCuenta){
        historialCuentaSteps.seleccionarCuenta(numCuenta);
        resumenCuentaSteps.consultarResumenCuenta();
    }

    @When("ingrese al resumen de la cuenta")
    public void consultarResumenCuenta(){
        resumenCuentaSteps.consultarResumenCuenta();
    }

    @When("ingrese a editar dicha cuenta")
    public void editarResumenCuenta(){
        resumenCuentaSteps.editarResumenCuenta();
    }

    @When("edite el campo pais <pais>")
    public void editarPais(@Named("pais") String pais){
        resumenCuentaSteps.editarPais(pais);
    }

    @When("edite el campo departamento <pais> <departamento>")
    public void editarDepto(@Named("pais") String pais,
                            @Named("departamento") String departamento){
        resumenCuentaSteps.editarPais(pais);
        resumenCuentaSteps.editarDepto(departamento);
    }

    @When("ingrese a editar la direccion de la cuenta e indique una direccion <direccion> que se pueda estandarizar")
    @Manual
    public void whenValidarDireccionEstandarizada() {
        // Se realiza manualmente.
    }

    @When("ingrese a editar la direccion de la cuenta e indique una direccion <direccion> que no se pueda estandarizar")
    @Manual
    public void whenValidarDireccionNoEstandarizada() {
        // Se realiza manualmente.
    }

    @Then("puedo visualizar el resumen de la cuenta seleccionada de tipo persona juridica, el listado de actividades, vigencias\n" +
            "de las polizas asociadas a la cuenta y transacciones pendientes de las polizas asociadas a la cuenta")
    public void verInfoResumenCuentaPersonaJuridica(){
        resumenCuentaSteps.verInfoResumenCuenta(infoResumenCuenta);
    }

    @Then("puedo visualizar el resumen de la cuenta seleccionada de tipo persona natural, el listado de actividades, vigencias \n" +
            "de las polizas asociadas a la cuenta y transacciones pendientes de las polizas asociadas a la cuenta")
    public void verInfoResumenCuentaPersonaNatural(){
        resumenCuentaSteps.verInfoResumenCuenta(infoResumenCuenta);
    }

    @Then("se deben habilitar los siguientes campos: primer nombre, segundo nombre, primer apellido, segundo apellido,\n" +
            "estado civil, profesion, fecha de fallecimiento, causa de fallecimiento, tipo familia, dependientes economicos,\n" +
            "correo electronico primario, correo electronico secundario, tipo de telefono, telefono primario, direccion")
    public void validarCamposPersonal(){
        resumenCuentaSteps.validarCamposEditablesPersona();
    }

    @Then("se deben habilitar los siguientes campos: razon social, nombre comercial, actividad economica, numero de empleados,\n" +
            "valor de activos, ventas anualues, telefono de la oficina, correo electronico primario, correo electronico secundario, direccion")
    public void validarCamposCompania(){
        resumenCuentaSteps.validarCamposEditablesCompania();
    }

    @Then("se debe cargar el valor \"<ninguno>\" en el campo departamento <departamento>")
    public void validarDepartamento(@Named("departamento") String departamento){
        resumenCuentaSteps.validarDepartamento(departamento);
    }

    @Then("se debe cargar el valor por defecto \"<ninguno>\" en el campo ciudad <ciudad>")
    public void validarCiudad(@Named("ciudad") String ciudad){
        resumenCuentaSteps.validarCiudad(ciudad);
    }

    @Then("se debe almacenar la direccion de acuerdo a la estandarizacion dada")
    @Manual
    public void thenValidarDireccionEstandarizada() {
        // Se realiza manualmente.
    }

    @Then("se debe almacenar la direccion como la ingreso el usuario")
    @Manual
    public void thenValidarDireccionNoEstandarizada() {
        // Se realiza manualmente.
    }
}