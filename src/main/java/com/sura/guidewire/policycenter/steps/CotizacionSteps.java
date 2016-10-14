package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.util.navegacion.PanelIzquierdoElement;
import com.sura.guidewire.policycenter.util.navegacion.PanelSuperiorElement;
import com.sura.guidewire.policycenter.pages.policy.estados.poliza.cotizacion.NuevaCotizacionPage;
import java.io.Serializable;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;

import static com.sura.guidewire.policycenter.pages.policy.estados.poliza.cotizacion.NuevaCotizacionPage.TXT_CODIGO_AGENTE;
import static com.sura.guidewire.policycenter.pages.policy.estados.poliza.cotizacion.NuevaCotizacionPage.TXT_NOMBRE_AGENTE;
import static com.sura.guidewire.policycenter.pages.policy.estados.poliza.cotizacion.NuevaCotizacionPage.TXT_NUMERO_CUENTA;

public class CotizacionSteps extends ScenarioSteps implements Serializable {

    private static final long serialVersionUID = 1L;

    private PanelSuperiorElement panelSuperior;
    private PanelIzquierdoElement panelIzquierdo;
    private NuevaCotizacionPage cotizacionPage;


    @ManagedPages
    Pages pages;


    @Step
    public void ir_al_menu_escritorio_del_panel_superior(){
        panelSuperior.waitForTextToAppear("Escritorio");
        panelSuperior.irMenu(PanelSuperiorElement.MENU_ESCRITORIO);
    }

    @Step
    public void clic_en_la_opcion_acciones_del_panel_izquierdo(){
        panelIzquierdo.waitForTextToAppear("Acciones");
        panelIzquierdo.opcion(PanelIzquierdoElement.LINK_ACCIONES);
    }

    @Step
    public void clic_en_la_opcion_nueva_cotizacion(){
        panelIzquierdo.waitForTextToAppear("Nueva cotización");
        panelIzquierdo.opcion(PanelIzquierdoElement.LINK_NUEVA_COTIZACION);
    }

    @Step
    public void digitar_numero_de_cuenta(String numeroCuenta) {
        getCotizacionPage().enter(numeroCuenta).into(cotizacionPage.elemento(TXT_NUMERO_CUENTA));
    }

    @Step
    public void digitar_la_tecla() {
        // TODO: 08/06/2016 \VALIDAR QUE LO QUE SE ENVIA EN LA HISTORIA SEA UNA TECLA 
        getCotizacionPage().getDriver().switchTo().activeElement().sendKeys(Keys.TAB);
    }

    @Step
    public void digitar_nombre_agente(String nombreAgente) {
        getCotizacionPage().enter(nombreAgente).into(cotizacionPage.elemento(TXT_NOMBRE_AGENTE));

    }

    @Step
    public void digitar_codigo_de_agente(String codigoAgente) {
        getCotizacionPage().enter(codigoAgente).into(cotizacionPage.elemento(TXT_CODIGO_AGENTE));
    }

    public NuevaCotizacionPage getCotizacionPage() {
        return cotizacionPage;
    }

    @Step
    public void seleccionar_el_boton_elegir(String producto) {
        getCotizacionPage().seleccionarProducto(producto);
    }

    @Step
    public String obtenerTextoLinkNombrePersonaWEF(String nombre) {
        return getCotizacionPage().obtenerTextoLinkNombrePersonaWEF(nombre);
    }

    @Step
    public String obtenerTextoLabelNombrePersonaWEF() {
        return  getCotizacionPage().obtenerTextoLabelNombrePersonaWEF();
    }

    @Step
    public Integer tamanioListaAgentesPorFiltro(String nombreAgente) {
        return getCotizacionPage().tamanioListaAgentesPorFiltro(nombreAgente);
    }

    @Step
    public String getNombreAgente() {
        return getCotizacionPage().getNombreAgente();
    }

    @Step
    public void validarAutocompletarNombreAgente() {
        getCotizacionPage().validarAutocompletarNombreAgente();
    }

    @Step
    public void validarAutocompletarSeMuestreNombreYCodigoRespectivamente() {
        getCotizacionPage().validarAutocompletarSeMuestreNombreYCodigoRespectivamente();
    }

    @Step
    public void validarLosProductosOrdenadosAlfabeticamente() {
        getCotizacionPage().validarLosProductosOrdenadosAlfabeticamente();
    }

    @Step
    public String obtenerMensajeEmergenteDeInformacion() {
        return getCotizacionPage().obtenerMensajeEmergenteDeInformacion();
    }

    @Step
    public Boolean validarOcurrenciaDeMensajeDeAplicacion(String mensaje) {
        return getCotizacionPage().validarOcurrenciaDeMensajeDeAplicacion(mensaje);
    }

    @Step
    public Boolean validarExistenciaDeLosBotonesVisibles(String[] arrayBtns) {
        return getCotizacionPage().validarExistenciaDeLosBotonesVisibles(arrayBtns);
    }

    @Step
    public void seleccionarBtn(String boton) {
        getCotizacionPage().seleccionarBtn(boton);
    }

    @Step
    public String obtenerTextoTituloPaginaWEF(String pagina) {
        return getCotizacionPage().obtenerTextoTituloPaginaWEF(pagina);
    }

    @Step
    public Boolean esFechaCotizacionHOY() {
        return getCotizacionPage().esFechaCotizacionHOY();
    }

    public Boolean esFechaEditable() {
        return getCotizacionPage().esFechaEditable();
    }
}
