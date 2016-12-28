package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.AgregarArticuloEdificiosyUbicacionesWidget;
import com.sura.guidewire.policycenter.pages.SolicitarRequisitoPaPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.contacto.BusquedaContactoPage;
import com.sura.guidewire.policycenter.pages.poliza.NuevaPolizaPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaMRCPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class SolicitarRequisitoPaSteps extends ScenarioSteps{

    private SolicitarRequisitoPaPage solicitarRequisitoPa;
    private BusquedaContactoPage busquedaContactoPage;
    private TarifaMRCPage tarifaMRCPage;
    private DetalleDeAseguradoDeCotizacionSteps detalleDeAseguradoDeCotizacionSteps;
    private AgregarArticuloEdificiosyUbicacionesWidget agregarArticuloEdificiosyUbicacionesWidget;
    private NuevaPolizaPage nuevaPolizaPage;
    private NuevaCotizacionPage nuevaCotizacionPage;

    @Step
    public void validar_Que_Se_Habilite_La_Opcion_Solicitar_Requisitos() {
        solicitarRequisitoPa.validarOpcionHabilitada();
    }

    @Step
    public void validar_Que_Se_Muestre_Mensaje_De_Advertencia(ExamplesTable mensaje){
        solicitarRequisitoPa.validarAdvertenciaRequisitos(mensaje);
    }

    @Step
    public void validar_Que_Existan_Requisitos_Pendientes() {
        solicitarRequisitoPa.validarRequisitos();
    }

    @Step
    public void clicEnElBotonRequisitos() {
        solicitarRequisitoPa.clicEnElBotonRequisitos();
    }

    @Step
    public void llenarInfoPoliza() {
        nuevaCotizacionPage.llenarInfoPoliza();
    }

    @Step
    public void validarElRequisito(ExamplesTable requisito) {
        solicitarRequisitoPa.validarElRequisito(requisito);
    }

    @Step
    public void validar_que_se_muestre_mensaje_de_bloqueo(ExamplesTable mensajeB) {
        solicitarRequisitoPa.validarMensajeBloqueante(mensajeB);
    }

    @Step
    public void ingresarArticuloYBeneficiario(ExamplesTable articuloConInteres) {
        Map<String, String> datosArticulo = articuloConInteres.getRows().get(0);
        tarifaMRCPage.irAArticulo();
        tarifaMRCPage.agregarContactoDelDirectorio();
        busquedaContactoPage.consultarContactoPorTipoDocumentoCotizacion(datosArticulo.get("tipoDocumento"), datosArticulo.get("numeroDocumento"));
        detalleDeAseguradoDeCotizacionSteps.seleccionarContactoDelDirectorio();
        agregarArticuloEdificiosyUbicacionesWidget.desplegarListaTipoBeneficiario();
        nuevaPolizaPage.seleccionarElementoDeLaLista(datosArticulo.get("beneficiario"));
        tarifaMRCPage.ingresarValorReconstruccion(articuloConInteres);
        tarifaMRCPage.seleccionarCobertura(articuloConInteres);
    }
}
