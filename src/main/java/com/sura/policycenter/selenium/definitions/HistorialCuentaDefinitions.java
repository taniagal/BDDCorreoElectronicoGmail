package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

@SuppressWarnings({"WeakerAccess", "EmptyMethod"})
public class HistorialCuentaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private HistorialCuentaSteps historialCuentaSteps;
    
    @Given("ingreso a una cuenta <numCuenta>")
    public void givenEstoyEnUnaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        historialCuentaSteps.seleccionarCuenta(numCuenta);
    }

    @When("ingrese al historial")
    public void whenIngresoAlHistorial() {
        historialCuentaSteps.seleccionarHistorial();
    }

    @Given("estoy en el historial de la cuenta <numCuenta>")
    public void givenEstoyEnElHistorialDeLaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        historialCuentaSteps.seleccionarCuenta(numCuenta);
        historialCuentaSteps.seleccionarHistorial();
    }

    @Then("mostrar la informacion del historial de la cuenta")
    public void thenMostrarLaSiguienteInformacionTipousuariofechaTransacciondescripcionproductopolizatransaccionPolizavalorOriginalvalorNuevo() {
        historialCuentaSteps.validarColumnasHistorialCuenta();
    }

    @When("indique el criterio de busqueda Relacionado con")
    public void whenIndiqueElCriterioDeBusquedaRelacionadoCon() {
        historialCuentaSteps.buscarCuentaRelacionadoCon();
    }

    @Then("debo poder ver las transacciones relacionadas a la opcion indicada en el campo Relacionado con")
    public void thenDeboPoderVerLasTransaccionesRelacionadasALaOpcionIndicadaEnElCampoRelacionadoCon() {
        historialCuentaSteps.validarResultadoBusqueda();
    }

    @When("indique los criterios de busqueda <Usuario>, RelacionadoCon y <FechaDesde> y <FechaHasta>")
    public void whenIndiqueMultiplesCriterios (@Named("Usuario") String usuario,
                                               @Named("FechaDesde") String fechaDesde,
                                               @Named("FechaHasta") String fechaHasta){
        historialCuentaSteps.buscarCuentaConMultiplesOpciones( usuario,  fechaDesde,  fechaHasta);
    }

}