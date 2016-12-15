package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.commons.LoginSteps;
import com.sura.guidewire.policycenter.steps.CoberturaGlobalSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class CoberturaGlobalDefinitions {
    @Steps
    CoberturaGlobalSteps coberturaGlobalSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;

    @When("agregue coberturas globales con datos: $datosCobertura")
    public void agregarCoberturas(ExamplesTable datosCobertura){
        coberturaGlobalSteps.ir_a_coberturas_globales();
        coberturaGlobalSteps.agregar_coberturas_globales(datosCobertura);
    }
    @When("seleccione la opcion coberturas globales")
    public void cuandoSeleccioneLaOpcionAgregarCobertura(){
        coberturaGlobalSteps.ir_a_coberturas_globales();
    }

    @When("seleccione la opcion agregar cobertura global")
    public void cuandoSeleccioneLaOpcionAgregarCoberturaGlobal(){
        coberturaGlobalSteps.ir_a_agregar_cobertura_global();
    }

    @When("ingrese las diferentes coberturas globales $entradas")
    public void cuandoIntenteIngresarLasEntradasDeLasDiferentesCoberturas(ExamplesTable entradas) {


        int index = 0;
        for (Map<String, String> entradaCoberturaGlobal : entradas.getRows()) {
            index++;
            String descripcion = entradaCoberturaGlobal.get("DESCRIPCION");
            String cobertura = entradaCoberturaGlobal.get("COBERTURA");
            String entrada = entradaCoberturaGlobal.get("ENTRADAS");
            boolean esOtroArticulo = false;
            if ("X".equals(entradaCoberturaGlobal.get("OTRO_ARTICULO_OTROS"))) {
                esOtroArticulo = true;
            }
            boolean esUltimaFilaDeExampleTable = index == entradas.getRows().size();
            String valorEntrada = entradaCoberturaGlobal.get("VALOR_ENTRADAS");
            coberturaGlobalSteps.ingresar_descripcion_detalle_cobertua_global(descripcion);
            edificiosUbicacionesSteps.ingresarValorDeEntradaDeLaCoberturaDelRiesgo(cobertura, entrada, valorEntrada, esOtroArticulo, esUltimaFilaDeExampleTable);
        }

        coberturaGlobalSteps.seleccionar_boton_aceptar_de_la_parte_superior_izquierda();
    }
    @Then("en coberturas globales deben estar en estado <estadouno> las siguientes opciones $menusesperados")

    public void entoncesEnCoberturasGlobalesSeDebeValidarLasSiguienteOpcione(@Named("estadouno") String estadouno,
                                                                             ExamplesTable menusesperados){
        String estadodos = "";
        coberturaGlobalSteps.validar_campos_coberturas_globales(estadouno,estadodos,menusesperados);
    }

    @Then("debe mostrarme las coberturas incluidas y las ubicaciones cubiertas")
    public void verificarCoberturasyUbicaciones(){
        coberturaGlobalSteps.verificar_coberturas_y_ubicaciones();
    }

    @When("agregue una cobertura global con datos: $datosCobertura")
    public void agregarCobertura(ExamplesTable datosCobertura){
        coberturaGlobalSteps.ir_a_coberturas_globales();
        coberturaGlobalSteps.seleccionar_cobertura_unica(datosCobertura);
    }

    @Then("debe mostrarme un mensaje<mensaje> de error")
    public void verificarMensajeError(@Named("mensaje")String mensaje){
        coberturaGlobalSteps.verificar_mensaje_error(mensaje);
    }

    @Then("en agregar coberturas globales deben estar en estado <estadouno> las siguientes opciones $menusesperados")
    public void entoncesEnAgregarCoberturasSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno, ExamplesTable menusesperados){
        String estadodos = "";
        coberturaGlobalSteps.validar_campos_agregar_cobertura(estadouno,estadodos,menusesperados);
    }
    @Then("debe estar en la pestaña coberturas en estado <estadouno> las siguientes opciones $menusesperados")
    public void entoncesEnLaPestañaCoberturasSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno,
                                                                                 @Named("estadodos") String estadodos,
                                                                                 ExamplesTable menusesperados) {
        coberturaGlobalSteps.validar_campos_pestaña_coberturas(estadouno,estadodos,menusesperados);
    }


}
