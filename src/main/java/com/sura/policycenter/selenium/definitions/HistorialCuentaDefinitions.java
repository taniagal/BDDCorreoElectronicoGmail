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
    }

    @Given("me encuentro autenticado en gw")
    public void givenMeEncuentroAutenticadoEnGw() {
        seusLoginSteps.login();
    }

    @Given("estoy en el historial de la cuenta <numCuenta>")
    public void givenEstoyEnElHistorialDeLaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        historialCuentaSteps.seleccionarCuenta(numCuenta);
        historialCuentaSteps.seleccionarHistorial();
    }

    @Then("mostrar la siguiente informacion <tipo>, <usuario>, <fechaTransaccion>, <descripcion>, <producto>, <poliza>, <transaccionPoliza>, <valorOriginal>, <valorNuevo>")
    public void thenMostrarLaSiguienteInformacionTipousuariofechaTransacciondescripcionproductopolizatransaccionPolizavalorOriginalvalorNuevo(@Named("tipo") String tipo,
                                                                                                                                              @Named("usuario") String usuario,
                                                                                                                                              @Named("fechaTransaccion") String fechaTransaccion,
                                                                                                                                              @Named("descripcion") String descripcion,
                                                                                                                                              @Named("producto") String producto,
                                                                                                                                              @Named("poliza") String poliza,
                                                                                                                                              @Named("transaccionPoliza") String transaccionPoliza,
                                                                                                                                              @Named("valorOriginal") String valorOriginal,
                                                                                                                                              @Named("valorNuevo") String valorNuevo) {
        historialCuentaSteps.validarColumnasHistorialCuenta(tipo, usuario, fechaTransaccion, descripcion, producto, poliza, transaccionPoliza, valorOriginal, valorNuevo);
        seusLoginSteps.logout();
        seusLoginSteps.close();
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

    @Then("debo poder ver las transacciones relacionadas a la opciones indicadas en los campos de busqueda")
    public void thenDeboPoderVerLasTransaccionesRelacionadasALosMultiplesOpciones() {
        historialCuentaSteps.validarDatosOpcionesMultiples();
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @When("indique el criterio de busqueda producto")
    public void whenIndiqueElCriterioDeBusquedaProducto() {
        historialCuentaSteps.buscarCuentaProducto();
    }

    @Then("debo poder ver las transacciones relacionadas a la opcion indicada en el campo Producto")
    public void thenDeboPoderVerLasTransaccionesRelacionadasALaOpcionIndicadaEnElCampoProducto() {
        historialCuentaSteps.validarResultadoProducto();
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @When("se realiza la busqueda por <fecha> y solo se indique la opcion desde")
    @Manual
    public void whenSeRealizaLaBusquedaPorfechaYSoloSeIndiqueLaOpcionDesde(@Named("fecha") String fechaDesde) {}

    @Then("debo poder ver las transacciones en el rango de fechas seleccionado, teniendo en cuenta que la opcion hasta corresponde a la fecha actual.")
    @Manual
    public void thenDeboPoderVerLasTransaccionesEnElRangoDeFechasSeleccionadoTeniendoEnCuentaQueLaOpcionHastaCorrespondeALaFechaActual() {}

    @When("se realiza la busqueda por <fecha> y solo se indique la opcion hasta")
    @Manual
    public void whenSeRealizaLaBusquedaPorfechaYSoloSeIndiqueLaOpcionHasta(@Named("fecha") String fechaHasta) {}

    @Then("debo poder ver las transacciones en el rango de fechas seleccionado, teniendo en cuenta que la opcion desde corresponde a la fecha de inicio de la cuenta")
    @Manual
    public void thenDeboPoderVerLasTransaccionesEnElRangoDeFechasSeleccionadoTeniendoEnCuentaQueLaOpcionDesdeCorrespondeALaFechaDeInicioDeLaCuenta() {}

    @When("se realiza la busqueda por fecha ( <desde> - <hasta>)")
    @Manual
    public void whenSeRealizaLaBusquedaPorFechadesdehasta() {}

    @Then("debo poder ver las transacciones en el rango de fechas seleccionado.")
    @Manual
    public void thenDeboPoderVerLasTransaccionesEnElRangoDeFechasSeleccionado() {}

    @When("indique un <usuario> para realizar la busqueda")
    @Manual
    public void whenIndiqueUnusuarioParaRealizarLaBusqueda() {}

    @Then("debo poder ver las transacciones asociadas a ese usuario especifico, que estan relacionadas con la cuenta y las polizas asociadas a ella.")
    @Manual
    public void thenDeboPoderVerLasTransaccionesAsociadasAEseUsuarioEspecificoQueEstanRelacionadasConLaCuentaYLasPolizasAsociadasAElla() {}

    @When("seleccione  el  numero de la <poliza>")
    @Manual
    public void whenSeleccioneElNumeroDeLapoliza() {}

    @Then("debo poder ver el campo poliza habilitado como un vinculo para el detalle de la transaccion")
    @Manual
    public void thenDeboPoderVerElCampoPolizaHabilitadoComoUnVinculoParaElDetalleDeLaTransaccion() {}

    @When("seleccione  el  numero de la transaccion <numeroTransaccion> de la poliza")
    @Manual
    public void whenSeleccioneElNumeroDeLaTransaccionnumerotransaccionDeLaPoliza() {}

    @Then("debo poder ver el detalle de la transaccion")
    @Manual
    public void thenDeboPoderVerElDetalleDeLaTransaccion() {}

    @When("se realice una modificacion valorable a la <poliza> de la cuenta")
    @Manual
    public void whenSeRealiceUnaModificacionValorableALapolizaDeLaCuenta() {}

    @Then("poder ver el <valorOriginal> de la poliza antes de realizar el cambio")
    @Manual
    public void thenPoderVerElvalororiginalDeLaPolizaAntesDeRealizarElCambio() {}

    @Then("poder ver el <valorNuevo> de la poliza despues de realizar el cambio")
    @Manual
    public void thenPoderVerElvalornuevoDeLaPolizaDespuesDeRealizarElCambio() {}
}