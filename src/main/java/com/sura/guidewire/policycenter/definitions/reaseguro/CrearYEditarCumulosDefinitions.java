package com.sura.guidewire.policycenter.definitions.reaseguro;


import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.CrearYEditarCumulosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CrearYEditarCumulosDefinitions {

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;

    @Steps
    CrearYEditarCumulosSteps crearYEditarCumulosSteps;

    @Given("ingrese a edificios y ubicaciones")
    public void cuandoIntenteIngresarAEdificiosYUbicaciones() {
        informacionDePolizaMrcSteps.ingresarAEdificiosYUbicaciones();
    }

    @Given("intente ingresar una nueva ubicacion sin riesgo consultable")
    public void cuandoIntenteIngresarUnaNuevaUbicacionSinRiesgo() {
        edificiosUbicacionesSteps.removerRiesgos();
        edificiosUbicacionesSteps.ingresarNuevaUbicacionSinRiesgo();
    }

    @Given("intente ingresar una nueva ubicacion sin riesgo consultable $datosUbicacion")
    public void cuandoIntenteIngresarUnaNuevaUbicacionSinRiesgo(ExamplesTable datosUbicacion) {
        edificiosUbicacionesSteps.removerRiesgos();
        edificiosUbicacionesSteps.ingresarNuevaUbicacionSinRiesgo(datosUbicacion);
    }

    @When("intente ingresar una nueva ubicacion sin riesgo consultable $datosUbicacion")
    public void intenteIngresarUnNuevaUbicacionSinRiesgo(ExamplesTable datosUbicacion){
        edificiosUbicacionesSteps.removerRiesgos();
        edificiosUbicacionesSteps.ingresarNuevaUbicacionSinRiesgo(datosUbicacion);
    }

    @Given("intente ingresar las entradas de las diferentes coberturas $entradas")
    public void cuandoIntenteIngresarLasEntradasDeLasDiferentesCoberturas(ExamplesTable entradas) {
        edificiosUbicacionesSteps.seleccionarBotonAgregarArticuloAUnaUbicacion();
        edificiosUbicacionesSteps.ingresarCoberturas(entradas);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
    }

    @Given("cotice una poliza")
    public void cuandoCotizeUnaPoliza() {
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
    }

    @Given("ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>")
    public void ingreseAcuerdoFacultativo(@Named("descripcionDeAcuerdo") String descripcionDeAcuerdo) {
        crearYEditarCumulosSteps.ingresar_a_opcion_reaseguro();
        crearYEditarCumulosSteps.ingresar_a_opcion_crear_acuerdo_facultativo();
        crearYEditarCumulosSteps.ingresarDescripcionDeAcuerdoyDireccion(descripcionDeAcuerdo);
    }

    @When("ingrese la informacion de un reasegurador en la tabla de reaseguradores $datosReaseguradores")
    public void ingresaInformacionEnTablaParaReasegurado(ExamplesTable datosReaseguradores) {
        crearYEditarCumulosSteps.ingresarModalidadDeTasaEnTabla(datosReaseguradores);
    }

    @When("intente ingresar una nueva ubicacion en edificios $datosUbicacion")
    public void cuandoIntenteIngresarUnaNuevaUbicacionSinRiesgoConsultable(ExamplesTable datosUbicacion) {
        edificiosUbicacionesSteps.removerRiesgos();
        edificiosUbicacionesSteps.ingresarNuevaUbicacionSinRiesgo(datosUbicacion);

    }

    @Then("el valor de tasa bruta de cesion debe tomar el mismo valor de la columna en la tabla")
    public void thenElValorDeTasaBrutaDeCesionDebeTomarElMismoValorDeLaColumnavalor() {
        crearYEditarCumulosSteps.validaTasaBruta();
    }

    @Then("el valor de tasa neta de cesion debe tomar el valor definido para regla de negocio")
    public void thenElValorDeTasaNetaDeCesionDebeTomarElValorDefinidoParaReglaDeNegocio() {
        crearYEditarCumulosSteps.validaTasaNeta();
    }

    @Then("se debe mostrar un mensaje <mensaje> validando utilidades negativas")
    public void seDebeMostarUnmensajeValidandoUtilidadesNegatibas(@Named("mensaje") String mensaje) {
        crearYEditarCumulosSteps.validacionUtilidadesNegativas(mensaje);
    }

    @Then("el valor de la prima bruta de cesion debe tomar el mismo valor de la columna en la tabla")
    public void thenElValorDeprimaBrutaDeCesionDebeTomarElMismoValorDeLaColumnavalor() {
        crearYEditarCumulosSteps.validaPrimaBruta();
    }
}
