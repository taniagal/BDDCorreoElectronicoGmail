package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CapturaMedioDeVentasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

/**
 * Created by tanigral on 15/02/2017.
 */
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

    public void validarOpcionesRedComercial(ExamplesTable opciones) {
        Map<String, String> itemsRedComercial;
        String opcionesRedComercial= capturaMedioDeVentasPage.validarOpcionesRedComercial();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            itemsRedComercial = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene la opciones esperada", opcionesRedComercial, Matchers.containsString(itemsRedComercial.get("opciones")));
        }
    }

    @Step
    public void irACanales() {
        capturaMedioDeVentasPage.irACanales();
    }

    public void irAMediosDeVenta() {
        capturaMedioDeVentasPage.irAMediosDeVenta();
    }

    public void validarOpcionesMedioDeVenta(ExamplesTable opciones) {
        Map<String, String> opcionesMedioDeVenta;
        String listaOpcionesMedioDeVenta= capturaMedioDeVentasPage.validarOpcionesMediosDeVenta();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            opcionesMedioDeVenta = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesMedioDeVenta, Matchers.containsString(opcionesMedioDeVenta.get("opciones")));
        }
    }

    public void irAOficinasPorCanal() {
        capturaMedioDeVentasPage.irAOficinasPorCanal();
    }

    public void validarOpcionesOficina(ExamplesTable opciones) {
        Map<String, String> opcionesCanalOficina;
        String listaOpcionesCanal= capturaMedioDeVentasPage.validarOpcionesCanalOficina();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            opcionesCanalOficina = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesCanal, Matchers.containsString(opcionesCanalOficina.get("opciones")));
        }
    }

    public void verificarPresenciaBotones() {
        capturaMedioDeVentasPage.verificarPresenciaBotones();
    }

    public void validarOpcionesCanal(ExamplesTable opciones) {
        Map<String, String> opcionesCanal;
        String listaOpcionesCanal= capturaMedioDeVentasPage.validarOpcionesCanal();
        for (int i = 0; i < opciones.getRowCount(); i++) {
            opcionesCanal = opciones.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesCanal, Matchers.containsString(opcionesCanal.get("opciones")));
        }
    }

    public void crearNuevoCanal() {
        capturaMedioDeVentasPage.crearNuevoCanal();
    }

    public void irAMediosDeVentaPorCanal() {
        capturaMedioDeVentasPage.irAMediosDeVentaPorCanal();
    }

    public void buscarCanalComercial(String canalComercial) {
        capturaMedioDeVentasPage.buscarCanalComercial(canalComercial);
    }

    public void buscarMedioDeVentaAsociado(ExamplesTable mediosDeVentaAsociados) {
        Map<String, String> mediosDeVentaPorCanal;
        String listaOpcionesCanal= capturaMedioDeVentasPage.validarMediosDeVentaAsociados();
        for (int i = 0; i < mediosDeVentaAsociados.getRowCount(); i++) {
            mediosDeVentaPorCanal = mediosDeVentaAsociados.getRows().get(i);
            MatcherAssert.assertThat("La lista no contiene el item esperado", listaOpcionesCanal, Matchers.containsString(mediosDeVentaPorCanal.get("mediosDeVentaAsociados")));
        }
    }

    public void irMenuMedioDeVentaPorCanalNuevo() {
        capturaMedioDeVentasPage.irMenuMedioDeVentaPorCanalNuevo();
    }

    public void asociarMedioDeVentaACanal(String canalComercial, String medioDeVenta) {
        capturaMedioDeVentasPage.asociarMedioDeVentaAlCanal(canalComercial,medioDeVenta);
    }

    public void verificarAdiccionMedioDeVentaACanal() {
        capturaMedioDeVentasPage.verificarAdiccionMedioDeVentaACanal();
    }
}
