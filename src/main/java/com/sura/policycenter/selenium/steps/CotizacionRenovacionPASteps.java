package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.renovacion.CotizacionRenovacionPAPage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionRenovacionPASteps extends ScenarioSteps {

    private final CotizacionRenovacionPAPage cotizacionRenovacionPAPage = new CotizacionRenovacionPAPage(getDriver());

    public CotizacionRenovacionPASteps(Pages pages) {
        super(pages);
    }

    public void validar_Detalle_De_Cotizacion(ExamplesTable detalleCotizacion) {
        cotizacionRenovacionPAPage.validarDetalleCotizacion(detalleCotizacion);
    }

    public void validar_Detalle_Por_Cobertura(ExamplesTable detalleCobertura) {
        cotizacionRenovacionPAPage.validarDetallePorCobertura(detalleCobertura);
    }
}
