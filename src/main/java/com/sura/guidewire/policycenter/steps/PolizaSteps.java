package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.AccionesWidget;
import com.sura.guidewire.policycenter.pages.InstruccionesPreviasARenovacionPage;
import com.sura.guidewire.policycenter.pages.PolizaPage;
import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireSteps;
import com.sura.guidewire.policycenter.utils.navegacion.util.widget.EspacioDeTrabajoWidget;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.util.List;


public class PolizaSteps extends GuidewireSteps {

    @Page
    private PolizaPage polizaPage;
    private static EspacioDeTrabajoWidget espacioDeTrabajoWidget;
    private static AccionesWidget accionesWidget;
    private InstruccionesPreviasARenovacionPage instruccionesPreviasARenovacionPage;
    private static final int CONSTANTE_3 = 3;
    private static final int CONSTANTE_2 = 2;

    @Steps
    private static BotonAccionesSteps botonAccionesSteps;


    @Step
    public void seleccionarOpcionEdificiosYUbicaciones() {
        polizaPage.seleccionarOpcionEdificiosyUbicaciones();
    }

    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return polizaPage.obtenerEnvio(numeroSubscripcion).contains("Envío ".concat(numeroSubscripcion));
    }

    @Step
    public void seleccionarBotonLlamadoEditarTransaccionDePoliza() {
        polizaPage.editarTransaccion();
    }

    @Step
    public BotonAccionesSteps seleccionarBotonAcciones() {
        polizaPage.seleccionarBotonAcciones();
        return botonAccionesSteps;
    }

    @Step
    public void seleccionarOpcionCambiarPoliza() {
        accionesWidget.seleccionarOpcionCambioDePoliza();
    }

    public void seleccionarOpcionRenovarPoliza() {
        accionesWidget.seleccionarOpcionRenovarPoliza();
    }

    public List<String> espacioDeTrabajo() {
        espacioDeTrabajoWidget.desplegarEspacioDeTrabajo();
        return espacioDeTrabajoWidget.obtenerMensajesDeTrabajo();
    }

    public Boolean elementoEsEditable(String elemento) {
        return polizaPage.esEditableElemento(elemento);
    }

    @Step
    public void seleccionarOpcionInformacionDePoliza() {
        polizaPage.seleccionarOpcionInformacionDeLaPoliza();
    }

    @Step
    public void seleccionarBotonSiguienteParaIniciarCambioEnPoliza() {
        polizaPage.seleccionarBotonSiguienteEnInicioDeCambioDePoliza();
    }

    @Step
    public void ingresarMotivosCancelacion(String motivo, String descripcion) {
        polizaPage.ingresarMotivosCancelacion(motivo, descripcion);
    }

    @Step
    public void iniciarCancelacionDePoliza() {
        waitFor(CONSTANTE_3).seconds();
        String xpathBttonCancelacion = "//a[contains(.,'Iniciar cancelación')]";
        getDriver().findElement(By.xpath(xpathBttonCancelacion)).click();
    }

    @Step
    public void seleccionarOpcionCompromiso() {
        waitFor(CONSTANTE_2).seconds();
        String xpathBttonCompromiso = "//a[contains(.,'Opciones de compromiso')]";
        getDriver().findElement(By.xpath(xpathBttonCompromiso)).click();
    }

    @Step
    public void seleccionarOpcionCierre() {
        waitFor(CONSTANTE_2).second();
        String xpathBttonCierre = "//a[contains(.,'Opciones de cierre')]";
        getDriver().findElement(By.xpath(xpathBttonCierre)).click();
    }

    @Step
    public void seleccionarOpcionCancelarAhora() {
        waitFor(1).second();
        String xpathBttonCancelarAhora = "//a[contains(.,'Cancelar ahora')]";
        getDriver().findElement(By.xpath(xpathBttonCancelarAhora)).click();
    }

    @Step
    public void seleccionarOpcionRetirarTransaccion() {
        polizaPage.seleccionarOpcionRetirarTransaccion();
    }

    @Step
    public void seleccionarOpcionProgramarCancelacion() {
        waitFor(1).second();
        String xpathBttonProgramarCancelacion = "//a[contains(.,'Programar cancelación')]";
        getDriver().findElement(By.xpath(xpathBttonProgramarCancelacion)).click();
    }

    @Step
    public void seleccionarOpcionRescindirCancelacion() {
        waitFor(1).second();
        String xpathBttonRescindirCancelacion = "//a[contains(.,'Rescindir la cancelación')]";
        getDriver().findElement(By.xpath(xpathBttonRescindirCancelacion)).click();
    }

    @Step
    public void confirmarCancelacion() {
        polizaPage.confirmarCancelacion();
    }

    @Step
    public void confirmarRenovacion() {
        waitFor(CONSTANTE_2).second();
        String xpathBttonConfirmarRenovacion = "//a[contains(.,'Aceptar')]";
        getDriver().findElement(By.xpath(xpathBttonConfirmarRenovacion)).click();
    }

    public String obtenerTituloPagina() {
        return getDriver().findElement(By.xpath("//span[@id='JobComplete:JobCompleteScreen:ttlBar']")).getText();
    }

    @Step
    public void seMuestraBloqueoCancelacionDePoliza(String mensaje) {
        MatcherAssert.assertThat(obtenerPolizaPage().obtenerTituloBloqueoCancelacionPoliza().getText(), Matchers.containsString(mensaje));
    }

    @Step
    public void seMuestraMensajeDeBeneficiarioOneroso(String mensaje) {
        MatcherAssert.assertThat(obtenerPolizaPage().obtenerMensajeDeCancelacionPolizaConOneroso().getText(), Matchers.containsString(mensaje));
    }

    @Step
    public String validarMensaje() {
        return getDriver().findElement(By.xpath(".//*[@id='StartCancellation:StartCancellationScreen:WarningMessageCancellation']")).getText();
    }

    @Step
    public void seleccionarReaseguroEspecialSi(){
        polizaPage.seleccionarReaseguroEspecialSi();
    }

    @Step
    public void desplegarListaMotivosCancelacion() {
        polizaPage.desplegarMotivosCancelacion();
    }

    public PolizaPage obtenerPolizaPage() {
        return this.polizaPage;
    }

    public InstruccionesPreviasARenovacionPage obtenerInstruccionesPreviasPage() {
        return this.instruccionesPreviasARenovacionPage;
    }

    @Step
    public Boolean esFechaCancelacionNHOY() {
        return obtenerPolizaPage().esFechaCancelacionHOY();
    }

    public void ingresarFechaAnteriorA61Dias() {
        obtenerPolizaPage().ingresarFechaAnteriorA61Dias(obtenerPolizaPage().obtenerFechacancelacionElemento());
    }

    public void ingresarFechaSuperior() {
        obtenerPolizaPage().ingresarFechaSuperior(obtenerPolizaPage().obtenerFechacancelacionElemento());
    }

    @Step
    public void validarOpcionCancelarTransaccion() {
        String xpathBtnCancelarTransaccion = ".//a[contains(.,'Cancelar transacción')]";
        obtenerPolizaPage().validarBotones(xpathBtnCancelarTransaccion);
    }

    @Step
    public void validarOcultacionCampoFuente() {
        String xpathBtnCancelarTransaccion = ".//tr[contains(.,'Fuente')]";
        obtenerPolizaPage().validarBotones(xpathBtnCancelarTransaccion);
    }

    @Step
    public void validarQueNoSeMuestreTipoEnTablaTransacciones(String tipo) {
        obtenerPolizaPage().validarTransaccionPendienteNoExistenteEnResumenPoliza(tipo);
    }

    public void validarQueNoSeMuestreMensaje() {
        String xpathMensajeCancelacionPendiente = ".//*[contains(.,'Esta póliza tiene Cancelación pendiente')]";
        obtenerPolizaPage().validarQueNoSeMuestreMensaje(xpathMensajeCancelacionPendiente);
    }

    @Step
    public void verResumenDeLaPolizaExpedida() {
        obtenerPolizaPage().ingresaraResumenDeLaPolizaExpedida();
    }

    @Step
    public void ingresarAVerCoaseguros() {
        obtenerPolizaPage().ingresarOpcionMostrarCoaseguros();
    }
}
