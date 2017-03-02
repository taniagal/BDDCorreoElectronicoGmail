package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.RevisionDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

/**
 * Created by juanzaag on 25/11/2016.
 */
public class RevisionDePolizaSteps extends ScenarioSteps {

    RevisionDePolizaPage revisionDePolizaPage;

    @Step
    public void ingresar_a_revision_de_poliza(){
        revisionDePolizaPage.ingresarALaOpcionRevisionPoliza();
    }
    public void validar_campos_revision_poliza(String estadouno,String estadodos,ExamplesTable menusesperados){
        revisionDePolizaPage.validarCamposOpcionRevisionDePoliza(estadouno,estadodos,menusesperados);
    }
    public void validar_campos_cotizacion_poliza(String estadouno,String estadodos,ExamplesTable menusesperados){
        revisionDePolizaPage.validarCamposOpcionCotizacionDePoliza(estadouno,estadodos,menusesperados);
    }


}


