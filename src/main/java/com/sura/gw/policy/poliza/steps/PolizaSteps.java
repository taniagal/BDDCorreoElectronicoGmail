package com.sura.gw.policy.poliza.steps;

import com.sura.gw.navegacion.util.widget.EspacioDeTrabajoWidget;
import com.sura.gw.policy.poliza.pages.AccionesWidget;
import com.sura.gw.policy.poliza.pages.PolizaPage;
import java.util.List;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;



public class PolizaSteps extends ScenarioSteps {

    private static PolizaPage informacionPolizaPage;

    private static EspacioDeTrabajoWidget espacioDeTrabajoWidget;
    private static AccionesWidget accionesWidget;

    @Step
    public void seleccionar_opcion_edificios_y_ubicaciones() {
        informacionPolizaPage.seleccionarOpcionEdificiosyUbicaciones();
    }

    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return informacionPolizaPage.obtenerEnvio().contains("Envío ".concat(numeroSubscripcion));
    }

    @Step
    public void seleccionar_boton_llamado_editar_transaccion_de_poliza() {
        informacionPolizaPage.editarTransaccion();
    }

    @Step
    public void seleccionar_boton_acciones() {
        accionesWidget.seleccionarBtnAcciones();
    }

    @Step
    public void seleccionar_opcion_cambiar_poliza() {
        accionesWidget.seleccionarOpcionCambioDePoliza();
    }

    public List<String> espacioDeTrabajo() {
        espacioDeTrabajoWidget.desplegarEspacioDeTrabajo();
        return espacioDeTrabajoWidget.obtenerMensajesDeTrabajo();
    }

    public Boolean elementoEsEditable(String elemento) {
        return informacionPolizaPage.esEditableElemento(elemento);
    }

    @Step
    public void seleccionar_opcion_informacion_de_poliza() {
        informacionPolizaPage.seleccionarOpcionInformacionDeLaPoliza();
    }

    public void seleccionarBotonSiguienteParaIniciarCambioEnPoliza() {
        informacionPolizaPage.seleccionarBotonSiguienteEnInicioDeCambioDePoliza();
    }

}
