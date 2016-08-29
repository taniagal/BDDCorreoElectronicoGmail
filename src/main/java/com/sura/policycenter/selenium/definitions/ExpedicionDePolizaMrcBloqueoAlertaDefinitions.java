package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ExpedicionDePolizaMrcBloqueoAlertaSteps;
import com.sura.policycenter.selenium.steps.ExpedicionDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ExpedicionDePolizaMrcBloqueoAlertaDefinitions {


    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Steps
    ExpedicionDePolizaMrcBloqueoAlertaSteps expedicionDePolizaMrcBloqueoAlertaSteps;

    @Given("Que tengo una cotizacion <cotizacion> modificada")
    public void givenQueTengoUnaCotizacioncotizacionModificada(@Named("cotizacion")String cotizacion) {
        expedicionDePolizaSteps.navegar_barra_superior(cotizacion);
    }

    @When("quiera verificar que el tomador de la poliza no va hacer evaluado por segunda vez")
    public void whenQuieraVerificarQueElTomadorDeLaPolizaNoVaHacerEvaluadoPorSegundaVez() {
        expedicionDePolizaMrcBloqueoAlertaSteps.ingresar_a_edificios_y_ubicaciones();
    }

    @When("quiera agregar un asegurado o beneficiario en un articulo")
    public void whenQuieraAgregarUnAseguradoOBeneficiarioEnUnArticulo() {
        expedicionDePolizaMrcBloqueoAlertaSteps.ingresar_beneficiario_o_asegurado();
    }

    @Then("el sistema debe mostrar un mensaje de advertencia sobre los nuevos asegurados nuevos <mensaje>")
    public void thenElSistemaDebeMostrarUnMensajeDeAdvertenciaSobreLosNuevosAseguradosNuevosmensaje(@Named("mensaje")String mensaje) {
        expedicionDePolizaMrcBloqueoAlertaSteps.valida_mensaje_de_advertencia(mensaje);
    }

}
