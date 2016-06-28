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

    public void vincularDirecciones() {
        direccionesDeContactoVinculadasPage.vincularDirecciones();
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
}
