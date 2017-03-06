package com.sura.guidewire.policycenter.definitions.agente;

import com.sura.guidewire.policycenter.steps.agente.BusquedaDeAsesorSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDeAsesorDefinitions {

    @Steps
    BusquedaDeAsesorSteps busquedaDeAgenteSteps;

    @Given("estoy en la busqueda de agentes")
    public void irALaPantallaDeBusquedaDeAgente(){
        busquedaDeAgenteSteps.irALaPantallaDeBusquedaDeAgente();
    }

    @When("valide los campos de la pantalla")
    public void validarCamposOcultosDeLaPantalla(){
        busquedaDeAgenteSteps.validarCamposOcultosDeLaPantalla();
    }

    @When("ingrese un codigo de un asesor <codigoAsesor>")
    public void ingresarCodigoDeAgente(@Named("codigoAsesor") String codigoAsesor){
        busquedaDeAgenteSteps.ingresarCodigoDeAgente(codigoAsesor);
    }

    @When("ingrese el nombre de un asesor <nombreAsesor>")
    public void ingresarNombreDeAsesor(@Named("nombreAsesor") String nombreAsesor){
        busquedaDeAgenteSteps.ingresarNombreDeAgente(nombreAsesor);
    }

    @When("no ingreso ningun filtro para la consulta")
    public void noIngresarDatosEnLosCamposDeFiltro(){
        busquedaDeAgenteSteps.noIngresarDatosEnLosCamposDeFiltro();
    }

    @Then("debo ver la informacion del agente a continuacion $resultadoEsperado")
    public void validarResultadosDeConsulta(ExamplesTable resultadoEsperado){
        busquedaDeAgenteSteps.validarResultadosDeConsulta(resultadoEsperado);
    }

    @Then("debo ver el mensaje <mensaje> indicando al usuario lo sucedido")
    public void validarMensajeParaElUsuario(@Named("mensaje") String mensaje){
        busquedaDeAgenteSteps.validarMensaje(mensaje);
    }
}
