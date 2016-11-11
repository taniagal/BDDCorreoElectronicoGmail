package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.DisponibilidadDetalleProductoPage;
import com.sura.guidewire.policycenter.pages.InicioPage;
import com.sura.guidewire.policycenter.pages.colectivas.InformacionDePolizaColectivaPage;
import com.sura.guidewire.policycenter.pages.poliza.NuevaPolizaPage;
import com.sura.guidewire.policycenter.util.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class InformacionDePolizaMrcSteps extends ScenarioSteps {

    DisponibilidadDetalleProductoPage disponibilidadDetalleProductoPage;
    NuevaPolizaPage nuevaPolizaPage;
    InformacionDePolizaColectivaPage informacionDePolizaColectivaSteps;

    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage = new OpcionesInformacionPolizaMrcPage(getDriver());

    public InformacionDePolizaMrcSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void navegar_barra_superior(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
    }

    @Step
    public void navegar_por_las_opciones_de_acciones() {
        inicioPage().irACuentaNuevoEnvioCuenta();
    }

    @Step
    public void selecciona_cotizacion_para_producto() {
        opcionesInformacionPolizaMrcPage.ingresaAgente();
    }

    @Step
    public void seleccionar_producto(String nomProducto) {
        opcionesInformacionPolizaMrcPage.seleccionarProducto(nomProducto);
    }

    @Step
    public void valida_datos_del_tomador(String tomador) {
        opcionesInformacionPolizaMrcPage.validaNombreTomador(tomador);
        opcionesInformacionPolizaMrcPage.validaCamposPoliza();
    }

    @Step
    public void ingresar_fecha_de_vigencia(String fechaInicioVigencia) {
        opcionesInformacionPolizaMrcPage.ingresarFechaVigencia(fechaInicioVigencia);
    }

    @Step
    public void valida_mensaje_en_pantalla(String mensaje) {
        opcionesInformacionPolizaMrcPage.validaMensajeEnPantalla(mensaje);

    }

    @Step
    public void ingresar_tomador_adicional(String cedula) {
        opcionesInformacionPolizaMrcPage.ingresarTomadorAdicional(cedula);
    }

    @Step
    public void seleccionar_si_en_reaseguro() {
        opcionesInformacionPolizaMrcPage.seleccionaRiesgoAceptado();
    }

    @Step
    public void valida_opciones_reaseguro() {
        opcionesInformacionPolizaMrcPage.validaReaseguro();
    }

    @Step
    public void eliminar_descripcion_de_direccion_en_contacto() {
        opcionesInformacionPolizaMrcPage.editarDescripDireccionTomador();
    }

    @Step
    public void validar_descipcion_de_direccion() {
        opcionesInformacionPolizaMrcPage.validaFormularioDescripDireccion();
    }

    @Step
    public void ingresar_nueva_cotizacion(String agente, String organizacion, String canal, String tipoPoliza, String producto) {
        disponibilidadDetalleProductoPage.seleccionarAgente(agente);
        opcionesInformacionPolizaMrcPage.seleccionarOrganizacion(organizacion);
        opcionesInformacionPolizaMrcPage.seleccionarCanal(canal);
        nuevaPolizaPage.seleccionarElTipoDePoliza(tipoPoliza);
        opcionesInformacionPolizaMrcPage.seleccionarProducto(producto);
    }

    @Step
    public void agrego_un_coaseguro(String tipoCo, ExamplesTable tablaaseguradoras) {
        opcionesInformacionPolizaMrcPage.agregarUnCoaseguro(tipoCo, tablaaseguradoras);
    }

    @Step
    public void validar_mensajes_coaseguros(ExamplesTable mensajes) {
        opcionesInformacionPolizaMrcPage.validarMensajesCoaseguros(mensajes);
    }

    @Step
    public void validar_campos_inhabilitados() {
        opcionesInformacionPolizaMrcPage.noHabilitarNumeroDocumentoCoaseguro();
    }

    @Step
    public void ingresar_a_edificios_y_ubicaciones() {
        opcionesInformacionPolizaMrcPage.seleccionBotonSiguiente();
    }
}

