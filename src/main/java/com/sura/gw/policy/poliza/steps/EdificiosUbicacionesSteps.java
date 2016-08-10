package com.sura.gw.policy.poliza.steps;

import com.sura.gw.policy.poliza.pages.AgregarArticuloEdificiosyUbicacionesWidget;
import com.sura.gw.policy.poliza.pages.EdificiosyUbicacionesWidget;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.LoggerFactory;

public class EdificiosUbicacionesSteps extends ScenarioSteps {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    private static EdificiosyUbicacionesWidget edificiosyUbicacionesWidget;
    private static AgregarArticuloEdificiosyUbicacionesWidget agregarArticuloEdificiosyUbicacionesWidget;

    @Step
    public void ingresar_nueva_ubicacion() {
        edificiosyUbicacionesWidget.ingresarNuevaUbicacionConRiesgoConsultable();
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
    public void seleccionar_boton_aceptar_en_la_parte_superior_izquierda() {
        agregarArticuloEdificiosyUbicacionesWidget.seleccionarBotonAceptarParteSuperiorIzquierda();
    }

    public void cancelar_ingreso_de_nueva_ubicacion() {
        edificiosyUbicacionesWidget.seleccionarEnlaceCancelarIngresoNuevaUbicacion();
    }

    public void ingresarValorDeEntradaDeLaCoberturaDelRiesgo(String tab, String cobertura, String entrada, String valorEntrada) {

        String mensajeStepReporte = "En tab " + tab +
                " seleccionar la cobertura " + cobertura +
                " para " + entrada +
                " ingresar " + valorEntrada;

        ingresar_valor_de_entrada_de_la_cobertura(mensajeStepReporte);

        if("Coberturas del Riesgo".equals(tab)){

            if (! edificiosyUbicacionesWidget.estaSeleccionadoTab(tab)){
                edificiosyUbicacionesWidget.seleccionarTab(tab);
            }

            if (! edificiosyUbicacionesWidget.estaSeleccionadaCoberturaDeRiesgo(cobertura)) {
                edificiosyUbicacionesWidget.seleccionarCoberturaDelRiesgo(cobertura);
            }

            edificiosyUbicacionesWidget.ingresarValorAEntradaDeArticuloDeCoberturaDeRiesgo(entrada, valorEntrada);
        }

        if("Información de Artículos".equals(tab)){

        }

        if("Otros Articulos".equals(tab)){

        }
    }

    @Step
    public void ingresar_valor_de_entrada_de_la_cobertura(String valorDeEntradaDeCobertura) {

    }
}
