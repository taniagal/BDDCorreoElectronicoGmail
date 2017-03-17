package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.AjustesDeReglasRenovacionMrcSteps;
import com.sura.guidewire.policycenter.steps.poliza.EdificiosUbicacionesSteps;
import net.thucydides.core.annotations.Steps;
import org.eclipse.jetty.util.annotation.Name;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class AjustesDeReglasRenovacionMrcDefinitions {

    @Steps
    public AjustesDeReglasRenovacionMrcSteps ajustesDeReglasRenovacionMrcSteps;

    @Steps
    public EdificiosUbicacionesSteps edificiosUbicacionesSteps;

    @When("diligencie las instrucciones previas a renovacion $datos")
    public void diligencieInstruccionesPrevias(ExamplesTable datos) {
        ajustesDeReglasRenovacionMrcSteps.diligencieIntruccionesPrevias(datos);
    }

    @When("continue con la renovacion")
    public void continuarConRenovacion() {
        ajustesDeReglasRenovacionMrcSteps.continuarConRenovacion();
    }

    @Then("debo obtener un mensaje UW $mensajes")
    public void obtenerMensajeUW(ExamplesTable mensajes) {
        ajustesDeReglasRenovacionMrcSteps.obtenerMensajeUW(mensajes);
    }

    @When("ingresa el asegurado <opcionAgregar>")
    public void ingresarElAsegurado(@Named("opcionAgregar") String opcionAgregar) {
        ajustesDeReglasRenovacionMrcSteps.ingresarElAsegurado(opcionAgregar);
    }

    @When("ingrese las entradas en renovacion de poliza coberturas con interes adicional <cedula> <tipodocumento> <tipoBeneficiario> <numeroUbicacion> $datos")
    public void ingresarEntradasEnRenovacion(ExamplesTable datos, @Named("cedula") String cedula, @Named("tipoBeneficiario") String tipoBeneficiario, @Named("tipodocumento") String tipodocumento, @Named("numeroUbicacion") String numeroUbicacion) {

        ajustesDeReglasRenovacionMrcSteps.selecionarBotonAgregarArticulo(numeroUbicacion);
        edificiosUbicacionesSteps.ingresarCoberturas(datos);
        edificiosUbicacionesSteps.ingresarInteresAdicionalAArticulo(cedula, tipodocumento);
        edificiosUbicacionesSteps.ingresarTipoBeneficiario(tipoBeneficiario);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
        edificiosUbicacionesSteps.seleccionarBotonCotizar();
        edificiosUbicacionesSteps.validarMensajeRiesgoEnPolizaRenovacion();
    }

    @When("realice la aprobacion especial")
    public void realiceAprobacionEspecial() {
        ajustesDeReglasRenovacionMrcSteps.realiceAprovacionEspecial();
    }

    @When("diligencie los campos de reaseguro aceptado $valores")
    public void diligenciarCamposReaseguroAceptado(ExamplesTable valores) {
        ajustesDeReglasRenovacionMrcSteps.diligenciarCamposReaseguroAceptado(valores);
    }

    @When("ingrese los campos obligatorios en cambio de poliza reaseguro especial $registros")
    public void ingresarCamposObligatoriosReaseguro (ExamplesTable registros){
        ajustesDeReglasRenovacionMrcSteps.ingresarRegistrosReaseguro(registros);
    }

    @When("descarte cambios")
    public void descarteCambios() {
        ajustesDeReglasRenovacionMrcSteps.descarteCambios();
    }

}

