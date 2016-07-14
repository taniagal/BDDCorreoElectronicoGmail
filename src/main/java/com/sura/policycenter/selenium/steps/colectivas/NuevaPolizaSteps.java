package com.sura.policycenter.selenium.steps.colectivas;

import com.sura.policycenter.selenium.pages.colectivas.NuevaPolizaPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class NuevaPolizaSteps extends ScenarioSteps{

    private NuevaPolizaPage nuevaPolizaPage;

    public void desplegarListaDeOrganizaciones() {
        nuevaPolizaPage.desplegarListaDeOrganizaciones();
    }

    public void validarListaDeOrganizaciones(ExamplesTable listaOrganizaciones) {
        nuevaPolizaPage.validarListaDeOrganizaciones(listaOrganizaciones);
    }

    public void seleccionarOrganizacion(String organizacion) {
        nuevaPolizaPage.seleccionarOrganizacion(organizacion);
    }

    public void seleccionarCanal() {
        nuevaPolizaPage.seleccionarCanal();
    }

    public void validaListaCanalDeAcuerdoALaOrganizacion(String datosListaCanal) {
        nuevaPolizaPage.validaListaCanalDeAcuerdoALaOrganizacion(datosListaCanal);
    }
}
