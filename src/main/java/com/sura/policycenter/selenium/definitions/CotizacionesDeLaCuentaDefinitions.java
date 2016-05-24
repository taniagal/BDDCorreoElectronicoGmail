package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CotizacionesDeLaCuentaSteps;
import com.sura.policycenter.selenium.steps.CrearNuevaCuentaSteps;
import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CotizacionesDeLaCuentaDefinitions {
    @Steps
    SeusLoginSteps seusLogin;

    @Steps
    HistorialCuentaSteps historialCuentaSteps;

    @Steps
    CotizacionesDeLaCuentaSteps cotizacionesDeLaCuentaSteps;


    @Given("estoy en una cuenta <numCuenta>")
    public void givenEstoyEnUnaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        historialCuentaSteps.seleccionarCuenta(numCuenta);
    }

    @When("ingrese a cotizaciones de la cuenta")
    public void whenIgreseACotizacionesDeLaCuenta() {
        cotizacionesDeLaCuentaSteps.seleccionarCotizacionesDeLaCuenta();
    }

    @When("seleccione las acciones de una cotizacion en particular")
    public void whenSeleccioneAccionesCotizacion() {
        //cotizacionesDeLaCuentaSteps.seleccionarAccionesCotizacion();
    }

    @Then("me debe permitir cambiar el estado de acuerdo a la lista definida. Lista definida: Declinar <declinar>, No Tomar <noTomar>")
    public void whenSeleccioneAccionesCotizacion(@Named("declinar") String declinar, @Named("noTomar") String noTomar) {
        // cotizacionesDeLaCuentaSteps.seleccionarAccionesCotizacion(declinar, noTomar);
    }

    @When("seleccione la opcion de crear nueva cotizacion <crearCotizacion>")
    public void whenSeleccioneCrearCotizacion() {
       // cotizacionesDeLaCuentaSteps.eleccionarCrearCotizacion();
    }



}
