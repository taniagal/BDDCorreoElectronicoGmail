package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.DireccionesDeContactoVinculadasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DireccionesDeContactoVinculadasSteps extends ScenarioSteps {

    DireccionesDeContactoVinculadasPage direccionesDeContactoVinculadasPage;

    @Step
    public void irALosContactosDeLaCuenta() {
        direccionesDeContactoVinculadasPage.irALosContactosDeLaCuenta();
    }

    @Step
    public void vincularDirecciones(String nombreContacto, String nombreContactoDos) {
        direccionesDeContactoVinculadasPage.vincularDirecciones(nombreContacto, nombreContactoDos);
    }

    @Step
    public void validarInformacion(ExamplesTable resultadoModificacionDireccion) {
        direccionesDeContactoVinculadasPage.validarInformacion(resultadoModificacionDireccion);
    }

    @Step
    public void filtrarPorInfoObligatoria() {
        direccionesDeContactoVinculadasPage.filtrarPorInfoObligatoria();
    }

    @Step
    public void seleccionarContacto() {
        direccionesDeContactoVinculadasPage.seleccionarContacto();
    }

    @Step
    public void validarInformacionContacto(ExamplesTable resultadoModificacionDireccion) {
        direccionesDeContactoVinculadasPage.validarInformacionContacto(resultadoModificacionDireccion);
    }

    @Step
    public void validarInfoContactosAsociadosADireccion(ExamplesTable contactosDireccionVinculada) {
        direccionesDeContactoVinculadasPage.validarInfoContactosAsociadosADireccion(contactosDireccionVinculada);
    }

    @Step
    public void editarDireccion(String direccion) {
        direccionesDeContactoVinculadasPage.editarDireccion(direccion);
    }

    @Step
    public void validarLongitudDelCampoDireccion(String direccionOk) {
        direccionesDeContactoVinculadasPage.validarLongitudDelCampoDireccion(direccionOk);
    }

    @Step
    public void editarDireccionEnPestaniaDirecciones(String direccion) {
        direccionesDeContactoVinculadasPage.editarDireccionEnPestaniaDirecciones(direccion);
    }

    @Step
    public void editarDireccionCampoPais(String pais) {
        direccionesDeContactoVinculadasPage.editarDireccionCampoPais(pais);
    }

    @Step
    public void validarElCampoDepartamento(String departamento) {
        direccionesDeContactoVinculadasPage.validarElCampoDepartamento(departamento);
    }

    @Step
    public void validarElCampoCiudad(String ciudad) {
        direccionesDeContactoVinculadasPage.validarElCampoCiudad(ciudad);
    }

    @Step
    public void validarDireccionEstandarizada(String direccionEstandarizada, String nombreContacto) {
        direccionesDeContactoVinculadasPage.validarDireccionEstandarizada(direccionEstandarizada, nombreContacto);
    }

    @Step
    public void seleccionarContactoAEditar(String nombreContacto) {
        direccionesDeContactoVinculadasPage.seleccionarContactoAEditar(nombreContacto);
    }

    @Step
    public void seleccionarEditarDireccionVinculada() {
        direccionesDeContactoVinculadasPage.seleccionarEditarDireccionVinculada();
    }

    @Step
    public void editarDireccionVinculadaDelContacto(String direccion) {
        direccionesDeContactoVinculadasPage.editarDireccionVinculadaDelContacto(direccion);
    }

    @Step
    public void validarDireccionVinculada(String direccionVinculada, String nombreContacto) {
        direccionesDeContactoVinculadasPage.validarDireccionVinculada(direccionVinculada, nombreContacto);
    }

    @Step
    public void editarDireccionYDesligar(String direccion) {
        direccionesDeContactoVinculadasPage.editarDireccionYDesligar(direccion);
    }

    @Step
    public void validarDireccionDesvinculada(ExamplesTable contactosDireccionDesvinculada) {
        direccionesDeContactoVinculadasPage.validarDireccionDesvinculada(contactosDireccionDesvinculada);
    }

    @Step
    public void validarContactosAsociados(ExamplesTable contactosAsociados) {
        direccionesDeContactoVinculadasPage.validarContactosAsociados(contactosAsociados);
    }

    @Step
    public void seleccionarCrearContactoSecundarioPersonaNatural() {
        direccionesDeContactoVinculadasPage.seleccionarCrearContactoSecundarioPersonaNatural();
    }

    @Step
    public void desplegarListaDeContactosParaAsignarLaDireccion() {
        direccionesDeContactoVinculadasPage.desplegarListaDeContactosParaAsignarLaDireccion();
    }

    @Step
    public void validarAsociacionDeDireccionAContactoSecundario(ExamplesTable direccionAsociada) {
        direccionesDeContactoVinculadasPage.validarAsociacionDeDireccionAContactoSecundario(direccionAsociada);
    }

    @Step
    public void validarEtiquetasDeLaVentana(String titulo, String botonLigagas, String botonDesligar) {
        direccionesDeContactoVinculadasPage.validarEtiquetasDeLaVentana(titulo, botonLigagas, botonDesligar);
    }

    @Step
    public void editarDireccionSinEstandarizar(String direccionSinEstandarizar) {
        direccionesDeContactoVinculadasPage.editarDireccionSinEstandarizar(direccionSinEstandarizar);
    }
}