package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CotizacionMRCSteps;
import com.sura.guidewire.policycenter.steps.CotizacionRenovacionPASteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionRenovacionPADefinitions {
    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    CotizacionRenovacionPASteps cotizacionRenovacionPASteps;

    @Given("se ha realizado la renovacion de la cotizacion <cotizacion>")
    public void buscarCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.irABuscarCotizacionPoliza(cotizacion);
    }

    @When("ingrese revisar la cotizacion")
    public void ingresarACotizacion(){
        cotizacionRenovacionPASteps.ver_Detalle_De_Cotizacion();
    }

    @Then("se debe mostrar la informacion del detalle de cotizacion por riesgo, donde se muestre: $detalleCotizacion")
    public void validarDetalleCotizacion(ExamplesTable detalleCotizacion){
        cotizacionRenovacionPASteps.validar_Detalle_De_Cotizacion(detalleCotizacion);
    }

    @Then("en el detalle por coberturas mostrar: $detalleCobertura")
    public void validarDetallePorCobertura(ExamplesTable detalleCobertura){
        cotizacionRenovacionPASteps.validar_Detalle_Por_Cobertura(detalleCobertura);
    }

    @Then("se debe ver la direccion del tomador de la poliza la cual se indico como principal $direccion")
    public void validarDireccion(ExamplesTable direccion){
        cotizacionRenovacionPASteps.validar_Direccion_Del_Tomador(direccion);
    }

    @Then("se debe mostrar en la columna Termino el limite o deducible de la cobertura en el caso de que aplique $valorTermino")
    public void validarValorTermino(ExamplesTable valorTermino){
        cotizacionRenovacionPASteps.validar_Valor_Termino_De_La_Cobertura(valorTermino);
    }

    @Then("se debe mostrar la informacion general de la poliza cotizada con los siguientes datos: $informacionGeneral")
    public void validarInformacionGeneralRenovacion(ExamplesTable informacionGeneral){
        cotizacionRenovacionPASteps.validar_Informacion_General_De_Renovacion(informacionGeneral);
    }
}
