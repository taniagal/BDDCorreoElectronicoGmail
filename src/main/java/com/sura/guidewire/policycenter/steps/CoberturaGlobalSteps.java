package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.pages.CoberturaGlobalPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class CoberturaGlobalSteps extends ScenarioSteps {
    CoberturaGlobalPage coberturaGlobalPage = new CoberturaGlobalPage(getDriver());
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

}
