package com.sura.guidewire.policycenter.definitions.reaseguro;


import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.CrearYEditarCumulosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
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
        informacionDePolizaMrcSteps.ingresar_a_edificios_y_ubicaciones();
    }

    @Given("intente ingresar una nueva ubicacion sin riesgo consultable")
    public void cuandoIntenteIngresarUnaNuevaUbicacionSinRiesgo() {
        edificiosUbicacionesSteps.remover_riesgos();
        edificiosUbicacionesSteps.ingresar_nueva_ubicacion_sin_riesgo();
    }

    @Given("intente ingresar las entradas de las diferentes coberturas $entradas")
    public void cuandoIntenteIngresarLasEntradasDeLasDiferentesCoberturas(ExamplesTable entradas) {
        edificiosUbicacionesSteps.seleccionar_boton_agregar_articulo_a_una_ubicacion();
        edificiosUbicacionesSteps.ingresarCoberturas(entradas);
        edificiosUbicacionesSteps.seleccionar_boton_aceptar_en_la_parte_superior_izquierda();
    }

    @Given("cotice una poliza")
    public void cuandoCotizeUnaPoliza(){
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
    }

    @Given("ingrese la informacion de un acuerdo facultativo")
    public void ingreseAcuerdoFacultativo(){
        crearYEditarCumulosSteps.ingresar_a_opcion_reaseguro();
        crearYEditarCumulosSteps.ingresar_a_opcion_crear_acuerdo_facultativo();
    }

}
