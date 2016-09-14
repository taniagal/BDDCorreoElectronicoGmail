package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import java.util.Map;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BusquedaContactoSteps extends ScenarioSteps {

    private final BusquedaContactoPage busquedaContactoPage = new BusquedaContactoPage(getDriver());

    public BusquedaContactoSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }


    @Step
    public void navegarBarraSuperior() {
        inicioPage().irABuscarContactos();
    }

    @Step
    public void ir_A_Buscar_Contacto() {
        busquedaContactoPage.irABuscarContacto();
    }

    @Step
    public void ir_A_Busqueda_Contacto() {
        busquedaContactoPage.irABuscarContacto();
    }

    @Step
    public void consultarPersonaJuridaPorRazonSocial(String tipoDoc, String razonSocial){
        busquedaContactoPage.consultarPersonaJuridaPorRazonSocial(tipoDoc, razonSocial);
    }

    @Step
    public void validarInformacionTipoId() {
        busquedaContactoPage.validarInformacionTipoId();
    }

    @Step
    public void validarMensaje(String msjVal) {
        busquedaContactoPage.validarMensaje(msjVal);
    }

    @Step
    public void consultarContactoTipoDoc(String tipoDoc) {
        busquedaContactoPage.consultarContactoTipoDoc(tipoDoc);
    }


    @Step
    public void verInfoPersonaNatural(String filtro1, String filtro2) {
        busquedaContactoPage.verInfoPersonaNatural(filtro1, filtro2);
    }

    @Step
    public void consultarContactoTipoNumDoc(String tipoDoc, String numDoc) {
        busquedaContactoPage.consultarContactoTipoNumDoc(tipoDoc, numDoc);
    }

    @Step
    public void consultarContactoPorNombresYApellidos(String tipoDoc, String primerNombre,
                                                      String segundoNombre, String primerApellido,
                                                      String segundoApellido) {
        busquedaContactoPage.consultarContactoPorNombresYApellidos(tipoDoc, primerNombre, segundoNombre, primerApellido, segundoApellido);
    }

    @Step
    public void consultarContactoNombreComercial(String tipoDoc, String nombreComercial) {
        busquedaContactoPage.consultarContactoNombreComercial(tipoDoc, nombreComercial);
    }

    @SuppressWarnings("SameParameterValue")
    @Step
    public void validarLongitudPersonaNatural(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido){
        busquedaContactoPage.validarLongitudPersonaNatural(primerNombre,"",primerApellido,"");
    }

    @Step
    public void validarLongitudPersonaJuridica(String razonSocial, String nombreComercial) {
        busquedaContactoPage.validarLongitudPersonaJuridica(razonSocial, nombreComercial);
    }

    @Step
    public void validarLabelsPersonaNatural(Map<String, String> labelsContacto){
        busquedaContactoPage.validarLabelsPersonaNatural(labelsContacto);
    }

    @Step
    public void validarLabelsPersonaJuridica(Map<String, String> labelsContacto){
        busquedaContactoPage.validarLabelsPersonaJuridica(labelsContacto);
    }

    @Step
    public void consultarContactoPorTipoDocumentoCotizacion(String tipoId, String numeroId) {
        busquedaContactoPage.consultarContactoPorTipoDocumentoCotizacion(tipoId, numeroId);
    }
}

