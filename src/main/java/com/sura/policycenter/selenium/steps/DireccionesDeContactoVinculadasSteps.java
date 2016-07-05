package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.DireccionesDeContactoVinculadasPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DireccionesDeContactoVinculadasSteps extends ScenarioSteps {

    DireccionesDeContactoVinculadasPage direccionesDeContactoVinculadasPage;

    public DireccionesDeContactoVinculadasSteps(Pages pages) {
        super(pages);
    }

    public void buscarCuenta(String numeroCuenta) {
        direccionesDeContactoVinculadasPage.buscarCuenta(numeroCuenta);
    }

    public void vincularDirecciones(String nombreContacto, String nombreContactoDos) {
        direccionesDeContactoVinculadasPage.vincularDirecciones(nombreContacto, nombreContactoDos);
    }

    public void validarInformacion(ExamplesTable resultadoModificacionDireccion) {
        direccionesDeContactoVinculadasPage.validarInformacion(resultadoModificacionDireccion);
    }

    public void filtrarPorInfoObligatoria() {
        direccionesDeContactoVinculadasPage.filtrarPorInfoObligatoria();
    }

    public void seleccionarContacto() {
        direccionesDeContactoVinculadasPage.seleccionarContacto();
    }

    public void validarInformacionContacto(ExamplesTable resultadoModificacionDireccion) {
        direccionesDeContactoVinculadasPage.validarInformacionContacto(resultadoModificacionDireccion);
    }

    public void validarInfoContactosAsociadosADireccion(ExamplesTable contactosDireccionVinculada) {
        direccionesDeContactoVinculadasPage.validarInfoContactosAsociadosADireccion(contactosDireccionVinculada);
    }

    public void editarDireccion(String direccion) {
        direccionesDeContactoVinculadasPage.editarDireccion(direccion);
    }

    public void validarLongitudDelCampoDireccion(String direccionOk) {
        direccionesDeContactoVinculadasPage.validarLongitudDelCampoDireccion(direccionOk);
    }

    public void editarDireccionEnPestaniaDirecciones(String direccion) {
        direccionesDeContactoVinculadasPage.editarDireccionEnPestaniaDirecciones(direccion);
    }

    public void editarDireccionCampoPais(String pais) {
        direccionesDeContactoVinculadasPage.editarDireccionCampoPais(pais);
    }

    public void validarElCampoDepartamento(String departamento) {
        direccionesDeContactoVinculadasPage.validarElCampoDepartamento(departamento);
    }

    public void validarElCampoCiudad(String ciudad) {
        direccionesDeContactoVinculadasPage.validarElCampoCiudad(ciudad);
    }

    public void editarCampoDepartamento(String departamento) {
        direccionesDeContactoVinculadasPage.editarCampoDepartamento(departamento);
    }

    public void editarCampoCiudad(String ciudad) {
        direccionesDeContactoVinculadasPage.editarCampoCiudad(ciudad);
    }

    public void validarDireccionEstandarizada(String direccionEstandarizada, String nombreContacto) {
        direccionesDeContactoVinculadasPage.validarDireccionEstandarizada(direccionEstandarizada, nombreContacto);
    }

    public void seleccionarContactoAEditar(String nombreContacto) {
        direccionesDeContactoVinculadasPage.seleccionarContactoAEditar(nombreContacto);
    }

    public void seleccionarEditarDireccionVinculada() {
        direccionesDeContactoVinculadasPage.seleccionarEditarDireccionVinculada();
    }

    public void editarDireccionVinculadaDelContacto(String direccion) {
        direccionesDeContactoVinculadasPage.editarDireccionVinculadaDelContacto(direccion);
    }

    public void validarDireccionVinculada(String direccionVinculada, String nombreContacto) {
        direccionesDeContactoVinculadasPage.validarDireccionVinculada(direccionVinculada, nombreContacto);
    }

    public void editarDireccionYDesligar(String direccion) {
        direccionesDeContactoVinculadasPage.editarDireccionYDesligar(direccion);
    }

    public void validarDireccionDesvinculada(ExamplesTable contactosDireccionDesvinculada) {
        direccionesDeContactoVinculadasPage.validarDireccionDesvinculada(contactosDireccionDesvinculada);
    }

    public void validarContactosAsociados(ExamplesTable contactosAsociados) {
        direccionesDeContactoVinculadasPage.validarContactosAsociados(contactosAsociados);
    }

    public void seleccionarCrearContactoSecundarioPersonaNatural() {
        direccionesDeContactoVinculadasPage.seleccionarCrearContactoSecundarioPersonaNatural();
    }

    public void desplegarListaDeContactosParaAsignarLaDireccion() {
        direccionesDeContactoVinculadasPage.desplegarListaDeContactosParaAsignarLaDireccion();
    }

    public void validarAsociacionDeDireccionAContactoSecundario(ExamplesTable direccionAsociada) {
        direccionesDeContactoVinculadasPage.validarAsociacionDeDireccionAContactoSecundario(direccionAsociada);
    }
}
