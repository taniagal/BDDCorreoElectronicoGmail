package com.sura.gw.policy.poliza.steps;

import com.sura.gw.policy.poliza.pages.AgregarArticuloEdificiosyUbicacionesWidget;
import com.sura.gw.policy.poliza.pages.EdificiosyUbicacionesWidget;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EdificiosUbicacionesSteps extends ScenarioSteps {

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
    public void seleccionar_boton_aceptar_para_agregar_articulo() {
        agregarArticuloEdificiosyUbicacionesWidget.seleccionarBotonAceptarParaAgregarArticulo();
    }

    public void cancelar_ingreso_de_nueva_ubicacion() {
        edificiosyUbicacionesWidget.seleccionarEnlaceCancelarIngresoNuevaUbicacion();
    }

    public void ingresarValorDeEntradaDeLaCobertura(String tab, String cobertura, String entrada, String valorEntrada) {

        String mensajeStepReporte = "En tab " + tab +
                " seleccionar la cobertura " + cobertura +
                " para " + entrada +
                " ingresar " + valorEntrada;

        seleccionar_boton_agregar_articulo_a_una_ubicacion();
        ingresar_valor_de_entrada_de_la_cobertura(mensajeStepReporte);

        edificiosyUbicacionesWidget.seleccionarTab(tab);

        if("Coberturas del Riesgo".equals(tab)){
            edificiosyUbicacionesWidget.seleccionarCoberturaDelRiesgo(cobertura);
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
