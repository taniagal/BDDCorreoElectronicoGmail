package com.sura.gw.policy.poliza.steps;

import com.sura.gw.navegacion.steps.GuidewireSteps;
import com.sura.gw.navegacion.util.widget.EspacioDeTrabajoWidget;
import com.sura.gw.policy.poliza.pages.AccionesWidget;
import com.sura.gw.policy.poliza.pages.PolizaPage;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.List;


public class PolizaSteps extends GuidewireSteps {

    private PolizaPage polizaPage;
    private static EspacioDeTrabajoWidget espacioDeTrabajoWidget;
    private static AccionesWidget accionesWidget;
    @Steps private static BotonAccionesSteps botonAccionesSteps;


    @Step
    public void seleccionar_opcion_edificios_y_ubicaciones() {
        polizaPage.seleccionarOpcionEdificiosyUbicaciones();
    }

    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return polizaPage.obtenerEnvio().contains("Envío ".concat(numeroSubscripcion));
    }

    @Step
    public void seleccionar_boton_llamado_editar_transaccion_de_poliza() {
        polizaPage.editarTransaccion();
    }

    @Step
    public BotonAccionesSteps seleccionar_boton_acciones() {
        String xpathLinkAcciones = "//span[contains(@id,'PolicyFile:PolicyFileMenuActions-btnInnerEl')]";
        getDriver().findElement(By.xpath(xpathLinkAcciones)).click();
        return botonAccionesSteps;
    }

    @Step
    public void seleccionar_opcion_cambiar_poliza() {
        accionesWidget.seleccionarOpcionCambioDePoliza();
    }

    public List<String> espacioDeTrabajo() {
        espacioDeTrabajoWidget.desplegarEspacioDeTrabajo();
        return espacioDeTrabajoWidget.obtenerMensajesDeTrabajo();
    }

    public Boolean elementoEsEditable(String elemento) {
        return polizaPage.esEditableElemento(elemento);
    }

    @Step
    public void seleccionar_opcion_informacion_de_poliza() {
        polizaPage.seleccionarOpcionInformacionDeLaPoliza();
    }

    public void seleccionarBotonSiguienteParaIniciarCambioEnPoliza() {
        polizaPage.seleccionarBotonSiguienteEnInicioDeCambioDePoliza();
    }

    @Step
    public void ingresar_motivos_cancelacion(String motivo, String descripcion) {
        polizaPage.ingresarMotivosCancelacion(motivo, descripcion);
    }

    @Step
    public void iniciar_cancelacion_de_poliza() {
        String xpathBttonCancelacion = "//a[contains(.,'Iniciar cancelación')]";
        getDriver().findElement(By.xpath(xpathBttonCancelacion)).click();
    }
    @Step
    public void seleccionar_opcion_compromiso() {
        waitFor(2).seconds();
        String xpathBttonCompromiso = "//a[contains(.,'Opciones de compromiso')]";
        getDriver().findElement(By.xpath(xpathBttonCompromiso)).click();
    }

    @Step
    public void seleccionar_opcion_cancelar_ahora() {
        waitFor(1).second();
        String xpathBttonCancelarAhora = "//a[contains(.,'Cancelar ahora')]";
        getDriver().findElement(By.xpath(xpathBttonCancelarAhora)).click();
    }
    @Step
    public void confirmar_cancelacion(){
        waitFor(5).seconds();
        String xpathBttonConfirmarCancelacion = ".//a[contains(@class, 'x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon') and contains(., 'Aceptar')]";
        getDriver().findElement(By.xpath(xpathBttonConfirmarCancelacion)).click();
    }

    public String obtenerTituloPagina(){
       return getDriver().findElement(By.xpath("//span[@id='JobComplete:JobCompleteScreen:ttlBar']")).getText();

    }
    @Step
    public String validar_mensaje(){
        return getDriver().findElement(By.xpath(".//*[@id='StartCancellation:StartCancellationScreen:WarningMessageCancellation']")).getText();
    }


    @Step
    public void desplegar_lista_motivos_cancelacion() {
          polizaPage.desplegarMotivosCancelacion();
    }

    public PolizaPage obtenerPolizaPage(){
        return this.polizaPage;
    }

    @Step
    public Boolean es_fecha_cancelacion_nHOY() {
        return obtenerPolizaPage().esFechaCancelacionHOY();
    }

    public void ingresarFechaAnteriorA61Dias(){
        obtenerPolizaPage().ingresarFechaAnteriorA61Dias(obtenerPolizaPage().obtenerFechacancelacionElemento());
    }
    @Step
    public void validar_opcion_cancelar_transaccion(){
        String XpathBtnCancelarTransaccion = ".//a[contains(.,'Cancelar transacción')]";
        obtenerPolizaPage().validarBotones(XpathBtnCancelarTransaccion);
    }


}
