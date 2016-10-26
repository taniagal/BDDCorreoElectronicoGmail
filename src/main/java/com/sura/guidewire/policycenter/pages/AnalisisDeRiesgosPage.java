package com.sura.guidewire.policycenter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AnalisisDeRiesgosPage extends PageObject {


    public WebElementFacade obtenerCompromisoBloqueado() {

        String xpathCompromisoBloqueado = "//a[@class='g-actionable']";
        waitFor(2).second();
        return findBy(xpathCompromisoBloqueado);
    }

    public void ingresarAOpcionAnalisisdeRiesgo() {

        waitFor(2).second();
        String xpathAnalisisRiesgos = ".//*[@id='CancellationWizard:RiskAnalysis']/div";
        findBy(xpathAnalisisRiesgos).waitUntilClickable().click();
        waitFor(2).second();

    }

}
