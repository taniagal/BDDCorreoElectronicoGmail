package com.sura.configuracion;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.Configuration;

public class Historia extends SerenityStories{
    public Historia(String nombreHistoria, Configuration configuracion, EnvironmentVariables variablesDeAmbiente) {
        this.setEnvironmentVariables(variablesDeAmbiente);
        setSystemConfiguration(configuracion);
        findStoriesCalled(nombreHistoria);
    }
}
