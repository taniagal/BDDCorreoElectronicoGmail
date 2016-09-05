package com.sura.gw.policy.poliza.steps;

import com.sura.gw.policy.poliza.pages.AgregarArticuloEdificiosyUbicacionesWidget;
import com.sura.gw.policy.poliza.pages.EdificiosyUbicacionesWidget;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class EdificiosUbicacionesSteps extends ScenarioSteps {


    private static EdificiosyUbicacionesWidget edificiosyUbicacionesWidget;
    private static AgregarArticuloEdificiosyUbicacionesWidget agregarArticuloEdificiosyUbicacionesWidget;

    public EdificiosUbicacionesSteps(Pages pages){
        super(pages);
    }

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

    // TODO: 01/09/2016 code smell
    public void ingresarValorDeEntradaDeLaCoberturaDelRiesgo(String tab, String cobertura, String entrada, String valorEntrada, String tipoArticulo, boolean esUltimaFilaDeExampleTable) {

        String mensajeStepReporte = "En tab " + tab +
                " seleccionar la cobertura " + cobertura +
                " para " + entrada +
                " ingresar " + valorEntrada;

        // Registro de tarea dinámica en el reporte de Serenity
        ingresar_valor_de_entrada_de_la_cobertura(mensajeStepReporte);

        if("Coberturas del Riesgo".equals(tab)){
            seleccionarTab(tab);
            seleccionarCoberturaDelRiesgo(cobertura);
            edificiosyUbicacionesWidget.ingresarValorAEntrada(entrada, valorEntrada);
        }

        if("Información de Artículos".equals(tab)){
            seleccionarTab(tab);
            seleccionarTipoDeArticulo(tipoArticulo);

            if (cobertura.length() > 0 && ! edificiosyUbicacionesWidget.estaSeleccionadaCoberturaDeRiesgo(cobertura)){
                edificiosyUbicacionesWidget.seleccionarCoberturaDelRiesgo(cobertura);
                edificiosyUbicacionesWidget.ingresarValorAEntradaInformacionArticulo(tipoArticulo, entrada, valorEntrada);
            } else {
                edificiosyUbicacionesWidget.ingresarValorAEntradaInformacionArticulo(tipoArticulo, entrada, valorEntrada);
            }

        }

        if("Otros Articulos".equals(tab)){

            seleccionarTab(tab);

            edificiosyUbicacionesWidget.ingresarOtroArticulo(tipoArticulo, cobertura, entrada, valorEntrada, esUltimaFilaDeExampleTable);
        }
    }

    private void seleccionarCoberturaDelRiesgo(String cobertura) {
        if (! edificiosyUbicacionesWidget.estaSeleccionadaCoberturaDeRiesgo(cobertura)) {
            edificiosyUbicacionesWidget.seleccionarCoberturaDelRiesgo(cobertura);
        }
    }

    private void seleccionarTab(String tab){
        if (! edificiosyUbicacionesWidget.estaSeleccionadoTab(tab)){
            edificiosyUbicacionesWidget.seleccionarTab(tab);
        }
    }

    private void seleccionarTipoDeArticulo(String tipoArticulo){
        if (! edificiosyUbicacionesWidget.estaSeleccionadaTipoDeArticuloEnInformacionDeArticulo(tipoArticulo)) {
            edificiosyUbicacionesWidget.seleccionarTipoDeArticuloDeInformacionDeArticulo(tipoArticulo);
        }
    }

    @Step
    public void ingresar_valor_de_entrada_de_la_cobertura(String valorDeEntradaDeCobertura) {
        // este metodo vacio permite generar pasos en el reporte de Serenity de forma dinámica
    }


}
