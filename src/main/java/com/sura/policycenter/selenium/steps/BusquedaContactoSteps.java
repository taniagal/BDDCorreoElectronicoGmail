package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import java.util.Map;

public class BusquedaContactoSteps extends ScenarioSteps {

    private final BusquedaContactoPage busquedaContactoPage = new BusquedaContactoPage(getDriver());
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    public BusquedaContactoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void login(String usuario, String contrasena){
        busquedaContactoPage.login(usuario, contrasena);
    }

    @Step
    public void navegarBarraSuperior() {
        inicioPage().irABuscarContactos();
    }

    @Step
    public void accionarBuscarContacto() {
        inicioPage().irABuscarContacto();
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
    public void consultarContactoNumDoc(String tipoDoc, String numDoc) {
        busquedaContactoPage.consultarContactoNumDoc(tipoDoc, numDoc);
    }

    @Step
    public void consultarContactoTipoDoc(String tipoDoc) {
        busquedaContactoPage.consultarContactoTipoDoc(tipoDoc);
    }

    @Step
    public void consultarPersonaJuridicaTipoNumDoc(String numDoc) {
        busquedaContactoPage.consultarPersonaJuridicaTipoNumDoc(numDoc);
    }

    @Step
    @Pending
    public void verInfoPersonaJuridica(String filtro) {
        busquedaContactoPage.verInfoPersonaJuridica(filtro);
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
}