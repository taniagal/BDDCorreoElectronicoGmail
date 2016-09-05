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

    public void ingresarValorDeEntradaDeLaCoberturaDelRiesgo(String tab, String cobertura, String entrada, String valorEntrada, String tipoArticulo) {

        String mensajeStepReporte = "En tab " + tab +
                " seleccionar la cobertura " + cobertura +
                " para " + entrada +
                " ingresar " + valorEntrada;

        ingresar_valor_de_entrada_de_la_cobertura(mensajeStepReporte);

        if (! edificiosyUbicacionesWidget.estaSeleccionadoTab(tab)){
            edificiosyUbicacionesWidget.seleccionarTab(tab);
        }

        if("Coberturas del Riesgo".equals(tab)){
            if (! edificiosyUbicacionesWidget.estaSeleccionadaCoberturaDeRiesgo(cobertura)) {
                edificiosyUbicacionesWidget.seleccionarCoberturaDelRiesgo(cobertura);
            }
            edificiosyUbicacionesWidget.ingresarValorAEntrada(entrada, valorEntrada);
        }

        if("Información de Artículos".equals(tab)){
            if (! edificiosyUbicacionesWidget.estaSeleccionadaTipoDeArticuloEnInformacionDeArticulo(tipoArticulo)) {
                edificiosyUbicacionesWidget.seleccionarTipoDeArticuloDeInformacionDeArticulo(tipoArticulo);
            }
            if (cobertura.length() > 0 && ! edificiosyUbicacionesWidget.estaSeleccionadaCoberturaDeRiesgo(cobertura)){
                edificiosyUbicacionesWidget.seleccionarCoberturaDelRiesgo(cobertura);
                edificiosyUbicacionesWidget.ingresarValorAEntrada(entrada, valorEntrada);
            } else {
                edificiosyUbicacionesWidget.ingresarValorAEntrada(entrada, valorEntrada);
            }

        }

        if("Otros Articulos".equals(tab)){
            edificiosyUbicacionesWidget.ingresarOtroArticulo(tipoArticulo, cobertura, entrada, valorEntrada);
        }
    }

    @Step
    public void ingresar_valor_de_entrada_de_la_cobertura(String valorDeEntradaDeCobertura) {
        // este metodo vacio permite generar pasos en el reporte de Serenity de forma dinámica
    }


}
