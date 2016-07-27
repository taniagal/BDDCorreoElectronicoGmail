package com.sura.gw.policy.poliza.definitions;


import com.sura.gw.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.sura.gw.navegacion.definitions.Navegacion;
import com.sura.gw.policy.poliza.steps.InformacionDePolizaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class InformacionDePoliza {

    @Managed
    public WebDriver driver;

    @Steps
    InformacionDePolizaSteps informacionDePolizaSteps;

    @Steps
    IngresoAPolicyCenterDefinitions guidewire;

    @Steps
    Navegacion navegacion;

    @Steps
    InformacionDePoliza informacionDePoliza;


    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);



    public void cuandoSeleccioneOpcionDeInformacionDePolizaEdificiosYUbicaciones() {
        informacionDePolizaSteps.seleccionar_opcion_edificios_y_ubicaciones();
    }

    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return informacionDePolizaSteps.esperoVerNumeroDeSubscripcionEnEnvio(numeroSubscripcion);
    }

    public void cuandoEditeInformacionDeLaPoliza() {
        informacionDePolizaSteps.seleccionar_boton_llamado_editar_transaccion_de_poliza();
    }

    public void cuandoDeseeIngresarArticuloAUnaUbicacion() {
        informacionDePolizaSteps.seleccionar_boton_agregar_articulo_a_una_ubicacion();
    }

    public void cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo() {
        informacionDePolizaSteps.seleccionar_check_del_articulo_a_agregar();
        informacionDePolizaSteps.seleccionar_check_de_cobertura_que_desea_aplicar();

        /*
        Se ingresa valor asegurado superior al valor del articulo a asegurar y se ingresa valores a sublimites
        que superen el valor asegurado con el fin de validar en el paso de comprobaciones que se verifiquen los limites
        de valores para valor asegurado y sublimites.
         */
        informacionDePolizaSteps.ingresar_valor_reconstruccion_del_articulo("10000");
        informacionDePolizaSteps.ingresar_valor_asegurado_danos_materiales("10001");
        informacionDePolizaSteps.ingresar_valor_sublimite_translados("10002");
        informacionDePolizaSteps.ingresar_valor_sublimite_para_combustion("10002");
        informacionDePolizaSteps.seleccionar_boton_aceptar_para_agregar_articulo();
    }

    @Given("que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion> que deseo cambiar")
    public void dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar(@Named("numSubscripcion") String numSubscripcion) {
        LOGGER.info("InformacionDePoliza.dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar");
        try {
            guidewire.dadoQueAccedoAPolicyCenterConRol("Asesor");
            navegacion.cuandoSeleccioneOpcionDesplegableDeMenuSuperiorPoliza();
            navegacion.cuandoBusquePorNumeroDeSubscripcionDePoliza(numSubscripcion);
           // informacionDePolizaSteps.seleccionar_boton_acciones();
           // informacionDePolizaSteps.seleccionar_opcion_cambiar_poliza();

            assertThat(informacionDePoliza.esperoVerNumeroDeSubscripcionEnEnvio(numSubscripcion), is(equalTo(true)));

        } catch (Exception e) {
            LOGGER.error("ERROR INESPERADO " + e.getMessage());
        }

    }

    @When("cuando intente ingresar un articulo para una ubicacion para comprobar las validaciones de error del articulo")
    public void cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo() {

        try {
            informacionDePoliza.cuandoEditeInformacionDeLaPoliza();
        }catch (Exception e){
            LOGGER.info("BOTON EDITAR TRANSACCION NO ENCONTRADO");
        }

        informacionDePoliza.cuandoSeleccioneOpcionDeInformacionDePolizaEdificiosYUbicaciones();
        informacionDePoliza.cuandoDeseeIngresarArticuloAUnaUbicacion();
        informacionDePoliza.cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo();

        LOGGER.info("InformacionDePoliza.cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo");
    }


    @Then("espero ver mensajes de advertencia indicandome que sobrepase los limites de valores para el valor del articulo")
    public void esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo() {
        informacionDePoliza.entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo();
        LOGGER.info("CoberturaMultiriesgoCorporativoValidacionesBasica.esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo");
    }

    public void entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo(){
        assertThat(informacionDePolizaSteps.espacioDeTrabajo(),
                hasItems("EL valor Asegurado de la cobertura Danos materiales NO debe ser mayor al valor asegurable del Artículo Edificio"
                ));

        assertThat(informacionDePolizaSteps.espacioDeTrabajo(),
                hasItems("El valor de \"Sublimite para traslados temporales de maquinaria y equipo\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));

        assertThat(informacionDePolizaSteps.espacioDeTrabajo(),
                hasItems("El valor de \"Sublimite para combustion espontanea de mercancias a granel\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));
    }


}
