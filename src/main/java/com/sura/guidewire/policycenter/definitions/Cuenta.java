package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.CuentaSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.When;
import org.slf4j.LoggerFactory;

public class Cuenta {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);



    @Steps
    CuentaSteps asesor;


    @When("desee ver las transacciones de poliza")
    public void cuandoDeseeVelLasTransaccionesDePoliza() {
        asesor.consultar_transacciones_de_poliza();
        LOGGER.info("Cuenta.cuandoDeseeVelLasTransaccionesDePoliza");
    }

    public CuentaSteps getAsesor() {
        return asesor;
    }





}
