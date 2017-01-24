package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.PolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.AjustePantallaPagosYValidacionesSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.slf4j.LoggerFactory;

public class IngresoFlotanteDefinitions {
    @Steps
    PolizaSteps polizaSteps;
    @Steps
    AjustePantallaPagosYValidacionesSteps ajustePantallaPagosYValidacionesSteps;
    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;
    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Given("ingresar informacion de edificio y ubicaciones")
    public void ingresarinformacionDeEdificioyUbicaciones() {
        //TODO ingrese a edificios y ubicaciones
        informacionDePolizaMrcSteps.ingresarAEdificiosYUbicaciones();
        //TODO intente ingresar una nueva ubicacion sin riesgo consultable
        edificiosUbicacionesSteps.removerRiesgos();
        edificiosUbicacionesSteps.ingresarNuevaUbicacionSinRiesgo();
    }

    @When("debe permitir seleccionar el tipo de flotante:$opciones")
    public void seleccionarTipoArticuloFlotante(ExamplesTable opciones) {
        ajustePantallaPagosYValidacionesSteps.seleccionarArticuloFlotante(new Parametros(opciones));
    }

    @When("realiza la cotizacion,expide la poliza,modifica la poliza e intena ingresar una nueva ubicacion")
    public void realizaCotizacionExpedicionModificaionEIngresarUbicacion() {
     //TODO intente cotizar y expedir la poliza
        edificiosUbicacionesSteps.seleccionarBotonCotizar();
        tasaUnicaSteps.expedirPoliza();
        //TODO ingrese al resumen de la poliza expedida
        polizaSteps.verResumenDeLaPolizaExpedida();
        //TODO cuando intente cambiar informacion de la poliza MRC
        LOGGER.info("Poliza.realizaCotizacionExpedicionModificaionEIngresarUbicacion");
        polizaSteps.seleccionarBotonAcciones();
        polizaSteps.seleccionarOpcionCambiarPoliza();
        polizaSteps.seleccionarBotonSiguienteParaIniciarCambioEnPoliza();
        /*
        //TODO ingrese a edificios y ubicaciones en cambio de poliza
        informacionDePolizaMrcSteps.ingresarAEdificiosYUbicacionesEnCambioDePoliza();
        //TODO intente ingresar una nueva ubicacion
        edificiosUbicacionesSteps.removerRiesgos();
        edificiosUbicacionesSteps.ingresarNuevaUbicacion();*/
    }
}
