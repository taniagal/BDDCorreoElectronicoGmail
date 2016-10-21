package com.sura.guidewire.policycenter;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.junit.Test;


public class CoberturaUbicacionSustraccion extends SerenityStory {

    public CoberturaUbicacionSustraccion(){
        runSerenity().inASingleSession();
    }

    @Test
    public void postStory(){
        SerenityWebdriverManager.inThisTestThread().closeAllDrivers();
    }
}
