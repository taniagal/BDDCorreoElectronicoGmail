package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.BusquedaDePolizaPage;
import com.sura.guidewire.policycenter.pages.poliza.AdministracionTraspasoDeCarteraPage;
import com.sura.guidewire.policycenter.pages.poliza.BuscarAgentePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AdministracionTraspasoDeCarteraSteps extends ScenarioSteps {

    AdministracionTraspasoDeCarteraPage administracionTraspasoDeCarteraPage;
    BusquedaDePolizaPage busquedaDePolizaPage;
    BuscarAgentePage buscarAgentePage;

    @Step
    public void traspasarCarteraDeAsesorAAsesor(String oldProduceCode, String newProduceCode) {
        administracionTraspasoDeCarteraPage.clicBotonCrearNuevoProceso();
        administracionTraspasoDeCarteraPage.seleccionarFuenteDelTraspaso("Asesor");
        administracionTraspasoDeCarteraPage.clicBuscarOldProducerCode();
        buscarAgentePage.buscarAgentePorCodigo(oldProduceCode);
        administracionTraspasoDeCarteraPage.esperarPantalla();
        administracionTraspasoDeCarteraPage.clicBuscarNewProducerCode();
        buscarAgentePage.buscarAgentePorCodigo(newProduceCode);
        administracionTraspasoDeCarteraPage.esperarPantalla();
        administracionTraspasoDeCarteraPage.clicBotonSubmitBatch();
    }

    @Step
    public void traspasarCarteraDeOficionaAOficiona(String oldOficna, String newOficna) {
        administracionTraspasoDeCarteraPage.clicBotonCrearNuevoProceso();
        administracionTraspasoDeCarteraPage.seleccionarFuenteDelTraspaso("Oficina");
        administracionTraspasoDeCarteraPage.seleccionarAnteriorOficinaDeRadicacion(oldOficna);
        administracionTraspasoDeCarteraPage.seleccionarNuevaOficinaDeRadicacion(newOficna);
        administracionTraspasoDeCarteraPage.clicBotonSubmitBatch();
    }

    @Step
    public void traspasarCarteraEnPoliza(String numeroCuenta, String newProduceCode) {
        administracionTraspasoDeCarteraPage.clicBotonCrearNuevoProceso();
        administracionTraspasoDeCarteraPage.seleccionarFuenteDelTraspaso("Por poliza");
        administracionTraspasoDeCarteraPage.clicBuscarNumeroPoliza();
        busquedaDePolizaPage.buscarPolizaPorNumeroDeCuenta(numeroCuenta);
        busquedaDePolizaPage.seleccionarNumeroPolizaEcontrada();
        administracionTraspasoDeCarteraPage.esperarPantalla();
        administracionTraspasoDeCarteraPage.modificarCodigoAsesor(newProduceCode);
    }

    @Step
    public String consultarCodigoAsesorActual() {
        return administracionTraspasoDeCarteraPage.consultarCodigoAsesorActual();
    }

    @Step
    public void agregarDiaReloj() {
        administracionTraspasoDeCarteraPage.agregarDiaReloj();
    }

    @Step
    public void ejecutarProceso(String nombreProceso) {
        administracionTraspasoDeCarteraPage.ejecutarProceso(nombreProceso);
    }
}
