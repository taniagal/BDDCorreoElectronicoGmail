package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.CoberturaGlobalSteps;
import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class CoberturaGlobalDefinitions {
    @Steps
    CoberturaGlobalSteps coberturaGlobalSteps;
    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;


    @When("seleccione la opcion coberturas globales")
    public void cuandoSeleccioneLaOpcionAgregarCobertura(){
        coberturaGlobalSteps.ir_a_coberturas_globales();
    }

    @When("seleccione la opcion agregar cobertura global")
    public void cuandoSeleccioneLaOpcionAgregarCoberturaGlobal(){
        coberturaGlobalSteps.ir_a_agregar_cobertura_global();
    }

    @When("muestre los mensajes de advertencia para las reglas de coberturas $mensajes")
    public void verLosMensajesDeAdvertenciaDeReglasDeCoberturas(ExamplesTable mensajes){
        coberturaGlobalSteps.verLosMensajesDeAdvertenciaDeReglasDeCoberturas(mensajes);
    }

    @When("ingrese las diferentes coberturas globales $entradas")
    public void cuandoIntenteIngresarLasEntradasDeLasDiferentesCoberturas(ExamplesTable entradas) {


        for (Map<String, String> entradaCoberturaGlobal : entradas.getRows()) {
            String descripcion = entradaCoberturaGlobal.get("DESCRIPCION");
            String cobertura = entradaCoberturaGlobal.get("COBERTURA");
            String entrada = entradaCoberturaGlobal.get("ENTRADAS");
            String valorEntrada = entradaCoberturaGlobal.get("VALOR_ENTRADAS");
            coberturaGlobalSteps.ingresar_descripcion_detalle_cobertua_global(descripcion);
            edificiosUbicacionesSteps.ingresarValorDeEntradaDeLaCoberturaDelRiesgoPolizaColectiva(cobertura, entrada, valorEntrada);
        }

        coberturaGlobalSteps.seleccionar_boton_aceptar_de_la_parte_superior_izquierda();
    }
    @Then("en coberturas globales deben estar en estado <estadouno> las siguientes opciones $menusesperados")

    public void entoncesEnCoberturasGlobalesSeDebeValidarLasSiguienteOpcione(@Named("estadouno") String estadouno,
                                                                             ExamplesTable menusesperados){
        coberturaGlobalSteps.validar_campos_coberturas_globales(estadouno,menusesperados);
    }

    @Then("se debe validar el siguiente mensaje<mensaje> de error")
    public void verificarMensajeErrorValorComercial(@Named("mensaje")String mensaje){
        coberturaGlobalSteps.verificarMensajeErrorValorComercial(mensaje);
    }

    @Then("en agregar coberturas globales deben estar en estado <estadouno> las siguientes opciones $menusesperados")
    public void entoncesEnAgregarCoberturasSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno, ExamplesTable menusesperados){
        String estadodos = "";
        coberturaGlobalSteps.validar_campos_agregar_cobertura(estadouno,estadodos,menusesperados);
    }

    @Then("debe estar en la pestaña coberturas en estado <estadouno> las siguientes opciones $menusesperados")
    public void entoncesEnLaPestanaCoberturasSeDebenValidarLasSiguientesOpciones(@Named("estadouno") String estadouno,
                                                                                 @Named("estadodos") String estadodos,
                                                                                 ExamplesTable menusesperados) {
        coberturaGlobalSteps.validar_campos_pestaña_coberturas(estadouno,estadodos,menusesperados);
    }

    @Then("no debe mostrar los mensajes de advertencia para las reglas de coberturas $mensajes")
    public void validarMensajesNoSeMuestranLosMensajes(ExamplesTable mensajes) {
        coberturaGlobalSteps.validarMensajesNoSeMuestranLosMensajes(mensajes);
    }


}
