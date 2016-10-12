package com.sura.policycenter.selenium.steps.colectivas;

import com.sura.policycenter.selenium.pages.colectivas.BusquedaDeRiesgosPolizaColectivaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDeRiesgosPolizaColectivaSteps extends ScenarioSteps {

    BusquedaDeRiesgosPolizaColectivaPage busquedaDeRiesgosPolizaColectivaPage;

    @Step
    public void busca_por_numero_de_poliza_colectiva(String polizaColectiva) {
        busquedaDeRiesgosPolizaColectivaPage.buscaPolizaColectivaEnTabla(polizaColectiva);
    }

    @Step
    public void clic_en_riesgos() {
        busquedaDeRiesgosPolizaColectivaPage.clicRiesgos();
    }


    @Step
    public void ingresar_la_placa(String placa) {
        busquedaDeRiesgosPolizaColectivaPage.ingresePlaca(placa);
    }

    @Step
    public void valida_resultado_de_riesgos(ExamplesTable infoRiesgo) {
       busquedaDeRiesgosPolizaColectivaPage.validaResultadoRiesgos(infoRiesgo);
    }

    @Step
    public void valida_mensaje_en_pantalla(String mensaje) {
        busquedaDeRiesgosPolizaColectivaPage.ValidaMensaje(mensaje);
    }

    @Step
    public void clic_en_listar_riesgos() {
        busquedaDeRiesgosPolizaColectivaPage.listarRiesgos();
    }

    public void valida_listado_de_registros() {
        busquedaDeRiesgosPolizaColectivaPage.validaBotonListarRiesgos();
    }
}
