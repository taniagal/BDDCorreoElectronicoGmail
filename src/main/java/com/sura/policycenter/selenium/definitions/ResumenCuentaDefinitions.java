package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.ResumenCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by diegcaac on 18/05/2016.
 */
public class ResumenCuentaDefinitions {

    @Steps
    ResumenCuentaSteps resumenCuentaSteps;

    private Map<String, String> infoResumenCuenta = new HashMap<>();

    public ResumenCuentaDefinitions(){
        infoResumenCuenta.put("lblResumenCuenta", "Resumen del archivo de cuenta");
        infoResumenCuenta.put("lblIdOficiales", "Identificaciones oficiales");
        infoResumenCuenta.put("tipoDocumento", "Tipo documento");
        infoResumenCuenta.put("numDocumento", "Número documento");
        infoResumenCuenta.put("codigoAgente", "Código de agente");
        infoResumenCuenta.put("descAgente", "Descripción");
        infoResumenCuenta.put("numCuenta", "Cuenta número");
        infoResumenCuenta.put("lblPersonaJuridica", "Compañía");
        infoResumenCuenta.put("razonSocial", "Razón social");
        infoResumenCuenta.put("nombreComercial", "Nombre comercial");
        infoResumenCuenta.put("actComercial", "Actividad comercial");
        infoResumenCuenta.put("numEmpleados", "Numero de empleados");
        infoResumenCuenta.put("valorActivos", "Valor activos");
        infoResumenCuenta.put("ventasAnuales", "Ventas anuales");
        infoResumenCuenta.put("telOficina", "Teléfono de la oficina");
        infoResumenCuenta.put("emailPrimario", "Correo electrónico primario");
        infoResumenCuenta.put("segmentacion", "Segmentacion");
        infoResumenCuenta.put("comportamiento", "Comportamiento");
        infoResumenCuenta.put("direccion", "Dirección");
        infoResumenCuenta.put("tipoDireccion", "Tipo de dirección");
        infoResumenCuenta.put("descDireccion", "Descripción de dirección");
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
        infoResumenCuenta.put("numTrans", "N.° de transacción");
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
        infoResumenCuenta.put("causaMuerte", "Casua de muerte");
        infoResumenCuenta.put("fechaFallecimiento", "Fecha de fallecimiento");
        infoResumenCuenta.put("tipoTel", "Tipo de teléfono");
        infoResumenCuenta.put("telResidencial", "Teléfono residencial");
        infoResumenCuenta.put("telTrabajo", "Teléfono del trabajo");
        infoResumenCuenta.put("telCelular", "Teléfono celular");
    }

    @When("ingrese al resumen de la cuenta")
    public void consultarResumenCuenta(){
        resumenCuentaSteps.consultarResumenCuenta();
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
}