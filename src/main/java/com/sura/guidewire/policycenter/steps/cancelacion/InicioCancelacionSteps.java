package com.sura.guidewire.policycenter.steps.cancelacion;


import com.sura.guidewire.policycenter.pages.InicioCancelacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class InicioCancelacionSteps extends ScenarioSteps {

    InicioCancelacionPage inicioCancelacionPage;

    @Step
    public void iniciar_cancelacion() {
        inicioCancelacionPage.inicioCancelacion();
    }

    @Step
    public void validar_campos_en_pantalla() {
        inicioCancelacionPage.validaCamposEnPantalla();
        inicioCancelacionPage.cancelaTransaccion();
    }

    @Step
    public void ingresar_fecha_retroactiva() {
        inicioCancelacionPage.ingresarFechaRetroactiva();
    }

    @Step
    public void ingresar_fecha_emision_anticipada() {
        inicioCancelacionPage.ingresarFechaEmisionAnticipada();
    }

    @Step
    public void validar_mensaje_en_pantalla(String mensaje) {
        inicioCancelacionPage.validaMensajeEnPantalla(mensaje);
        inicioCancelacionPage.cancelaTransaccion();
    }


    public void valida_lista_de_motivos_diferente_bancolombia(ExamplesTable listaMotivo) {
        inicioCancelacionPage.validaListaMotivoDiferenteBancolombia(listaMotivo);
    }
}
