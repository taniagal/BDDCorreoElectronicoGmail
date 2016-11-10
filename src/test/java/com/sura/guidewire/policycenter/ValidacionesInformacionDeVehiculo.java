package com.sura.guidewire.policycenter;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.junit.Test;

public class ValidacionesInformacionDeVehiculo extends SerenityStory{

    @Test
    public void postStory(){
        SerenityWebdriverManager.inThisTestThread().closeAllDrivers();
    }
}
