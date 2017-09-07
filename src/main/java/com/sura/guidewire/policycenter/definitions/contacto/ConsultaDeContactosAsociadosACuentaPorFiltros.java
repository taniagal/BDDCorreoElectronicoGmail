package com.sura.guidewire.policycenter.definitions.contacto;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.steps.cuenta.CuentaSteps;
import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireLoginSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


/**
 * @escenario: Consultar contactos asociados a una cuenta haciendo uso de los filtros rol y tipo persona
 */
public class ConsultaDeContactosAsociadosACuentaPorFiltros {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    private static final int TIEMPO_1000 = 1000;
    @Managed
    public WebDriver driver;
    @Steps
    GuidewireLoginSteps login;
    @Steps
    CuentaSteps cuenta;

    @When("filtre los contactos asociados a una cuenta por el rol $filtro en el combo con valor $combo")
    @Alias("filtre los contactos asociados a una cuenta por el tipo de persona $filtro en el combo con valor $combo")
    public void filtreLosContactosAsociadosAEstaCuenta(@Named("filtro") String filtro, @Named("combo") String combo) {
        cuenta.obtenerContactosAsociadosWO().filtrarContactosAsociados(filtro, combo);

    }

    @Then("debo ver contactos asociados a esta cuenta que cumplan con el filtro $filtro en la columna $columna")
    public void deboVerContactosAsociadosAEstaCuentaConFiltrosAplicadosEnColumna(@Named("filtro") String filtro, @Named("columna") String columna) {
        try {
            MatcherAssert.assertThat(cuenta.obtenerContactosAsociadosWO().obtenerColumna(columna), CoreMatchers.hasItem(CoreMatchers.containsString(filtro)));
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            PageUtil.esperarHasta(TIEMPO_1000);
            MatcherAssert.assertThat(cuenta.obtenerContactosAsociadosWO().obtenerColumna(columna), CoreMatchers.hasItem(CoreMatchers.containsString(filtro)));
        }
    }
}
