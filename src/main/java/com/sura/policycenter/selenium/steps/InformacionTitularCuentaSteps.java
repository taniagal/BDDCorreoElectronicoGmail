package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InformacionTitularCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class InformacionTitularCuentaSteps extends ScenarioSteps {

    private InformacionTitularCuentaPage informacionTitularCuentaPage = new InformacionTitularCuentaPage(getDriver());


    public InformacionTitularCuentaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void seleccionarInformacionTitularCuenta() {
        informacionTitularCuentaPage.clickTipoDocumento();
        informacionTitularCuentaPage.seleccionarInformacionTitularCuenta();
    }

    @Step
    public void validarEncabezadosInformacionTitularCuenta (String informacionBasica,
                                                String metricas,
                                                String transacciones,
                                                String reclamaciones) {
        informacionTitularCuentaPage.validarEncabezadosInformacionTitularCuenta(informacionBasica, metricas, transacciones, reclamaciones);
    }

    @Step
    public void validarInformacionBasica (String titularCuenta, String tipoDocumento, String nroDocumento, String primaVigencia,
                                          String segmentacion, String comportamniento, String totalNoFacturado,
                                          String totalFacturado, String totalvencido, String totalPendiente) {
        informacionTitularCuentaPage.validarInformacionBasica(titularCuenta,tipoDocumento,nroDocumento,primaVigencia, segmentacion, comportamniento,
                totalNoFacturado, totalFacturado, totalvencido, totalPendiente);
    }

    @Step
    public void validarInformacionMetricas (String anioVigencia, String polizasActivas, String canceladoPorCliente,
                                            String canceladoPorCompania, String otrasCancelaciones, String primaVitalicia,
                                            String totalReclamacionesAbiertas, String totalNetoIncurrido){
        informacionTitularCuentaPage.validarInformacionMetricas(anioVigencia,polizasActivas,canceladoPorCliente,
               canceladoPorCompania, otrasCancelaciones, primaVitalicia, totalReclamacionesAbiertas, totalNetoIncurrido);
    }

    @Step
    public void validarInformacionTransacciones (String fechaCreacion, String nroPoliza, String producto,
                                                 String nroTransaccion, String tipo, String estado) {
        informacionTitularCuentaPage.validarInformacionTransacciones(fechaCreacion, nroPoliza, producto,
                nroTransaccion, tipo, estado);
    }

    @Step
    public void validarInformacionReclamaciones(String nroPoliza, String producto, String asegurado, String fechaPerdida,
                                              String nroReclamacion, String estado, String totalIncurrido) {
        informacionTitularCuentaPage.validarInformacionReclamaciones(nroPoliza, producto, asegurado,
                fechaPerdida, nroReclamacion, estado, totalIncurrido);
    }

    @Step
    public void validarNombreCompletoPersonaNatural (String nombreCompleto) {
        informacionTitularCuentaPage.validarNombreCompletoPersonaNatural(nombreCompleto);
    }

    @Step
    public void validarCamposComoNoEditables() {
        informacionTitularCuentaPage.validarCamposComoNoEditables();
    }

    @Step
    public void validarInformacionFallecimiento(String fechaFallecimiento, String causaFallecimiento){
        informacionTitularCuentaPage.validarInformacionFallecimiento(fechaFallecimiento, causaFallecimiento);
    }

    @Step
    public void validarCampoActividadEconomica(String actividadEconomica) {
        informacionTitularCuentaPage.validarCampoActividadEconomica(actividadEconomica);
    }
}
