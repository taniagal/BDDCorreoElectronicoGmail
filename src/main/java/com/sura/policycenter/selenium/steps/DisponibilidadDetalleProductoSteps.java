package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.DisponibilidadDetalleProductoPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DisponibilidadDetalleProductoSteps extends ScenarioSteps {

    DisponibilidadDetalleProductoPage disponibilidadDetalleProductoPage;

    public void validarTipoCanalVentas(ExamplesTable tipoCanal) throws Exception {
        disponibilidadDetalleProductoPage.validarTipoCanalVentas(tipoCanal);
    }

    public void accionarNuevoEnvio() {
        disponibilidadDetalleProductoPage.accionarNuevoEnvio();
    }

    public void verInformacionPoliza() {
        disponibilidadDetalleProductoPage.verInformacionDePoliza();
    }

    public void seleccionarOrganizacionDeVentas(String organizacion) {
        disponibilidadDetalleProductoPage.seleccionarOrganizacionDeVentas(organizacion);
    }

    public void seleccionarTipoCanalDeVentas(String tipoCanal) {
        disponibilidadDetalleProductoPage.seleccionarTipoCanalDeVentas(tipoCanal);
    }

    public void validarPATipoPoliza(ExamplesTable paTipoPoliza) throws Exception {
        disponibilidadDetalleProductoPage.validarPATipoPoliza(paTipoPoliza);
    }

    public void seleccionarPATipoPoliza(String tipoPoliza) {
        disponibilidadDetalleProductoPage.seleccionarPATipoPoliza(tipoPoliza);
    }

    public void validarActualizacionDeListaTipoCanal() {
        disponibilidadDetalleProductoPage.validarActualizacionDeListaTipoCanal();
    }

    public void validarActualizacionDeListaPATipoPoliza() {
        disponibilidadDetalleProductoPage.validarActualizacionDeListaPATipoPoliza();
    }

}
