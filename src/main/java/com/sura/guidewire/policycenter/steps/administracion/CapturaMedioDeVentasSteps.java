package com.sura.guidewire.policycenter.steps.administracion;

import com.sura.guidewire.policycenter.pages.administracion.CapturaMedioDeVentasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class CapturaMedioDeVentasSteps extends ScenarioSteps {
    @Page
    CapturaMedioDeVentasPage capturaMedioDeVentasPage;

    @Step
    public void irAlMenuAdministracion() {
        capturaMedioDeVentasPage.irAlMenuAdminsitracion();
    }

    @Step
    public void irARedComercial() {
        capturaMedioDeVentasPage.irARedComercial();
    }

    @Step
    public void validarOpcionesRedComercial(ExamplesTable opciones) {
        Map<String, String> itemsRedComercial;
        String opcionesRedComercial = capturaMedioDeVentasPage.validarOpcionesRedComercial();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            itemsRedComercial = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene la opciones esperada", opcionesRedComercial, Matchers.containsString(itemsRedComercial.get("opciones")));
        }
    }

    @Step
    public void irACanales() {
        capturaMedioDeVentasPage.irACanales();
    }

    @Step
    public void irAMediosDeVenta() {
        capturaMedioDeVentasPage.irAMediosDeVenta();
    }

    @Step
    public void validarOpcionesMedioDeVenta(ExamplesTable opciones) {
        Map<String, String> opcionesMedioDeVenta;
        String listaOpcionesMedioDeVenta = capturaMedioDeVentasPage.validarOpcionesMediosDeVenta();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            opcionesMedioDeVenta = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesMedioDeVenta, Matchers.containsString(opcionesMedioDeVenta.get("opciones")));
        }
    }

    @Step
    public void irAOficinasPorCanal() {
        capturaMedioDeVentasPage.irAOficinasPorCanal();
    }

    @Step
    public void validarOpcionesOficina(ExamplesTable opciones) {
        Map<String, String> opcionesCanalOficina;
        String listaOpcionesCanal = capturaMedioDeVentasPage.validarOpcionesCanalOficina();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            opcionesCanalOficina = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesCanal, Matchers.containsString(opcionesCanalOficina.get("opciones")));
        }
    }

    @Step
    public void verificarPresenciaBotones() {
        capturaMedioDeVentasPage.verificarPresenciaBotones();
    }

    @Step
    public void validarOpcionesCanal(ExamplesTable opciones) {
        Map<String, String> opcionesCanal;
        String listaOpcionesCanal = capturaMedioDeVentasPage.validarOpcionesCanal();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            opcionesCanal = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesCanal, Matchers.containsString(opcionesCanal.get("opciones")));
        }
    }

    @Step
    public void crearNuevoCanal() {
        capturaMedioDeVentasPage.crearNuevoCanal();
    }

    @Step
    public void irAMediosDeVentaPorCanal() {
        capturaMedioDeVentasPage.irAMediosDeVentaPorCanal();
    }

    @Step
    public void buscarCanalComercial(String canalComercial) {
        capturaMedioDeVentasPage.buscarCanalComercial(canalComercial);
    }

    @Step
    public void buscarMedioDeVentaAsociado(ExamplesTable mediosDeVentaAsociados) {
        Map<String, String> mediosDeVentaPorCanal;
        String listaOpcionesCanal = capturaMedioDeVentasPage.validarMediosDeVentaAsociados();
        for (int i = 0; i < mediosDeVentaAsociados.getRowCount(); i++) {
            mediosDeVentaPorCanal = mediosDeVentaAsociados.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesCanal, Matchers.containsString(mediosDeVentaPorCanal.get("mediosDeVentaAsociados")));
        }
    }

    @Step
    public void irMenuMedioDeVentaPorCanalNuevo() {
        capturaMedioDeVentasPage.irMenuMedioDeVentaPorCanalNuevo();
    }

    @Step
    public void asociarMedioDeVentaACanal(String canalComercial, String medioDeVenta) {
        capturaMedioDeVentasPage.asociarMedioDeVentaAlCanal(canalComercial, medioDeVenta);
    }

    @Step
    public void verificarAdiccionMedioDeVentaACanal() {
        capturaMedioDeVentasPage.verificarAdiccionMedioDeVentaACanal();
    }
}
