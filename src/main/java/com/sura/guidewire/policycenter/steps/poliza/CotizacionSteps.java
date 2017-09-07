package com.sura.guidewire.policycenter.steps.poliza;


import com.sura.guidewire.policycenter.pages.poliza.CotizacionPage;

import java.io.Serializable;

import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionSteps extends ScenarioSteps implements Serializable {

    private static final long serialVersionUID = 1L;

    @Page
    private CotizacionPage cotizacionPage;


    public CotizacionPage getCotizacionPage() {
        return cotizacionPage;
    }

    public void validarCamposCotizacionPoliza(String estadouno, String estadodos, ExamplesTable menusesperados) {
        getCotizacionPage().validarCamposOpcionCotizacionDePoliza(estadouno, estadodos, menusesperados);
    }

    public void validar_campos_aseguradora_poliza() {
        getCotizacionPage().esCamposAseguradorasCoasegurosEditables();
    }
}
