package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.pages.cuenta.InformacionTitularCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class InformacionTitularCuentaSteps extends ScenarioSteps {

    private final InformacionTitularCuentaPage informacionTitularCuentaPage = new InformacionTitularCuentaPage(getDriver());

    public InformacionTitularCuentaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void seleccionarInformacionTitularCuenta() {
        informacionTitularCuentaPage.clickTipoDocumento();
        informacionTitularCuentaPage.seleccionarInformacionTitularCuenta();
    }

    @Step
    public void validarEncabezadosInformacionTitularCuenta(String informacionBasica,
                                                           String metricas,
                                                           String transacciones,
                                                           String siniestros) {
        informacionTitularCuentaPage.validarEncabezadosInformacionTitularCuenta(informacionBasica, metricas, transacciones, siniestros);
    }

    @Step
    public void validarInformacionBasica(ExamplesTable infoBasica) {
        informacionTitularCuentaPage.validarInformacionBasica(infoBasica);
    }

    @Step
    public void validarInformacionMetricas(String anioVigencia, String canceladoPorCliente,
                                           String canceladoPorCompania, String otrasCancelaciones, String primaVitalicia,
                                           String totalSiniestrosAbiertos, String totalNetoIncurrido) {
        informacionTitularCuentaPage.validarInformacionMetricas(anioVigencia, canceladoPorCliente,
                canceladoPorCompania, otrasCancelaciones, primaVitalicia, totalSiniestrosAbiertos, totalNetoIncurrido);
    }

    @Step
    public void validarInformacionTransacciones(String fechaCreacion, String nroPoliza, String producto,
                                                String nroTransaccion, String tipo, String estado) {
        informacionTitularCuentaPage.validarInformacionTransacciones(fechaCreacion, nroPoliza, producto,
                nroTransaccion, tipo, estado);
    }

    @Step
    public void validarInformacionSiniestros(String nroPoliza, String producto, String asegurado, String fechaPerdida,
                                             String numeroSiniestros, String estado, String totalIncurrido) {
        informacionTitularCuentaPage.validarInformacionSiniestros(nroPoliza, producto, asegurado,
                fechaPerdida, numeroSiniestros, estado, totalIncurrido);
    }

    @Step
    public void validarNombreCompletoPersonaNatural(String nombreCompleto) {
        informacionTitularCuentaPage.validarNombreCompletoPersonaNatural(nombreCompleto);
    }

    @Step
    public void validarCamposComoNoEditables() {
        informacionTitularCuentaPage.validarCamposComoNoEditables();
    }

    @Step
    public void validarCampoActividadEconomica(String actividadEconomica) {
        informacionTitularCuentaPage.validarCampoActividadEconomica(actividadEconomica);
    }
}
