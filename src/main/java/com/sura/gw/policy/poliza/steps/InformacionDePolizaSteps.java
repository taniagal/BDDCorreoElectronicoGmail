package com.sura.gw.policy.poliza.steps;

import com.sura.gw.navegacion.util.widget.EspacioDeTrabajoWidget;
import com.sura.gw.policy.poliza.pages.AgregarArticuloEdificiosyUbicacionesWidget;
import com.sura.gw.policy.poliza.pages.EdificiosyUbicacionesWidget;
import com.sura.gw.policy.poliza.pages.InformacionPolizaPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class InformacionDePolizaSteps {

    InformacionPolizaPage informacionPolizaPage;
    EdificiosyUbicacionesWidget edificiosyUbicacionesWidget;
    AgregarArticuloEdificiosyUbicacionesWidget agregarArticuloEdificiosyUbicacionesWidget;
    EspacioDeTrabajoWidget espacioDeTrabajoWidget;

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

    public List<String> espacioDeTrabajo() {
        espacioDeTrabajoWidget.desplegarEspacioDeTrabajo();
        return espacioDeTrabajoWidget.obtenerMensajesDeTrabajo();
    }
}
