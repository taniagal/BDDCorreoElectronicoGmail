package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InformacionTitularCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class InformacionTitularCuentaSteps extends ScenarioSteps {

    InformacionTitularCuentaPage informacionTitularCuentaPage = new InformacionTitularCuentaPage(getDriver());


    public InformacionTitularCuentaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void seleccionarInformacionTitularCuenta() {

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
                                          String segmentacion, String comportamniento, String actividadEconomica,
                                          String totalNoFacturado, String totalFacturado, String totalvencido, String totalPendiente) {
        informacionTitularCuentaPage.validarInformacionBasica(titularCuenta,tipoDocumento,nroDocumento,primaVigencia, segmentacion, comportamniento,
                actividadEconomica, totalNoFacturado, totalFacturado, totalvencido, totalPendiente);
    }
}
