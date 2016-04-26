package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import com.sura.policycenter.selenium.steps.PolicySteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class HistorialCuentaDefinitions {

    @Steps
    SeusLoginSteps seusLoginSteps;

    @Steps
    HistorialCuentaSteps historialCuentaSteps;

    @Given("me encuentro autenticado en gw con un <country>, <user> y <password>")
    public void givenMeEncuentroAutenticadoEnGwConUnpaisusuarioYcontrasena(@Named("country") String country,
                                                                           @Named("user") String user,
                                                                           @Named("password") String password) {
        seusLoginSteps.login(country, user, password);
    }

    @Given("Estoy en una cuenta <numCuenta>")
    public void givenEstoyEnUnaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        historialCuentaSteps.seleccionarCuenta(numCuenta);
    }

    @When("ingreso al historial")
    public void whenIngresoAlHistorial() {
        historialCuentaSteps.seleccionarHistorial();
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @Then("solo se pueden visualizar las transacciones que esten asociadas a la cuenta")
    @Manual
    public void thenSoloSePuedenVisualizarLasTransaccionesQueEstenAsociadasALaCuenta() {
    }

    //ESCENARIO 2
    @Given("me encuentro autenticado en gw")
    public void givenMeEncuentroAutenticadoEnGw() {
        seusLoginSteps.login();
    }

    @Given("estoy en el historial de la cuenta <numCuenta>")
    @Pending
    public void givenEstoyEnElHistorialDeLaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        historialCuentaSteps.seleccionarCuenta(numCuenta);
        historialCuentaSteps.seleccionarHistorial();
    }

    @When("indique el criterio de busqueda Relacionado con")
    public void whenIndiqueElCriterioDeBusquedaRelacionadoCon() {
        historialCuentaSteps.buscarCuentaRelacionadoCon();
    }

    @Then("debo poder ver las transacciones relacionadas a la opcion indicada en el campo Relacionado con")
    @Pending
    public void thenDeboPoderVerLasTransaccionesRelacionadasALaOpcionIndicadaEnElCampoRelacionadoCon() {
        // PENDING
    }

    @Then("mostrar la siguiente informacion <Tipo>, <usuario>, <fechaTransaccion>, <descripcion>, <producto>, <poliza>, <transaccionPoliza>, <valorOriginal>, <valorNuevo>")
    @Pending
    public void thenMostrarLaSiguienteInformacionTipousuariofechaTransacciondescripcionproductopolizatransaccionPolizavalorOriginalvalorNuevo() {
        // PENDING
    }

    @When("se realiza la busqueda por <fecha> y solo se indique la opcion hasta")
    @Pending
    public void whenSeRealizaLaBusquedaPorfechaYSoloSeIndiqueLaOpcionHasta() {
        // PENDING
    }

    @Then("debo poder ver las transacciones en el rango de fechas seleccionado, teniendo en cuenta que la opcion desde corresponde a la fecha de inicio de la cuenta.")
    @Pending
    public void thenDeboPoderVerLasTransaccionesEnElRangoDeFechasSeleccionadoTeniendoEnCuentaQueLaOpcionDesdeCorrespondeALaFechaDeInicioDeLaCuenta() {
        // PENDING
    }

    @When("se realiza la busqueda por <fecha> y solo se indique la opcion desde")
    @Pending
    public void whenSeRealizaLaBusquedaPorfechaYSoloSeIndiqueLaOpcionDesde() {
        // PENDING
    }

    @Then("debo poder ver las transacciones en el rango de fechas seleccionado, teniendo en cuenta que la opcion hasta corresponde a la fecha actual.")
    @Pending
    public void thenDeboPoderVerLasTransaccionesEnElRangoDeFechasSeleccionadoTeniendoEnCuentaQueLaOpcionHastaCorrespondeALaFechaActual() {
        // PENDING
    }

    @When("se realiza la busqueda por fecha ( <desde> - <hasta>)")
    @Pending
    public void whenSeRealizaLaBusquedaPorFechadesdehasta() {
        // PENDING
    }

    @Then("debo poder ver las transacciones en el rango de fechas seleccionado.")
    @Pending
    public void thenDeboPoderVerLasTransaccionesEnElRangoDeFechasSeleccionado() {
        // PENDING
    }

    @When("indique un <usuario> para realizar la busqueda")
    @Pending
    public void whenIndiqueUnusuarioParaRealizarLaBusqueda() {
        // PENDING
    }

    @Then("debo poder ver las transacciones asociadas a ese usuario especifico, que estan relacionadas con la cuenta y las polizas asociadas a ella.")
    @Pending
    public void thenDeboPoderVerLasTransaccionesAsociadasAEseUsuarioEspecificoQueEstanRelacionadasConLaCuentaYLasPolizasAsociadasAElla() {
        // PENDING
    }

    @When("indique el <tipo> de producto")
    @Pending
    public void whenIndiqueEltipoDeProducto() {
        // PENDING
    }

    @Then("debo poder ver las transacciones asociadas al tipo de producto seleccionado.")
    @Pending
    public void thenDeboPoderVerLasTransaccionesAsociadasAlTipoDeProductoSeleccionado() {
        // PENDING
    }

    @When("indique varios criterios de busqueda como: Fechas ( <desde> - <hasta>), <usuario>,  <producto> y  <poliza>")
    @Pending
    public void whenIndiqueVariosCriteriosDeBusquedaComoFechasdesdehastausuarioproductoYpoliza() {
        // PENDING
    }

    @Then("debo poder ver las transacciones asociadas a todos los criterios de busqueda definidos.")
    @Pending
    public void thenDeboPoderVerLasTransaccionesAsociadasATodosLosCriteriosDeBusquedaDefinidos() {
        // PENDING
    }

    @When("seleccione  el  numero de la <poliza>")
    @Pending
    public void whenSeleccioneElNumeroDeLapoliza() {
        // PENDING
    }

    @Then("debo poder ver el campo poliza habilitado como un vinculo para el detalle de la transaccion")
    @Pending
    public void thenDeboPoderVerElCampoPolizaHabilitadoComoUnVinculoParaElDetalleDeLaTransaccion() {
        // PENDING
    }

}