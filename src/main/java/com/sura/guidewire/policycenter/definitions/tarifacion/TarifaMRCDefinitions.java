package com.sura.guidewire.policycenter.definitions.tarifacion;

import com.sura.guidewire.policycenter.steps.tarifacion.TarifaMRCSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class TarifaMRCDefinitions {
    @Steps
    TarifaMRCSteps tarifaMRCSteps;

    @Then("debo poder ver el valor de la prima <prima> en la cotizacion")
    public void verificarTarifacion(@Named("prima")String prima){
        tarifaMRCSteps.verificarTarifacion(prima);
    }

    @Then("debo poder ver el valor de la prima <prima> en la cobertura")
    public void verificarTarifacionEnCobertura(@Named("prima")String prima){
        tarifaMRCSteps.verificarTarifacionEnCobertura(prima);
    }

    @Then("debo poder ver el valor de la prima en la cobertura y el valor de cobertura de sustraccion $primasPoliza")
    public void verificarTarifacionEnCoberturasTerremotoYSustraccion(ExamplesTable primasPoliza){
        tarifaMRCSteps.verificarTarifacionEnCoberturasTerremotoYSustraccion(primasPoliza);
    }

    @When("seleccione la cobertura: $datos")
    public void seleccionarCobertura(ExamplesTable datos){
        tarifaMRCSteps.seleccionarCobertura(datos);

    }

    @When("seleccione la cobertura de daños materiales con valor <valor> e indice variable <valorIndice>")
    public void seleccionarCobertura(@Named("valor") String valor, @Named("valorIndice") String valorIndice){
        tarifaMRCSteps.seleccionarCoberturaDaños(valor, valorIndice);
    }

    @When("seleccione la opcion de deducible en si")
    public void seleccionarDeducibleSi(){
        tarifaMRCSteps.seleccionarDeducibleSi();
    }

    @When("seleccione la opcion de deducible en no")
    public void seleccionarDeducibleNo(){
        tarifaMRCSteps.seleccionarDeducibleNo();
    }

    @When("cotice el articulo")
    public void agregarArticulo(){
        tarifaMRCSteps.agregarArticulo();
    }

    @When("cotice el articulo bloqueado")
    public void cotizarArticuloBloqueado(){
        tarifaMRCSteps.cotizarArticuloBloqueado();
    }

    @When("quiera ingresar modificadores de tarifa")
    public void irAModificadores(){
        tarifaMRCSteps.irAModificadores();
    }

    @Then("debo poder ver los modificadores definidos")
    public void verificarModificadores(){
        tarifaMRCSteps.verificarModificadores();
    }

    @Then("el valor de iva debe ser igual a 0 (cero)")
    public void verificarImpuestos(){
        tarifaMRCSteps.verificarImpuestos();
    }
}
