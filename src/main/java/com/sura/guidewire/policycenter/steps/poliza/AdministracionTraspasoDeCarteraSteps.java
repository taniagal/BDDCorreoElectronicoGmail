package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.AdministracionTraspasoDeCarteraPage;
import com.sura.guidewire.policycenter.pages.poliza.BuscarAgentePage;
import com.sura.guidewire.policycenter.pages.poliza.BusquedaDePolizaPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

public class AdministracionTraspasoDeCarteraSteps extends ScenarioSteps {
    @Page
    AdministracionTraspasoDeCarteraPage administracionTraspasoDeCartera;
    @Page
    BusquedaDePolizaPage busquedaDePoliza;
    @Page
    BuscarAgentePage buscarAgente;

    @Step
    public void traspasarCarteraDeAsesorAAsesor(String oldProduceCode, String newProduceCode) {
        administracionTraspasoDeCartera.clicBotonCrearNuevoProceso();
        administracionTraspasoDeCartera.seleccionarFuenteDelTraspaso("Asesor");
        administracionTraspasoDeCartera.clicBuscarOldProducerCode();
        buscarAgente.buscarAgentePorCodigo(oldProduceCode);
        administracionTraspasoDeCartera.esperarPantalla();
        administracionTraspasoDeCartera.clicBuscarNewProducerCode();
        buscarAgente.buscarAgentePorCodigo(newProduceCode);
        administracionTraspasoDeCartera.esperarPantalla();
        administracionTraspasoDeCartera.clicBotonSubmitBatch();
    }

    @Step
    public void traspasarCarteraDeOficionaAOficiona(String oldOficna, String newOficna) {
        administracionTraspasoDeCartera.clicBotonCrearNuevoProceso();
        administracionTraspasoDeCartera.seleccionarFuenteDelTraspaso("Oficina");
        administracionTraspasoDeCartera.seleccionarAnteriorOficinaDeRadicacion(oldOficna);
        administracionTraspasoDeCartera.seleccionarNuevaOficinaDeRadicacion(newOficna);
        administracionTraspasoDeCartera.clicBotonSubmitBatch();
    }

    @Step
    public void traspasarCarteraEnPoliza(String numeroCuenta, String newProduceCode) {
        administracionTraspasoDeCartera.clicBotonCrearNuevoProceso();
        administracionTraspasoDeCartera.seleccionarFuenteDelTraspaso("Por poliza");
        administracionTraspasoDeCartera.clicBuscarNumeroPoliza();
        busquedaDePoliza.buscarPolizaPorNumeroDeCuenta(numeroCuenta);
        busquedaDePoliza.seleccionarNumeroPolizaEcontrada();
        administracionTraspasoDeCartera.esperarPantalla();
        administracionTraspasoDeCartera.modificarCodigoAsesor(newProduceCode);
    }

    @Step
    public String consultarCodigoAsesorActual() {
        return administracionTraspasoDeCartera.consultarCodigoAsesorActual();
    }

    @Step
    public void agregarDiaReloj() {
        administracionTraspasoDeCartera.agregarDiaReloj();
    }

    @Step
    public void ejecutarProceso(String nombreProceso) {
        administracionTraspasoDeCartera.ejecutarProceso(nombreProceso);
    }
}
