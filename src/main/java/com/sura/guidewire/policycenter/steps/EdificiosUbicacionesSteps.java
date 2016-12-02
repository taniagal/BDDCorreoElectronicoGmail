package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.AgregarArticuloEdificiosyUbicacionesWidget;
import com.sura.guidewire.policycenter.pages.EdificiosyUbicacionesWidget;
import com.sura.guidewire.policycenter.pages.poliza.NuevaPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class EdificiosUbicacionesSteps extends ScenarioSteps {


    private static EdificiosyUbicacionesWidget edificiosyUbicacionesWidget;
    private static AgregarArticuloEdificiosyUbicacionesWidget agregarArticuloEdificiosyUbicacionesWidget;
    private static NuevaPolizaPage nuevaPolizaPage;

    public EdificiosUbicacionesSteps(Pages pages) {
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
    public void seleccionar_boton_agregar_articulo_a_una_ubicacion_en_cambio_de_poliza(){
        edificiosyUbicacionesWidget.agregarArticuloAPrimerUbicacionEnCambioDePoliza();
    }
    @Step
    public void seleccionar_boton_agregar_articulo_a_una_ubicacion_en_renovacion_de_poliza(){
        edificiosyUbicacionesWidget.agregarArticuloAPrimerUbicacionEnRenovacionDePoliza();
    }
    @Step
    public void ingresar_interes_adicional_a_articulo(String numerocedula){
        edificiosyUbicacionesWidget.ingresarInteresAdicional(numerocedula);
    }

    @Step
    public void ingresar_tipo_beneficiario(String beneficiario){
        agregarArticuloEdificiosyUbicacionesWidget.desplegarListaTipoBeneficiario();
        nuevaPolizaPage.seleccionarElementoDeLaLista(beneficiario);
    }
    @Step
    public void seleccionar_boton_cotizar(){
        edificiosyUbicacionesWidget.cliclearBtnCotizar();
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
    @Step
    public void cancelar_ingreso_de_nueva_ubicacion() {
        edificiosyUbicacionesWidget.seleccionarEnlaceCancelarIngresoNuevaUbicacion();
    }
    @Step
    public void remover_riesgos(){
        edificiosyUbicacionesWidget.removerRiesgos();

    }

    @Step
    public void seleccionar_boton_editar_transaccion_de_poliza(){
        edificiosyUbicacionesWidget.editartransacciondepoliza();

    }

    public String armarMensajeParaElReporteDeSerenity(String tab, String cobertura, String entrada, String valorEntrada, String tipoArticulo) {
        // Se arma el mensaje que se mostrará en el reporte de Serenity según los parametros enviados por medio de los parametros tabulares
        String mensajeStepReporte = "";
        if (cobertura.length() > 0) {
            if (tipoArticulo.length() > 0) {
                mensajeStepReporte = "En tab " + tab +
                        " seleccionar tipo de artículo " + tipoArticulo +
                        " seleccionar la cobertura " + cobertura +
                        " para " + entrada +
                        " ingresar " + valorEntrada;
            } else {
                mensajeStepReporte = "En tab " + tab +
                        " seleccionar la cobertura " + cobertura +
                        " para " + entrada +
                        " ingresar " + valorEntrada;
            }
        } else {
            if (tipoArticulo.length() > 0) {
                mensajeStepReporte = "En tab " + tab +
                        " seleccionar tipo de artículo " + tipoArticulo +
                        " para " + entrada +
                        " ingresar " + valorEntrada;
            }
        }

        return mensajeStepReporte;
    }

    // TODO: 01/09/2016 code smell
    public void ingresarValorDeEntradaDeLaCoberturaDelRiesgo(String tab, String cobertura, String entrada, String valorEntrada, String tipoArticulo, boolean esOtroArticulo, boolean esUltimaFilaDeExampleTable) {
        // Registro de tarea dinámica en el reporte de Serenity
        ingresar_valor_de_entrada_de_la_cobertura(armarMensajeParaElReporteDeSerenity(tab, cobertura, entrada, valorEntrada, tipoArticulo));

        if ("Coberturas del Riesgo".equals(tab)) {
            seleccionarTab(tab);
            seleccionarCoberturaDelRiesgo(cobertura);
            edificiosyUbicacionesWidget.ingresarValorAEntrada(entrada, valorEntrada);
        }

        if ("Información de Artículos".equals(tab)) {
            seleccionarTab(tab);
            seleccionarTipoDeArticulo(tipoArticulo);

            if (cobertura.length() > 0 && !edificiosyUbicacionesWidget.estaSeleccionadaCoberturaDeRiesgo(cobertura, tipoArticulo)) {
                edificiosyUbicacionesWidget.seleccionarCoberturaDelRiesgo(cobertura, tipoArticulo);
                edificiosyUbicacionesWidget.ingresarValorAEntradaInformacionArticulo(tipoArticulo, entrada, valorEntrada);
            } else {
                edificiosyUbicacionesWidget.ingresarValorAEntradaInformacionArticulo(tipoArticulo, entrada, valorEntrada);
            }
        }

        if ("Otros Articulos".equals(tab)) {
            seleccionarTab(tab);
            edificiosyUbicacionesWidget.ingresarOtroArticulo(tipoArticulo, cobertura, entrada, valorEntrada, esOtroArticulo, esUltimaFilaDeExampleTable);
        }
    }

    public void ingresarValorDeEntradaDeLaCoberturaDelRiesgo(String cobertura, String entrada, String valorEntrada, boolean esOtroArticulo, boolean esUltimaFilaDeExampleTable) {
        // Registro de tarea dinámica en el reporte de Serenity


            seleccionarCoberturaDelRiesgo(cobertura);
            edificiosyUbicacionesWidget.ingresarValorAEntrada(entrada, valorEntrada);


    }

    private void seleccionarCoberturaDelRiesgo(String cobertura) {
        if (!edificiosyUbicacionesWidget.estaSeleccionadaCoberturaDeRiesgo(cobertura)) {
            edificiosyUbicacionesWidget.seleccionarCoberturaDelRiesgo(cobertura);
        }
    }

    private void seleccionarTab(String tab) {
        if (!edificiosyUbicacionesWidget.estaSeleccionadoTab(tab)) {
            edificiosyUbicacionesWidget.seleccionarTab(tab);
        }
    }

    private void seleccionarTipoDeArticulo(String tipoArticulo) {
        if (!edificiosyUbicacionesWidget.estaSeleccionadaTipoDeArticuloEnInformacionDeArticulo(tipoArticulo)) {
            edificiosyUbicacionesWidget.seleccionarTipoDeArticuloDeInformacionDeArticulo(tipoArticulo);
        }
    }

    @Step
    public void ingresar_valor_de_entrada_de_la_cobertura(String valorDeEntradaDeCobertura) {
        // este metodo vacio permite generar pasos en el reporte de Serenity de forma dinámica
    }

    @Step
    public void verificar_mensaje(ExamplesTable mensajes){
        edificiosyUbicacionesWidget.verificarMensajes(mensajes);
    }


}
