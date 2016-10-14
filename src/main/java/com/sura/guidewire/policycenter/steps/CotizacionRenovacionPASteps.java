package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.renovacion.CotizacionRenovacionPAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionRenovacionPASteps extends ScenarioSteps {

    private final CotizacionRenovacionPAPage cotizacionRenovacionPAPage = new CotizacionRenovacionPAPage(getDriver());

    public CotizacionRenovacionPASteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ver_Detalle_De_Cotizacion() {
        cotizacionRenovacionPAPage.verDetalleCotizacion();
    }

    @Step
    public void validar_Detalle_De_Cotizacion(ExamplesTable detalleCotizacion) {
        cotizacionRenovacionPAPage.validarDetalleCotizacion(detalleCotizacion);
    }

    @Step
    public void validar_Detalle_Por_Cobertura(ExamplesTable detalleCobertura) {
        cotizacionRenovacionPAPage.validarDetallePorCobertura(detalleCobertura);
    }

    @Step
    public void validar_Direccion_Del_Tomador(ExamplesTable direccion) {
        cotizacionRenovacionPAPage.validarDireccionTomador(direccion);
    }

    @Step
    public void validar_Valor_Termino_De_La_Cobertura(ExamplesTable valorTermino) {
        cotizacionRenovacionPAPage.validarValorTermino(valorTermino);
    }

    @Step
    public void validar_Informacion_General_De_Renovacion(ExamplesTable informacionGeneral) {
        cotizacionRenovacionPAPage.validarInformacionGeneralRenovacion(informacionGeneral);
    }
}
