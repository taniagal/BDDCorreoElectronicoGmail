package com.sura.gw.policy.cuenta.definiciones;

import com.sura.gw.policy.cuenta.steps.ConsultaDeCuentaSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.slf4j.LoggerFactory;

/**
 * Created by andralgu on 18/07/2016.
 */
public class ConsultaDeCuenta {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Steps
    ConsultaDeCuentaSteps consultaDeCuentaSteps;

    private String numCuenta;

    //@Given("existe asesor $numCuenta")
    public void existeUnaCuenta(/*@Named("numCuenta") String numCuenta*/) {
        this.numCuenta = numCuenta;
        LOGGER.info("ConsultaDeCuenta.existeUnaCuenta");
    }

    @When("busque asesor por numero <numcuenta>")
    public void cuandoBusqueCuentaExistenteNumero(@Named("numCuenta") String numCuenta) {
        consultaDeCuentaSteps.consultar_cuenta_por_numero_de_cuenta(numCuenta);
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.cuandoBusqueCuentaExistenteNumero");
    }
}

