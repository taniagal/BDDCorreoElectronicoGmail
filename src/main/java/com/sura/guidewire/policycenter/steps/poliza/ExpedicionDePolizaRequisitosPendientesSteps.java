package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.poliza.ExpedicionDePolizaRequisitosPendientesPage;
import com.sura.guidewire.policycenter.pages.poliza.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionDePolizaRequisitosPendientesSteps extends ScenarioSteps {

    @Page
    ExpedicionDePolizaRequisitosPendientesPage expedicionDePolizaRequisitosPendientesPage;
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());
    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());
    NuevaCotizacionPage nuevaCotizacionPage = new NuevaCotizacionPage(getDriver());
    int token = 1;

    public ExpedicionDePolizaRequisitosPendientesSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresarValorAccesorios(String accesorios) {
        expedicionDePolizaRequisitosPendientesPage.valorAccesorios(accesorios);
    }

    @Step
    public void verMensaje(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesPage.verMensajeBloqueante(mensaje);
    }

    @Step
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        if (token == 1) {
            nuevaCotizacionPage.llenarInfoPoliza();
            vehiculoPage.irAVehiculos();
            expedicionDePolizaRequisitosPendientesPage.clickAgregarVehiculo();
            vehiculoPage.agregarVehiculo(datosVehiculo);
            expedicionDePolizaRequisitosPendientesPage.relacionarAsegurado();
        }
    }

    @Step
    public void seleccionarVehiculoImportado() {
        expedicionDePolizaRequisitosPendientesPage.vehiculoImportadoTerceros();
    }

    @Step
    public void clickEnInteresAdicional() {
        expedicionDePolizaRequisitosPendientesPage.ingresarBeneficiarioOneroso();
    }

    @Step
    public void clickVehiculos() {
        expedicionDePolizaRequisitosPendientesPage.clickVehiculosModificacion();
    }

    @Step
    public void agregarAccesoriosModificacion(String accesorios) {
        expedicionDePolizaRequisitosPendientesPage.agregarAccesorios(accesorios);
    }

    @Step
    public void clickOpcionCotizar() {
        expedicionDePolizaRequisitosPendientesPage.cotizarModificacionPoliza();
    }

    @Step
    public void ingresarCiudadModificacionPoliza(String ciudad) {
        expedicionDePolizaRequisitosPendientesPage.agregarCiudadCirculacion(ciudad);
    }

    @Step
    public void clickVehiculoCeroKilometros() {
        expedicionDePolizaRequisitosPendientesPage.clickVehiculoCeroKilometros();
    }

    @Step
    public void clickArchivoDePoliza() {
        expedicionDePolizaRequisitosPendientesPage.clickArchivoDePoliza();
    }

    @Step
    public void deseleccionarVehiculoCeroKilometros() {
        expedicionDePolizaRequisitosPendientesPage.seleccionarOpcionCeroKilometros();
    }

    @Step
    public void irAVehiculos() {
        expedicionDePolizaRequisitosPendientesPage.irAVehiculos();
    }

    @Step
    public void verMensajeOpcional(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesPage.verMensajeOpcional(mensaje);
    }

    @Step
    public void cotizarPoliza() {
        expedicionDePolizaRequisitosPendientesPage.cotizarPoliza();
    }

    @Step
    public void cambiarValorAccesorios() {
        expedicionDePolizaRequisitosPendientesPage.cambiarValorAccesorios();
    }

    @Step
    public void verMensajeBloqueante(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesPage.verMensajeBloqueanteModificacion(mensaje);
    }

    @Step
    public void clickEnInteresAdicionalModificacion(String beneficiario) {
        expedicionDePolizaRequisitosPendientesPage.beneficiarioOnerosoModificacion(beneficiario);
    }

    @Step
    public void cancelarPoliza() {
        expedicionDePolizaRequisitosPendientesPage.cancelarPoliza();
    }

    @Step
    public void verMensajecancelacion(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesPage.verMensajeCancelacion(mensaje);
    }

    @Step
    public void agregarCiudadCirculacion(String ciudad, String medioVenta) {
        expedicionDePolizaRequisitosPendientesPage.agregarCiudadCirculacion(ciudad);
        expedicionDePolizaRequisitosPendientesPage.seleccionarMedioDeVenta(medioVenta);
    }

    @Step
    public void ingresarCoberturasModificacion(String deducible, String perdidaLlaves, String perdidaParcialReemplazo, String perdidaTotalReemplazo, String asistencia) {
        expedicionDePolizaRequisitosPendientesPage.ingresarCoberturas(deducible, perdidaLlaves, perdidaParcialReemplazo, perdidaTotalReemplazo, asistencia);
    }
    @Step
    public void seleccionarTipoServicio(String usoVehiculo) {
    expedicionDePolizaRequisitosPendientesPage.agregarUsoVehiculo(usoVehiculo);
    }
    @Step
    public void expedirCambioPoliza() {
        expedicionDePolizaRequisitosPendientesPage.expedirCambioPoliza();
    }
}
