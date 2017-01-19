package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.AgregarArticuloEdificiosyUbicacionesWidget;
import com.sura.guidewire.policycenter.pages.EdificiosyUbicacionesWidget;
import com.sura.guidewire.policycenter.pages.poliza.NuevaPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class EdificiosUbicacionesSteps extends ScenarioSteps {


    private static EdificiosyUbicacionesWidget edificiosyUbicacionesWidget;
    private static AgregarArticuloEdificiosyUbicacionesWidget agregarArticuloEdificiosyUbicacionesWidget;
    private static NuevaPolizaPage nuevaPolizaPage;

    public EdificiosUbicacionesSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresarNuevaUbicacion() {
        edificiosyUbicacionesWidget.ingresarNuevaUbicacionConRiesgoConsultable();
    }

    @Step
    public void ingresarNuevaUbicacionSinRiesgo() {
        edificiosyUbicacionesWidget.ingresarNuevaUbicacionSinRiesgoConsultable();
    }

    @Step
    public void ingresarNuevaUbicacionSinRiesgo(ExamplesTable datosUbicacion) {
        edificiosyUbicacionesWidget.ingresarNuevaUbicacionSinRiesgoConsultable(datosUbicacion);
    }

    @Step
    public void seleccionarBotonAgregarArticuloAUnaUbicacion() {
        edificiosyUbicacionesWidget.agregarArticuloAPrimerUbicacion();
    }

    @Step
    public void seleccionarBotonAgregarArticuloAUnaUbicacionEnCambioDePoliza() {
        edificiosyUbicacionesWidget.agregarArticuloAPrimerUbicacionEnCambioDePoliza();
    }

    @Step
    public void seleccionarBotonAgregarArticuloAUnaUbicacionEnRenovacionDePoliza() {
        edificiosyUbicacionesWidget.agregarArticuloAPrimerUbicacionEnRenovacionDePoliza();
    }

    @Step
    public void ingresarInteresAdicionalAArticulo(String numerocedula, String tipodocumento) {
        edificiosyUbicacionesWidget.agregarInteresAdicional(numerocedula, tipodocumento);
    }

    @Step
    public void ingresarTipoBeneficiario(String beneficiario) {
        agregarArticuloEdificiosyUbicacionesWidget.desplegarListaTipoBeneficiario();
        nuevaPolizaPage.seleccionarElementoDeLaLista(beneficiario);
    }

    @Step
    public void seleccionarBotonCotizar() {
        edificiosyUbicacionesWidget.cliclearBtnCotizar();
    }

    @Step
    public void seleccionarCheckDelArticuloAAgregar() {
        agregarArticuloEdificiosyUbicacionesWidget.seleccionarArticuloEdificio();
    }

    @Step
    public void seleccionarCheckDeCoberturaQueDeseaAplicar() {
        agregarArticuloEdificiosyUbicacionesWidget.seleccionarDanosMaterialesDeArticuloEdificio();
    }

    @Step
    public void ingresarValorReconstruccionDelArticulo(String valor) {
        agregarArticuloEdificiosyUbicacionesWidget.ingresarValorReconstruccion(valor);
    }

    @Step
    public void ingresarValorAseguradoDanosMateriales(String valor) {
        agregarArticuloEdificiosyUbicacionesWidget.ingresarValorAseguradoDanosMateriales(valor);
    }

    @Step
    public void ingresarValorSublimiteTranslados(String valor) {
        agregarArticuloEdificiosyUbicacionesWidget.ingresarValorSublimiteTranslado(valor);
    }

    @Step
    public void ingresarValorSublimiteParaCombustion(String valor) {
        agregarArticuloEdificiosyUbicacionesWidget.ingresarValorSublimiteCombustion(valor);
    }

    @Step
    public void seleccionarBotonAceptarEnLaParteSuperiorIzquierda() {
        agregarArticuloEdificiosyUbicacionesWidget.seleccionarBotonAceptarParteSuperiorIzquierda();
    }

    @Step
    public void cancelarIngresoDeNuevaUbicacion() {
        edificiosyUbicacionesWidget.seleccionarEnlaceCancelarIngresoNuevaUbicacion();
    }

    @Step
    public void removerRiesgos() {
        edificiosyUbicacionesWidget.removerRiesgos();

    }

    @Step
    public void seleccionarBotonEditarTransaccionDePoliza() {
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

    public void ingresarCoberturas(ExamplesTable entradas) {
        int index = 0;
        for (Map<String, String> entradaCobertura : entradas.getRows()) {
            index++;
            String tab = entradaCobertura.get("TAB");
            String tipoArticulo = entradaCobertura.get("TIPO_ARTICULO");
            String cobertura = entradaCobertura.get("COBERTURA");
            String entrada = entradaCobertura.get("ENTRADAS");
            boolean esOtroArticulo = false;
            if ("X".equals(entradaCobertura.get("OTRO_ARTICULO_OTROS"))) {
                esOtroArticulo = true;
            }
            boolean esUltimaFilaDeExampleTable = index == entradas.getRows().size();
            String valorEntrada = entradaCobertura.get("VALOR_ENTRADAS");

            ingresarValorDeEntradaDeLaCoberturaDelRiesgo(tab, cobertura, entrada, valorEntrada, tipoArticulo, esOtroArticulo, esUltimaFilaDeExampleTable);
        }
    }

    @Step
    public void ingresarInteresesAdicionalesACadaArticulo(ExamplesTable interesados) {
        edificiosyUbicacionesWidget.ingresarInteresesAdicionalesACadaArticulo(interesados);
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

        if ("Interes Adicional".equals(tab)) {
            seleccionarTab(tab);
            seleccionarTipoDeArticulo(tipoArticulo);
        }
    }

    public void ingresarValorDeEntradaDeLaCoberturaDelRiesgoPolizaColectiva(String cobertura, String entrada, String valorEntrada) {
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
    public void verificarMensaje(ExamplesTable mensajes) {
        edificiosyUbicacionesWidget.verificarMensajes(mensajes);
    }

    public void validarNoVisibilidadDeObjeto() {
        edificiosyUbicacionesWidget.validarNoVisibilidad();
    }


}
