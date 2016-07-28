package com.sura.gw.policy.poliza.steps;

import com.sura.gw.navegacion.util.widget.EspacioDeTrabajoWidget;
import com.sura.gw.policy.poliza.pages.AccionesWidget;
import com.sura.gw.policy.poliza.pages.AgregarArticuloEdificiosyUbicacionesWidget;
import com.sura.gw.policy.poliza.pages.EdificiosyUbicacionesWidget;
import com.sura.gw.policy.poliza.pages.InformacionPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

public class InformacionDePolizaSteps extends ScenarioSteps {

    private static InformacionPolizaPage informacionPolizaPage;
    private static EdificiosyUbicacionesWidget edificiosyUbicacionesWidget;
    private static AgregarArticuloEdificiosyUbicacionesWidget agregarArticuloEdificiosyUbicacionesWidget;
    private static EspacioDeTrabajoWidget espacioDeTrabajoWidget;
    private static AccionesWidget accionesWidget;

    @Step
    public void seleccionar_opcion_edificios_y_ubicaciones() {
        informacionPolizaPage.seleccionarOpcionEdificiosyUbicaciones();
    }

    @Step
    public void ingresar_nueva_ubicacion() {
        edificiosyUbicacionesWidget.ingresarNuevaUbicacionConRiesgoConsultable();
    }

    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return informacionPolizaPage.obtenerEnvio().contains("Envío ".concat(numeroSubscripcion));
    }

    @Step
    public void seleccionar_boton_llamado_editar_transaccion_de_poliza() {
        informacionPolizaPage.editarTransaccion();
    }

    @Step
    public void seleccionar_boton_agregar_articulo_a_una_ubicacion() {
        edificiosyUbicacionesWidget.agregarArticuloAPrimerUbicacion();
    }

    @Step
    public void seleccionar_check_del_articulo_a_agregar() {
        agregarArticuloEdificiosyUbicacionesWidget.seleccionarArticuloEdificio();
    }

    @Step
    public void seleccionar_check_de_cobertura_que_desea_aplicar() {
        agregarArticuloEdificiosyUbicacionesWidget.seleccionarDanosMaterialesDeArticuloEdificio();
    }

    @Step
    public void ingresar_valor_reconstruccion_del_articulo(String valor) {
        agregarArticuloEdificiosyUbicacionesWidget.ingresarValorReconstruccion(valor);
    }

    @Step
    public void ingresar_valor_asegurado_danos_materiales(String valor) {
        agregarArticuloEdificiosyUbicacionesWidget.ingresarValorAseguradoDanosMateriales(valor);
    }

    @Step
    public void ingresar_valor_sublimite_translados(String valor) {
        agregarArticuloEdificiosyUbicacionesWidget.ingresarValorSublimiteTranslado(valor);
    }

    @Step
    public void ingresar_valor_sublimite_para_combustion(String valor) {
        agregarArticuloEdificiosyUbicacionesWidget.ingresarValorSublimiteCombustion(valor);
    }

    @Step
    public void seleccionar_boton_aceptar_para_agregar_articulo() {
        agregarArticuloEdificiosyUbicacionesWidget.seleccionarBotonAceptarParaAgregarArticulo();
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
