package com.sura.policycenter;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.junit.Test;


public class ValidacionDeSublimitesOtros extends SerenityStory {

    public ValidacionDeSublimitesOtros(){
        runSerenity().inASingleSession();
    }

    @Test
    public void postStory(){
        SerenityWebdriverManager.inThisTestThread().closeAllDrivers();
    }
}
