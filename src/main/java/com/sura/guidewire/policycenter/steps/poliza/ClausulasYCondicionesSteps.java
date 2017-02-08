package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.ClausulasYCondicionesPage;
import gherkin.formatter.model.Examples;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

/**
 * Created by juanzaag on 08/02/2017.
 */
public class ClausulasYCondicionesSteps extends ScenarioSteps {

    @Page
    ClausulasYCondicionesPage clausulasYCondicionesPage;

    @Step
    public void ingresarAClausulasYCondiciones (){
        clausulasYCondicionesPage.ingresarALaOpcion();

    }

    public void validarOpciones(ExamplesTable listaopciones,String estadouno, String estadodos){
        clausulasYCondicionesPage.validarOpciones(listaopciones,estadouno,estadodos);

    }
}
