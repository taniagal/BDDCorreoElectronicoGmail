package com.sura.policycenter.selenium.steps;

import com.sura.common.exception.SuraExceptionTechnical;
import com.sura.policycenter.selenium.pages.DisponibilidadDetalleProductoPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DisponibilidadDetalleProductoSteps extends ScenarioSteps {

    private final DisponibilidadDetalleProductoPage disponibilidadDetalleProductoPage = new DisponibilidadDetalleProductoPage(getDriver());

    public DisponibilidadDetalleProductoSteps(Pages pages){
        super(pages);
    }

    public void validarTipoCanalVentas(ExamplesTable tipoCanal) throws SuraExceptionTechnical {
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

    public void validarPATipoPoliza(ExamplesTable paTipoPoliza) throws SuraExceptionTechnical {
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
