package com.sura.guidewire.policycenter.steps.poliza;


import com.sura.guidewire.policycenter.pages.poliza.CoberturaGlobalPage;
import com.sura.guidewire.policycenter.pages.poliza.PanelSurEspacioDeTrabajoPage;

import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class CoberturaGlobalSteps extends ScenarioSteps {

    @Page
    CoberturaGlobalPage coberturaGlobalPage;

    @Page
    PanelSurEspacioDeTrabajoPage panelSurEspacioDeTrabajoPage;

    public CoberturaGlobalSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ir_a_coberturas_globales() {
        coberturaGlobalPage.irACoberturasGlobales();
    }

    @Step
    public void ir_a_agregar_cobertura_global() {
        coberturaGlobalPage.ingresarAgregarCoberturaGlobal();
    }

    @Step
    public void validar_campos_agregar_cobertura(String estadouno, String estadodos, ExamplesTable menusesperados) {
        coberturaGlobalPage.validarCamposAgregarCobertura(estadouno, estadodos, menusesperados);
    }

    @Step
    public void validar_campos_pestana_coberturas(String estadouno, String estadodos, ExamplesTable menusesperados) {
        coberturaGlobalPage.validarCamposPestanaCoberturas(estadouno, estadodos, menusesperados);
    }

    @Step
    public void seleccionar_boton_aceptar_de_la_parte_superior_izquierda() {
        coberturaGlobalPage.seleccionarBotonAceptar();
    }

    @Step
    public void ingresar_descripcion_detalle_cobertua_global(String descripcion) {
        coberturaGlobalPage.ingresarDescripcionDetalleCoberturaGlobal(descripcion);
    }

    @Step
    public void validar_campos_coberturas_globales(String estadouno, ExamplesTable menusesperados) {
        coberturaGlobalPage.validarCamposCoberturasGlobales(estadouno, menusesperados);
    }

    @Step
    public void verificarMensajeErrorValorComercial(String mensaje) {
        coberturaGlobalPage.verificarMensajeErrorValorComercial(mensaje);
    }

    @Step
    public void verLosMensajesDeAdvertenciaDeReglasDeCoberturas(ExamplesTable mensajes) {
        panelSurEspacioDeTrabajoPage.validarMensajes(this.obtenerMensajes(mensajes));
    }

    @Step
    public void validarMensajesNoSeMuestranLosMensajes(ExamplesTable mensajes) {
        panelSurEspacioDeTrabajoPage.validarMensajesNoVisibles(this.obtenerMensajes(mensajes));
    }

    @Step
    public void ingresarDescripcionCobertura(String descripcion) {
        coberturaGlobalPage.ingresarDescripcionCobertura(descripcion);
    }

    @Step
    public void seleccionarCoberturasGlobales(ExamplesTable coberturas) {
        coberturaGlobalPage.seleccionarCoberturasGlobales(coberturas);
        coberturaGlobalPage.darClicBotonAceptar();
    }

    public String obtenerMensajes(ExamplesTable mensajes) {
        Map<String, String> mensajesEsperados = mensajes.getRows().get(0);
        String listaDeMensajes = "";
        String llave;
        for (int i = 0; i < mensajesEsperados.size(); i++) {
            llave = "mensaje" + (i + 1);
            listaDeMensajes = listaDeMensajes.concat(mensajesEsperados.get(llave));
        }
        return listaDeMensajes;
    }
}
