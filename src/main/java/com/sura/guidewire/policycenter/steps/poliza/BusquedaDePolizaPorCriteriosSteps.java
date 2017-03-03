package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.BusquedaDePolizaPage;
import com.sura.guidewire.policycenter.pages.poliza.BusquedaDePolizaPorCriteriosPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDePolizaPorCriteriosSteps {

    @Page
    public BusquedaDePolizaPorCriteriosPage busquedaDePolizaPorCriteriosPage;
    @Page
    private BusquedaDePolizaPage busquedaPolizaPage;


    @Step
    public void seleccionDeProducto(String criterio) {
        busquedaDePolizaPorCriteriosPage.seleccionarProducto(criterio);
    }

    @Step
    public void ingresarPlacaAuto(String placa) {
        busquedaDePolizaPorCriteriosPage.ingresarPlacaAuto(placa);
    }

    @Step
    public void limpiarCampos() {
        busquedaPolizaPage.limpiarCampos();
    }

    @Step
    public void clickBuscarPoliza() {
        busquedaPolizaPage.clicEnBotonBuscar();
    }

    @Step
    public void verificarInformacionPoliza(ExamplesTable verificar) {
        busquedaDePolizaPorCriteriosPage.buscarPorResultados(verificar);
    }

    @Step
    public void seleccionarTipoDocumento(String tipoDocumento) {
        busquedaDePolizaPorCriteriosPage.seleccionarTipoDocumento(tipoDocumento);
    }

    @Step
    public void ingresarIdentificacion(String identificacion) {
        busquedaDePolizaPorCriteriosPage.ingresarIdentificacion(identificacion);
    }

    @Step
    public void seleccionarCriteriosBusqueda(String criterioBusqueda) {
        busquedaDePolizaPorCriteriosPage.seleccionarCriteriosBusqueda(criterioBusqueda);
    }

    @Step
    public void diligenciarCampoCriterioBusqueda(String contenido) {
        busquedaDePolizaPorCriteriosPage.diligenciarCampoCriterioBusqueda(contenido);
    }

}
