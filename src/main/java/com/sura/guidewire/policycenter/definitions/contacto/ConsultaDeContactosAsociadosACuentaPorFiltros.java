package com.sura.guidewire.policycenter.definitions.contacto;

import com.sura.guidewire.policycenter.util.navegacion.steps.GuidewireLoginSteps;
import com.sura.guidewire.policycenter.steps.cuenta.CuentaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


/**
 * @escenario: Consultar contactos asociados a una cuenta haciendo uso de los filtros rol y tipo persona
 */
public class ConsultaDeContactosAsociadosACuentaPorFiltros {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Steps
    GuidewireLoginSteps login;

    @Steps
    CuentaSteps cuenta;

    @Managed
    public WebDriver driver;


    @When("filtre los contactos asociados a una cuenta por el rol $filtro en el combo con valor $combo")
    @Alias("filtre los contactos asociados a una cuenta por el tipo de persona $filtro en el combo con valor $combo")
    public void filtreLosContactosAsociadosAEstaCuenta(@Named("filtro") String filtro, @Named("combo") String combo) {
        cuenta.obtenerContactosAsociadosWO().filtrarContactosAsociados(filtro,combo);
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.filtreLosContactosAsociadosAEstaCuenta");

    }

    @Then("debo ver contactos asociados a esta cuenta que cumplan con el filtro $filtro en la columna $columna")
    public void deboVerContactosAsociadosAEstaCuentaConFiltrosAplicadosEnColumna(@Named("filtro") String filtro, @Named("columna") String columna) {
        MatcherAssert.assertThat(cuenta.obtenerContactosAsociadosWO().obtenerColumna(columna), CoreMatchers.hasItem(CoreMatchers.containsString(filtro)));

        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.deboVerContactosAsociadosAEstaCuentaConFiltrosAplicadosEnColumna");
    }

    @When("ingrese a PolicyCenter y me loguee con un usuario de rol $rolUsuario")
    public void accesoAPolicyCenter(@Named("rolUsuario") String rolUsuario) {
        cuenta.login(driver, rolUsuario);
    }

}
