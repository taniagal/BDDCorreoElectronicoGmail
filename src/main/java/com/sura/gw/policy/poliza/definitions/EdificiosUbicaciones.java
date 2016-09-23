package com.sura.gw.policy.poliza.definitions;

import ch.lambdaj.Lambda;
import com.sura.gw.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.sura.gw.navegacion.steps.GuidewireSteps;
import com.sura.gw.policy.poliza.steps.EdificiosUbicacionesSteps;
import com.sura.gw.policy.poliza.steps.PolizaSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.hamcrest.*;
import org.hamcrest.core.Is;
import org.hamcrest.core.StringContains;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EdificiosUbicaciones {

    @Steps
    PolizaSteps polizaSteps;
    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;
    @Steps
    IngresoAPolicyCenterDefinitions guidewireLogin;
    @Steps
    GuidewireSteps guidewire;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    @Given("que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>")
    public void dadoQueEstoyEnEdificiosYUbicacionesDeUnaPoliza(String numSubscripcion, String rolUsuario) {

        //TODO: 04/08/2016 Existen otros dado ?:  El artículo Edificio debe tener mínimo un asegurado, El artículo Dinero en efectivo debe tener mínimo un asegurado


        LOGGER.info("EdificiosUbicaciones.dadoQueEstoyEnEdificiosYUbicacionesDeUnaPoliza");

        if (SerenityWebdriverManager.inThisTestThread().isDriverInstantiated()) {
            SerenityWebdriverManager.inThisTestThread().resetCurrentDriver();
        }

        guidewireLogin.dadoQueAccedoAPolicyCenterConRol(rolUsuario);

        guidewire.ir_a_navegacion_superior()
                .desplegar_menu_poliza().consultar_numero_de_subscripcion(numSubscripcion);

        try {
            polizaSteps.seleccionar_boton_llamado_editar_transaccion_de_poliza();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION NO ENCONTRADO " + e);
        }

        polizaSteps.seleccionar_opcion_edificios_y_ubicaciones();
    }

    @When("intente ingresar las entradas de las diferentes coberturas $entradas")
    public void cuandoIntenteIngresarLasEntradasDeLasDiferentesCoberturas(ExamplesTable entradas) {

        edificiosUbicacionesSteps.seleccionar_boton_agregar_articulo_a_una_ubicacion();
        int index = 0;
        for (Map<String, String> entradaCobertura : entradas.getRows()) {
            index++;

            String tab = entradaCobertura.get("TAB");
            String tipoArticulo = entradaCobertura.get("TIPO_ARTICULO");
            String cobertura = entradaCobertura.get("COBERTURA");
            String entrada = entradaCobertura.get("ENTRADAS");
            boolean esOtroArticulo = false;
            if ("X".equals(entradaCobertura.get("OTRO_ARTICULO_OTROS"))){
                esOtroArticulo = true;
            }
            boolean esUltimaFilaDeExampleTable = index == entradas.getRows().size();
            String valorEntrada = entradaCobertura.get("VALOR_ENTRADAS");

            edificiosUbicacionesSteps.ingresarValorDeEntradaDeLaCoberturaDelRiesgo(tab, cobertura, entrada, valorEntrada, tipoArticulo, esOtroArticulo, esUltimaFilaDeExampleTable);
        }

        edificiosUbicacionesSteps.seleccionar_boton_aceptar_en_la_parte_superior_izquierda();
    }

    @When("haga clic en el boton Aceptar")
    public void cuandoHagaClicEnElBotonAceptar() {
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


    @Then("se debe validar que ningun sublimite de las coberturas anteriores sobrepase el valor asegurado de la cobertura de sustraccion con violencia (sustraccion principal) $mensajesEsperados")
    @Aliases(values = {
            "se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales). $mensajesEsperados",
            "se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo) $mensajesEsperados"
    })
    public void entoncesValidarQueAparezcanLosSiguientesMensajesEnElEspacioDeTrabajo(ExamplesTable mensajesEsperados) {
        List<String> mensajesWSList = new ArrayList<>(polizaSteps.espacioDeTrabajo());

        for (Map<String, String> mensajes : mensajesEsperados.getRows()) {
            String mensaje = mensajes.get("MENSAJES_WORKSPACE");
            MatcherAssert.assertThat(mensajesWSList, hasItemContainsString(mensaje));
        }

        edificiosUbicacionesSteps.cancelar_ingreso_de_nueva_ubicacion();
    }

    @Then("se espera que el siguiente mensaje se muestre una sola vez: $mensajesEsperado")
    public void entoncesSeEsperaQueElMensajeSeMuestreUnaSolaVez(String mensajesEsperado) {
        List<String> mensajesWSList = new ArrayList<>(polizaSteps.espacioDeTrabajo());
        int contadorDeOcurrencias = 0;

        if (mensajesWSList.contains(mensajesEsperado)) {
            contadorDeOcurrencias++;
        }
        MatcherAssert.assertThat("Ocurrencia de mensaje: " + mensajesEsperado + " es de " + contadorDeOcurrencias + "veces", contadorDeOcurrencias, Is.is(CoreMatchers.equalTo(1)));

        edificiosUbicacionesSteps.cancelar_ingreso_de_nueva_ubicacion();
    }

    @Then("no debe dejar continuar y debe permanecer en la pagina $pagina")
    public void noDebeDejarContinuarYDebePermanecerEnLaPagina(String pagina) {
        //Metodo Vacio
    }

    private Matcher<? super List<String>> hasItemContainsString(String expectedValue) {
        return new HasItemContainsString(expectedValue);
    }

    private static final class HasItemContainsString extends TypeSafeMatcher<List<String>> {

        private final String expectedValue;

        private HasItemContainsString(String expectedValue) {
            this.expectedValue = expectedValue;
        }

        @Override
        protected boolean matchesSafely(List<String> values) {
            return !Lambda.filter(StringContains.containsString(expectedValue), values).isEmpty();
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("Se esperaba una lista que contuviera un strings ").appendValue(expectedValue);
        }
    }
    


}
