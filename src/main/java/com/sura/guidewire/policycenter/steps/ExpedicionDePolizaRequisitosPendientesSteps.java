package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.ExpedicionDePolizaRequisitosPendientesPage;
import com.sura.guidewire.policycenter.pages.GuidewireLoginPages;
import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaTasaUnicaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;


public class ExpedicionDePolizaRequisitosPendientesSteps extends ScenarioSteps {
    public Object verRequisitos;

    public ExpedicionDePolizaRequisitosPendientesSteps(Pages pages) {
        super(pages);
    }

    ExpedicionDePolizaRequisitosPendientesPage expedicionDePolizaRequisitosPendientesPage;
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());
    GuidewireLoginPages login = new GuidewireLoginPages();
    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());
    TarifaTasaUnicaPage tasaUnicaPage = new TarifaTasaUnicaPage(getDriver());
    NuevaCotizacionPage nuevaCotizacionPage = new NuevaCotizacionPage(getDriver());

    int token = 1;

    public void ingresarValorAccesorios(String accesorios) {
        expedicionDePolizaRequisitosPendientesPage.valorAccesorios(accesorios);
    }

    public void verMensaje(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesPage.verMensajeBloqueante(mensaje);
    }

    public void verRequisitosPendientes() {
        expedicionDePolizaRequisitosPendientesPage.clickRequisitosPendientes();
    }

    @Step
    public void logearse_a_policycenter_como_su(String usuario, String contrasenia, String pais) {
        if (login.elemento(GuidewireLoginPages.TXT_USUARIO_SEUS) == null && login.elemento(GuidewireLoginPages.TXT_CONTRASENIA_SEUS) == null) {
            login.enter("su").into(login.elemento(GuidewireLoginPages.TXT_USUARIO));
            login.enter("gw").into(login.elemento(GuidewireLoginPages.TXT_CONTRASENIA));
            login.elemento(GuidewireLoginPages.BTN_LOGIN).click();
        } else {
            login.enter(usuario).into(login.elemento(GuidewireLoginPages.TXT_USUARIO_SEUS));
            login.enter(contrasenia).into(login.elemento(GuidewireLoginPages.TXT_CONTRASENIA_SEUS));
        }
        if (login.elemento(GuidewireLoginPages.CBO_PAIS) != null) {
            login.elemento(GuidewireLoginPages.CBO_PAIS).selectByVisibleText(pais);
            login.elemento(GuidewireLoginPages.BTN_LOGIN_SEUS).click();
        }
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

    public void seleccionarVehiculoImportado() {
        expedicionDePolizaRequisitosPendientesPage.vehiculoImportadoTerceros();
    }

    public void clickEnInteresAdicional() {
        expedicionDePolizaRequisitosPendientesPage.ingresarBeneficiarioOneroso();
    }

    public void clickVehiculos() {
        expedicionDePolizaRequisitosPendientesPage.clickVehiculosModificacion();
    }

    public void agregarAccesoriosModificacion(String accesorios) {
        expedicionDePolizaRequisitosPendientesPage.agregarAccesorios(accesorios);
    }

    public void clickOpcionCotizar() {
        expedicionDePolizaRequisitosPendientesPage.cotizarModificacionPoliza();
    }

    public void ingresarCiudadModificacionPoliza(String ciudad) {
        expedicionDePolizaRequisitosPendientesPage.ingresarCiudadModificacion(ciudad);

    }

    public void clickVehiculoCeroKilometros() {
        expedicionDePolizaRequisitosPendientesPage.clickVehiculoCeroKilometros();
    }

    public void validarBotonCotizacion() {
        expedicionDePolizaRequisitosPendientesPage.valirdarPresenciaCotizar();
    }

    public void clickArchivoDePoliza() {
        expedicionDePolizaRequisitosPendientesPage.clickArchivoDePoliza();
    }

    public void deseleccionarVehiculoCeroKilometros() {
        expedicionDePolizaRequisitosPendientesPage.seleccionarOpcionCeroKilometros();
    }

    public void irAVehiculos() {
        expedicionDePolizaRequisitosPendientesPage.irAVehiculos();
    }

    public void verMensajeOpcional(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesPage.verMensajeOpcional(mensaje);
    }

    public void cotizarPoliza() {
        expedicionDePolizaRequisitosPendientesPage.cotizarPoliza();
    }

    public void datosVehiculo(ExamplesTable datos) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        expedicionDePolizaRequisitosPendientesPage.agregarVehiculo(datos);
    }

    public void cambiarValorAccesorios() {
        expedicionDePolizaRequisitosPendientesPage.cambiarValorAccesorios();
    }

    public void verMensajeBloqueante(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesPage.verMensajeBloqueanteModificacion(mensaje);
    }

    public void clickEnInteresAdicionalModificacion(String beneficiario) {
        expedicionDePolizaRequisitosPendientesPage.beneficiarioOnerosoModificacion(beneficiario);
    }

    public void cancelarPoliza() {
        expedicionDePolizaRequisitosPendientesPage.cancelarPoliza();
    }

    public void verMensajecancelacion(ExamplesTable mensaje) {
        expedicionDePolizaRequisitosPendientesPage.verMensajeCancelacion(mensaje);
    }

    public void agregarCiudadCirculacion(String ciudad) {
        expedicionDePolizaRequisitosPendientesPage.agregarCiudadCirculacion(ciudad);
    }

    public void ingresarCoberturasModificacion(String deducible, String perdida_llaves) {
        expedicionDePolizaRequisitosPendientesPage.ingresarCoberturas(deducible, perdida_llaves);
    }
}
