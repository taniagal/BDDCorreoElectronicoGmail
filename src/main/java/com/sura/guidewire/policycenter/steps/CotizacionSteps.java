package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.pages.CotizacionPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.io.Serializable;

public class CotizacionSteps extends ScenarioSteps implements Serializable {

    private static final long serialVersionUID = 1L;

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
