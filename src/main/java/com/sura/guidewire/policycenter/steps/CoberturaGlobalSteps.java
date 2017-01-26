package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.pages.CoberturaGlobalPage;
import com.sura.guidewire.policycenter.pages.PanelSurEspacioDeTrabajoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class CoberturaGlobalSteps extends ScenarioSteps {
    CoberturaGlobalPage coberturaGlobalPage = new CoberturaGlobalPage(getDriver());
    PanelSurEspacioDeTrabajoPage panelSurEspacioDeTrabajoPage;

    public CoberturaGlobalSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ir_a_coberturas_globales(){
        coberturaGlobalPage.irACoberturasGlobales();
    }

    @Step
    public void ir_a_agregar_cobertura_global(){
        coberturaGlobalPage.ingresarAgregarCoberturaGlobal();
    }
    @Step
    public void validar_campos_agregar_cobertura(String estadouno,String estadodos,ExamplesTable menusesperados){
        coberturaGlobalPage.validarCamposAgregarCobertura(estadouno,estadodos,menusesperados);
    }
    @Step
    public void validar_campos_pestaña_coberturas(String estadouno,String estadodos,ExamplesTable menusesperados){
        coberturaGlobalPage.validarCamposPestañaCoberturas(estadouno,estadodos,menusesperados);
    }

    @Step
    public void agregar_coberturas_globales(ExamplesTable datosCobertura){
        coberturaGlobalPage.agregarCoberturasGlobales(datosCobertura);
    }

    @Step
    public void verificar_coberturas_y_ubicaciones() {
        coberturaGlobalPage.verificarCoberturasIncluidas();
        coberturaGlobalPage.verificarUbicacionesCubiertas();
    }

    @Step
    public void seleccionar_cobertura_unica(ExamplesTable datosCobertura) {
        coberturaGlobalPage.seleccionarCoberturaUnica(datosCobertura);
    }

    @Step
    public void seleccionar_boton_aceptar_de_la_parte_superior_izquierda(){
        coberturaGlobalPage.seleccionarBotonAceptar();
    }

    @Step
    public void ingresar_descripcion_detalle_cobertua_global(String descripcion){
        coberturaGlobalPage.ingresarDescripcionDetalleCoberturaGlobal(descripcion);
    }

    @Step
    public void validar_campos_coberturas_globales(String estadouno, String estadodos, ExamplesTable menusesperados){
        coberturaGlobalPage.validarCamposCoberturasGlobales(estadouno,estadodos,menusesperados);
    }

    @Step
    public void verificar_mensaje_error(String mensaje) {
        coberturaGlobalPage.verificarMensajeError(mensaje);
    }

    @Step
    public void verLosMensajesDeAdvertenciaDeReglasDeCoberturas(ExamplesTable mensajes) {
        panelSurEspacioDeTrabajoPage.validarMensajes(this.obtenerMensajes(mensajes));
    }

    @Step
    public void validarMensajesNoSeMuestranLosMensajes(ExamplesTable mensajes) {
        panelSurEspacioDeTrabajoPage.validarMensajesNoVisibles(this.obtenerMensajes(mensajes));
    }

    public String obtenerMensajes(ExamplesTable mensajes){
        Map<String, String> mensajesEsperados = mensajes.getRows().get(0);
        String listaDeMensajes = "";
        String llave;
        for (int i = 0; i < mensajesEsperados.size(); i++){
            llave = "mensaje" + (i+1);
            listaDeMensajes = listaDeMensajes + mensajesEsperados.get(llave);
        }
        return listaDeMensajes;
    }

}
