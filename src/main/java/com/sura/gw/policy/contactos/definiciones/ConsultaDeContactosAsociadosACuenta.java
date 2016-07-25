package com.sura.gw.policy.contactos.definiciones;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.AfterStories;
import org.slf4j.LoggerFactory;

public class ConsultaDeContactosAsociadosACuenta {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    /**
     * AFTER STORY
     */
    @AfterStories
    public void finalizarEscenario(){
        Serenity.done();
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.finalizarEscenario");
    }
    
}
