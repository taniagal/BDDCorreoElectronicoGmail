package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.utils.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireSteps;
import com.sura.guidewire.policycenter.steps.InstruccionesPreviasARenovacionSteps;
import com.sura.guidewire.policycenter.steps.PolizaSteps;
import com.sura.guidewire.policycenter.utils.AssertUtil;
import com.sura.guidewire.policycenter.steps.AnalisisDeRiesgoSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class Poliza {

    @Managed
    public WebDriver driver;

    @Steps
    PolizaSteps polizaSteps;

    @Steps
    AnalisisDeRiesgoSteps analisisDeRiesgoSteps;

    @Steps
    IngresoAPolicyCenterDefinitions guidewireLogin;

    @Steps
    GuidewireSteps guidewire;

    @Steps
    InstruccionesPreviasARenovacionSteps instruccionesPreviasARenovacionSteps;

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;


    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return polizaSteps.esperoVerNumeroDeSubscripcionEnEnvio(numeroSubscripcion);
    }


    @Given("que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>")
    public void dadoQueEstoyEnResumenDeLaPolizaMRCConNumeroDePoliza(@Named("numPoliza") String numPoliza, @Named("rolUsuario") String rolUsuario) {

        if (SerenityWebdriverManager.inThisTestThread().hasAnInstantiatedDriver()) {
            SerenityWebdriverManager.inThisTestThread().resetCurrentDriver();
        }

        guidewireLogin.dadoQueAccedoAPolicyCenterConRol(rolUsuario);

        guidewire.irANavegacionSuperior()
                .desplegarMenuPoliza().consultarNumeroDePoliza(numPoliza);

        LOGGER.info("Poliza.dadoQueEstoyEnResumenDeLaPolizaMRCConNumeroDePoliza");
    }

    @Then("espero ver mensajes de advertencia indicandome que sobrepase los limites de valores para el valor del articulo")
    public void esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo() {
        entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo();
        LOGGER.info("Poliza.esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo");
    }

    public void entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo() {

        assertThat(polizaSteps.espacioDeTrabajo(),
                Matchers.hasItems("EL valor Asegurado de la cobertura Danos materiales NO debe ser mayor al valor asegurable del Artículo Edificio"
                ));

        assertThat(polizaSteps.espacioDeTrabajo(),
                Matchers.hasItems("El valor de \"Sublimite para traslados temporales de maquinaria y equipo\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));

        assertThat(polizaSteps.espacioDeTrabajo(),
                Matchers.hasItems("El valor de \"Sublimite para combustion espontanea de mercancias a granel\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));
    }



    @Given("que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>")
    public void dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar(@Named("numSubscripcion") String numSubscripcion) {
        LOGGER.info("Poliza.dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar");

        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDeSubscripcion(numSubscripcion);



    }

    @When("copie la poliza")
    public void cuandoCopieLaPoliza() {
        LOGGER.info("Poliza.cuandoCopie la poliza");
        nuevaCotizacionSteps.copiarEnvio();
    }

    // TODO: 04/08/2016 Esto va para la definicion de informacion de la poliza
    @When("cuando intente cambiar informacion de la poliza MRC")
    public void cuandoIntenteCambiarInformacionDeLaPolizaMRC() {
        LOGGER.info("Poliza.cuandoIntenteCambiarInformacionDeLaPolizaMRC");
        polizaSteps.seleccionarBotonAcciones();
        polizaSteps.seleccionarOpcionCambiarPoliza();
        polizaSteps.seleccionarBotonSiguienteParaIniciarCambioEnPoliza();
    }

    @When("ingrese al resumen de la poliza expedida")
    public void cuandoIntenteIngresarAlResumenDeLaPolizaExpedida() {
        polizaSteps.verResumenDeLaPolizaExpedida();
    }

    @When("intente renovar la poliza")
    public void cuandoIntenterRenovarPolizaMRC() {
        LOGGER.info("Poliza.cuandoIntenteCambiarInformacionDeLaPolizaMRC");

        polizaSteps.seleccionarBotonAcciones();
        polizaSteps.seleccionarOpcionRenovarPoliza();
        polizaSteps.confirmarRenovacion();
    }

    @When("desee seleccionar instrucciones previas a la renovacion")
    public void cuandoDeseeSeleccionarInstruccionesPreviasALaRenovacion() {
        LOGGER.info("Poliza.cuandoDeseeRealizarInstruccionesPreviasALaRenovacion");
        polizaSteps.seleccionarBotonAcciones().
                seleccionar_instrucciones_previas_a_la_renovacion();

        instruccionesPreviasARenovacionSteps.seleccionar_boton_editar().
                desplegar_lista_instruccion();
    }

    @When("ingrese los motivos de cancelacion de la poliza Motivo: $motivo, Descripción: $descripcion")
    public void cuandoIngreseLosMotivosDeCancelacion(String motivo, String descripcion) {
        LOGGER.info("Poliza.cuandoIngreseLosMotivosDeCancelacion");
        polizaSteps.seleccionarBotonAcciones().seleccionar_cancelar_poliza();
        polizaSteps.ingresarMotivosCancelacion(motivo, descripcion);
    }

    @When("realice la cancelacion de poliza")
    public void cuandoRealiceCancelacionDeLaPoliza() {
        LOGGER.info("Poliza.cuandoRealiceCancelacionDeLaPoliza");
        polizaSteps.iniciarCancelacionDePoliza();
        polizaSteps.seleccionarOpcionCompromiso();
        polizaSteps.seleccionarOpcionCancelarAhora();
        polizaSteps.confirmarCancelacion();

    }
    @When("ingrese fecha superior al dia actual")
    public void cuandoIngreseFechaSueperiorAlDiaActual(){
        LOGGER.info("Poliza.cuandoIngreseFechaSueperiorAlDiaActual");
        polizaSteps.ingresarFechaSuperior();
    }
    @When("realice la programacion de cancelacion")
        public void cuandoRealiceLaProgramacionDeCancelacion(){
            LOGGER.info("Poliza.cuandoRealiceLaProgramacionDeCancelacion");
            polizaSteps.iniciarCancelacionDePoliza();
            polizaSteps.seleccionarOpcionCompromiso();
            polizaSteps.seleccionarOpcionProgramarCancelacion();
            polizaSteps.confirmarCancelacion();
        }

    @When("rescinda la cancelacion de la poliza <numPoliza>")
    public void cuandoRescindaLaCancelacion(String numPoliza){
        LOGGER.info("Poliza.cuandoRescindaLaCancelacion");
        guidewire.irANavegacionSuperior()
                .desplegarMenuPoliza().consultarNumeroDePoliza(numPoliza);
        polizaSteps.seleccionarBotonAcciones().seleccionar_boton_rescindir_cancelacion().seleccionar_poliza_a_rescindir();
        polizaSteps.seleccionarOpcionCierre();
        polizaSteps.seleccionarOpcionRescindirCancelacion();

    }
    @When("retire la cancelacion de la subscripcion <numSubscripcion>")
    public void cuandoRetireaLaSubscripcion(String numSubscripcion){
        LOGGER.info("Poliza.cuandoRetireaLaSubscripcion");
        guidewire.irANavegacionSuperior()
                .desplegarMenuPoliza().consultarNumeroDeSubscripcion(numSubscripcion);
        polizaSteps.seleccionarOpcionCierre();
        polizaSteps.seleccionarOpcionRetirarTransaccion();
        polizaSteps.confirmarCancelacion();

    }
    @When("ingreso al resumen de la poliza")
    public void cuandoIngreseAlResumenDeLaPoliza(String numPoliza){
        LOGGER.info("Poliza.cuandoIngreseAlResumenDeLaPoliza");
        guidewire.irANavegacionSuperior()
                .desplegarMenuPoliza().consultarNumeroDePoliza(numPoliza);
    }


    @When("inicie la cancelacion")
    public void cuandoInicieLaCancelacion(){
        LOGGER.info("Poliza.cuandocuandoInicieLaCancelacion");
        polizaSteps.iniciarCancelacionDePoliza();
    }
    @Then("se debe generar un UW Issue para solicitar la autorización y el mensaje debe ser: $mensaje")
    public void entoncesSeDebeGeneraruNUWIssueParaSolicitarLaAutorizacion(String mensaje) {
        LOGGER.info("Poliza.entoncesSeDebeGeneraruNUWIssueParaSolicitarLaAutorizacion");
        analisisDeRiesgoSteps.seleccion_opcion_analisis_de_riesgos();
        analisisDeRiesgoSteps.se_muestra_compromiso_bloqueado(mensaje);
    }

    @When("se solicite aprobacion para los riesgos")
    public void cuandoSeSoliciteAprobacionParaLosriesgos() {
        LOGGER.info("Poliza.entoncesSeDebeGeneraruNUWIssueParaSolicitarLaAutorizacionDeLosRiesgos");
        analisisDeRiesgoSteps.seleccionar_opcion_analisis_de_riesgos_en_cotizacion();
        analisisDeRiesgoSteps.solicitar_aprobacion();
    }

    @When("se solicite aprobacion para los riesgos en cambio de poliza")
    public void cuandoSeSoliciteAprobacionParaLosriesgosEnCambioDePoliza() {
        LOGGER.info("Poliza.cuandoSeSoliciteAprobacionParaLosriesgosEnCambioDePoliza");
        analisisDeRiesgoSteps.seleccionar_opcion_analisis_de_riesgo_en_cambio_poliza();
        analisisDeRiesgoSteps.solicitar_aprobacion();
    }

    @When("se solicite aprobacion para los riesgos en renovacion de poliza")
    public void cuandoSeSoliciteAprobacionParaLosriesgosEnRenovacionDePoliza() {
        LOGGER.info("Poliza.cuandoSeSoliciteAprobacionParaLosriesgosEnCambioDePoliza");
        analisisDeRiesgoSteps.seleccionar_opcion_analisis_de_riesgo_en_renovacion_poliza();
        analisisDeRiesgoSteps.solicitar_aprobacion();
    }

    @Then("se debe mostrar un mensaje con el texto: $Mensaje")
    public void entoncesSeDebeMostrarUnMensajeConElTexto(String mensaje){
        LOGGER.info("Poliza.entoncesSeDebeGeneraruNUWIssueParaSolicitarLaAutorizacion");
        polizaSteps.seMuestraBloqueoCancelacionDePoliza(mensaje);
    }

    @Then("se debe visualizar un mensaje con el texto: $Mensaje")
    public void entoncesSeDebevisualizarrUnMensajeConElTexto(String mensaje){
        LOGGER.info("Poliza.entoncesSeDebevisualizarrUnMensajeConElTexto");
        polizaSteps.seMuestraMensajeDeBeneficiarioOneroso(mensaje);
    }

    @When("despliegue $opcion")
    public void cuandoDespliegue(String opcion) {
        LOGGER.info("Poliza.cuandoDespliegue");
        instruccionesPreviasARenovacionSteps.desplegar_lista_opcion(opcion);
    }

    @When("seleccione instruccion $instruccion previa a la renovacion")
    public void cuandoSeleccioneInstruccionPreviaALaRenovacion(String instruccion) {
        LOGGER.info("Poliza.cuandoSeleccioneInstruccionPreviaALaRenovacion");
        instruccionesPreviasARenovacionSteps.seleccionar_instruccion(instruccion);
    }

    // TODO: 04/08/2016 Esto va para la definicion de informacion de la poliza
    @Then("espero ver inhabilitado para modificacion los siguientes $campos")
    public void esperoVerInhabilitadoParaModificacionLosSiguientesCampos(ExamplesTable campos) {

        // TODO: 26/07/2016 implementar forma recurrente de reportar varios asserterror en el reporte
        for (Map<String, String> fila : campos.getRows()) {
            String campo = fila.get("CAMPOS");
            assertThat("ELEMENTO ".concat(campo).concat(" NO CUMPLE CON EL CRITERIO DE BLOQUEO"), polizaSteps.elementoEsEditable(campo), Is.is(Matchers.equalTo(false)));
        }

        LOGGER.info("Poliza.esperoVerInhabilitadoParaModificacionLosSiguientesCampos");
    }

    @Then("espero ver las opciones de instrucciones siguientes $instrucciones")
    public void esperoVerLasOpcionesDeInstruccionesSiguientes(ExamplesTable instrucciones) {
        LOGGER.info("Poliza.esperoVerLasOpcionesDeInstruccionesSiguientes");
        for (Map<String, String> fila : instrucciones.getRows()) {
            String instruccion = fila.get("INSTRUCCIONES");
            org.hamcrest.MatcherAssert.assertThat(instruccionesPreviasARenovacionSteps.obtenerPaginInstruccionesPreviasARenovacion().obtenerInstruccionesDisponibles(), AssertUtil.hasItemContainsString(instruccion));
        }
    }

    @Then("debe visualizarse las siguientes razones $razones")
    public void esperoVisualizarLasSiguientesRazones(ExamplesTable razones) {
        LOGGER.info("Poliza.esperoVisualizarLasSiguientesRazones");
        for (Map<String, String> fila : razones.getRows()) {
            String razon = fila.get("RAZONES");
            org.hamcrest.MatcherAssert.assertThat(instruccionesPreviasARenovacionSteps.obtenerPaginInstruccionesPreviasARenovacion().obtenerListaRazonesDeRenovacion(), AssertUtil.hasItemContainsString(razon));
        }
    }
    @Then("la $proceso es correcta si se muestra el texto: $tituloDePagina")
    public void entoncesLaCancelacionDeLaPolizaEsCorrecta(String tituloDePagina) {
        LOGGER.info("Poliza.entoncesLaCancionDeLaPolizaEsCorrecta");
        assertThat(polizaSteps.obtenerTituloPagina(), equalTo(tituloDePagina));
    }
    @Then("la revocacion es correcta si no se se muestra el tipo en el campo <tipo> y se oculta el mensaje de cancelacion pendiente")
    public void entoncesLaRevocacionesEsCorrectaSiNoSeMuestra(String tipo){
        LOGGER.info("Poliza.entoncesLaRevocacionesEsCorrectaSiNoSeMuestra");
        polizaSteps.validarQueNoSeMuestreTipoEnTablaTransacciones(tipo);
        polizaSteps.validarQueNoSeMuestreMensaje();


    }

    @Then("debo ver en el resumen de la poliza y en informacion de poliza los coaseguros no editables")
    public void entoncesDeboVerEnElResumenDeLaPolizaYEnInformacionDePolizaLosCoasegurosNoEditables(){
        LOGGER.info("Poliza.entoncesDeboVerEnElResumenDeLaPolizaLosCoasegurosNoEditables");
        polizaSteps.verResumenDeLaPolizaExpedida();
        polizaSteps.ingresarAVerCoaseguros();
        polizaSteps.validarcamposnoeditables();
        polizaSteps.seleccionarOpcionInformacionDePoliza();
        polizaSteps.ingresarAVerCoaseguros();
        polizaSteps.validarcamposnoeditables();
    }
    @When("seleccione la lista motivo de cancelacion")
    public void cuandoSeleccioneLaListaMotivoDeCancelacion() {
        LOGGER.info("Poliza.cuandoSeleccioneLaListaMotivoDeCancelacion");
        polizaSteps.seleccionarBotonAcciones().seleccionar_cancelar_poliza();
        polizaSteps.desplegarListaMotivosCancelacion();

    }
    @Then("se debe visualizar los siguientes motivos $motivos")
    public void entoncesSeDebeVisualizarLosSiguientesMotivos(ExamplesTable motivos) {
        LOGGER.info("Poliza.entoncesSeDebeVisualizarLosSiguientesMotivos");
        for (Map<String, String> fila : motivos.getRows()) {
            String motivo = fila.get("MOTIVOS");
            org.hamcrest.MatcherAssert.assertThat(polizaSteps.obtenerPolizaPage().obtenerMotivosDisponibles(),AssertUtil.hasItemContainsString(motivo));
        }

    }
    @Then("se debe mostrar la fecha del dia de hoy")
    public void entoncesValidarFechaSeaFechadeHOY(){
        MatcherAssert.assertThat(polizaSteps.esFechaCancelacionNHOY(), Is.is(true));
        LOGGER.info("CotizacionDefinitions.ValidarFechaSeaFechadeHOY");
    }
    @When("ingrese fecha superior a 61 dias")
    public void cuandoIngresoFechaSuperiora61Dias(){
        LOGGER.info("CotizacionDefinitions.cuandoIngresoFechaSuperiora61Dias");
        polizaSteps.ingresarFechaAnteriorA61Dias();
    }

    @Then("se debe mostrar mensaje con el texto: $advertencia")
    public void entoncesSeDebeMostrarMensajeConElTexto(String advertencia) {
        LOGGER.info("Poliza.entoncesSeDebeMostrarMensajeConElTexto");
        assertThat(polizaSteps.validarMensaje(), equalTo(advertencia));
    }
    @When("ingrese a la opcion de cancelar poliza")
    public void cuandoIngreseALaOpcionDeCancelarPoliza(){
        LOGGER.info("Poliza.cuandoIngreseALaOpcionDeCancelarPoliza");
        polizaSteps.seleccionarBotonAcciones().seleccionar_cancelar_poliza();

    }
    @Then("se debe mostrar la opcion de cancelar transaccion")
    public void entoncesSeDebeMostrarLaOpcionDeCancelarTransaccion() {
        LOGGER.info("Poliza.entoncesSeDebeMostrarLaOpcionDeCancelarTransaccion");
        polizaSteps.validarOpcionCancelarTransaccion();
    }
    @When("desee seleccionar motivos de cancelacion")
        public void cuandoSeleccioneMotivosdeCancelacion(){
            LOGGER.info("Poliza.cuandoSeleccioneMotivosdeCancelacion");
            polizaSteps.desplegarListaMotivosCancelacion();



        }
    @When("seleccione el <motivo> de cancelacion")
    public void cuandoSeleccioneelMotivodeCancelacion(@Named("motivo") String motivo,@Named("descripcion") String descripcion){
        LOGGER.info("Poliza.cuandoSeleccioneelMotivodeCancelacion");
        polizaSteps.ingresarMotivosCancelacion(motivo, descripcion);
    }
    @Then("se debe mostrar el metodo de reembolso <reembolso> sin el campo fuente")
    public void entoncesSedebeMostrarElMetodoDeReembolsoSinElcampofuente(@Named("reembolso") String reembolso){
        LOGGER.info("Poliza.entoncesSedebeMostrarElMetodoDeReembolsoSinElcampofuente");
        org.hamcrest.MatcherAssert.assertThat(polizaSteps.obtenerPolizaPage().obtenerMetodoDeReembolso(), equalTo(reembolso));
        polizaSteps.validarOcultacionCampoFuente();
    }
}
