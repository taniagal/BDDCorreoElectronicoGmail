package com.sura.guidewire.policycenter.steps.renovacion;


import com.sura.guidewire.policycenter.pages.renovacion.ReglasRenovacionDosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ReglasRenovacionDosSteps extends ScenarioSteps {

    ReglasRenovacionDosPage reglasRenovacionDosPage;

    @Step
    public void clic_siguiente_hasta_vehiculos() {
        reglasRenovacionDosPage.clicHastaVehiculo();
    }

    @Step
    public void editar_transaccion() {
        reglasRenovacionDosPage.editarTransaccion();
    }


    @Step
    public void ingresar_valor_mayor_en_accesorios() {
        reglasRenovacionDosPage.ingresaValorMayorVeintePorciento();
    }

    @Step
    public void ingresar_valor_mayor_del_vehiculo_en_acce_especiales() {
        reglasRenovacionDosPage.ingresaValorAccesoriosEspeciales();
    }

    @Step
    public void valida_mensajes_en_pantalla(String mensaje1, String mensaje2) {
        reglasRenovacionDosPage.validacionMensajeValores(mensaje1);
        reglasRenovacionDosPage.validacionMensajeValores(mensaje2);
        reglasRenovacionDosPage.cerrarTransaccion();
    }
}
