package com.sura.guidewire.policycenter.steps.contacto;

import com.sura.guidewire.policycenter.pages.contacto.EdicionDeContactoPage;
import com.sura.guidewire.policycenter.pages.contacto.NuevoContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class EdicionDeContactoSteps extends ScenarioSteps{

    EdicionDeContactoPage edicionDeContactoPage;
    NuevoContactoPage nuevoContactoPage;

    private static final String DIRECCION = "direccion";
    private static final String TIPO_DIRECCION = "tipoDireccion";

    @Step
    public void editarDatosDelContactoYGuardar(ExamplesTable datosContacto) {
        Map<String, String> datosEdicion = datosContacto.getRows().get(0);
        edicionDeContactoPage.clicEnElBotonEditarContacto();
        MatcherAssert.assertThat(nuevoContactoPage.validarCamposEditablesDeEdicionDeContacto(), Is.is(Matchers.equalTo(true)));
        nuevoContactoPage.ingresarPrimerNombre(datosEdicion.get("primerNombre"));
        nuevoContactoPage.ingresarSegundoNombreYSegundoApellido(datosEdicion.get("segundoNombre"), datosEdicion.get("segundoApellido"));
        nuevoContactoPage.ingresarPrimerApellido(datosEdicion.get("primerApellido"));
        nuevoContactoPage.seleccionarTipoDireccion(datosEdicion.get(TIPO_DIRECCION));
        nuevoContactoPage.ingresarDireccionDepartamenteYCiudad(datosEdicion.get(DIRECCION), "Antioquia", "Medellin");
        nuevoContactoPage.ingresarTelefonoFijo(datosEdicion.get("tipoTelefono"), datosEdicion.get("numeroTelefono"));
        nuevoContactoPage.actualizarPersonaNatural(datosEdicion.get("primerNombre"));
    }

    @Step
    public void editarDatosDeLaCompaniaYGuardar(ExamplesTable datosContacto) {
        Map<String, String> datosEdicion = datosContacto.getRows().get(0);
        edicionDeContactoPage.clicEnElBotonEditarContacto();
        MatcherAssert.assertThat(nuevoContactoPage.validarCamposEditablesDeEdicionDeContacto(), Is.is(Matchers.equalTo(true)));
        nuevoContactoPage.ingresarRazonSocial(datosEdicion.get("razonSocial"));
        nuevoContactoPage.ingresarNombreComercial(datosEdicion.get("nombreComercial"));
        nuevoContactoPage.ingresarDireccionDepartamenteYCiudad(datosEdicion.get(DIRECCION), "Antioquia", "Medellin");
        nuevoContactoPage.actualizarJuridica(datosEdicion.get("razonSocial"));
    }

    @Step
    public void validarDatosEditadosDelContacto(ExamplesTable datosContacto) {
        Map<String, String> datosEdicionEsperados = datosContacto.getRows().get(0);
        Map<String, String> datosPaginaEdicion = nuevoContactoPage.obtenerDatosDeLaPantalla();
        MatcherAssert.assertThat(datosPaginaEdicion.get("primerNombre"), Is.is(Matchers.equalTo(datosEdicionEsperados.get("primerNombre"))));
        MatcherAssert.assertThat(datosPaginaEdicion.get("segundoNombre"), Is.is(Matchers.equalTo(datosEdicionEsperados.get("segundoNombre"))));
        MatcherAssert.assertThat(datosPaginaEdicion.get("primerApellido"), Is.is(Matchers.equalTo(datosEdicionEsperados.get("primerApellido"))));
        MatcherAssert.assertThat(datosPaginaEdicion.get("segundoApellido"), Is.is(Matchers.equalTo(datosEdicionEsperados.get("segundoApellido"))));
        MatcherAssert.assertThat(datosPaginaEdicion.get(DIRECCION), Is.is(Matchers.equalTo(datosEdicionEsperados.get(DIRECCION))));
        MatcherAssert.assertThat(datosPaginaEdicion.get(TIPO_DIRECCION), Is.is(Matchers.equalTo(datosEdicionEsperados.get(TIPO_DIRECCION))));
        MatcherAssert.assertThat(datosPaginaEdicion.get("tipoTelefono"), Is.is(Matchers.equalTo(datosEdicionEsperados.get("tipoTelefono"))));
        MatcherAssert.assertThat(datosPaginaEdicion.get("telefono"), Is.is(Matchers.equalTo(datosEdicionEsperados.get("numeroTelefono"))));
    }

    @Step
    public void validarDatosDeLaCompaniaEditados(ExamplesTable datosContacto) {
        Map<String, String> datosEdicionEsperados = datosContacto.getRows().get(0);
        Map<String, String> datosPaginaEdicion = nuevoContactoPage.obtenerDatosDeCompania();
        MatcherAssert.assertThat(datosPaginaEdicion.get("razonSocial"), Is.is(Matchers.equalTo(datosEdicionEsperados.get("razonSocial"))));
        MatcherAssert.assertThat(datosPaginaEdicion.get("nombreComercial"), Is.is(Matchers.equalTo(datosEdicionEsperados.get("nombreComercial")  )));
        MatcherAssert.assertThat(datosPaginaEdicion.get(DIRECCION), Is.is(Matchers.equalTo(datosEdicionEsperados.get(DIRECCION))));
        MatcherAssert.assertThat(datosPaginaEdicion.get(TIPO_DIRECCION), Is.is(Matchers.equalTo(datosEdicionEsperados.get(TIPO_DIRECCION))));
    }
}
