package com.sura.policycenter;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.webdriver.SerenityWebdriverManager;


public class ValidacionDeSublimites {

    public ValidacionDeSublimites(){
        runSerenity().inASingleSession();
    }

   // @Test
    public void postStory(){
        SerenityWebdriverManager.inThisTestThread().closeAllDrivers();
    }
}
