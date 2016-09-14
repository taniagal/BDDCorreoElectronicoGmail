package com.sura.policycenter;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.junit.Test;


public class CoberturaUbicacionOtros extends SerenityStory {

    public CoberturaUbicacionOtros(){

        //runSerenity().inASingleSession();
    }

    @Test
    public void postStory(){
        SerenityWebdriverManager.inThisTestThread().closeAllDrivers();
    }
}
