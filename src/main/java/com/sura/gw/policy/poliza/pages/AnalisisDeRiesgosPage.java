package com.sura.gw.policy.poliza.pages;


import com.sura.gw.inicio.guidewire.GuidewirePage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AnalisisDeRiesgosPage extends PageObject {


    public WebElementFacade obtenerCompromisoBloqueado() {

        String XpathCompromisoBloqueado = "//a[@class='g-actionable']";
        waitFor(2).second();
        return findBy(XpathCompromisoBloqueado);
    }

    public void ingresarAOpcionAnalisisdeRiesgo() {

        waitFor(2).second();
        String XpathAnalisisRiesgos = ".//*[@id='CancellationWizard:RiskAnalysis']/div";
        findBy(XpathAnalisisRiesgos).waitUntilClickable().click();
        waitFor(2).second();

    }

}
