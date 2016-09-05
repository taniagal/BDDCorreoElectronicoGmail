package com.sura.policycenter;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.junit.Test;


public class ValidacionDeSublimites{

    public ValidacionDeSublimites(){
        /**runSerenity().inASingleSession();*/
    }

   // @Test
    public void postStory(){
        SerenityWebdriverManager.inThisTestThread().closeAllDrivers();
    }
}
