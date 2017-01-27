package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.pages.AgregarArticuloEdificiosyUbicacionesWidget;
import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.ExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.PolizaSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import com.sura.guidewire.policycenter.utils.AssertUtil;
import com.sura.guidewire.policycenter.utils.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireSteps;
import gherkin.formatter.model.Examples;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.reports.html.ExampleTable;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EdificiosUbicacionesDefinitions {

    @Steps
    PolizaSteps polizaSteps;
    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;
    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;
    @Steps
    IngresoAPolicyCenterDefinitions guidewireLogin;
    @Steps
    GuidewireSteps guidewire;
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;
    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    @Given("que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>")
    public void dadoQueEstoyEnEdificiosYUbicacionesDeUnaPoliza(String numSubscripcion, String rolUsuario) {
        LOGGER.info("EdificiosUbicacionesDefinitions.dadoQueEstoyEnEdificiosYUbicacionesDeUnaPoliza");
        nuevaCotizacionSteps.irABuscarCotizacion(numSubscripcion);
        try {
            polizaSteps.seleccionarBotonLlamadoEditarTransaccionDePoliza();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION NO ENCONTRADO " + e);
        }
        polizaSteps.seleccionarOpcionEdificiosYUbicaciones();
    }

    @When("intente ingresar las entradas de las diferentes coberturas $entradas")
    public void cuandoIntenteIngresarLasEntradasDeLasDiferentesCoberturas(ExamplesTable entradas) {
        edificiosUbicacionesSteps.seleccionarBotonAgregarArticuloAUnaUbicacion();
        edificiosUbicacionesSteps.ingresarCoberturas(entradas);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
    }

    @When("ingrese las entradas de las diferentes coberturas $coberturas")
    public void ingresarLasEntradasDeLasDiferentesCoberturas(ExamplesTable coberturas) {
        edificiosUbicacionesSteps.ingresarCoberturas(coberturas);
    }

    @When("ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario> adicional  $entradatable")
    public void cuandoIntenteIngresarLasEntradasDeLasDiferentesCoberturasConInteresado(ExamplesTable entradatable, String documento, String tipodocumento, String tipoBeneficiario) {
        edificiosUbicacionesSteps.seleccionarBotonAgregarArticuloAUnaUbicacion();
        edificiosUbicacionesSteps.ingresarCoberturas(entradatable);
        edificiosUbicacionesSteps.ingresarInteresAdicionalAArticulo(documento, tipodocumento);
        edificiosUbicacionesSteps.ingresarTipoBeneficiario(tipoBeneficiario);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
        edificiosUbicacionesSteps.seleccionarBotonCotizar();
    }

    @When("ingrese la entrada de las diferentes coberturas mrc $ingresotable")
    public void cuandoIntenteIngresarLasEntradasDeLasDiferentesCoberturasMrc(ExamplesTable ingresotable){
        edificiosUbicacionesSteps.seleccionarBotonAgregarArticuloAUnaUbicacion();
        edificiosUbicacionesSteps.ingresarCoberturas(ingresotable);
    }

    @When("ingrese a modificar articulo con beneficiario oneroso en cambio de poliza $modificararticulo")
    public void cuandoIntenteModificarArticuloConBeneficiarioOneroso(ExamplesTable modificararticulo){
        edificiosUbicacionesSteps.seleccionarBotonAgregarArticuloAUnaUbicacionEnCambioDePoliza();
        edificiosUbicacionesSteps.ingresarCoberturas(modificararticulo);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
        edificiosUbicacionesSteps.seleccionarBotonCotizar();
    }

    @When("ingresar interes adicional <tipoBeneficiario> a cada cobertura $interesados")
    public void agregarInteresAdicional(ExamplesTable interesados){
        edificiosUbicacionesSteps.ingresarInteresesAdicionalesACadaArticulo(interesados);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();

    }

    @When("ingresar interes adicional <tipoBeneficiario> a una sola cobertura $interesado")
    public void agregarInteresAdicionalUnacobertura(ExamplesTable interesado){
        edificiosUbicacionesSteps.ingresarInteresAdicionalAUnSoloArticulo(interesado);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
    }

    @When("ingrese las entradas en cambio de poliza de las diferentes coberturas con interes <cedula><tipodocumento> <tipoBeneficiario> adicional  $entradatable")
    public void cuandoIntenteIngresarLasEntradasEnCambioDePolizaDeLasDiferentesCoberturasConInteresado(ExamplesTable entradatable, String cedula, String tipoBeneficiario, String tipodocumento) {
        edificiosUbicacionesSteps.seleccionarBotonAgregarArticuloAUnaUbicacionEnCambioDePoliza();
        edificiosUbicacionesSteps.ingresarCoberturas(entradatable);
        edificiosUbicacionesSteps.ingresarInteresAdicionalAArticulo(cedula, tipodocumento);
        edificiosUbicacionesSteps.ingresarTipoBeneficiario(tipoBeneficiario);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
        edificiosUbicacionesSteps.seleccionarBotonCotizar();
    }

    @When("ingrese las entradas en cambio de poliza y verificar las reglas de oneroso")
    public void cuandoIntenteIngresarLasEntradasVerificarReglasOneroso(){
        edificiosUbicacionesSteps.seleccionarBotonAgregarArticuloAUnaUbicacionEnCambioDePoliza();
        edificiosUbicacionesSteps.desseleccionarArticulo();
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
        edificiosUbicacionesSteps.seleccionarBotonCotizar();
    }

    @When("ingrese las entradas en renovacion de poliza de las diferentes coberturas con interes <cedula><tipodocumento> <tipoBeneficiario> adicional  $entradatable")
    public void cuandoIntenteIngresarLasEntradasEnRenovacionDePolizaDeLasDiferentesCoberturasConInteresado(ExamplesTable entradatable, String cedula, String tipoBeneficiario, String tipodocumento) {
        edificiosUbicacionesSteps.seleccionarBotonAgregarArticuloAUnaUbicacionEnRenovacionDePoliza();
        edificiosUbicacionesSteps.ingresarCoberturas(entradatable);
        edificiosUbicacionesSteps.ingresarInteresAdicionalAArticulo(cedula, tipodocumento);
        edificiosUbicacionesSteps.ingresarTipoBeneficiario(tipoBeneficiario);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
        edificiosUbicacionesSteps.seleccionarBotonCotizar();
    }


    @When("intente ingresar una nueva ubicacion")
    public void cuandoIntenteIngresarUnaNuevaUbicacion() {
        edificiosUbicacionesSteps.removerRiesgos();
        edificiosUbicacionesSteps.ingresarNuevaUbicacion();
    }

    @When("intente ingresar una nueva ubicacion sin riesgo consultable")
    public void cuandoIntenteIngresarUnaNuevaUbicacionSinRiesgo() {
        edificiosUbicacionesSteps.removerRiesgos();
        edificiosUbicacionesSteps.ingresarNuevaUbicacionSinRiesgo();
    }

    @When("intente ingresar una nueva ubicacion en renovacion de poliza")
    public void cuandoIntenteIngresarUnaNuevaUbicacionEnRenovacionDePoliza() {
        edificiosUbicacionesSteps.seleccionarBotonEditarTransaccionDePoliza();
        edificiosUbicacionesSteps.removerRiesgos();
        edificiosUbicacionesSteps.ingresarNuevaUbicacion();
    }

    @When("haga clic en el boton Aceptar")
    public void cuandoHagaClicEnElBotonAceptar() {
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
    }

    @When("cuando intente ingresar un articulo para una ubicacion para comprobar las validaciones de error del articulo")
    public void cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo() {
        try {
            polizaSteps.seleccionarBotonLlamadoEditarTransaccionDePoliza();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION NO ENCONTRADO " + e);
        }
        polizaSteps.seleccionarOpcionEdificiosYUbicaciones();
        edificiosUbicacionesSteps.seleccionarBotonAgregarArticuloAUnaUbicacion();
        cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo();
        LOGGER.info("Poliza.cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo");
    }

    @When("intente cotizar y expedir la poliza")
    public void cuandoIntenteCotizarYExpedirLaPoliza() {
        edificiosUbicacionesSteps.seleccionarBotonCotizar();
        tasaUnicaSteps.expedirPoliza();
    }

    public void cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo() {
        edificiosUbicacionesSteps.seleccionarCheckDelArticuloAAgregar();
        edificiosUbicacionesSteps.seleccionarCheckDeCoberturaQueDeseaAplicar();
        /*
        Se ingresa valor asegurado superior al valor del articulo a asegurar y se ingresa valores a sublimites
        que superen el valor asegurado con el fin de validar en el paso de comprobaciones que se verifiquen los limites
        de valores para valor asegurado y sublimites.
         */
        edificiosUbicacionesSteps.ingresarValorReconstruccionDelArticulo("10000");
        edificiosUbicacionesSteps.ingresarValorAseguradoDanosMateriales("10001");
        edificiosUbicacionesSteps.ingresarValorSublimiteTranslados("10002");
        edificiosUbicacionesSteps.ingresarValorSublimiteParaCombustion("10002");
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
    }

    @When("seleccione el tipo de mercancia flotante <tipoMercancia>")
    public void seleccionarElTipoDeMercanciaFlotante(@Named("tipoMercancia") String tipoMercancia){
        edificiosUbicacionesSteps.seleccionarElTipoDeMercanciaFlotante(tipoMercancia);
    }


    @Then("se debe validar que ningun sublimite de las coberturas anteriores sobrepase el valor asegurado de la cobertura de sustraccion con violencia (sustraccion principal) $mensajesEsperados")
    @Aliases(values = {
            "se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales). $mensajesEsperados",
    })
    public void entoncesValidarQueAparezcanLosSiguientesMensajesEnElEspacioDeTrabajo(ExamplesTable mensajesEsperados) {
        List<String> mensajesWSList = new ArrayList<>(polizaSteps.espacioDeTrabajo());

        for (Map<String, String> mensajes : mensajesEsperados.getRows()) {
            String mensaje = mensajes.get("MENSAJES_WORKSPACE");
            MatcherAssert.assertThat(mensajesWSList, AssertUtil.hasItemContainsString(mensaje));
        }
        edificiosUbicacionesSteps.cancelarIngresoDeNuevaUbicacion();
    }

    @Then("se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo) $mensajesEsperados")
    public void entoncesValidarQueAparezcanLosSiguientesMensajesEnElEspacio(ExamplesTable mensajesEsperados) {
        edificiosUbicacionesSteps.verificarMensaje(mensajesEsperados);
        edificiosUbicacionesSteps.cancelarIngresoDeNuevaUbicacion();
    }


    @Then("se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras $mensajesEsperados")
    public void entoncesValidarLosRiesgosConsutablesMostrandoLosSiguientesMensajes(ExamplesTable mensajesEsperados) {
        edificiosUbicacionesSteps.verificarMensaje(mensajesEsperados);
        polizaSteps.seleccionarOpcionCierre();
        polizaSteps.seleccionarOpcionRetirarTransaccion();
        polizaSteps.confirmarCancelacion();
    }

    @Then("se debe mostrar el siguiente mensaje $mensajesEsperados")
    public void entoncesValidarQueAparezcanLosSiguientesMensajes(ExamplesTable mensajesEsperados) {
        edificiosUbicacionesSteps.verificarMensaje(mensajesEsperados);
        edificiosUbicacionesSteps.cancelarIngresoDeNuevaUbicacion();
    }

    @Then("se espera que el siguiente mensaje se muestre una sola vez: $mensajesEsperado")
    public void entoncesSeEsperaQueElMensajeSeMuestreUnaSolaVez(String mensajesEsperado) {
        List<String> mensajesWSList = new ArrayList<>(polizaSteps.espacioDeTrabajo());
        int contadorDeOcurrencias = 0;
        if (mensajesWSList.contains(mensajesEsperado)) {
            contadorDeOcurrencias++;
        }
        MatcherAssert.assertThat("Ocurrencia de mensaje: " + mensajesEsperado + " es de " + contadorDeOcurrencias + "veces", contadorDeOcurrencias, Is.is(CoreMatchers.equalTo(1)));
        edificiosUbicacionesSteps.cancelarIngresoDeNuevaUbicacion();
    }

    @Then("no debe dejar continuar y debe permanecer en la pagina $pagina")
    public void noDebeDejarContinuarYDebePermanecerEnLaPagina(String pagina) {
        //Metodo Vacio
    }
}
