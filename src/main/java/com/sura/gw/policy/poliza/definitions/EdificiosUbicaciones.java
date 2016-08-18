package com.sura.gw.policy.poliza.definitions;

import com.sura.gw.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.sura.gw.navegacion.definitions.Navegacion;
import com.sura.gw.policy.poliza.steps.EdificiosUbicacionesSteps;
import com.sura.gw.policy.poliza.steps.PolizaSteps;
import com.sura.policycenter.selenium.steps.DetallesDeUbicacionSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.*;
import org.hamcrest.core.StringContains;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static ch.lambdaj.Lambda.filter;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class EdificiosUbicaciones {

    @Steps PolizaSteps polizaSteps;
    @Steps EdificiosUbicacionesSteps edificiosUbicacionesSteps;
    @Steps IngresoAPolicyCenterDefinitions guidewire;
    @Steps Navegacion navegacion;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    @Given("que estoy en edificios y ubicaciones de una poliza $numSubscripcion")
    public void dadoQueEstoyEnEdificiosYUbicacionesDeUnaPoliza(String numSubscripcion){

        // TODO: 04/08/2016 Existen otros dado ?:  El artículo Edificio debe tener mínimo un asegurado, El artículo Dinero en efectivo debe tener mínimo un asegurado

        LOGGER.info("EdificiosUbicaciones.dadoQueEstoyEnEdificiosYUbicacionesDeUnaPoliza");



        // TODO: 04/08/2016 Capturar el rol desde el gherkin en i am Asesor
        guidewire.dadoQueAccedoAPolicyCenterConRol("Asesor");
        navegacion.cuandoSeleccioneOpcionDesplegableDeMenuSuperiorPoliza();
        navegacion.cuandoBusquePorNumeroDeSubscripcionDePoliza(numSubscripcion);
        try {
            polizaSteps.seleccionar_boton_llamado_editar_transaccion_de_poliza();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION NO ENCONTRADO " + e);
        }

        polizaSteps.seleccionar_opcion_edificios_y_ubicaciones();
    }

    @When("intente ingresar las entradas de las diferentes coberturas $entradas")
    public void cuandoIntenteIngresarLasEntradasDeLasDiferentesCoberturas(ExamplesTable entradas){

        edificiosUbicacionesSteps.seleccionar_boton_agregar_articulo_a_una_ubicacion();
        for (Map<String,String> entradaCobertura : entradas.getRows()) {
            String tab = entradaCobertura.get("TAB");

            String tipoArticulo = entradaCobertura.get("TIPO_ARTICULO");

            String cobertura = entradaCobertura.get("COBERTURA");
            String entrada = entradaCobertura.get("ENTRADAS");
            String valorEntrada = entradaCobertura.get("VALOR_ENTRADAS");

            edificiosUbicacionesSteps.ingresarValorDeEntradaDeLaCoberturaDelRiesgo(tab, cobertura, entrada, valorEntrada, tipoArticulo);
        }
        edificiosUbicacionesSteps.seleccionar_boton_aceptar_en_la_parte_superior_izquierda();
    }

    @When("haga clic en el boton Aceptar")
    public void cuandoHagaClicEnElBotonAceptar(){
        edificiosUbicacionesSteps.seleccionar_boton_aceptar_en_la_parte_superior_izquierda();
    }

    @When("cuando intente ingresar un articulo para una ubicacion para comprobar las validaciones de error del articulo")
    public void cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo() {

        try {
            polizaSteps.seleccionar_boton_llamado_editar_transaccion_de_poliza();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION NO ENCONTRADO " + e);
        }

        polizaSteps.seleccionar_opcion_edificios_y_ubicaciones();
        edificiosUbicacionesSteps.seleccionar_boton_agregar_articulo_a_una_ubicacion();
        cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo();

        LOGGER.info("Poliza.cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo");
    }


    public void cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo() {
        edificiosUbicacionesSteps.seleccionar_check_del_articulo_a_agregar();
        edificiosUbicacionesSteps.seleccionar_check_de_cobertura_que_desea_aplicar();

        /*
        Se ingresa valor asegurado superior al valor del articulo a asegurar y se ingresa valores a sublimites
        que superen el valor asegurado con el fin de validar en el paso de comprobaciones que se verifiquen los limites
        de valores para valor asegurado y sublimites.
         */
        edificiosUbicacionesSteps.ingresar_valor_reconstruccion_del_articulo("10000");
        edificiosUbicacionesSteps.ingresar_valor_asegurado_danos_materiales("10001");
        edificiosUbicacionesSteps.ingresar_valor_sublimite_translados("10002");
        edificiosUbicacionesSteps.ingresar_valor_sublimite_para_combustion("10002");
        edificiosUbicacionesSteps.seleccionar_boton_aceptar_en_la_parte_superior_izquierda();
    }


    @When("cuando intente ingresar una ubicacion para comprobar las validaciones de riesgos consultables")
    public void cuandoIntenteIngresarUnaUbicacionParaComprobarLasValidacionesDeRiesgosConsultables() {
        LOGGER.info("Poliza.cuandoIntenteIngresarUnaUbicacionParaComprobarLasValidacionesDeRiesgosConsultables");

        try {
            polizaSteps.seleccionar_boton_llamado_editar_transaccion_de_poliza();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION NO ENCONTRADO " + e);
        }

        polizaSteps.seleccionar_opcion_edificios_y_ubicaciones();
        edificiosUbicacionesSteps.ingresar_nueva_ubicacion();
    }

    @Then("espero ver mensajes de advertencia indicandome la direccion es un riesgo consultable")
    public void entoncesEsperoVerMensajeDeAdvertenciaQueUbicacionEsRiesgoConsultable() {
        for (String mensaje : polizaSteps.espacioDeTrabajo()){
            MatcherAssert.assertThat("Mensaje de advertencia de riesgo consultable no coincide con el esperado",
                    mensaje,
                    StringContains.containsString("La dirección es un riesgo no estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial."
                    ));
        }

        edificiosUbicacionesSteps.cancelar_ingreso_de_nueva_ubicacion();
    }


    @Then("se debe validar que ningun sublimite de las coberturas anteriores sobrepase el valor asegurado de la cobertura de sustraccion con violencia (sustraccion principal) $mensajesEsperados")
    @Aliases(values={
            "se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales). $mensajesEsperados",
            "se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo) $mensajesEsperados"
    })
    public void entoncesValidarQueAparezcanLosSiguientesMensajesEnElEspacioDeTrabajo(ExamplesTable mensajesEsperados) {
        edificiosUbicacionesSteps.verificar_mensajes(mensajesEsperados);
        edificiosUbicacionesSteps.cancelar_ingreso_de_nueva_ubicacion();
    }

    @Then("no debe dejar continuar y debe permanecer en la pagina $pagina")
    public void noDebeDejarContinuarYDebePermanecerEnLaPagina(String pagina) {
        //Metodo Vacio
    }

    private Matcher<? super List<String>> hasItemContainsString(String expectedValue) {
        return new HasItemContainsString(expectedValue);
    }

    private static class HasItemContainsString extends TypeSafeMatcher<List<String>> {

        private final String expectedValue;

        private HasItemContainsString(String expectedValue) {
            this.expectedValue = expectedValue;
        }

        @Override
        protected boolean matchesSafely(List<String> values) {
            return !filter(containsString(expectedValue), values).isEmpty();
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("Se esperaba una lista que contuviera un strings ").appendValue(expectedValue);
        }
    }

}
