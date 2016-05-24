package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.LoggerFactory;

public class OpcionesAdminitradorCotizaciones extends Guidewire {

    public OpcionesAdminitradorCotizaciones (WebDriver driver){
        super(driver);
    }

    Actions act = new Actions(getDriver());

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesAdminitradorCotizaciones.class);

    
}
